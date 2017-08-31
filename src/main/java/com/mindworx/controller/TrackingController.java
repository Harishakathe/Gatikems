package com.mindworx.controller;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mindworx.model.AsnTrackingRequest;
import com.mindworx.model.DataTablesColumn;
import com.mindworx.model.DataTablesResponse;
import com.mindworx.model.DataTablesOrder;
import com.mindworx.model.PoHead;
import com.mindworx.model.Search;
import com.mindworx.service.IntfstgInbpoService;

@Controller
public class TrackingController<T> {
	protected Log log = LogFactory.getLog(this.getClass());

	@Autowired
	private IntfstgInbpoService intfstgInbpoService;

	@RequestMapping(value = { "/tracking" }, method = RequestMethod.GET)
	public String getTracking() {
		return "tracking";
	}

	@RequestMapping(value = "/asntracking", method = RequestMethod.POST)
	@ResponseBody
	public DataTablesResponse<PoHead> getPoHeadList(
			@RequestBody(required = false) AsnTrackingRequest<T> asnTrackingRequest) {

		log.info(asnTrackingRequest.toString());
		List<PoHead> list = null;

		long totalFilteredRecords = 0;
		long totalRecords = 0;
		
		int offset = asnTrackingRequest.getStart();
		int limit = asnTrackingRequest.getLength();
		
		Search search = asnTrackingRequest.getSearch();
		String searchStr = search.getValue();

		int orderByColIndex = ((DataTablesOrder) asnTrackingRequest.getOrders().get(0)).getColumn();
		String orderByCol = ((DataTablesColumn) asnTrackingRequest.getColumns().get(orderByColIndex)).getData();
		String sortOrder = ((DataTablesOrder) asnTrackingRequest.getOrders().get(0)).getDir();
		
		log.info("offset:"+offset+" limit:"+limit+" orderByCol:"+orderByCol+" sortOrder:"+sortOrder);
		
		try {
			totalRecords = intfstgInbpoService.getCount(asnTrackingRequest);
			switch (asnTrackingRequest.getFilterBy()) {
			case "dates":
				totalFilteredRecords = intfstgInbpoService.getCountByDate(asnTrackingRequest);
				list = intfstgInbpoService.getAllByDate(offset, limit, orderByCol,sortOrder, asnTrackingRequest);
				break;
			case "poNo":
				totalFilteredRecords = intfstgInbpoService.getCountByPoNo(asnTrackingRequest);
				list = intfstgInbpoService.getAllByPoNo(offset, limit, orderByCol,sortOrder, asnTrackingRequest);
				break;
			case "invNo":
				totalFilteredRecords = intfstgInbpoService.getCountByInvNo(asnTrackingRequest);
				list = intfstgInbpoService.getAllByInvNo(offset, limit, orderByCol,sortOrder, asnTrackingRequest);
				break;
			case "sku":
				totalFilteredRecords = intfstgInbpoService.getCountBySku(asnTrackingRequest);
				list = intfstgInbpoService.getAllBySku(offset, limit, orderByCol,sortOrder, asnTrackingRequest);
				break;
			default:
				break;
			}
			log.info("totalRecords:"+totalRecords);
			log.info("totalFilteredRecords:"+totalFilteredRecords);
		} catch (Exception e) {
			return new DataTablesResponse<PoHead>(asnTrackingRequest.getDraw(), totalRecords, totalFilteredRecords,
					"Error fetching Tracking Records.", list);
		}
		log.info("totalRecords:"+totalRecords);
		log.info("totalFilteredRecords:"+totalFilteredRecords);
		return new DataTablesResponse<PoHead>(asnTrackingRequest.getDraw(), totalRecords, totalFilteredRecords, "",
				list);
	}

	@RequestMapping(value = "/globalinventory", method = RequestMethod.GET)
	public String getGlobalInventory() {
		return "global-inventory";
	}

}
