<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Content-Style-Type" content="text/css"/>
<meta http-equiv="Content-Style-javascript" content="text/javascript"/>
<title>MyPage画面</title>
</head>


<body>
<header></header>

<div class="main">

<p>会員情報</p>

 <s:iterator value="myPageList">
  名前 <s:property value="familyName"/><s:property value="firstName"/>
  ふりがな <s:property value="familyNameKana"/><s:property value="firstNameKana"/>
  性別 <s:property value="sex"/>
  メールアドレス <s:property value="email"/>
  ユーザーID <s:property value="userId"/>
  パスワード <s:property value="password"/>
 </s:iterator>




<p><a href='<s:url action="BuyItemHistoryAction"/>'>購入履歴</a></p>
<p><a href='<s:url action="LogoutAction"/>'>ログアウト</a></p>
<p><a href='<s:url action="GoHomeAction"/>'>HOME</a></p>

</div>


</body>
</html>