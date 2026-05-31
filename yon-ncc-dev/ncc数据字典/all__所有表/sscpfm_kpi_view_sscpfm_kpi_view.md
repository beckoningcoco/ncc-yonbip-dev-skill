# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11841.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(36) | √ |
| 2 | animation | animation | animation | varchar2(254) |
| 3 | backgroundcolor | backgroundcolor | backgroundcolor | varchar2(50) |
| 4 | config | config | config | clob |
| 5 | groupid | groupid | groupid | varchar2(50) |
| 6 | name | name | name | varchar2(254) |
| 7 | refreshtime | refreshtime | refreshtime | number(38, 0) |
| 8 | showorder | showorder | showorder | number(38, 0) |
| 9 | showtime | showtime | showtime | number(38, 0) |
| 10 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 11 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |