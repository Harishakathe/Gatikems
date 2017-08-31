package com.mindworx.model;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class IntfstgInbpo {
	
	@NotNull
	private Date poDate;
	private int suppOrdNo;
	@NotNull
	@Size(max=30)
	private String poNo; // fetch all the records 
	private String rcvType;
	
	private Date schArrivalDate;
	
	private String carrierId;
	
	private String porhInstr1;
	private String porhInstr2;
	private String suppName;
	@NotNull
	@Size(max=50)
	private String sku;
	@NotNull
	@Size(max=10)
	private String skuStatus;
	private int ordlineNo;
	private int ordQty;
	private int rcvQty;
	private int packcode;
	private String batchNo;
	private int unitCost;
	private String uomId;
	@Size(max=100)
	private String porlInstr1;
	@Size(max=100)
	private String porlInstr2;
	@Size(max=30)
	private String userField1;
	@Size(max=30)
	private String userField2;
	private Date expArrdate;
	@Size(max=4)
	private String rcvMode;
	private String reasonCode;
	private Date receiptStartDate;
	@Size(max=10)
	private String receiptType;
	@Size(max=100)
	private String addr1;
	@Size(max=50)
	private String addr2;
	@Size(max=50)
	private String addr3;
	
	private Date archdate;
	@Size(max=50)
	private String archrowid;
	private int archEbizUserNo;
	@Size(max=50)
	private String attachFileName;
	private Date billDate;
	@Size(max=1)
	private String billFlag;
	@Size(max=50)
	private String city;
	@Size(max=10)
	private String classId;
	@Size(max=1)
	private String closedFlag;
	@Size(max=10)
	private String compId;
	@Size(max=50)
	private String country;
	@Size(max=1)
	private String crossdockFlag;
	private int crossdockQty;
	
	private Date currdate;
	private int currtime;
	private String dataType;
	private int ebizAppownNo;
	private int ebizCarrierNo;
	private int ebizConsigneeNo;
	private int ebizOrdNo;
	private int ebizProcessDate;
	private int ebizSkuNo;
	private int ebizStatusFlag;
	private int ebizSuppNo;
	private int ebizTranNo;
	private int ebizUserNo;
	@Size(max=50)
	private String email;
	@Size(max=100)
	private String errorDesc;
	@Size(max=1)
	private String errorFlag;
	private int expeQty;
	@Size(max=10)
	private String fax;
	
	private Date fifodate;
	@Size(max=100)
	private String fileName;
	private Date hostConfDate1;
	private Date hostConfDate2;
	@Size(max=50)
	private String hostId;
	private int hostLineNo;
	@Size(max=30)
	private String hostOrdNo;
	private int hostTranNo1;
	@Size(max=30)
	private String hostTranNo1Ord;
	@Size(max=50)
	private String hostTranNo1Sku;
	@Size(max=50)
	private String hostTranNo1Supplier;
	private int hostTranNo2;
	@Size(max=1)
	private String intfConfStatusFlag;
	
	private String intfTransDate;
	@Size(max=10)
	private String intfTransNo;
	@Size(max=20)
	private String intfType;
	@Size(max=10)
	private String lineNo;
	@Size(max=50)
	private String locationId;
	@Size(max=50)
	private String mailSend;
	@Size(max=20)
	private String mobileNo;
	@Size(max=255)
	private String note1;
	@Size(max=255)
	private String note2;
	private int noLines;
	private int orderAmount;
	@Size(max=10)
	private String paidAmount;
	@Size(max=10)
	private String payableAmount;
	@Size(max=5)
	private String paymentType;
	@Size(max=20)
	private String phone1;
	@Size(max=20)
	private String phone2;
	@Size(max=30)
	private String serialNo;
	@Size(max=12)
	private String siteId;
	@Size(max=10)
	private String state;
	@Size(max=10)
	private String statusFlag;
	
	private Date updDate;
	private int updEbizUserNo;
	@Size(max=50)
	private String userField10;
	@Size(max=50)
	private String userField3;
	@Size(max=50)
	private String userField4;
	@Size(max=50)
	private String userField5;
	@Size(max=50)
	private String userField6;
	@Size(max=50)
	private String userField7;
	@Size(max=50)
	private String userField8;
	@Size(max=50)
	private String userField9;
	@Size(max=20)
	private String zipcode;
	private Date exprdate;
	@Size(max=20)
	private String rowId;
	@Size(max=10)
	private String ebizFileNo;
	public Date getPoDate() {
		return poDate;
	}
	public void setPoDate(Date poDate) {
		this.poDate = poDate;
	}
	public int getSuppOrdNo() {
		return suppOrdNo;
	}
	public void setSuppOrdNo(int suppOrdNo) {
		this.suppOrdNo = suppOrdNo;
	}
	public String getPoNo() {
		return poNo;
	}
	public void setPoNo(String poNo) {
		this.poNo = poNo;
	}
	public String getRcvType() {
		return rcvType;
	}
	public void setRcvType(String rcvType) {
		this.rcvType = rcvType;
	}
	public Date getSchArrivalDate() {
		return schArrivalDate;
	}
	public void setSchArrivalDate(Date schArrivalDate) {
		this.schArrivalDate = schArrivalDate;
	}
	public String getCarrierId() {
		return carrierId;
	}
	public void setCarrierId(String carrierId) {
		this.carrierId = carrierId;
	}
	public String getPorhInstr1() {
		return porhInstr1;
	}
	public void setPorhInstr1(String porhInstr1) {
		this.porhInstr1 = porhInstr1;
	}
	public String getPorhInstr2() {
		return porhInstr2;
	}
	public void setPorhInstr2(String porhInstr2) {
		this.porhInstr2 = porhInstr2;
	}
	public String getSuppName() {
		return suppName;
	}
	public void setSuppName(String suppName) {
		this.suppName = suppName;
	}
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public String getSkuStatus() {
		return skuStatus;
	}
	public void setSkuStatus(String skuStatus) {
		this.skuStatus = skuStatus;
	}
	public int getOrdlineNo() {
		return ordlineNo;
	}
	public void setOrdlineNo(int ordlineNo) {
		this.ordlineNo = ordlineNo;
	}
	public int getOrdQty() {
		return ordQty;
	}
	public void setOrdQty(int ordQty) {
		this.ordQty = ordQty;
	}
	public int getRcvQty() {
		return rcvQty;
	}
	public void setRcvQty(int rcvQty) {
		this.rcvQty = rcvQty;
	}
	public int getPackcode() {
		return packcode;
	}
	public void setPackcode(int packcode) {
		this.packcode = packcode;
	}
	public String getBatchNo() {
		return batchNo;
	}
	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}
	public int getUnitCost() {
		return unitCost;
	}
	public void setUnitCost(int unitCost) {
		this.unitCost = unitCost;
	}
	public String getUomId() {
		return uomId;
	}
	public void setUomId(String uomId) {
		this.uomId = uomId;
	}
	public String getPorlInstr1() {
		return porlInstr1;
	}
	public void setPorlInstr1(String porlInstr1) {
		this.porlInstr1 = porlInstr1;
	}
	public String getPorlInstr2() {
		return porlInstr2;
	}
	public void setPorlInstr2(String porlInstr2) {
		this.porlInstr2 = porlInstr2;
	}
	public String getUserField1() {
		return userField1;
	}
	public void setUserField1(String userField1) {
		this.userField1 = userField1;
	}
	public String getUserField2() {
		return userField2;
	}
	public void setUserField2(String userField2) {
		this.userField2 = userField2;
	}
	public Date getExpArrdate() {
		return expArrdate;
	}
	public void setExpArrdate(Date expArrdate) {
		this.expArrdate = expArrdate;
	}
	public String getRcvMode() {
		return rcvMode;
	}
	public void setRcvMode(String rcvMode) {
		this.rcvMode = rcvMode;
	}
	public String getReasonCode() {
		return reasonCode;
	}
	public void setReasonCode(String reasonCode) {
		this.reasonCode = reasonCode;
	}
	public Date getReceiptStartDate() {
		return receiptStartDate;
	}
	public void setReceiptStartDate(Date receiptStartDate) {
		this.receiptStartDate = receiptStartDate;
	}
	public String getReceiptType() {
		return receiptType;
	}
	public void setReceiptType(String receiptType) {
		this.receiptType = receiptType;
	}
	public String getAddr1() {
		return addr1;
	}
	public void setAddr1(String addr1) {
		this.addr1 = addr1;
	}
	public String getAddr2() {
		return addr2;
	}
	public void setAddr2(String addr2) {
		this.addr2 = addr2;
	}
	public String getAddr3() {
		return addr3;
	}
	public void setAddr3(String addr3) {
		this.addr3 = addr3;
	}
	public Date getArchdate() {
		return archdate;
	}
	public void setArchdate(Date archdate) {
		this.archdate = archdate;
	}
	public String getArchrowid() {
		return archrowid;
	}
	public void setArchrowid(String archrowid) {
		this.archrowid = archrowid;
	}
	public int getArchEbizUserNo() {
		return archEbizUserNo;
	}
	public void setArchEbizUserNo(int archEbizUserNo) {
		this.archEbizUserNo = archEbizUserNo;
	}
	public String getAttachFileName() {
		return attachFileName;
	}
	public void setAttachFileName(String attachFileName) {
		this.attachFileName = attachFileName;
	}
	public Date getBillDate() {
		return billDate;
	}
	public void setBillDate(Date billDate) {
		this.billDate = billDate;
	}
	public String getBillFlag() {
		return billFlag;
	}
	public void setBillFlag(String billFlag) {
		this.billFlag = billFlag;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getClassId() {
		return classId;
	}
	public void setClassId(String classId) {
		this.classId = classId;
	}
	public String getClosedFlag() {
		return closedFlag;
	}
	public void setClosedFlag(String closedFlag) {
		this.closedFlag = closedFlag;
	}
	public String getCompId() {
		return compId;
	}
	public void setCompId(String compId) {
		this.compId = compId;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCrossdockFlag() {
		return crossdockFlag;
	}
	public void setCrossdockFlag(String crossdockFlag) {
		this.crossdockFlag = crossdockFlag;
	}
	public int getCrossdockQty() {
		return crossdockQty;
	}
	public void setCrossdockQty(int crossdockQty) {
		this.crossdockQty = crossdockQty;
	}
	public Date getCurrdate() {
		return currdate;
	}
	public void setCurrdate(Date currdate) {
		this.currdate = currdate;
	}
	public int getCurrtime() {
		return currtime;
	}
	public void setCurrtime(int currtime) {
		this.currtime = currtime;
	}
	public String getDataType() {
		return dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}
	public int getEbizAppownNo() {
		return ebizAppownNo;
	}
	public void setEbizAppownNo(int ebizAppownNo) {
		this.ebizAppownNo = ebizAppownNo;
	}
	public int getEbizCarrierNo() {
		return ebizCarrierNo;
	}
	public void setEbizCarrierNo(int ebizCarrierNo) {
		this.ebizCarrierNo = ebizCarrierNo;
	}
	public int getEbizConsigneeNo() {
		return ebizConsigneeNo;
	}
	public void setEbizConsigneeNo(int ebizConsigneeNo) {
		this.ebizConsigneeNo = ebizConsigneeNo;
	}
	public int getEbizOrdNo() {
		return ebizOrdNo;
	}
	public void setEbizOrdNo(int ebizOrdNo) {
		this.ebizOrdNo = ebizOrdNo;
	}
	public int getEbizProcessDate() {
		return ebizProcessDate;
	}
	public void setEbizProcessDate(int ebizProcessDate) {
		this.ebizProcessDate = ebizProcessDate;
	}
	public int getEbizSkuNo() {
		return ebizSkuNo;
	}
	public void setEbizSkuNo(int ebizSkuNo) {
		this.ebizSkuNo = ebizSkuNo;
	}
	public int getEbizStatusFlag() {
		return ebizStatusFlag;
	}
	public void setEbizStatusFlag(int ebizStatusFlag) {
		this.ebizStatusFlag = ebizStatusFlag;
	}
	public int getEbizSuppNo() {
		return ebizSuppNo;
	}
	public void setEbizSuppNo(int ebizSuppNo) {
		this.ebizSuppNo = ebizSuppNo;
	}
	public int getEbizTranNo() {
		return ebizTranNo;
	}
	public void setEbizTranNo(int ebizTranNo) {
		this.ebizTranNo = ebizTranNo;
	}
	public int getEbizUserNo() {
		return ebizUserNo;
	}
	public void setEbizUserNo(int ebizUserNo) {
		this.ebizUserNo = ebizUserNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getErrorDesc() {
		return errorDesc;
	}
	public void setErrorDesc(String errorDesc) {
		this.errorDesc = errorDesc;
	}
	public String getErrorFlag() {
		return errorFlag;
	}
	public void setErrorFlag(String errorFlag) {
		this.errorFlag = errorFlag;
	}
	public int getExpeQty() {
		return expeQty;
	}
	public void setExpeQty(int expeQty) {
		this.expeQty = expeQty;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public Date getFifodate() {
		return fifodate;
	}
	public void setFifodate(Date fifodate) {
		this.fifodate = fifodate;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public Date getHostConfDate1() {
		return hostConfDate1;
	}
	public void setHostConfDate1(Date hostConfDate1) {
		this.hostConfDate1 = hostConfDate1;
	}
	public Date getHostConfDate2() {
		return hostConfDate2;
	}
	public void setHostConfDate2(Date hostConfDate2) {
		this.hostConfDate2 = hostConfDate2;
	}
	public String getHostId() {
		return hostId;
	}
	public void setHostId(String hostId) {
		this.hostId = hostId;
	}
	public int getHostLineNo() {
		return hostLineNo;
	}
	public void setHostLineNo(int hostLineNo) {
		this.hostLineNo = hostLineNo;
	}
	public String getHostOrdNo() {
		return hostOrdNo;
	}
	public void setHostOrdNo(String hostOrdNo) {
		this.hostOrdNo = hostOrdNo;
	}
	public int getHostTranNo1() {
		return hostTranNo1;
	}
	public void setHostTranNo1(int hostTranNo1) {
		this.hostTranNo1 = hostTranNo1;
	}
	public String getHostTranNo1Ord() {
		return hostTranNo1Ord;
	}
	public void setHostTranNo1Ord(String hostTranNo1Ord) {
		this.hostTranNo1Ord = hostTranNo1Ord;
	}
	public String getHostTranNo1Sku() {
		return hostTranNo1Sku;
	}
	public void setHostTranNo1Sku(String hostTranNo1Sku) {
		this.hostTranNo1Sku = hostTranNo1Sku;
	}
	public String getHostTranNo1Supplier() {
		return hostTranNo1Supplier;
	}
	public void setHostTranNo1Supplier(String hostTranNo1Supplier) {
		this.hostTranNo1Supplier = hostTranNo1Supplier;
	}
	public int getHostTranNo2() {
		return hostTranNo2;
	}
	public void setHostTranNo2(int hostTranNo2) {
		this.hostTranNo2 = hostTranNo2;
	}
	public String getIntfConfStatusFlag() {
		return intfConfStatusFlag;
	}
	public void setIntfConfStatusFlag(String intfConfStatusFlag) {
		this.intfConfStatusFlag = intfConfStatusFlag;
	}
	public String getIntfTransDate() {
		return intfTransDate;
	}
	public void setIntfTransDate(String intfTransDate) {
		this.intfTransDate = intfTransDate;
	}
	public String getIntfTransNo() {
		return intfTransNo;
	}
	public void setIntfTransNo(String intfTransNo) {
		this.intfTransNo = intfTransNo;
	}
	public String getIntfType() {
		return intfType;
	}
	public void setIntfType(String intfType) {
		this.intfType = intfType;
	}
	public String getLineNo() {
		return lineNo;
	}
	public void setLineNo(String lineNo) {
		this.lineNo = lineNo;
	}
	public String getLocationId() {
		return locationId;
	}
	public void setLocationId(String locationId) {
		this.locationId = locationId;
	}
	public String getMailSend() {
		return mailSend;
	}
	public void setMailSend(String mailSend) {
		this.mailSend = mailSend;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getNote1() {
		return note1;
	}
	public void setNote1(String note1) {
		this.note1 = note1;
	}
	public String getNote2() {
		return note2;
	}
	public void setNote2(String note2) {
		this.note2 = note2;
	}
	public int getNoLines() {
		return noLines;
	}
	public void setNoLines(int noLines) {
		this.noLines = noLines;
	}
	public int getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(int orderAmount) {
		this.orderAmount = orderAmount;
	}
	public String getPaidAmount() {
		return paidAmount;
	}
	public void setPaidAmount(String paidAmount) {
		this.paidAmount = paidAmount;
	}
	public String getPayableAmount() {
		return payableAmount;
	}
	public void setPayableAmount(String payableAmount) {
		this.payableAmount = payableAmount;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public String getPhone1() {
		return phone1;
	}
	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}
	public String getPhone2() {
		return phone2;
	}
	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}
	public String getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}
	public String getSiteId() {
		return siteId;
	}
	public void setSiteId(String siteId) {
		this.siteId = siteId;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getStatusFlag() {
		return statusFlag;
	}
	public void setStatusFlag(String statusFlag) {
		this.statusFlag = statusFlag;
	}
	public Date getUpdDate() {
		return updDate;
	}
	public void setUpdDate(Date updDate) {
		this.updDate = updDate;
	}
	public int getUpdEbizUserNo() {
		return updEbizUserNo;
	}
	public void setUpdEbizUserNo(int updEbizUserNo) {
		this.updEbizUserNo = updEbizUserNo;
	}
	public String getUserField10() {
		return userField10;
	}
	public void setUserField10(String userField10) {
		this.userField10 = userField10;
	}
	public String getUserField3() {
		return userField3;
	}
	public void setUserField3(String userField3) {
		this.userField3 = userField3;
	}
	public String getUserField4() {
		return userField4;
	}
	public void setUserField4(String userField4) {
		this.userField4 = userField4;
	}
	public String getUserField5() {
		return userField5;
	}
	public void setUserField5(String userField5) {
		this.userField5 = userField5;
	}
	public String getUserField6() {
		return userField6;
	}
	public void setUserField6(String userField6) {
		this.userField6 = userField6;
	}
	public String getUserField7() {
		return userField7;
	}
	public void setUserField7(String userField7) {
		this.userField7 = userField7;
	}
	public String getUserField8() {
		return userField8;
	}
	public void setUserField8(String userField8) {
		this.userField8 = userField8;
	}
	public String getUserField9() {
		return userField9;
	}
	public void setUserField9(String userField9) {
		this.userField9 = userField9;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public Date getExprdate() {
		return exprdate;
	}
	public void setExprdate(Date exprdate) {
		this.exprdate = exprdate;
	}
	public String getRowId() {
		return rowId;
	}
	public void setRowId(String rowId) {
		this.rowId = rowId;
	}
	public String getEbizFileNo() {
		return ebizFileNo;
	}
	public void setEbizFileNo(String ebizFileNo) {
		this.ebizFileNo = ebizFileNo;
	}
	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
	
}
