# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6828.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_crossbusiattr | pk_crossbusiattr | pk_crossbusiattr | char(20) | √ |
| 2 | pk_business | pk_business | pk_business | varchar2(20) |  |  | '~' |
| 3 | pk_property | pk_property | pk_property | varchar2(36) |  |  | '~' |
| 4 | propertynamepath | propertynamepath | propertynamepath | varchar2(500) |
| 5 | propertypath | propertypath | propertypath | varchar2(200) |
| 6 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 7 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |