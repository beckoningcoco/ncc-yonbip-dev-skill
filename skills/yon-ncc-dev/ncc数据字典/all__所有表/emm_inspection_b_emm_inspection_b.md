# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7865.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_inspection_b | pk_inspection_b | pk_inspection_b | char(20) | √ |
| 2 | act_inspect_time | act_inspect_time | act_inspect_time | char(19) |
| 3 | coordinate | coordinate | coordinate | varchar2(100) |
| 4 | coordinate_desc | coordinate_desc | coordinate_desc | varchar2(200) |
| 5 | dest_bill_type | dest_bill_type | dest_bill_type | varchar2(20) |
| 6 | dest_pk_bill | dest_pk_bill | dest_pk_bill | varchar2(20) |
| 7 | dest_pk_bill_b | dest_pk_bill_b | dest_pk_bill_b | varchar2(20) |
| 8 | dest_transitype | dest_transitype | dest_transitype | varchar2(20) |
| 9 | disp_result | disp_result | disp_result | number(38, 0) |
| 10 | disp_time | disp_time | disp_time | char(19) |
| 11 | exception_flag | exception_flag | exception_flag | char(1) |
| 12 | failure_flag | failure_flag | failure_flag | char(1) |
| 13 | inspect_result | inspect_result | inspect_result | number(38, 0) |
| 14 | item | item | item | varchar2(50) |
| 15 | lowerlimit | lowerlimit | lowerlimit | number(28, 8) |
| 16 | meas_result | meas_result | meas_result | varchar2(20) |
| 17 | memo | memo | memo | varchar2(200) |
| 18 | pk_disposer | pk_disposer | pk_disposer | varchar2(20) |  |  | '~' |
| 19 | pk_equip | pk_equip | pk_equip | varchar2(20) |  |  | '~' |
| 20 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 21 | pk_inspection | pk_inspection | pk_inspection | char(20) | √ |
| 22 | pk_inspector | pk_inspector | pk_inspector | varchar2(20) |  |  | '~' |
| 23 | pk_inspectstd | pk_inspectstd | pk_inspectstd | varchar2(20) |  |  | '~' |
| 24 | pk_inspectstd_b | pk_inspectstd_b | pk_inspectstd_b | varchar2(20) |  |  | '~' |
| 25 | pk_location | pk_location | pk_location | varchar2(20) |  |  | '~' |
| 26 | pk_measdoc_b | pk_measdoc_b | pk_measdoc_b | varchar2(20) |  |  | '~' |
| 27 | pk_measuredoc | pk_measuredoc | pk_measuredoc | varchar2(20) |  |  | '~' |
| 28 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 29 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 30 | pk_team | pk_team | pk_team | varchar2(20) |  |  | '~' |
| 31 | position | position | position | varchar2(50) |
| 32 | property | property | property | number(38, 0) |
| 33 | range_set | range_set | range_set | number(38, 0) |
| 34 | require | require | require | varchar2(50) |
| 35 | route_seqnum | route_seqnum | route_seqnum | number(38, 0) |
| 36 | src_bill_type | src_bill_type | src_bill_type | varchar2(50) |
| 37 | src_body_ts | src_body_ts | src_body_ts | varchar2(20) |
| 38 | src_head_ts | src_head_ts | src_head_ts | varchar2(20) |
| 39 | src_pk_bill | src_pk_bill | src_pk_bill | varchar2(20) |
| 40 | src_pk_bill_b | src_pk_bill_b | src_pk_bill_b | varchar2(20) |
| 41 | src_pk_transitype | src_pk_transitype | src_pk_transitype | varchar2(20) |  |  | '~' |
| 42 | src_transitype | src_transitype | src_transitype | varchar2(50) |
| 43 | std_rowno | std_rowno | std_rowno | number(38, 0) |
| 44 | unit | unit | unit | varchar2(20) |  |  | '~' |
| 45 | upperlimit | upperlimit | upperlimit | number(28, 8) |
| 46 | def1 | def1 | def1 | varchar2(101) |
| 47 | def2 | def2 | def2 | varchar2(101) |
| 48 | def3 | def3 | def3 | varchar2(101) |
| 49 | def4 | def4 | def4 | varchar2(101) |
| 50 | def5 | def5 | def5 | varchar2(101) |
| 51 | def6 | def6 | def6 | varchar2(101) |
| 52 | def7 | def7 | def7 | varchar2(101) |
| 53 | def8 | def8 | def8 | varchar2(101) |
| 54 | def9 | def9 | def9 | varchar2(101) |
| 55 | def10 | def10 | def10 | varchar2(101) |
| 56 | def11 | def11 | def11 | varchar2(101) |
| 57 | def12 | def12 | def12 | varchar2(101) |
| 58 | def13 | def13 | def13 | varchar2(101) |
| 59 | def14 | def14 | def14 | varchar2(101) |
| 60 | def15 | def15 | def15 | varchar2(101) |
| 61 | def16 | def16 | def16 | varchar2(101) |
| 62 | def17 | def17 | def17 | varchar2(101) |
| 63 | def18 | def18 | def18 | varchar2(101) |
| 64 | def19 | def19 | def19 | varchar2(101) |
| 65 | def20 | def20 | def20 | varchar2(101) |
| 66 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 67 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |