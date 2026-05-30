# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6803.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_dateslotsec | pk_dateslotsec | pk_dateslotsec | char(20) | √ |
| 2 | begin_time | begin_time | begin_time | varchar2(20) |
| 3 | end_time | end_time | end_time | varchar2(20) |
| 4 | name_time | name_time | name_time | varchar2(50) |
| 5 | pk_dateslot | pk_dateslot | pk_dateslot | char(20) | √ |
| 6 | pk_group | pk_group | pk_group | varchar2(20) |
| 7 | pk_org | pk_org | pk_org | varchar2(20) |
| 8 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |
| 9 | rowno | rowno | rowno | varchar2(50) |
| 10 | secmin | secmin | secmin | number(38, 0) |
| 11 | sortno | sortno | sortno | number(38, 0) |
| 12 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 13 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |