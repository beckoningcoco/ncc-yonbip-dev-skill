# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10682.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_providereg_b | pk_providereg_b | pk_providereg_b | char(20) | √ |
| 2 | memo | memo | memo | varchar2(200) |
| 3 | mny | mny | mny | number(28, 8) |  |  | 0 |
| 4 | mny_global | mny_global | mny_global | number(28, 8) |  |  | 0 |
| 5 | mny_group | mny_group | mny_group | number(28, 8) |  |  | 0 |
| 6 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 7 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 8 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 9 | pk_project | pk_project | pk_project | varchar2(20) |  |  | '~' |
| 10 | pk_providereg | pk_providereg | pk_providereg | char(20) | √ |
| 11 | prepaid_mny | prepaid_mny | prepaid_mny | number(28, 8) |
| 12 | qual_taxmny | qual_taxmny | qual_taxmny | number(28, 8) |
| 13 | rowno | rowno | rowno | varchar2(30) |
| 14 | src_bill_code | src_bill_code | src_bill_code | varchar2(50) |
| 15 | src_bill_type | src_bill_type | src_bill_type | varchar2(50) |  |  | '~' |
| 16 | src_bill_typeid | src_bill_typeid | src_bill_typeid | varchar2(20) |  |  | '~' |
| 17 | src_pk_bill | src_pk_bill | src_pk_bill | varchar2(20) |  |  | '~' |
| 18 | src_transi_type | src_transi_type | src_transi_type | varchar2(50) |
| 19 | tax | tax | tax | number(28, 8) |  |  | 0 |
| 20 | taxable | taxable | taxable | varchar2(101) |
| 21 | taxcode | taxcode | taxcode | varchar2(20) |  |  | '~' |
| 22 | taxmny | taxmny | taxmny | number(28, 8) |  |  | 0 |
| 23 | taxmny_global | taxmny_global | taxmny_global | number(28, 8) |  |  | 0 |
| 24 | taxmny_group | taxmny_group | taxmny_group | number(28, 8) |  |  | 0 |
| 25 | taxrate | taxrate | taxrate | number(28, 8) |  |  | 0 |
| 26 | def1 | def1 | def1 | varchar2(101) |
| 27 | def2 | def2 | def2 | varchar2(101) |
| 28 | def3 | def3 | def3 | varchar2(101) |
| 29 | def4 | def4 | def4 | varchar2(101) |
| 30 | def5 | def5 | def5 | varchar2(101) |
| 31 | def6 | def6 | def6 | varchar2(101) |
| 32 | def7 | def7 | def7 | varchar2(101) |
| 33 | def8 | def8 | def8 | varchar2(101) |
| 34 | def9 | def9 | def9 | varchar2(101) |
| 35 | def10 | def10 | def10 | varchar2(101) |
| 36 | def11 | def11 | def11 | varchar2(101) |
| 37 | def12 | def12 | def12 | varchar2(101) |
| 38 | def13 | def13 | def13 | varchar2(101) |
| 39 | def14 | def14 | def14 | varchar2(101) |
| 40 | def15 | def15 | def15 | varchar2(101) |
| 41 | def16 | def16 | def16 | varchar2(101) |
| 42 | def17 | def17 | def17 | varchar2(101) |
| 43 | def18 | def18 | def18 | varchar2(101) |
| 44 | def19 | def19 | def19 | varchar2(101) |
| 45 | def20 | def20 | def20 | varchar2(101) |
| 46 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 47 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |