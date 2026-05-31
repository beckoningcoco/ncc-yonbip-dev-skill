# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10565.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_contracttype | pk_contracttype | pk_contracttype | char(20) | √ |
| 2 | enablegetmaterial | enablegetmaterial | enablegetmaterial | char(1) |
| 3 | enablestate | enablestate | enablestate | number(38, 0) |
| 4 | innercode | innercode | innercode | varchar2(50) |
| 5 | memo | memo | memo | varchar2(200) |
| 6 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 7 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 8 | pk_parent | pk_parent | pk_parent | varchar2(20) |  |  | '~' |
| 9 | type_code | type_code | type_code | varchar2(40) |
| 10 | type_name | type_name | type_name | varchar2(300) |
| 11 | type_name2 | type_name2 | type_name2 | varchar2(300) |
| 12 | type_name3 | type_name3 | type_name3 | varchar2(300) |
| 13 | type_name4 | type_name4 | type_name4 | varchar2(300) |
| 14 | type_name5 | type_name5 | type_name5 | varchar2(300) |
| 15 | type_name6 | type_name6 | type_name6 | varchar2(300) |
| 16 | def1 | def1 | def1 | varchar2(101) |
| 17 | def2 | def2 | def2 | varchar2(101) |
| 18 | def3 | def3 | def3 | varchar2(101) |
| 19 | def4 | def4 | def4 | varchar2(101) |
| 20 | def5 | def5 | def5 | varchar2(101) |
| 21 | def6 | def6 | def6 | varchar2(101) |
| 22 | def7 | def7 | def7 | varchar2(101) |
| 23 | def8 | def8 | def8 | varchar2(101) |
| 24 | def9 | def9 | def9 | varchar2(101) |
| 25 | def10 | def10 | def10 | varchar2(101) |
| 26 | creationtime | creationtime | creationtime | char(19) |
| 27 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 28 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 29 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 30 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 31 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |