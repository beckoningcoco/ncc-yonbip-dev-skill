# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11593.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_property | pk_property | pk_property | char(20) | √ |
| 2 | pk_message | pk_message | pk_message | varchar2(20) |
| 3 | propertyname | propertyname | propertyname | varchar2(100) |
| 4 | seq | seq | seq | varchar2(20) |
| 5 | type | type | type | varchar2(50) |
| 6 | value | value | value | varchar2(200) |
| 7 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 8 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |