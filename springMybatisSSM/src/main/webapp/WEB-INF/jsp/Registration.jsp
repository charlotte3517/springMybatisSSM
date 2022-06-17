<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script type="text/javascript" src="${pageContext.request.contextPath}/res/jquery/jquery-3.4.1.min.js"></script>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/res/datetimepicker/jquery.datetimepicker.css" />
<script src="${pageContext.request.contextPath}/res/datetimepicker/jquery.js"></script>
<script src="${pageContext.request.contextPath}/res/datetimepicker/jquery.datetimepicker.full.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/res/jquery/validation_1.19.3/jquery.validate.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/res/jquery/validation_1.19.3/additional-methods.min.js"></script>
<title>User Registration</title>
<style type="text/css">
	.errorBk, label[class=error]{
		text-align: left;
		display:block;
		width:413px;		
		color:red;
	}
	label {
		display: inline-block;
		width: 200px;
		margin: 5px 5px 5px 5px; 
		text-align: left;
	}
	input[type=text],input[type=password],select{
		width: 200px
	}
	select{
		width: 208px
	}
	button {
		margin: 5px 5px 5px 5px;
		padding: 10px;
	}
	input[type=checkbox]{
		display: inline-block;
		margin-right: 190px;
	}
	input[type=radio]{
		display: inline-block;
		margin-left: 45px;
	}

</style>
</head>
<body>
	<div align="center">
		<h1>User Registration</h1>
		<form:form action="registerInp" method="post" modelAttribute="emp" id="form">
			<form:label path="id">Id</form:label>
			<form:input path="id" name="id"/><br/>
			<div class="errorBk">${id}</div><br/>
			<form:label path="fullname">Full Name</form:label>
			<form:input path="fullname" name="fullname"/><br/>
			<div class="errorBk">${fullname}</div><br/>
			<form:label path="email">E-mail:</form:label>
			<form:input path="email"/><br/><br/>
			<div class="errorBk">${email}</div><br/>
			<form:label path="birthday">Birthday (yyyy-mm-dd)</form:label>
			<form:input path="birthday" id="birthday" type="text"/><br/>
			<div class="errorBk">${birthday}</div><br/>
			<form:label path="profession">Profession:</form:label>
			<form:select path="profession" items="${professionList}"/><br/>
			<div class="errorBk">${profession}</div><br/>
			<form:label path="finishedMilitary">FinishedMilitary:</form:label>
			<input type="checkbox" id="finishedMilitary_chk"/><br/>
			<form:input path="finishedMilitary" id="finishedMilitary" style="display:none"/>
			<form:label path="gender">Gender:</form:label>
			<form:radiobutton path="gender" value="M"/>Male
			<form:radiobutton path="gender" value="F"/>Female<br/>									
			<div class="errorBk">${gender}</div><br/>
			<form:label path="note">Note:</form:label>
			<form:textarea path="note" cols="25" rows="5"/></br>	
			<form:button id="buttom">Register</form:button>
		</form:form>
	</div>

</body>
</html>
<script>
	var MilIsChk = $( "#finishedMilitary_chk" ).prop("checked");
	
	$('#buttom').click(function(){
			       $('.errorBk').text("");			   
	});
	
	$( "#finishedMilitary_chk" ).on( "change", function() {
		MilIsChk = $( "#finishedMilitary_chk" ).prop("checked");
		milSetValue();
	});
	
	var milSetValue = function(){
		if(true === MilIsChk){
			$( "#finishedMilitary" ).val("T");
		}else if (false === MilIsChk){
			$( "#finishedMilitary" ).val("F");
		}		
	}
	
	milSetValue();
    
    $('#birthday').datetimepicker({
    theme: '',              //theme: 'dark',
    timepicker:false,       //timepicker:true,
    step: 1,                //step: 60 (這是timepicker的預設間隔60分鐘)
    format:'Y-m-d',         //format:'Y-m-d H:i:s',
    minDate:'1900-01-01',
     maxDate: '0'
    });
    

    
    $(function () {    	
        $('#form').validate({
            onsubmit:true,
            rules:{
                'id': {
                    required: true,
                },
                'fullname': {
                    required: true,
                },
                'email': {
                    required: true,
                }                
            },
            messages:{
                'id': {
                    required:'Id cannot be empty',
                },
	            'fullname': {
	                required:'Full Name cannot be empty',
	            },
	            'email': {
	                required:'E-mail cannot be empty',
	            }
            },            
        });
    });
    

    
</script>