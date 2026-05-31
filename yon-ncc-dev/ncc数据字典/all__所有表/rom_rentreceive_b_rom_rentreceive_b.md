# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11254.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_rentreceive_d | pk_rentreceive_d | pk_rentreceive_d | char(20) | √ |
| 2 | bill_type_src | bill_type_src | bill_type_src | varchar2(4) |
| 3 | last_rent_date | last_rent_date | last_rent_date | char(19) |
| 4 | memo | memo | memo | varchar2(200) |
| 5 | origin_rate | origin_rate | origin_rate | number(28, 8) |
| 6 | pk_contract_base | pk_contract_base | pk_contract_base | varchar2(20) |  |  | '~' |
| 7 | pk_contract_v | pk_contract_v | pk_contract_v | varchar2(20) |  |  | '~' |
| 8 | pk_currency_origin | pk_currency_origin | pk_currency_origin | varchar2(20) |  |  | '~' |
| 9 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 10 | pk_jobmngfil | pk_jobmngfil | pk_jobmngfil | varchar2(20) |  |  | '~' |
| 11 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 12 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 13 | pk_rentreceive | pk_rentreceive | pk_rentreceive | char(20) | √ |
| 14 | rentmoney | rentmoney | rentmoney | number(28, 8) |
| 15 | rentmoney_global | rentmoney_global | rentmoney_global | number(28, 8) |
| 16 | rentmoney_group | rentmoney_group | rentmoney_group | number(28, 8) |
| 17 | rentmoney_org | rentmoney_org | rentmoney_org | number(28, 8) |
| 18 | rowno | rowno | rowno | varchar2(30) |
| 19 | transi_type_src | transi_type_src | transi_type_src | varchar2(30) |
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