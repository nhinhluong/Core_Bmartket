<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<jsp:include page="../template/init.jsp"></jsp:include>
<html lang="en">
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>Order</title>
<jsp:include page="../template/head_import_resource.jsp"></jsp:include>
<!-- CSS step 1,2,3 -->
	<script src="/resources/threesteps/css/step.css"></script>
</head>

<body>

	<div id="wrapper">

		<jsp:include page="../template/menu.jsp"></jsp:include>
		<div id="page-wrapper">
			
			<div class="row" >
				<div class="row smpl-step"
					style="border-bottom: 0; min-width: 500px;">
					<div class="col-xs-3 smpl-step-step complete">
						<div class="text-center smpl-step-num">Step 1</div>
						<div class="progress">
							<div class="progress-bar"></div>
						</div>
						<a class="smpl-step-icon"><i class="fa fa-user"
							style="font-size: 60px; padding-left: 12px; padding-top: 3px; color: black;"></i></a>
						<div class="smpl-step-info text-center">Thông tin sản phẩm</div>
					</div>

					<div class="col-xs-3 smpl-step-step complete">
						<div class="text-center smpl-step-num">Step 2</div>
						<div class="progress">
							<div class="progress-bar"></div>
						</div>
						<a class="smpl-step-icon"><i class="fa fa-dollar"
							style="font-size: 60px; padding-left: 18px; padding-top: 5px; color: black;"></i></a>
						<div class="smpl-step-info text-center">Chi tiết yêu cầu</div>
					</div>
					<div class="col-xs-3 smpl-step-step disabled">
						<div class="text-center smpl-step-num">Step 3</div>
						<div class="progress">
							<div class="progress-bar"></div>
						</div>
						<a class="smpl-step-icon"><i class="fa fa-repeat"
							style="font-size: 60px; padding-left: 7px; padding-top: 7px; color: black;"></i></a>
						<div class="smpl-step-info text-center">Hoàn thành</div>
					</div>
					<h1 class="page-header"></h1>
				</div>
			</div>

			<!-- content -->
			<div class="row" style="padding:30px;">

				<div class="col-lg-8">
					<form:form role="form" modelAttribute="order" method="post"
						action="processStep2">
						<div class="form-group">
							<label>Mô tả yêu cầu</label>
							<form:textarea path="requirementNote" cssClass="form-control" />
							<p class="help-block">Chi tiết yêu cầu của quý khách</p>
						</div>
						<div class="row">
							<div class="col-lg-6">
								<div class="form-group">
									<form:select path="delivery" cssClass="form-control">
										<form:option value="" label="Hình thức vận chuyển" />
										<form:option value="Xe máy" label="Xe máy" />
										<form:option value="Grab" label="Grab" />
										<form:option value="Máy bay" label="Máy bay" />
										<form:option value="Xe khách" label="Xe khách" />
									</form:select>
								</div>
							</div>
							<div class="col-lg-6">
								<div class="form-group">
									<form:select path="paymentMode" cssClass="form-control">
										<form:option value="" label="Hình thức thanh toán" />
										<form:option value="Tiền mặt" label="Tiền mặt" />
										<form:option value="Chuyển khoản" label="Chuyển khoản" />
										<form:option value="Khác" label="Khác" />
									</form:select>
								</div>
							</div>
						</div>


						<div class="form-group">
							<label>Mục đích</label> <label class="checkbox-inline"> <form:checkbox
									path="purpose" value="Sử dụng" />Sử dụng
							</label> <label class="checkbox-inline"> <form:checkbox
									path="purpose" value="Buôn bán" />Buôn bán
							</label>

						</div>
						<div class="form-group">
							<label>Tần suất lấy hàng</label> <label class="checkbox-inline">
								<form:checkbox path="frequently" value="Một lần" />Một lần
							</label> <label class="checkbox-inline"> <form:checkbox
									path="frequently" value="Hàng ngày" />Hàng ngày
							</label> <label class="checkbox-inline"> <form:checkbox
									path="frequently" value="Hàng tuần" />Hàng tuần
							</label> <label class="checkbox-inline"> <form:checkbox
									path="frequently" value="Hàng tháng" />Hàng tháng
							</label>
						</div>
						<div class="form-group">
							<label>Nhà cung cấp đề xuất</label> <label
								class="checkbox-inline"> <form:checkbox
									path="preferSuppliers" value="Nhà sản xuất" />Nhà sản xuất
							</label> <label class="checkbox-inline"> <form:checkbox
									path="preferSuppliers" value="Công ty xuất nhập khẩu" />Công
								ty xuất nhập khẩu
							</label> <label path="preferSuppliers=" class="checkbox-inline">
								<form:checkbox path="preferSuppliers" value="Bán buôn" />Bán
								buôn
							</label> <label class="checkbox-inline"> <form:checkbox
									path="preferSuppliers" value="Bán lẻ" />Bán lẻ
							</label>
						</div>
						<form:hidden path="productName" cssClass="form-control" />
						<form:hidden path="email" cssClass="form-control" />
						<form:hidden path="productQuantity" cssClass="form-control" />
						<form:hidden path="productQuantity" cssClass="form-control" />
						<form:hidden path="customerName" cssClass="form-control" />
						<form:hidden path="productCode" cssClass="form-control" />
						<form:hidden path="phone" cssClass="form-control" />
						<button type="submit" class="btn btn-primary" name="backToStep1">Quay
							lại</button>
						<button type="submit" class="btn btn-primary" name="step3">Tiếp
							tục</button>
						<button type="reset" class="btn btn-warning">Hủy</button>
					</form:form>
				</div>
			</div>
			
		</div>
		<!-- /#page-wrapper -->


	</div>
	<!-- /#wrapper -->
	<!-- Footer -->
	<div class="container-fluid" style="background-color: #f7941d; padding:30px;">
		<div class="container">
			<div class="col-xs-4 col-md-4 col-sm-4">
				<p class="font-14-white" style="font-weight:bold;text-align:left;font-size: 14px;">GIỚI THIỆU</p>

				  <p class="font-14-white" style="font-weight:normal;text-align:left;font-size: 12px;">Về BMQ</p>
				  <p class="font-14-white" style="font-weight:normal;text-align:left;font-size: 12px;">Tuyển dụng</p>
				  <p class="font-14-white" style="font-weight:normal;text-align:left;font-size: 12px;">Chính sách bảo mật</p>
				  <p class="font-14-white" style="font-weight:normal;text-align:left;font-size: 12px;">Câu hỏi thường gặp</p>

			</div>
			<div class="col-xs-4 col-md-4 col-sm-4">
				<p class="font-14-white" style="font-weight:bold;text-align:left;font-size: 14px;">KHÁCH HÀNG</p>

				  <p class="font-14-white" style="font-weight:normal;text-align:left;font-size: 12px;">Giao hàng</p>
				  <p class="font-14-white" style="font-weight:normal;text-align:left;font-size: 12px;">Chính sách đổi trả</p>
				  <p class="font-14-white" style="font-weight:normal;text-align:left;font-size: 12px;">Cách thức thanh toán</p>
				  <p class="font-14-white" style="font-weight:normal;text-align:left;font-size: 12px;">Chính sách dành cho khách sỉ</p>
			</div>
			<div class="col-xs-4 col-md-4 col-sm-4">
				<p class="font-14-white" style="font-weight:bold;text-align:left;font-size: 14px;">NHÀ CUNG CẤP</p>

				  <p class="font-14-white" style="font-weight:normal;text-align:left;font-size: 12px;">Đăng ký</p>
				  <p class="font-14-white" style="font-weight:normal;text-align:left;font-size: 12px;">Quy định</p>
				  <p class="font-14-white" style="font-weight:normal;text-align:left;font-size: 12px;">Chính sách bán hàng</p>					  					  
				  <p class="font-14-white" style="font-weight:normal;text-align:left;font-size: 12px;">Hệ thống tiêu chí kiểm duyệt</p>

			</div>
			<div class="col-xs-12 col-md-12 col-sm-12" style="text-align:center">
				<a class="" href="" title="BMQ" key="go-to-x" />
						<img alt="" height="70" src="http://staging.bmq.vn/image/layout_set_logo?img_id=39413&t=1528861836979" />
				</a>
				<p class="font-14-white" style="font-weight:bold">Công Ty Cổ Phẩn Thực Phẩm BMQ</p>
				<p class="font-14-white" style="font-weight:normal"><span class="glyphicon">&#xe021;</span> 268 Tô Hiến Thành, P.15, Q.10, TP.HCM</p>
				<p class="font-14-white" style="font-weight:bold;font-size:15px"><span class="glyphicon">&#xe182;</span> 1900-5555-91</p>
			</div>
			<div class="col-xs-12 col-sm-12" style="text-align:center">
				<p class="font-14-white" style="font-weight:bold;font-size: 12px;">Copyright @ 2018. ALL Right Reserved</p>
			</div>
		</div>
	</div> <!-- /Footer -->
	<!-- jQuery -->
	<script src="/resources/sb-admin2/vendor/jquery/jquery.min.js"></script>
	
	<!-- CSS -->
	<style>
		.font-14-white	{
			font-family:Arial;
			font-size: 14px;
			color:white;
		}
	</style>

	<!-- Bootstrap Core JavaScript -->
	<script src="/resources/sb-admin2/vendor/bootstrap/js/bootstrap.min.js"></script>

	<!-- Metis Menu Plugin JavaScript -->
	<script src="/resources/sb-admin2/vendor/metisMenu/metisMenu.min.js"></script>

	<!-- Morris Charts JavaScript -->
	<script src="/resources/sb-admin2/vendor/raphael/raphael.min.js"></script>
	<script src="/resources/sb-admin2/vendor/morrisjs/morris.min.js"></script>
	<script src="/resources/sb-admin2/data/morris-data.js"></script>

	<!-- Custom Theme JavaScript -->
	<script src="/resources/sb-admin2/dist/js/sb-admin-2.js"></script>


</body>

</html>
