# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12413.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_st | pk_st | pk_st | char(20) | √ |
| 2 | amt_hp | amt_hp | amt_hp | number(14, 2) |
| 3 | amt_hpcard | amt_hpcard | amt_hpcard | number(28, 8) |
| 4 | amt_ins | amt_ins | amt_ins | number(28, 8) |
| 5 | amt_pati | amt_pati | amt_pati | number(14, 2) |
| 6 | amt_prepay | amt_prepay | amt_prepay | number(28, 8) |
| 7 | amt_st | amt_st | amt_st | number(14, 2) |
| 8 | code_pvtype | code_pvtype | code_pvtype | varchar2(30) |
| 9 | date_begin | date_begin | date_begin | char(19) |
| 10 | date_clear | date_clear | date_clear | char(19) |
| 11 | date_end | date_end | date_end | char(19) |
| 12 | date_st | date_st | date_st | char(19) |
| 13 | dt_reason_canc | dt_reason_canc | dt_reason_canc | varchar2(30) |
| 14 | dt_sttype | dt_sttype | dt_sttype | varchar2(30) |
| 15 | eu_stresult | eu_stresult | eu_stresult | varchar2(50) |  |  | '~' |
| 16 | flag_arclare | flag_arclare | flag_arclare | char(1) |
| 17 | flag_blcc | flag_blcc | flag_blcc | char(1) |
| 18 | flag_prest | flag_prest | flag_prest | char(1) |
| 19 | name_dept_st | name_dept_st | name_dept_st | varchar2(50) |
| 20 | name_hp | name_hp | name_hp | varchar2(50) |
| 21 | name_psn_st | name_psn_st | name_psn_st | varchar2(50) |
| 22 | name_reason_canc | name_reason_canc | name_reason_canc | varchar2(256) |
| 23 | paticode | paticode | paticode | varchar2(50) |
| 24 | patiname | patiname | patiname | varchar2(50) |
| 25 | pk_blcc | pk_blcc | pk_blcc | varchar2(20) |  |  | '~' |
| 26 | pk_blcl | pk_blcl | pk_blcl | varchar2(20) |
| 27 | pk_dept_st | pk_dept_st | pk_dept_st | varchar2(20) |  |  | '~' |
| 28 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 29 | pk_hp | pk_hp | pk_hp | varchar2(20) |  |  | '~' |
| 30 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 31 | pk_pati | pk_pati | pk_pati | varchar2(20) |  |  | '~' |
| 32 | pk_psn_st | pk_psn_st | pk_psn_st | varchar2(20) |  |  | '~' |
| 33 | pk_pv | pk_pv | pk_pv | varchar2(20) |  |  | '~' |
| 34 | pk_reason_canc | pk_reason_canc | pk_reason_canc | varchar2(20) |
| 35 | pk_sttype | pk_sttype | pk_sttype | varchar2(20) |  |  | '~' |
| 36 | pk_st_original | pk_st_original | pk_st_original | varchar2(20) |
| 37 | pk_st_reted | pk_st_reted | pk_st_reted | varchar2(20) |  |  | '~' |
| 38 | pvname | pvname | pvname | varchar2(50) |
| 39 | reason_canc | reason_canc | reason_canc | varchar2(256) |
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
| 60 | creationtime | creationtime | creationtime | char(19) |
| 61 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 62 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 63 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 64 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 65 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |