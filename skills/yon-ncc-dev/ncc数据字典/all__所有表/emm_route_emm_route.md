# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7889.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_route | pk_route | pk_route | char(20) | √ |
| 2 | adjust_time | adjust_time | adjust_time | char(19) |
| 3 | adju_expire_date | adju_expire_date | adju_expire_date | char(19) |
| 4 | ahead_days | ahead_days | ahead_days | number(38, 0) |
| 5 | auditor | auditor | auditor | varchar2(20) |
| 6 | audittime | audittime | audittime | char(19) |
| 7 | begin_date | begin_date | begin_date | char(19) |
| 8 | begin_time | begin_time | begin_time | char(8) |
| 9 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 10 | billmaketime | billmaketime | billmaketime | char(19) |
| 11 | bill_code | bill_code | bill_code | varchar2(40) |
| 12 | bill_status | bill_status | bill_status | number(38, 0) |
| 13 | bill_type | bill_type | bill_type | varchar2(4) |
| 14 | busi_type | busi_type | busi_type | varchar2(20) |  |  | '~' |
| 15 | calendarrule | calendarrule | calendarrule | number(38, 0) |
| 16 | check_opinion | check_opinion | check_opinion | varchar2(100) |
| 17 | cycle_unit | cycle_unit | cycle_unit | number(38, 0) |
| 18 | end_time | end_time | end_time | char(8) |
| 19 | last_plan_date | last_plan_date | last_plan_date | char(19) |
| 20 | memo | memo | memo | varchar2(200) |
| 21 | next_expire_date | next_expire_date | next_expire_date | char(19) |
| 22 | next_gen_date | next_gen_date | next_gen_date | char(19) |
| 23 | next_gen_time | next_gen_time | next_gen_time | char(8) |
| 24 | persist_flag | persist_flag | persist_flag | char(1) |
| 25 | pk_adjuster | pk_adjuster | pk_adjuster | varchar2(20) |  |  | '~' |
| 26 | pk_execute_team | pk_execute_team | pk_execute_team | varchar2(20) |  |  | '~' |
| 27 | pk_executor | pk_executor | pk_executor | varchar2(20) |  |  | '~' |
| 28 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 29 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 30 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 31 | pk_prin | pk_prin | pk_prin | varchar2(20) |  |  | '~' |
| 32 | pk_prin_dept | pk_prin_dept | pk_prin_dept | varchar2(20) |  |  | '~' |
| 33 | pk_prin_dept_v | pk_prin_dept_v | pk_prin_dept_v | varchar2(20) |  |  | '~' |
| 34 | pk_transitype | pk_transitype | pk_transitype | varchar2(20) |  |  | '~' |
| 35 | route_cycle | route_cycle | route_cycle | number(38, 0) |
| 36 | route_name | route_name | route_name | varchar2(120) |
| 37 | route_name2 | route_name2 | route_name2 | varchar2(120) |
| 38 | route_name3 | route_name3 | route_name3 | varchar2(120) |
| 39 | route_name4 | route_name4 | route_name4 | varchar2(120) |
| 40 | route_name5 | route_name5 | route_name5 | varchar2(120) |
| 41 | route_name6 | route_name6 | route_name6 | varchar2(120) |
| 42 | rute_calendar | rute_calendar | rute_calendar | varchar2(20) |
| 43 | rute_oncalendar | rute_oncalendar | rute_oncalendar | char(1) |
| 44 | transi_type | transi_type | transi_type | varchar2(30) |
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