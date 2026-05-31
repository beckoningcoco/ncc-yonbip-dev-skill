# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6687.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_vouchhead | pk_vouchhead | pk_vouchhead | char(20) | √ |
| 2 | balancecreditamount | balancecreditamount | balancecreditamount | number(28, 8) |
| 3 | balancedebitamount | balancedebitamount | balancedebitamount | number(28, 8) |
| 4 | bm_scope | bm_scope | bm_scope | varchar2(50) | √ |
| 5 | busivouchtype | busivouchtype | busivouchtype | number(38, 0) |
| 6 | creditamount | creditamount | creditamount | number(28, 8) |
| 7 | debitamount | debitamount | debitamount | number(28, 8) |
| 8 | digest | digest | digest | varchar2(50) |  |  | '~' |
| 9 | input_date | input_date | input_date | char(19) |
| 10 | key1 | key1 | key1 | varchar2(100) |
| 11 | key2 | key2 | key2 | varchar2(100) |
| 12 | key3 | key3 | key3 | varchar2(100) |
| 13 | key4 | key4 | key4 | varchar2(40) |
| 14 | key5 | key5 | key5 | varchar2(40) |
| 15 | key6 | key6 | key6 | varchar2(40) |
| 16 | key7 | key7 | key7 | varchar2(40) |
| 17 | key8 | key8 | key8 | varchar2(40) |
| 18 | key9 | key9 | key9 | varchar2(40) |
| 19 | key10 | key10 | key10 | varchar2(40) |
| 20 | pk_adjscheme | pk_adjscheme | pk_adjscheme | varchar2(50) |
| 21 | pk_audit | pk_audit | pk_audit | varchar2(50) |
| 22 | pk_curr | pk_curr | pk_curr | varchar2(50) |
| 23 | pk_dxrela | pk_dxrela | pk_dxrela | varchar2(50) |
| 24 | pk_dxscheme | pk_dxscheme | pk_dxscheme | varchar2(50) |
| 25 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 26 | pk_hbscheme | pk_hbscheme | pk_hbscheme | varchar2(20) |  |  | '~' |
| 27 | pk_keygroup | pk_keygroup | pk_keygroup | varchar2(50) |
| 28 | pk_measure | pk_measure | pk_measure | varchar2(20) |  |  | '~' |
| 29 | pk_mvtype | pk_mvtype | pk_mvtype | varchar2(50) |
| 30 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 31 | pk_paramentity | pk_paramentity | pk_paramentity | varchar2(50) |
| 32 | pk_user | pk_user | pk_user | varchar2(20) |  |  | '~' |
| 33 | pk_version | pk_version | pk_version | varchar2(50) |
| 34 | vouch_type | vouch_type | vouch_type | number(38, 0) |
| 35 | creationtime | creationtime | creationtime | char(19) |
| 36 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 37 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 38 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 39 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 40 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |