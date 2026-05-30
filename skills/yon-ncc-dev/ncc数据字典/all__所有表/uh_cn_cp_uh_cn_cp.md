# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12425.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cp | pk_cp | pk_cp | char(20) | √ |
| 2 | code_cp | code_cp | code_cp | varchar2(30) |
| 3 | cpcode | cpcode | cpcode | varchar2(50) |
| 4 | cpdes | cpdes | cpdes | varchar2(256) |
| 5 | cpname | cpname | cpname | varchar2(50) |
| 6 | date_audit | date_audit | date_audit | char(19) |
| 7 | date_create | date_create | date_create | char(19) |
| 8 | date_enable | date_enable | date_enable | char(19) |
| 9 | date_stop | date_stop | date_stop | char(19) |
| 10 | date_ver | date_ver | date_ver | char(19) |
| 11 | dt_cptype | dt_cptype | dt_cptype | varchar2(50) |
| 12 | flag_enable | flag_enable | flag_enable | varchar2(1) |
| 13 | max_day | max_day | max_day | number(38, 0) |
| 14 | max_stage | max_stage | max_stage | number(38, 0) |
| 15 | name_cp | name_cp | name_cp | varchar2(150) |
| 16 | name_dept | name_dept | name_dept | varchar2(50) |
| 17 | name_psn_audit | name_psn_audit | name_psn_audit | varchar2(50) |
| 18 | name_psn_create | name_psn_create | name_psn_create | varchar2(50) |
| 19 | norm_day | norm_day | norm_day | varchar2(20) |
| 20 | pk_cptype | pk_cptype | pk_cptype | varchar2(20) |  |  | '~' |
| 21 | pk_dept | pk_dept | pk_dept | varchar2(20) |  |  | '~' |
| 22 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 23 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 24 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 25 | pk_psn_audit | pk_psn_audit | pk_psn_audit | char(20) |
| 26 | pk_psn_create | pk_psn_create | pk_psn_create | char(20) |
| 27 | price | price | price | number(8, 2) |
| 28 | status_cp | status_cp | status_cp | char(1) |
| 29 | ver_cp | ver_cp | ver_cp | varchar2(20) |
| 30 | creationtime | creationtime | creationtime | char(19) |
| 31 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 32 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 33 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 34 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 35 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |