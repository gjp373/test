<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<meta http-equiv="imagetoolbar" content="no" />
<meta name="description" content="" />
<meta name="keywords" content="" />
<title>商品一覧</title>
</head>
<body>
<h3>商品一覧</h3>
	<s:iterator value="productList">
	<a href="<s:url action="ProductDetailsAction"><s:param name="product_id" value="%{product_id}" /></s:url>">
		<img class="image" src="<s:property value='image_file_path'/>" alt="Photo" width="250" height="200">
		<table>
			<tr>
				<td class="nowrap">商品名</td>
				<td>:</td>
				<td><s:property value="product_name" /></td>
			</tr>
			<tr>
				<td class="nowrap">商品名かな</td>
				<td>:</td>
				<td><s:property value="product_name_kana" /></td>
			</tr>
			<tr>
				<td class="nowrap">価格</td>
				<td>:</td>
				<td><s:property value="price" />円</td>
				</tr>
		</table>
	</a>
</s:iterator>
</body>
</html>