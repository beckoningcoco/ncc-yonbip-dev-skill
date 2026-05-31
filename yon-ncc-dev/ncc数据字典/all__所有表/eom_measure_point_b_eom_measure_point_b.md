# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7904.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_measure_point_b | pk_measure_point_b | pk_measure_point_b | char(20) | √ |
| 2 | alert_lower | alert_lower | alert_lower | number(28, 8) |
| 3 | alert_upper | alert_upper | alert_upper | number(28, 8) |
| 4 | begintime | begintime | begintime | char(8) |
| 5 | enablestate | enablestate | enablestate | number(38, 0) |  |  | 2 |
| 6 | endtime | endtime | endtime | char(8) |
| 7 | file_val | file_val | file_val | varchar2(512) |  |  | '~' |
| 8 | iot_metric | iot_metric | iot_metric | varchar2(50) |
| 9 | iot_properties_id | iot_properties_id | iot_properties_id | varchar2(200) |
| 10 | iot_properties_name | iot_properties_name | iot_properties_name | varchar2(200) |
| 11 | iot_source | iot_source | iot_source | varchar2(200) |
| 12 | iot_tagnum | iot_tagnum | iot_tagnum | varchar2(200) |
| 13 | iot_view_code | iot_view_code | iot_view_code | varchar2(200) |
| 14 | isiot | isiot | isiot | varchar2(50) |
| 15 | item_describe | item_describe | item_describe | varchar2(80) |
| 16 | last_meas_result | last_meas_result | last_meas_result | varchar2(28) |  |  | '~' |
| 17 | last_meas_time | last_meas_time | last_meas_time | char(19) |
| 18 | memo | memo | memo | varchar2(200) |
| 19 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 20 | pk_last_measpsn | pk_last_measpsn | pk_last_measpsn | varchar2(20) |  |  | '~' |
| 21 | pk_measuredoc | pk_measuredoc | pk_measuredoc | varchar2(20) |  |  | '~' |
| 22 | pk_measure_point | pk_measure_point | pk_measure_point | varchar2(20) |  |  | '~' |
| 23 | pk_meas_items | pk_meas_items | pk_meas_items | varchar2(20) |  |  | '~' |
| 24 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 25 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 26 | rangemax | rangemax | rangemax | varchar2(50) |
| 27 | rate | rate | rate | number(38, 0) |
| 28 | rowno | rowno | rowno | varchar2(30) |
| 29 | src_bill_code | src_bill_code | src_bill_code | varchar2(40) |
| 30 | src_bill_type | src_bill_type | src_bill_type | varchar2(30) |
| 31 | src_pk_bill | src_pk_bill | src_pk_bill | varchar2(20) |
| 32 | src_pk_bill_b | src_pk_bill_b | src_pk_bill_b | varchar2(20) |
| 33 | unit | unit | unit | varchar2(50) |
| 34 | valuerange | valuerange | valuerange | varchar2(50) |
| 35 | work_lower | work_lower | work_lower | number(28, 8) |
| 36 | work_upper | work_upper | work_upper | number(28, 8) |
| 37 | def1 | def1 | def1 | varchar2(101) |
| 38 | def2 | def2 | def2 | varchar2(101) |
| 39 | def3 | def3 | def3 | varchar2(101) |
| 40 | def4 | def4 | def4 | varchar2(101) |
| 41 | def5 | def5 | def5 | varchar2(101) |
| 42 | def6 | def6 | def6 | varchar2(101) |
| 43 | def7 | def7 | def7 | varchar2(101) |
| 44 | def8 | def8 | def8 | varchar2(101) |
| 45 | def9 | def9 | def9 | varchar2(101) |
| 46 | def10 | def10 | def10 | varchar2(101) |
| 47 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 48 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |