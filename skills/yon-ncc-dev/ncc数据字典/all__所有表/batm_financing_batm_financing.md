# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6626.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_financing | pk_financing | pk_financing | char(20) | √ |
| 2 | balance | balance | balance | number(28, 8) |
| 3 | begindate | begindate | begindate | char(10) |
| 4 | ccamount | ccamount | ccamount | number(28, 8) |
| 5 | enddate | enddate | enddate | char(10) |
| 6 | financing_org | financing_org | financing_org | varchar2(20) |  |  | '~' |
| 7 | financing_variety | financing_variety | financing_variety | number(38, 0) |
| 8 | financing_way | financing_way | financing_way | number(38, 0) |
| 9 | glcbalance | glcbalance | glcbalance | number(28, 8) |
| 10 | gllcbalance | gllcbalance | gllcbalance | number(28, 8) |
| 11 | guaranteetype | guaranteetype | guaranteetype | varchar2(50) |
| 12 | olcbalance | olcbalance | olcbalance | number(28, 8) |
| 13 | pk_bankdoc | pk_bankdoc | pk_bankdoc | varchar2(20) |  |  | '~' |
| 14 | pk_cctype | pk_cctype | pk_cctype | varchar2(50) |
| 15 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 16 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 17 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 18 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 19 | vbillno | vbillno | vbillno | varchar2(50) |
| 20 | def1 | def1 | def1 | varchar2(101) |
| 21 | def2 | def2 | def2 | varchar2(101) |
| 22 | def3 | def3 | def3 | varchar2(101) |
| 23 | def4 | def4 | def4 | varchar2(101) |
| 24 | def5 | def5 | def5 | varchar2(101) |
| 25 | def6 | def6 | def6 | varchar2(101) |
| 26 | def7 | def7 | def7 | varchar2(101) |
| 27 | def8 | def8 | def8 | varchar2(101) |
| 28 | def9 | def9 | def9 | varchar2(101) |
| 29 | def10 | def10 | def10 | varchar2(101) |
| 30 | def11 | def11 | def11 | varchar2(101) |
| 31 | def12 | def12 | def12 | varchar2(101) |
| 32 | def13 | def13 | def13 | varchar2(101) |
| 33 | def14 | def14 | def14 | varchar2(101) |
| 34 | def15 | def15 | def15 | varchar2(101) |
| 35 | def16 | def16 | def16 | varchar2(101) |
| 36 | def17 | def17 | def17 | varchar2(101) |
| 37 | def18 | def18 | def18 | varchar2(101) |
| 38 | def19 | def19 | def19 | varchar2(101) |
| 39 | def20 | def20 | def20 | varchar2(101) |
| 40 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 41 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |