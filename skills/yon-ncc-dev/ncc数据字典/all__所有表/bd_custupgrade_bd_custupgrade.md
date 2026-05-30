# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6860.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_custupgrade | pk_custupgrade | pk_custupgrade | char(20) | √ |
| 2 | destcode | destcode | destcode | varchar2(40) |
| 3 | destcust | destcust | destcust | varchar2(20) |  |  | '~' |
| 4 | destname | destname | destname | varchar2(300) |
| 5 | destname2 | destname2 | destname2 | varchar2(300) |
| 6 | destname3 | destname3 | destname3 | varchar2(300) |
| 7 | destname4 | destname4 | destname4 | varchar2(300) |
| 8 | destname5 | destname5 | destname5 | varchar2(300) |
| 9 | destname6 | destname6 | destname6 | varchar2(300) |
| 10 | destorg | destorg | destorg | varchar2(20) |  |  | '~' |
| 11 | operationdate | operationdate | operationdate | char(19) |
| 12 | operator | operator | operator | varchar2(20) |  |  | '~' |
| 13 | sourcecode | sourcecode | sourcecode | varchar2(40) |
| 14 | sourcecust | sourcecust | sourcecust | blob |
| 15 | sourcename | sourcename | sourcename | varchar2(300) |
| 16 | sourcename2 | sourcename2 | sourcename2 | varchar2(300) |
| 17 | sourcename3 | sourcename3 | sourcename3 | varchar2(300) |
| 18 | sourcename4 | sourcename4 | sourcename4 | varchar2(300) |
| 19 | sourcename5 | sourcename5 | sourcename5 | varchar2(300) |
| 20 | sourcename6 | sourcename6 | sourcename6 | varchar2(300) |
| 21 | sourceorg | sourceorg | sourceorg | varchar2(20) |  |  | '~' |
| 22 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 23 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |