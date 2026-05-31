# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7880.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pointcheck_b | pk_pointcheck_b | pk_pointcheck_b | char(20) | √ |
| 2 | alert_lower | alert_lower | alert_lower | number(28, 8) |
| 3 | alert_upper | alert_upper | alert_upper | number(28, 8) |
| 4 | classes | classes | classes | varchar2(20) |  |  | '~' |
| 5 | committime | committime | committime | char(19) |
| 6 | continuity | continuity | continuity | varchar2(50) |
| 7 | dest_bill_type | dest_bill_type | dest_bill_type | varchar2(20) |
| 8 | dest_pk_bill | dest_pk_bill | dest_pk_bill | varchar2(20) |
| 9 | dest_pk_bill_b | dest_pk_bill_b | dest_pk_bill_b | varchar2(50) |
| 10 | dest_transitype | dest_transitype | dest_transitype | varchar2(50) |
| 11 | disp_result | disp_result | disp_result | number(38, 0) |
| 12 | disp_time | disp_time | disp_time | char(19) |
| 13 | exception_flag | exception_flag | exception_flag | char(1) |
| 14 | failure_flag | failure_flag | failure_flag | char(1) |
| 15 | file_val | file_val | file_val | varchar2(512) |
| 16 | inputtime | inputtime | inputtime | char(19) |
| 17 | item_describe | item_describe | item_describe | varchar2(50) |
| 18 | memo | memo | memo | varchar2(200) |
| 19 | need_pcdate | need_pcdate | need_pcdate | char(19) |
| 20 | pcmeas_result | pcmeas_result | pcmeas_result | varchar2(50) |
| 21 | pc_content | pc_content | pc_content | varchar2(200) |
| 22 | pc_cycle | pc_cycle | pc_cycle | number(38, 0) |
| 23 | pc_date | pc_date | pc_date | char(19) |
| 24 | pc_estate | pc_estate | pc_estate | number(38, 0) |
| 25 | pc_item | pc_item | pc_item | varchar2(100) |
| 26 | pc_method | pc_method | pc_method | varchar2(100) |
| 27 | pc_position | pc_position | pc_position | varchar2(80) |
| 28 | pc_time | pc_time | pc_time | char(19) |
| 29 | pc_unit | pc_unit | pc_unit | number(38, 0) |
| 30 | picture | picture | picture | varchar2(50) |
| 31 | pk_disposer | pk_disposer | pk_disposer | varchar2(20) |  |  | '~' |
| 32 | pk_equip | pk_equip | pk_equip | varchar2(20) |  |  | '~' |
| 33 | pk_group | pk_group | pk_group | varchar2(20) |
| 34 | pk_location | pk_location | pk_location | varchar2(20) |  |  | '~' |
| 35 | pk_measuredoc | pk_measuredoc | pk_measuredoc | varchar2(50) |
| 36 | pk_meas_item | pk_meas_item | pk_meas_item | varchar2(20) |
| 37 | pk_meas_point | pk_meas_point | pk_meas_point | varchar2(20) |
| 38 | pk_meas_point_b | pk_meas_point_b | pk_meas_point_b | varchar2(20) |
| 39 | pk_org | pk_org | pk_org | varchar2(20) |
| 40 | pk_pcresult | pk_pcresult | pk_pcresult | varchar2(20) |  |  | '~' |
| 41 | pk_pcstd | pk_pcstd | pk_pcstd | varchar2(50) |
| 42 | pk_pcstd_b | pk_pcstd_b | pk_pcstd_b | varchar2(20) |  |  | '~' |
| 43 | pk_pcttype | pk_pcttype | pk_pcttype | varchar2(20) |  |  | '~' |
| 44 | pk_pcuser | pk_pcuser | pk_pcuser | varchar2(20) |  |  | '~' |
| 45 | pk_plan_pcer | pk_plan_pcer | pk_plan_pcer | varchar2(20) |
| 46 | pk_pointcheck | pk_pointcheck | pk_pointcheck | char(20) | √ |
| 47 | plan_name | plan_name | plan_name | varchar2(120) |
| 48 | plan_name2 | plan_name2 | plan_name2 | varchar2(120) |
| 49 | plan_name3 | plan_name3 | plan_name3 | varchar2(120) |
| 50 | plan_name4 | plan_name4 | plan_name4 | varchar2(120) |
| 51 | plan_name5 | plan_name5 | plan_name5 | varchar2(120) |
| 52 | plan_name6 | plan_name6 | plan_name6 | varchar2(120) |
| 53 | result_type | result_type | result_type | varchar2(50) |
| 54 | rowno | rowno | rowno | varchar2(30) |
| 55 | scan_starttime | scan_starttime | scan_starttime | char(19) |
| 56 | src_bill_type | src_bill_type | src_bill_type | varchar2(30) |
| 57 | src_pk_bill | src_pk_bill | src_pk_bill | varchar2(20) |
| 58 | src_pk_bill_b | src_pk_bill_b | src_pk_bill_b | varchar2(20) |
| 59 | src_pk_transitype | src_pk_transitype | src_pk_transitype | varchar2(20) |  |  | '~' |
| 60 | src_transitype | src_transitype | src_transitype | varchar2(30) |
| 61 | std_need | std_need | std_need | varchar2(200) |
| 62 | work_lower | work_lower | work_lower | number(28, 8) |
| 63 | work_upper | work_upper | work_upper | number(28, 8) |
| 64 | def1 | def1 | def1 | varchar2(101) |
| 65 | def2 | def2 | def2 | varchar2(101) |
| 66 | def3 | def3 | def3 | varchar2(101) |
| 67 | def4 | def4 | def4 | varchar2(101) |
| 68 | def5 | def5 | def5 | varchar2(101) |
| 69 | def6 | def6 | def6 | varchar2(101) |
| 70 | def7 | def7 | def7 | varchar2(101) |
| 71 | def8 | def8 | def8 | varchar2(101) |
| 72 | def9 | def9 | def9 | varchar2(101) |
| 73 | def10 | def10 | def10 | varchar2(101) |
| 74 | def11 | def11 | def11 | varchar2(101) |
| 75 | def12 | def12 | def12 | varchar2(101) |
| 76 | def13 | def13 | def13 | varchar2(101) |
| 77 | def14 | def14 | def14 | varchar2(101) |
| 78 | def15 | def15 | def15 | varchar2(101) |
| 79 | def16 | def16 | def16 | varchar2(101) |
| 80 | def17 | def17 | def17 | varchar2(101) |
| 81 | def18 | def18 | def18 | varchar2(101) |
| 82 | def19 | def19 | def19 | varchar2(101) |
| 83 | def20 | def20 | def20 | varchar2(101) |
| 84 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 85 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |