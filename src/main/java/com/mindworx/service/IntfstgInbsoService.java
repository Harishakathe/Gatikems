package com.mindworx.service;

import java.util.Date;
import java.util.List;

import com.mindworx.model.ConsigneeMaster;
import com.mindworx.model.CustomOption;
import com.mindworx.model.IntfstgInbso;
import com.mindworx.model.SoHead;

public interface IntfstgInbsoService {
	public List<IntfstgInbso> getAll();
	public IntfstgInbso getById(long id);	
	public void create(IntfstgInbso intfstgInbso);
	public void update(IntfstgInbso intfstgInbso);
	public void create(SoHead soHead);
	public SoHead getSoHead(String so_no);
	public List<ConsigneeMaster> getConsigneeList(String query);
	public List<SoHead> getSoNoList(Date fromDate, Date toDate);
	public List<CustomOption> getSkuByCompId(String CompId);
	public List<CustomOption> getUomByCompId(String string);
}
