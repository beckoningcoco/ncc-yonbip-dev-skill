# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10635.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_mcontr_alter | pk_mcontr_alter | pk_mcontr_alter | char(20) | √ |
| 2 | alter_date | alter_date | alter_date | char(19) |
| 3 | alter_mny | alter_mny | alter_mny | number(28, 8) |
| 4 | alter_taxmny | alter_taxmny | alter_taxmny | number(28, 8) |
| 5 | auditor | auditor | auditor | varchar2(20) |  |  | '~' |
| 6 | audittime | audittime | audittime | char(19) |
| 7 | begin_flag | begin_flag | begin_flag | char(1) |
| 8 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 9 | billmaketime | billmaketime | billmaketime | char(19) |
| 10 | bill_code | bill_code | bill_code | varchar2(50) |
| 11 | bill_status | bill_status | bill_status | number(38, 0) |
| 12 | bill_type | bill_type | bill_type | varchar2(50) |
| 13 | busi_type | busi_type | busi_type | varchar2(20) |  |  | '~' |
| 14 | check_opinion | check_opinion | check_opinion | varchar2(50) |
| 15 | contr_ver_aft | contr_ver_aft | contr_ver_aft | number(38, 0) |
| 16 | contr_ver_bef | contr_ver_bef | contr_ver_bef | number(38, 0) |
| 17 | dispose_dept | dispose_dept | dispose_dept | varchar2(20) |  |  | '~' |
| 18 | dispose_dept_v | dispose_dept_v | dispose_dept_v | varchar2(20) |  |  | '~' |
| 19 | dispose_person | dispose_person | dispose_person | varchar2(20) |  |  | '~' |
| 20 | mcontr_mny | mcontr_mny | mcontr_mny | number(28, 8) |
| 21 | mcontr_taxmny | mcontr_taxmny | mcontr_taxmny | number(28, 8) |
| 22 | memo | memo | memo | varchar2(300) |
| 23 | nexchangerate | nexchangerate | nexchangerate | number(28, 8) |
| 24 | pk_customer | pk_customer | pk_customer | varchar2(20) |  |  | '~' |
| 25 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 26 | pk_mcontr | pk_mcontr | pk_mcontr | varchar2(20) |  |  | '~' |
| 27 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 28 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 29 | pk_project | pk_project | pk_project | varchar2(20) |  |  | '~' |
| 30 | pk_supplier | pk_supplier | pk_supplier | varchar2(20) |  |  | '~' |
| 31 | pk_transitype | pk_transitype | pk_transitype | varchar2(20) |  |  | '~' |
| 32 | settle_taxmny | settle_taxmny | settle_taxmny | number(28, 8) |
| 33 | shou_taxmny | shou_taxmny | shou_taxmny | number(28, 8) |
| 34 | src_bill_code | src_bill_code | src_bill_code | varchar2(50) |
| 35 | src_bill_type | src_bill_type | src_bill_type | varchar2(50) |
| 36 | tax | tax | tax | number(28, 8) |
| 37 | transi_type | transi_type | transi_type | varchar2(50) |
| 38 | def1 | def1 | def1 | varchar2(101) |
| 39 | def2 | def2 | def2 | varchar2(101) |
| 40 | def3 | def3 | def3 | varchar2(101) |
| 41 | def4 | def4 | def4 | varchar2(101) |
| 42 | def5 | def5 | def5 | varchar2(101) |
| 43 | def6 | def6 | def6 | varchar2(101) |
| 44 | def7 | def7 | def7 | varchar2(101) |
| 45 | def8 | def8 | def8 | varchar2(101) |
| 46 | def9 | def9 | def9 | varchar2(101) |
| 47 | def10 | def10 | def10 | varchar2(101) |
| 48 | def11 | def11 | def11 | varchar2(101) |
| 49 | def12 | def12 | def12 | varchar2(101) |
| 50 | def13 | def13 | def13 | varchar2(101) |
| 51 | def14 | def14 | def14 | varchar2(101) |
| 52 | def15 | def15 | def15 | varchar2(101) |
| 53 | def16 | def16 | def16 | varchar2(101) |
| 54 | def17 | def17 | def17 | varchar2(101) |
| 55 | def18 | def18 | def18 | varchar2(101) |
| 56 | def19 | def19 | def19 | varchar2(101) |
| 57 | def20 | def20 | def20 | varchar2(101) |
| 58 | creationtime | creationtime | creationtime | char(19) |
| 59 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 60 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 61 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 62 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 63 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |