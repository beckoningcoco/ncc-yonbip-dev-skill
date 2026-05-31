# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12747.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | date_diagnosis | date_diagnosis | date_diagnosis | varchar2(50) |
| 2 | date_infect | date_infect | date_infect | varchar2(50) |
| 3 | date_outcome | date_outcome | date_outcome | char(50) |
| 4 | dt_device_infection | dt_device_infection | dt_device_infection | varchar2(50) |
| 5 | dt_incision_type | dt_incision_type | dt_incision_type | varchar2(50) |
| 6 | dt_infect_death | dt_infect_death | dt_infect_death | varchar2(50) |
| 7 | dt_infect_outcome | dt_infect_outcome | dt_infect_outcome | varchar2(50) |
| 8 | dt_infect_type | dt_infect_type | dt_infect_type | varchar2(50) |
| 9 | dt_report_type | dt_report_type | dt_report_type | varchar2(50) |
| 10 | exam_date | exam_date | exam_date | varchar2(50) |
| 11 | exam_psn | exam_psn | exam_psn | varchar2(50) |
| 12 | exam_status | exam_status | exam_status | char(20) |
| 13 | flag_ee | flag_ee | flag_ee | char(50) |
| 14 | name_dept_infect | name_dept_infect | name_dept_infect | varchar2(50) |
| 15 | name_dept_report | name_dept_report | name_dept_report | varchar2(50) |
| 16 | name_diag_infect | name_diag_infect | name_diag_infect | varchar2(50) |
| 17 | name_operation | name_operation | name_operation | varchar2(50) |
| 18 | name_pathogen | name_pathogen | name_pathogen | varchar2(50) |
| 19 | name_psn_report | name_psn_report | name_psn_report | varchar2(50) |
| 20 | pk_dept_infect | pk_dept_infect | pk_dept_infect | char(20) |
| 21 | pk_dept_report | pk_dept_report | pk_dept_report | char(20) |
| 22 | pk_device_infection | pk_device_infection | pk_device_infection | char(20) |
| 23 | pk_diag_infect | pk_diag_infect | pk_diag_infect | char(20) |
| 24 | pk_group | pk_group | pk_group | varchar2(20) | √ |
| 25 | pk_incision_type | pk_incision_type | pk_incision_type | char(20) |
| 26 | pk_infect_death | pk_infect_death | pk_infect_death | char(20) |
| 27 | pk_infect_outcome | pk_infect_outcome | pk_infect_outcome | char(20) |
| 28 | pk_infect_rpt | pk_infect_rpt | pk_infect_rpt | char(20) | √ |
| 29 | pk_infect_type | pk_infect_type | pk_infect_type | char(20) |
| 30 | pk_operation | pk_operation | pk_operation | char(20) |
| 31 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 32 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 33 | pk_pathogen | pk_pathogen | pk_pathogen | char(20) |
| 34 | pk_pati | pk_pati | pk_pati | char(20) |
| 35 | pk_psn_report | pk_psn_report | pk_psn_report | char(20) |
| 36 | pk_pv | pk_pv | pk_pv | char(20) |
| 37 | pk_report_type | pk_report_type | pk_report_type | char(20) |
| 38 | reason | reason | reason | varchar2(500) |
| 39 | specimen_name | specimen_name | specimen_name | varchar2(50) |
| 40 | def1 | def1 | def1 | varchar2(100) |
| 41 | def2 | def2 | def2 | varchar2(100) |
| 42 | def3 | def3 | def3 | varchar2(100) |
| 43 | def4 | def4 | def4 | varchar2(100) |
| 44 | def5 | def5 | def5 | varchar2(100) |
| 45 | creationtime | creationtime | creationtime | char(19) |
| 46 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 47 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 48 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 49 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 50 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |