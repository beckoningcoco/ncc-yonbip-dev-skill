# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11853.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(36) | √ |
| 2 | code | code | code | varchar2(254) |
| 3 | modulecode | modulecode | modulecode | varchar2(254) |
| 4 | name | name | name | varchar2(50) |
| 5 | srcsystem | srcsystem | srcsystem | varchar2(254) |
| 6 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 7 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |