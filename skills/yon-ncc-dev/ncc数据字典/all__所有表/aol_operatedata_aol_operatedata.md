# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6546.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_operatedata | pk_operatedata | pk_operatedata | char(20) | √ |
| 2 | auditor | auditor | auditor | varchar2(20) |  |  | '~' |
| 3 | audittime | audittime | audittime | char(19) |
| 4 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 5 | billmaketime | billmaketime | billmaketime | char(19) |
| 6 | bill_code | bill_code | bill_code | varchar2(40) |
| 7 | bill_date | bill_date | bill_date | char(19) |
| 8 | bill_status | bill_status | bill_status | number(38, 0) |
| 9 | bill_type | bill_type | bill_type | varchar2(50) |
| 10 | busi_type | busi_type | busi_type | varchar2(20) |  |  | '~' |
| 11 | check_opinion | check_opinion | check_opinion | varchar2(50) |
| 12 | memo | memo | memo | varchar2(200) |
| 13 | origin_rate | origin_rate | origin_rate | number(28, 8) |
| 14 | pk_contract | pk_contract | pk_contract | varchar2(20) |  |  | '~' |
| 15 | pk_currency_local | pk_currency_local | pk_currency_local | varchar2(20) |  |  | '~' |
| 16 | pk_currency_origin | pk_currency_origin | pk_currency_origin | varchar2(20) |  |  | '~' |
| 17 | pk_customer | pk_customer | pk_customer | varchar2(20) |  |  | '~' |
| 18 | pk_fiorg_out | pk_fiorg_out | pk_fiorg_out | varchar2(20) |  |  | '~' |
| 19 | pk_fiorg_out_v | pk_fiorg_out_v | pk_fiorg_out_v | varchar2(20) |  |  | '~' |
| 20 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 21 | pk_jobmngfil | pk_jobmngfil | pk_jobmngfil | varchar2(20) |  |  | '~' |
| 22 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 23 | pk_org_in | pk_org_in | pk_org_in | varchar2(20) |  |  | '~' |
| 24 | pk_org_in_v | pk_org_in_v | pk_org_in_v | varchar2(20) |  |  | '~' |
| 25 | pk_org_out | pk_org_out | pk_org_out | varchar2(20) |  |  | '~' |
| 26 | pk_org_out_v | pk_org_out_v | pk_org_out_v | varchar2(20) |  |  | '~' |
| 27 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 28 | pk_recorder | pk_recorder | pk_recorder | varchar2(20) |  |  | '~' |
| 29 | pk_record_dept | pk_record_dept | pk_record_dept | varchar2(20) |  |  | '~' |
| 30 | pk_record_dept_v | pk_record_dept_v | pk_record_dept_v | varchar2(20) |  |  | '~' |
| 31 | pk_transitype | pk_transitype | pk_transitype | varchar2(20) |  |  | '~' |
| 32 | transi_type | transi_type | transi_type | varchar2(50) |
| 33 | def1 | def1 | def1 | varchar2(101) |
| 34 | def2 | def2 | def2 | varchar2(101) |
| 35 | def3 | def3 | def3 | varchar2(101) |
| 36 | def4 | def4 | def4 | varchar2(101) |
| 37 | def5 | def5 | def5 | varchar2(101) |
| 38 | def6 | def6 | def6 | varchar2(101) |
| 39 | def7 | def7 | def7 | varchar2(101) |
| 40 | def8 | def8 | def8 | varchar2(101) |
| 41 | def9 | def9 | def9 | varchar2(101) |
| 42 | def10 | def10 | def10 | varchar2(101) |
| 43 | def11 | def11 | def11 | varchar2(101) |
| 44 | def12 | def12 | def12 | varchar2(101) |
| 45 | def13 | def13 | def13 | varchar2(101) |
| 46 | def14 | def14 | def14 | varchar2(101) |
| 47 | def15 | def15 | def15 | varchar2(101) |
| 48 | def16 | def16 | def16 | varchar2(101) |
| 49 | def17 | def17 | def17 | varchar2(101) |
| 50 | def18 | def18 | def18 | varchar2(101) |
| 51 | def19 | def19 | def19 | varchar2(101) |
| 52 | def20 | def20 | def20 | varchar2(101) |
| 53 | creationtime | creationtime | creationtime | char(19) |
| 54 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 55 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 56 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 57 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 58 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |