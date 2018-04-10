<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
      <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
      <meta http-equiv="Content-Style-Type" content="text/css" />
      <meta http-equiv="Content-Script-Type" content="text/javascript" />
      <meta http-equiv="imagetoolbar" content="no" />
      <meta name="description" content="" />
      <meta name="keywords" content="" />
      <title>Login画面</title>
      <script>
      /* 全角では入力できないように */
 	      function checkForm($this){
 		       var str = $this.value;
 		       if(str.match(/[^A-Z^a-z0-9]+/)){
 			           alert('IDは半角英数字で入力してください。');
 		               $this.value = "";
 		       }
 	      }
      </script>

</head>
<body>
<!--
	<s:if test="errorFlg==true">
		<s:property value="errorMessage"/>
	</s:if>
 -->
      <s:form action="LoginAction">
             <s:if test ="%{#session.saveId != null}"><div class="id"><label><s:checkbox name ="saveLogin" checked ="checked"/>ID保存</label></div></s:if>
             <s:else><div class="id"><label><s:checkbox name ="saveLogin"/>ID保存</label></div></s:else>
             <h3>IDを入力してください</h3>
             <s:textfield type="text" id="loginUserId" class="form" placeholder="1文字以上8文字以下" name="loginUserId" maxlength ='8' value ="%{#session.saveId}" style="ime-mode:disabled" onInput="checkForm(this)" oncopy="return false" onpaste="return false" oncontextmenu="return false" />
             <h3>パスワードを入力してください</h3>
             <s:password class="form" placeholder="1文字以上8文字以下" name="loginPassword" style="ime-mode:disabled" />
             <s:submit value="ログイン"/><br>
      </s:form>

         <span>新規ユーザー登録は
              <a href='<s:url action="UserCreateAction"/>'>こちら</a><br>
         </span>
         <span>パスワード再設定は
              <a href='<s:url action="ResetPasswordAction"/>'>こちら</a><br>
         </span>

</body>
</html>
