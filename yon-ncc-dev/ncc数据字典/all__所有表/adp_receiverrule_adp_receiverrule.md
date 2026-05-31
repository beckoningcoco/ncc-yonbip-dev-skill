# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6423.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_receiverrule | pk_receiverrule | pk_receiverrule | char(20) | √ |
| 2 | receiverrelations | receiverrelations | receiverrelations | char(20) | √ |
| 3 | relationcode | relationcode | relationcode | varchar2(50) |
| 4 | relationendid | relationendid | relationendid | varchar2(20) |  |  | '~' |
| 5 | relationname | relationname | relationname | varchar2(300) |
| 6 | relationname2 | relationname2 | relationname2 | varchar2(300) |
| 7 | relationname3 | relationname3 | relationname3 | varchar2(300) |
| 8 | relationname4 | relationname4 | relationname4 | varchar2(300) |
| 9 | relationname5 | relationname5 | relationname5 | varchar2(300) |
| 10 | relationname6 | relationname6 | relationname6 | varchar2(300) |
| 11 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 12 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |