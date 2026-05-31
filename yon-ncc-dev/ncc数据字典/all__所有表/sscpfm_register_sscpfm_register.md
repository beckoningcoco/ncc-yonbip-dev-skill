# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11848.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(50) | √ |
| 2 | classname | classname | classname | varchar2(254) | √ |
| 3 | describe | describe | describe | varchar2(254) |
| 4 | modulecode | modulecode | modulecode | varchar2(254) |
| 5 | srcsystem | srcsystem | srcsystem | varchar2(254) | √ |
| 6 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 7 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |