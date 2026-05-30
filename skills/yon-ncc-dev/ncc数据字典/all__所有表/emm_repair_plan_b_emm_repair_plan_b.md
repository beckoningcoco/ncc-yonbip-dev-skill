# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7882.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_repair_plan_b | pk_repair_plan_b | pk_repair_plan_b | char(20) | √ |
| 2 | actual_mny_global | actual_mny_global | actual_mny_global | number(28, 8) |
| 3 | actual_mny_group | actual_mny_group | actual_mny_group | number(28, 8) |
| 4 | actual_mny_org | actual_mny_org | actual_mny_org | number(28, 8) |
| 5 | close_date | close_date | close_date | char(19) |
| 6 | close_flag | close_flag | close_flag | char(1) |  |  | 'N' |
| 7 | consign_flag | consign_flag | consign_flag | char(1) |  |  | 'N' |
| 8 | consign_reason | consign_reason | consign_reason | varchar2(200) |
| 9 | coordinate | coordinate | coordinate | varchar2(100) |  |  | '~' |
| 10 | coordinate_desc | coordinate_desc | coordinate_desc | varchar2(200) |  |  | '~' |
| 11 | failure_expound | failure_expound | failure_expound | varchar2(50) |  |  | '~' |
| 12 | finish_date | finish_date | finish_date | char(19) |
| 13 | head_bill_code | head_bill_code | head_bill_code | varchar2(50) |
| 14 | head_pk_bill | head_pk_bill | head_pk_bill | varchar2(50) |
| 15 | head_pk_bill_b | head_pk_bill_b | head_pk_bill_b | varchar2(50) |
| 16 | head_transi_type | head_transi_type | head_transi_type | varchar2(50) |
| 17 | memo | memo | memo | varchar2(200) |
| 18 | overhaul_part | overhaul_part | overhaul_part | varchar2(80) |
| 19 | pk_closer | pk_closer | pk_closer | varchar2(20) |  |  | '~' |
| 20 | pk_equip | pk_equip | pk_equip | varchar2(20) |  |  | '~' |
| 21 | pk_failure_symptom | pk_failure_symptom | pk_failure_symptom | varchar2(20) |  |  | '~' |
| 22 | pk_failure_type | pk_failure_type | pk_failure_type | varchar2(20) |  |  | '~' |
| 23 | pk_group | pk_group | pk_group | varchar2(20) |
| 24 | pk_inspection_road | pk_inspection_road | pk_inspection_road | varchar2(20) |  |  | '~' |
| 25 | pk_location | pk_location | pk_location | varchar2(20) |  |  | '~' |
| 26 | pk_mtcon | pk_mtcon | pk_mtcon | varchar2(20) |  |  | '~' |
| 27 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 28 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 29 | pk_principal | pk_principal | pk_principal | varchar2(20) |  |  | '~' |
| 30 | pk_project | pk_project | pk_project | varchar2(20) |  |  | '~' |
| 31 | pk_provider | pk_provider | pk_provider | varchar2(20) |  |  | '~' |
| 32 | pk_repair_plan | pk_repair_plan | pk_repair_plan | varchar2(20) |  |  | '~' |
| 33 | pk_repair_plan_lst | pk_repair_plan_lst | pk_repair_plan_lst | varchar2(20) |
| 34 | pk_std_job | pk_std_job | pk_std_job | varchar2(20) |  |  | '~' |
| 35 | plan_cost_mny_global | plan_cost_mny_global | plan_cost_mny_global | number(28, 8) |
| 36 | plan_cost_mny_group | plan_cost_mny_group | plan_cost_mny_group | number(28, 8) |
| 37 | plan_cost_mny_org | plan_cost_mny_org | plan_cost_mny_org | number(28, 8) |
| 38 | plan_type | plan_type | plan_type | varchar2(256) |
| 39 | principal_dept | principal_dept | principal_dept | varchar2(20) |  |  | '~' |
| 40 | principal_dept_v | principal_dept_v | principal_dept_v | varchar2(20) |  |  | '~' |
| 41 | remind_date | remind_date | remind_date | char(19) |
| 42 | repair_content | repair_content | repair_content | varchar2(400) |
| 43 | repair_obj_name | repair_obj_name | repair_obj_name | varchar2(900) |
| 44 | repair_obj_name2 | repair_obj_name2 | repair_obj_name2 | varchar2(900) |
| 45 | repair_obj_name3 | repair_obj_name3 | repair_obj_name3 | varchar2(900) |
| 46 | repair_obj_name4 | repair_obj_name4 | repair_obj_name4 | varchar2(900) |
| 47 | repair_obj_name5 | repair_obj_name5 | repair_obj_name5 | varchar2(900) |
| 48 | repair_obj_name6 | repair_obj_name6 | repair_obj_name6 | varchar2(900) |
| 49 | rowno | rowno | rowno | varchar2(30) |
| 50 | src_bill_code | src_bill_code | src_bill_code | varchar2(40) |
| 51 | src_bill_type | src_bill_type | src_bill_type | varchar2(30) |
| 52 | src_pk_bill | src_pk_bill | src_pk_bill | varchar2(50) |
| 53 | src_pk_bill_b | src_pk_bill_b | src_pk_bill_b | varchar2(50) |
| 54 | src_pk_transitype | src_pk_transitype | src_pk_transitype | varchar2(20) |  |  | '~' |
| 55 | src_rowno | src_rowno | src_rowno | varchar2(30) |
| 56 | src_transi_type | src_transi_type | src_transi_type | varchar2(50) |
| 57 | start_date | start_date | start_date | char(19) |
| 58 | start_date_orig | start_date_orig | start_date_orig | char(19) |
| 59 | workload | workload | workload | varchar2(200) |
| 60 | wo_flag | wo_flag | wo_flag | char(1) |  |  | 'N' |
| 61 | def1 | def1 | def1 | varchar2(101) |
| 62 | def2 | def2 | def2 | varchar2(101) |
| 63 | def3 | def3 | def3 | varchar2(101) |
| 64 | def4 | def4 | def4 | varchar2(101) |
| 65 | def5 | def5 | def5 | varchar2(101) |
| 66 | def6 | def6 | def6 | varchar2(101) |
| 67 | def7 | def7 | def7 | varchar2(101) |
| 68 | def8 | def8 | def8 | varchar2(101) |
| 69 | def9 | def9 | def9 | varchar2(101) |
| 70 | def10 | def10 | def10 | varchar2(101) |
| 71 | def11 | def11 | def11 | varchar2(101) |
| 72 | def12 | def12 | def12 | varchar2(101) |
| 73 | def13 | def13 | def13 | varchar2(101) |
| 74 | def14 | def14 | def14 | varchar2(101) |
| 75 | def15 | def15 | def15 | varchar2(101) |
| 76 | def16 | def16 | def16 | varchar2(101) |
| 77 | def17 | def17 | def17 | varchar2(101) |
| 78 | def18 | def18 | def18 | varchar2(101) |
| 79 | def19 | def19 | def19 | varchar2(101) |
| 80 | def20 | def20 | def20 | varchar2(101) |
| 81 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 82 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |