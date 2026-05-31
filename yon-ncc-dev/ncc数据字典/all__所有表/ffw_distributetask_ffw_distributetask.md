# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8248.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_distributetask | pk_distributetask | pk_distributetask | char(20) | √ |
| 2 | agginsertcall | agginsertcall | agginsertcall | varchar2(500) |
| 3 | begintime | begintime | begintime | char(19) |
| 4 | busicallbackclass | busicallbackclass | busicallbackclass | varchar2(500) |
| 5 | busiexeclass | busiexeclass | busiexeclass | varchar2(500) |
| 6 | callbackobj | callbackobj | callbackobj | blob |
| 7 | clusterinfo | clusterinfo | clusterinfo | blob |
| 8 | ds | ds | ds | varchar2(200) |
| 9 | endtime | endtime | endtime | char(19) |
| 10 | execorder | execorder | execorder | number(38, 0) |
| 11 | execosttime | execosttime | execosttime | varchar2(50) |
| 12 | memo | memo | memo | varchar2(2000) |
| 13 | originatorip | originatorip | originatorip | varchar2(50) |
| 14 | ownmodule | ownmodule | ownmodule | varchar2(50) |
| 15 | pk_creator | pk_creator | pk_creator | varchar2(20) | √ |  | '~' |
| 16 | pk_group | pk_group | pk_group | varchar2(20) | √ |  | '~' |
| 17 | pk_tasktype | pk_tasktype | pk_tasktype | varchar2(20) | √ |
| 18 | subaftercallb | subaftercallb | subaftercallb | varchar2(500) |
| 19 | subbeforecall | subbeforecall | subbeforecall | varchar2(500) |
| 20 | taskname | taskname | taskname | varchar2(2000) |
| 21 | taskstatus | taskstatus | taskstatus | number(38, 0) |
| 22 | variableobj | variableobj | variableobj | blob |
| 23 | creationtime | creationtime | creationtime | char(19) | √ |
| 24 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 25 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |