# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12719.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_patimedi | pk_patimedi | pk_patimedi | char(20) | √ |
| 2 | date_begin | date_begin | date_begin | char(19) |
| 3 | date_end | date_end | date_end | char(19) |
| 4 | date_entry | date_entry | date_entry | char(19) |
| 5 | desc_medi | desc_medi | desc_medi | varchar2(256) |
| 6 | dt_mctype | dt_mctype | dt_mctype | varchar2(50) |
| 7 | mcsrc | mcsrc | mcsrc | number(38, 0) |
| 8 | name_medi | name_medi | name_medi | varchar2(50) |
| 9 | note_medi | note_medi | note_medi | varchar2(256) |
| 10 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 11 | pk_mctype | pk_mctype | pk_mctype | varchar2(20) |  |  | '~' |
| 12 | pk_mc_medi_ehr | pk_mc_medi_ehr | pk_mc_medi_ehr | varchar2(20) |  |  | '~' |
| 13 | pk_mc_medi_pv | pk_mc_medi_pv | pk_mc_medi_pv | varchar2(20) |  |  | '~' |
| 14 | pk_mc_medi_rhip | pk_mc_medi_rhip | pk_mc_medi_rhip | varchar2(20) |  |  | '~' |
| 15 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 16 | pk_pati | pk_pati | pk_pati | varchar2(20) |  |  | '~' |
| 17 | pk_psn | pk_psn | pk_psn | varchar2(20) |  |  | '~' |
| 18 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 19 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |