# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11253.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_rentreceive | pk_rentreceive | pk_rentreceive | char(20) | √ |
| 2 | auditor | auditor | auditor | varchar2(20) |  |  | '~' |
| 3 | audittime | audittime | audittime | char(19) |
| 4 | balance_flag | balance_flag | balance_flag | char(1) |
| 5 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 6 | billmaketime | billmaketime | billmaketime | char(19) |
| 7 | bill_code | bill_code | bill_code | varchar2(40) |
| 8 | bill_status | bill_status | bill_status | number(38, 0) |
| 9 | bill_type | bill_type | bill_type | varchar2(4) |
| 10 | business_date | business_date | business_date | char(19) |
| 11 | busi_type | busi_type | busi_type | varchar2(20) |  |  | '~' |
| 12 | check_opinion | check_opinion | check_opinion | varchar2(50) |
| 13 | confirm_flag | confirm_flag | confirm_flag | char(1) |
| 14 | confirm_opinion | confirm_opinion | confirm_opinion | varchar2(200) |
| 15 | confirm_time | confirm_time | confirm_time | char(19) |
| 16 | cooperatebill_flag | cooperatebill_flag | cooperatebill_flag | char(1) |
| 17 | cooperate_flag | cooperate_flag | cooperate_flag | char(1) |
| 18 | lease_type | lease_type | lease_type | number(38, 0) |
| 19 | memo | memo | memo | varchar2(200) |
| 20 | pk_confirmer | pk_confirmer | pk_confirmer | varchar2(20) |  |  | '~' |
| 21 | pk_currency | pk_currency | pk_currency | varchar2(20) |  |  | '~' |
| 22 | pk_customer | pk_customer | pk_customer | varchar2(20) |  |  | '~' |
| 23 | pk_dept | pk_dept | pk_dept | varchar2(20) |  |  | '~' |
| 24 | pk_dept_v | pk_dept_v | pk_dept_v | varchar2(20) |  |  | '~' |
| 25 | pk_fiorg | pk_fiorg | pk_fiorg | varchar2(20) |  |  | '~' |
| 26 | pk_fiorg_v | pk_fiorg_v | pk_fiorg_v | varchar2(20) |  |  | '~' |
| 27 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 28 | pk_jobmngfil | pk_jobmngfil | pk_jobmngfil | varchar2(20) |  |  | '~' |
| 29 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 30 | pk_org_in | pk_org_in | pk_org_in | varchar2(20) |  |  | '~' |
| 31 | pk_org_in_v | pk_org_in_v | pk_org_in_v | varchar2(20) |  |  | '~' |
| 32 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 33 | pk_raorg | pk_raorg | pk_raorg | varchar2(20) |  |  | '~' |
| 34 | pk_raorg_v | pk_raorg_v | pk_raorg_v | varchar2(20) |  |  | '~' |
| 35 | pk_recorder | pk_recorder | pk_recorder | varchar2(20) |  |  | '~' |
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