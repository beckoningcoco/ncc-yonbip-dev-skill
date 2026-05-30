# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10195.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_deptdoc_sub | pk_deptdoc_sub | pk_deptdoc_sub | char(20) | √ |
| 2 | bednum | bednum | bednum | number(38, 0) |
| 3 | bednum_open | bednum_open | bednum_open | number(38, 0) |
| 4 | dt_depttype | dt_depttype | dt_depttype | varchar2(50) |
| 5 | dt_stddepttype | dt_stddepttype | dt_stddepttype | varchar2(50) |
| 6 | eu_daycgset | eu_daycgset | eu_daycgset | varchar2(50) |
| 7 | eu_deptcheck | eu_deptcheck | eu_deptcheck | varchar2(50) |
| 8 | flag_bu | flag_bu | flag_bu | char(1) |
| 9 | name_place | name_place | name_place | varchar2(50) |
| 10 | note | note | note | varchar2(1000) |
| 11 | pk_dept | pk_dept | pk_dept | varchar2(20) |  |  | '~' |
| 12 | pk_depttype | pk_depttype | pk_depttype | varchar2(20) |  |  | '~' |
| 13 | pk_place | pk_place | pk_place | varchar2(50) |
| 14 | pk_srv_chkin | pk_srv_chkin | pk_srv_chkin | char(20) |
| 15 | pk_stddepttype | pk_stddepttype | pk_stddepttype | varchar2(20) |  |  | '~' |
| 16 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 17 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |