# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9654.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | char(20) | √ |
| 2 | appcode | appcode | appcode | varchar2(50) | √ |
| 3 | condition | condition | condition | blob |
| 4 | createtime | createtime | createtime | char(19) | √ |
| 5 | jobguid | jobguid | jobguid | char(23) | √ |
| 6 | jobstatus | jobstatus | jobstatus | number(38, 0) | √ |
| 7 | receivers | receivers | receivers | blob |
| 8 | reportid | reportid | reportid | char(20) | √ |
| 9 | subject | subject | subject | varchar2(300) |
| 10 | userid | userid | userid | char(20) | √ |
| 11 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 12 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |