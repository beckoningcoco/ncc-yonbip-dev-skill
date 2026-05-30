# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6670.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_meethead | pk_meethead | pk_meethead | char(20) | √ |
| 2 | aloneid | aloneid | aloneid | varchar2(64) |
| 3 | balancestatus | balancestatus | balancestatus | number(38, 0) |
| 4 | bm_scope | bm_scope | bm_scope | varchar2(50) |
| 5 | busivouchtype | busivouchtype | busivouchtype | number(38, 0) |
| 6 | cancelstate | cancelstate | cancelstate | char(1) |
| 7 | checkdate | checkdate | checkdate | char(19) |
| 8 | checker | checker | checker | varchar2(20) |  |  | '~' |
| 9 | creditamount | creditamount | creditamount | number(28, 8) |
| 10 | creditconfirm | creditconfirm | creditconfirm | varchar2(20) |
| 11 | creditconfirmtime | creditconfirmtime | creditconfirmtime | char(19) |
| 12 | dataorigin | dataorigin | dataorigin | varchar2(50) |
| 13 | debiconfirm | debiconfirm | debiconfirm | varchar2(20) |
| 14 | debiconfirmtime | debiconfirmtime | debiconfirmtime | char(19) |
| 15 | debitamount | debitamount | debitamount | number(28, 8) |
| 16 | digest | digest | digest | varchar2(50) |  |  | '~' |
| 17 | dimnote | dimnote | dimnote | varchar2(1000) |
| 18 | error | error | error | varchar2(1024) |
| 19 | errorstate | errorstate | errorstate | char(1) |
| 20 | input_date | input_date | input_date | char(19) |
| 21 | iorder | iorder | iorder | varchar2(40) |
| 22 | isbalance | isbalance | isbalance | char(1) |
| 23 | key1 | key1 | key1 | varchar2(40) |
| 24 | key2 | key2 | key2 | varchar2(40) |
| 25 | key3 | key3 | key3 | varchar2(40) |
| 26 | key4 | key4 | key4 | varchar2(40) |
| 27 | key5 | key5 | key5 | varchar2(40) |
| 28 | key6 | key6 | key6 | varchar2(40) |
| 29 | key7 | key7 | key7 | varchar2(40) |
| 30 | key8 | key8 | key8 | varchar2(40) |
| 31 | key9 | key9 | key9 | varchar2(40) |
| 32 | key10 | key10 | key10 | varchar2(40) |
| 33 | meetbalance | meetbalance | meetbalance | number(28, 8) |
| 34 | meetcreditnote | meetcreditnote | meetcreditnote | varchar2(200) |
| 35 | meetdebinote | meetdebinote | meetdebinote | varchar2(200) |
| 36 | otherdim | otherdim | otherdim | varchar2(1000) |
| 37 | pk_audit | pk_audit | pk_audit | varchar2(50) |
| 38 | pk_cube | pk_cube | pk_cube | varchar2(20) |
| 39 | pk_curr | pk_curr | pk_curr | varchar2(50) |
| 40 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 41 | pk_hbscheme | pk_hbscheme | pk_hbscheme | varchar2(20) |  |  | '~' |
| 42 | pk_measure | pk_measure | pk_measure | varchar2(20) |  |  | '~' |
| 43 | pk_mvtype | pk_mvtype | pk_mvtype | varchar2(50) |
| 44 | pk_opp_custsupp | pk_opp_custsupp | pk_opp_custsupp | varchar2(20) |
| 45 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 46 | pk_paramentity | pk_paramentity | pk_paramentity | varchar2(50) |
| 47 | pk_rule | pk_rule | pk_rule | varchar2(50) |
| 48 | pk_self | pk_self | pk_self | varchar2(20) |
| 49 | pk_user | pk_user | pk_user | varchar2(20) |  |  | '~' |
| 50 | pk_version | pk_version | pk_version | varchar2(50) |
| 51 | uniqkey | uniqkey | uniqkey | varchar2(50) |
| 52 | vouch_type | vouch_type | vouch_type | number(38, 0) |
| 53 | creationtime | creationtime | creationtime | char(19) |
| 54 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 55 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 56 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 57 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 58 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |