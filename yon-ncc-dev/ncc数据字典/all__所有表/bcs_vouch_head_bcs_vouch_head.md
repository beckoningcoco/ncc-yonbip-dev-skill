# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6685.html

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
| 14 | dxcontent | dxcontent | dxcontent | varchar2(50) |  |  | '~' |
| 15 | error | error | error | varchar2(1024) |
| 16 | errorstate | errorstate | errorstate | char(1) |
| 17 | extype | extype | extype | char(2) |  |  | '0' |
| 18 | input_date | input_date | input_date | char(19) |
| 19 | investee | investee | investee | varchar2(20) |  |  | '~' |
| 20 | investor | investor | investor | varchar2(20) |  |  | '~' |
| 21 | iorder | iorder | iorder | varchar2(40) |
| 22 | isbalance | isbalance | isbalance | char(1) |
| 23 | key1 | key1 | key1 | varchar2(64) |
| 24 | key2 | key2 | key2 | varchar2(64) |
| 25 | key3 | key3 | key3 | varchar2(64) |
| 26 | key4 | key4 | key4 | varchar2(40) |
| 27 | key5 | key5 | key5 | varchar2(40) |
| 28 | key6 | key6 | key6 | varchar2(40) |
| 29 | key7 | key7 | key7 | varchar2(40) |
| 30 | key8 | key8 | key8 | varchar2(40) |
| 31 | key9 | key9 | key9 | varchar2(40) |
| 32 | key10 | key10 | key10 | varchar2(40) |
| 33 | key11 | key11 | key11 | varchar2(40) |
| 34 | key12 | key12 | key12 | varchar2(40) |
| 35 | key13 | key13 | key13 | varchar2(40) |
| 36 | key14 | key14 | key14 | varchar2(40) |
| 37 | key15 | key15 | key15 | varchar2(40) |
| 38 | pk_adjscheme | pk_adjscheme | pk_adjscheme | varchar2(50) |
| 39 | pk_audit | pk_audit | pk_audit | varchar2(50) |
| 40 | pk_curr | pk_curr | pk_curr | varchar2(50) |
| 41 | pk_dxrela | pk_dxrela | pk_dxrela | varchar2(50) |
| 42 | pk_dxscheme | pk_dxscheme | pk_dxscheme | varchar2(50) |
| 43 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 44 | pk_hbscheme | pk_hbscheme | pk_hbscheme | varchar2(20) |  |  | '~' |
| 45 | pk_keygroup | pk_keygroup | pk_keygroup | varchar2(50) |
| 46 | pk_measure | pk_measure | pk_measure | varchar2(20) |  |  | '~' |
| 47 | pk_mvtype | pk_mvtype | pk_mvtype | varchar2(50) |
| 48 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 49 | pk_paramentity | pk_paramentity | pk_paramentity | varchar2(50) |
| 50 | pk_rule | pk_rule | pk_rule | varchar2(50) |
| 51 | pk_taskmonth | pk_taskmonth | pk_taskmonth | varchar2(20) |  |  | '~' |
| 52 | pk_taskyear | pk_taskyear | pk_taskyear | varchar2(20) |  |  | '~' |
| 53 | pk_user | pk_user | pk_user | varchar2(20) |  |  | '~' |
| 54 | pk_version | pk_version | pk_version | varchar2(50) |
| 55 | validflag | validflag | validflag | char(1) |
| 56 | vouch_type | vouch_type | vouch_type | number(38, 0) |
| 57 | creationtime | creationtime | creationtime | char(19) |
| 58 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 59 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 60 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 61 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 62 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |