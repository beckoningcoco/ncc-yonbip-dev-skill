# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9739.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_vouchhead | pk_vouchhead | pk_vouchhead | char(20) | √ |
| 2 | adjvouch_srctype | adjvouch_srctype | adjvouch_srctype | number(38, 0) |
| 3 | alone_id | alone_id | alone_id | char(32) |  |  | '~' |
| 4 | cancelstate | cancelstate | cancelstate | char(1) |  |  | 'N' |
| 5 | checkdate | checkdate | checkdate | char(19) |
| 6 | checker | checker | checker | varchar2(20) |  |  | '~' |
| 7 | dataorigin | dataorigin | dataorigin | varchar2(50) |
| 8 | error | error | error | varchar2(500) |
| 9 | errorstate | errorstate | errorstate | char(1) |  |  | 'N' |
| 10 | input_date | input_date | input_date | char(19) |
| 11 | iorder | iorder | iorder | varchar2(40) |
| 12 | key1 | key1 | key1 | varchar2(40) |
| 13 | key2 | key2 | key2 | varchar2(40) |
| 14 | key3 | key3 | key3 | varchar2(40) |
| 15 | key4 | key4 | key4 | varchar2(40) |
| 16 | key5 | key5 | key5 | varchar2(40) |
| 17 | key6 | key6 | key6 | varchar2(40) |
| 18 | key7 | key7 | key7 | varchar2(40) |
| 19 | key8 | key8 | key8 | varchar2(40) |
| 20 | key9 | key9 | key9 | varchar2(40) |
| 21 | key10 | key10 | key10 | varchar2(40) |
| 22 | pk_adjscheme | pk_adjscheme | pk_adjscheme | varchar2(20) |  |  | '~' |
| 23 | pk_dxrela | pk_dxrela | pk_dxrela | varchar2(20) |  |  | '~' |
| 24 | pk_dxscheme | pk_dxscheme | pk_dxscheme | varchar2(20) |  |  | '~' |
| 25 | pk_dxtype | pk_dxtype | pk_dxtype | varchar2(20) |
| 26 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 27 | pk_hbscheme | pk_hbscheme | pk_hbscheme | varchar2(20) |  |  | '~' |
| 28 | pk_keygroup | pk_keygroup | pk_keygroup | varchar2(20) |  |  | '~' |
| 29 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 30 | pk_user | pk_user | pk_user | varchar2(20) |  |  | '~' |
| 31 | vouch_type | vouch_type | vouch_type | number(38, 0) |
| 32 | creationtime | creationtime | creationtime | char(19) |
| 33 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 34 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 35 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 36 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 37 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |