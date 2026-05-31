# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8413.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_fvm_balance | pk_fvm_balance | pk_fvm_balance | char(20) | √ |
| 2 | accname | accname | accname | varchar2(200) |
| 3 | accnum | accnum | accnum | varchar2(40) |
| 4 | acctype | acctype | acctype | number(38, 0) |
| 5 | arapprop | arapprop | arapprop | varchar2(50) |
| 6 | balance | balance | balance | number(28, 8) |
| 7 | balancedate | balancedate | balancedate | char(19) |
| 8 | bankarea | bankarea | bankarea | varchar2(80) |
| 9 | city | city | city | varchar2(80) |
| 10 | glcbalance | glcbalance | glcbalance | number(28, 8) |
| 11 | glcinmoney | glcinmoney | glcinmoney | number(28, 8) |
| 12 | glcoutmoney | glcoutmoney | glcoutmoney | number(28, 8) |
| 13 | glcusablebalance | glcusablebalance | glcusablebalance | number(28, 8) |
| 14 | gllcbalance | gllcbalance | gllcbalance | number(28, 8) |
| 15 | gllcinmoney | gllcinmoney | gllcinmoney | number(28, 8) |
| 16 | gllcoutmoney | gllcoutmoney | gllcoutmoney | number(28, 8) |
| 17 | gllcusablebalance | gllcusablebalance | gllcusablebalance | number(28, 8) |
| 18 | inmoney | inmoney | inmoney | number(28, 8) |
| 19 | isinneracc | isinneracc | isinneracc | char(1) |
| 20 | ismargin | ismargin | ismargin | char(1) |
| 21 | olcbalance | olcbalance | olcbalance | number(28, 8) |
| 22 | olcinmoney | olcinmoney | olcinmoney | number(28, 8) |
| 23 | olcoutmoney | olcoutmoney | olcoutmoney | number(28, 8) |
| 24 | olcusablebalance | olcusablebalance | olcusablebalance | number(28, 8) |
| 25 | outmny | outmny | outmny | number(28, 8) |
| 26 | pk_bankaccbas | pk_bankaccbas | pk_bankaccbas | varchar2(20) |  |  | '~' |
| 27 | pk_bankaccsub | pk_bankaccsub | pk_bankaccsub | varchar2(20) |  |  | '~' |
| 28 | pk_bankdoc | pk_bankdoc | pk_bankdoc | varchar2(20) |  |  | '~' |
| 29 | pk_banktype | pk_banktype | pk_banktype | varchar2(20) |  |  | '~' |
| 30 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 31 | pk_ebank_balance | pk_ebank_balance | pk_ebank_balance | varchar2(50) |
| 32 | pk_fvm_dzd | pk_fvm_dzd | pk_fvm_dzd | varchar2(50) |
| 33 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 34 | pk_netbankinftp | pk_netbankinftp | pk_netbankinftp | varchar2(20) |  |  | '~' |
| 35 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 36 | province | province | province | varchar2(80) |
| 37 | usablebalance | usablebalance | usablebalance | number(28, 8) |
| 38 | yesterdaybalance | yesterdaybalance | yesterdaybalance | number(28, 8) |
| 39 | def1 | def1 | def1 | varchar2(200) |
| 40 | def2 | def2 | def2 | varchar2(200) |
| 41 | def3 | def3 | def3 | varchar2(200) |
| 42 | def4 | def4 | def4 | varchar2(200) |
| 43 | def5 | def5 | def5 | varchar2(200) |
| 44 | def6 | def6 | def6 | varchar2(200) |
| 45 | def7 | def7 | def7 | varchar2(200) |
| 46 | def8 | def8 | def8 | varchar2(200) |
| 47 | def9 | def9 | def9 | varchar2(200) |
| 48 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 49 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |