# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12697.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_patidise | pk_patidise | pk_patidise | char(20) | √ |
| 2 | date_close | date_close | date_close | char(19) |
| 3 | date_dise | date_dise | date_dise | char(19) |
| 4 | date_entry | date_entry | date_entry | char(19) |
| 5 | dt_mctype | dt_mctype | dt_mctype | varchar2(50) |
| 6 | flag_close | flag_close | flag_close | char(1) |
| 7 | mcsrc | mcsrc | mcsrc | number(38, 0) |
| 8 | name_dise | name_dise | name_dise | varchar2(50) |
| 9 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 10 | pk_mctype | pk_mctype | pk_mctype | varchar2(20) |  |  | '~' |
| 11 | pk_mc_dise_ehr | pk_mc_dise_ehr | pk_mc_dise_ehr | varchar2(20) |  |  | '~' |
| 12 | pk_mc_dise_pv | pk_mc_dise_pv | pk_mc_dise_pv | varchar2(20) |  |  | '~' |
| 13 | pk_mc_dise_rhip | pk_mc_dise_rhip | pk_mc_dise_rhip | varchar2(20) |  |  | '~' |
| 14 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 15 | pk_pati | pk_pati | pk_pati | varchar2(20) |  |  | '~' |
| 16 | pk_psn | pk_psn | pk_psn | varchar2(20) |  |  | '~' |
| 17 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 18 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |