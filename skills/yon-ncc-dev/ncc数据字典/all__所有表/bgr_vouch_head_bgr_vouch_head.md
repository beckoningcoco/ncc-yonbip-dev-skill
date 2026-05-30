# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7295.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_vouchhead | pk_vouchhead | pk_vouchhead | char(20) | √ |
| 2 | alone_id | alone_id | alone_id | varchar2(64) |
| 3 | balancecreditamount | balancecreditamount | balancecreditamount | number(28, 8) |
| 4 | balancedebitamount | balancedebitamount | balancedebitamount | number(28, 8) |
| 5 | bm_scope | bm_scope | bm_scope | varchar2(50) |
| 6 | busivouchtype | busivouchtype | busivouchtype | number(38, 0) |
| 7 | cancelstate | cancelstate | cancelstate | char(1) |
| 8 | checkdate | checkdate | checkdate | char(19) |
| 9 | checker | checker | checker | varchar2(20) |  |  | '~' |
| 10 | creditamount | creditamount | creditamount | number(28, 8) |
| 11 | dataorigin | dataorigin | dataorigin | varchar2(50) |
| 12 | debitamount | debitamount | debitamount | number(28, 8) |
| 13 | digest | digest | digest | varchar2(50) |  |  | '~' |
| 14 | error | error | error | varchar2(1024) |
| 15 | errorstate | errorstate | errorstate | char(1) |
| 16 | input_date | input_date | input_date | char(19) |
| 17 | iorder | iorder | iorder | varchar2(40) |
| 18 | isbalance | isbalance | isbalance | char(1) |
| 19 | key1 | key1 | key1 | varchar2(100) |
| 20 | key2 | key2 | key2 | varchar2(100) |
| 21 | key3 | key3 | key3 | varchar2(100) |
| 22 | key4 | key4 | key4 | varchar2(40) |
| 23 | key5 | key5 | key5 | varchar2(40) |
| 24 | key6 | key6 | key6 | varchar2(40) |
| 25 | key7 | key7 | key7 | varchar2(40) |
| 26 | key8 | key8 | key8 | varchar2(40) |
| 27 | key9 | key9 | key9 | varchar2(40) |
| 28 | key10 | key10 | key10 | varchar2(40) |
| 29 | pk_adjscheme | pk_adjscheme | pk_adjscheme | varchar2(50) |
| 30 | pk_audit | pk_audit | pk_audit | varchar2(50) |
| 31 | pk_curr | pk_curr | pk_curr | varchar2(50) |
| 32 | pk_dxrela | pk_dxrela | pk_dxrela | varchar2(50) |
| 33 | pk_dxscheme | pk_dxscheme | pk_dxscheme | varchar2(50) |
| 34 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 35 | pk_hbscheme | pk_hbscheme | pk_hbscheme | varchar2(20) |  |  | '~' |
| 36 | pk_keygroup | pk_keygroup | pk_keygroup | varchar2(50) |
| 37 | pk_measure | pk_measure | pk_measure | varchar2(20) |  |  | '~' |
| 38 | pk_mvtype | pk_mvtype | pk_mvtype | varchar2(50) |
| 39 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 40 | pk_paramentity | pk_paramentity | pk_paramentity | varchar2(50) |
| 41 | pk_rule | pk_rule | pk_rule | varchar2(50) |
| 42 | pk_user | pk_user | pk_user | varchar2(20) |  |  | '~' |
| 43 | pk_version | pk_version | pk_version | varchar2(50) |
| 44 | validflag | validflag | validflag | char(1) |
| 45 | vouch_type | vouch_type | vouch_type | number(38, 0) |
| 46 | creationtime | creationtime | creationtime | char(19) |
| 47 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 48 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 49 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 50 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 51 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |