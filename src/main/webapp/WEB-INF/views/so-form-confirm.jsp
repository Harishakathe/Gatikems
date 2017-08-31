<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<c:url var="url" value="/" scope="request" />
<title>SO Form</title>
<link href="${url}resources/css/bootstrap.min.css" rel="stylesheet">
<link href="${url}resources/font-awesome/css/font-awesome.css"
	rel="stylesheet">
<link href="${url}resources/css/animate.css" rel="stylesheet">
<link href="${url}resources/css/plugins/datapicker/datepicker3.css"
	rel="stylesheet">
<link href="${url}resources/css/style.css" rel="stylesheet">
<link href="${url}resources/css/custom.css" rel="stylesheet"
	type="text/css" />
<style type="text/css">
.borderless td, .borderless th {
	border: none;
}

.npadding td, .npadding th {
	padding: 2px;
}
</style>
</head>
<body class="md-skin">
	<div id="wrapper">
		<nav class="navbar-default navbar-static-side" role="navigation">
			<div class="sidebar-collapse">
				<ul class="nav metismenu nav-box" id="side-menu">
					<li class="nav-header"><img alt="image"
						class="img-responsive big-logo" src="${url}resources/img/logo.png" />
						<div class="logo-element">
							<img alt="image" class="img-responsive center-block"
								src="${url}resources/img/gati-small.png" />
						</div></li>
					<li class="bg-blue"><a class="text-center"
						href="${url}dashboard" data-toggle="tooltip" data-placement="top"
						title="Dashboard"><i class="fa fa-3x fa-th-large"></i> <span
							class="nav-label block m-t-sm">Dashboard</span></a></li>
					<li class="bg-blue"><a class="text-center"
						href="${url}tracking" data-toggle="tooltip" data-placement="top"
						title="Track Your Product"><i class="fa fa-3x fa-compass"></i>
							<span class="nav-label block m-t-sm">Track Your Product</span></a></li>
					<li class="bg-blue"><a class="text-center"
						href="${url}globalinventory" data-toggle="tooltip"
						data-placement="top" title="Global Inventory"><i
							class="fa fa-3x fa-braille"></i> <span
							class="nav-label block m-t-sm">Global Inventory</span></a></li>
					<li class="bg-blue active"><a class="text-center" href="#"><i
							class="fa fa-3x fa-reorder"></i> <span
							class="nav-label block m-t-sm">Raise Order Request</span></a>
						<ul class="nav nav-second-level collapse">
							<li><a href="${url}asn-master">Inbound</a></li>
							<li class="active"><a href="${url}so-master">Outbound</a></li>
						</ul></li>
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
						<li class="dropdown"><a class="dropdown-toggle count-info"
							data-toggle="dropdown" href="#"> <i class="fa fa-bell-o"></i>
								<span class="label label-danger">8</span>
						</a>
							<ul class="dropdown-menu dropdown-alerts">
								<li><a href="mailbox.html">
										<div>
											<i class="fa fa-envelope fa-fw"></i> You have 16 messages <span
												class="pull-right text-muted small">4 minutes ago</span>
										</div>
								</a></li>
								<li class="divider"></li>
								<li><a href="profile.html">
										<div>
											<i class="fa fa-twitter fa-fw"></i> 3 New Followers <span
												class="pull-right text-muted small">12 minutes ago</span>
										</div>
								</a></li>
								<li class="divider"></li>
								<li><a href="grid_options.html">
										<div>
											<i class="fa fa-upload fa-fw"></i> Server Rebooted <span
												class="pull-right text-muted small">4 minutes ago</span>
										</div>
								</a></li>
								<li class="divider"></li>
								<li>
									<div class="text-center link-block">
										<a href="notifications.html"> <strong>See All
												Alerts</strong> <i class="fa fa-angle-right"></i>
										</a>
									</div>
								</li>
							</ul></li>
						<li><a href="#"> <i class="fa fa-gear"></i>
						</a></li>
						<li><a href="${url}logout"> <i class="fa fa-sign-out"></i>
						</a></li>
					</ul>

				</nav>
			</div>
			<div class="row wrapper page-heading">
				<div class="col-xs-8">
					<h3>SO Conformation</h3>
				</div>
			</div>
			<div class="wrapper wrapper-content">
				<div class="row">
					<div class="col-sm-5">
						<div class="ibox">
							<div class="ibox-title">
								<h3>SO Details</h3>
							</div>
							<div class="ibox-content">
								<div class="row">
									<div class="col-sm-6">
										<label class="block">Order No : <strong>${soHead.ordNo}</strong></label> 
										<label class="block">Order Type : <strong>${soHead.orderType}</strong></label>
										<label class="block">Carrier : <strong>${soHead.carrierId}</strong></label>

									</div>
									<div class="col-sm-6">
										<fmt:formatDate pattern="dd/MM/yyyy" value="${soHead.ordDate}" var="ordDate" />
										<label>Order Date : <strong>${ordDate}</strong></label> 
										<label class="block">Delivered To : <strong>${soHead.consigneeId}</strong></label>

									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="col-sm-7">
						<div class="ibox">
							<div class="ibox-title">
								<h3>Address Info</h3>
							</div>
							<div class="ibox-content">
								<div class="row">
									<div class="col-sm-6">
										<label>Address Line 1 : <strong>${soHead.shiptoAddr1}</strong></label>
										<label class="block">Address Line 3 : <strong>${soHead.shiptoAddr3}</strong></label>
										<label class="block">State : <strong>${soHead.shiptoState}</strong></label>
										<label class="block">Zip Code : <strong>${soHead.shiptoZip}</strong></label>
									</div>
									<div class="col-sm-6">
										<label>Address Line 2 : <strong>${soHead.shiptoAddr2}</strong></label>
										<label class="block">City : <strong>${soHead.shiptoCity}</strong></label>
										<label class="block">Country : <strong>${soHead.shiptoCountry}</strong></label>
									</div>
								</div>
							</div>
						</div>

					</div>

					<div class="col-sm-12">
						<div class="ibox">
							<div class="ibox-content">
								<div class="row">
									<div class="col-sm-12">
										<div class="table-responsive">
											<table class="table table-striped">
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
													</tr>
												</thead>
												<tbody>
													<c:forEach items="${soHead.lines}" var="obj"
														varStatus="loop">
														<tr>
															<td>${obj.ordlineNo}</td>
															<td>${obj.sku}</td>
															<td>${obj.skuStatus}</td>
															<td>${obj.batchNo}</td>
															<td>${obj.ordQty}</td>
															<td>${obj.packcode}</td>
															<td>${obj.uomId}</td>
															<td>${obj.unitPrice}</td>
														</tr>
													</c:forEach>
												</tbody>
											</table>
										</div>

									</div>
								</div>

							</div>
							<div class="ibox-footer">
								<div class="row">
									<div class="col-sm-12">
										<form:form role="form" id="po-form" method="POST"
											action="so-masterdo" modelAttribute="soHead">
											<input type="hidden" value="${soHead.ordNo}" name="ordNo">
											<input type="hidden" value="${soHead.orderType}"
												name="orderType">
											<input type="hidden" value="${soHead.carrierId}"
												name="carrierId">

											<input type="hidden" name="ordDate" value="${ordDate}">
											<input type="hidden" name="consigneeId"
												value="${soHead.consigneeId}">
											<input type="hidden" name="consigneeName"
												value="${soHead.consigneeName}">
											<input type="hidden" name="shiptoAddr1"
												value="${soHead.shiptoAddr1}">
											<input type="hidden" name="shiptoAddr2"
												value="${soHead.shiptoAddr2}">
											<input type="hidden" name="shiptoAddr3"
												value="${soHead.shiptoAddr3}">
											<input type="hidden" name="shiptoCity"
												value="${soHead.shiptoCity}">
											<input type="hidden" name="shiptoState"
												value="${soHead.shiptoState}">
											<input type="hidden" name="shiptoCountry"
												value="${soHead.shiptoCountry}">
											<input type="hidden" name="shiptoZip"
												value="${soHead.shiptoZip}">

											<c:forEach items="${soHead.lines}" var="obj" varStatus="loop">
												<input type="hidden" name="lines[${loop.index}].ordlineNo"
													value="${obj.ordlineNo}">
												<input type="hidden" name="lines[${loop.index}].sku"
													value="${obj.sku}">
												<input type="hidden" name="lines[${loop.index}].skuStatus"
													value="${obj.skuStatus}">
												<input type="hidden" name="lines[${loop.index}].batchNo"
													value="${obj.batchNo}">
												<input type="hidden" name="lines[${loop.index}].ordQty"
													value="${obj.ordQty}">
												<input type="hidden" name="lines[${loop.index}].packcode"
													value="${obj.packcode}">
												<input type="hidden" name="lines[${loop.index}].uomId"
													value="${obj.uomId}">
												<input type="hidden" name="lines[${loop.index}].unitPrice"
													value="${obj.unitPrice}">
											</c:forEach>
											<div style="float: right;">
												<button type="button" class="btn btn-default" onClick="javascript:history.back()">Cancel</button>
												<button type="submit" class="btn btn-success">Confirm</button>
											</div>
										</form:form>

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
					&copy; Copyright 2017-2018.<strong>&nbsp;&nbsp;Gati Kausar
						India</strong>
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
	
</body>
</html>
