<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
      <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
      <meta http-equiv="Content-Style-Type" content="text/css" />
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

      <script type="text/javascript" src="./js/script.js"></script>
      <link rel="stylesheet" href="./css/home2.css">
      <title>HOME</title>
  <body>

  <div id="image-wrap"></div>

  <header id="header-wrapper">
   <ul>
     <li><a href='<s:url action="LoginAction"/>'>ログイン</a></li>
     <li><a href='<s:url action="ProductListAction"/>'>商品一覧</a></li>
     <li><a href='<s:url action="MyPageAction"/>'>マイページ</a></li>
   </ul>
  </header>

  <p class="zen">禅</p>

  <footer id="footer-menu">
   <div id="inquiry"><a href='<s:url action="InquiryAction"/>'>お問い合わせ</a></div>
   <div id="company">&copy;ZEN</div>
  </footer>







  </body>
</html>