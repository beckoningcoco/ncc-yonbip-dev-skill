# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10624.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_materialacc | pk_materialacc | pk_materialacc | char(20) | √ |
| 2 | accdif_money | accdif_money | accdif_money | number(28, 8) |
| 3 | accdif_taxmny | accdif_taxmny | accdif_taxmny | number(28, 8) |
| 4 | acc_date | acc_date | acc_date | char(19) |
| 5 | actual_deduct_money | actual_deduct_money | actual_deduct_money | number(28, 8) |
| 6 | apply_mny | apply_mny | apply_mny | number(28, 8) |  |  | 0 |
| 7 | auditor | auditor | auditor | varchar2(20) |  |  | '~' |
| 8 | audittime | audittime | audittime | char(19) |
| 9 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 10 | billmaketime | billmaketime | billmaketime | char(19) |
| 11 | bill_code | bill_code | bill_code | varchar2(40) |
| 12 | bill_status | bill_status | bill_status | number(38, 0) |
| 13 | bill_type | bill_type | bill_type | varchar2(4) |
| 14 | busi_type | busi_type | busi_type | varchar2(20) |  |  | '~' |
| 15 | check_opinion | check_opinion | check_opinion | varchar2(200) |
| 16 | estimate_flag | estimate_flag | estimate_flag | char(1) |
| 17 | flexible_flag | flexible_flag | flexible_flag | char(1) |
| 18 | invoice_mny | invoice_mny | invoice_mny | number(28, 8) |  |  | 0 |
| 19 | material_money | material_money | material_money | number(28, 8) |
| 20 | material_taxmny | material_taxmny | material_taxmny | number(28, 8) |
| 21 | mate_invoice_mny | mate_invoice_mny | mate_invoice_mny | number(28, 8) |  |  | 0 |
| 22 | memo | memo | memo | varchar2(200) |
| 23 | pay_mny | pay_mny | pay_mny | number(28, 8) |  |  | 0 |
| 24 | pk_contr | pk_contr | pk_contr | varchar2(20) |  |  | '~' |
| 25 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 26 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 27 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 28 | pk_project | pk_project | pk_project | varchar2(20) |  |  | '~' |
| 29 | pk_supplier | pk_supplier | pk_supplier | varchar2(20) |  |  | '~' |
| 30 | pk_transactor | pk_transactor | pk_transactor | varchar2(20) |  |  | '~' |
| 31 | pk_transact_dept | pk_transact_dept | pk_transact_dept | varchar2(20) |  |  | '~' |
| 32 | pk_transact_dept_v | pk_transact_dept_v | pk_transact_dept_v | varchar2(20) |  |  | '~' |
| 33 | pk_transitype | pk_transitype | pk_transitype | varchar2(20) |  |  | '~' |
| 34 | pk_wbs | pk_wbs | pk_wbs | varchar2(20) |  |  | '~' |
| 35 | polish_flag | polish_flag | polish_flag | char(1) |
| 36 | saga_btxid | saga_btxid | saga_btxid | varchar2(50) |
| 37 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |
| 38 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(50) |
| 39 | saga_status | saga_status | saga_status | number(38, 0) |
| 40 | secondmate_money | secondmate_money | secondmate_money | number(28, 8) |
| 41 | secondmate_taxmny | secondmate_taxmny | secondmate_taxmny | number(28, 8) |
| 42 | sec_invoice_mny | sec_invoice_mny | sec_invoice_mny | number(28, 8) |  |  | 0 |
| 43 | src_bill_code | src_bill_code | src_bill_code | varchar2(50) |
| 44 | src_bill_type | src_bill_type | src_bill_type | varchar2(4) |
| 45 | src_pk_bill | src_pk_bill | src_pk_bill | varchar2(20) |
| 46 | src_pk_transitype | src_pk_transitype | src_pk_transitype | varchar2(20) |  |  | '~' |
| 47 | src_transi_type | src_transi_type | src_transi_type | varchar2(30) |
| 48 | transi_type | transi_type | transi_type | varchar2(30) |
| 49 | def1 | def1 | def1 | varchar2(101) |
| 50 | def2 | def2 | def2 | varchar2(101) |
| 51 | def3 | def3 | def3 | varchar2(101) |
| 52 | def4 | def4 | def4 | varchar2(101) |
| 53 | def5 | def5 | def5 | varchar2(101) |
| 54 | def6 | def6 | def6 | varchar2(101) |
| 55 | def7 | def7 | def7 | varchar2(101) |
| 56 | def8 | def8 | def8 | varchar2(101) |
| 57 | def9 | def9 | def9 | varchar2(101) |
| 58 | def10 | def10 | def10 | varchar2(101) |
| 59 | def11 | def11 | def11 | varchar2(101) |
| 60 | def12 | def12 | def12 | varchar2(101) |
| 61 | def13 | def13 | def13 | varchar2(101) |
| 62 | def14 | def14 | def14 | varchar2(101) |
| 63 | def15 | def15 | def15 | varchar2(101) |
| 64 | def16 | def16 | def16 | varchar2(101) |
| 65 | def17 | def17 | def17 | varchar2(101) |
| 66 | def18 | def18 | def18 | varchar2(101) |
| 67 | def19 | def19 | def19 | varchar2(101) |
| 68 | def20 | def20 | def20 | varchar2(101) |
| 69 | creationtime | creationtime | creationtime | char(19) |
| 70 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 71 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 72 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 73 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 74 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |