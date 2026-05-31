# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11835.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(50) | √ |
| 2 | beforetime | beforetime | beforetime | number(38, 0) |  |  | 10 |
| 3 | isdoing | isdoing | isdoing | char(1) |
| 4 | property | property | property | varchar2(50) |
| 5 | value | value | value | varchar2(254) |
| 6 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 7 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |