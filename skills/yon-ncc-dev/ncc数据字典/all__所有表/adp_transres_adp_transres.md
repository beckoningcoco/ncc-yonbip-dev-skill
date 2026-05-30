# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6439.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | transresid | transresid | transresid | char(20) | √ |
| 2 | ackstatus | ackstatus | ackstatus | number(38, 0) |
| 3 | createtime | createtime | createtime | char(19) |
| 4 | creationtype | creationtype | creationtype | number(38, 0) | √ |
| 5 | opuserid | opuserid | opuserid | varchar2(20) |  |  | '~' |
| 6 | procinfo | procinfo | procinfo | varchar2(400) |
| 7 | procresult | procresult | procresult | number(38, 0) |
| 8 | proctime | proctime | proctime | char(19) |
| 9 | receiverid | receiverid | receiverid | varchar2(20) | √ |  | '~' |
| 10 | restypeid | restypeid | restypeid | varchar2(20) | √ |  | '~' |
| 11 | senderid | senderid | senderid | varchar2(20) | √ |  | '~' |
| 12 | sendstatus | sendstatus | sendstatus | number(38, 0) |
| 13 | storestatus | storestatus | storestatus | number(38, 0) |
| 14 | storestatuschgtime | storestatuschgtime | storestatuschgtime | char(19) |
| 15 | taskexecid | taskexecid | taskexecid | varchar2(20) |  |  | '~' |
| 16 | taskexectime | taskexectime | taskexectime | char(19) |
| 17 | transactivitycode | transactivitycode | transactivitycode | varchar2(50) |
| 18 | transresourcecode | transresourcecode | transresourcecode | varchar2(50) | √ |
| 19 | transtaskid | transtaskid | transtaskid | varchar2(20) |  |  | '~' |
| 20 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 21 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |