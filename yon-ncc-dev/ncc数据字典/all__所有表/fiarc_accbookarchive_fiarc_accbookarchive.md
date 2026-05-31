# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8253.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_accountarchive | pk_accountarchive | pk_accountarchive | char(20) | √ |
| 2 | archivedate | archivedate | archivedate | char(19) |
| 3 | archiveinterval | archiveinterval | archiveinterval | varchar2(50) |
| 4 | archiveperiod | archiveperiod | archiveperiod | varchar2(20) |  |  | '~' |
| 5 | archiver | archiver | archiver | varchar2(20) |  |  | '~' |
| 6 | archivetime | archivetime | archivetime | char(19) |
| 7 | code | code | code | varchar2(50) |
| 8 | name | name | name | varchar2(300) |
| 9 | pk_accountingbook | pk_accountingbook | pk_accountingbook | varchar2(20) |  |  | '~' |
| 10 | pk_report | pk_report | pk_report | varchar2(50) |
| 11 | receiptfile | receiptfile | receiptfile | varchar2(50) |
| 12 | receiptmessage | receiptmessage | receiptmessage | varchar2(1000) |
| 13 | reportcode | reportcode | reportcode | varchar2(50) |
| 14 | state | state | state | varchar2(50) |
| 15 | type | type | type | varchar2(50) |
| 16 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 17 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |