INSERT INTO m_user 
VALUES('user',
  '$2a$10$xRTXvpMWly0oGiu65WZlm.3YL95LGVV2ASFjDhe6WF4.Qji1huIPa',
  '2099-12-31 23:59:59',
  0,
  true,
  'tenant',
  'システム管理者',
  'system@xxx.co.jp',
  true,
  '2099-12-31 23:59:59');
  
INSERT INTO t_user_role
(id, user_id, role_id)
VALUES
(1, 'user','admin');
  
INSERT INTO m_role
(role_id, role_name)
VALUES
('admin','ROLE_ADMIN');

INSERT INTO 
menu
values
(1,
'ミートソース',
'10人前\r\n
玉ねぎ5個\r\n
挽肉2キロ\r\n
トマト缶2缶\r\n
タイム2枚\r\n
ローリエ適量\r\n
バター少々
',
'①玉ねぎをシュエする\r\n
②きつね色になったらいったんとりだしに挽肉をいれる\r\n
③焦げ目がつくぐらい強火で\r\n
④炒まったら戻した玉ねぎ、塊を砕いたトマト缶をいれる\r\n
⑤タイム、ローリエを入れ少し弱火にし煮詰める\r\n
⑥トマトの酸味が少しとんだら味を整え完成');


