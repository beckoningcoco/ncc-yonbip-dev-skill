# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10060.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_overage | pk_overage | pk_overage | char(20) | √ |
| 2 | coriamount | coriamount | coriamount | number(28, 8) |
| 3 | cquantity | cquantity | cquantity | number(28, 8) |
| 4 | doriamount | doriamount | doriamount | number(28, 8) |
| 5 | dquantity | dquantity | dquantity | number(28, 8) |
| 6 | globalcredit | globalcredit | globalcredit | number(28, 8) |
| 7 | globaldebit | globaldebit | globaldebit | number(28, 8) |
| 8 | groupcredit | groupcredit | groupcredit | number(28, 8) |
| 9 | groupdebit | groupdebit | groupdebit | number(28, 8) |
| 10 | orgcredit | orgcredit | orgcredit | number(28, 8) |
| 11 | orgdebit | orgdebit | orgdebit | number(28, 8) |
| 12 | pk_account | pk_account | pk_account | varchar2(20) |  |  | '~' |
| 13 | pk_company | pk_company | pk_company | varchar2(20) |
| 14 | pk_costcenter | pk_costcenter | pk_costcenter | varchar2(20) |  |  | '~' |
| 15 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 16 | pk_dimcombine | pk_dimcombine | pk_dimcombine | varchar2(50) |  |  | '~' |
| 17 | pk_financial | pk_financial | pk_financial | varchar2(20) |
| 18 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 19 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 20 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 21 | pk_resporg | pk_resporg | pk_resporg | varchar2(20) |  |  | '~' |
| 22 | smonth | smonth | smonth | char(2) |
| 23 | srcsystem | srcsystem | srcsystem | varchar2(20) |  |  | '~' |
| 24 | syear | syear | syear | char(4) |
| 25 | voucherkind | voucherkind | voucherkind | varchar2(20) |  |  | '~' |
| 26 | def1 | def1 | def1 | varchar2(101) |
| 27 | def2 | def2 | def2 | varchar2(101) |
| 28 | def3 | def3 | def3 | varchar2(101) |
| 29 | def4 | def4 | def4 | varchar2(101) |
| 30 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 31 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |