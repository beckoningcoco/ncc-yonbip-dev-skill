# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12670.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pdpu | pk_pdpu | pk_pdpu | char(20) | √ |
| 2 | code | code | code | varchar2(50) |
| 3 | date_canc | date_canc | date_canc | char(19) |
| 4 | date_pu | date_pu | date_pu | char(19) |
| 5 | dt_pdputype | dt_pdputype | dt_pdputype | varchar2(20) |
| 6 | eu_status | eu_status | eu_status | number(38, 0) |
| 7 | flag_canc | flag_canc | flag_canc | char(1) |
| 8 | name | name | name | varchar2(50) |
| 9 | note | note | note | varchar2(50) |
| 10 | pk_dept_pu | pk_dept_pu | pk_dept_pu | varchar2(20) |  |  | '~' |
| 11 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 12 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 13 | pk_psn_canc | pk_psn_canc | pk_psn_canc | varchar2(20) |  |  | '~' |
| 14 | pk_psn_pu | pk_psn_pu | pk_psn_pu | varchar2(20) |  |  | '~' |
| 15 | pk_sup | pk_sup | pk_sup | varchar2(20) |  |  | '~' |
| 16 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 17 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |