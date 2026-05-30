# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7328.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | guid | guid | guid | varchar2(30) | √ |
| 2 | businessid | businessid | businessid | varchar2(200) |
| 3 | completetasknum | completetasknum | completetasknum | number(38, 0) |
| 4 | dsname | dsname | dsname | varchar2(100) |
| 5 | endtime | endtime | endtime | varchar2(30) |
| 6 | jobname | jobname | jobname | varchar2(200) |
| 7 | moduleid | moduleid | moduleid | varchar2(200) |
| 8 | note | note | note | varchar2(1024) |
| 9 | runlevel | runlevel | runlevel | number(38, 0) |
| 10 | runstate | runstate | runstate | number(38, 0) |
| 11 | starttime | starttime | starttime | varchar2(30) |
| 12 | tasknum | tasknum | tasknum | number(38, 0) |
| 13 | totaltime | totaltime | totaltime | number(38, 0) |
| 14 | userid | userid | userid | varchar2(50) |
| 15 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 16 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |