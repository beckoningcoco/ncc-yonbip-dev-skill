# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10525.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_time_plan_item | pk_time_plan_item | pk_time_plan_item | char(20) | √ |
| 2 | description | description | description | varchar2(300) |
| 3 | duration | duration | duration | number(38, 0) |
| 4 | full_seq | full_seq | full_seq | varchar2(100) |
| 5 | innercode | innercode | innercode | varchar2(50) |
| 6 | leaf | leaf | leaf | char(1) |
| 7 | max_version | max_version | max_version | number(38, 0) |
| 8 | memo | memo | memo | varchar2(900) |
| 9 | milestone | milestone | milestone | char(1) |
| 10 | name | name | name | varchar2(150) |
| 11 | pk_dutier | pk_dutier | pk_dutier | varchar2(20) |  |  | '~' |
| 12 | pk_duty_dept | pk_duty_dept | pk_duty_dept | varchar2(20) |  |  | '~' |
| 13 | pk_duty_dept_v | pk_duty_dept_v | pk_duty_dept_v | varchar2(20) |  |  | '~' |
| 14 | pk_front_plan | pk_front_plan | pk_front_plan | varchar2(20) |  |  | '~' |
| 15 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 16 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 17 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 18 | pk_origin_item | pk_origin_item | pk_origin_item | varchar2(20) |  |  | '~' |
| 19 | pk_parent | pk_parent | pk_parent | varchar2(50) |
| 20 | pk_progress | pk_progress | pk_progress | varchar2(20) |  |  | '~' |
| 21 | pk_project | pk_project | pk_project | varchar2(20) |  |  | '~' |
| 22 | pk_temp_b | pk_temp_b | pk_temp_b | varchar2(20) |
| 23 | pk_time_plan | pk_time_plan | pk_time_plan | char(20) | √ |
| 24 | plan_end_date | plan_end_date | plan_end_date | char(19) |
| 25 | plan_level | plan_level | plan_level | number(38, 0) |
| 26 | plan_start_date | plan_start_date | plan_start_date | char(19) |
| 27 | rowno | rowno | rowno | varchar2(50) |
| 28 | seq | seq | seq | number(38, 0) |
| 29 | version | version | version | number(38, 0) |
| 30 | def1 | def1 | def1 | varchar2(100) |
| 31 | def2 | def2 | def2 | varchar2(100) |
| 32 | def3 | def3 | def3 | varchar2(100) |
| 33 | def4 | def4 | def4 | varchar2(100) |
| 34 | def5 | def5 | def5 | varchar2(101) |
| 35 | def6 | def6 | def6 | varchar2(101) |
| 36 | def7 | def7 | def7 | varchar2(101) |
| 37 | def8 | def8 | def8 | varchar2(101) |
| 38 | def9 | def9 | def9 | varchar2(101) |
| 39 | def10 | def10 | def10 | varchar2(101) |
| 40 | def11 | def11 | def11 | varchar2(101) |
| 41 | def12 | def12 | def12 | varchar2(101) |
| 42 | def13 | def13 | def13 | varchar2(101) |
| 43 | def14 | def14 | def14 | varchar2(101) |
| 44 | def15 | def15 | def15 | varchar2(101) |
| 45 | def16 | def16 | def16 | varchar2(101) |
| 46 | def17 | def17 | def17 | varchar2(101) |
| 47 | def18 | def18 | def18 | varchar2(101) |
| 48 | def19 | def19 | def19 | varchar2(101) |
| 49 | def20 | def20 | def20 | varchar2(101) |
| 50 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 51 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |