# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10162.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_associaterule | pk_associaterule | pk_associaterule | char(20) | √ |
| 2 | comp | comp | comp | varchar2(50) |
| 3 | multiplicity | multiplicity | multiplicity | number(38, 0) | √ |  | 1 |
| 4 | pk_relationtype | pk_relationtype | pk_relationtype | char(20) | √ |
| 5 | priority | priority | priority | number(38, 0) |
| 6 | sourceentity | sourceentity | sourceentity | varchar2(36) | √ |  | '~' |
| 7 | sourceentityname | sourceentityname | sourceentityname | varchar2(75) |
| 8 | sourceentityname2 | sourceentityname2 | sourceentityname2 | varchar2(75) |
| 9 | sourceentityname3 | sourceentityname3 | sourceentityname3 | varchar2(75) |
| 10 | sourceentityname4 | sourceentityname4 | sourceentityname4 | varchar2(75) |
| 11 | sourceentityname5 | sourceentityname5 | sourceentityname5 | varchar2(75) |
| 12 | sourceentityname6 | sourceentityname6 | sourceentityname6 | varchar2(75) |
| 13 | sourcereftype | sourcereftype | sourcereftype | varchar2(150) |
| 14 | targetentity | targetentity | targetentity | varchar2(36) | √ |  | '~' |
| 15 | targetentityname | targetentityname | targetentityname | varchar2(75) |
| 16 | targetentityname2 | targetentityname2 | targetentityname2 | varchar2(75) |
| 17 | targetentityname3 | targetentityname3 | targetentityname3 | varchar2(75) |
| 18 | targetentityname4 | targetentityname4 | targetentityname4 | varchar2(75) |
| 19 | targetentityname5 | targetentityname5 | targetentityname5 | varchar2(75) |
| 20 | targetentityname6 | targetentityname6 | targetentityname6 | varchar2(75) |
| 21 | targetreftype | targetreftype | targetreftype | varchar2(150) |
| 22 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 23 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |