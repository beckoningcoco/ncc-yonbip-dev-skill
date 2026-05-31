# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7813.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ebank_balance | pk_ebank_balance | pk_ebank_balance | char(20) | √ |
| 2 | balance | balance | balance | number(28, 8) |
| 3 | bankacc | bankacc | bankacc | varchar2(50) |
| 4 | bankname | bankname | bankname | varchar2(200) |
| 5 | banktype | banktype | banktype | varchar2(60) |
| 6 | banktypecode | banktypecode | banktypecode | varchar2(50) |
| 7 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 8 | curdate | curdate | curdate | char(19) |
| 9 | glcamount | glcamount | glcamount | number(28, 8) |
| 10 | glcrate | glcrate | glcrate | number(28, 8) |
| 11 | glcusablebalance | glcusablebalance | glcusablebalance | number(28, 8) |
| 12 | gllcamount | gllcamount | gllcamount | number(28, 8) |
| 13 | gllcrate | gllcrate | gllcrate | number(28, 8) |
| 14 | gllcusablebalance | gllcusablebalance | gllcusablebalance | number(28, 8) |
| 15 | olcamount | olcamount | olcamount | number(28, 8) |
| 16 | olcrate | olcrate | olcrate | number(28, 8) |
| 17 | olcusablebalance | olcusablebalance | olcusablebalance | number(28, 8) |
| 18 | pk_bankaccbas | pk_bankaccbas | pk_bankaccbas | varchar2(20) |  |  | '~' |
| 19 | pk_bankaccsub | pk_bankaccsub | pk_bankaccsub | varchar2(20) |  |  | '~' |
| 20 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 21 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 22 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 23 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 24 | unitname | unitname | unitname | varchar2(200) |
| 25 | usablebalance | usablebalance | usablebalance | number(28, 8) |
| 26 | yesterdaybalance | yesterdaybalance | yesterdaybalance | number(28, 8) |
| 27 | obmdef1 | obmdef1 | obmdef1 | varchar2(101) |
| 28 | obmdef2 | obmdef2 | obmdef2 | varchar2(101) |
| 29 | obmdef3 | obmdef3 | obmdef3 | varchar2(101) |
| 30 | obmdef4 | obmdef4 | obmdef4 | varchar2(101) |
| 31 | obmdef5 | obmdef5 | obmdef5 | varchar2(101) |
| 32 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 33 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |