<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
   <head>
      <meta charset="utf-8">
      <meta name="viewport" content="width=device-width, initial-scale=1.0">
      <c:url var="url" value="/" scope="request" />
      <title>SO Form</title>
      <link href="${url}resources/css/bootstrap.min.css" rel="stylesheet">
      <link href="${url}resources/font-awesome/css/font-awesome.css" rel="stylesheet">
      <link href="${url}resources/css/animate.css" rel="stylesheet">
      <link href="${url}resources/css/plugins/datapicker/datepicker3.css" rel="stylesheet">      
      <link href="${url}resources/css/plugins/select2/select2.min.css" rel="stylesheet">
      <link href="${url}resources/css/style.css" rel="stylesheet">
      <!-- Sweet Alert -->
      <link href="${url}resources/css/plugins/sweetalert/sweetalert.css" rel="stylesheet">
      <!-- Ladda style -->
      <link href="${url}resources/css/plugins/ladda/ladda-themeless.min.css" rel="stylesheet">
      
      <link href="${url}resources/css/animate.css" rel="stylesheet">
      <link href="${url}resources/css/custom.css" rel="stylesheet" type="text/css" />
      <style type="text/css">
         .borderless td, .borderless th {
         	border: none;
         }
         .npadding td, .npadding th {
         	padding: 2px;
         }
         #soNoListRow tr:hover {
         	background-color: #ccc;
         }
         #soNoListRow .highlighted {
         	background-color: #ccc;
         }
         #soNoListRow td:hover {
         	cursor: pointer;
         }
         
         #soNoListRow .highlighted {
         	background-color: #ccc;
         }	  	
		
		.table-fixed tbody {
		    display:block;
		    height:200px;
		    overflow:auto;
		}
		.table-fixed thead, .table-fixed tbody tr {
		    display:table;
		    width:100%;
		    table-layout:fixed;
		}				
		
      </style>
   </head>
   <body class="md-skin">
      <div id="wrapper">
         <nav class="navbar-default navbar-static-side" role="navigation">
            <div class="sidebar-collapse">
               <ul class="nav metismenu nav-box" id="side-menu">
                  <li class="nav-header">
                     <img alt="image"
                        class="img-responsive big-logo" src="${url}resources/img/logo.png" />
                     <div class="logo-element">
                        <img alt="image" class="img-responsive center-block"
                           src="${url}resources/img/gati-small.png" />
                     </div>
                  </li>
                  <li class="bg-blue"><a class="text-center"
                     href="${url}dashboard" data-toggle="tooltip" data-placement="top"
                     title="Dashboard"><i class="fa fa-3x fa-th-large"></i> <span
                     class="nav-label block m-t-sm">Dashboard</span></a></li>
                  <li class="bg-blue"><a class="text-center"
                     href="${url}tracking" data-toggle="tooltip" data-placement="top"
                     title="Track Your Product"><i class="fa fa-3x fa-compass"></i>
                     <span class="nav-label block m-t-sm">Track Your Product</span></a>
                  </li>
                  <li class="bg-blue"><a class="text-center"
                     href="${url}globalinventory" data-toggle="tooltip"
                     data-placement="top" title="Global Inventory"><i
                     class="fa fa-3x fa-braille"></i> <span
                     class="nav-label block m-t-sm">Global Inventory</span></a></li>
                  <li class="bg-blue active">
                     <a class="text-center" href="#"><i
                        class="fa fa-3x fa-reorder"></i> <span
                        class="nav-label block m-t-sm">Raise Order Request</span></a>
                     <ul class="nav nav-second-level collapse">
                        <li><a href="${url}asn-master">Inbound</a></li>
                        <li class="active"><a href="${url}so-master">Outbound</a></li>
                     </ul>
                  </li>
               </ul>
            </div>
         </nav>
         <div id="page-wrapper" class="blue-bg-light">
            <div class="row border-bottom">
               <nav class="navbar navbar-static-top white-bg" role="navigation"
                  style="margin-bottom: 0">
                  <div class="navbar-header">
                     <a class="navbar-minimalize minimalize-styl-2 btn btn-link "
                        href="#"><i class="fa fa-bars text-white"></i> </a>
                  </div>
                  <ul class="nav navbar-top-links navbar-right">
                     <li class="dropdown">
                        <a class="dropdown-toggle count-info"
                           data-toggle="dropdown" href="#"> <i class="fa fa-bell-o"></i>
                        <span class="label label-danger">8</span>
                        </a>
                        <ul class="dropdown-menu dropdown-alerts">
                           <li>
                              <a href="mailbox.html">
                                 <div>
                                    <i class="fa fa-envelope fa-fw"></i> You have 16 messages <span
                                       class="pull-right text-muted small">4 minutes ago</span>
                                 </div>
                              </a>
                           </li>
                           <li class="divider"></li>
                           <li>
                              <a href="profile.html">
                                 <div>
                                    <i class="fa fa-twitter fa-fw"></i> 3 New Followers <span
                                       class="pull-right text-muted small">12 minutes ago</span>
                                 </div>
                              </a>
                           </li>
                           <li class="divider"></li>
                           <li>
                              <a href="grid_options.html">
                                 <div>
                                    <i class="fa fa-upload fa-fw"></i> Server Rebooted <span
                                       class="pull-right text-muted small">4 minutes ago</span>
                                 </div>
                              </a>
                           </li>
                           <li class="divider"></li>
                           <li>
                              <div class="text-center link-block">
                                 <a href="notifications.html"> <strong>See All
                                 Alerts</strong> <i class="fa fa-angle-right"></i>
                                 </a>
                              </div>
                           </li>
                        </ul>
                     </li>
                     <li><a href="#"> <i class="fa fa-gear"></i>
                        </a>
                     </li>
                     <li><a href="${url}logout"> <i class="fa fa-sign-out"></i>
                        </a>
                     </li>
                  </ul>
               </nav>
            </div>
            <div class="row wrapper page-heading">
               <div class="col-xs-8">
                  <h3>Outbound</h3>
               </div>
               <div class="col-xs-4">
                  <a class="pull-right m-t-xs text-info" href="#"><span
                     class="fa fa-home"></span></a>
               </div>
            </div>
            <div class="wrapper wrapper-content">
               <div class="row">
                  <div class="col-sm-3">
                     <div class="form-group no-margins" id="data_5">
                        <label class="font-normal">Select Date</label>
                        <div class="input-daterange input-group" id="datepicker">
                           <input type="text" class="input-sm form-control" name="start" id="fromDate" placeholder="DD/MM/YYYY" /> 
                           <span class="input-group-addon">to</span> 
                           <input type="text" class="input-sm form-control" name="end" id="toDate" placeholder="DD/MM/YYYY" />
                        </div>
                     </div>
                  </div>
                  <div class="col-sm-1">
                     <button class="ladda-button btn btn-sm btn-primary m-t-md" id="find_sono" data-style="zoom-in">Load List</button>
                  </div>
                  <div class="col-sm-3">
                     <div class="form-group no-margins">
                        <label class="font-normal">SO Number</label> 
                        <!-- <select class="form-control input-sm" name="so_no" id="so_no"></select> -->
                        <input class="form-control input-sm" name="so_no" id="so_no" required>
                     </div>
                  </div>
                  <div class="col-sm-1">
                     <button class="ladda-button btn btn-sm btn-primary m-t-md" id="find_so" data-style="zoom-in">Show</button>
                  </div>
               </div>
               <hr />
               <div class="row">
                  <div class="col-sm-12">
                     <div class="ibox">
                        <div class="ibox-content">
                           <form:form role="form" method="post" id="so-form" modelAttribute="soHead">
                              <div class="row">
                                 <div class="col-sm-6">
                                    <div class="form-group">
                                       <label class="font-normal">Order No.</label> 
                                       <input type="text" placeholder="" name="ordNo" id="ordNo" class="form-control">
                                    </div>
                                 </div>
                                 <div class="col-sm-6">
                                    <div class="form-group" id="data_1">
                                       <label class="font-normal">Order Date</label>
                                       <div class="input-group date">
                                          <input type="text" class="form-control" placeholder="DD/MM/YYYY" name="ordDate" id="ordDate">
                                          <span class="input-group-addon"><i class="fa fa-calendar"></i></span>
                                       </div>
                                    </div>
                                 </div>
                              </div>
                              <div class="row">
                                 <div class="col-sm-6">
                                    <div class="form-group">
                                       <label class="font-normal">Order Type</label> 
                                       <select class="form-control m-b" name="orderType" id="orderType">
                                          <option value="SO">SO</option>
                                       </select>
                                    </div>
                                 </div>
                                 <div class="col-sm-6">
                                    <div class="form-group">
                                       <label class="font-normal">Delivered To</label> 
                                       <input type="hidden" name="consigneeName" id="consigneeName">
                                       <select class="form-control m-b" name="consigneeId" id="consigneeId"></select>
                                    </div>
                                 </div>
                              </div>
                              <div class="row">
                                 <div class="col-sm-6">
                                    <div class="form-group">
                                       <label class="font-normal">Carrier</label> 
                                       <select class="form-control m-b" name="carrierId" id="carrierId">
                                          <option>GATI KWE</option>
                                       </select>
                                       <input type="hidden" name="carrierType" id="carrierType">
                                    </div>
                                 </div>
                              </div>
                              <div class="row m-t-md">
                                 <div class="col-sm-12">
                                    <div class="head-strip">
                                       <h4>Address Info</h4>
                                    </div>
                                 </div>
                              </div>
                              <div class="row m-t-sm">
                                 <div class="col-sm-6">
                                    <div class="form-group">
                                       <label class="font-normal">Address Line 1</label> 
                                       <input type="text" placeholder="" class="form-control" name="shiptoAddr1" id="shiptoAddr1" readonly="readonly">
                                    </div>
                                 </div>
                                 <div class="col-sm-6">
                                    <div class="form-group">
                                       <label class="font-normal">Address Line 2</label> 
                                       <input type="text" placeholder="" class="form-control" name="shiptoAddr2" id="shiptoAddr2" readonly="readonly">
                                    </div>
                                 </div>
                              </div>
                              <div class="row">
                                 <div class="col-sm-6">
                                    <div class="form-group">
                                       <label class="font-normal">Address Line 3</label> 
                                       <input type="text" placeholder="" class="form-control" name="shiptoAddr3" id="shiptoAddr3" readonly="readonly">
                                    </div>
                                 </div>
                                 <div class="col-sm-6">
                                    <div class="form-group">
                                       <label class="font-normal">City</label> 
                                       <input type="text" placeholder="" class="form-control" name="shiptoCity" id="shiptoCity" readonly="readonly">
                                    </div>
                                 </div>
                              </div>
                              <div class="row">
                                 <div class="col-sm-6">
                                    <div class="form-group">
                                       <label class="font-normal">State</label> 
                                       <select class="form-control m-b" name="shiptoState" id="shiptoState" readonly="readonly">
                                          <option value="AN">Andaman and Nicobar Islands</option>
                                          <option value="AP">Andhra Pradesh</option>
                                          <option value="AD">Andhra Pradesh (New)</option>
                                          <option value="AR">Arunachal Pradesh</option>
                                          <option value="AS">Assam</option>
                                          <option value="BH">Bihar</option>
                                          <option value="CH">Chandigarh</option>
                                          <option value="CT">Chattisgarh</option>
                                          <option value="DN">Dadra and Nagar Haveli</option>
                                          <option value="DD">Daman and Diu</option>
                                          <option value="DL">Delhi</option>
                                          <option value="GA">Goa</option>
                                          <option value="GJ">Gujarat</option>
                                          <option value="HR">Haryana</option>
                                          <option value="HP">Himachal Pradesh</option>
                                          <option value="JK">Jammu and Kashmir</option>
                                          <option value="JH">Jharkhand</option>
                                          <option value="KA">Karnataka</option>
                                          <option value="KL">Kerala</option>
                                          <option value="LD">Lakshadweep Islands</option>
                                          <option value="MP">Madhya Pradesh</option>
                                          <option value="MH">Maharashtra</option>
                                          <option value="MN">Manipur</option>
                                          <option value="ME">Meghalaya</option>
                                          <option value="MI">Mizoram</option>
                                          <option value="NL">Nagaland</option>
                                          <option value="OR">Odisha</option>
                                          <option value="PY">Pondicherry</option>
                                          <option value="PB">Punjab</option>
                                          <option value="RJ">Rajasthan</option>
                                          <option value="SK">Sikkim</option>
                                          <option value="TN">Tamil Nadu</option>
                                          <option value="TS">Telangana</option>
                                          <option value="TR">Tripura</option>
                                          <option value="UP">Uttar Pradesh</option>
                                          <option value="UT">Uttarakhand</option>
                                          <option value="WB">West Bengal</option>
                                       </select>
                                    </div>
                                 </div>
                                 <div class="col-sm-6">
                                    <div class="form-group">
                                       <label class="font-normal">Country</label> 
                                       <select class="form-control m-b" name="shiptoCountry" id="shiptoCountry" readonly="readonly">
                                          <option value="INDIA">INDIA</option>
                                       </select>
                                    </div>
                                 </div>
                              </div>
                              <div class="row">
                                 <div class="col-sm-6">
                                    <div class="form-group">
                                       <label class="font-normal">Zip Code</label> 
                                       <input type="text" placeholder="" class="form-control" name="shiptoZip" id="shiptoZip" readonly="readonly">
                                    </div>
                                 </div>
                              </div>
                              <!-- <div class="row m-t-md">
                                 <div class="col-sm-12">
                                 <div class="head-strip"><h4>Scheduling Info</h4></div>
                                 </div>
                                 </div>
                                 <div class="row m-t-sm">
                                 <div class="col-sm-6">
                                 <div class="form-group" id="data_2">
                                 <label class="font-normal">Requested Arrival Date</label>
                                 <div class="input-group date">
                                 <input type="text" class="form-control" placeholder="DD/MM/YYYY" name="schDate" id="schDate"><span class="input-group-addon"><i class="fa fa-calendar"></i></span>
                                 </div>
                                 </div>
                                 </div>
                                 </div> -->
                              <div class="row m-t-lg">
                                 <div class="col-sm-12">
                                    <div class="table-responsive">
                                       <table class="table table-striped" id="soLines">
                                          <thead class="th-bg">
                                             <tr>
                                                <th>Line #</th>
                                                <th>SKU</th>
                                                <th>Status</th>
                                                <th>Lot/Batch</th>
                                                <th>Quantity Ordered</th>
                                                <th>Pack Code</th>
                                                <th>UOM</th>
                                                <th>Price</th>
                                                <th>Action</th>
                                             </tr>
                                          </thead>
                                          <tbody></tbody>
                                       </table>
                                    </div>
                                 </div>
                              </div>
                              <hr />
                              <div class="row">
                                 <div class="col-sm-12">
                                    <button class="btn btn-primary pull-right m-l-md" type="submit">SAVE</button>
                                    <button class="btn btn-default pull-right" type="reset" id="reset">RESET</button>
                                 </div>
                              </div>
                           </form:form>
                        </div>
                     </div>
                  </div>
               </div>
            </div>
            <textarea style="display: none" rows="" cols="" id="template">
				<tr id="{0}">
					<td>
						<span>{0}</span><input type="hidden" class="form-control input-sm num"  name="lines[{1}].ordlineNo" value="{0}"></td>
					<td>
						<div class="form-group no-margins">
							<select class="form-control input-sm" name="lines[{1}].sku">
								<option value="option 1">option 1</option>
								<option value="option 2">option 2</option>
								<option value="option 3">option 3</option>
								<option value="option 4">option 4</option>
							</select>
						</div>
					</td>
					<td>
						<div class="form-group no-margins">
							<select class="form-control input-sm skuStatus" name="lines[{1}].skuStatus">
								<option value="Good">Good</option>
								<option value="Damaged">Damaged</option>
							</select>
						</div>
					</td>
					<td>
						<div class="form-group no-margins">
							<input type="text" placeholder="" class="form-control input-sm num" name="lines[{1}].batchNo">
						</div>
					</td>
					<td>
						<input type="text" placeholder="" class="form-control input-sm num" name="lines[{1}].ordQty">
					</td>
					<td>
						1<input type="hidden" class="form-control input-sm num" name="lines[{1}].packcode" value="1">
					</td>
					<td>
						<div class="form-group no-margins">
							<select class="form-control input-sm" name="lines[{1}].uomId">
								<option>option 1</option>
								<option>option 2</option>
								<option>option 3</option>
								<option>option 4</option>
							</select>
						</div>
					</td>
					<td>
						<input type="text" placeholder="" class="form-control input-sm num" name="lines[{1}].unitPrice">
					</td>
					<td>
						<a class="inline m-t-sm m-l-xs"><span class="fa fa-plus-circle text-navy addRow"></span></a>
					</td>
				</tr>
			</textarea>
            <div class="modal fade" id="confirm-submit" tabindex="-1"
               role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
               <div class="modal-dialog">
                  <div class="modal-content">
                     <div class="modal-header">
                        <h3>Confirm Submit</h3>
                        Are you sure you want to submit the following details?
                     </div>
                     <div class="modal-body">
                        <table class="borderless npadding table">
                           <tr>
                              <th>Order No :</th>
                              <td id="lordNo"></td>
                              <th>Order Date :</th>
                              <td id="lordDate"></td>
                           </tr>
                           <tr>
                              <th>Order Type :</th>
                              <td id="lorderType"></td>
                              <th>Delivered To :</th>
                              <td id="lconsigneeId"></td>
                           </tr>
                           <tr>
                              <th>Carrier :</th>
                              <td id="lcarrierId"></td>
                              <th></th>
                              <td></td>
                           </tr>
                           <tr>
                              <td style="background-color: aliceblue;" colspan="4">Address
                                 Info
                              </td>
                           </tr>
                           <tr>
                              <th>Address Line 1 :</th>
                              <td id="lshiptoAddr1"></td>
                              <th>Address Line 2 :</th>
                              <td id="lshiptoAddr2"></td>
                           </tr>
                           <tr>
                              <th>Address Line 3 :</th>
                              <td id="lshiptoAddr3"></td>
                              <th>City :</th>
                              <td id="lshiptoCity"></td>
                           </tr>
                           <tr>
                              <th>State :</th>
                              <td id="lshiptoState"></td>
                              <th>Country :</th>
                              <td id="lshiptoCountry"></td>
                           </tr>
                           <tr>
                              <th>Zip Code :</th>
                              <td id="lshiptoZip"></td>
                              <th></th>
                              <td></td>
                           </tr>
                        </table>
                        <table class="table table-condensed borderless">
                           <thead>
                           	<tr>
                              <th>Line #</th>
                              <th>SKU</th>
                              <th>Status</th>
                              <th>Lot/Batch</th>
                              <th>Quantity Ordered</th>
                              <th>Pack Code</th>
                              <th>UOM</th>
                              <th>Price</th>
                             <tr>
                           </thead>
                           <tbody id="llines"></tbody>
                        </table>
                     </div>
                     <div class="modal-footer">
                        <button type="button" class="btn btn-default"
                           data-dismiss="modal">Cancel</button>
                        <a href="#" id="submit" class="btn btn-success success">Submit</a>
                     </div>
                  </div>
               </div>
            </div>
            <div class="footer">
               <div class="pull-right">
                  Version <strong>1.0</strong>
               </div>
               <div>
                  &copy; Copyright 2017-2018.<strong>&nbsp;&nbsp;Gati Kausar
                  India</strong>
               </div>
            </div>
            <div class="modal fade bs-example-modal-lg" data-backdrop="static"
               data-keyboard="false" tabindex="-1" role="dialog"
               id="mySoListModalLabel">
               <div class="modal-dialog modal-lg">
                  <div class="modal-content">
                     <div id="custom-search-input" style="padding: 40px;">
                        <div class="input-group col-md-12">
                           <input id="selectSoNo" type="text" name="selectSoNo"
                              class="form-control input-lg" placeholder="Select" /> <span
                              class="input-group-btn">
                           <button class="btn btn-info btn-lg" type="button"
                              id="selectSoNoBtn">Select
                           </button>
                           </span>
                        </div>
                        <table class="table table-fixed">
                           <thead>
                              <tr>
                                 <th>Ord No</th>
                                 <th>Ord Date</th>
                              </tr>
                           </thead>
                           <tbody id="soNoListRow">
                           </tbody>
                        </table>
                     </div>
                  </div>
               </div>
            </div>
         </div>
      </div>
      <!-- Mainly scripts -->
      <script src="${url}resources/js/jquery-3.1.1.min.js"></script>
      <script src="${url}resources/js/bootstrap.min.js"></script>
      <script src="${url}resources/js/plugins/metisMenu/jquery.metisMenu.js"></script>
      <script src="${url}resources/js/plugins/slimscroll/jquery.slimscroll.min.js"></script>
      <!-- Custom and plugin javascript -->
      <script src="${url}resources/js/inspinia.js"></script>
      <script src="${url}resources/js/plugins/pace/pace.min.js"></script>
      <!-- jQuery UI -->
      <script src="${url}resources/js/plugins/jquery-ui/jquery-ui.min.js"></script>
      <!-- Jvectormap -->
      <script
         src="${url}resources/js/plugins/jvectormap/jquery-jvectormap-2.0.2.min.js"></script>
      <script
         src="${url}resources/js/plugins/jvectormap/jquery-jvectormap-world-mill-en.js"></script>
      <!-- EayPIE -->
      <script
         src="${url}resources/js/plugins/easypiechart/jquery.easypiechart.js"></script>
      <!-- Sparkline -->
      <script
         src="${url}resources/js/plugins/sparkline/jquery.sparkline.min.js"></script>
      <!-- Sparkline demo data  -->
      <script src="${url}resources/js/demo/sparkline-demo.js"></script>
      <!-- Data picker -->
      <script
         src="${url}resources/js/plugins/datapicker/bootstrap-datepicker.js"></script>
      <script
         src="${url}resources/js/plugins/validate/jquery.validate.min.js"></script>
      <!-- Toastr -->
      <script src="${url}resources/js/plugins/toastr/toastr.min.js"></script>
      <!-- Select2 -->
      <script src="${url}resources/js/plugins/select2/select2.full.min.js"></script>
      <!-- Sweet alert -->
      <script src="${url}resources/js/plugins/sweetalert/sweetalert.min.js"></script>
      <!-- Ladda -->
      <script src="${url}resources/js/plugins/ladda/spin.min.js"></script>
      <script src="${url}resources/js/plugins/ladda/ladda.min.js"></script>
      <script src="${url}resources/js/plugins/ladda/ladda.jquery.min.js"></script>
      <c:if test="${success}">
         <script>
            $(document).ready(function() {
            	swal({
	                    title: "Submitted Successfully",
	                    text: "Your information has been submitted successfully."
	                });
	            /*setTimeout(function() {
		            toastr.options = {
			            closeButton : true,
			            progressBar : true,
			            showMethod : 'slideDown',
			            timeOut : 4000
		            };
         		toastr.success('So Form ', 'Data Submitted Successfully');       
         	}, 1300);  */
            });
         </script>
      </c:if>
      <script>
         var serverContext = "${url}";
         $(document).ready(function() {
        	 
        	 
        	 
         	$('#consigneeId').select2({
		         placeholder : "Search for an Item",
		         minimumInputLength : 2,
		         ajax : {
		         	url : serverContext+ 'getConsigneeList',
		         	dataType : 'json',
		         	delay : 250,
		         	data : function(params) {
		         		return {
		         		query : params.term
		         		};
	         		},
	         		processResults : function(data) {
         				var items = [];
         				$.each(data,function(i, obj) {
         					obj.id = obj.consigneeId;
         					obj.text = obj.consigneeName
         					items.push(obj);
         				});
         			return {results : items};
         			},
         		},
        	 templateResult : function(item) {
         		console.log("templateResult:"+ item);
         		if (item.loading)
         			return item.consigneeName;
         		var $html = $('<span>' + $.trim(item.consigneeName) + '(' + $.trim(item.consigneeId) + ')</span>');
         		return $html;
         	},
         	templateSelection : function(item) {
         		if (item.consigneeName != undefined) {
	         		 $('#consigneeName').val($.trim(item.consigneeName));
			         $('#shiptoAddr1').val($.trim(item.addr1));
			         $('#shiptoAddr2').val($.trim(item.addr2));
			         $('#shiptoAddr3').val($.trim(item.addr3));
			         $('#shiptoCity').val($.trim(item.city));
			         $('#shiptoState').val($.trim(item.state));
			         $('#shiptoCountry').val($.trim(item.country));
			         $('#shiptoZip').val($.trim(item.zipcode));         
	         		toggleAddress(true);
	        		return $.trim(item.consigneeName) + '(' + $.trim(item.consigneeId) + ')';
        		} 
         		return;         
         },
         escapeMarkup : function(markup) {
         	return markup;
         	},
         });
         
         	function toggleAddress(flag) {

         	    $('#shiptoAddr1').attr('readonly', flag);
         	    $('#shiptoAddr2').attr('readonly', flag);
         	    $('#shiptoAddr3').attr('readonly', flag);
         	    $('#shiptoCity').attr('readonly', flag);
         	    $('#shiptoState').attr('readonly', flag);
         	    $('#shiptoCountry').attr('readonly', flag);
         	    $('#shiptoZip').attr('readonly', flag);

         	    if (!flag) {
         	        $('#shiptoAddr1').val('');
         	        $('#shiptoAddr2').val('');
         	        $('#shiptoAddr3').val('');
         	        $('#shiptoCity').val('');
         	        $('#shiptoState').val('');
         	        $('#shiptoCountry').val('');
         	        $('#shiptoZip').val('');
         	    }
         	}

         	$('#data_5 .input-daterange').datepicker({
         	    keyboardNavigation: false,
         	    forceParse: false,
         	    format: "dd/mm/yyyy",
         	    autoclose: true,
         	});

         	$('#data_1 .input-group.date').datepicker({
         	    todayBtn: "linked",
         	    format: "dd/mm/yyyy",
         	    keyboardNavigation: false,
         	    forceParse: false,
         	    autoclose: true,
         	});

         	$('#data_2 .input-group.date').datepicker({
         	    todayBtn: "linked",
         	    format: "dd/mm/yyyy",
         	    keyboardNavigation: false,
         	    forceParse: false,
         	    autoclose: true,
         	});

         	$("#so-form").validate({
         	    rules: {
         	        ordNo: "required",
         	        ordDate: "required",
         	        orderType: "required",
         	        consigneeId: "required",
         	        carrierId: "required",
         	    },
         	    messages: {
         	        ordNo: "Please Enter Order No",
         	        ordDate: "Please Select Order Date",
         	        orderType: "Please Enter Order Type",
         	        consigneeId: "Please Select Delivery to",
         	        carrierId: "Please Select Carrier",
         	    },
         	    submitHandler: function(form) {
         	        form.submit();
         	        /*setlable();
         	        $("#confirm-submit").modal('show');        	        
         	        $('#submit').click(function () {
         	        form.submit();
         	        });*/
         	    }
         	});

         	var template = jQuery.validator.format($.trim($('#template').val()));
         	var lineNo = 0;

         	function addRowInTable() {
         	    if (lineNo != 0)
         	        $('#soLines tr:last td:last .fa-plus-circle')
         	        .removeClass('fa-plus-circle')
         	        .removeClass('addRow')
         	        .addClass('fa-minus-circle')
         	        .addClass('removeRow');
         	    $(template(lineNo + 1, lineNo++)).appendTo("#soLines tbody");
         	    $("#soLines :input[name^='lines']").each(function() {
         	    	if($(this).hasClass("num")){
						$(this).rules('add', { required: true, number: true });
					}else{
						$(this).rules('add', { required: true });
					}
         	     });
         	}
         	$('#soLines tbody').on('click', '.addRow', function() {
         	        addRowInTable();
         	});

         	$('#soLines tbody').on( 'click', '.removeRow', function() {
   	            var tr = $(this).parent().parent().parent();
   	            $(tr).nextAll().each( function() {
                      var nid = 0;
                      $(this).prop('id', function( index, idvalue) {
                            lineNo = idvalue - 1;
                            return lineNo;
                        });
                      nid = lineNo - 1;
                      $(this).find(':input').attr( 'name', function(_, name) {
                            return name.replace('lines[' + lineNo + ']', 'lines[' + nid + ']')
                        });
                      $(this).find('td:first span:first').html(lineNo);
                      $(this).find('td:first input:first').val(lineNo);
                  });
   	            $(tr).remove();
   	        });
         	addRowInTable();
         	var find_so = $('#find_so').ladda();
         	find_so.click(function(e) {
         		   var so_no = $('#so_no').val();
         		   if(so_no==''){
         			   alert("Fill So Number");
         			   return;
         		   }
         	       find_so.ladda('start');
         	        $.ajax({
         	            url: serverContext + 'getSoDetails',
         	            method: 'post',
         	            data:{so_no : so_no},
         	            headers: {
         	                Accept: "application/json"
         	            },
         	            success: function(data) {
         	                fillform(data);
         	                find_so.ladda('stop');
         	            },
         	            error: function() {
         	                alert("So Details Not Found");
         	                clearform();
         	                find_so.ladda('stop');
         	            }
         	        })
         	    });

         	function fillform(o) {
         	    clearform();
         	    $('#ordNo').val(o.ordNo);
         	    $('#noLines').val(o.noLines);
         	    $('#data_1 .input-group.date').datepicker('setDate', new Date(o.ordDate));
         	    $('#orderType').val(o.orderType);

         	    $('#consigneeId').html($('<option>', {
         	        value: o.consigneeId,
         	        text: o.consigneeName
         	    }));
         	    $('#consigneeId').val(o.consigneeId).trigger("change");
         	    $('#select2-consigneeId-container').html(o.consigneeName);

         	    $('#consigneeId').val(o.consigneeId);
         	    $('#carrierId').val(o.carrierId);
         	    $('#shiptoAddr1').val(o.shiptoAddr1);
         	    $('#shiptoAddr2').val(o.shiptoAddr2);
         	    $('#shiptoAddr3').val(o.shiptoAddr3);
         	    $('#shiptoCity').val(o.shiptoCity);
         	    $('#shiptoCountry').val(o.shiptoCountry);
         	    $('#shiptoState').val(o.shiptoState);
         	    $('#shiptoZip').val(o.shiptoZip);
         	    $.each(o.line,function(i, val) {
       	            if (i != 0) {
       	                addRowInTable();
       	            }
       	            $("input[name~='lines[" + i + "].ordlineNo']").val(val.ordlineNo);
       	            $("input[name~='lines[" + i + "].sku']").val(val.sku);
       	            $("input[name~='lines[" + i + "].skuStatus']").val(val.skuStatus);
       	            $("input[name~='lines[" + i + "].batchNo']").val(val.batchNo);
       	            $("input[name~='lines[" + i + "].ordQty']").val(val.ordQty);
       	            $("input[name~='lines[" + i + "].packcode']").val(val.packcode);
       	            $("input[name~='lines[" + i + "].uomId']").val(val.uomId);
       	            $("input[name~='lines[" + i + "].unitPrice']").val(val.unitPrice);
       	        });
         	}
         	$('#reset').click(function(){
        		clearform();
        	});
         	function clearform() {
         	    $('#ordNo').val('');
         	    $('#noLines').val('');
         	    $('#ordDate').val('');
         	    $('#orderType').val('');
         	    $('#consigneeId').val('');
         	    $('#carrierId').val('');
         	    $('#shiptoAddr1').val('');
         	    $('#shiptoAddr2').val('');
         	    $('#shiptoAddr3').val('');
         	    $('#shiptoCity').val('');
         	    $('#shiptoCountry').val('');
         	    $('#shiptoState').val('');
         	    $('#shiptoZip').val('');
         	    $('#soLines tbody').html('');
         	    lineNo = 0;
         	    addRowInTable();
         	}

         	function setlable() {
         	    $('#lordNo').html($('#ordNo').val());
         	    $('#lordDate').html($('#ordDate').val());
         	    $('#lorderType').html($('#orderType option:selected').text());
         	    $('#lconsigneeId').html($('#consigneeId').val());
         	    $('#lcarrierId').html($('#carrierId option:selected').text());
         	    $('#lshiptoAddr1').html($('#shiptoAddr1').val());
         	    $('#lshiptoAddr2').html($('#shiptoAddr2').val());
         	    $('#lshiptoAddr3').html($('#shiptoAddr3').val());
         	    $('#lshiptoCity').html($('#shiptoCity').val());
         	    $('#lshiptoCountry').html($('#shiptoCountry option:selected').text());
         	    $('#lshiptoState').html($('#shiptoState option:selected').text());
         	    $('#lshiptoZip').html($('#shiptoZip').val());
         	    $('#llines').html('');

         	    $('#soLines tbody tr').each(function(index) {
         	                var ctr = $(this);
         	                $('#llines').append('<tr><td>' + $(ctr).find("[name$='ordlineNo']").val() + '</td>' 
         	                		+ '<td>' + $(ctr).find("[name$='sku'] option:selected").text() + '</td>' 
         	                		+ '<td>' + $(ctr).find("[name$='.skuStatus'] option:selected").text() + '</td>' 
         	                		+ '<td>' + $(ctr).find("[name$='.batchNo']").val() + '</td>'
         	                		+ '<td>' + $(ctr).find("[name$='.ordQty']").val() + '</td>' 
         	                		+ '<td>' + $(ctr).find("[name$='.packcode']").val() + '</td>' 
         	                		+ '<td>' + $(ctr).find("[name$='.uomId'] option:selected").text() + '</td>' 
         	                		+ '<td>' + $(ctr).find("[name$='.unitPrice']").val() + '</td></tr>');
         	            });
         	}

         	$('#soLines').on('change','.skuStatus',function() {
  	            if ($(this).find('option:selected').text() == 'Damaged') {
  	                swal({
  	                    title: "Sku Status Change",
  	                    text: "You Have Selected Damaged Status"
  	                });
  	            }
  	        });

         	function strDate(date) {
         	    var dd = date.getDate();
         	    var mm = date.getMonth() + 1; //January is 0!
         	    var yyyy = date.getFullYear();
         	    if (dd < 10) {
         	        dd = '0' + dd;
         	    }
         	    if (mm < 10) {
         	        mm = '0' + mm;
         	    }
         	    return dd + '/' + mm + '/' + yyyy;
         	}

         	/* var $so_noselect2 = $("#so_no").select2({
         	        tags: true,
         	        createTag: function(params) {
         	            return {
         	                id: params.term,
         	                text: params.term,
         	                newOption: true
         	            }
         	        },
         	        escapeMarkup: function(markup) {
         	            return markup;
         	        },
         	        templateResult: function(data) {

         	            if (data.text === data.id) {
         	                return data.id;
         	            }
         	            return data.id + '<span style="float:right;">' + data.text + '</span>';
         	        },
         	        templateSelection: function(data) {
         	            return data.id;
         	        }
         	    }); */
         	var find_sono = $('#find_sono').ladda();
         	    find_sono.click(function() {
 	            var fromDate = $("#fromDate").val();
 	            var toDate = $("#toDate").val();
 	            find_sono.ladda('start');
 	            	$.ajax({
 	                    url: serverContext + 'getSoNoList',
 	                    method: 'post',
 	                    data: {
 	                        fromDate: fromDate,
 	                        toDate: toDate
 	                    },
 	                    headers: {
 	                        Accept: "application/json"
 	                    },
 	                    success: function(data) {
 	                        $('#soNoListRow').html('');
 	                        $.each(data,function(key,value) {
                                var d = strDate(new Date(value.ordDate));
                                $('#soNoListRow').append('<tr><td>' + value.ordNo + '</td><td>' + d + '</td></tr>');
                            });
 	                        find_sono.ladda('stop');
 	                        $("#mySoListModalLabel").modal('show');
 	                        /* $('#so_no').empty();
 	                        $.each( data, function( key, value ) {        					
 	                        var d = strDate(new Date(value.ordDate));        					
 	                        $('#so_no').append('<option value="' + value.ordNo + '">' + d + '</option>');        					
 	                        });
 	                        $("#so_no").trigger('change.select2'); 
 	                        $so_noselect2.select2("open");  */
 	                    },
 	                    error: function() {
 	                    	find_sono.ladda('stop');
 	                        alert("So No Not Found");
 	                       
 	                    }
 	                });
   	        });

         	$('#soNoListRow').on('click','tr',function() {
   	            $('#selectSoNo').val($(this).find("td:first").text());
   	            $('#soNoListRow').find('tr').removeClass('highlighted');
   	            $(this).addClass('highlighted');
   	        });
         	$('#selectSoNoBtn').click(function() {
         	    $("#mySoListModalLabel").modal('hide');
         	    $('#so_no').val($('#selectSoNo').val());
         	});
         });
      </script>
   </body>
</html>