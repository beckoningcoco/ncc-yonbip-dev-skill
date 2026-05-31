# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11825.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_knowledge | pk_knowledge | pk_knowledge | char(20) | √ |
| 2 | billno | billno | billno | varchar2(20) |
| 3 | billtypecode | billtypecode | billtypecode | varchar2(20) |
| 4 | classify | classify | classify | varchar2(20) |  |  | '~' |
| 5 | classify_name | classify_name | classify_name | varchar2(50) |
| 6 | content | content | content | varchar2(2000) |
| 7 | keyword | keyword | keyword | varchar2(50) |
| 8 | modifytime | modifytime | modifytime | char(19) |
| 9 | pk_billtype | pk_billtype | pk_billtype | varchar2(20) |
| 10 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 11 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 12 | pk_tradetype | pk_tradetype | pk_tradetype | varchar2(20) |
| 13 | poststatus | poststatus | poststatus | number(38, 0) |
| 14 | title | title | title | varchar2(100) |
| 15 | tradetypecode | tradetypecode | tradetypecode | varchar2(20) |
| 16 | creationtime | creationtime | creationtime | char(19) |
| 17 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 18 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 19 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 20 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |