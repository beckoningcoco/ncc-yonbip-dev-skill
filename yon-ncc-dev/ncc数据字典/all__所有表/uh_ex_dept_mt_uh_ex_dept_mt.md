# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12572.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_deptmt | pk_deptmt | pk_deptmt | char(20) | √ |
| 2 | code_ex | code_ex | code_ex | varchar2(50) |
| 3 | code_pvtype | code_pvtype | code_pvtype | varchar2(50) |
| 4 | date_appl | date_appl | date_appl | char(19) |
| 5 | date_canc | date_canc | date_canc | char(19) |
| 6 | date_ex | date_ex | date_ex | char(19) |
| 7 | dt_exdepttype | dt_exdepttype | dt_exdepttype | varchar2(50) |
| 8 | eu_status | eu_status | eu_status | number(38, 0) |
| 9 | flag_canc | flag_canc | flag_canc | char(1) |
| 10 | flag_cg | flag_cg | flag_cg | char(1) |
| 11 | flag_ex | flag_ex | flag_ex | char(1) |
| 12 | name_ex | name_ex | name_ex | varchar2(50) |
| 13 | name_psn_appl | name_psn_appl | name_psn_appl | varchar2(256) |
| 14 | name_psn_canc | name_psn_canc | name_psn_canc | varchar2(256) |
| 15 | name_psn_ex | name_psn_ex | name_psn_ex | varchar2(256) |
| 16 | pk_cg | pk_cg | pk_cg | varchar2(50) |  |  | '~' |
| 17 | pk_dept_appl | pk_dept_appl | pk_dept_appl | varchar2(20) |  |  | '~' |
| 18 | pk_dept_canc | pk_dept_canc | pk_dept_canc | varchar2(20) |  |  | '~' |
| 19 | pk_dept_ex | pk_dept_ex | pk_dept_ex | varchar2(20) |  |  | '~' |
| 20 | pk_exdepttype | pk_exdepttype | pk_exdepttype | varchar2(20) |  |  | '~' |
| 21 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 22 | pk_org | pk_org | pk_org | varchar2(50) |  |  | '~' |
| 23 | pk_org_appl | pk_org_appl | pk_org_appl | varchar2(50) |  |  | '~' |
| 24 | pk_org_canc | pk_org_canc | pk_org_canc | varchar2(50) |  |  | '~' |
| 25 | pk_org_ex | pk_org_ex | pk_org_ex | varchar2(50) |  |  | '~' |
| 26 | pk_org_v | pk_org_v | pk_org_v | varchar2(50) |  |  | '~' |
| 27 | pk_psn_appl | pk_psn_appl | pk_psn_appl | varchar2(20) |  |  | '~' |
| 28 | pk_psn_canc | pk_psn_canc | pk_psn_canc | varchar2(20) |  |  | '~' |
| 29 | pk_psn_ex | pk_psn_ex | pk_psn_ex | varchar2(20) |  |  | '~' |
| 30 | pk_pvtype | pk_pvtype | pk_pvtype | varchar2(20) |  |  | '~' |
| 31 | creationtime | creationtime | creationtime | char(19) |
| 32 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 33 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 34 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 35 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 36 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |