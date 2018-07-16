<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">
<head>
<meta charset="utf-8" />
<title>Simple Process Steps Template | PrepBootstrap</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0" />

<link rel="stylesheet" type="text/css"
	href="/resources/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css"
	href="/resources/font-awesome/css/font-awesome.min.css" />

<script type="text/javascript" src="/resources/js/jquery-1.10.2.min.js"></script>
<script type="text/javascript"
	src="/resources/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">

		<div class="page-header">
			<h1>
				Simple Process Steps <small>Bootstrap template, showing
					simple process steps</small>
			</h1>
		</div>

		<!-- Simple Process Steps - START -->
		<div class="container">
			<div class="row smpl-step"
				style="border-bottom: 0; min-width: 500px;">
				<div class="col-xs-3 smpl-step-step complete">
					<div class="text-center smpl-step-num">Step 1</div>
					<div class="progress">
						<div class="progress-bar"></div>
					</div>
					<a class="smpl-step-icon"><i class="fa fa-user"
						style="font-size: 60px; padding-left: 12px; padding-top: 3px; color: black;"></i></a>
					<div class="smpl-step-info text-center">Registe User via
						control panel.</div>
				</div>

				<div class="col-xs-3 smpl-step-step complete">
					<div class="text-center smpl-step-num">Step 2</div>
					<div class="progress">
						<div class="progress-bar"></div>
					</div>
					<a class="smpl-step-icon"><i class="fa fa-dollar"
						style="font-size: 60px; padding-left: 18px; padding-top: 5px; color: black;"></i></a>
					<div class="smpl-step-info text-center">Process Payment and
						fill out all required fields.</div>
				</div>
				<div class="col-xs-3 smpl-step-step active">
					<div class="text-center smpl-step-num">Step 3</div>
					<div class="progress">
						<div class="progress-bar"></div>
					</div>
					<a class="smpl-step-icon"><i class="fa fa-repeat"
						style="font-size: 60px; padding-left: 7px; padding-top: 7px; color: black;"></i></a>
					<div class="smpl-step-info text-center">Confirm Data entered
						in step 2.</div>
				</div>
				<div class="col-xs-3 smpl-step-step disabled">
					<div class="text-center smpl-step-num">Step 4</div>
					<div class="progress">
						<div class="progress-bar"></div>
					</div>
					<a class="smpl-step-icon"><i class="fa fa-download"
						style="font-size: 60px; padding-left: 8px; padding-top: 4px; color: black; opacity: 0.3;"></i></a>
					<div class="smpl-step-info text-center">Download product
						after receiving confirmation email.</div>
				</div>
			</div>
		</div>

		<style>
.smpl-step {
	margin-top: 40px;
}

.smpl-step {
	border-bottom: solid 1px #e0e0e0;
	padding: 0 0 10px 0;
}

.smpl-step>.smpl-step-step {
	padding: 0;
	position: relative;
}

.smpl-step>.smpl-step-step .smpl-step-num {
	font-size: 17px;
	margin-top: -20px;
	margin-left: 47px;
}

.smpl-step>.smpl-step-step .smpl-step-info {
	font-size: 14px;
	padding-top: 27px;
}

.smpl-step>.smpl-step-step>.smpl-step-icon {
	position: absolute;
	width: 70px;
	height: 70px;
	display: block;
	background: #5CB85C;
	top: 45px;
	left: 50%;
	margin-top: -35px;
	margin-left: -15px;
	border-radius: 50%;
}

.smpl-step>.smpl-step-step>.progress {
	position: relative;
	border-radius: 0px;
	height: 8px;
	box-shadow: none;
	margin-top: 37px;
}

.smpl-step>.smpl-step-step>.progress>.progress-bar {
	width: 0px;
	box-shadow: none;
	background: #428BCA;
}

.smpl-step>.smpl-step-step.complete>.progress>.progress-bar {
	width: 100%;
}

.smpl-step>.smpl-step-step.active>.progress>.progress-bar {
	width: 50%;
}

.smpl-step>.smpl-step-step:first-child.active>.progress>.progress-bar {
	width: 0%;
}

.smpl-step>.smpl-step-step:last-child.active>.progress>.progress-bar {
	width: 100%;
}

.smpl-step>.smpl-step-step.disabled>.smpl-step-icon {
	background-color: #f5f5f5;
}

.smpl-step>.smpl-step-step.disabled>.smpl-step-icon:after {
	opacity: 0;
}

.smpl-step>.smpl-step-step:first-child>.progress {
	left: 50%;
	width: 50%;
}

.smpl-step>.smpl-step-step:last-child>.progress {
	width: 50%;
}

.smpl-step>.smpl-step-step.disabled a.smpl-step-icon {
	pointer-events: none;
}
</style>

		<!-- Simple Process Steps - END -->

	</div>

</body>

</html>
