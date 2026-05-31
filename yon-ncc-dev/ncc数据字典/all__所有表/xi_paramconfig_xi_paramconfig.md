# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/13036.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_paramconfig | pk_paramconfig | pk_paramconfig | varchar2(20) | √ |
| 2 | addresses | addresses | addresses | varchar2(50) |
| 3 | bigfiletransmission | bigfiletransmission | bigfiletransmission | varchar2(1) |
| 4 | dealrule | dealrule | dealrule | varchar2(50) |
| 5 | defaultaccount | defaultaccount | defaultaccount | varchar2(50) |
| 6 | enablejms | enablejms | enablejms | varchar2(50) |
| 7 | isbackupresponses | isbackupresponses | isbackupresponses | varchar2(1) |
| 8 | iseffective | iseffective | iseffective | varchar2(1) |
| 9 | iswritemiddlefile | iswritemiddlefile | iswritemiddlefile | varchar2(1) |
| 10 | jmsmaxreconnect | jmsmaxreconnect | jmsmaxreconnect | varchar2(50) |
| 11 | jmsreceiveq | jmsreceiveq | jmsreceiveq | varchar2(50) |
| 12 | jmsserverurl | jmsserverurl | jmsserverurl | varchar2(50) |
| 13 | maxaamlevel | maxaamlevel | maxaamlevel | varchar2(50) |
| 14 | maxthreadnumber | maxthreadnumber | maxthreadnumber | varchar2(50) |
| 15 | maxtransfersize | maxtransfersize | maxtransfersize | varchar2(50) |
| 16 | outputencoding | outputencoding | outputencoding | varchar2(50) |
| 17 | recordinputstream | recordinputstream | recordinputstream | varchar2(1) |
| 18 | reservetranstempfile | reservetranstempfile | reservetranstempfile | varchar2(1) |
| 19 | threadpoolqueuesize | threadpoolqueuesize | threadpoolqueuesize | varchar2(6) |
| 20 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 21 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |