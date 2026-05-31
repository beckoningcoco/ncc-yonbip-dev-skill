# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9227.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_factory | pk_factory | pk_factory | varchar2(20) | √ |
| 2 | clazz | clazz | clazz | varchar2(1000) |
| 3 | connecttype | connecttype | connecttype | varchar2(10) |
| 4 | enable | enable | enable | varchar2(1) |
| 5 | extendinfo | extendinfo | extendinfo | varchar2(1000) |
| 6 | factorycode | factorycode | factorycode | varchar2(50) |
| 7 | factoryname | factoryname | factoryname | varchar2(50) |
| 8 | factorytype | factorytype | factorytype | varchar2(50) |
| 9 | host | host | host | varchar2(50) |
| 10 | isdefault | isdefault | isdefault | varchar2(1) |
| 11 | port | port | port | varchar2(5) |
| 12 | servicetype | servicetype | servicetype | varchar2(50) |
| 13 | sign | sign | sign | varchar2(32) |
| 14 | sysid | sysid | sysid | varchar2(50) |
| 15 | timeout | timeout | timeout | number(38, 0) |
| 16 | url | url | url | varchar2(1000) |
| 17 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 18 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |