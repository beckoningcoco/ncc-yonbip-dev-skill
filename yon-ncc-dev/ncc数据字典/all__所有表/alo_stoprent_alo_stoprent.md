# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6525.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_stoprent | pk_stoprent | pk_stoprent | char(20) | √ |
| 2 | affirm_date | affirm_date | affirm_date | char(19) |
| 3 | affirm_flag | affirm_flag | affirm_flag | char(1) |
| 4 | affirm_opinion | affirm_opinion | affirm_opinion | varchar2(200) |
| 5 | auditor | auditor | auditor | varchar2(20) |  |  | '~' |
| 6 | audittime | audittime | audittime | char(19) |
| 7 | billdate | billdate | billdate | char(19) |
| 8 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 9 | billmaketime | billmaketime | billmaketime | char(19) |
| 10 | bill_code | bill_code | bill_code | varchar2(40) |
| 11 | bill_status | bill_status | bill_status | number(38, 0) |
| 12 | bill_type | bill_type | bill_type | varchar2(4) |
| 13 | busi_type | busi_type | busi_type | varchar2(20) |  |  | '~' |
| 14 | check_opinion | check_opinion | check_opinion | varchar2(200) |
| 15 | contract_no | contract_no | contract_no | varchar2(80) |
| 16 | cooperate_flag | cooperate_flag | cooperate_flag | char(1) |
| 17 | coopreate_bill | coopreate_bill | coopreate_bill | char(1) |
| 18 | coop_pk_bill | coop_pk_bill | coop_pk_bill | varchar2(20) |
| 19 | lease_type | lease_type | lease_type | number(38, 0) |
| 20 | memo | memo | memo | varchar2(200) |
| 21 | pk_affirmant | pk_affirmant | pk_affirmant | varchar2(20) |  |  | '~' |
| 22 | pk_contract | pk_contract | pk_contract | varchar2(20) |  |  | '~' |
| 23 | pk_currency_origin | pk_currency_origin | pk_currency_origin | varchar2(20) |  |  | '~' |
| 24 | pk_customer | pk_customer | pk_customer | varchar2(20) |  |  | '~' |
| 25 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 26 | pk_jobmngfil | pk_jobmngfil | pk_jobmngfil | varchar2(20) |  |  | '~' |
| 27 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 28 | pk_org_in | pk_org_in | pk_org_in | varchar2(20) |  |  | '~' |
| 29 | pk_org_in_v | pk_org_in_v | pk_org_in_v | varchar2(20) |  |  | '~' |
| 30 | pk_org_out | pk_org_out | pk_org_out | varchar2(20) |  |  | '~' |
| 31 | pk_org_out_v | pk_org_out_v | pk_org_out_v | varchar2(20) |  |  | '~' |
| 32 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 33 | pk_recorder | pk_recorder | pk_recorder | varchar2(20) |  |  | '~' |
| 34 | pk_record_dept | pk_record_dept | pk_record_dept | varchar2(20) |  |  | '~' |
| 35 | pk_record_dept_v | pk_record_dept_v | pk_record_dept_v | varchar2(20) |  |  | '~' |
| 36 | pk_supplier | pk_supplier | pk_supplier | varchar2(20) |  |  | '~' |
| 37 | pk_transitype | pk_transitype | pk_transitype | varchar2(20) |  |  | '~' |
| 38 | transi_type | transi_type | transi_type | varchar2(30) |
| 39 | def1 | def1 | def1 | varchar2(101) |
| 40 | def2 | def2 | def2 | varchar2(101) |
| 41 | def3 | def3 | def3 | varchar2(101) |
| 42 | def4 | def4 | def4 | varchar2(101) |
| 43 | def5 | def5 | def5 | varchar2(101) |
| 44 | def6 | def6 | def6 | varchar2(101) |
| 45 | def7 | def7 | def7 | varchar2(101) |
| 46 | def8 | def8 | def8 | varchar2(101) |
| 47 | def9 | def9 | def9 | varchar2(101) |
| 48 | def10 | def10 | def10 | varchar2(101) |
| 49 | def11 | def11 | def11 | varchar2(101) |
| 50 | def12 | def12 | def12 | varchar2(101) |
| 51 | def13 | def13 | def13 | varchar2(101) |
| 52 | def14 | def14 | def14 | varchar2(101) |
| 53 | def15 | def15 | def15 | varchar2(101) |
| 54 | def16 | def16 | def16 | varchar2(101) |
| 55 | def17 | def17 | def17 | varchar2(101) |
| 56 | def18 | def18 | def18 | varchar2(101) |
| 57 | def19 | def19 | def19 | varchar2(101) |
| 58 | def20 | def20 | def20 | varchar2(101) |
| 59 | creationtime | creationtime | creationtime | char(19) |
| 60 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 61 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 62 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 63 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 64 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |