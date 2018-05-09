<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Xsport</title>
<script src="http://code.jquery.com/jquery-2.2.4.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css">
</head>
<body>
	<div class="container">
		<form action="doLogin" method="POST">
			<div class="row">
				<div class="col-md-4">帳號</div>
				<div class="col-md-6">
					<input type="text" name="userId" required="required">
				</div>
			</div>
			<div class="row">
				<div class="col-md-4">密碼</div>
				<div class="col-md-6">
					<input type="password" name="userPswd" required="required">
				</div>
			</div>
			<div class="row">
				<div class="col-md-12">
					<button type="submit">確認</button>
					<button type="reset">重填</button>
				</div>
			</div>
		</form>
	</div>
</body>
</html>