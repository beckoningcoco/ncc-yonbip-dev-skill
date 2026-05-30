# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12594.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ordmt | pk_ordmt | pk_ordmt | char(20) | √ |
| 2 | code_apply | code_apply | code_apply | varchar2(50) |
| 3 | code_ex | code_ex | code_ex | varchar2(50) |
| 4 | code_pvtype | code_pvtype | code_pvtype | varchar2(50) |
| 5 | date_appt | date_appt | date_appt | char(19) |
| 6 | date_canc | date_canc | date_canc | char(19) |
| 7 | date_entry | date_entry | date_entry | char(19) |
| 8 | date_ex | date_ex | date_ex | char(19) |
| 9 | date_exec | date_exec | date_exec | varchar2(50) |
| 10 | date_ord | date_ord | date_ord | char(19) |
| 11 | date_plan | date_plan | date_plan | char(19) |
| 12 | date_ret | date_ret | date_ret | char(19) |
| 13 | dt_exordtype | dt_exordtype | dt_exordtype | varchar2(50) |
| 14 | eu_status | eu_status | eu_status | number(38, 0) |
| 15 | flag_canc | flag_canc | flag_canc | char(1) |
| 16 | flag_cg | flag_cg | flag_cg | char(1) |
| 17 | flag_ex | flag_ex | flag_ex | char(1) |
| 18 | flag_ret | flag_ret | flag_ret | char(1) |
| 19 | name_ex | name_ex | name_ex | varchar2(200) |
| 20 | name_psn_canc | name_psn_canc | name_psn_canc | varchar2(50) |
| 21 | name_psn_chk | name_psn_chk | name_psn_chk | varchar2(50) |
| 22 | name_psn_ex | name_psn_ex | name_psn_ex | varchar2(50) |
| 23 | name_psn_exec | name_psn_exec | name_psn_exec | varchar2(50) |
| 24 | name_psn_ord | name_psn_ord | name_psn_ord | varchar2(50) |
| 25 | name_psn_rec | name_psn_rec | name_psn_rec | varchar2(50) |
| 26 | newborn | newborn | newborn | number(38, 0) |
| 27 | note | note | note | varchar2(256) |
| 28 | pk_cg | pk_cg | pk_cg | varchar2(50) |  |  | '~' |
| 29 | pk_dept_canc | pk_dept_canc | pk_dept_canc | varchar2(20) |  |  | '~' |
| 30 | pk_dept_ex | pk_dept_ex | pk_dept_ex | varchar2(20) |  |  | '~' |
| 31 | pk_dept_ord | pk_dept_ord | pk_dept_ord | varchar2(20) |  |  | '~' |
| 32 | pk_exet | pk_exet | pk_exet | varchar2(20) |  |  | '~' |
| 33 | pk_exordtype | pk_exordtype | pk_exordtype | varchar2(20) |  |  | '~' |
| 34 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 35 | pk_ord | pk_ord | pk_ord | varchar2(50) |  |  | '~' |
| 36 | pk_org | pk_org | pk_org | varchar2(50) |  |  | '~' |
| 37 | pk_org_canc | pk_org_canc | pk_org_canc | varchar2(50) |  |  | '~' |
| 38 | pk_org_ex | pk_org_ex | pk_org_ex | varchar2(50) |  |  | '~' |
| 39 | pk_org_ord | pk_org_ord | pk_org_ord | varchar2(50) |  |  | '~' |
| 40 | pk_org_v | pk_org_v | pk_org_v | varchar2(50) |  |  | '~' |
| 41 | pk_pati | pk_pati | pk_pati | varchar2(20) |  |  | '~' |
| 42 | pk_psn_canc | pk_psn_canc | pk_psn_canc | varchar2(20) |  |  | '~' |
| 43 | pk_psn_chk | pk_psn_chk | pk_psn_chk | varchar2(20) |  |  | '~' |
| 44 | pk_psn_ex | pk_psn_ex | pk_psn_ex | varchar2(20) |  |  | '~' |
| 45 | pk_psn_exec | pk_psn_exec | pk_psn_exec | varchar2(50) |
| 46 | pk_psn_ord | pk_psn_ord | pk_psn_ord | varchar2(20) |  |  | '~' |
| 47 | pk_psn_rec | pk_psn_rec | pk_psn_rec | varchar2(20) |  |  | '~' |
| 48 | pk_pv | pk_pv | pk_pv | varchar2(50) |  |  | '~' |
| 49 | pk_pvtype | pk_pvtype | pk_pvtype | varchar2(20) |  |  | '~' |
| 50 | quan | quan | quan | varchar2(50) |
| 51 | quan_exec | quan_exec | quan_exec | varchar2(50) |
| 52 | quan_unexec | quan_unexec | quan_unexec | varchar2(50) |
| 53 | creationtime | creationtime | creationtime | char(19) |
| 54 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 55 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 56 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 57 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 58 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |