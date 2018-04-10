<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
     <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>パスワード再設定画面</title>
</head>
<body>
<div id="main">
<h1>パスワード再設定画面</h1>
</div>
<s:if test= "errorMessage!=ull">
<s:property value= "errorMessage"/>
</s:if>
<s:form action="ResetPasswordConfirmAction">
<s:textfield name="loginId" placeholder="1～8文字以内半角英数字"/>
<s:password name="password" placeholder="1～16文字以内半角英数字"/>
<s:password name="passwordConfirm" placeholder="1～16文字以内半角英数字"/>
<s:submit value="再設定"/>
</s:form>
</body>
</html>