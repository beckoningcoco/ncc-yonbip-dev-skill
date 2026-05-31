# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7868.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pcplan | pk_pcplan | pk_pcplan | char(20) | √ |
| 2 | auditor | auditor | auditor | varchar2(20) |  |  | '~' |
| 3 | audittime | audittime | audittime | char(19) |
| 4 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 5 | billmaketime | billmaketime | billmaketime | char(19) |
| 6 | bill_code | bill_code | bill_code | varchar2(40) |
| 7 | bill_status | bill_status | bill_status | number(38, 0) |
| 8 | bill_type | bill_type | bill_type | varchar2(50) |
| 9 | busi_type | busi_type | busi_type | varchar2(20) |
| 10 | check_opinion | check_opinion | check_opinion | varchar2(50) |
| 11 | close_time | close_time | close_time | char(19) |
| 12 | edit_date | edit_date | edit_date | char(19) |
| 13 | memo | memo | memo | varchar2(200) |
| 14 | pk_closer | pk_closer | pk_closer | varchar2(20) |  |  | '~' |
| 15 | pk_editor | pk_editor | pk_editor | varchar2(20) |  |  | '~' |
| 16 | pk_edit_dept | pk_edit_dept | pk_edit_dept | varchar2(20) |  |  | '~' |
| 17 | pk_edit_dept_v | pk_edit_dept_v | pk_edit_dept_v | varchar2(20) |  |  | '~' |
| 18 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 19 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 20 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 21 | pk_transitype | pk_transitype | pk_transitype | varchar2(20) |  |  | '~' |
| 22 | plan_name | plan_name | plan_name | varchar2(120) |
| 23 | plan_name2 | plan_name2 | plan_name2 | varchar2(120) |
| 24 | plan_name3 | plan_name3 | plan_name3 | varchar2(120) |
| 25 | plan_name4 | plan_name4 | plan_name4 | varchar2(120) |
| 26 | plan_name5 | plan_name5 | plan_name5 | varchar2(120) |
| 27 | plan_name6 | plan_name6 | plan_name6 | varchar2(120) |
| 28 | transi_type | transi_type | transi_type | varchar2(20) |
| 29 | def1 | def1 | def1 | varchar2(101) |
| 30 | def2 | def2 | def2 | varchar2(101) |
| 31 | def3 | def3 | def3 | varchar2(101) |
| 32 | def4 | def4 | def4 | varchar2(101) |
| 33 | def5 | def5 | def5 | varchar2(101) |
| 34 | def6 | def6 | def6 | varchar2(101) |
| 35 | def7 | def7 | def7 | varchar2(101) |
| 36 | def8 | def8 | def8 | varchar2(101) |
| 37 | def9 | def9 | def9 | varchar2(101) |
| 38 | def10 | def10 | def10 | varchar2(101) |
| 39 | def11 | def11 | def11 | varchar2(101) |
| 40 | def12 | def12 | def12 | varchar2(101) |
| 41 | def13 | def13 | def13 | varchar2(101) |
| 42 | def14 | def14 | def14 | varchar2(101) |
| 43 | def15 | def15 | def15 | varchar2(101) |
| 44 | def16 | def16 | def16 | varchar2(101) |
| 45 | def17 | def17 | def17 | varchar2(101) |
| 46 | def18 | def18 | def18 | varchar2(101) |
| 47 | def19 | def19 | def19 | varchar2(101) |
| 48 | def20 | def20 | def20 | varchar2(101) |
| 49 | creationtime | creationtime | creationtime | char(19) |
| 50 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 51 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 52 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 53 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 54 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |