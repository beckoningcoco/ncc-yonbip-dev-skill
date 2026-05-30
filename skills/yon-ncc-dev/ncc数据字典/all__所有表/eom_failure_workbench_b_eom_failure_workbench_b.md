# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7897.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_failure_b | pk_failure_b | pk_failure_b | char(20) | √ |
| 2 | bill_gen_type | bill_gen_type | bill_gen_type | varchar2(50) |
| 3 | close_flag | close_flag | close_flag | char(1) |
| 4 | content | content | content | varchar2(500) |
| 5 | coordinate | coordinate | coordinate | varchar2(100) |
| 6 | coordinate_desc | coordinate_desc | coordinate_desc | varchar2(200) |
| 7 | deal_flag | deal_flag | deal_flag | char(1) |
| 8 | deal_result | deal_result | deal_result | varchar2(100) |
| 9 | description | description | description | varchar2(100) |
| 10 | direct_clause | direct_clause | direct_clause | varchar2(100) |
| 11 | direct_loss | direct_loss | direct_loss | number(28, 8) |
| 12 | effect | effect | effect | varchar2(50) |
| 13 | failure_expound | failure_expound | failure_expound | varchar2(200) |
| 14 | failure_scene | failure_scene | failure_scene | varchar2(100) |
| 15 | failure_time | failure_time | failure_time | char(19) |
| 16 | indirect_clause | indirect_clause | indirect_clause | varchar2(100) |
| 17 | indirect_loss | indirect_loss | indirect_loss | number(28, 8) |
| 18 | influence | influence | influence | varchar2(100) |
| 19 | intend_effect_time | intend_effect_time | intend_effect_time | char(19) |
| 20 | intend_repair_time | intend_repair_time | intend_repair_time | char(19) |
| 21 | manage_clause | manage_clause | manage_clause | varchar2(100) |
| 22 | memo | memo | memo | varchar2(200) |
| 23 | merged_pk_failure_b | merged_pk_failure_b | merged_pk_failure_b | varchar2(20) |
| 24 | minor_clause | minor_clause | minor_clause | varchar2(100) |
| 25 | pk_equip | pk_equip | pk_equip | varchar2(20) |  |  | '~' |
| 26 | pk_failure | pk_failure | pk_failure | char(20) | √ |
| 27 | pk_failure_detect | pk_failure_detect | pk_failure_detect | varchar2(20) |  |  | '~' |
| 28 | pk_failure_reason | pk_failure_reason | pk_failure_reason | varchar2(500) |  |  | '~' |
| 29 | pk_failure_symptom | pk_failure_symptom | pk_failure_symptom | varchar2(20) |  |  | '~' |
| 30 | pk_failure_type | pk_failure_type | pk_failure_type | varchar2(20) |  |  | '~' |
| 31 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 32 | pk_location | pk_location | pk_location | varchar2(20) |  |  | '~' |
| 33 | pk_maintainorg | pk_maintainorg | pk_maintainorg | varchar2(20) |  |  | '~' |
| 34 | pk_maintainorg_v | pk_maintainorg_v | pk_maintainorg_v | varchar2(20) |  |  | '~' |
| 35 | pk_manager | pk_manager | pk_manager | varchar2(20) |  |  | '~' |
| 36 | pk_mandept | pk_mandept | pk_mandept | varchar2(20) |  |  | '~' |
| 37 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 38 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 39 | pk_ownerorg | pk_ownerorg | pk_ownerorg | varchar2(20) |  |  | '~' |
| 40 | pk_project | pk_project | pk_project | varchar2(20) |  |  | '~' |
| 41 | pk_service_step | pk_service_step | pk_service_step | varchar2(20) |  |  | '~' |
| 42 | pk_status_after | pk_status_after | pk_status_after | varchar2(20) |  |  | '~' |
| 43 | pk_status_before | pk_status_before | pk_status_before | varchar2(20) |  |  | '~' |
| 44 | pk_usedept | pk_usedept | pk_usedept | varchar2(20) |  |  | '~' |
| 45 | pk_usedorg | pk_usedorg | pk_usedorg | varchar2(20) |  |  | '~' |
| 46 | pk_usedunit | pk_usedunit | pk_usedunit | varchar2(20) |  |  | '~' |
| 47 | pk_user | pk_user | pk_user | varchar2(20) |  |  | '~' |
| 48 | primary_clause | primary_clause | primary_clause | varchar2(100) |
| 49 | restore_time | restore_time | restore_time | char(19) |
| 50 | rowno | rowno | rowno | varchar2(30) |
| 51 | src_bill_code | src_bill_code | src_bill_code | varchar2(40) |
| 52 | src_bill_type | src_bill_type | src_bill_type | varchar2(30) |
| 53 | src_pk_bill | src_pk_bill | src_pk_bill | varchar2(20) |
| 54 | src_pk_bill_b | src_pk_bill_b | src_pk_bill_b | varchar2(20) |
| 55 | src_pk_transitype | src_pk_transitype | src_pk_transitype | varchar2(20) |  |  | '~' |
| 56 | src_rowno | src_rowno | src_rowno | varchar2(30) |
| 57 | src_transi_type | src_transi_type | src_transi_type | varchar2(30) |
| 58 | status_date_after | status_date_after | status_date_after | char(19) |
| 59 | status_date_before | status_date_before | status_date_before | char(19) |
| 60 | treat_type | treat_type | treat_type | varchar2(50) |
| 61 | trouble_location | trouble_location | trouble_location | varchar2(100) |
| 62 | validity | validity | validity | number(38, 0) |
| 63 | workbench_deal_result | workbench_deal_result | workbench_deal_result | number(38, 0) |
| 64 | wo_flag | wo_flag | wo_flag | char(1) |
| 65 | def1 | def1 | def1 | varchar2(101) |
| 66 | def2 | def2 | def2 | varchar2(101) |
| 67 | def3 | def3 | def3 | varchar2(101) |
| 68 | def4 | def4 | def4 | varchar2(101) |
| 69 | def5 | def5 | def5 | varchar2(101) |
| 70 | def6 | def6 | def6 | varchar2(101) |
| 71 | def7 | def7 | def7 | varchar2(101) |
| 72 | def8 | def8 | def8 | varchar2(101) |
| 73 | def9 | def9 | def9 | varchar2(101) |
| 74 | def10 | def10 | def10 | varchar2(101) |
| 75 | def11 | def11 | def11 | varchar2(101) |
| 76 | def12 | def12 | def12 | varchar2(101) |
| 77 | def13 | def13 | def13 | varchar2(101) |
| 78 | def14 | def14 | def14 | varchar2(101) |
| 79 | def15 | def15 | def15 | varchar2(101) |
| 80 | def16 | def16 | def16 | varchar2(101) |
| 81 | def17 | def17 | def17 | varchar2(101) |
| 82 | def18 | def18 | def18 | varchar2(101) |
| 83 | def19 | def19 | def19 | varchar2(101) |
| 84 | def20 | def20 | def20 | varchar2(101) |
| 85 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 86 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |