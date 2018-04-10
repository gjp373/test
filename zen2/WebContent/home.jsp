<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
      <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
      <meta http-equiv="Content-Style-Type" content="text/css" />
      <link rel="stylesheet" href="./css/home.css">

      <title>HOME</title>

       <link rel="stylesheet" href="https://cdn.jsdelivr.net/bxslider/4.2.12/jquery.bxslider.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://cdn.jsdelivr.net/bxslider/4.2.12/jquery.bxslider.min.js"></script>

  <script>
    $(document).ready(function(){
      $('.slider').bxSlider({
    	  auto:true,
    	  mode:'fade',
    	  speed:1000,
    	  sidewidth:50
      });
    });
  </script>

</head>
<body>
<header>

 <ul>
 　 <li>
  	 <a href='<url action="LoginAction">'>ログイン</a>
    </li>

    <li>
     <a href='<url action="MyPageAction">'>マイページ</a>
    </li>

    <li>
     <a href='<url action="ProductListAction">'>商品一覧</a>
    </li>

    <li>
     カート
    </li>
 </ul>
</header>


 <main>
 <div class="back"></div>
 <div class="slide-wrapper">
     <div class="slider">
    <div><img src="./image/itiro.jpg"></div>
    <div><img src="./image/kitayuki.jpg"></div>
    <div><img src="./image/koubo.jpg"></div>
  </div>
</div>


</main>

</body>
</html>