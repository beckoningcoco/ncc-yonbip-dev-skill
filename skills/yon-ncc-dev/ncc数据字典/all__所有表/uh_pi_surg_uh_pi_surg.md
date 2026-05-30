# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12726.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_patisurg | pk_patisurg | pk_patisurg | char(20) | √ |
| 2 | date_entry | date_entry | date_entry | char(19) |
| 3 | date_surg | date_surg | date_surg | char(19) |
| 4 | dt_mctype | dt_mctype | dt_mctype | varchar2(20) |  |  | '~' |
| 5 | mcsrc | mcsrc | mcsrc | number(38, 0) |
| 6 | name_surg | name_surg | name_surg | varchar2(50) |
| 7 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 8 | pk_mc_isurg_ehr | pk_mc_isurg_ehr | pk_mc_isurg_ehr | varchar2(50) |
| 9 | pk_mc_isurg_pv | pk_mc_isurg_pv | pk_mc_isurg_pv | varchar2(50) |
| 10 | pk_mc_isurg_rhip | pk_mc_isurg_rhip | pk_mc_isurg_rhip | varchar2(50) |
| 11 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 12 | pk_pati | pk_pati | pk_pati | varchar2(50) |
| 13 | pk_psn | pk_psn | pk_psn | varchar2(20) |  |  | '~' |
| 14 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 15 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |