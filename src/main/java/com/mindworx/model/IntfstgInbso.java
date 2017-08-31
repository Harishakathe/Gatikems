package com.mindworx.model;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;


public class IntfstgInbso {
	
	@NotEmpty(message="{NotNull.IntfstgInbso.ordNo}") @Size(max=30)
	private String ordNo;
	private int noLines;
	private int orderPriority;
	@Size(max=1)
	private String backOrderFlag;
	@NotEmpty(message="{NotNull.IntfstgInbso.carrierId}") @Size(max=10)
	private String carrierId;
	@Size(max=30)
	private String carrierType;
	@NotEmpty(message="{NotNull.IntfstgInbso.consigneeId}") @Size(max=100)
	private String consigneeId;
	@Size(max=100)
	private String custConsgId;
	@Size(max=10)
	private String dest;
	private Date expShipDate;
	@Size(max=30)
	private String hostOrdNo;
	@Size(max=255)
	private String note1;
	@NotEmpty(message="{NotNull.IntfstgInbso.orderType}") @Size(max=10)
	private String orderType;
	@NotNull(message="{NotNull.IntfstgInbso.ordDate}")
	private Date ordDate;
	@Size(max=30)
	private String poNo;
	private Date reqdate;
	@Size(max=10)
	private String route;
	private Date schDate;
	@Size(max=50)
	private String shiptoAddr1;
	@Size(max=20)
	private String shiptoCity;
	@Size(max=20)
	private String shiptoCountry;
	@Size(max=20)
	private String shiptoState;
	@Size(max=20)
	private String shiptoZip;
	@NotEmpty(message="{NotNull.IntfstgInbso.sku}") @Size(max=200)
	private String sku;
	@NotEmpty(message="{NotNull.IntfstgInbso.skuStatus}") @Size(max=10)
	private String skuStatus;
	@Size(max=100)
	private String batchNo;
	@NotNull(message="{NotNull.IntfstgInbso.ordlineNo}")
	private int ordlineNo;
	@NotNull(message="{NotNull.IntfstgInbso.ordQty}")
	private int ordQty;
	@NotEmpty(message="{NotNull.IntfstgInbso.packcode}") @Size(max=10)
	private String packcode;
	@NotEmpty @Size(max=10)
	private String uomId;
	private String rate;
	private int unitPrice;
	private String frgtTerm;
	private int parentOrdlineNo;
	@Size(max=30)
	private String parentOrdNo;
	@Size(max=10)
	private String parentSpecprocessCode;
	@Size(max=100)
	private String note2;
	private int altskuQty;
	private int amount;
	@Size(max=1)
	private String approvedFlag;
	private Date archdate;
	@Size(max=50)
	private String archrowid;
	private int archEbizUserNo;
	@Size(max=1)
	private String batchFlag;
	@Size(max=50)
	private String billtoAddr1;
	@Size(max=50)
	private String billtoAddr2;
	@Size(max=50)
	private String billtoAddr3;
	@Size(max=20)
	private String billtoCity;
	@Size(max=20)
	private String billtoCountry;
	@Size(max=50)
	private String billtoEmail;
	@Size(max=20)
	private String billtoFax;
	@Size(max=20)
	private String billtoMobileNo;
	@Size(max=20)
	private String billtoPhone;
	@Size(max=20)
	private String billtoState;
	@Size(max=20)
	private String billtoZip;
	@Size(max=100)
	private String carrierTransMode;
	@Size(max=100)
	private String classId;
	@Size(max=1)
	private String codFlag;
	@Size(max=30)
	private String compId;
	@Size(max=30)
	private String consgOrdNo;
	@Size(max=1)
	private String consoleFlag;	
	private Date currdate;
	@Size(max=8)
	private String custDept;
	@Size(max=20)
	private String custDest;
	@Size(max=20)
	private String custInternalid;
	@Size(max=4)
	private String custPotype;
	@Size(max=20)
	private String departmentId;
	private int ebizAppownNo;
	private Date ebizProcessDate;
	@Size(max=1)
	private String ebizStatusFlag;
	private int ebizUserNo;
	@Size(max=1000)
	private String errorDesc;
	@Size(max=1000)
	private String fileName;
	private Date hostConfDate1;
	private Date hostConfDate2;
	@Size(max=1)
	private String hostConfFlag;
	@Size(max=50)
	private String hostId;
	private int hostTranNo1;
	@Size(max=1000)
	private String hostTranNo1Consignee;
	@Size(max=10)
	private String hostTranNo2;
	@Size(max=1000)
	private String hostTranNo1Sku;
	@Size(max=1)
	private String intfConfStatusFlag;
	private Date intfTransDate;
	@Size(max=1000)
	private String intfTransNo;
	@Size(max=1000)
	private String intfType;
	@Size(max=20)
	private String locationId;
	@Size(max=100)
	private String locationIdDtl;
	@Size(max=100)
	private String mailSend;
	@Size(max=20)
	private String ordInternalid;
	private Date poDate;
	private int poHostLineNo;
	private int poHostTranNo;
	private int prarentOrdlineNo;
	private int schTime;
	@Size(max=1)
	private String schType;
	@Size(max=1000)
	private String sendAlert;
	@Size(max=50)
	private String serialNo;
	@Size(max=50)
	private String shiptoAddr2;
	@Size(max=50)
	private String shiptoAddr3;
	@Size(max=50)
	private String shiptoEmail;
	@Size(max=20)
	private String shiptoFax;
	@Size(max=20)
	private String shiptoMobileNo;
	@Size(max=20)
	private String shiptoPhone;
	@Size(max=1000)
	private String shipZone;
	@Size(max=12)
	private String siteId;
	@Size(max=1000)
	private String skuAlias1;
	@Size(max=1000)
	private String skuInternalid;
	@Size(max=50)
	private String stageLoc;
	@Size(max=50)
	private String supplierId;
	@Size(max=1000)
	private String transReceiverId;
	@Size(max=1000)
	private String transSenderId;
	@Size(max=1000)
	private String transType;
	@Size(max=50)
	private String userField1;
	@Size(max=50)
	private String userField10;
	@Size(max=50)
	private String userField2;
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
	@Size(max=1000)
	private String fileSeqNo;
	@Size(max=50)
	private String shiptoContactName;
	@Size(max=50)
	private String billtoContactName;
	@Size(max=100)
	private String consigneeName;
	@Size(max=1000)
	private String hostAddrId;
	private int backOrdQty;
	@Size(max=1000)
	private String signatureReqd;
	@Size(max=1000)
	private String saturdayDelivery;
	private int totalOrdQty;
	private int fulfilledQty;
	@Size(max=50)
	private String rowId;
	@Size(max=100)
	private String customerId;
	@Size(max=1000)
	private String ebizFileNo;
	@Size(max=1000)
	private String transRecordMode;
	@Size(max=1000)
	private String transNo;
	@Size(max=1000)
	private String billtoDayPhone;
	@Size(max=1000)
	private String billtoCaller;
	@Size(max=1000)
	private String shiptoDayPhone;
	@Size(max=1000)
	private String shiptoCaller;
	@Size(max=50)
	private String awbNo;
	private int orderAmount;
	@Size(max=1000)
	private String orderSource;
	@Size(max=50)
	private String userField11;
	@Size(max=50)
	private String userField12;
	@Size(max=50)
	private String userField13;
	@Size(max=50)
	private String userField14;
	@Size(max=50)
	private String userField15;
	private int totalPrice;
	@Size(max=50)
	private String lUserField1;
	@Size(max=50)
	private String lUserField2;
	@Size(max=50)
	private String lUserField3;
	@Size(max=50)
	private String lUserField4;
	@Size(max=50)
	private String lUserField5;
	@Size(max=50)
	private String lUserField6;
	@Size(max=50)
	private String lUserField7;
	@Size(max=50)
	private String lUserField8;
	@Size(max=50)
	private String lUserField9;
	@Size(max=50)
	private String lUserField10;
	@Size(max=1000)
	private String errorDesc2;
	public String getOrdNo() {
		return ordNo;
	}
	public void setOrdNo(String ordNo) {
		this.ordNo = ordNo;
	}
	public int getNoLines() {
		return noLines;
	}
	public void setNoLines(int noLines) {
		this.noLines = noLines;
	}
	public int getOrderPriority() {
		return orderPriority;
	}
	public void setOrderPriority(int orderPriority) {
		this.orderPriority = orderPriority;
	}
	public String getBackOrderFlag() {
		return backOrderFlag;
	}
	public void setBackOrderFlag(String backOrderFlag) {
		this.backOrderFlag = backOrderFlag;
	}
	public String getCarrierId() {
		return carrierId;
	}
	public void setCarrierId(String carrierId) {
		this.carrierId = carrierId;
	}
	public String getCarrierType() {
		return carrierType;
	}
	public void setCarrierType(String carrierType) {
		this.carrierType = carrierType;
	}
	public String getConsigneeId() {
		return consigneeId;
	}
	public void setConsigneeId(String consigneeId) {
		this.consigneeId = consigneeId;
	}
	public String getCustConsgId() {
		return custConsgId;
	}
	public void setCustConsgId(String custConsgId) {
		this.custConsgId = custConsgId;
	}
	public String getDest() {
		return dest;
	}
	public void setDest(String dest) {
		this.dest = dest;
	}
	public Date getExpShipDate() {
		return expShipDate;
	}
	public void setExpShipDate(Date expShipDate) {
		this.expShipDate = expShipDate;
	}
	public String getHostOrdNo() {
		return hostOrdNo;
	}
	public void setHostOrdNo(String hostOrdNo) {
		this.hostOrdNo = hostOrdNo;
	}
	public String getNote1() {
		return note1;
	}
	public void setNote1(String note1) {
		this.note1 = note1;
	}
	public String getOrderType() {
		return orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	public Date getOrdDate() {
		return ordDate;
	}
	public void setOrdDate(Date ordDate) {
		this.ordDate = ordDate;
	}
	public String getPoNo() {
		return poNo;
	}
	public void setPoNo(String poNo) {
		this.poNo = poNo;
	}
	public Date getReqdate() {
		return reqdate;
	}
	public void setReqdate(Date reqdate) {
		this.reqdate = reqdate;
	}
	public String getRoute() {
		return route;
	}
	public void setRoute(String route) {
		this.route = route;
	}
	public Date getSchDate() {
		return schDate;
	}
	public void setSchDate(Date schDate) {
		this.schDate = schDate;
	}
	public String getShiptoAddr1() {
		return shiptoAddr1;
	}
	public void setShiptoAddr1(String shiptoAddr1) {
		this.shiptoAddr1 = shiptoAddr1;
	}
	public String getShiptoCity() {
		return shiptoCity;
	}
	public void setShiptoCity(String shiptoCity) {
		this.shiptoCity = shiptoCity;
	}
	public String getShiptoCountry() {
		return shiptoCountry;
	}
	public void setShiptoCountry(String shiptoCountry) {
		this.shiptoCountry = shiptoCountry;
	}
	public String getShiptoState() {
		return shiptoState;
	}
	public void setShiptoState(String shiptoState) {
		this.shiptoState = shiptoState;
	}
	public String getShiptoZip() {
		return shiptoZip;
	}
	public void setShiptoZip(String shiptoZip) {
		this.shiptoZip = shiptoZip;
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
	public String getBatchNo() {
		return batchNo;
	}
	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
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
	public String getPackcode() {
		return packcode;
	}
	public void setPackcode(String packcode) {
		this.packcode = packcode;
	}
	public String getUomId() {
		return uomId;
	}
	public void setUomId(String uomId) {
		this.uomId = uomId;
	}
	public String getRate() {
		return rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}
	public int getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}
	public String getFrgtTerm() {
		return frgtTerm;
	}
	public void setFrgtTerm(String frgtTerm) {
		this.frgtTerm = frgtTerm;
	}
	public int getParentOrdlineNo() {
		return parentOrdlineNo;
	}
	public void setParentOrdlineNo(int parentOrdlineNo) {
		this.parentOrdlineNo = parentOrdlineNo;
	}
	public String getParentOrdNo() {
		return parentOrdNo;
	}
	public void setParentOrdNo(String parentOrdNo) {
		this.parentOrdNo = parentOrdNo;
	}
	public String getParentSpecprocessCode() {
		return parentSpecprocessCode;
	}
	public void setParentSpecprocessCode(String parentSpecprocessCode) {
		this.parentSpecprocessCode = parentSpecprocessCode;
	}
	public String getNote2() {
		return note2;
	}
	public void setNote2(String note2) {
		this.note2 = note2;
	}
	public int getAltskuQty() {
		return altskuQty;
	}
	public void setAltskuQty(int altskuQty) {
		this.altskuQty = altskuQty;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getApprovedFlag() {
		return approvedFlag;
	}
	public void setApprovedFlag(String approvedFlag) {
		this.approvedFlag = approvedFlag;
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
	public String getBatchFlag() {
		return batchFlag;
	}
	public void setBatchFlag(String batchFlag) {
		this.batchFlag = batchFlag;
	}
	public String getBilltoAddr1() {
		return billtoAddr1;
	}
	public void setBilltoAddr1(String billtoAddr1) {
		this.billtoAddr1 = billtoAddr1;
	}
	public String getBilltoAddr2() {
		return billtoAddr2;
	}
	public void setBilltoAddr2(String billtoAddr2) {
		this.billtoAddr2 = billtoAddr2;
	}
	public String getBilltoAddr3() {
		return billtoAddr3;
	}
	public void setBilltoAddr3(String billtoAddr3) {
		this.billtoAddr3 = billtoAddr3;
	}
	public String getBilltoCity() {
		return billtoCity;
	}
	public void setBilltoCity(String billtoCity) {
		this.billtoCity = billtoCity;
	}
	public String getBilltoCountry() {
		return billtoCountry;
	}
	public void setBilltoCountry(String billtoCountry) {
		this.billtoCountry = billtoCountry;
	}
	public String getBilltoEmail() {
		return billtoEmail;
	}
	public void setBilltoEmail(String billtoEmail) {
		this.billtoEmail = billtoEmail;
	}
	public String getBilltoFax() {
		return billtoFax;
	}
	public void setBilltoFax(String billtoFax) {
		this.billtoFax = billtoFax;
	}
	public String getBilltoMobileNo() {
		return billtoMobileNo;
	}
	public void setBilltoMobileNo(String billtoMobileNo) {
		this.billtoMobileNo = billtoMobileNo;
	}
	public String getBilltoPhone() {
		return billtoPhone;
	}
	public void setBilltoPhone(String billtoPhone) {
		this.billtoPhone = billtoPhone;
	}
	public String getBilltoState() {
		return billtoState;
	}
	public void setBilltoState(String billtoState) {
		this.billtoState = billtoState;
	}
	public String getBilltoZip() {
		return billtoZip;
	}
	public void setBilltoZip(String billtoZip) {
		this.billtoZip = billtoZip;
	}
	public String getCarrierTransMode() {
		return carrierTransMode;
	}
	public void setCarrierTransMode(String carrierTransMode) {
		this.carrierTransMode = carrierTransMode;
	}
	public String getClassId() {
		return classId;
	}
	public void setClassId(String classId) {
		this.classId = classId;
	}
	public String getCodFlag() {
		return codFlag;
	}
	public void setCodFlag(String codFlag) {
		this.codFlag = codFlag;
	}
	public String getCompId() {
		return compId;
	}
	public void setCompId(String compId) {
		this.compId = compId;
	}
	public String getConsgOrdNo() {
		return consgOrdNo;
	}
	public void setConsgOrdNo(String consgOrdNo) {
		this.consgOrdNo = consgOrdNo;
	}
	public String getConsoleFlag() {
		return consoleFlag;
	}
	public void setConsoleFlag(String consoleFlag) {
		this.consoleFlag = consoleFlag;
	}
	public Date getCurrdate() {
		return currdate;
	}
	public void setCurrdate(Date currdate) {
		this.currdate = currdate;
	}
	public String getCustDept() {
		return custDept;
	}
	public void setCustDept(String custDept) {
		this.custDept = custDept;
	}
	public String getCustDest() {
		return custDest;
	}
	public void setCustDest(String custDest) {
		this.custDest = custDest;
	}
	public String getCustInternalid() {
		return custInternalid;
	}
	public void setCustInternalid(String custInternalid) {
		this.custInternalid = custInternalid;
	}
	public String getCustPotype() {
		return custPotype;
	}
	public void setCustPotype(String custPotype) {
		this.custPotype = custPotype;
	}
	public String getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}
	public int getEbizAppownNo() {
		return ebizAppownNo;
	}
	public void setEbizAppownNo(int ebizAppownNo) {
		this.ebizAppownNo = ebizAppownNo;
	}
	public Date getEbizProcessDate() {
		return ebizProcessDate;
	}
	public void setEbizProcessDate(Date ebizProcessDate) {
		this.ebizProcessDate = ebizProcessDate;
	}
	public String getEbizStatusFlag() {
		return ebizStatusFlag;
	}
	public void setEbizStatusFlag(String ebizStatusFlag) {
		this.ebizStatusFlag = ebizStatusFlag;
	}
	public int getEbizUserNo() {
		return ebizUserNo;
	}
	public void setEbizUserNo(int ebizUserNo) {
		this.ebizUserNo = ebizUserNo;
	}
	public String getErrorDesc() {
		return errorDesc;
	}
	public void setErrorDesc(String errorDesc) {
		this.errorDesc = errorDesc;
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
	public String getHostConfFlag() {
		return hostConfFlag;
	}
	public void setHostConfFlag(String hostConfFlag) {
		this.hostConfFlag = hostConfFlag;
	}
	public String getHostId() {
		return hostId;
	}
	public void setHostId(String hostId) {
		this.hostId = hostId;
	}
	public int getHostTranNo1() {
		return hostTranNo1;
	}
	public void setHostTranNo1(int hostTranNo1) {
		this.hostTranNo1 = hostTranNo1;
	}
	public String getHostTranNo1Consignee() {
		return hostTranNo1Consignee;
	}
	public void setHostTranNo1Consignee(String hostTranNo1Consignee) {
		this.hostTranNo1Consignee = hostTranNo1Consignee;
	}
	public String getHostTranNo2() {
		return hostTranNo2;
	}
	public void setHostTranNo2(String hostTranNo2) {
		this.hostTranNo2 = hostTranNo2;
	}
	public String getHostTranNo1Sku() {
		return hostTranNo1Sku;
	}
	public void setHostTranNo1Sku(String hostTranNo1Sku) {
		this.hostTranNo1Sku = hostTranNo1Sku;
	}
	public String getIntfConfStatusFlag() {
		return intfConfStatusFlag;
	}
	public void setIntfConfStatusFlag(String intfConfStatusFlag) {
		this.intfConfStatusFlag = intfConfStatusFlag;
	}
	public Date getIntfTransDate() {
		return intfTransDate;
	}
	public void setIntfTransDate(Date intfTransDate) {
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
	public String getLocationId() {
		return locationId;
	}
	public void setLocationId(String locationId) {
		this.locationId = locationId;
	}
	public String getLocationIdDtl() {
		return locationIdDtl;
	}
	public void setLocationIdDtl(String locationIdDtl) {
		this.locationIdDtl = locationIdDtl;
	}
	public String getMailSend() {
		return mailSend;
	}
	public void setMailSend(String mailSend) {
		this.mailSend = mailSend;
	}
	public String getOrdInternalid() {
		return ordInternalid;
	}
	public void setOrdInternalid(String ordInternalid) {
		this.ordInternalid = ordInternalid;
	}
	public Date getPoDate() {
		return poDate;
	}
	public void setPoDate(Date poDate) {
		this.poDate = poDate;
	}
	public int getPoHostLineNo() {
		return poHostLineNo;
	}
	public void setPoHostLineNo(int poHostLineNo) {
		this.poHostLineNo = poHostLineNo;
	}
	public int getPoHostTranNo() {
		return poHostTranNo;
	}
	public void setPoHostTranNo(int poHostTranNo) {
		this.poHostTranNo = poHostTranNo;
	}
	public int getPrarentOrdlineNo() {
		return prarentOrdlineNo;
	}
	public void setPrarentOrdlineNo(int prarentOrdlineNo) {
		this.prarentOrdlineNo = prarentOrdlineNo;
	}
	public int getSchTime() {
		return schTime;
	}
	public void setSchTime(int schTime) {
		this.schTime = schTime;
	}
	public String getSchType() {
		return schType;
	}
	public void setSchType(String schType) {
		this.schType = schType;
	}
	public String getSendAlert() {
		return sendAlert;
	}
	public void setSendAlert(String sendAlert) {
		this.sendAlert = sendAlert;
	}
	public String getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}
	public String getShiptoAddr2() {
		return shiptoAddr2;
	}
	public void setShiptoAddr2(String shiptoAddr2) {
		this.shiptoAddr2 = shiptoAddr2;
	}
	public String getShiptoAddr3() {
		return shiptoAddr3;
	}
	public void setShiptoAddr3(String shiptoAddr3) {
		this.shiptoAddr3 = shiptoAddr3;
	}
	public String getShiptoEmail() {
		return shiptoEmail;
	}
	public void setShiptoEmail(String shiptoEmail) {
		this.shiptoEmail = shiptoEmail;
	}
	public String getShiptoFax() {
		return shiptoFax;
	}
	public void setShiptoFax(String shiptoFax) {
		this.shiptoFax = shiptoFax;
	}
	public String getShiptoMobileNo() {
		return shiptoMobileNo;
	}
	public void setShiptoMobileNo(String shiptoMobileNo) {
		this.shiptoMobileNo = shiptoMobileNo;
	}
	public String getShiptoPhone() {
		return shiptoPhone;
	}
	public void setShiptoPhone(String shiptoPhone) {
		this.shiptoPhone = shiptoPhone;
	}
	public String getShipZone() {
		return shipZone;
	}
	public void setShipZone(String shipZone) {
		this.shipZone = shipZone;
	}
	public String getSiteId() {
		return siteId;
	}
	public void setSiteId(String siteId) {
		this.siteId = siteId;
	}
	public String getSkuAlias1() {
		return skuAlias1;
	}
	public void setSkuAlias1(String skuAlias1) {
		this.skuAlias1 = skuAlias1;
	}
	public String getSkuInternalid() {
		return skuInternalid;
	}
	public void setSkuInternalid(String skuInternalid) {
		this.skuInternalid = skuInternalid;
	}
	public String getStageLoc() {
		return stageLoc;
	}
	public void setStageLoc(String stageLoc) {
		this.stageLoc = stageLoc;
	}
	public String getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}
	public String getTransReceiverId() {
		return transReceiverId;
	}
	public void setTransReceiverId(String transReceiverId) {
		this.transReceiverId = transReceiverId;
	}
	public String getTransSenderId() {
		return transSenderId;
	}
	public void setTransSenderId(String transSenderId) {
		this.transSenderId = transSenderId;
	}
	public String getTransType() {
		return transType;
	}
	public void setTransType(String transType) {
		this.transType = transType;
	}
	public String getUserField1() {
		return userField1;
	}
	public void setUserField1(String userField1) {
		this.userField1 = userField1;
	}
	public String getUserField10() {
		return userField10;
	}
	public void setUserField10(String userField10) {
		this.userField10 = userField10;
	}
	public String getUserField2() {
		return userField2;
	}
	public void setUserField2(String userField2) {
		this.userField2 = userField2;
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
	public String getFileSeqNo() {
		return fileSeqNo;
	}
	public void setFileSeqNo(String fileSeqNo) {
		this.fileSeqNo = fileSeqNo;
	}
	public String getShiptoContactName() {
		return shiptoContactName;
	}
	public void setShiptoContactName(String shiptoContactName) {
		this.shiptoContactName = shiptoContactName;
	}
	public String getBilltoContactName() {
		return billtoContactName;
	}
	public void setBilltoContactName(String billtoContactName) {
		this.billtoContactName = billtoContactName;
	}
	public String getConsigneeName() {
		return consigneeName;
	}
	public void setConsigneeName(String consigneeName) {
		this.consigneeName = consigneeName;
	}
	public String getHostAddrId() {
		return hostAddrId;
	}
	public void setHostAddrId(String hostAddrId) {
		this.hostAddrId = hostAddrId;
	}
	public int getBackOrdQty() {
		return backOrdQty;
	}
	public void setBackOrdQty(int backOrdQty) {
		this.backOrdQty = backOrdQty;
	}
	public String getSignatureReqd() {
		return signatureReqd;
	}
	public void setSignatureReqd(String signatureReqd) {
		this.signatureReqd = signatureReqd;
	}
	public String getSaturdayDelivery() {
		return saturdayDelivery;
	}
	public void setSaturdayDelivery(String saturdayDelivery) {
		this.saturdayDelivery = saturdayDelivery;
	}
	public int getTotalOrdQty() {
		return totalOrdQty;
	}
	public void setTotalOrdQty(int totalOrdQty) {
		this.totalOrdQty = totalOrdQty;
	}
	public int getFulfilledQty() {
		return fulfilledQty;
	}
	public void setFulfilledQty(int fulfilledQty) {
		this.fulfilledQty = fulfilledQty;
	}
	public String getRowId() {
		return rowId;
	}
	public void setRowId(String rowId) {
		this.rowId = rowId;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getEbizFileNo() {
		return ebizFileNo;
	}
	public void setEbizFileNo(String ebizFileNo) {
		this.ebizFileNo = ebizFileNo;
	}
	public String getTransRecordMode() {
		return transRecordMode;
	}
	public void setTransRecordMode(String transRecordMode) {
		this.transRecordMode = transRecordMode;
	}
	public String getTransNo() {
		return transNo;
	}
	public void setTransNo(String transNo) {
		this.transNo = transNo;
	}
	public String getBilltoDayPhone() {
		return billtoDayPhone;
	}
	public void setBilltoDayPhone(String billtoDayPhone) {
		this.billtoDayPhone = billtoDayPhone;
	}
	public String getBilltoCaller() {
		return billtoCaller;
	}
	public void setBilltoCaller(String billtoCaller) {
		this.billtoCaller = billtoCaller;
	}
	public String getShiptoDayPhone() {
		return shiptoDayPhone;
	}
	public void setShiptoDayPhone(String shiptoDayPhone) {
		this.shiptoDayPhone = shiptoDayPhone;
	}
	public String getShiptoCaller() {
		return shiptoCaller;
	}
	public void setShiptoCaller(String shiptoCaller) {
		this.shiptoCaller = shiptoCaller;
	}
	public String getAwbNo() {
		return awbNo;
	}
	public void setAwbNo(String awbNo) {
		this.awbNo = awbNo;
	}
	public int getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(int orderAmount) {
		this.orderAmount = orderAmount;
	}
	public String getOrderSource() {
		return orderSource;
	}
	public void setOrderSource(String orderSource) {
		this.orderSource = orderSource;
	}
	public String getUserField11() {
		return userField11;
	}
	public void setUserField11(String userField11) {
		this.userField11 = userField11;
	}
	public String getUserField12() {
		return userField12;
	}
	public void setUserField12(String userField12) {
		this.userField12 = userField12;
	}
	public String getUserField13() {
		return userField13;
	}
	public void setUserField13(String userField13) {
		this.userField13 = userField13;
	}
	public String getUserField14() {
		return userField14;
	}
	public void setUserField14(String userField14) {
		this.userField14 = userField14;
	}
	public String getUserField15() {
		return userField15;
	}
	public void setUserField15(String userField15) {
		this.userField15 = userField15;
	}
	public int getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getlUserField1() {
		return lUserField1;
	}
	public void setlUserField1(String lUserField1) {
		this.lUserField1 = lUserField1;
	}
	public String getlUserField2() {
		return lUserField2;
	}
	public void setlUserField2(String lUserField2) {
		this.lUserField2 = lUserField2;
	}
	public String getlUserField3() {
		return lUserField3;
	}
	public void setlUserField3(String lUserField3) {
		this.lUserField3 = lUserField3;
	}
	public String getlUserField4() {
		return lUserField4;
	}
	public void setlUserField4(String lUserField4) {
		this.lUserField4 = lUserField4;
	}
	public String getlUserField5() {
		return lUserField5;
	}
	public void setlUserField5(String lUserField5) {
		this.lUserField5 = lUserField5;
	}
	public String getlUserField6() {
		return lUserField6;
	}
	public void setlUserField6(String lUserField6) {
		this.lUserField6 = lUserField6;
	}
	public String getlUserField7() {
		return lUserField7;
	}
	public void setlUserField7(String lUserField7) {
		this.lUserField7 = lUserField7;
	}
	public String getlUserField8() {
		return lUserField8;
	}
	public void setlUserField8(String lUserField8) {
		this.lUserField8 = lUserField8;
	}
	public String getlUserField9() {
		return lUserField9;
	}
	public void setlUserField9(String lUserField9) {
		this.lUserField9 = lUserField9;
	}
	public String getlUserField10() {
		return lUserField10;
	}
	public void setlUserField10(String lUserField10) {
		this.lUserField10 = lUserField10;
	}
	public String getErrorDesc2() {
		return errorDesc2;
	}
	public void setErrorDesc2(String errorDesc2) {
		this.errorDesc2 = errorDesc2;
	}
	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}
