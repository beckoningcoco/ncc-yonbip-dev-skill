# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12470.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ordcon | pk_ordcon | pk_ordcon | char(20) | √ |
| 2 | code_consult | code_consult | code_consult | varchar2(50) |
| 3 | date_application | date_application | date_application | char(19) |
| 4 | date_consult | date_consult | date_consult | char(19) |
| 5 | date_pv_phy | date_pv_phy | date_pv_phy | char(19) |
| 6 | desc_diag | desc_diag | desc_diag | varchar2(500) |
| 7 | eu_consult | eu_consult | eu_consult | number(38, 0) |
| 8 | eu_status | eu_status | eu_status | number(38, 0) |
| 9 | exampurp | exampurp | exampurp | varchar2(50) |
| 10 | flag_urgent | flag_urgent | flag_urgent | char(1) |
| 11 | name_psn_appconsult | name_psn_appconsult | name_psn_appconsult | varchar2(50) |
| 12 | name_psn_application | name_psn_application | name_psn_application | varchar2(50) |
| 13 | name_psn_chk | name_psn_chk | name_psn_chk | varchar2(50) |
| 14 | name_psn_consult | name_psn_consult | name_psn_consult | varchar2(50) |
| 15 | note_dise | note_dise | note_dise | varchar2(50) |
| 16 | pk_dept_consult | pk_dept_consult | pk_dept_consult | varchar2(20) |  |  | '~' |
| 17 | pk_diag | pk_diag | pk_diag | varchar2(20) |  |  | '~' |
| 18 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 19 | pk_ord | pk_ord | pk_ord | varchar2(20) |  |  | '~' |
| 20 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 21 | pk_psn_appconsult | pk_psn_appconsult | pk_psn_appconsult | varchar2(20) |  |  | '~' |
| 22 | pk_psn_application | pk_psn_application | pk_psn_application | varchar2(20) |  |  | '~' |
| 23 | pk_psn_chk | pk_psn_chk | pk_psn_chk | varchar2(20) |  |  | '~' |
| 24 | pk_psn_consult | pk_psn_consult | pk_psn_consult | varchar2(20) |  |  | '~' |
| 25 | pk_pv | pk_pv | pk_pv | varchar2(20) |  |  | '~' |
| 26 | proposals | proposals | proposals | varchar2(50) |
| 27 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 28 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |