# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12589.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_execlist | pk_execlist | pk_execlist | char(20) | √ |
| 2 | date_canc | date_canc | date_canc | char(19) |
| 3 | date_ex | date_ex | date_ex | char(19) |
| 4 | date_plan | date_plan | date_plan | char(19) |
| 5 | eu_status | eu_status | eu_status | number(38, 0) |
| 6 | flag_canc | flag_canc | flag_canc | char(1) |
| 7 | flag_ex | flag_ex | flag_ex | char(1) |
| 8 | flag_print | flag_print | flag_print | char(1) |
| 9 | name_psn_canc | name_psn_canc | name_psn_canc | varchar2(50) |
| 10 | name_psn_ex | name_psn_ex | name_psn_ex | varchar2(50) |
| 11 | pk_dept_canc | pk_dept_canc | pk_dept_canc | varchar2(20) |  |  | '~' |
| 12 | pk_dept_ex | pk_dept_ex | pk_dept_ex | varchar2(20) |  |  | '~' |
| 13 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 14 | pk_ord | pk_ord | pk_ord | varchar2(50) |
| 15 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 16 | pk_org_canc | pk_org_canc | pk_org_canc | varchar2(20) |  |  | '~' |
| 17 | pk_org_ex | pk_org_ex | pk_org_ex | varchar2(20) |  |  | '~' |
| 18 | pk_psn_canc | pk_psn_canc | pk_psn_canc | varchar2(20) |  |  | '~' |
| 19 | pk_psn_ex | pk_psn_ex | pk_psn_ex | varchar2(20) |  |  | '~' |
| 20 | pk_pv | pk_pv | pk_pv | varchar2(50) |
| 21 | time_plan | time_plan | time_plan | char(8) |
| 22 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 23 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |