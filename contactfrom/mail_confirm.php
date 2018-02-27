<!DOCTYPE html>
<html lang="ja">

<head>
  <meta charset="UTF-8">
 <title>お問い合わせフォームを作る</title>
  <link rel="stylesheet" type="text/css"
herf="style4.css">
</head>


<body>
  <h1>お問い合わせ内容確認</h1>  
  
  <div class="confirm">
   <p>お問い合わせ内容はこちらでよろしいでしょうか？
   <br>よろしければ「送信する」ボタンを押してください。
   </p>
   <p>名前
     <br>
       <?php echo $_post['name'];?>
   </p>
      
   <p>メールアドレス
    <br>
      <?php echo $_post['mail'];?>
   </p>
      
   <p>年齢
    <br>
     <?php echo $_post['age'];?>
   </p>
      
   <p>コメント
    <br>
    <?php echo $_post['comments'];?>
   </p>  
      
   <from action="index3.html">
     <input type="submit" class="button1" value="戻って修正する"/>    
   </from>  
      
   <from action="insert.php" methot="post">
     <input type="submit" class="button2" value="登録する"/>
     <input type="hidden" value="<?php echo $_post['name'];?>" name="name">
     <input type="hidden" value="<?php echo $_post['mail'];?>" name="mail">
     <input type="hidden" value="<?php echo $_post['age'];?>" name="age">
     <input type="hidden" value="<?php echo $_post['comments'];?>" name="comments">
   </from>
      
    </div>  
    
</body>
</html>