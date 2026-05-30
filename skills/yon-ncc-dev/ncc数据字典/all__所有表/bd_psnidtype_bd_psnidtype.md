# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7041.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_identitype | pk_identitype | pk_identitype | char(20) | √ |
| 2 | code | code | code | varchar2(40) | √ |
| 3 | country | country | country | varchar2(20) |  |  | '~' |
| 4 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |  |  | 0 |
| 5 | datatype | datatype | datatype | number(38, 0) |
| 6 | description | description | description | varchar2(200) |
| 7 | enablestate | enablestate | enablestate | number(38, 0) | √ |  | 2 |
| 8 | idtypelength | idtypelength | idtypelength | number(38, 0) |
| 9 | idtypevalidat | idtypevalidat | idtypevalidat | varchar2(200) |
| 10 | name | name | name | varchar2(300) | √ |
| 11 | name2 | name2 | name2 | varchar2(300) |
| 12 | name3 | name3 | name3 | varchar2(300) |
| 13 | name4 | name4 | name4 | varchar2(300) |
| 14 | name5 | name5 | name5 | varchar2(300) |
| 15 | name6 | name6 | name6 | varchar2(300) |
| 16 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 17 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 18 | regex | regex | regex | varchar2(200) |
| 19 | creationtime | creationtime | creationtime | char(19) |
| 20 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 21 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 22 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 23 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 24 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |