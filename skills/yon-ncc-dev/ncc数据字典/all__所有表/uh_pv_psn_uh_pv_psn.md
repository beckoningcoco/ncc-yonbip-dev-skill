# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12761.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pvpsn | pk_pvpsn | pk_pvpsn | char(20) | √ |
| 2 | date_begin | date_begin | date_begin | char(19) |
| 3 | date_end | date_end | date_end | char(19) |
| 4 | dt_patieva | dt_patieva | dt_patieva | varchar2(50) |
| 5 | dt_role_pvpsn | dt_role_pvpsn | dt_role_pvpsn | varchar2(50) |
| 6 | name_patieva | name_patieva | name_patieva | varchar2(256) |
| 7 | name_psn | name_psn | name_psn | varchar2(50) |
| 8 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 9 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 10 | pk_patieva | pk_patieva | pk_patieva | varchar2(20) |
| 11 | pk_psn | pk_psn | pk_psn | varchar2(20) |  |  | '~' |
| 12 | pk_pv | pk_pv | pk_pv | varchar2(20) |  |  | '~' |
| 13 | pk_pvdept | pk_pvdept | pk_pvdept | varchar2(50) |
| 14 | pk_role_pvpsn | pk_role_pvpsn | pk_role_pvpsn | varchar2(20) |
| 15 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 16 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |