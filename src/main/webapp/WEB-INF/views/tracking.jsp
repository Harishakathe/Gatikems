<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>

    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Tracking</title>
        <c:url var="url" value="/" scope="request" />
        <link href="${url}resources/css/bootstrap.min.css" rel="stylesheet">
        <link href="${url}resources/font-awesome/css/font-awesome.css" rel="stylesheet">
        <link href="${url}resources/css/animate.css" rel="stylesheet">
        <link href="${url}resources/css/plugins/datapicker/datepicker3.css" rel="stylesheet">
        <link href="${url}resources/css/style.css" rel="stylesheet">
        <link href="${url}resources/css/custom.css" rel="stylesheet" type="text/css"/>
        <link href="${url}resources/css/plugins/dataTables/datatables.min.css" rel="stylesheet">
        
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
                        <li class="bg-blue active">
                            <a class="text-center" href="${url}tracking" data-toggle="tooltip" data-placement="top" title="Track Your Product"><i class="fa fa-3x fa-compass"></i> <span class="nav-label block m-t-sm">Track Your Product</span></a>
                        </li>
                        <li class="bg-blue ">
                            <a class="text-center" href="${url}globalinventory" data-toggle="tooltip" data-placement="top" title="Global Inventory"><i class="fa fa-3x fa-braille"></i> <span class="nav-label block m-t-sm">Global Inventory</span></a>
                        </li>
                        <li class="bg-blue ">
                            <a class="text-center" href="#"><i class="fa fa-3x fa-reorder"></i> <span class="nav-label block m-t-sm">Raise Order Request</span></a>
                            <ul class="nav nav-second-level collapse">
                            	<li ><a href="${url}asn-master">Inbound</a></li>
                            	<li ><a href="${url}so-master">Outbound</a></li>
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
                        <h3>Track Your Product</h3>
                    </div>
                    <div class="col-xs-4">
                        <a class="pull-right m-t-xs text-info" href="#"><span class="fa fa-home"></span></a>
                    </div>
                </div>
                <div class="wrapper wrapper-content">
                	<form id="FormTracking" method="post">
                    <div class="row">
                        <div class="col-sm-3 pad-0">
                            <div class="row">
                                <div class="col-sm-12">
                                    <div class="form-group no-margins" id="data_5">
                                        <label class="font-normal">Select Date</label>
                                        <div class="input-daterange input-group" id="datepicker">
                                            <input type="text" class="input-sm form-control" name="startDate" id="startDate" />
                                            <span class="input-group-addon">to</span>
                                            <input type="text" class="input-sm form-control" name="endDate" id="endDate"  />
                                        </div>
                                    </div>
                                </div>
                                <div class="col-sm-12 m-t-sm">
                                    <div class="form-group no-margins">
                                        <label class="font-normal">All</label>
                                        <input type="text" class="form-control input-sm" placeholder="" name="allSearch">
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-sm-1 text-center pad-0">
                            <p class="m-t-xxl"><strong>OR</strong></p>
                        </div>
                        <div class="col-sm-2 pad-0">
                            <div class="row">
                                <div class="col-sm-12">
                                    <div class="form-group no-margins">
                                        <label class="font-normal">ASN/Invoice No</label>
                                        <input id="poNo" type="text" class="form-control input-sm" placeholder="" name="poNo">
                                    </div>  
                                </div>
                                <div class="col-sm-12 m-t-sm">
                                    <div class="form-group no-margins">
                                        <label class="font-normal">Hub Location</label>
                                        <input id="hubLocation" type="text" class="form-control input-sm" placeholder="" name="hubLocation">
                                    </div>  
                                </div>
                            </div>
                        </div>
                        <div class="col-sm-1 text-center pad-0">
                            <p class="m-t-xxl"><strong>OR</strong></p>
                        </div>
                        <div class="col-sm-2 pad-0">
                            <div class="row">
                                <div class="col-sm-12">
                                    <div class="form-group no-margins">
                                        <label class="font-normal">Po No</label>
                                        <input id="invNo" type="text" class="form-control input-sm" placeholder="" name="invNo" >
                                    </div>  
                                </div>
                                <div class="col-sm-12 m-t-sm">
                                    <div class="form-group no-margins">
                                        <label class="font-normal">City Location</label>
                                        <input id="cityLocation" type="text" class="form-control input-sm" placeholder="" name="cityLocation" >
                                    </div>  
                                </div>
                            </div>
                        </div>
                        <div class="col-sm-1 text-center pad-0">
                            <p class="m-t-xxl"><strong>OR</strong></p>
                        </div>
                        <div class="col-sm-2 pad-0">
                            <div class="row">
                                <div class="col-sm-12">
                                    <div class="form-group no-margins">
                                        <label class="font-normal">Batch No</label>
                                        <input id="batchNo" type="text" class="form-control input-sm" placeholder="" name="batchNo" >
                                    </div>  
                                </div>
                                <div class="col-sm-12 m-t-sm">
                                    <div class="form-group no-margins">
                                        <label class="font-normal">SKU No</label>
                                        <input id="sku" type="text" class="form-control input-sm" placeholder="" name="sku" >
                                    </div>  
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="row m-t-sm">
                        <div class="col-sm-12 pad-0">
                        	<input id="filterBy" type="hidden" class="form-control input-sm" placeholder="" name="filterBy" value="dates" >
                            <button class="btn btn-sm btn-primary pull-right" type="submit">SHOW</button>
                        </div>
                    </div>
                    </form>
                    <hr/>
                    <div class="row m-t-lg">
                        <div class="col-sm-12">
                            <div class="ibox">
                                <div class="ibox-content">
                                    <div class="table-responsive">
                                        <table id="tracking-table" class="table table-striped">
                                            <thead class="th-bg">
                                                <tr>
                                                    <th>ASN No</th>
                                                    <th>Invoice No</th>
                                                    <th>SKU No</th>
                                                    <th>Desired Temp.</th>
                                                    <th>Hub Location</th>
                                                    <th>Vehicle No</th>
                                                </tr>
                                            </thead>
                                            <tbody>                                                
                                            </tbody>
                                        </table>
                                    </div>
                                    <div class="row">
                                        <div class="col-sm-12">
                                            <nav aria-label="Page navigation">
                                                <ul class="pagination pull-right no-margins">
                                                    <li>
                                                        <a href="#" aria-label="Previous">
                                                            <span aria-hidden="true">&laquo;</span>
                                                        </a>
                                                    </li>
                                                    <li><a href="#">1</a></li>
                                                    <li><a href="#">2</a></li>
                                                    <li><a href="#">3</a></li>
                                                    <li><a href="#">4</a></li>
                                                    <li><a href="#">5</a></li>
                                                    <li>
                                                        <a href="#" aria-label="Next">
                                                            <span aria-hidden="true">&raquo;</span>
                                                        </a>
                                                    </li>
                                                </ul>
                                            </nav>
                                        </div>
                                    </div>
                                </div>
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
        <script src="${url}resources/js/plugins/jvectormap/jquery-jvectormap-2.0.2.min.js"></script>
        <script src="${url}resources/js/plugins/jvectormap/jquery-jvectormap-world-mill-en.js"></script>

        <!-- EayPIE -->
        <script src="${url}resources/js/plugins/easypiechart/jquery.easypiechart.js"></script>

        <!-- Sparkline -->
        <script src="${url}resources/js/plugins/sparkline/jquery.sparkline.min.js"></script>

        <!-- Sparkline demo data  -->
        <script src="${url}resources/js/demo/sparkline-demo.js"></script>

        <!-- Data picker -->
        <script src="${url}resources/js/plugins/datapicker/bootstrap-datepicker.js"></script>
        
    	<script src="${url}resources/js/plugins/dataTables/datatables.min.js"></script>
        
        <script type="text/javascript">
        
		 $(document).ready(function() {	
			var StartDate = new Date('01/01/2012');
         	var TodateDate = new Date();
         	
         	
         	var dd = TodateDate.getDate();
         	var mm = TodateDate.getMonth()+1; //January is 0!
         	var yyyy = TodateDate.getFullYear();
         	if(dd<10){
         	    dd='0'+dd;
         	} 
         	if(mm<10){
         	    mm='0'+mm;
         	} 
         	var today_str = dd+'/'+mm+'/'+yyyy;
         	
         	$('#startDate').val('01/01/2017');
         	$('#endDate').val(today_str);
         	$('#data_5 .input-daterange').datepicker({
                 keyboardNavigation: false,
                 forceParse: false,
                 autoclose: true,
                 startDate : StartDate, 
                 endDate : TodateDate,
                 format: "dd/mm/yyyy",
                 defaultDate: TodateDate
             });
         	
			var formdata = $('#FormTracking').serializeArray();
		    var table = $('#tracking-table').DataTable({
		        lengthMenu : [ 20, 50, 100, 200 ],
		        pagingType : "simple_numbers",
		        processing : true,
		        serverSide : true,
		        ajax : {
		        	url : "${pageContext.request.contextPath}/asntracking",
		        	type : "POST",
		        	data : function(mData) {
		        				return JSON.stringify(mData);
		        			},
		        	dataType : "json",
		        	processData : false,
		        	contentType : 'application/json;charset=UTF-8'
		        	},
	        	fnServerParams: function ( aoData ) {
		 			console.log("my:"+aoData);
		 			$(formdata).each(function(i, field){
		 				if(field.name == 'startDate' || field.name == 'endDate'){
		 					field.value = new Date(field.value.replace(/(..)\/(..)\/(....)/, "$2/$1/$3"));		 					
		 				}
 						aoData[field.name] = field.value;
 					});			  
	        	    console.log("my2:"+aoData);
	        	},
        	    columns : [{"data" : "poNo"},
		                  {"data" : "invNo"},
		                  {"data" : "sku"},
		                  {"data" : "desTemp"},
		                  {"data" : "desTemp"},
		                  {"data" : "desTemp"}]
		      });
		    
		    $('#FormTracking').submit(function(e){
		    	e.preventDefault();	
		    	
		    })
		 });		 
		</script>
        
    </body>
</html>
