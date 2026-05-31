# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12707.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_patifh | pk_patifh | pk_patifh | char(20) | √ |
| 2 | date_entry | date_entry | date_entry | char(19) |
| 3 | dt_mctype | dt_mctype | dt_mctype | varchar2(50) |
| 4 | dt_relrole | dt_relrole | dt_relrole | varchar2(50) |  |  | '~' |
| 5 | mcsrc | mcsrc | mcsrc | number(38, 0) |
| 6 | name_dise | name_dise | name_dise | varchar2(50) |
| 7 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 8 | pk_mctype | pk_mctype | pk_mctype | varchar2(20) |  |  | '~' |
| 9 | pk_mc_dise_ehr | pk_mc_dise_ehr | pk_mc_dise_ehr | varchar2(20) |  |  | '~' |
| 10 | pk_mc_dise_pv | pk_mc_dise_pv | pk_mc_dise_pv | varchar2(20) |  |  | '~' |
| 11 | pk_mc_dise_rhip | pk_mc_dise_rhip | pk_mc_dise_rhip | varchar2(20) |  |  | '~' |
| 12 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 13 | pk_pati | pk_pati | pk_pati | varchar2(20) |  |  | '~' |
| 14 | pk_psn | pk_psn | pk_psn | varchar2(20) |  |  | '~' |
| 15 | pk_relrole | pk_relrole | pk_relrole | varchar2(20) |  |  | '~' |
| 16 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 17 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |