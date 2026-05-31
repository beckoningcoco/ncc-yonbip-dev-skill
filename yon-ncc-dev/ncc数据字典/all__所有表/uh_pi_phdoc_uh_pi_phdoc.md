# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12721.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_piphdoc | pk_piphdoc | pk_piphdoc | char(20) | √ |
| 2 | date_create | date_create | date_create | char(19) |
| 3 | date_next | date_next | date_next | char(19) |
| 4 | date_ph_recent | date_ph_recent | date_ph_recent | char(19) |
| 5 | date_stop | date_stop | date_stop | char(19) |
| 6 | desc_phstop | desc_phstop | desc_phstop | varchar2(256) |
| 7 | dt_phstop | dt_phstop | dt_phstop | varchar2(50) |
| 8 | dt_phtype | dt_phtype | dt_phtype | varchar2(50) |
| 9 | dt_priority | dt_priority | dt_priority | varchar2(50) |
| 10 | eu_status_phdoc | eu_status_phdoc | eu_status_phdoc | number(38, 0) |
| 11 | flag_stop | flag_stop | flag_stop | char(1) |
| 12 | note | note | note | varchar2(256) |
| 13 | pk_dept_ph | pk_dept_ph | pk_dept_ph | varchar2(20) |  |  | '~' |
| 14 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 15 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 16 | pk_org_create | pk_org_create | pk_org_create | varchar2(20) |  |  | '~' |
| 17 | pk_org_ph | pk_org_ph | pk_org_ph | varchar2(20) |  |  | '~' |
| 18 | pk_org_stop | pk_org_stop | pk_org_stop | varchar2(20) |  |  | '~' |
| 19 | pk_pati | pk_pati | pk_pati | varchar2(20) |  |  | '~' |
| 20 | pk_ph | pk_ph | pk_ph | varchar2(20) |  |  | '~' |
| 21 | pk_phstop | pk_phstop | pk_phstop | varchar2(50) |
| 22 | pk_phtype | pk_phtype | pk_phtype | varchar2(20) |  |  | '~' |
| 23 | pk_phwf | pk_phwf | pk_phwf | varchar2(50) |
| 24 | pk_piehr | pk_piehr | pk_piehr | varchar2(20) |  |  | '~' |
| 25 | pk_priority | pk_priority | pk_priority | varchar2(50) |
| 26 | pk_psn_create | pk_psn_create | pk_psn_create | varchar2(20) |  |  | '~' |
| 27 | pk_psn_ph | pk_psn_ph | pk_psn_ph | varchar2(20) |  |  | '~' |
| 28 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 29 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |