# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8005.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_mtcon | pk_mtcon | pk_mtcon | char(20) | √ |
| 2 | actu_end_date | actu_end_date | actu_end_date | char(19) |
| 3 | actu_start_date | actu_start_date | actu_start_date | char(19) |
| 4 | auditor | auditor | auditor | varchar2(20) |  |  | '~' |
| 5 | audittime | audittime | audittime | char(19) |
| 6 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 7 | billmaketime | billmaketime | billmaketime | char(19) |
| 8 | bill_code | bill_code | bill_code | varchar2(20) |
| 9 | bill_status | bill_status | bill_status | number(38, 0) |
| 10 | bill_type | bill_type | bill_type | varchar2(4) |
| 11 | busi_type | busi_type | busi_type | varchar2(20) |  |  | '~' |
| 12 | check_opinion | check_opinion | check_opinion | varchar2(50) |
| 13 | contmoney | contmoney | contmoney | number(28, 8) |
| 14 | contmoney_global | contmoney_global | contmoney_global | number(28, 8) |
| 15 | contmoney_group | contmoney_group | contmoney_group | number(28, 8) |
| 16 | contmoney_org | contmoney_org | contmoney_org | number(28, 8) |
| 17 | cont_name | cont_name | cont_name | varchar2(200) |
| 18 | curr_rate | curr_rate | curr_rate | number(28, 8) |
| 19 | earnest | earnest | earnest | number(28, 8) |
| 20 | earnest_global | earnest_global | earnest_global | number(28, 8) |
| 21 | earnest_group | earnest_group | earnest_group | number(28, 8) |
| 22 | earnest_org | earnest_org | earnest_org | number(28, 8) |
| 23 | memo | memo | memo | varchar2(200) |
| 24 | nversion | nversion | nversion | number(38, 0) |
| 25 | pk_currency | pk_currency | pk_currency | varchar2(20) |  |  | '~' |
| 26 | pk_currency_origin | pk_currency_origin | pk_currency_origin | varchar2(20) |  |  | '~' |
| 27 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 28 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 29 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 30 | pk_orig_bill | pk_orig_bill | pk_orig_bill | varchar2(50) |  |  | '~' |
| 31 | pk_project | pk_project | pk_project | varchar2(20) |  |  | '~' |
| 32 | pk_provider | pk_provider | pk_provider | varchar2(20) |  |  | '~' |
| 33 | pk_sign_dept | pk_sign_dept | pk_sign_dept | varchar2(20) |  |  | '~' |
| 34 | pk_sign_dept_v | pk_sign_dept_v | pk_sign_dept_v | varchar2(20) |  |  | '~' |
| 35 | pk_sign_user | pk_sign_user | pk_sign_user | varchar2(20) |  |  | '~' |
| 36 | pk_transitype | pk_transitype | pk_transitype | varchar2(20) |  |  | '~' |
| 37 | plan_end_date | plan_end_date | plan_end_date | char(19) |
| 38 | plan_start_date | plan_start_date | plan_start_date | char(19) |
| 39 | sign_date | sign_date | sign_date | char(19) |
| 40 | sign_site | sign_site | sign_site | varchar2(80) |
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