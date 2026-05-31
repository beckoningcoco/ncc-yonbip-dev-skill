# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8757.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(20) | √ |
| 2 | appcode | appcode | appcode | varchar2(50) |
| 3 | deploystatus | deploystatus | deploystatus | varchar2(20) |
| 4 | readstatus | readstatus | readstatus | varchar2(20) |
| 5 | url | url | url | varchar2(100) |
| 6 | userid | userid | userid | varchar2(20) |
| 7 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 8 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |