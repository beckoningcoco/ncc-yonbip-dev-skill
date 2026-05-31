# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7881.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_repair_plan | pk_repair_plan | pk_repair_plan | char(20) | √ |
| 2 | actual_totalcost_global | actual_totalcost_global | actual_totalcost_global | number(28, 8) |
| 3 | actual_totalcost_group | actual_totalcost_group | actual_totalcost_group | number(28, 8) |
| 4 | actual_totalcost_org | actual_totalcost_org | actual_totalcost_org | number(28, 8) |
| 5 | auditor | auditor | auditor | varchar2(20) |  |  | '~' |
| 6 | audittime | audittime | audittime | char(19) |
| 7 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 8 | billmaketime | billmaketime | billmaketime | char(19) |
| 9 | bill_code | bill_code | bill_code | varchar2(40) |
| 10 | bill_name | bill_name | bill_name | varchar2(200) |
| 11 | bill_status | bill_status | bill_status | number(38, 0) |
| 12 | bill_type | bill_type | bill_type | varchar2(4) |
| 13 | busi_type | busi_type | busi_type | varchar2(20) |  |  | '~' |
| 14 | check_opinion | check_opinion | check_opinion | varchar2(80) |
| 15 | close_date | close_date | close_date | char(19) |
| 16 | close_flag | close_flag | close_flag | char(1) |  |  | 'N' |
| 17 | control_basis | control_basis | control_basis | number(38, 0) |
| 18 | control_mananer | control_mananer | control_mananer | number(38, 0) |
| 19 | detailtask | detailtask | detailtask | varchar2(20) |  |  | '~' |
| 20 | last_version | last_version | last_version | char(1) |
| 21 | memo | memo | memo | varchar2(200) |
| 22 | nversion | nversion | nversion | number(38, 0) |
| 23 | pk_closer | pk_closer | pk_closer | varchar2(20) |  |  | '~' |
| 24 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 25 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 26 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 27 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 28 | pk_planner | pk_planner | pk_planner | varchar2(20) |  |  | '~' |
| 29 | pk_plan_dept | pk_plan_dept | pk_plan_dept | varchar2(20) |  |  | '~' |
| 30 | pk_plan_dept_v | pk_plan_dept_v | pk_plan_dept_v | varchar2(20) |  |  | '~' |
| 31 | pk_repair_plan_lst | pk_repair_plan_lst | pk_repair_plan_lst | varchar2(50) |
| 32 | pk_transitype | pk_transitype | pk_transitype | varchar2(20) |  |  | '~' |
| 33 | plan_make_date | plan_make_date | plan_make_date | char(19) |
| 34 | plan_totalcost_global | plan_totalcost_global | plan_totalcost_global | number(28, 8) |
| 35 | plan_totalcost_group | plan_totalcost_group | plan_totalcost_group | number(28, 8) |
| 36 | plan_totalcost_org | plan_totalcost_org | plan_totalcost_org | number(28, 8) |
| 37 | plan_type | plan_type | plan_type | varchar2(20) |  |  | '~' |
| 38 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 39 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |
| 40 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 41 | saga_status | saga_status | saga_status | number(38, 0) |
| 42 | transi_type | transi_type | transi_type | varchar2(30) |
| 43 | update_time | update_time | update_time | char(19) |
| 44 | updator | updator | updator | varchar2(20) |  |  | '~' |
| 45 | def1 | def1 | def1 | varchar2(101) |
| 46 | def2 | def2 | def2 | varchar2(101) |
| 47 | def3 | def3 | def3 | varchar2(101) |
| 48 | def4 | def4 | def4 | varchar2(101) |
| 49 | def5 | def5 | def5 | varchar2(101) |
| 50 | def6 | def6 | def6 | varchar2(101) |
| 51 | def7 | def7 | def7 | varchar2(101) |
| 52 | def8 | def8 | def8 | varchar2(101) |
| 53 | def9 | def9 | def9 | varchar2(101) |
| 54 | def10 | def10 | def10 | varchar2(101) |
| 55 | def11 | def11 | def11 | varchar2(101) |
| 56 | def12 | def12 | def12 | varchar2(101) |
| 57 | def13 | def13 | def13 | varchar2(101) |
| 58 | def14 | def14 | def14 | varchar2(101) |
| 59 | def15 | def15 | def15 | varchar2(101) |
| 60 | def16 | def16 | def16 | varchar2(101) |
| 61 | def17 | def17 | def17 | varchar2(101) |
| 62 | def18 | def18 | def18 | varchar2(101) |
| 63 | def19 | def19 | def19 | varchar2(101) |
| 64 | def20 | def20 | def20 | varchar2(101) |
| 65 | creationtime | creationtime | creationtime | char(19) |
| 66 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 67 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 68 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 69 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 70 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |