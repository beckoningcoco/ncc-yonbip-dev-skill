# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6441.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | activityid | activityid | activityid | char(20) | √ |
| 2 | ackrequired | ackrequired | ackrequired | char(1) |
| 3 | activitytype | activitytype | activitytype | number(38, 0) |
| 4 | activityuuid | activityuuid | activityuuid | varchar2(50) |
| 5 | createtime | createtime | createtime | char(19) |
| 6 | receivercode | receivercode | receivercode | varchar2(50) |
| 7 | recstatus | recstatus | recstatus | number(38, 0) |
| 8 | sendercode | sendercode | sendercode | varchar2(50) |
| 9 | sendstatus | sendstatus | sendstatus | number(38, 0) |
| 10 | sessionid | sessionid | sessionid | varchar2(20) |  |  | '~' |
| 11 | sessionuuid | sessionuuid | sessionuuid | varchar2(50) |
| 12 | updatetime | updatetime | updatetime | char(19) |
| 13 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 14 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |