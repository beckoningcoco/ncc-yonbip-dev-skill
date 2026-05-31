# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7131.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cnslot | pk_cnslot | pk_cnslot | char(20) | √ |
| 2 | begindate | begindate | begindate | char(8) |
| 3 | enddate | enddate | enddate | char(8) |
| 4 | eu_cnslottype | eu_cnslottype | eu_cnslottype | number(38, 0) |
| 5 | flag_active | flag_active | flag_active | char(1) |
| 6 | pk_dept | pk_dept | pk_dept | char(20) |
| 7 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 8 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 9 | slotname | slotname | slotname | varchar2(50) |
| 10 | slotno | slotno | slotno | varchar2(50) |
| 11 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 12 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |