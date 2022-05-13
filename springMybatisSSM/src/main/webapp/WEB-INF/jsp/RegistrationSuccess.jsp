<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script type="text/javascript" src="${pageContext.request.contextPath}/res/jquery/jquery-3.4.1.min.js"></script>
<title>Registration result</title>
</head>
<style type="text/css">
	span {
		display: inline-block;
		width: 110px;
		margin: 5px 5px 5px 5px; 
		text-align: left;
	}
</style>
<body>
	<div align="center">
		<h2 id="result">${title}</h2>
		<div id="infoDiv">
			<span>Id:</span><span>${emp_result.id}</span></br>
			<span>Full name:</span><span>${emp_result.fullname}</span></br>
			<span>E-mail:</span><span>${emp_result.email}</span></br>
			<span>Date of birth:</span><span>${emp_result.birthday}</span></br>
			<span>Profession:</span><span>${emp_result.profession}</span></br>
			<span>FinishedMilitary:</span><span id="military">${emp_result.finishedMilitary}</span></br>
			<span>Gender:</span><span id="gender">${emp_result.gender}</span></br>
			<span>Note:</span><span>${emp_result.note}</span></br>
		</div>
		<p><a href="register">Go to registration form</a></p>
	</div>
</body>
</html>s
<script type="text/javascript">
	$("#infoDiv").hide();
	
	 var genderChg = function(){
		 if("M" === $("#gender").text()){
			 $("#gender").text("Male");
		 }else if("F" === $("#gender").text()){
			 $("#gender").text("Female");
		 } 
	 }
	 
	 var militaryChg = function(){
		 if("T" === $("#military").text()){
			 $("#military").text("True");
		 }else if("F" === $("#military").text()){
			 $("#military").text("False");
		 } 
	 }
	
	if('Registration Failure' === $('#result').text()){		
		$("#result").css("color","red");
	}else if('Registration Success' === $('#result').text()){
		genderChg();
		militaryChg();
		$("#result").css("color","green");
		$("#infoDiv").show();
	}	
	
</script>
