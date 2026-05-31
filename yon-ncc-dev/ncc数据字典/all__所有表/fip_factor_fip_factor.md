# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8317.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_factor | pk_factor | pk_factor | varchar2(20) | √ |
| 2 | displaycode | displaycode | displaycode | varchar2(50) |
| 3 | displayformula | displayformula | displayformula | varchar2(400) |
| 4 | displayname | displayname | displayname | varchar2(300) | √ |
| 5 | displayname2 | displayname2 | displayname2 | varchar2(300) |
| 6 | displayname3 | displayname3 | displayname3 | varchar2(300) |
| 7 | displayname4 | displayname4 | displayname4 | varchar2(300) |
| 8 | displayname5 | displayname5 | displayname5 | varchar2(300) |
| 9 | displayname6 | displayname6 | displayname6 | varchar2(300) |
| 10 | displaytype | displaytype | displaytype | number(38, 0) |
| 11 | entityid | entityid | entityid | varchar2(36) | √ |
| 12 | indexid | indexid | indexid | number(38, 0) |
| 13 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 14 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 15 | pk_systypecode | pk_systypecode | pk_systypecode | varchar2(50) | √ |
| 16 | refmodelname | refmodelname | refmodelname | varchar2(101) |
| 17 | creationtime | creationtime | creationtime | char(19) |
| 18 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 19 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 20 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 21 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 22 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |