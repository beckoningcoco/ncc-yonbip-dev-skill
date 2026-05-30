# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6497.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_settle | pk_settle | pk_settle | char(20) | √ |
| 2 | auditor | auditor | auditor | varchar2(20) |  |  | '~' |
| 3 | audittime | audittime | audittime | char(19) |
| 4 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 5 | billmaketime | billmaketime | billmaketime | char(19) |
| 6 | bill_code | bill_code | bill_code | varchar2(40) |
| 7 | bill_status | bill_status | bill_status | number(38, 0) |
| 8 | bill_type | bill_type | bill_type | varchar2(4) |
| 9 | busi_type | busi_type | busi_type | varchar2(20) |  |  | '~' |
| 10 | check_opinion | check_opinion | check_opinion | varchar2(200) |
| 11 | gather_money | gather_money | gather_money | number(28, 8) |
| 12 | gather_money_global | gather_money_global | gather_money_global | number(28, 8) |
| 13 | gather_money_group | gather_money_group | gather_money_group | number(28, 8) |
| 14 | gather_money_org | gather_money_org | gather_money_org | number(28, 8) |
| 15 | memo | memo | memo | varchar2(200) |
| 16 | origin_rate | origin_rate | origin_rate | number(28, 8) |
| 17 | pk_currency_local | pk_currency_local | pk_currency_local | varchar2(20) |  |  | '~' |
| 18 | pk_currency_origin | pk_currency_origin | pk_currency_origin | varchar2(20) |  |  | '~' |
| 19 | pk_fiorg_in | pk_fiorg_in | pk_fiorg_in | varchar2(20) |  |  | '~' |
| 20 | pk_fiorg_in_v | pk_fiorg_in_v | pk_fiorg_in_v | varchar2(20) |  |  | '~' |
| 21 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 22 | pk_jobmngfil | pk_jobmngfil | pk_jobmngfil | varchar2(20) |  |  | '~' |
| 23 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 24 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 25 | pk_raorg_in | pk_raorg_in | pk_raorg_in | varchar2(20) |  |  | '~' |
| 26 | pk_raorg_in_v | pk_raorg_in_v | pk_raorg_in_v | varchar2(20) |  |  | '~' |
| 27 | pk_recorder | pk_recorder | pk_recorder | varchar2(20) |  |  | '~' |
| 28 | pk_record_dept | pk_record_dept | pk_record_dept | varchar2(20) |  |  | '~' |
| 29 | pk_record_dept_v | pk_record_dept_v | pk_record_dept_v | varchar2(20) |  |  | '~' |
| 30 | pk_supplier | pk_supplier | pk_supplier | varchar2(20) |  |  | '~' |
| 31 | pk_transitype | pk_transitype | pk_transitype | varchar2(20) |  |  | '~' |
| 32 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 33 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |
| 34 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 35 | saga_status | saga_status | saga_status | number(38, 0) |
| 36 | settle_date | settle_date | settle_date | char(19) |
| 37 | sum_curr | sum_curr | sum_curr | number(28, 8) |
| 38 | sum_curr_global | sum_curr_global | sum_curr_global | number(28, 8) |
| 39 | sum_curr_group | sum_curr_group | sum_curr_group | number(28, 8) |
| 40 | sum_curr_org | sum_curr_org | sum_curr_org | number(28, 8) |
| 41 | transi_type | transi_type | transi_type | varchar2(30) |
| 42 | def1 | def1 | def1 | varchar2(101) |
| 43 | def2 | def2 | def2 | varchar2(101) |
| 44 | def3 | def3 | def3 | varchar2(101) |
| 45 | def4 | def4 | def4 | varchar2(101) |
| 46 | def5 | def5 | def5 | varchar2(101) |
| 47 | def6 | def6 | def6 | varchar2(101) |
| 48 | def7 | def7 | def7 | varchar2(101) |
| 49 | def8 | def8 | def8 | varchar2(101) |
| 50 | def9 | def9 | def9 | varchar2(101) |
| 51 | def10 | def10 | def10 | varchar2(101) |
| 52 | def11 | def11 | def11 | varchar2(101) |
| 53 | def12 | def12 | def12 | varchar2(101) |
| 54 | def13 | def13 | def13 | varchar2(101) |
| 55 | def14 | def14 | def14 | varchar2(101) |
| 56 | def15 | def15 | def15 | varchar2(101) |
| 57 | def16 | def16 | def16 | varchar2(101) |
| 58 | def17 | def17 | def17 | varchar2(101) |
| 59 | def18 | def18 | def18 | varchar2(101) |
| 60 | def19 | def19 | def19 | varchar2(101) |
| 61 | def20 | def20 | def20 | varchar2(101) |
| 62 | creationtime | creationtime | creationtime | char(19) |
| 63 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 64 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 65 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 66 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 67 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |