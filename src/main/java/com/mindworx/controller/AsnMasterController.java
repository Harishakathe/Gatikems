package com.mindworx.controller;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mindworx.model.AsnMaster;
import com.mindworx.model.ConsigneeMaster;
import com.mindworx.model.CustomOption;
import com.mindworx.model.IntfstgInbpo;
import com.mindworx.model.PoHead;
import com.mindworx.model.SoHead;
import com.mindworx.model.SupplierMaster;
import com.mindworx.service.AsnMasterService;
import com.mindworx.service.IntfstgInbpoService;
import com.mindworx.service.IntfstgInbsoService;

@Controller
public class AsnMasterController {
	
	protected Log log = LogFactory.getLog(this.getClass());
	SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	
	@Autowired
	private IntfstgInbpoService intfstgInbpoService;
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {	    
	    dateFormat.setLenient(false);
	    binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
	}	
	
	@RequestMapping(value = "/asn-master", method = RequestMethod.GET)	  
	public ModelAndView soForm() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("asn-form");
		List<CustomOption> sku_list = intfstgInbpoService.getSkuByCompId("GKW0000006");
		modelAndView.addObject("sku_list", sku_list);
		return modelAndView;
	}
	
	@RequestMapping(value = "/asn-master", method = RequestMethod.POST)	  
	public String soFormProcess(@ModelAttribute("poHead")@Valid PoHead poHead, BindingResult result,Model model,Errors errors) {
		log.info("Submit intfstgInbpo"+poHead.toString());
		if(result.hasErrors()){
			log.info("Error in Form"+result.toString());
			return "asn-form";
		}else{			
			//intfstgInbpoService.create(poHead);
			//model.addAttribute("success","true");
			model.addAttribute("poHead",poHead);
			return "asn-form-confirm";
		}
		
	}
	
	@RequestMapping(value = "/asn-masterdo", method = RequestMethod.POST)	  
	public String soFormProcessDo(@ModelAttribute("poHead")@Valid PoHead poHead, BindingResult result,RedirectAttributes redirectAttributes) {
		log.info("Submit intfstgInbpo"+poHead.toString());
		if(result.hasErrors()){
			redirectAttributes.addFlashAttribute("success", "false");
		}else{			
			intfstgInbpoService.create(poHead);
			redirectAttributes.addFlashAttribute("success", "true");
			redirectAttributes.addFlashAttribute("massage", "ASN/Invoice No:<b>"+poHead.getPoNo()+"</b> is Generated Successfully.");
		}
		return "redirect:asn-master";
	}
	
	@RequestMapping(value = "/getPoDetails", method = RequestMethod.POST)
	public ResponseEntity<String> getPoDetails(@RequestParam String po_no)
	{
		return new ResponseEntity<String>(intfstgInbpoService.getPoHead(po_no).toString(),HttpStatus.OK);
	}
	
	@RequestMapping(value = "/getSupplierList", method = RequestMethod.GET)
	public ResponseEntity<List<SupplierMaster>> getSupplierList(@RequestParam("query") String like) {
		
		List<SupplierMaster> list = intfstgInbpoService.getSupplierList(like);
		
		if(list!=null){
			return new ResponseEntity<List<SupplierMaster>>(list, HttpStatus.OK);
		}
    	return new ResponseEntity<List<SupplierMaster>>(HttpStatus.BAD_REQUEST);
    }
	
	@RequestMapping(value = "/getPoNoList", method = RequestMethod.POST)
	public ResponseEntity<List<PoHead>> getPoNoList( @RequestParam String fromDate, @RequestParam String toDate) {		
		List<PoHead> list;
		try {
			list = intfstgInbpoService.getPoNoList(dateFormat.parse(fromDate),dateFormat.parse(toDate));
			if(list!=null){
				return new ResponseEntity<List<PoHead>>(list, HttpStatus.OK);
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
    	return new ResponseEntity<List<PoHead>>(HttpStatus.BAD_REQUEST);
    }
	
	
	
}