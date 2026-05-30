# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7089.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_supqualidoc | pk_supqualidoc | pk_supqualidoc | char(20) | √ |
| 2 | code | code | code | varchar2(40) | √ |
| 3 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |
| 4 | enablestate | enablestate | enablestate | number(38, 0) |
| 5 | memo | memo | memo | varchar2(200) |
| 6 | name | name | name | varchar2(300) | √ |
| 7 | name2 | name2 | name2 | varchar2(300) |
| 8 | name3 | name3 | name3 | varchar2(300) |
| 9 | name4 | name4 | name4 | varchar2(300) |
| 10 | name5 | name5 | name5 | varchar2(300) |
| 11 | name6 | name6 | name6 | varchar2(300) |
| 12 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 13 | pk_org | pk_org | pk_org | varchar2(20) | √ |
| 14 | pk_qualitype | pk_qualitype | pk_qualitype | varchar2(20) | √ |
| 15 | def1 | def1 | def1 | varchar2(101) |
| 16 | def2 | def2 | def2 | varchar2(101) |
| 17 | def3 | def3 | def3 | varchar2(101) |
| 18 | def4 | def4 | def4 | varchar2(101) |
| 19 | def5 | def5 | def5 | varchar2(101) |
| 20 | def6 | def6 | def6 | varchar2(101) |
| 21 | def7 | def7 | def7 | varchar2(101) |
| 22 | def8 | def8 | def8 | varchar2(101) |
| 23 | def9 | def9 | def9 | varchar2(101) |
| 24 | def10 | def10 | def10 | varchar2(101) |
| 25 | creationtime | creationtime | creationtime | char(19) |
| 26 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 27 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 28 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 29 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 30 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |