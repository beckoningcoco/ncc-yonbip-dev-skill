# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10528.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | auditor | auditor | auditor | varchar2(20) |  |  | '~' |
| 2 | audittime | audittime | audittime | char(19) |
| 3 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 4 | billmaketime | billmaketime | billmaketime | char(19) |
| 5 | bill_code | bill_code | bill_code | varchar2(50) |
| 6 | bill_status | bill_status | bill_status | number(38, 0) |
| 7 | bill_type | bill_type | bill_type | varchar2(50) |
| 8 | busi_type | busi_type | busi_type | varchar2(20) |  |  | '~' |
| 9 | check_opinion | check_opinion | check_opinion | varchar2(50) |
| 10 | memo | memo | memo | varchar2(600) |
| 11 | percentage | percentage | percentage | number(28, 8) |
| 12 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 13 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 14 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 15 | pk_plan | pk_plan | pk_plan | varchar2(20) |  |  | '~' |
| 16 | pk_plan_item | pk_plan_item | pk_plan_item | varchar2(20) |  |  | '~' |
| 17 | pk_progress_record | pk_progress_record | pk_progress_record | char(20) | √ |
| 18 | pk_project | pk_project | pk_project | varchar2(20) |  |  | '~' |
| 19 | pk_transitype | pk_transitype | pk_transitype | varchar2(20) |  |  | '~' |
| 20 | real_duration | real_duration | real_duration | number(38, 0) |
| 21 | real_end_date | real_end_date | real_end_date | char(19) |
| 22 | real_start_date | real_start_date | real_start_date | char(19) |
| 23 | src_bill_code | src_bill_code | src_bill_code | varchar2(50) |
| 24 | src_bill_type | src_bill_type | src_bill_type | varchar2(50) |
| 25 | src_pk_bill | src_pk_bill | src_pk_bill | varchar2(50) |
| 26 | src_pk_transitype | src_pk_transitype | src_pk_transitype | varchar2(20) |  |  | '~' |
| 27 | src_rowid | src_rowid | src_rowid | varchar2(50) |
| 28 | src_rowno | src_rowno | src_rowno | varchar2(50) |
| 29 | src_transi_type | src_transi_type | src_transi_type | varchar2(50) |
| 30 | transi_type | transi_type | transi_type | varchar2(50) |
| 31 | def1 | def1 | def1 | varchar2(100) |
| 32 | def2 | def2 | def2 | varchar2(100) |
| 33 | def3 | def3 | def3 | varchar2(100) |
| 34 | def4 | def4 | def4 | varchar2(100) |
| 35 | def5 | def5 | def5 | varchar2(100) |
| 36 | def6 | def6 | def6 | varchar2(100) |
| 37 | def7 | def7 | def7 | varchar2(100) |
| 38 | def8 | def8 | def8 | varchar2(100) |
| 39 | def9 | def9 | def9 | varchar2(100) |
| 40 | def10 | def10 | def10 | varchar2(100) |
| 41 | def11 | def11 | def11 | varchar2(100) |
| 42 | def12 | def12 | def12 | varchar2(100) |
| 43 | def13 | def13 | def13 | varchar2(100) |
| 44 | def14 | def14 | def14 | varchar2(100) |
| 45 | def15 | def15 | def15 | varchar2(100) |
| 46 | def16 | def16 | def16 | varchar2(100) |
| 47 | def17 | def17 | def17 | varchar2(100) |
| 48 | def18 | def18 | def18 | varchar2(100) |
| 49 | def19 | def19 | def19 | varchar2(100) |
| 50 | def20 | def20 | def20 | varchar2(100) |
| 51 | creationtime | creationtime | creationtime | char(19) |
| 52 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 53 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 54 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 55 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 56 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |