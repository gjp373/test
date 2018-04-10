<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta http-equiv="Content-Style-Type" content="text/css" />
		<meta http-equiv="Content-Script-Type" content="text/javascript" />
		<meta http-equiv="imagetoolbar" content="no" />
		<meta name="description" content="" />
		<meta name="keywords" content="" />
		<title>決済画面</title>
		<style type="text/css">
		/* ========TAG LAYOUT======== */

				body {
			        margin:0;
					padding:0;
					line-height:1.6;
					letter-spacing:1px;
					font-family:Verdana, Helvetica, sans-serif;
					font-size:12px;
					color:#333;
					background:#fff;
					 }
				table {
					text-align:center;
					margin:0 auto;
				      }

		/* ========ID LAYOUT======== */

				#top {
					width:780px;
					margin:30px auto;
					border:1px solid #333;
					}
				#header {
					width: 100%;
					height: 80px;
					background-color: black;
					}
				#main {
					width: 100%;
					height: 500px;
					text-align: center;
					}
				#footer {
					width: 100%;
					height: 80px;
					background-color: black;
					clear:both;
					}
</style>


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
				<s:form action="PaymentAction">
						<table>
								<tr>
										<td>
												<span>商品名</span>
										</td>
										<td>
												<s:property value="session.product_name"/><br>
										</td>
								</tr>

								<tr>
										<td>
												<span>値段</span>
										</td>
										<td>
												<s:property value="session.price"/><span>円</span>
										</td>
								</tr>

								<tr>
										<td>
												<span>購入個数</span>
										</td>
										<td>
												<select name="count">
														<option value="1"selected="selected">1</option>
														<option value="2">2</option>
														<option value="3">3</option>
														<option value="4">4</option>
														<option value="5">5</option>
												</select>
										</td>
								</tr>
                                     <!-------- 宛先情報選択 -------->
								<tr>
									<td>
										<span>宛先選択</span>

								<tr>
								<tr>
								<td>
								<s:if test="destAddList == null">
									<span>宛先情報はありません。登録してください。</span>
								</s:if>
								</td>
								</tr>
								<tr>
								<td>
								<s:elseif test="message == null">
									<span>ご希望の宛先を選択してください。</span>
								</s:elseif>
								</td>
								</tr>
								<s:iterator id="list" value="#session.Addlist">
									<input type="radio" name="radio" value="%{destinationId}">
								<tr>
								<td>
										<span>お名前</span>
								</td>
								<td>
								<s:property value="family_name"/><s:property value="first_name"/>
								<s:hidden name="id" value="%{id}"/>
								<s:hidden name="user_id" value="%{user_id}"/>
								<s:hidden name="family_name" value="%{family_name}"/>
								<s:hidden name="first_name" value="%{first_name}"/>
								</td>
								</tr>

								<tr>
								<td>
										<span>ふりがな</span>
								</td>
								<td>
								<s:property value="family_name_kana"/><s:property value="first_name_kana"/>
								<s:hidden name="family_name_kana" value="%{family_name_kana}"/>
								<s:hidden name="first_name_kana" value="%{first_name_kana}"/>
								</td>
								</tr>

								<tr>
								<td>
										<span>メールアドレス</span>
								</td>
								<td>
								<s:property value="email"/>
								<s:hidden name="email" value="%{email}"/>
								</td>
								</tr>

								<tr>
								<td>
										<span>電話番号</span>
								</td>
								<td>
								<s:property value="tel_number"/>
								<s:hidden name="tel_number" value="%{tel_number}"/>
								</td>
								</tr>

								<tr>
								<td>
										<span>住所</span>
								</td>
								<td>
								<s:property value="user_address"/>
								<s:hidden name="user_address" value="%{user_address}"/>
								<s:hidden name="regist_date" value="%{regist_date}"/>
								</td>
								</tr>

								</s:iterator>
										<td>
												<s:submit value="購入"/>
										</td>
								</tr>
						</table>
					</s:form>

								<div>
									<p>カートに戻る場合は<a href='<s:url action="CartAction"/>'>こちら</a></p>

								</div>
				</div>
		</div>
		<div id="footer">
			<div id="pr">
			</div>
		</div>

</body>
</html>