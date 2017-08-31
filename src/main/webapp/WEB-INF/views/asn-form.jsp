<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
    <head>
        <c:url var="url" value="/" scope="request" />
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>GATI KAUSAR - ASN Form</title>
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
         #poNoListRow tr:hover {
         	background-color: #ccc;
         }
         #poNoListRow .highlighted {
         	background-color: #ccc;
         }
         #poNoListRow td:hover {
         	cursor: pointer;
         }
         
         #poNoListRow .highlighted {
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
                            <img alt="image" class="img-responsive big-logo" src="${url}resources/img/logo.png" />
                            <div class="logo-element">
                                <img alt="image" class="img-responsive center-block" src="${url}resources/img/gati-small.png" />
                            </div>
                        </li>
                        <li class="bg-blue">
                            <a class="text-center" href="${url}dashboard" data-toggle="tooltip" data-placement="top" title="Dashboard"><i class="fa fa-3x fa-th-large"></i> <span class="nav-label block m-t-sm">Dashboard</span></a>
                        </li>
                        <li class="bg-blue">
                            <a class="text-center" href="${url}tracking" data-toggle="tooltip" data-placement="top" title="Track Your Product"><i class="fa fa-3x fa-compass"></i> <span class="nav-label block m-t-sm">Track Your Product</span></a>
                        </li>
                        <li class="bg-blue">
                            <a class="text-center" href="${url}globalinventory" data-toggle="tooltip" data-placement="top" title="Global Inventory"><i class="fa fa-3x fa-braille"></i> <span class="nav-label block m-t-sm">Global Inventory</span></a>
                        </li>
                        <li class="bg-blue active">
                            <a class="text-center" href="#"><i class="fa fa-3x fa-reorder"></i> <span class="nav-label block m-t-sm">Raise Order Request</span></a>
                            <ul class="nav nav-second-level collapse">
                            	<li class="active"><a href="${url}asn-master">Inbound</a></li>
                            	<li><a href="${url}so-master">Outbound</a></li>
                            </ul>
                        </li>
                    </ul>
                </div>
            </nav>
            <div id="page-wrapper" class="blue-bg-light">
                <div class="row border-bottom">
                    <nav class="navbar navbar-static-top white-bg" role="navigation" style="margin-bottom: 0">
                        <div class="navbar-header">
                            <a class="navbar-minimalize minimalize-styl-2 btn btn-link " href="#"><i class="fa fa-bars text-white"></i> </a>
                        </div>
                        <ul class="nav navbar-top-links navbar-right">
                            <li class="dropdown">
                                <a class="dropdown-toggle count-info" data-toggle="dropdown" href="#">
                                    <i class="fa fa-bell-o"></i>  <span class="label label-danger">8</span>
                                </a>
                                <ul class="dropdown-menu dropdown-alerts">
                                    <li>
                                        <a href="mailbox.html">
                                            <div>
                                                <i class="fa fa-envelope fa-fw"></i> You have 16 messages
                                                <span class="pull-right text-muted small">4 minutes ago</span>
                                            </div>
                                        </a>
                                    </li>
                                    <li class="divider"></li>
                                    <li>
                                        <a href="profile.html">
                                            <div>
                                                <i class="fa fa-twitter fa-fw"></i> 3 New Followers
                                                <span class="pull-right text-muted small">12 minutes ago</span>
                                            </div>
                                        </a>
                                    </li>
                                    <li class="divider"></li>
                                    <li>
                                        <a href="grid_options.html">
                                            <div>
                                                <i class="fa fa-upload fa-fw"></i> Server Rebooted
                                                <span class="pull-right text-muted small">4 minutes ago</span>
                                            </div>
                                        </a>
                                    </li>
                                    <li class="divider"></li>
                                    <li>
                                        <div class="text-center link-block">
                                            <a href="notifications.html">
                                                <strong>See All Alerts</strong>
                                                <i class="fa fa-angle-right"></i>
                                            </a>
                                        </div>
                                    </li>
                                </ul>
                            </li>
                            <li>
                                <a href="#">
                                    <i class="fa fa-gear"></i>
                                </a>
                            </li>
                            <li>
                                <a href="${url}logout">
                                    <i class="fa fa-sign-out"></i>
                                </a>
                            </li>
                        </ul>

                    </nav>
                </div>
                <div class="row wrapper page-heading">
                    <div class="col-xs-8">
                        <h3>Inbound</h3>
                    </div>
                    <div class="col-xs-4">
                        <a class="pull-right m-t-xs text-info" href="#"><span class="fa fa-home"></span></a>
                    </div>
                </div>
                <div class="wrapper wrapper-content">
                    <div class="row">
                        <div class="col-sm-3">
                            <div class="form-group no-margins" id="data_5">
                                <label class="font-normal">Select Date</label>
                                <div class="input-daterange input-group" id="datepicker">
                                    <input type="text" class="input-sm form-control" name="start" id="fromDate" placeholder="DD/MM/YYYY"/>
                                    <span class="input-group-addon">to</span>
                                    <input type="text" class="input-sm form-control" name="end" id="toDate" placeholder="DD/MM/YYYY" />
                                </div>
                            </div>
                        </div>
                        <div class="col-sm-1">
                            <button class="ladda-button find_pono btn btn-sm btn-primary m-t-md " id="find_pono" data-style="zoom-in">Load List</button>
                        </div>
                        <div class="col-sm-3">
                            <div class="form-group no-margins">
                                <label class="font-normal">ASN / Invoice Number</label>
                                <input class="form-control input-sm" id="po_no" name="po_no">
                                <!-- <select class="form-control input-sm" id="po_no" name="po_no"></select> -->
                            </div>
                        </div>
                        <div class="col-sm-1">
                            <button class="ladda-button btn btn-sm btn-primary m-t-md" id="find_po" data-style="zoom-in">Show</button>
                        </div>
                    </div>
                    <hr/>
                    <div class="row">
                        <div class="col-sm-12">
                            <div class="ibox">
                                <div class="ibox-content">
                                	
                                    <form:form role="form" id="po-form" method="POST" modelAttribute="poHead">
                                        <div class="row">
                                            <div class="col-sm-6">
                                                <div class="form-group">
                                                    <label class="font-normal">ASN / Invoice No.</label>
                                                    <input type="text" placeholder="" class="form-control" name="poNo" id="poNo">
                                                </div>
                                            </div>
                                            <div class="col-sm-6">
                                                <div class="form-group">
                                                     <div class="form-group" id="data_1">
                                                    <label class="font-normal">ASN Date</label>
                                                    <div class="input-group date">
                                                        <input type="text" class="form-control" placeholder="DD/MM/YYYY" name="poDate" id="poDate"><span class="input-group-addon"><i class="fa fa-calendar"></i></span>
                                                    </div>
                                                </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="row">
                                            <div class="col-sm-6">
                                                <div class="form-group">
                                                    <label class="font-normal">Maufacturing Unit</label>
                                                    <select class="form-control m-b" name="suppName" id="suppName">
                                                    </select>
                                                </div>
                                            </div>
                                        </div>
                                        <!-- <div class="row m-t-md">
                                            <div class="col-sm-12">
                                                <div class="head-strip"><h4>Schedule</h4></div>
                                            </div>
                                        </div>
                                        <div class="row m-t-sm">
                                            <div class="col-sm-6">
                                                <div class="form-group" id="data_2">
                                                    <label class="font-normal">Scheduled Arrival Date</label>
                                                    <div class="input-group date">
                                                        <input type="text" class="form-control" placeholder="DD/MM/YYYY" name="schArrivalDate" id="schArrivalDate"><span class="input-group-addon"><i class="fa fa-calendar"></i></span>
                                                    </div>
                                                </div>
                                            </div>
                                        </div> -->
	                                    <div class="row m-t-lg">
	                                        <div class="col-sm-12">
	                                            <div class="table-responsive">
	                                                <table class="table table-striped" id="polines">
	                                                    <thead class="th-bg">
	                                                        <tr>
	                                                            <th>Line #</th>
	                                                            <th>SKU</th>
	                                                            <th>Status</th>
	                                                            <th>Lot/Batch</th>
	                                                            <th>Quantity Ordered</th>
	                                                            <th>Pack Code</th>
	                                                            <th>UOM</th>
	                                                            <th>Unit Cost</th>
	                                                            <th>Action</th>
	                                                        </tr>
	                                                    </thead>
	                                                    <tbody>	                                                                                                                
	                                                    </tbody>
	                                                </table>
	                                            </div>
	                                        </div>
	                                    </div>
	                                    <hr/>
	                                    <div class="row">
	                                        <div class="col-sm-12">
	                                            <button class="btn btn-primary pull-right m-l-md" type="submit" name="save" id="save">SAVE</button>
	                                            <button class="btn btn-default pull-right" type="reset" name="reset" id="reset">RESET</button>
	                                        </div>
	                                    </div>
	                                </form:form>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <textarea style="display:none" id="template">
                	<tr id="{0}">
                        <td><span>{0}</span><input type="hidden" placeholder="" class="form-control input-sm num" name="lines[{1}].lineNo" value="{0}"></td>
                        <td>
                            <div class="form-group no-margins">
                                <select class="form-control input-sm" name="lines[{1}].sku" >
                                    <option>option 1</option>
                                    <option>option 2</option>
                                    <option>option 3</option>
                                    <option>option 4</option>
                                </select>
                            </div>
                        </td>
                        <td>
                            <div class="form-group no-margins">
                                <select class="form-control input-sm skuStatus" name="lines[{1}].skuStatus">
                                    <option value="Good" >Good</option>
	                                <option value="Damaged" >Damaged</option>
                                </select>
                            </div>
                        </td>
                        <td>
                            <div class="form-group no-margins">
                                <input type="text" placeholder="" class="form-control input-sm num" name="lines[{1}].batchNo">
                            </div>
                        </td>
                        <td>
                            <input type="text" placeholder="" class="form-control input-sm num" name="lines[{1}].ordQty" >
                        </td>
                        <td>
                            1<input type="hidden" placeholder="" class="form-control input-sm num" name="lines[{1}].packcode"  value="1">
                        </td>
                        <td>
                            <div class="form-group no-margins">
                                <select class="form-control input-sm" name="lines[{1}].uomId" >
                                    <option value="KG">KG</option>
                                    <option value="LE">LE</option>
                                </select>
                            </div>
                        </td>
                        <td><input type="text" placeholder="" class="form-control input-sm num" name="lines[{1}].unitCost" ></td>
                        <td>
                            <a  class="inline m-t-sm m-l-xs"><span class="fa fa-plus-circle text-navy addRow"></span></a>
                        </td>
                    </tr> 
                </textarea>
                <div class="modal fade" id="confirm-submit" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
				    <div class="modal-dialog">
				        <div class="modal-content">
				            <div class="modal-header">
				                <h3>Confirm Submit</h3>
				                Are you sure you want to submit the following details?
				            </div>
				            <div class="modal-body">
				                <table class="borderless npadding table">
				                    <tr>
				                        <th>Asn No :</th><td id="lpoNo"></td>
				                        <th>Asn Date :</th><td id="lpoDate"></td>
				                    </tr>
				                    <tr>
				                        <th>Manifacturing Type :</th><td id="lsuppName"></td>
				                        <th></th><td></td>
				                    <tr>
				                        <td colspan="4" style="background-color: aliceblue;"> Schedule Info</td>
				                    </tr>
				                    <tr>
				                        <th>Scheduled Arrival Date:</th><td id="lschArrivalDate"></td>
				                        <th></th><td></td>			                        
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
                                           	<th>Unit Cost</th>
                                           </tr>
			                        </thead>
			                        <tbody id="llines">				                        	
			                        </tbody>
				                </table>
				            </div>
				            <div class="modal-footer">
				                <button type="button" class="btn btn-default" data-dismiss="modal">Cancel</button>
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
                        &copy; Copyright 2017-2018.<strong>&nbsp;&nbsp;Gati Kausar India</strong>  
                    </div>
                </div>
            </div>
        </div>
        <div class="modal fade bs-example-modal-lg" data-backdrop="static"
               data-keyboard="false" tabindex="-1" role="dialog"
               id="myPoListModalLabel">
               <div class="modal-dialog modal-lg">
                  <div class="modal-content">
                     <div id="custom-search-input" style="padding: 40px;">
                        <div class="input-group col-md-12">
                           <input id="selectPoNo" type="text" name="selectPoNo"
                              class="form-control input-lg" placeholder="Select" /> <span
                              class="input-group-btn">
                           <button class="btn btn-info btn-lg" type="button"
                              id="selectPoNoBtn">Select</button>
                           </span>
                        </div>
                        <table class="table table-fixed">
                           <thead>
                              <tr>
                                 <th>Asn No</th>
                                 <th>Asn Date</th>
                              </tr>
                           </thead>
                           <tbody id="poNoListRow">
                           </tbody>
                        </table>
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
	      <!-- Data picker -->
	      <script src="${url}resources/js/plugins/datapicker/bootstrap-datepicker.js"></script>
	      <script src="${url}resources/js/plugins/validate/jquery.validate.min.js"></script>
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
            });
         </script>
         </c:if>
        <script>
        var serverContext = "${url}";
            $(document).ready(function () {           	
            	
            
                $('#data_5 .input-daterange').datepicker({
                    keyboardNavigation: false,
                    forceParse: false,
                    format: "dd/mm/yyyy",
                    autoclose: true
                });

                $('#data_1 .input-group.date').datepicker({
                    todayBtn: "linked",
                    keyboardNavigation: false,
                    forceParse: false,
                    format: "dd/mm/yyyy",
                    autoclose: true
                });

                $('#data_2 .input-group.date').datepicker({
                    todayBtn: "linked",
                    keyboardNavigation: false,
                    forceParse: false,
                    format: "dd/mm/yyyy",
                    autoclose: true
                });

                $('#data_3 .input-group.date').datepicker({
                    todayBtn: "linked",
                    keyboardNavigation: false,
                    forceParse: false,
                    format: "dd/mm/yyyy",
                    autoclose: true
                });

                $('#data_4 .input-group.date').datepicker({
                    todayBtn: "linked",
                    keyboardNavigation: false,
                    forceParse: false,
                    format: "dd/mm/yyyy",
                    autoclose: true
                });
        	
        	$("#po-form").validate({
        	    rules: {
        	    	poNo: "required",
        	    	poDate: "required",
        	    	suppName: "required",
        	    },
        	    messages: {
        	    	poNo: "Please enter ASN No",
        	    	poDate: "Please Select ASN Date",
        	    	suppName: "Please Select Maufacturing Unit",
        	    },
        	    submitHandler: function (form) {
        	    	form.submit();
        	    	/* setlable();
        	        $("#confirm-submit").modal('show');        	        
        			$('#submit').click(function () {
        	            form.submit();
        	       }); */
        	    }
        	}); 
        	
        	var template = jQuery.validator.format($.trim($("#template").val()));
			var lineNo=0;
			
        	function addRowInTable() {
        		$('#polines tr:last td:last .fa-plus-circle').removeClass('fa-plus-circle').removeClass('addRow').addClass('fa-minus-circle').addClass('removeRow');
				$(template(lineNo+1,lineNo++)).appendTo("#polines tbody"); 
				$("#polines :input[name^='lines']").each(function () {
					if($(this).hasClass("num")){
						$(this).rules('add', { required: true, number: true });
					}else{
						$(this).rules('add', { required: true });
					}				
			    });
    		}
        	$('#polines tbody').on('click', '.addRow', function(){
        		addRowInTable();
        	});
            
        	$('#polines tbody').on('click', '.removeRow', function(){        		
        		var tr = $(this).parent().parent().parent();        		
        		$(tr).nextAll().each(function () {
        			var nid=0;
        	        $(this).prop("id", function (index, idvalue) {
        	        	lineNo = idvalue - 1;
        	        	return lineNo;
        	        });
        	        nid = lineNo-1;
        	        $(this).find(":input").attr('name',function (_, name) {        	        	
        	        	return name.replace('lines['+lineNo+']', 'lines['+nid+']')
        	        });
        	        $(this).find("td:first span:first").html(lineNo);
        	        $(this).find("td:first input:first").val(lineNo);
        	    });
	        	$(tr).remove();
	        });
        	
        	addRowInTable();
        	var find_po = $('#find_po').ladda();
        	find_po.click(function(e){
        		var po_no = $('#po_no').val();
        		find_po.ladda('start');
        		$.ajax({
        			url:serverContext+'getPoDetails',
        			method:'post',
        			data:{po_no:po_no},
        			headers : {
						Accept : "application/json"
					},
        			success:function(data){
        				fillform(data);
        				find_po.ladda('stop');
        			},
					error : function() {
						find_po.ladda('stop');
						alert("Po Details Not Found");
						clearform();
					}
        		})
        	});
        	
        	var $suppName = $('#suppName').select2({
        		placeholder: "Search for an Supplier Name",
        	    minimumInputLength: 2,
        	  ajax: {          			  
      		    url: serverContext+'getSupplierList',
      		  	dataType: 'json',
      		  	delay: 250,
      	    	data: function (params) {
      	      		return {
      	        		query: params.term
      	      		};
      	    	},
      	    	processResults: function (data) {
      	    		var items = [];
      	    		$.each(data, function (i,obj) {
      	    			obj.id = obj.suppName;
      	    			obj.text = obj.suppName
      	    			items.push(obj);
      	    		});
                    return {results: items};
                },
      		  },       			
      	  	templateResult: function(item){
      			console.log("templateResult:"+JSON.stringify(item));
      			if (item.loading) return item.consigneeName;
      			var $html = $('<span>'+ $.trim(item.suppName) + '</span>'); 
      			return $html;
      		  },
      		templateSelection: function(item){
      			if(item.suppName != undefined){
      				return $.trim(item.suppName);      				
      			}
      			return;      			
      		  },
      		escapeMarkup: function (markup) { return markup; },
      		});
        	
        	
        	function fillform(o){ 
        		clearform();
        		$('#poNo').val(o.poNo);
        		
        		$('#data_1 .input-group.date').datepicker('setDate', new Date(o.poDate));
        		
        		$('#suppName').html($('<option>', {value: o.suppName,text: o.suppName}));
        		$('#suppName').val(o.suppName).trigger("change");
        		$('#select2-suppName-container').html(o.suppName);
        		$.each( o.lines, function( i, val ) {
        			console.log(JSON.stringify(val));
        			if(i!=0){
        				console.log("hi");
        				addRowInTable();
        			}
					  $("input[name~='lines["+i+"].lineNo']").val(val.lineNo);
					  $("input[name~='lines["+i+"].sku']").val(val.sku);
					  $("input[name~='lines["+i+"].skuStatus']").val(val.skuStatus);
					  $("input[name~='lines["+i+"].batchNo']").val(val.batchNo);
					  $("input[name~='lines["+i+"].ordQty']").val(val.ordQty);
					  $("input[name~='lines["+i+"].packcode']").val(val.packcode);
					  $("input[name~='lines["+i+"].uomId']").val(val.uomId);
					  $("input[name~='lines["+i+"].unitCost']").val(val.unitCost);
        		});
        	} 
        	
        	$('#reset').click(function(){
        		clearform();
        	});
        	
        	function clearform(){ 
        		$('#poNo').val('');
        		$('#poDate').val('');
        		$('#suppName').val('');
        		$('#polines tbody').html('');
        		lineNo=0;
        		addRowInTable();
        	}       	
        	
        	function setlable(){        		
        		$('#lpoNo').html($('#poNo').val());
        		$('#lpoDate').html($('#poDate').val());
        		$('#lsuppName').html($('#suppName').val());        		
        		$('#llines').html('');
        		
        		$('#polines tbody tr').each(function(index){
        			var ctr = $(this);
        			$('#llines').append('<tr><td>'+$(ctr).find("[name$='lineNo']").val()+'</td>'+
        					'<td>'+$(ctr).find("[name$='sku'] option:selected").text()+'</td>'+
                            '<td>'+$(ctr).find("[name$='.skuStatus'] option:selected").text()+'</td>'+
                            '<td>'+$(ctr).find("[name$='.batchNo']").val()+'</td>'+
                            '<td>'+$(ctr).find("[name$='.ordQty']").val()+'</td>'+
                            '<td>'+$(ctr).find("[name$='.packcode']").val()+'</td>'+
                            '<td>'+$(ctr).find("[name$='.uomId'] option:selected").text()+'</td>'+
                            '<td>'+$(ctr).find("[name$='.unitCost']").val()+'</td></tr>');    			
        		});
        	}
        	
        	$('#polines').on('change','.skuStatus',function(){
        		if($(this).find('option:selected').text()=='Damaged'){
        			swal({
                        title: "Sku Status Change",
                        text: "You Have Selected Damaged Status"
                    });
        		}
        	});
        	
        	function strDate(date){
        		var dd = date.getDate();
             	var mm = date.getMonth()+1; //January is 0!
             	var yyyy = date.getFullYear();
             	if(dd<10){
             	    dd='0'+dd;
             	} 
             	if(mm<10){
             	    mm='0'+mm;
             	} 
             	return dd+'/'+mm+'/'+yyyy;
        	}
        	
        	/* var $po_noselect2 =  $("#po_no").select2({
          		 tags: true,
          		 createTag: function (params) {
          		    return {
          		      id: params.term,
          		      text: params.term,
          		      newOption: true
          		    }
          		 },
          		 escapeMarkup: function(markup) {
          		    return markup;
          		  },
                 templateResult: function (data) {
               	  
              	    if (data.text === data.id) {            	    	
              	    	return data.id;
              	    }
              	 	return data.id+'<span style="float:right;">'+data.text+'</span>';
              	  },
          			templateSelection: function(data) {
          		    return data.id;
          		  }
         		});  */
           	
         	var find_pono = $('#find_pono').ladda();
         	find_pono.click(function(){
         		
           		var fromDate = $("#fromDate").val();
           		var toDate = $("#toDate").val();
           		find_pono.ladda('start');
           		$.ajax({
           			url:serverContext+'getPoNoList',
           			method:'post',
           			data:{ fromDate : fromDate, toDate : toDate },
           			headers : {
   						Accept : "application/json"
   					},
           			success:function(data){
           				$('#poNoListRow').html('');
	                        $.each(data,function(key,value) {
                            var d = strDate(new Date(value.poDate));
                            $('#poNoListRow').append('<tr><td>' + value.poNo + '</td><td>' + d + '</td></tr>');
                        });
	                        find_pono.ladda('stop');
	                        $("#myPoListModalLabel").modal('show');
           				/* $('#po_no').empty();
           				$.each( data, function( key, value ) {        					
           					var d = strDate(new Date(value.poDate));        					
           					$('#po_no').append('<option value="' + value.poNo + '">' + d + '</option>');        					
          					});
           				$("#po_no").trigger('change.select2'); 
           				$po_noselect2.select2("open"); */        				
           			},
   					error : function() {
   						alert("Po No Not Found");
   						find_pono.ladda('stop');
   					}
           		})
           	});
         		
           	$('#poNoListRow').on('click','tr',function() {
   	            $('#selectPoNo').val($(this).find("td:first").text());
   	            $('#poNoListRow').find('tr').removeClass('highlighted');
   	            $(this).addClass('highlighted');
   	        });
           	
         	$('#selectPoNoBtn').click(function() {
         	    $("#myPoListModalLabel").modal('hide');
         	    $('#po_no').val($('#selectPoNo').val());
         	});
        	
        });
        </script>
    </body>
</html>
