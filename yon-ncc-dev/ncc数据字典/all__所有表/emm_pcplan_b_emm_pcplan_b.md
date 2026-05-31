# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7869.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pcplan_b | pk_pcplan_b | pk_pcplan_b | char(20) | √ |
| 2 | alert_lower | alert_lower | alert_lower | number(28, 8) |
| 3 | alert_upper | alert_upper | alert_upper | number(28, 8) |
| 4 | calendarrule | calendarrule | calendarrule | number(38, 0) |
| 5 | continuity | continuity | continuity | number(38, 0) |
| 6 | cycle_flag | cycle_flag | cycle_flag | char(1) |
| 7 | file_val | file_val | file_val | varchar2(512) |
| 8 | item_describe | item_describe | item_describe | varchar2(50) |
| 9 | last_pctime | last_pctime | last_pctime | char(19) |
| 10 | made_pc_flag | made_pc_flag | made_pc_flag | char(1) |
| 11 | memo | memo | memo | varchar2(200) |
| 12 | pc_calendar | pc_calendar | pc_calendar | varchar2(20) |
| 13 | pc_content | pc_content | pc_content | varchar2(200) |
| 14 | pc_cyc | pc_cyc | pc_cyc | number(38, 0) |
| 15 | pc_item | pc_item | pc_item | varchar2(100) |
| 16 | pc_method | pc_method | pc_method | varchar2(100) |
| 17 | pc_oncalendar | pc_oncalendar | pc_oncalendar | char(1) |
| 18 | pc_position | pc_position | pc_position | varchar2(80) |
| 19 | pc_state | pc_state | pc_state | number(38, 0) |
| 20 | pc_unit | pc_unit | pc_unit | number(38, 0) |
| 21 | pk_equip | pk_equip | pk_equip | varchar2(20) |  |  | '~' |
| 22 | pk_group | pk_group | pk_group | varchar2(20) |
| 23 | pk_location | pk_location | pk_location | varchar2(20) |  |  | '~' |
| 24 | pk_measuredoc | pk_measuredoc | pk_measuredoc | varchar2(20) |  |  | '~' |
| 25 | pk_meas_items | pk_meas_items | pk_meas_items | varchar2(20) |  |  | '~' |
| 26 | pk_meas_point | pk_meas_point | pk_meas_point | varchar2(20) |
| 27 | pk_meas_point_b | pk_meas_point_b | pk_meas_point_b | varchar2(20) |
| 28 | pk_org | pk_org | pk_org | varchar2(20) |
| 29 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |
| 30 | pk_pcplan | pk_pcplan | pk_pcplan | char(20) | √ |
| 31 | pk_pcstd | pk_pcstd | pk_pcstd | varchar2(50) |
| 32 | pk_pcstd_b | pk_pcstd_b | pk_pcstd_b | varchar2(20) |  |  | '~' |
| 33 | pk_pcttype | pk_pcttype | pk_pcttype | varchar2(20) |  |  | '~' |
| 34 | pk_plan_pcer | pk_plan_pcer | pk_plan_pcer | varchar2(20) |  |  | '~' |
| 35 | plan_pcdate | plan_pcdate | plan_pcdate | char(19) |
| 36 | result_type | result_type | result_type | number(38, 0) |
| 37 | rowno | rowno | rowno | varchar2(30) |
| 38 | seal_flag | seal_flag | seal_flag | char(1) |
| 39 | std_need | std_need | std_need | varchar2(200) |
| 40 | work_lower | work_lower | work_lower | number(28, 8) |
| 41 | work_upper | work_upper | work_upper | number(28, 8) |
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
| 62 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 63 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |