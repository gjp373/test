<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<meta http-equiv="imagetoolbar" content="no" />
<meta name="description" content="" />
<meta name="keywords" content="" />

<title>宛先情報登録画面</title>
</head>
<body>
<p>宛先情報を登録します。</p>

<br><br>
<s:form action="DestinationAddConfirmAction">
	<s:textfield label="姓" name="family_name" />
	<s:textfield label="名" name="first_name"/>
	<s:textfield label="姓（ふりがな）" name="family_name_kana"/>
	<s:textfield label="名（ふりがな）" name="first_name_kana"/>
<%-- 	<s:radio list="#{0:'男性', 1:'女性'}" name="gender" value="0"></s:radio>
	<br>
--%>
 	<s:textfield label="住所" name="user_address" />
	<s:textfield label="電話番号" name="tel_number" />
	<s:textfield label="E-mail" name="email" />
	<s:submit value="実行する" />
</s:form>

</body>
</html>