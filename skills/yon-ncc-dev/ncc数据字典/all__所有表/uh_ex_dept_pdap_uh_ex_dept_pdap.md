# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12575.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_deptpdap | pk_deptpdap | pk_deptpdap | char(20) | √ |
| 2 | code_ap | code_ap | code_ap | varchar2(50) |
| 3 | code_pvtype | code_pvtype | code_pvtype | varchar2(50) |
| 4 | date_ap | date_ap | date_ap | char(19) |
| 5 | date_canc | date_canc | date_canc | char(19) |
| 6 | date_de | date_de | date_de | char(19) |
| 7 | dt_exdepttype | dt_exdepttype | dt_exdepttype | varchar2(50) |
| 8 | dt_pdaptype | dt_pdaptype | dt_pdaptype | varchar2(20) |
| 9 | eu_direct | eu_direct | eu_direct | number(38, 0) |
| 10 | eu_status | eu_status | eu_status | number(38, 0) |
| 11 | flag_canc | flag_canc | flag_canc | char(1) |
| 12 | flag_de | flag_de | flag_de | char(1) |
| 13 | flag_fin | flag_fin | flag_fin | char(1) |
| 14 | name_ap | name_ap | name_ap | varchar2(50) |
| 15 | name_psn_ap | name_psn_ap | name_psn_ap | varchar2(256) |
| 16 | name_psn_canc | name_psn_canc | name_psn_canc | varchar2(256) |
| 17 | name_psn_de | name_psn_de | name_psn_de | varchar2(256) |
| 18 | note | note | note | varchar2(50) |
| 19 | pk_dept_ap | pk_dept_ap | pk_dept_ap | varchar2(20) |  |  | '~' |
| 20 | pk_dept_canc | pk_dept_canc | pk_dept_canc | varchar2(20) |  |  | '~' |
| 21 | pk_dept_de | pk_dept_de | pk_dept_de | varchar2(20) |  |  | '~' |
| 22 | pk_exdepttype | pk_exdepttype | pk_exdepttype | varchar2(20) |  |  | '~' |
| 23 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 24 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 25 | pk_org_ap | pk_org_ap | pk_org_ap | varchar2(20) |  |  | '~' |
| 26 | pk_org_canc | pk_org_canc | pk_org_canc | varchar2(20) |  |  | '~' |
| 27 | pk_org_de | pk_org_de | pk_org_de | varchar2(20) |  |  | '~' |
| 28 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 29 | pk_psn_ap | pk_psn_ap | pk_psn_ap | varchar2(20) |  |  | '~' |
| 30 | pk_psn_canc | pk_psn_canc | pk_psn_canc | varchar2(20) |  |  | '~' |
| 31 | pk_psn_de | pk_psn_de | pk_psn_de | varchar2(20) |  |  | '~' |
| 32 | pk_pvtype | pk_pvtype | pk_pvtype | varchar2(20) |  |  | '~' |
| 33 | creationtime | creationtime | creationtime | char(19) |
| 34 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 35 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 36 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 37 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 38 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |