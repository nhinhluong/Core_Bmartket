<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
	<!-- Navigation -->
		<nav class="navbar navbar-default navbar-static-top" role="navigation"
			style="margin-bottom: 0">
			<div class="navbar-header">				
				<a  href="http://staging.bmq.vn" class="navbar-brand nav-iconBMQ"/>
						<img height="60" src="http://staging.bmq.vn/image/layout_set_logo?img_id=39413&t=1528861836979" />
				</a>
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target=".navbar-collapse">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>


			</div>
			<!-- /.navbar-header -->

			<div class="collapse navbar-collapse top-coll" >
				<div class="dropdown top-menu-item last""><a class="dropdown-toggle"
					data-toggle="dropdown" href="#"> <i class="fa fa-user fa-fw"></i>
						<i class="fa fa-caret-down"></i>
				</a>
					<ul class="dropdown-menu dropdown-menu-right dropdown-user">
						<li><a href="#"><i class="fa fa-user fa-fw"></i> User
								Profile</a></li>
						<li><a href="#"><i class="fa fa-gear fa-fw"></i> Settings</a>
						</li>
						<li class="divider"></li>
						<li><a href="login.html"><i class="fa fa-sign-out fa-fw"></i>
								Logout</a></li>
					</ul> <!-- /.dropdown-user --></div>
				<div class="top-menu-item">
					<a href="http://staging.bmq.vn/comming">Đăng ký</a>
				</div>
				<div class="top-menu-item">
					<a href="http://staging.bmq.vn/comming">Đăng nhập</a>
				</div>	
				<div class="top-menu-item">
					<a href="http://staging.bmq.vn/comming">Tải App</a>
				</div>
				<div class="top-menu-item">
					<a href="http://staging.bmq.vn/comming">Bán hàng trên BMQ</a>
				</div>
				
			</div>
			<div class="container-fluid">
				
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
	<script src="/bmq-coresv/resources/threesteps/css/step.css"></script>
	<style>
		.font-14-white	{
			font-family:Arial;
			font-size: 14px;
			color:white;
		}
		.top-coll {			
			line-height: 20px;
			margin-bottom: 10px;
		    margin-top:10px;
		}
		.top-menu-item {
			float: right;
			padding: 0 10px;
			border-right: #869CAD thin solid;
		}
		
		.top-menu-item.last {
			border-right: none;
			float: right;
			padding: 0 10px;
			display: inline-block;
			
		}
		.dropdown-menu-right {
			position: absolute;
		    top: 100%;
		    right: 0;
		    z-index: 1000;
		    display: none;
		    float: left;
		    min-width: 160px;
		    padding: 5px 0;
		    margin: 2px 0 0;
		    font-size: 14px;
		    text-align: left;
		    list-style: none;
		    background-color: #fff;
		    -webkit-background-clip: padding-box;
		    background-clip: padding-box;
		    border: 1px solid #ccc;
		    border: 1px solid rgba(0,0,0,.15);
		    border-radius: 4px;
		    -webkit-box-shadow: 0 6px 12px rgba(0,0,0,.175);
		    box-shadow: 0 6px 12px rgba(0,0,0,.175);
		}
		.nav-iconBMQ {
			float: left;
		    height: 50px;
		    padding: 1px 15px;
		    font-size: 18px;
		    line-height: 20px;
		}
		.top-menu-item a{
			color: #f7941d;
		}		
	</style>	
