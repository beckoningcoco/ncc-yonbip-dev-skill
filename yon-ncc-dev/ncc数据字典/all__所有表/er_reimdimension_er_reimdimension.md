# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7986.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_reimdimension | pk_reimdimension | pk_reimdimension | char(20) | √ |
| 2 | beanname | beanname | beanname | varchar2(50) |
| 3 | billref | billref | billref | varchar2(50) |  |  | '~' |
| 4 | billrefcode | billrefcode | billrefcode | varchar2(50) |
| 5 | controlflag | controlflag | controlflag | char(1) |
| 6 | correspondingitem | correspondingitem | correspondingitem | varchar2(50) |
| 7 | datatype | datatype | datatype | varchar2(36) | √ |  | '~' |
| 8 | datatypename | datatypename | datatypename | varchar2(50) |
| 9 | displayname | displayname | displayname | varchar2(75) | √ |
| 10 | orders | orders | orders | number(38, 0) |
| 11 | pk_billtype | pk_billtype | pk_billtype | varchar2(20) | √ |  | '~' |
| 12 | pk_group | pk_group | pk_group | varchar2(20) | √ |  | '~' |
| 13 | pk_org | pk_org | pk_org | varchar2(20) | √ |  | '~' |
| 14 | referential | referential | referential | varchar2(50) |
| 15 | showflag | showflag | showflag | char(1) |
| 16 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 17 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |