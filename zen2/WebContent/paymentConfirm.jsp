<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta http-equiv="Content-Style-Type" content="text/css"/>
		<meta http-equiv="Content-Script-Type" content="text/javascript"/>
		<meta http-equiv="imagetoolbar" content="no"/>
		<meta name="description" content=""/>
		<meta name="keywords" content=""/>

		<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>

		<title>決済確認画面</title>
		<style type="text/css">
		/* ======TAG LAYOUT====== */

			 body{
			 	margin:0;
			 	padding:0;
			 	line-height:1.6;
			 	letter-spacing:1px;
			 	font-family:Verdana,Helvetica,sans-serif;
			 	font-size:12px;
			 	color:#333;
			 	background:#fff;
			 }

			 table{
			 		text-align:center;
			 		margin:0 auto;
			 }
		/* ======ID LAYOUT====== */

			#top{
			 width:780px;
			 margin:30px auto;
			 border:1px solid #333;
			}

			#header{
			 width:100%;
			 height:80px;
			 background-color:black;
			}

			#main{
			 width:100%;
			 height:500px;
			 text-align:center;
			}

			#footer{
					width:100%;
					height:80px;
					background-color:black;
					clear:both;
			}
	</style>
	<script type="text/javascript">
			function submitAction(url){
				$('form').attr('action',url);
				$('form').attr();
			}
	</script>



</head>
<body>
		<div id="header">
				<div id="pr">
				</div>
		</div>
		<div id="main">
				<div id="top">
						<p>購入</p>
				</div>
				<div>
						<s:form>

				<tr>
						<td>商品名</td>
						<td><s:property value="session.product_name"/></td>
				</tr>
				<tr>
						<td>値段</td>
						<td><s:property value="session.total_price"/><span>円</span></td>
				</tr>
				<tr>
						<td>個数</td>
						<td><s:property value="session.product_count"/><span>個</span></td>
				</tr>

				<tr>
						<td><br></td>
				</tr>

				<!-- 選択した宛先 -->
								<tr>
									<td>
										<span>お届けする住所</span>

								<td>
										<span>お名前</span>
								</td>
								<td>
								<s:property value="#session.family_name"/><s:property value="#session.first_name"/>
								</td>
								</tr>

								<tr>
								<td>
										<span>ふりがな</span>
								</td>
								<td>
								<s:property value="#session.family_name_kana"/><s:property value="#session.first_name_kana"/>
								</td>
								</tr>

								<tr>
								<td>
										<span>メールアドレス</span>
								</td>
								<td>
								<s:property value="#session.email"/>
								</td>
								</tr>

								<tr>
								<td>
										<span>電話番号</span>
								</td>
								<td>
								<s:property value="#session.tel_number"/>
								</td>
								</tr>

								<tr>
								<td>
										<span>住所</span>
								</td>
								<td>
								<s:property value="#session.user_address"/>
								</td>
								</tr>

								<tr>
									<td><input type="button" value="戻る"
										onclick="submitAction('PaymentAction')"/></td>
									<td><input type="button" value="お届け先入力へ"
										onclick="submitAction('DestinationAddAction')"/></td>
								</tr>
						</s:form>


				</div>
		</div>
		<div id="footer">
				<div id="pr">
				</div>
		</div>


</body>
</html>