<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<meta http-equiv="imagetoolbar" content="no" />
<meta name="description" content="" />
<meta name="keywords" content="" />
<link rel="stylesheet" type="text/css" href="./css/destinationAdd.css">
<title>宛先情報登録画面</title>
</head>
<body>
	<jsp:include page="include_header.jsp" />
	<div class="main">
		こんにちは、
		<s:property value="user_id" />
	   さん！
		<h2>宛先情報を登録します。</h2>
		<h4>
			<span style="color: red"><s:property value="ERROR_MESSAGE" /></span>
		</h4>
		<s:form action="DestinationAddConfirmAction">
			<table>
				<tr>
					<th>氏名</th>
					<td><label>（姓）</label> <s:textfield name="family_name"
							placeholder="（例） 禅" /> <label>（名）</label> <s:textfield
							name="first_name" placeholder="（例）太郎" /> <span
						style="color: #ff0000; font-weight: bold;"><small><s:property
									value="errorFamilyName" /></small></span> <span
						style="color: #ff0000; font-weight: bold;"><small><s:property
									value="errorFirstName" /></small></span></td>
				</tr>
				<tr>
					<th>氏名（かな）</th>
					<td><label>（姓）</label> <s:textfield name="family_name_kana"
							placeholder="（例）ぜん" /> <label>（名）</label> <s:textfield
							name="first_name_kana" placeholder="（例）たろう" /> <span
						style="color: #ff0000; font-weight: bold;"><small><s:property
									value="errorFamilyNameKana" /></small></span> <span
						style="color: #ff0000; font-weight: bold;"><small><s:property
									value="errorFirstNameKana" /></small></span></td>
				</tr>
				<tr>
					<th>住所</th>
					<td><s:textfield name="user_address"
							placeholder="（例）東京都千代田区三番町◯-◯" size="50" /> <span
						style="color: #ff0000; font-weight: bold;"><small><s:property
									value="errorAddress" /></small></span></td>
				</tr>
				<tr>
					<th>電話番号</th>
					<td><s:textfield name="tel_number"
							placeholder="ハイフン（-）なしで入力してください" size="30" /> <span
						style="color: #ff0000; font-weight: bold;"><small><s:property
									value="errorTel" /></small></span></td>
				</tr>
				<tr>
					<th>E-mail</th>
					<td><s:textfield name="email" placeholder="（例）email@gmail.com"
							size="30" /> <span style="color: #ff0000; font-weight: bold;"><small><s:property
									value="errorEmail" /></small></span></td>
				</tr>
			</table>


			<s:submit value="実行する" />
		</s:form>
	</div>
	<jsp:include page="include_footer.jsp" />
</body>
</html>