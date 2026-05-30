# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8873.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cbillid | cbillid | cbillid | char(20) | √ |
| 2 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 3 | caccountperiod | caccountperiod | caccountperiod | varchar2(7) |
| 4 | cdeptid | cdeptid | cdeptid | varchar2(20) |  |  | '~' |
| 5 | cdeptvid | cdeptvid | cdeptvid | varchar2(20) |  |  | '~' |
| 6 | cpsnid | cpsnid | cpsnid | varchar2(20) |  |  | '~' |
| 7 | dbilldate | dbilldate | dbilldate | char(19) |
| 8 | fstatusflag | fstatusflag | fstatusflag | number(38, 0) |
| 9 | iprintcount | iprintcount | iprintcount | number(38, 0) |
| 10 | operator | operator | operator | varchar2(20) |  |  | '~' |
| 11 | pk_book | pk_book | pk_book | varchar2(20) |  |  | '~' |
| 12 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 13 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 14 | taudittime | taudittime | taudittime | char(19) |
| 15 | tdmakedate | tdmakedate | tdmakedate | char(19) |
| 16 | vbillcode | vbillcode | vbillcode | varchar2(40) |
| 17 | vnote | vnote | vnote | varchar2(181) |
| 18 | creationtime | creationtime | creationtime | char(19) |
| 19 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 20 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 21 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 22 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 23 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |