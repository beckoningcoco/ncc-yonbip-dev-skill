# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7332.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | guid | guid | guid | varchar2(30) | √ |
| 2 | endtime | endtime | endtime | varchar2(30) |
| 3 | jobguid | jobguid | jobguid | varchar2(30) |
| 4 | moduleid | moduleid | moduleid | varchar2(200) |
| 5 | note | note | note | varchar2(1024) |
| 6 | resultdata | resultdata | resultdata | blob |
| 7 | runlevel | runlevel | runlevel | number(38, 0) |
| 8 | runstate | runstate | runstate | number(38, 0) |
| 9 | servername | servername | servername | varchar2(30) |
| 10 | starttime | starttime | starttime | varchar2(30) |
| 11 | taskdata | taskdata | taskdata | blob |
| 12 | taskname | taskname | taskname | varchar2(200) |
| 13 | threadname | threadname | threadname | varchar2(100) |
| 14 | totaltime | totaltime | totaltime | number(38, 0) |
| 15 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 16 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |