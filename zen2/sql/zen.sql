set names utf8;
set foreign_key_checks = 0;
drop database if exists zen;

create database if not exists zen;
use zen;

/*
 * 会員情報テーブル
 */
drop table if exists user_info;

create table user_info(
id int not null primary key auto_increment,
user_id varchar(16) not null unique,
password varchar(16) not null,
family_name varchar(32) not null,
first_name varchar(32) not null,
family_name_kana varchar(32)not null,
first_name_kana varchar(32)not null,
sex tinyint default 0,
email varchar(50) not null,
logined tinyint default 0,
regist_date datetime not null
);


/*
 * 商品情報テーブル
 */
drop table if exists product_info;

create table product_info(
id int not null primary key auto_increment,
product_id int not null unique,
product_name varchar(100) not null unique,
product_name_kana varchar(100) not null unique,
product_description varchar(255) not null,
keywords varchar(255),
category_id int not null,
price int,
stock int,
image_file_path varchar(100),
image_file_name varchar(50)unique,
release_date date not null,
release_company varchar(50),
regist_date datetime not null
);


/*
 * カート情報テーブル
 */
drop table if exists cart_info;

create table cart_info(
id int not null primary key auto_increment,
user_id varchar(16) not null,
product_name varchar(100) not null,
product_count int not null,
price int not null,
regist_date datetime not null
);


/*
 * 購入履歴情報テーブル
 */
drop table if exists purchase_history_info;

create table purchase_history_info(
id int not null primary key auto_increment,
user_id varchar(16) not null,
product_name varchar(100) not null,
product_count int not null,
price int not null,
regist_date datetime not null
);


/*
 * 宛先情報テーブル
 */
drop table if exists destination_info;

create table destination_info(
id int not null primary key auto_increment,
user_id varchar(16) not null unique,
family_name varchar(32) not null,
first_name varchar(32) not null,
family_name_kana varchar(32)not null,
first_name_kana varchar(32)not null,
email varchar(50) not null,
tel_number varchar(32) not null,
user_address varchar(100) not null,
regist_date datetime not null
);


insert into user_info(user_id,password,family_name,first_name,family_name_kana,first_name_kana,sex,email,regist_date)VALUES("jiro","1234","田中","次郎","タナカ","ジロウ","0","yyyy@gmail.com",now());
insert into purchase_history_info(user_id,product_name,product_count,price,regist_date)VALUES("jiro","辛口日本酒","1","1500",now());
insert into product_info(product_id, product_name, product_name_kana, price, image_file_path, image_file_name, product_description,category_id,release_date,release_company,regist_date,stock)values(1,"a","あ",10,"./images/1.jpg","1.jpg","",1,now(),"",now(),50),
(2,"i","い",20,"./images/2.jpg","2.jpg","",1,now(),"",now(),50),
(3,"u","う",30,"./images/3.jpg","3.jpg","",1,now(),"",now(),50),
(4,"e","え",40,"./images/4.jpg","4.jpg","",1,now(),"",now(),50),
(5,"o","お",50,"./images/5.jpg","5.jpg","",1,now(),"",now(),50),
(6,"ka","か",60,"./images/6.jpg","6.jpg","",1,now(),"",now(),50),
(7,"ki","き",70,"./images/7.jpg","7.jpg","",1,now(),"",now(),50),
(8,"ku","く",80,"./images/8.jpg","8.jpg","",1,now(),"",now(),50),
(9,"ke","け",90,"./images/9.jpg","9.jpg","",1,now(),"",now(),50),
(10,"ko","こ",100,"./images/10.jpg","10.jpg","",1,now(),"",now(),50);