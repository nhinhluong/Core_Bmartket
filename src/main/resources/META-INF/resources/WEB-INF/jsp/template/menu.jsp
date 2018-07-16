<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
	<!-- Navigation -->
		<nav class="navbar navbar-default navbar-static-top" role="navigation"
			style="margin-bottom: 0">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target=".navbar-collapse">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="index.html">SB Admin v2.0</a>

			</div>
			<!-- /.navbar-header -->

			<div class="collapse navbar-collapse">
			
			</div>
			<div class="container-fluid">
				<div class="col-md-2" style="padding:0px;">
				
				</div>
				<div class="col-md-4 " style="text-align:left;">
				
					<a  href="#"  />
							<img height="60" src="http://staging.bmq.vn/image/layout_set_logo?img_id=39413&t=1528861836979" />
					</a>
					
				</div>
				<div class="col-md-6" style="height:60px;float:right;padding:0px;">
					<ul class=" nav navbar-top-links navbar-right">
						<li>
							<div class="top-menu-item">
								<a href="http://staging.bmq.vn/comming">Bán hàng trên BMQ</a>
							</div>
						</li>
						<li>
							<div class="top-menu-item">
								<a href="http://staging.bmq.vn/comming">Tải App</a>
							</div>	
						</li>
						<li>
							<div class="top-menu-item">
								<a href="http://staging.bmq.vn/comming">Đăng nhập</a>
							</div>
						</li>
						<li>
							<div class="top-menu-item">
								<a href="http://staging.bmq.vn/comming">Đăng ký</a>
							</div>
						</li>
						<li class="dropdown"><a class="dropdown-toggle"
							data-toggle="dropdown" href="#"> <i class="fa fa-user fa-fw"></i>
								<i class="fa fa-caret-down"></i>
						</a>
							<ul class="dropdown-menu dropdown-user">
								<li><a href="#"><i class="fa fa-user fa-fw"></i> User
										Profile</a></li>
								<li><a href="#"><i class="fa fa-gear fa-fw"></i> Settings</a>
								</li>
								<li class="divider"></li>
								<li><a href="login.html"><i class="fa fa-sign-out fa-fw"></i>
										Logout</a></li>
							</ul> <!-- /.dropdown-user --></li>
						<!-- /.dropdown -->
					</ul>
			</div>
			<!-- /.navbar-top-links -->

			<div class="navbar-default sidebar" role="navigation">
				<div class="sidebar-nav navbar-collapse">
					<ul class="nav" id="side-menu">
						<li><a href="index.html"><i class="fa fa-dashboard fa-fw"></i>
								Quay lại BMQ</a></li>
					</ul>
				</div>
				<!-- /.sidebar-collapse -->
			</div>
			<!-- /.navbar-static-side -->
		</nav>
		
	<!-- CSS -->
	<style>
		.font-14-white	{
			font-family:Arial;
			font-size: 14px;
			color:white;
		}
		.top-menu-nav {
			clear: both;
			line-height: 30px;
			margin-bottom: 10px;
		    margin-top: 10px;	
		}
		.top-menu-item {
			float: right;
			padding: 0 2px;
			border-right: #869CAD thin solid;
		}
		
		.top-menu-item.last {
			border-right: none;
		}
		
		.top-menu-item a{
			color: #f7941d;
		}

	</style>	
