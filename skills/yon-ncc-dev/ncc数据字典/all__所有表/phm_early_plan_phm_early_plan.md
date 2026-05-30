# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10506.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_early_plan | pk_early_plan | pk_early_plan | char(20) | √ |
| 2 | auditor | auditor | auditor | varchar2(20) |  |  | '~' |
| 3 | audittime | audittime | audittime | char(19) |
| 4 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 5 | billmaketime | billmaketime | billmaketime | char(19) |
| 6 | bill_code | bill_code | bill_code | varchar2(50) |
| 7 | bill_status | bill_status | bill_status | number(38, 0) |
| 8 | bill_type | bill_type | bill_type | varchar2(20) |
| 9 | busi_type | busi_type | busi_type | varchar2(20) |  |  | '~' |
| 10 | check_opinion | check_opinion | check_opinion | varchar2(50) |
| 11 | item_num | item_num | item_num | number(38, 0) |
| 12 | memo | memo | memo | varchar2(600) |
| 13 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 14 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 15 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 16 | pk_progress | pk_progress | pk_progress | varchar2(20) |  |  | '~' |
| 17 | pk_project | pk_project | pk_project | varchar2(20) |  |  | '~' |
| 18 | pk_project_reg | pk_project_reg | pk_project_reg | varchar2(20) |  |  | '~' |
| 19 | pk_transitype | pk_transitype | pk_transitype | varchar2(20) |  |  | '~' |
| 20 | src_bill_code | src_bill_code | src_bill_code | varchar2(50) |
| 21 | src_bill_type | src_bill_type | src_bill_type | varchar2(50) |
| 22 | src_pk_bill | src_pk_bill | src_pk_bill | varchar2(50) |
| 23 | src_pk_transitype | src_pk_transitype | src_pk_transitype | varchar2(20) |  |  | '~' |
| 24 | src_transi_type | src_transi_type | src_transi_type | varchar2(50) |
| 25 | transi_type | transi_type | transi_type | varchar2(20) |
| 26 | def1 | def1 | def1 | varchar2(101) |
| 27 | def2 | def2 | def2 | varchar2(101) |
| 28 | def3 | def3 | def3 | varchar2(101) |
| 29 | def4 | def4 | def4 | varchar2(101) |
| 30 | def5 | def5 | def5 | varchar2(101) |
| 31 | def6 | def6 | def6 | varchar2(101) |
| 32 | def7 | def7 | def7 | varchar2(101) |
| 33 | def8 | def8 | def8 | varchar2(101) |
| 34 | def9 | def9 | def9 | varchar2(101) |
| 35 | def10 | def10 | def10 | varchar2(101) |
| 36 | def11 | def11 | def11 | varchar2(101) |
| 37 | def12 | def12 | def12 | varchar2(101) |
| 38 | def13 | def13 | def13 | varchar2(101) |
| 39 | def14 | def14 | def14 | varchar2(101) |
| 40 | def15 | def15 | def15 | varchar2(101) |
| 41 | def16 | def16 | def16 | varchar2(101) |
| 42 | def17 | def17 | def17 | varchar2(101) |
| 43 | def18 | def18 | def18 | varchar2(101) |
| 44 | def19 | def19 | def19 | varchar2(101) |
| 45 | def20 | def20 | def20 | varchar2(101) |
| 46 | creationtime | creationtime | creationtime | char(19) |
| 47 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 48 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 49 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 50 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 51 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |