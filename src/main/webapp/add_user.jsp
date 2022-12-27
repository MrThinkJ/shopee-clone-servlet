<%@page import="java.util.ArrayList"%>
<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="shortcut icon" href="./image/icon.ico" type="image/x-icon">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/all.min.css">
<script
	src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"
	integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js"
	integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF"
	crossorigin="anonymous"></script>
<script src="https://code.jquery.com/jquery-3.6.1.min.js"
	integrity="sha256-o88AwQnZB+VDvE9tvIXrMQaPlFFSUTR+nldQm1LuPXQ="
	crossorigin="anonymous"></script>
<link rel="stylesheet" href="resource/css/style-listProduct.css">
<title>Document</title>
</head>
<body>
	<form action="add_user" id="add-form" method="post">
		<div class='wrapper-add-form wrapper-form'>

			<div class='main-form'>
				Id
				<input class='Id' type='text' placeholder='Enter Id' value=''
					name='id'>
				FullName
				<input class='fullName' type='text' placeholder='Enter fullname' value=''
					name='fullName'>
				<div class='padding-bottom'></div>
				Age
				<input class='age' type='text' placeholder='Enter age' value=''
					name='age'>
				<div class='padding-bottom'></div>
				Gender
				<input class='gender' type='text' placeholder='Enter Gender'
					value='' name='gender'>
				<div class='padding-bottom'></div>
				Address
				<input class='address' type='text' placeholder='Enter Address'
					value='' name='address'>
				<div class='padding-bottom'></div>
				<button class='update-btn'>Add</button>
			</div>
		</div>
	</form>
</body>
</html>