<%@ page language="java" contentType="text/html; charset=UTF-8"
 	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<meta http-equiv="imagetoolbar" content="no" />
<meta name="description" content="" />
<meta name="keywords" content="" />
<link rel="stylesheet" type="text/css" href="./css/destinationAddComplete.css">
<title>宛先情報完了画面</title>
</head>
<body>
 	<jsp:include page="include_header.jsp" />
 	<div class="main">
 		こんにちは、
 		<s:property value="user_id" />
 		さん！



 		<h2>
 			<s:property value="SUCCESS_MESSAGE" />
 		</h2>



 		<div id="text-center">
 			<s:form action="PaymentAction">
 				<s:submit value="決済画面へ" />
 			</s:form>
 		</div>
 	</div>
 	<jsp:include page="include_footer.jsp" />
</body>
</html>