# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12765.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pvwg | pk_pvwg | pk_pvwg | char(20) | √ |
| 2 | date_begin | date_begin | date_begin | char(19) |
| 3 | date_end | date_end | date_end | char(19) |
| 4 | dt_patieva | dt_patieva | dt_patieva | varchar2(50) |
| 5 | name_patieva | name_patieva | name_patieva | varchar2(256) |
| 6 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 7 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 8 | pk_patieva | pk_patieva | pk_patieva | varchar2(20) |  |  | '~' |
| 9 | pk_pv | pk_pv | pk_pv | varchar2(20) |  |  | '~' |
| 10 | pk_pvdept | pk_pvdept | pk_pvdept | char(20) |
| 11 | pk_wg | pk_wg | pk_wg | varchar2(50) |
| 12 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 13 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |