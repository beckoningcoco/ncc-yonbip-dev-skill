# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12739.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pvdiag | pk_pvdiag | pk_pvdiag | char(20) | √ |
| 2 | date_diag | date_diag | date_diag | char(19) |
| 3 | date_recodediag | date_recodediag | date_recodediag | char(20) |
| 4 | desc_diag | desc_diag | desc_diag | varchar2(500) |
| 5 | dt_diagtype | dt_diagtype | dt_diagtype | varchar2(50) |
| 6 | dt_emrfpdiagcase | dt_emrfpdiagcase | dt_emrfpdiagcase | varchar2(20) |
| 7 | flag_cure | flag_cure | flag_cure | char(1) |
| 8 | flag_final | flag_final | flag_final | char(1) |
| 9 | flag_infect | flag_infect | flag_infect | char(1) |
| 10 | flag_maj | flag_maj | flag_maj | char(1) |
| 11 | flag_susp | flag_susp | flag_susp | char(1) |
| 12 | name_psn_phy | name_psn_phy | name_psn_phy | varchar2(50) |
| 13 | pk_diag | pk_diag | pk_diag | varchar2(20) |  |  | '~' |
| 14 | pk_diagtype | pk_diagtype | pk_diagtype | varchar2(20) |  |  | '~' |
| 15 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 16 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 17 | pk_psn_phy | pk_psn_phy | pk_psn_phy | varchar2(20) |  |  | '~' |
| 18 | pk_psn_recode | pk_psn_recode | pk_psn_recode | char(20) |
| 19 | pk_pv | pk_pv | pk_pv | varchar2(20) |  |  | '~' |
| 20 | pk_recodediag | pk_recodediag | pk_recodediag | char(20) |
| 21 | sortno | sortno | sortno | number(38, 0) |
| 22 | creationtime | creationtime | creationtime | char(19) |
| 23 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 24 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 25 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 26 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 27 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |