# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10597.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_estrecord | pk_estrecord | pk_estrecord | char(20) | √ |
| 2 | bill_code | bill_code | bill_code | varchar2(50) |
| 3 | bill_type | bill_type | bill_type | varchar2(50) |  |  | '~' |
| 4 | estimatetime | estimatetime | estimatetime | char(19) |
| 5 | estimate_taxmny | estimate_taxmny | estimate_taxmny | number(28, 8) |
| 6 | estimator | estimator | estimator | varchar2(20) |  |  | '~' |
| 7 | pk_currtype_org | pk_currtype_org | pk_currtype_org | varchar2(20) |  |  | '~' |
| 8 | pk_financialorg | pk_financialorg | pk_financialorg | varchar2(20) |  |  | '~' |
| 9 | pk_financialorg_v | pk_financialorg_v | pk_financialorg_v | varchar2(20) |  |  | '~' |
| 10 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 11 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 12 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 13 | pk_project | pk_project | pk_project | varchar2(20) |  |  | '~' |
| 14 | pk_supplier | pk_supplier | pk_supplier | varchar2(20) |  |  | '~' |
| 15 | pk_transitype | pk_transitype | pk_transitype | varchar2(20) |  |  | '~' |
| 16 | src_bill_code | src_bill_code | src_bill_code | varchar2(50) |
| 17 | src_bill_type | src_bill_type | src_bill_type | varchar2(20) |  |  | '~' |
| 18 | src_pk_bill | src_pk_bill | src_pk_bill | varchar2(20) |
| 19 | src_pk_transitype | src_pk_transitype | src_pk_transitype | varchar2(20) |  |  | '~' |
| 20 | src_transi_type | src_transi_type | src_transi_type | varchar2(50) |  |  | '~' |
| 21 | transi_type | transi_type | transi_type | varchar2(30) |
| 22 | def1 | def1 | def1 | varchar2(101) |
| 23 | def2 | def2 | def2 | varchar2(101) |
| 24 | def3 | def3 | def3 | varchar2(101) |
| 25 | def4 | def4 | def4 | varchar2(101) |
| 26 | def5 | def5 | def5 | varchar2(101) |
| 27 | def6 | def6 | def6 | varchar2(101) |
| 28 | def7 | def7 | def7 | varchar2(101) |
| 29 | def8 | def8 | def8 | varchar2(101) |
| 30 | def9 | def9 | def9 | varchar2(101) |
| 31 | def10 | def10 | def10 | varchar2(101) |
| 32 | def11 | def11 | def11 | varchar2(101) |
| 33 | def12 | def12 | def12 | varchar2(101) |
| 34 | def13 | def13 | def13 | varchar2(101) |
| 35 | def14 | def14 | def14 | varchar2(101) |
| 36 | def15 | def15 | def15 | varchar2(101) |
| 37 | def16 | def16 | def16 | varchar2(101) |
| 38 | def17 | def17 | def17 | varchar2(101) |
| 39 | def18 | def18 | def18 | varchar2(101) |
| 40 | def19 | def19 | def19 | varchar2(101) |
| 41 | def20 | def20 | def20 | varchar2(101) |
| 42 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 43 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |