package com.mindworx.dao;

import java.util.Date;
import java.util.List;

import com.mindworx.model.IntfstgInbso;
import com.mindworx.model.SoHead;

public interface IntfstgInbsoDao {
	public List<IntfstgInbso> getAll();
	public IntfstgInbso getById(long id);	
	public void create(IntfstgInbso intfstgInbso);
	public void create(SoHead soHead);
	public void update(IntfstgInbso intfstgInbso);
	public SoHead getSoHead(String so_no);
	public List<SoHead> getSoNoList(Date fromDate, Date toDate);
}
