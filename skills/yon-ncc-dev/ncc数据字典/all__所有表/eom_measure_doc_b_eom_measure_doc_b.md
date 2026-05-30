# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7902.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_measure_doc_b | pk_measure_doc_b | pk_measure_doc_b | char(20) | √ |
| 2 | abnormal_file_val_flag | abnormal_file_val_flag | abnormal_file_val_flag | char(1) |
| 3 | alert_lower | alert_lower | alert_lower | number(20, 8) |
| 4 | alert_upper | alert_upper | alert_upper | number(20, 8) |
| 5 | failure_flag | failure_flag | failure_flag | char(1) |
| 6 | increase | increase | increase | number(28, 8) |
| 7 | item_describe | item_describe | item_describe | varchar2(80) |
| 8 | last_meas_result | last_meas_result | last_meas_result | varchar2(28) |  |  | '~' |
| 9 | last_meas_time | last_meas_time | last_meas_time | char(19) |
| 10 | measure_result | measure_result | measure_result | varchar2(28) |
| 11 | measure_time | measure_time | measure_time | char(19) |
| 12 | memo | memo | memo | varchar2(200) |
| 13 | pk_category | pk_category | pk_category | varchar2(20) |  |  | '~' |
| 14 | pk_equip | pk_equip | pk_equip | varchar2(20) |  |  | '~' |
| 15 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 16 | pk_location | pk_location | pk_location | varchar2(20) |  |  | '~' |
| 17 | pk_maintainorg | pk_maintainorg | pk_maintainorg | varchar2(20) |  |  | '~' |
| 18 | pk_maintainorg_v | pk_maintainorg_v | pk_maintainorg_v | varchar2(20) |  |  | '~' |
| 19 | pk_manager | pk_manager | pk_manager | varchar2(20) |  |  | '~' |
| 20 | pk_mandept | pk_mandept | pk_mandept | varchar2(20) |  |  | '~' |
| 21 | pk_measuredoc | pk_measuredoc | pk_measuredoc | varchar2(20) |  |  | '~' |
| 22 | pk_measure_doc | pk_measure_doc | pk_measure_doc | char(20) | √ |
| 23 | pk_measure_point | pk_measure_point | pk_measure_point | varchar2(20) |  |  | '~' |
| 24 | pk_measure_point_b | pk_measure_point_b | pk_measure_point_b | varchar2(20) |  |  | '~' |
| 25 | pk_meas_items | pk_meas_items | pk_meas_items | varchar2(20) |  |  | '~' |
| 26 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 27 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 28 | pk_ownerorg | pk_ownerorg | pk_ownerorg | varchar2(20) |  |  | '~' |
| 29 | pk_project | pk_project | pk_project | varchar2(20) |  |  | '~' |
| 30 | pk_surveyor | pk_surveyor | pk_surveyor | varchar2(20) |  |  | '~' |
| 31 | pk_usedept | pk_usedept | pk_usedept | varchar2(20) |  |  | '~' |
| 32 | pk_usedorg | pk_usedorg | pk_usedorg | varchar2(20) |  |  | '~' |
| 33 | pk_usedunit | pk_usedunit | pk_usedunit | varchar2(20) |  |  | '~' |
| 34 | pk_user | pk_user | pk_user | varchar2(20) |  |  | '~' |
| 35 | result_type | result_type | result_type | number(38, 0) |
| 36 | rowno | rowno | rowno | varchar2(30) |
| 37 | work_lower | work_lower | work_lower | number(20, 8) |
| 38 | work_upper | work_upper | work_upper | number(20, 8) |
| 39 | wo_flag | wo_flag | wo_flag | char(1) |
| 40 | def1 | def1 | def1 | varchar2(101) |
| 41 | def2 | def2 | def2 | varchar2(101) |
| 42 | def3 | def3 | def3 | varchar2(101) |
| 43 | def4 | def4 | def4 | varchar2(101) |
| 44 | def5 | def5 | def5 | varchar2(101) |
| 45 | def6 | def6 | def6 | varchar2(101) |
| 46 | def7 | def7 | def7 | varchar2(101) |
| 47 | def8 | def8 | def8 | varchar2(101) |
| 48 | def9 | def9 | def9 | varchar2(101) |
| 49 | def10 | def10 | def10 | varchar2(101) |
| 50 | def11 | def11 | def11 | varchar2(101) |
| 51 | def12 | def12 | def12 | varchar2(101) |
| 52 | def13 | def13 | def13 | varchar2(101) |
| 53 | def14 | def14 | def14 | varchar2(101) |
| 54 | def15 | def15 | def15 | varchar2(101) |
| 55 | def16 | def16 | def16 | varchar2(101) |
| 56 | def17 | def17 | def17 | varchar2(101) |
| 57 | def18 | def18 | def18 | varchar2(101) |
| 58 | def19 | def19 | def19 | varchar2(101) |
| 59 | def20 | def20 | def20 | varchar2(101) |
| 60 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 61 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |