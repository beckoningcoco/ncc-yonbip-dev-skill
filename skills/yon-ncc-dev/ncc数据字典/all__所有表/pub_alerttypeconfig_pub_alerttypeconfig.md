# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10864.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_alerttypeconfig | pk_alerttypeconfig | pk_alerttypeconfig | char(20) | √ |
| 2 | fieldname | fieldname | fieldname | varchar2(1024) |
| 3 | operator | operator | operator | varchar2(20) |
| 4 | pk_alertregistry | pk_alertregistry | pk_alertregistry | char(20) |
| 5 | refervalue | refervalue | refervalue | varchar2(3072) |
| 6 | value | value | value | varchar2(3072) |
| 7 | variablename | variablename | variablename | varchar2(80) |
| 8 | vartype | vartype | vartype | varchar2(20) |
| 9 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 10 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |