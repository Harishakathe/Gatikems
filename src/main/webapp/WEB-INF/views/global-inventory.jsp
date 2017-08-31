<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
    <head>
    	<c:url var="url" value="/" scope="request" />
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Global Inventory Visibility</title>
        <link href="${url}resources/css/bootstrap.min.css" rel="stylesheet">
        <link href="${url}resources/font-awesome/css/font-awesome.css" rel="stylesheet">
        <link href="${url}resources/css/animate.css" rel="stylesheet">
        <link href="${url}resources/css/plugins/datapicker/datepicker3.css" rel="stylesheet">
        <link href="${url}resources/css/style.css" rel="stylesheet">
        <link href="${url}resources/css/custom.css" rel="stylesheet" type="text/css"/>
        <link href="${url}resources/css/bootstrap-table-expandable.css" rel="stylesheet" type="text/css"/>
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
                        <li class="bg-blue active">
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
                        <h3>Global Inventory Visibility</h3>
                    </div>
                    <div class="col-xs-4">
                        <a class="pull-right m-t-xs text-info" href="#"><span class="fa fa-home"></span></a>
                    </div>
                </div>
                <div class="wrapper wrapper-content">
                    <div class="row">
                        <div class="col-sm-3">
                            <div class="form-group" id="data_5">
                                <label class="font-normal">Select Date</label>
                                <div class="input-daterange input-group" id="datepicker">
                                    <input type="text" class="input-sm form-control" name="start" value="25/07/2017"/>
                                    <span class="input-group-addon">to</span>
                                    <input type="text" class="input-sm form-control" name="end" value="25/08/2017" />
                                </div>
                            </div>
                        </div>


                        <div class="col-sm-3">
                            <div class="form-group">
                                <label class="font-normal">SKU No</label>
                                <input type="text" class="form-control input-sm">
                            </div> 
                        </div>
                        <div class="col-sm-3">
                            <div class="row">
                                <div class="col-sm-12">
                                    <div class="form-group">
                                        <label class="font-normal">Location</label>
                                        <input type="text" class="form-control input-sm">
                                    </div>  
                                </div>
                            </div>
                        </div>
                        <div class="col-sm-3">
                            <button class="btn btn-sm btn-primary m-t-md">SHOW</button>
                        </div>
                    </div>
                    <div class="ibox">
                        <div class="ibox-content">
                            <div class="row">
                                <div class="col-sm-12">
                                    <table class="table table-hover table-expandable">
                                        <thead>
                                            <tr>
                                                <th>Location</th>
                                                <th>Status</th>
                                                <th>SKU Number</th>
                                                <th>SKU Count</th>
                                                <th>Desired Temp.</th>
                                                <th>Expiry Date</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <tr>
                                                <td>Location A</td>
                                                <td>Warehouse</td>
                                                <td>32015</td>
                                                <td>100</td>
                                                <td>-18&deg;</td>
                                                <td>12/04/2017</td>
                                                <td><a class="show-details">Show More</a></td>
                                            </tr>
                                            <tr>
                                                <td colspan="6">
                                                    <div class="row">
                                                        <div class="col-sm-12">
                                                            <table class="table table-bordered">
                                                                <thead class="thead-inverse">
                                                                    <tr>
                                                                        <th>SKU Number</th>
                                                                        <th>SKU Count</th>
                                                                        <th>Desired Temp.</th>
                                                                        <th>Expiry Date</th>
                                                                    </tr>
                                                                </thead>
                                                                <tbody>
                                                                    <tr>
                                                                        <td>625441</td>
                                                                        <td>100</td>
                                                                        <td>-18&deg;</td>
                                                                        <td>12/04/2017</td>
                                                                    </tr>
                                                                </tbody>
                                                            </table>
                                                        </div>
                                                    </div>

                                                </td>
                                            </tr>

                                            <tr>
                                                <td>Location A</td>
                                                <td>Warehouse</td>
                                                <td>32015</td>
                                                <td>100</td>
                                                <td>-18&deg;</td>
                                                <td>12/04/2017</td>
                                                <td><a class="show-details">Show More</a></td>
                                            </tr>
                                            <tr>
                                                <td colspan="6">
                                                    <div class="row">
                                                        <div class="col-sm-12">
                                                            <table class="table table-bordered">
                                                                <thead class="thead-inverse">
                                                                    <tr>
                                                                        <th>SKU Number</th>
                                                                        <th>SKU Count</th>
                                                                        <th>Desired Temp.</th>
                                                                        <th>Expiry Date</th>
                                                                    </tr>
                                                                </thead>
                                                                <tbody>
                                                                    <tr>
                                                                        <td>625441</td>
                                                                        <td>100</td>
                                                                        <td>-18&deg;</td>
                                                                        <td>12/04/2017</td>
                                                                    </tr>
                                                                </tbody>
                                                            </table>
                                                        </div>
                                                    </div>

                                                </td>
                                            </tr>
                                            
                                            <tr>
                                                <td>Location A</td>
                                                <td>Warehouse</td>
                                                <td>32015</td>
                                                <td>100</td>
                                                <td>-18&deg;</td>
                                                <td>12/04/2017</td>
                                                <td><a class="show-details">Show More</a></td>
                                            </tr>
                                            <tr>
                                                <td colspan="6">
                                                    <div class="row">
                                                        <div class="col-sm-12">
                                                            <table class="table table-bordered">
                                                                <thead class="thead-inverse">
                                                                    <tr>
                                                                        <th>SKU Number</th>
                                                                        <th>SKU Count</th>
                                                                        <th>Desired Temp.</th>
                                                                        <th>Expiry Date</th>
                                                                    </tr>
                                                                </thead>
                                                                <tbody>
                                                                    <tr>
                                                                        <td>625441</td>
                                                                        <td>100</td>
                                                                        <td>-18&deg;</td>
                                                                        <td>12/04/2017</td>
                                                                    </tr>
                                                                </tbody>
                                                            </table>
                                                        </div>
                                                    </div>

                                                </td>
                                            </tr>
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="footer">
                <div class="pull-right">
                    Version <strong>1.0</strong>
                    &copy; Copyright 2017-2018.<strong>&nbsp;&nbsp;Gati Kausar India</strong>  
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

        <script src="${url}resources/js/bootstrap-table-expandable.js" type="text/javascript"></script>
        <script>
            $(document).ready(function () {
                $('#data_5 .input-daterange').datepicker({
                    keyboardNavigation: false,
                    forceParse: false,
                    autoclose: true
                });
            });

            var _gaq = _gaq || [];
            _gaq.push(['_setAccount', 'UA-36251023-1']);
            _gaq.push(['_setDomainName', 'jqueryscript.net']);
            _gaq.push(['_trackPageview']);

            (function () {
                var ga = document.createElement('script');
                ga.type = 'text/javascript';
                ga.async = true;
                ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';
                var s = document.getElementsByTagName('script')[0];
                s.parentNode.insertBefore(ga, s);
            })();
        </script>
    </body>
</html>
