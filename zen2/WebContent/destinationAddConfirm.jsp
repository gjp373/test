<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<meta http-equiv="imagetoolbar" content="no" />
<meta name="description" content="" />
<meta name="keywords" content="" />
<title>宛先情報確認画面</title>

</head>
<body>
<h3>登録する宛先情報は以下でよろしいですか？</h3>
	<s:form action="DestinationAddCompleteAction">
		<label>姓：</label>
		<s:property value="family_name" escape="false" />
		<br>
		<label>名：</label>
		<s:property value="first_name" escape="false" />
		<br>
		<label>姓（ふりがな）：</label>
		<s:property value="family_name_kana" escape="false" />
		<br>
		<label>名（ふりがな）：</label>
		<s:property value="first_name_kana" escape="false" />
		<br>
		<label>住所：</label>
		<s:property value="user_address" escape="false" />
		<br>
		<label>電話番号：</label>
		<s:property value="tel_number" escape="false" />
		<br>
		<label>メールアドレス：</label>
		<s:property value="email" escape="false" />
		<s:submit value="完了" />
	</s:form>
</body>
</html>