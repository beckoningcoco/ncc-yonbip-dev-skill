# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11217.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_accept | pk_accept | pk_accept | char(20) | √ |
| 2 | auditor | auditor | auditor | varchar2(20) |  |  | '~' |
| 3 | audittime | audittime | audittime | char(19) |
| 4 | balance_flag | balance_flag | balance_flag | char(1) |
| 5 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 6 | billmaketime | billmaketime | billmaketime | char(19) |
| 7 | bill_code | bill_code | bill_code | varchar2(40) |
| 8 | bill_status | bill_status | bill_status | number(38, 0) |
| 9 | bill_type | bill_type | bill_type | varchar2(4) |
| 10 | bill_type_src | bill_type_src | bill_type_src | varchar2(4) |
| 11 | bill_type_src_cooperate | bill_type_src_cooperate | bill_type_src_cooperate | varchar2(4) |
| 12 | business_date | business_date | business_date | char(19) |
| 13 | busi_type | busi_type | busi_type | varchar2(20) |  |  | '~' |
| 14 | check_opinion | check_opinion | check_opinion | varchar2(200) |
| 15 | confirm_flag | confirm_flag | confirm_flag | char(1) |
| 16 | confirm_opinion | confirm_opinion | confirm_opinion | varchar2(200) |
| 17 | confirm_time | confirm_time | confirm_time | char(19) |
| 18 | cooperatebill_flag | cooperatebill_flag | cooperatebill_flag | char(1) |
| 19 | cooperate_flag | cooperate_flag | cooperate_flag | char(1) |
| 20 | headts_src_cooperate | headts_src_cooperate | headts_src_cooperate | char(19) |
| 21 | memo | memo | memo | varchar2(200) |
| 22 | origin_rate | origin_rate | origin_rate | number(28, 8) |
| 23 | pk_bill_src_cooperate | pk_bill_src_cooperate | pk_bill_src_cooperate | varchar2(20) |
| 24 | pk_confirmer | pk_confirmer | pk_confirmer | varchar2(20) |  |  | '~' |
| 25 | pk_contract_base | pk_contract_base | pk_contract_base | varchar2(20) |  |  | '~' |
| 26 | pk_contract_v | pk_contract_v | pk_contract_v | varchar2(20) |  |  | '~' |
| 27 | pk_currency | pk_currency | pk_currency | varchar2(20) |  |  | '~' |
| 28 | pk_currency_origin | pk_currency_origin | pk_currency_origin | varchar2(20) |  |  | '~' |
| 29 | pk_customer | pk_customer | pk_customer | varchar2(20) |  |  | '~' |
| 30 | pk_dept | pk_dept | pk_dept | varchar2(20) |  |  | '~' |
| 31 | pk_dept_v | pk_dept_v | pk_dept_v | varchar2(20) |  |  | '~' |
| 32 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 33 | pk_jobmngfil | pk_jobmngfil | pk_jobmngfil | varchar2(20) |  |  | '~' |
| 34 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 35 | pk_org_in | pk_org_in | pk_org_in | varchar2(20) |  |  | '~' |
| 36 | pk_org_in_v | pk_org_in_v | pk_org_in_v | varchar2(20) |  |  | '~' |
| 37 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 38 | pk_recorder | pk_recorder | pk_recorder | varchar2(20) |  |  | '~' |
| 39 | pk_supplier | pk_supplier | pk_supplier | varchar2(20) |  |  | '~' |
| 40 | pk_transitype | pk_transitype | pk_transitype | varchar2(20) |  |  | '~' |
| 41 | pk_warehouse | pk_warehouse | pk_warehouse | varchar2(20) |  |  | '~' |
| 42 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 43 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |
| 44 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 45 | saga_status | saga_status | saga_status | number(38, 0) |
| 46 | start_flag | start_flag | start_flag | char(1) |
| 47 | transi_type | transi_type | transi_type | varchar2(30) |
| 48 | transi_type_src | transi_type_src | transi_type_src | varchar2(30) |
| 49 | transi_type_src_cooperate | transi_type_src_cooperate | transi_type_src_cooperate | varchar2(30) |
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