# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10607.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_feebalance | pk_feebalance | pk_feebalance | char(20) | √ |
| 2 | auditor | auditor | auditor | varchar2(20) |  |  | '~' |
| 3 | audittime | audittime | audittime | char(19) |
| 4 | balance_date | balance_date | balance_date | char(19) |
| 5 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 6 | billmaketime | billmaketime | billmaketime | char(19) |
| 7 | bill_code | bill_code | bill_code | varchar2(50) |
| 8 | bill_status | bill_status | bill_status | number(38, 0) |
| 9 | bill_type | bill_type | bill_type | varchar2(50) |
| 10 | busi_type | busi_type | busi_type | varchar2(20) |  |  | '~' |
| 11 | check_opinion | check_opinion | check_opinion | varchar2(50) |
| 12 | curr_mny | curr_mny | curr_mny | number(28, 8) |
| 13 | curr_taxmny | curr_taxmny | curr_taxmny | number(28, 8) |
| 14 | estimate_flag | estimate_flag | estimate_flag | char(1) |
| 15 | flexible_flag | flexible_flag | flexible_flag | char(1) |
| 16 | invoice_mny | invoice_mny | invoice_mny | number(28, 8) |
| 17 | memo | memo | memo | varchar2(200) |
| 18 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 19 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 20 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 21 | pk_supplier | pk_supplier | pk_supplier | varchar2(20) |  |  | '~' |
| 22 | pk_transactor | pk_transactor | pk_transactor | varchar2(20) |  |  | '~' |
| 23 | pk_transact_dept | pk_transact_dept | pk_transact_dept | varchar2(20) |  |  | '~' |
| 24 | pk_transact_dept_v | pk_transact_dept_v | pk_transact_dept_v | varchar2(20) |  |  | '~' |
| 25 | pk_transitype | pk_transitype | pk_transitype | varchar2(20) |  |  | '~' |
| 26 | polish_flag | polish_flag | polish_flag | char(1) |
| 27 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 28 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |  |  | 0 |
| 29 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 30 | saga_status | saga_status | saga_status | number(38, 0) |  |  | 0 |
| 31 | tax | tax | tax | number(28, 8) |
| 32 | transi_type | transi_type | transi_type | varchar2(50) |
| 33 | verify_mny | verify_mny | verify_mny | number(28, 8) |  |  | 0 |
| 34 | def1 | def1 | def1 | varchar2(101) |
| 35 | def2 | def2 | def2 | varchar2(101) |
| 36 | def3 | def3 | def3 | varchar2(101) |
| 37 | def4 | def4 | def4 | varchar2(101) |
| 38 | def5 | def5 | def5 | varchar2(101) |
| 39 | def6 | def6 | def6 | varchar2(101) |
| 40 | def7 | def7 | def7 | varchar2(101) |
| 41 | def8 | def8 | def8 | varchar2(101) |
| 42 | def9 | def9 | def9 | varchar2(101) |
| 43 | def10 | def10 | def10 | varchar2(101) |
| 44 | def11 | def11 | def11 | varchar2(101) |
| 45 | def12 | def12 | def12 | varchar2(101) |
| 46 | def13 | def13 | def13 | varchar2(101) |
| 47 | def14 | def14 | def14 | varchar2(101) |
| 48 | def15 | def15 | def15 | varchar2(101) |
| 49 | def16 | def16 | def16 | varchar2(101) |
| 50 | def17 | def17 | def17 | varchar2(101) |
| 51 | def18 | def18 | def18 | varchar2(101) |
| 52 | def19 | def19 | def19 | varchar2(101) |
| 53 | def20 | def20 | def20 | varchar2(101) |
| 54 | creationtime | creationtime | creationtime | char(19) |
| 55 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 56 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 57 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 58 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 59 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |