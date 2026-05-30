# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12715.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_patilab | pk_patilab | pk_patilab | char(20) | √ |
| 2 | date_lab | date_lab | date_lab | char(19) |
| 3 | dt_mctype | dt_mctype | dt_mctype | varchar2(50) |
| 4 | mcsrc | mcsrc | mcsrc | number(38, 0) |
| 5 | name_lab | name_lab | name_lab | varchar2(50) |
| 6 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 7 | pk_mctype | pk_mctype | pk_mctype | varchar2(20) |  |  | '~' |
| 8 | pk_mc_lab_ehr | pk_mc_lab_ehr | pk_mc_lab_ehr | varchar2(20) |  |  | '~' |
| 9 | pk_mc_lab_pv | pk_mc_lab_pv | pk_mc_lab_pv | varchar2(20) |  |  | '~' |
| 10 | pk_mc_lab_rhip | pk_mc_lab_rhip | pk_mc_lab_rhip | varchar2(20) |  |  | '~' |
| 11 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 12 | pk_pati | pk_pati | pk_pati | varchar2(20) |  |  | '~' |
| 13 | unit_lab | unit_lab | unit_lab | varchar2(256) |
| 14 | val_lab | val_lab | val_lab | varchar2(256) |
| 15 | val_lab_std | val_lab_std | val_lab_std | varchar2(256) |
| 16 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 17 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |