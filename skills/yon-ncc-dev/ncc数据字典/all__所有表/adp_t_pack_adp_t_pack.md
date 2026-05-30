# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6442.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | packid | packid | packid | char(20) | √ |
| 2 | activityid | activityid | activityid | varchar2(20) |  |  | '~' |
| 3 | activityuuid | activityuuid | activityuuid | varchar2(50) |
| 4 | createtime | createtime | createtime | char(19) |
| 5 | msguuid | msguuid | msguuid | varchar2(50) |
| 6 | packname | packname | packname | varchar2(500) |
| 7 | packtype | packtype | packtype | number(38, 0) |
| 8 | packuuid | packuuid | packuuid | varchar2(50) |
| 9 | proccount | proccount | proccount | number(38, 0) |
| 10 | processorflag | processorflag | processorflag | number(38, 0) |
| 11 | procstatus | procstatus | procstatus | number(38, 0) |
| 12 | proctime | proctime | proctime | char(19) |
| 13 | storepath | storepath | storepath | varchar2(800) |
| 14 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 15 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |