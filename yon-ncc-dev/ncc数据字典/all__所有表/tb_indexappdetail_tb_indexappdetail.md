# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12045.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_obj | pk_obj | pk_obj | char(20) | √ |
| 2 | apptime | apptime | apptime | char(19) |
| 3 | dimdetailinf | dimdetailinf | dimdetailinf | varchar2(1200) |
| 4 | newvalue | newvalue | newvalue | number(30, 8) |
| 5 | newvalue2 | newvalue2 | newvalue2 | varchar2(128) |
| 6 | oldvalue | oldvalue | oldvalue | number(30, 8) |
| 7 | oldvalue2 | oldvalue2 | oldvalue2 | varchar2(128) |
| 8 | pk_approver | pk_approver | pk_approver | varchar2(20) |
| 9 | pk_cube | pk_cube | pk_cube | varchar2(20) |
| 10 | pk_log | pk_log | pk_log | varchar2(20) |
| 11 | pk_sheet | pk_sheet | pk_sheet | char(20) |
| 12 | pk_task | pk_task | pk_task | varchar2(20) |
| 13 | txtnote | txtnote | txtnote | varchar2(500) |
| 14 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 15 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |