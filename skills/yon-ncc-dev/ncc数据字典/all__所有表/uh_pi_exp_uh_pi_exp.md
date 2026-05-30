# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12705.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_patiexp | pk_patiexp | pk_patiexp | char(20) | √ |
| 2 | date_entry | date_entry | date_entry | char(19) |
| 3 | dt_mctype | dt_mctype | dt_mctype | varchar2(50) |
| 4 | mcsrc | mcsrc | mcsrc | number(38, 0) |
| 5 | name_exp | name_exp | name_exp | varchar2(50) |
| 6 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 7 | pk_mctype | pk_mctype | pk_mctype | varchar2(20) |  |  | '~' |
| 8 | pk_mc_exp_ehr | pk_mc_exp_ehr | pk_mc_exp_ehr | varchar2(20) |  |  | '~' |
| 9 | pk_mc_exp_pv | pk_mc_exp_pv | pk_mc_exp_pv | varchar2(20) |  |  | '~' |
| 10 | pk_mc_exp_rhip | pk_mc_exp_rhip | pk_mc_exp_rhip | varchar2(20) |  |  | '~' |
| 11 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 12 | pk_pati | pk_pati | pk_pati | varchar2(20) |  |  | '~' |
| 13 | pk_psn | pk_psn | pk_psn | varchar2(20) |  |  | '~' |
| 14 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 15 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |