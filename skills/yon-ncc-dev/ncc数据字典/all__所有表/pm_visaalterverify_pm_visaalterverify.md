# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10727.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_alterverify | pk_alterverify | pk_alterverify | char(20) | √ |
| 2 | alter_category | alter_category | alter_category | varchar2(20) |  |  | '~' |
| 3 | alter_reason | alter_reason | alter_reason | varchar2(50) |
| 4 | apply_mny | apply_mny | apply_mny | number(28, 8) |
| 5 | auditor | auditor | auditor | varchar2(20) |  |  | '~' |
| 6 | audittime | audittime | audittime | char(19) |
| 7 | begin_flag | begin_flag | begin_flag | char(1) |
| 8 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 9 | billmaketime | billmaketime | billmaketime | char(19) |
| 10 | bill_code | bill_code | bill_code | varchar2(50) |
| 11 | bill_status | bill_status | bill_status | number(38, 0) |
| 12 | bill_type | bill_type | bill_type | varchar2(50) |
| 13 | budget_info | budget_info | budget_info | varchar2(200) |
| 14 | busi_type | busi_type | busi_type | varchar2(20) |  |  | '~' |
| 15 | check_opinion | check_opinion | check_opinion | varchar2(50) |
| 16 | estimate_flag | estimate_flag | estimate_flag | varchar2(1) |
| 17 | flexible_flag | flexible_flag | flexible_flag | char(1) |
| 18 | invoice_mny | invoice_mny | invoice_mny | number(28, 8) |
| 19 | memo | memo | memo | varchar2(200) |
| 20 | pay_mny | pay_mny | pay_mny | number(28, 8) |
| 21 | pk_contr | pk_contr | pk_contr | varchar2(20) |  |  | '~' |
| 22 | pk_dept | pk_dept | pk_dept | varchar2(20) |  |  | '~' |
| 23 | pk_dept_v | pk_dept_v | pk_dept_v | varchar2(20) |  |  | '~' |
| 24 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 25 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 26 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 27 | pk_project | pk_project | pk_project | varchar2(20) |  |  | '~' |
| 28 | pk_psndoc | pk_psndoc | pk_psndoc | varchar2(20) |  |  | '~' |
| 29 | pk_supplier | pk_supplier | pk_supplier | varchar2(20) |  |  | '~' |
| 30 | pk_transitype | pk_transitype | pk_transitype | varchar2(20) |  |  | '~' |
| 31 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 32 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |  |  | 0 |
| 33 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 34 | saga_status | saga_status | saga_status | number(38, 0) |  |  | 0 |
| 35 | src_bill_code | src_bill_code | src_bill_code | varchar2(50) |
| 36 | src_bill_type | src_bill_type | src_bill_type | varchar2(50) |
| 37 | src_pk_bill | src_pk_bill | src_pk_bill | varchar2(50) |  |  | '~' |
| 38 | src_pk_transitype | src_pk_transitype | src_pk_transitype | varchar2(20) |  |  | '~' |
| 39 | src_transi_type | src_transi_type | src_transi_type | varchar2(50) |
| 40 | tax | tax | tax | number(28, 8) |
| 41 | transi_type | transi_type | transi_type | varchar2(50) |
| 42 | veri_date | veri_date | veri_date | char(19) |
| 43 | veri_mny | veri_mny | veri_mny | number(28, 8) |
| 44 | veri_taxmny | veri_taxmny | veri_taxmny | number(28, 8) |
| 45 | def1 | def1 | def1 | varchar2(101) |
| 46 | def2 | def2 | def2 | varchar2(101) |
| 47 | def3 | def3 | def3 | varchar2(101) |
| 48 | def4 | def4 | def4 | varchar2(101) |
| 49 | def5 | def5 | def5 | varchar2(101) |
| 50 | def6 | def6 | def6 | varchar2(101) |
| 51 | def7 | def7 | def7 | varchar2(101) |
| 52 | def8 | def8 | def8 | varchar2(101) |
| 53 | def9 | def9 | def9 | varchar2(101) |
| 54 | def10 | def10 | def10 | varchar2(101) |
| 55 | def11 | def11 | def11 | varchar2(101) |
| 56 | def12 | def12 | def12 | varchar2(101) |
| 57 | def13 | def13 | def13 | varchar2(101) |
| 58 | def14 | def14 | def14 | varchar2(101) |
| 59 | def15 | def15 | def15 | varchar2(101) |
| 60 | def16 | def16 | def16 | varchar2(101) |
| 61 | def17 | def17 | def17 | varchar2(101) |
| 62 | def18 | def18 | def18 | varchar2(101) |
| 63 | def19 | def19 | def19 | varchar2(101) |
| 64 | def20 | def20 | def20 | varchar2(101) |
| 65 | creationtime | creationtime | creationtime | char(19) |
| 66 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 67 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 68 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 69 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 70 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |