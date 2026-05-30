# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10681.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_providereg | pk_providereg | pk_providereg | char(20) | √ |
| 2 | account_days | account_days | account_days | number(38, 0) |
| 3 | auditor | auditor | auditor | varchar2(20) |  |  | '~' |
| 4 | audittime | audittime | audittime | char(19) |
| 5 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 6 | billmaketime | billmaketime | billmaketime | char(19) |
| 7 | bill_code | bill_code | bill_code | varchar2(40) |
| 8 | bill_status | bill_status | bill_status | number(38, 0) |
| 9 | bill_type | bill_type | bill_type | varchar2(4) |
| 10 | busi_type | busi_type | busi_type | varchar2(20) |  |  | '~' |
| 11 | cha_taxmny | cha_taxmny | cha_taxmny | number(28, 8) |
| 12 | check_opinion | check_opinion | check_opinion | varchar2(50) |
| 13 | invoice_code | invoice_code | invoice_code | varchar2(50) |
| 14 | invoice_number | invoice_number | invoice_number | varchar2(8) |
| 15 | invoice_type | invoice_type | invoice_type | number(38, 0) |  |  | 1 |
| 16 | last_pre_taxmny | last_pre_taxmny | last_pre_taxmny | number(28, 8) |
| 17 | memo | memo | memo | varchar2(200) |
| 18 | mny | mny | mny | number(28, 8) |  |  | 0 |
| 19 | mny_global | mny_global | mny_global | number(28, 8) |  |  | 0 |
| 20 | mny_group | mny_group | mny_group | number(28, 8) |  |  | 0 |
| 21 | pk_contr | pk_contr | pk_contr | varchar2(20) |  |  | '~' |
| 22 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 23 | pk_cusbankacc | pk_cusbankacc | pk_cusbankacc | varchar2(50) |  |  | '~' |
| 24 | pk_cusdutypar | pk_cusdutypar | pk_cusdutypar | varchar2(50) |  |  | '~' |
| 25 | pk_customer | pk_customer | pk_customer | varchar2(20) |  |  | '~' |
| 26 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 27 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 28 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 29 | pk_project | pk_project | pk_project | varchar2(20) |  |  | '~' |
| 30 | pk_transitype | pk_transitype | pk_transitype | varchar2(20) |  |  | '~' |
| 31 | provide_register_complete | provide_register_complete | provide_register_complete | char(1) |  |  | 'N' |
| 32 | qual_enddate | qual_enddate | qual_enddate | char(19) |
| 33 | qual_mny | qual_mny | qual_mny | number(28, 8) |
| 34 | recv_deadline | recv_deadline | recv_deadline | char(19) |
| 35 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 36 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |  |  | 0 |
| 37 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 38 | saga_status | saga_status | saga_status | number(38, 0) |  |  | 0 |
| 39 | src_bill_code | src_bill_code | src_bill_code | varchar2(50) |
| 40 | src_bill_type | src_bill_type | src_bill_type | varchar2(50) |
| 41 | src_pk_bill | src_pk_bill | src_pk_bill | varchar2(50) |
| 42 | src_pk_transitype | src_pk_transitype | src_pk_transitype | varchar2(50) |
| 43 | src_transi_type | src_transi_type | src_transi_type | varchar2(50) |
| 44 | start_inv_date | start_inv_date | start_inv_date | char(19) |
| 45 | tax | tax | tax | number(28, 8) |  |  | 0 |
| 46 | taxmny | taxmny | taxmny | number(28, 8) |  |  | 0 |
| 47 | taxmny_global | taxmny_global | taxmny_global | number(28, 8) |  |  | 0 |
| 48 | taxmny_group | taxmny_group | taxmny_group | number(28, 8) |  |  | 0 |
| 49 | transi_type | transi_type | transi_type | varchar2(30) |
| 50 | def1 | def1 | def1 | varchar2(101) |
| 51 | def2 | def2 | def2 | varchar2(101) |
| 52 | def3 | def3 | def3 | varchar2(101) |
| 53 | def4 | def4 | def4 | varchar2(101) |
| 54 | def5 | def5 | def5 | varchar2(101) |
| 55 | def6 | def6 | def6 | varchar2(101) |
| 56 | def7 | def7 | def7 | varchar2(101) |
| 57 | def8 | def8 | def8 | varchar2(101) |
| 58 | def9 | def9 | def9 | varchar2(101) |
| 59 | def10 | def10 | def10 | varchar2(101) |
| 60 | def11 | def11 | def11 | varchar2(101) |
| 61 | def12 | def12 | def12 | varchar2(101) |
| 62 | def13 | def13 | def13 | varchar2(101) |
| 63 | def14 | def14 | def14 | varchar2(101) |
| 64 | def15 | def15 | def15 | varchar2(101) |
| 65 | def16 | def16 | def16 | varchar2(101) |
| 66 | def17 | def17 | def17 | varchar2(101) |
| 67 | def18 | def18 | def18 | varchar2(101) |
| 68 | def19 | def19 | def19 | varchar2(101) |
| 69 | def20 | def20 | def20 | varchar2(101) |
| 70 | creationtime | creationtime | creationtime | char(19) |
| 71 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 72 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 73 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 74 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 75 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |