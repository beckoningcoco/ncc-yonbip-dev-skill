# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12689.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_patibt | pk_patibt | pk_patibt | char(20) | √ |
| 2 | date_bt | date_bt | date_bt | char(19) |
| 3 | date_entry | date_entry | date_entry | char(19) |
| 4 | dt_mctype | dt_mctype | dt_mctype | varchar2(50) |
| 5 | mcsrc | mcsrc | mcsrc | number(38, 0) |
| 6 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 7 | pk_mctype | pk_mctype | pk_mctype | varchar2(20) |  |  | '~' |
| 8 | pk_mc_bt_ehr | pk_mc_bt_ehr | pk_mc_bt_ehr | varchar2(20) |  |  | '~' |
| 9 | pk_mc_bt_pv | pk_mc_bt_pv | pk_mc_bt_pv | varchar2(20) |  |  | '~' |
| 10 | pk_mc_bt_rhip | pk_mc_bt_rhip | pk_mc_bt_rhip | varchar2(20) |  |  | '~' |
| 11 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 12 | pk_pati | pk_pati | pk_pati | varchar2(20) |  |  | '~' |
| 13 | pk_psn | pk_psn | pk_psn | varchar2(20) |  |  | '~' |
| 14 | resion | resion | resion | varchar2(256) |
| 15 | unit_bt | unit_bt | unit_bt | varchar2(50) |
| 16 | val_bt | val_bt | val_bt | number(14, 2) |
| 17 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 18 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |