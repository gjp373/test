<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
     <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;charset=utf-8"/>
<meta http-equiv="Content-Style-Type" content="text/css"/>
<meta http-equiv="Content-Script-Type" content="text/javascript"/>
<meta http-equiv="imagetoolbar" content="no"/>
<meta name="description" content=""/>
<meta name="keywords" content=""/>
<link rel="stylesheet" type="text/css" href="./css/resetPasswordConfirm.css">
<title>利用者情報登録確認</title>
<style type="text/css">
.heading{
font-size:18px;/*フォントの大きさ*/
border: 1px solid #ccc;/*したのボーダー*/
border-top: 2px solid #16a765;/*上のボーダー*/
margin-bottom: 15px;
padding:8px 15px;
}

.resetpasswordconfirm p {
font-size:20px;
}

.text-center{
text-align: center;
}

</style>
<script>
function goResetPasswordCompleteAction(){
	document.getElementById("form").action = "ResetPasswordCompleteAction";
}
function goResetPasswordAction(){
	document.getElementById("form").action = "ResetPasswordAction";
}
</script>
</head>
<body>

<jsp:include page="include_header.jsp" flush="true" />

	<div id="haikei">





<!-- パスワード再設定画面はここから -->
<div id="top">
<p>利用者情報変更確認</p>
<p>変更内容の確認をしてください。誤りがなければ【この内容で登録する】
ボタンを押してください。修正を行う場合、【修正する】ボタンを押してください。</p>
</div>


<s:form action="ResetPasswordCompleteAction" id="form">
<div class="text-center">
<div>
<s:property value="loginUserId"/>
<s:hidden name="loginUserId" value="%{loginUserId}"/>
</div>
<div>
<s:property value="loginPassword"/>
<s:hidden name="loginPassword" value="%{loginPassword}"/>
</div>
<s:submit class="button" value="この内容で登録する" onclick="goResetPasswordCompleteAction();"/>
<s:submit class="button" value="修正する" onclick="goResetPasswordAction();"/>
</div>
</s:form>
</div>
<jsp:include page="include_footer.jsp" flush="true" />
</body>
</html>