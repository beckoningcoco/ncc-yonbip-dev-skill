# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7096.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_supupgrade | pk_supupgrade | pk_supupgrade | char(20) | √ |
| 2 | destcode | destcode | destcode | varchar2(40) |
| 3 | destname | destname | destname | varchar2(300) |
| 4 | destname2 | destname2 | destname2 | varchar2(300) |
| 5 | destname3 | destname3 | destname3 | varchar2(300) |
| 6 | destname4 | destname4 | destname4 | varchar2(300) |
| 7 | destname5 | destname5 | destname5 | varchar2(300) |
| 8 | destname6 | destname6 | destname6 | varchar2(300) |
| 9 | destorg | destorg | destorg | varchar2(20) |  |  | '~' |
| 10 | destsup | destsup | destsup | varchar2(20) |  |  | '~' |
| 11 | operationdate | operationdate | operationdate | char(19) |
| 12 | operator | operator | operator | varchar2(20) |  |  | '~' |
| 13 | sourceorg | sourceorg | sourceorg | varchar2(20) |  |  | '~' |
| 14 | sourcesup | sourcesup | sourcesup | blob |
| 15 | sourcesupcode | sourcesupcode | sourcesupcode | varchar2(40) |
| 16 | sourcesupname | sourcesupname | sourcesupname | varchar2(300) |
| 17 | sourcesupname2 | sourcesupname2 | sourcesupname2 | varchar2(300) |
| 18 | sourcesupname3 | sourcesupname3 | sourcesupname3 | varchar2(300) |
| 19 | sourcesupname4 | sourcesupname4 | sourcesupname4 | varchar2(300) |
| 20 | sourcesupname5 | sourcesupname5 | sourcesupname5 | varchar2(300) |
| 21 | sourcesupname6 | sourcesupname6 | sourcesupname6 | varchar2(300) |
| 22 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 23 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |