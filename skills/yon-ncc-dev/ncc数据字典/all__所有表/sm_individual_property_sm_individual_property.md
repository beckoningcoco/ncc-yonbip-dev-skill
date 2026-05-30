# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11560.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_property | pk_property | pk_property | char(20) | √ |
| 2 | pageid | pageid | pageid | varchar2(100) |
| 3 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 4 | pk_user | pk_user | pk_user | varchar2(20) |  |  | '~' |
| 5 | propertyname | propertyname | propertyname | varchar2(100) |
| 6 | seq | seq | seq | varchar2(20) |  |  | '~' |
| 7 | type | type | type | varchar2(50) |
| 8 | value | value | value | varchar2(2000) |
| 9 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 10 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |