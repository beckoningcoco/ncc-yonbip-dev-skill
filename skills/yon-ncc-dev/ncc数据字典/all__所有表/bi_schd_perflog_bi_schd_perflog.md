# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7331.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | guid | guid | guid | varchar2(30) | √ |
| 2 | businessid | businessid | businessid | varchar2(150) |
| 3 | childrennum | childrennum | childrennum | number(38, 0) |
| 4 | elapsedtime | elapsedtime | elapsedtime | number(38, 0) |
| 5 | errorflag | errorflag | errorflag | number(38, 0) |
| 6 | execnum | execnum | execnum | number(38, 0) |
| 7 | hostid | hostid | hostid | varchar2(30) |
| 8 | message | message | message | blob |
| 9 | nanotime | nanotime | nanotime | varchar2(30) |
| 10 | parentoid | parentoid | parentoid | varchar2(30) |
| 11 | resmodule | resmodule | resmodule | varchar2(30) |
| 12 | rootoid | rootoid | rootoid | varchar2(30) |
| 13 | scale | scale | scale | float |
| 14 | starttime | starttime | starttime | varchar2(30) |
| 15 | tag | tag | tag | varchar2(500) |
| 16 | threadname | threadname | threadname | varchar2(50) |
| 17 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 18 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |