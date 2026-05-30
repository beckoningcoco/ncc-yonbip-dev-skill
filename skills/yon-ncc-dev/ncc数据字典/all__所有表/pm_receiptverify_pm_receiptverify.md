# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10685.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_receiptverify | pk_receiptverify | pk_receiptverify | char(20) | √ |
| 2 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 3 | billmaketime | billmaketime | billmaketime | char(19) |
| 4 | bill_code | bill_code | bill_code | varchar2(50) |
| 5 | bill_status | bill_status | bill_status | number(38, 0) |
| 6 | bill_type | bill_type | bill_type | varchar2(50) |
| 7 | busi_type | busi_type | busi_type | varchar2(20) |  |  | '~' |
| 8 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 9 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 10 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 11 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 12 | pk_src_reg | pk_src_reg | pk_src_reg | varchar2(50) |
| 13 | pk_transitype | pk_transitype | pk_transitype | varchar2(20) |  |  | '~' |
| 14 | transi_type | transi_type | transi_type | varchar2(50) |
| 15 | verify_mny | verify_mny | verify_mny | number(28, 8) |
| 16 | verify_mny_global | verify_mny_global | verify_mny_global | number(28, 8) |
| 17 | verify_mny_group | verify_mny_group | verify_mny_group | number(28, 8) |
| 18 | verify_type | verify_type | verify_type | number(38, 0) |
| 19 | def1 | def1 | def1 | varchar2(101) |
| 20 | def2 | def2 | def2 | varchar2(101) |
| 21 | def3 | def3 | def3 | varchar2(101) |
| 22 | def4 | def4 | def4 | varchar2(101) |
| 23 | def5 | def5 | def5 | varchar2(101) |
| 24 | def6 | def6 | def6 | varchar2(101) |
| 25 | def7 | def7 | def7 | varchar2(101) |
| 26 | def8 | def8 | def8 | varchar2(101) |
| 27 | def9 | def9 | def9 | varchar2(101) |
| 28 | def10 | def10 | def10 | varchar2(101) |
| 29 | def11 | def11 | def11 | varchar2(101) |
| 30 | def12 | def12 | def12 | varchar2(101) |
| 31 | def13 | def13 | def13 | varchar2(101) |
| 32 | def14 | def14 | def14 | varchar2(101) |
| 33 | def15 | def15 | def15 | varchar2(101) |
| 34 | def16 | def16 | def16 | varchar2(101) |
| 35 | def17 | def17 | def17 | varchar2(101) |
| 36 | def18 | def18 | def18 | varchar2(101) |
| 37 | def19 | def19 | def19 | varchar2(101) |
| 38 | def20 | def20 | def20 | varchar2(101) |
| 39 | creationtime | creationtime | creationtime | char(19) |
| 40 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 41 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 42 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |