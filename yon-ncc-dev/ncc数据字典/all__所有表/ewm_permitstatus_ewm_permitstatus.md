# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8014.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_permitstatus | pk_permitstatus | pk_permitstatus | char(20) | √ |
| 2 | enablestate | enablestate | enablestate | number(38, 0) |
| 3 | memo | memo | memo | varchar2(200) |
| 4 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 5 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 6 | statuscode | statuscode | statuscode | varchar2(40) |
| 7 | statusname | statusname | statusname | varchar2(120) |
| 8 | statusname2 | statusname2 | statusname2 | varchar2(120) |
| 9 | statusname3 | statusname3 | statusname3 | varchar2(120) |
| 10 | statusname4 | statusname4 | statusname4 | varchar2(120) |
| 11 | statusname5 | statusname5 | statusname5 | varchar2(120) |
| 12 | statusname6 | statusname6 | statusname6 | varchar2(120) |
| 13 | statustype | statustype | statustype | number(38, 0) |
| 14 | creationtime | creationtime | creationtime | char(19) |
| 15 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 16 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 17 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 18 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 19 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |