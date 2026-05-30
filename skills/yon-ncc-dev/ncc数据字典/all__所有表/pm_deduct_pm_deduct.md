# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10584.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_deduct | pk_deduct | pk_deduct | char(20) | √ |
| 2 | apply_mny | apply_mny | apply_mny | number(28, 8) |
| 3 | auditor | auditor | auditor | varchar2(20) |  |  | '~' |
| 4 | audittime | audittime | audittime | char(19) |
| 5 | balance_date | balance_date | balance_date | char(19) |
| 6 | balance_explain | balance_explain | balance_explain | varchar2(200) |
| 7 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 8 | billmaketime | billmaketime | billmaketime | char(19) |
| 9 | bill_code | bill_code | bill_code | varchar2(40) |
| 10 | bill_status | bill_status | bill_status | number(38, 0) |
| 11 | bill_type | bill_type | bill_type | varchar2(4) |
| 12 | busi_type | busi_type | busi_type | varchar2(20) |  |  | '~' |
| 13 | check_opinion | check_opinion | check_opinion | varchar2(50) |
| 14 | claim_mny | claim_mny | claim_mny | number(28, 8) |
| 15 | deduct_mny | deduct_mny | deduct_mny | number(28, 8) |
| 16 | estimate_flag | estimate_flag | estimate_flag | char(1) |
| 17 | invoice_mny | invoice_mny | invoice_mny | number(28, 8) |
| 18 | memo | memo | memo | varchar2(200) |
| 19 | pay_mny | pay_mny | pay_mny | number(28, 8) |
| 20 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 21 | pk_dept | pk_dept | pk_dept | varchar2(20) |  |  | '~' |
| 22 | pk_dept_v | pk_dept_v | pk_dept_v | varchar2(20) |  |  | '~' |
| 23 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 24 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 25 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 26 | pk_project | pk_project | pk_project | varchar2(20) |  |  | '~' |
| 27 | pk_psndoc | pk_psndoc | pk_psndoc | varchar2(20) |  |  | '~' |
| 28 | pk_supplier | pk_supplier | pk_supplier | varchar2(20) |  |  | '~' |
| 29 | pk_transitype | pk_transitype | pk_transitype | varchar2(20) |  |  | '~' |
| 30 | polish_flag | polish_flag | polish_flag | char(1) |
| 31 | qualdeduct_mny | qualdeduct_mny | qualdeduct_mny | number(28, 8) |
| 32 | qualremain_mny | qualremain_mny | qualremain_mny | number(28, 8) |
| 33 | qual_taxmny | qual_taxmny | qual_taxmny | number(28, 8) |
| 34 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 35 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |  |  | 0 |
| 36 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 37 | saga_status | saga_status | saga_status | number(38, 0) |  |  | 0 |
| 38 | src_billtype | src_billtype | src_billtype | varchar2(50) |
| 39 | src_head_ts | src_head_ts | src_head_ts | char(19) |
| 40 | src_pk_bill | src_pk_bill | src_pk_bill | varchar2(20) |  |  | '~' |
| 41 | transi_type | transi_type | transi_type | varchar2(30) |
| 42 | use_qual | use_qual | use_qual | char(1) |
| 43 | verify_mny | verify_mny | verify_mny | number(28, 8) |
| 44 | def1 | def1 | def1 | varchar2(101) |
| 45 | def2 | def2 | def2 | varchar2(101) |
| 46 | def3 | def3 | def3 | varchar2(101) |
| 47 | def4 | def4 | def4 | varchar2(101) |
| 48 | def5 | def5 | def5 | varchar2(101) |
| 49 | def6 | def6 | def6 | varchar2(101) |
| 50 | def7 | def7 | def7 | varchar2(101) |
| 51 | def8 | def8 | def8 | varchar2(101) |
| 52 | def9 | def9 | def9 | varchar2(101) |
| 53 | def10 | def10 | def10 | varchar2(101) |
| 54 | def11 | def11 | def11 | varchar2(101) |
| 55 | def12 | def12 | def12 | varchar2(101) |
| 56 | def13 | def13 | def13 | varchar2(101) |
| 57 | def14 | def14 | def14 | varchar2(101) |
| 58 | def15 | def15 | def15 | varchar2(101) |
| 59 | def16 | def16 | def16 | varchar2(101) |
| 60 | def17 | def17 | def17 | varchar2(101) |
| 61 | def18 | def18 | def18 | varchar2(101) |
| 62 | def19 | def19 | def19 | varchar2(101) |
| 63 | def20 | def20 | def20 | varchar2(101) |
| 64 | creationtime | creationtime | creationtime | char(19) |
| 65 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 66 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 67 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 68 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 69 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |