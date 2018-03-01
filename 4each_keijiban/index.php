<!DOCSTYLE html>
<html lang="ja">

<head>
 <meta charset="UTF-8">
 <title>掲示板</title>
 <link rel="stylesheet" type="text/css" href="style.css">
</head>
    
<body>
 
 <img src="4eachblog_logo.jpg">
    
 <header>
  <ul>
   <li>トップ</li>
   <li>プロフィール</li>
   <li>4eachについて</li>
   <li>登録フォーム</li>
   <li>問い合わせ</li>
   <li>その他</li>
  </ul> 
      
  <h1>プログラミングに役立つ掲示板</h1>    
 </header> 
 

  
    
 <main>
 
    

  <form method="post" action="insert.php">
      
   <h1>入力フォーム</h1>
      
   <biv>
    <labele>ハンドルネーム</labele>
    <br>
    <input type="text" class="text" size="35" name="handlename"> 
   </biv>  
    
   <div>
    <labele>タイトル</labele>
    <br>
    <input type="text" class="text" size="35" name="comments">
   </div> 
     
   <div>
    <labele>コメント</labele>
    <br>
    <textarea cols="40" row="10" class="text"></textarea>
   </div>
      
   <div>
    <input type="submit" value="投稿する"　class="submit"> 
   </div>
  </form>
  
    
    </main>   
    
    
    
    
</body>
</html>