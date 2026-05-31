# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8037.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_work_apply_b | pk_work_apply_b | pk_work_apply_b | char(20) | √ |
| 2 | abnormity_time | abnormity_time | abnormity_time | char(19) |
| 3 | apply_business | apply_business | apply_business | varchar2(80) |
| 4 | close_date | close_date | close_date | char(19) |
| 5 | close_flag | close_flag | close_flag | char(1) |  |  | 'N' |
| 6 | consign_flag | consign_flag | consign_flag | char(1) |  |  | 'N' |
| 7 | consign_reason | consign_reason | consign_reason | varchar2(200) |
| 8 | failure_detail | failure_detail | failure_detail | varchar2(80) |
| 9 | make_wo_flag | make_wo_flag | make_wo_flag | char(1) |  |  | 'N' |
| 10 | memo | memo | memo | varchar2(200) |
| 11 | pk_closer | pk_closer | pk_closer | varchar2(20) |  |  | '~' |
| 12 | pk_equip | pk_equip | pk_equip | varchar2(20) |  |  | '~' |
| 13 | pk_failure_symptom | pk_failure_symptom | pk_failure_symptom | varchar2(20) |  |  | '~' |
| 14 | pk_failure_type | pk_failure_type | pk_failure_type | varchar2(20) |  |  | '~' |
| 15 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 16 | pk_location | pk_location | pk_location | varchar2(20) |  |  | '~' |
| 17 | pk_maintainorg | pk_maintainorg | pk_maintainorg | varchar2(20) |  |  | '~' |
| 18 | pk_maintainorg_v | pk_maintainorg_v | pk_maintainorg_v | varchar2(20) |  |  | '~' |
| 19 | pk_manager | pk_manager | pk_manager | varchar2(20) |  |  | '~' |
| 20 | pk_mandept | pk_mandept | pk_mandept | varchar2(20) |  |  | '~' |
| 21 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 22 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 23 | pk_ownerorg | pk_ownerorg | pk_ownerorg | varchar2(20) |  |  | '~' |
| 24 | pk_project | pk_project | pk_project | varchar2(20) |  |  | '~' |
| 25 | pk_usedept | pk_usedept | pk_usedept | varchar2(20) |  |  | '~' |
| 26 | pk_usedorg | pk_usedorg | pk_usedorg | varchar2(20) |  |  | '~' |
| 27 | pk_usedunit | pk_usedunit | pk_usedunit | varchar2(20) |  |  | '~' |
| 28 | pk_user | pk_user | pk_user | varchar2(20) |  |  | '~' |
| 29 | pk_work_apply | pk_work_apply | pk_work_apply | char(20) | √ |
| 30 | rowno | rowno | rowno | varchar2(30) |
| 31 | treat_type | treat_type | treat_type | number(38, 0) |
| 32 | def1 | def1 | def1 | varchar2(101) |
| 33 | def2 | def2 | def2 | varchar2(101) |
| 34 | def3 | def3 | def3 | varchar2(101) |
| 35 | def4 | def4 | def4 | varchar2(101) |
| 36 | def5 | def5 | def5 | varchar2(101) |
| 37 | def6 | def6 | def6 | varchar2(101) |
| 38 | def7 | def7 | def7 | varchar2(101) |
| 39 | def8 | def8 | def8 | varchar2(101) |
| 40 | def9 | def9 | def9 | varchar2(101) |
| 41 | def10 | def10 | def10 | varchar2(101) |
| 42 | def11 | def11 | def11 | varchar2(101) |
| 43 | def12 | def12 | def12 | varchar2(101) |
| 44 | def13 | def13 | def13 | varchar2(101) |
| 45 | def14 | def14 | def14 | varchar2(101) |
| 46 | def15 | def15 | def15 | varchar2(101) |
| 47 | def16 | def16 | def16 | varchar2(101) |
| 48 | def17 | def17 | def17 | varchar2(101) |
| 49 | def18 | def18 | def18 | varchar2(101) |
| 50 | def19 | def19 | def19 | varchar2(101) |
| 51 | def20 | def20 | def20 | varchar2(101) |
| 52 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 53 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |