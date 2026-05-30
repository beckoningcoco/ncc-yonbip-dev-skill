# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7714.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_sysattribute | pk_sysattribute | pk_sysattribute | char(20) | √ |
| 2 | category | category | category | varchar2(20) |  |  | '~' |
| 3 | defaultvalue | defaultvalue | defaultvalue | varchar2(50) |
| 4 | displayname | displayname | displayname | varchar2(300) |
| 5 | displayname2 | displayname2 | displayname2 | varchar2(300) |
| 6 | displayname3 | displayname3 | displayname3 | varchar2(300) |
| 7 | displayname4 | displayname4 | displayname4 | varchar2(300) |
| 8 | displayname5 | displayname5 | displayname5 | varchar2(300) |
| 9 | displayname6 | displayname6 | displayname6 | varchar2(300) |
| 10 | isprimarykey | isprimarykey | isprimarykey | char(1) |
| 11 | issysattr | issysattr | issysattr | char(1) |
| 12 | isvisible | isvisible | isvisible | char(1) |
| 13 | length | length | length | varchar2(50) |
| 14 | name | name | name | varchar2(50) |
| 15 | nullable | nullable | nullable | char(1) |
| 16 | orderid | orderid | orderid | number(38, 0) |
| 17 | precise | precise | precise | number(38, 0) |
| 18 | readonly | readonly | readonly | char(1) |
| 19 | refname | refname | refname | varchar2(50) |
| 20 | type | type | type | varchar2(50) |  |  | '~' |
| 21 | type_style | type_style | type_style | varchar2(50) |
| 22 | visibleoncard | visibleoncard | visibleoncard | char(1) |
| 23 | visibleongrid | visibleongrid | visibleongrid | char(1) |
| 24 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 25 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |