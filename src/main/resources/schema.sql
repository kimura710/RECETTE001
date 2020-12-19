create table if not exists menu(
id integer not null primary key auto_increment,
title varchar(50) not null,
course varchar(10),
recette varchar(1000),
memo varchar(1000)
);

CREATE TABLE IF NOT EXISTS m_user (
  user_id VARCHAR(50) PRIMARY KEY,
  password VARCHAR(255),
  pass_update_date datetime default '2099-12-31 23:59:59',
  login_miss_times INT default 0,
  account_unlock boolean default true,
  tenant_id VARCHAR(50) default 'tenant',
  user_name VARCHAR(50) default 'システム管理者',
  mail_address VARCHAR(50) default 'system@xxx.co.jp',
  enabled BOOLEAN default true,
  user_due_date datetime default '2099-12-31 23:59:59'
);

/* 権限マスタテーブル */
CREATE TABLE IF NOT EXISTS m_role (
  role_id VARCHAR(50) PRIMARY KEY,
  role_name VARCHAR(100)
);

/* ユーザー権限テーブル */
/* ユーザーと権限を紐付けるテーブル */
CREATE TABLE IF NOT EXISTS t_user_role (
  id INT PRIMARY KEY,
  user_id VARCHAR(50),
  role_id VARCHAR(50) default 'admin'
);