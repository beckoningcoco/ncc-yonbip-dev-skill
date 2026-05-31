# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11850.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(36) | √ |
| 2 | bgimage | bgimage | bgimage | varchar2(511) |
| 3 | config | config | config | clob |
| 4 | displaycolor | displaycolor | displaycolor | varchar2(20) |
| 5 | name | name | name | varchar2(50) |
| 6 | showorder | showorder | showorder | number(38, 0) |
| 7 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 8 | modifier | modifier | modifier | varchar2(50) |
| 9 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |