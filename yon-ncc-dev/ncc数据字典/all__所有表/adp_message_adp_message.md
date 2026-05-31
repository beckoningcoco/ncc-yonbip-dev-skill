# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6420.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | msgpk | msgpk | msgpk | char(20) | √ |
| 2 | actioncode | actioncode | actioncode | varchar2(50) |
| 3 | createdtime | createdtime | createdtime | char(19) |
| 4 | creationtype | creationtype | creationtype | number(38, 0) |
| 5 | fromsystem | fromsystem | fromsystem | varchar2(50) |
| 6 | msgtype | msgtype | msgtype | number(38, 0) |
| 7 | msguuid | msguuid | msguuid | varchar2(50) |
| 8 | orig | orig | orig | varchar2(50) |
| 9 | proccount | proccount | proccount | number(38, 0) |
| 10 | procstatus | procstatus | procstatus | number(38, 0) |
| 11 | proctime | proctime | proctime | char(19) |
| 12 | relatingmsg | relatingmsg | relatingmsg | varchar2(50) |
| 13 | signature | signature | signature | varchar2(200) |
| 14 | storepath | storepath | storepath | varchar2(1000) |
| 15 | tosystem | tosystem | tosystem | varchar2(50) |
| 16 | tranferid | tranferid | tranferid | varchar2(50) |
| 17 | version | version | version | varchar2(50) |
| 18 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 19 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |