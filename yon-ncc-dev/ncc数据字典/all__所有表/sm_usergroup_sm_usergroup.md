# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11650.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_usergroup | pk_usergroup | pk_usergroup | char(20) | √ |
| 2 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |
| 3 | groupcode | groupcode | groupcode | varchar2(200) |
| 4 | groupname | groupname | groupname | varchar2(300) |
| 5 | groupname2 | groupname2 | groupname2 | varchar2(300) |
| 6 | groupname3 | groupname3 | groupname3 | varchar2(300) |
| 7 | groupname4 | groupname4 | groupname4 | varchar2(300) |
| 8 | groupname5 | groupname5 | groupname5 | varchar2(300) |
| 9 | groupname6 | groupname6 | groupname6 | varchar2(300) |
| 10 | innercode | innercode | innercode | varchar2(200) |
| 11 | parentid | parentid | parentid | varchar2(20) |  |  | '~' |
| 12 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 13 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 14 | creationtime | creationtime | creationtime | char(19) |
| 15 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 16 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 17 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 18 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 19 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |