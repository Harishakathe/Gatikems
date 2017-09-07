<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Dashboard</title>
        <c:url var="url" value="/" scope="request" />
        <link href="${url}resources/css/bootstrap.min.css" rel="stylesheet">
        <link href="${url}resources/font-awesome/css/font-awesome.css" rel="stylesheet">
        <!-- orris -->
        <link href="${url}resources/css/plugins/morris/morris-0.4.3.min.css" rel="stylesheet">
        <link href="${url}resources/css/animate.css" rel="stylesheet">
        <link href="${url}resources/css/plugins/datapicker/datepicker3.css" rel="stylesheet">
        <link href="${url}resources/css/style.css" rel="stylesheet">
        <link href="${url}resources/css/custom.css" rel="stylesheet" type="text/css"/>
    </head>
    <body class="md-skin">
        <div id="wrapper">
            <nav class="navbar-default navbar-static-side" role="navigation">
                <div class="sidebar-collapse">
                    <ul class="nav metismenu nav-box" id="side-menu">
                        <li class="nav-header ">
                            <img alt="image" class="img-responsive big-logo" src="${url}resources/img/logo.png" />
                            <div class="logo-element">
                                <img alt="image" class="img-responsive center-block" src="${url}resources/img/gati-small.png" />
                            </div>
                        </li>
                        <li class="bg-blue active">
                            <a class="text-center" href="${url}dashboard" data-toggle="tooltip" data-placement="top" title="Dashboard"><i class="fa fa-3x fa-th-large"></i> <span class="nav-label block m-t-sm">Dashboard</span></a>
                        </li>
                        <li class="bg-blue">
                            <a class="text-center" href="${url}tracking" data-toggle="tooltip" data-placement="top" title="Track Your Product"><i class="fa fa-3x fa-compass"></i> <span class="nav-label block m-t-sm">Track Your Product</span></a>
                        </li>
                        <li class="bg-blue">
                            <a class="text-center" href="${url}globalinventory" data-toggle="tooltip" data-placement="top" title="Global Inventory"><i class="fa fa-3x fa-braille"></i> <span class="nav-label block m-t-sm">Global Inventory</span></a>
                        </li>
                        <li class="bg-blue">
                            <a class="text-center" href="#"><i class="fa fa-3x fa-reorder"></i> <span class="nav-label block m-t-sm">Raise Order Request</span></a>
                            <ul class="nav nav-second-level collapse">
                            	<li><a href="${url}asn-master">Inbound</a></li>
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
                                <a href="${url}logout">
                                    <i class="fa fa-sign-out"></i>
                                </a>
                            </li>
                        </ul>

                    </nav>
                </div>
                <div class="wrapper wrapper-content">
                    <div class="row">
                        <div class="col-sm-6">
                            <div class="widget style1 lazur-bg">
                                <div class="row">
                                    <div class="col-xs-4">
                                        <img class="img-responsive m-t-xs" src="${url}resources/img/truck-icon.png" alt="truck"/>
                                    </div>
                                    <div class="col-xs-4 text-center">
                                        <h1 class="font-bold">24 <small class="text-white">#</small></h1>
                                    </div>
                                    <div class="col-xs-4 m-t-sm">
                                        <h3 class="">TRUCKS <br/>IN TRANSIT</h3>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-sm-6">
                            <div class="widget style1 lev-bg">
                                <div class="row">
                                    <div class="col-xs-4">
                                        <img class="img-responsive m-t-xs" src="${url}resources/img/warehouse-icon.png" alt="warehouse"/>
                                    </div>
                                    <div class="col-xs-4 text-center">
                                        <h1 class="font-bold">06 <small class="text-white">#</small></h1>
                                    </div>
                                    <div class="col-xs-4 m-t-sm">
                                        <h3 class="">WAREHOUSE <br/>OCCUPIED</h3>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="row m-t-sm">
                        <div class="col-sm-4">
                            <div class="row">
                                <div class="col-sm-12">
                                    <div class="ibox">
                                        <div class="ibox-content">
                                            <div class="row">
                                                <div class="col-sm-12">
                                                    <h4>My Orders <span class="text-normal">(This Month)</span></h4>
                                                </div>
                                            </div>
                                            <div class="row m-t-xs">
                                                <div class="col-sm-4 text-center border-right">
                                                    <h1 class="font-bold">24</h1>
                                                    <span class="text-info-2">INITIATED</span>
                                                </div>
                                                <div class="col-sm-4 text-center border-right">
                                                    <h1 class="font-bold">09</h1>
                                                    <span class="text-lev">IN-PROCESS</span>
                                                </div>
                                                <div class="col-sm-4 text-center">
                                                    <h1 class="font-bold">12</h1>
                                                    <span class="text-navy">COMPLETED</span>
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
                                                    <h4>My Deliveries <span class="text-normal">(This Month)</span></h4>
                                                </div>
                                            </div>
                                            <div class="row m-t-xs">
                                                <div class="col-sm-4 text-center border-right">
                                                    <h1 class="font-bold">10</h1>
                                                    <span class="text-info-2">INITIATED</span>
                                                </div>
                                                <div class="col-sm-4 text-center border-right">
                                                    <h1 class="font-bold">32</h1>
                                                    <span class="text-lev">IN-PROCESS</span>
                                                </div>
                                                <div class="col-sm-4 text-center">
                                                    <h1 class="font-bold">05</h1>
                                                    <span class="text-navy">COMPLETED</span>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-sm-12">
                                    <div class="ibox">
                                        <div class="ibox-content">
                                        <h4>Outstanding</h4>
                                        <h1 class="text-navy big-font text-center no-margins"><i class="fa fa-rupee"></i> 40,02,350 /-</h1>  
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-xs-8">
                        <div class="ibox float-e-margins">
                            <div class="ibox-title">
                                <h5>Global Inventory Visibility </h5>
                                <div class="ibox-tools">
                                    <a class="collapse-link">
                                        <i class="fa fa-chevron-up"></i>
                                    </a>

                                    <a class="close-link">
                                        <i class="fa fa-times"></i>
                                    </a>
                                </div>
                            </div>
                            <div class="ibox-content">
                                <div id="morris-bar-chart"></div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-lg-12">
                        <div class="ibox float-e-margins">
                            <div class="ibox-title">
                                <h5>Orders</h5>
                                <div class="pull-right">
                                    <div class="btn-group">
                                        <button type="button" class="btn btn-xs btn-white active">Today</button>
                                        <button type="button" class="btn btn-xs btn-white">Monthly</button>
                                        <button type="button" class="btn btn-xs btn-white">Annual</button>
                                    </div>
                                </div>
                            </div>
                            <div class="ibox-content">
                                <div class="row">
                                    <div class="col-lg-12">
                                        <div class="flot-chart">
                                            <div class="flot-chart-content" id="flot-dashboard-chart"></div>
                                        </div>
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
    <!-- Morris -->
    <script src="${url}resources/js/plugins/morris/raphael-2.1.0.min.js"></script>
    <script src="${url}resources/js/plugins/morris/morris.js"></script>
    <!-- Custom and plugin javascript -->
    <script src="${url}resources/js/inspinia.js"></script>
    <script src="${url}resources/js/plugins/pace/pace.min.js"></script>
    <!-- Data picker -->
    <script src="${url}resources/js/plugins/datapicker/bootstrap-datepicker.js"></script>
    <!-- Morris demo data-->
    <script src="${url}resources/js/demo/morris-demo.js"></script>
    <!-- Flot -->
    <script src="${url}resources/js/plugins/flot/jquery.flot.js"></script>
    <script src="${url}resources/js/plugins/flot/jquery.flot.tooltip.min.js"></script>
    <script src="${url}resources/js/plugins/flot/jquery.flot.spline.js"></script>
    <script src="${url}resources/js/plugins/flot/jquery.flot.resize.js"></script>
    <script src="${url}resources/js/plugins/flot/jquery.flot.pie.js"></script>
    <script src="${url}resources/js/plugins/flot/jquery.flot.symbol.js"></script>
    <script src="${url}resources/js/plugins/flot/jquery.flot.time.js"></script>
    <!-- EayPIE -->
    <script src="${url}resources/js/plugins/easypiechart/jquery.easypiechart.js"></script>

    <script>
        $(document).ready(function () {
            $('#data_1 .input-group.date').datepicker({
                todayBtn: "linked",
                keyboardNavigation: false,
                forceParse: false,
                calendarWeeks: true,
                autoclose: true
            });
        });
        $(document).ready(function () {
            $('.chart').easyPieChart({
                barColor: '#f8ac59',
//                scaleColor: false,
                scaleLength: 5,
                lineWidth: 4,
                size: 80
            });

            $('.chart2').easyPieChart({
                barColor: '#1c84c6',
//                scaleColor: false,
                scaleLength: 5,
                lineWidth: 4,
                size: 80
            });

            var data2 = [
                [gd(2012, 1, 1), 7], [gd(2012, 1, 2), 6], [gd(2012, 1, 3), 4], [gd(2012, 1, 4), 8],
                [gd(2012, 1, 5), 9], [gd(2012, 1, 6), 7], [gd(2012, 1, 7), 5], [gd(2012, 1, 8), 4],
                [gd(2012, 1, 9), 7], [gd(2012, 1, 10), 8], [gd(2012, 1, 11), 9], [gd(2012, 1, 12), 6],
                [gd(2012, 1, 13), 4], [gd(2012, 1, 14), 5], [gd(2012, 1, 15), 11], [gd(2012, 1, 16), 8],
                [gd(2012, 1, 17), 8], [gd(2012, 1, 18), 11], [gd(2012, 1, 19), 11], [gd(2012, 1, 20), 6],
                [gd(2012, 1, 21), 6], [gd(2012, 1, 22), 8], [gd(2012, 1, 23), 11], [gd(2012, 1, 24), 13],
                [gd(2012, 1, 25), 7], [gd(2012, 1, 26), 9], [gd(2012, 1, 27), 9], [gd(2012, 1, 28), 8],
                [gd(2012, 1, 29), 5], [gd(2012, 1, 30), 8], [gd(2012, 1, 31), 25]
            ];

            var data3 = [
                [gd(2012, 1, 1), 800], [gd(2012, 1, 2), 500], [gd(2012, 1, 3), 600], [gd(2012, 1, 4), 700],
                [gd(2012, 1, 5), 500], [gd(2012, 1, 6), 456], [gd(2012, 1, 7), 800], [gd(2012, 1, 8), 589],
                [gd(2012, 1, 9), 467], [gd(2012, 1, 10), 876], [gd(2012, 1, 11), 689], [gd(2012, 1, 12), 700],
                [gd(2012, 1, 13), 500], [gd(2012, 1, 14), 600], [gd(2012, 1, 15), 700], [gd(2012, 1, 16), 786],
                [gd(2012, 1, 17), 345], [gd(2012, 1, 18), 888], [gd(2012, 1, 19), 888], [gd(2012, 1, 20), 888],
                [gd(2012, 1, 21), 987], [gd(2012, 1, 22), 444], [gd(2012, 1, 23), 999], [gd(2012, 1, 24), 567],
                [gd(2012, 1, 25), 786], [gd(2012, 1, 26), 666], [gd(2012, 1, 27), 888], [gd(2012, 1, 28), 900],
                [gd(2012, 1, 29), 178], [gd(2012, 1, 30), 555], [gd(2012, 1, 31), 993]
            ];


            var dataset = [
                {
                    label: "Number of orders",
                    data: data3,
                    color: "#8ce1ef",
                    bars: {
                        show: true,
                        align: "center",
                        barWidth: 24 * 60 * 60 * 600,
                        lineWidth: 0
                    }

                }, {
                    label: "",
                    data: data2,
                    yaxis: 2,
                    color: "#1C84C6",
                    lines: {
                        lineWidth: 1,
                        show: false,
                        fill: false,
                        fillColor: {
                            colors: [{
                                    opacity: 0
                                }, {
                                    opacity: 0
                                }]
                        }
                    },
                    splines: {
                        show: false,
                        tension: 0.6,
                        lineWidth: 1,
                        fill: 0.1
                    },
                }
            ];


            var options = {
                xaxis: {
                    mode: "time",
                    tickSize: [3, "day"],
                    tickLength: 0,
                    axisLabel: "Date",
                    axisLabelUseCanvas: true,
                    axisLabelFontSizePixels: 12,
                    axisLabelFontFamily: 'Arial',
                    axisLabelPadding: 10,
                    color: "#d5d5d5"
                },
                yaxes: [{
                        position: "left",
                        max: 1070,
                        color: "#d5d5d5",
                        axisLabelUseCanvas: true,
                        axisLabelFontSizePixels: 12,
                        axisLabelFontFamily: 'Arial',
                        axisLabelPadding: 3
                    }, {
                        position: "right",
                        clolor: "#d5d5d5",
                        axisLabelUseCanvas: true,
                        axisLabelFontSizePixels: 12,
                        axisLabelFontFamily: ' Arial',
                        axisLabelPadding: 67
                    }
                ],
                legend: {
                    noColumns: 1,
                    labelBoxBorderColor: "#000000",
                    position: "nw"
                },
                grid: {
                    hoverable: false,
                    borderWidth: 0
                }
            };

            function gd(year, month, day) {
                return new Date(year, month - 1, day).getTime();
            }

            var previousPoint = null, previousLabel = null;

            $.plot($("#flot-dashboard-chart"), dataset, options);

            var mapData = {
                "US": 298,
                "SA": 200,
                "DE": 220,
                "FR": 540,
                "CN": 120,
                "AU": 760,
                "BR": 550,
                "IN": 200,
                "GB": 120,
            };

            $('#world-map').vectorMap({
                map: 'world_mill_en',
                backgroundColor: "transparent",
                regionStyle: {
                    initial: {
                        fill: '#e4e4e4',
                        "fill-opacity": 0.9,
                        stroke: 'none',
                        "stroke-width": 0,
                        "stroke-opacity": 0
                    }
                },
                series: {
                    regions: [{
                            values: mapData,
                            scale: ["#1ab394", "#22d6b1"],
                            normalizeFunction: 'polynomial'
                        }]
                },
            });
        });
    </script>
</body>
</html>

    