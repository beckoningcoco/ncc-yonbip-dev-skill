# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12729.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pativs | pk_pativs | pk_pativs | char(20) | √ |
| 2 | date_vs | date_vs | date_vs | char(19) |
| 3 | dt_mctype | dt_mctype | dt_mctype | varchar2(50) |
| 4 | mcsrc | mcsrc | mcsrc | number(38, 0) |
| 5 | name_vs | name_vs | name_vs | varchar2(50) |
| 6 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 7 | pk_mctype | pk_mctype | pk_mctype | varchar2(20) |  |  | '~' |
| 8 | pk_mc_vs_ehr | pk_mc_vs_ehr | pk_mc_vs_ehr | varchar2(20) |  |  | '~' |
| 9 | pk_mc_vs_pv | pk_mc_vs_pv | pk_mc_vs_pv | varchar2(20) |  |  | '~' |
| 10 | pk_mc_vs_rhip | pk_mc_vs_rhip | pk_mc_vs_rhip | varchar2(20) |  |  | '~' |
| 11 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 12 | pk_pati | pk_pati | pk_pati | varchar2(20) |  |  | '~' |
| 13 | val_vs | val_vs | val_vs | varchar2(256) |
| 14 | val_vs_std | val_vs_std | val_vs_std | varchar2(256) |
| 15 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 16 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |