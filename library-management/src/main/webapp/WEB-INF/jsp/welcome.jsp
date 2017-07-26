<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en" ng-app ="managementapp">
<head>
	<link rel="stylesheet" type="text/css" href="webjars/bootstrap/3.3.7/css/bootstrap.min.css" />
	<link href="${jstlCss}" rel="stylesheet" />
	<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.3.3/angular.min.js"></script>
	<script src="resources/js/controller/LoginController.js"></script>
	<script src="resources/js/service/dataservice.js"></script>
</head>
<body ng-controller="LoginController">
	<nav class="navbar navbar-inverse">
		<div class="container">
			<div class="navbar-header">
				<a class="navbar-brand" href="#">Library Management System</a>
			</div>
		</div>
	</nav>

	<div class="container">

		<div class="starter-template">
			<!-- h1>Spring Boot Web JSP Example</h1>
			<h2>Message: ${message}</h2-->
			<h2>Enter login details :</h2>
			<label>Login Name :</label>
			<input type="text" name="user name" id="user name"
						placeholder="Enter login name" ng-model="loginUsername"
						on-keyup-fn="save" on-keyup-keys="[13]" focus-me="focusVarName"
						class="username"/>
			<br>
			<br>
			<br>
			<label>Password :</label>
			<input type="password" name="password" id="password"
			placeholder="Enter password" ng-model="loginPassword"
			on-keyup-fn="save" on-keyup-keys="[13]" class="password"  autocomplete="off" />	
			<br>
			<br>
			<br>
			<button name="doLogin" id="sumbitLogin" ng-click="doLogin();">Sign in</button>
			
		</div>

	</div>

	<script type="text/javascript" src="webjars/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</body>

</html>