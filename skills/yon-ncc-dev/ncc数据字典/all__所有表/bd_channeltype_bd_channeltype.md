# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6800.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_type | pk_type | pk_type | char(20) | √ |
| 2 | code | code | code | varchar2(40) | √ |
| 3 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |
| 4 | enablestate | enablestate | enablestate | number(38, 0) |  |  | 2 |
| 5 | name | name | name | varchar2(300) | √ |
| 6 | name2 | name2 | name2 | varchar2(300) |
| 7 | name3 | name3 | name3 | varchar2(300) |
| 8 | name4 | name4 | name4 | varchar2(300) |
| 9 | name5 | name5 | name5 | varchar2(300) |
| 10 | name6 | name6 | name6 | varchar2(300) |
| 11 | pk_group | pk_group | pk_group | varchar2(20) | √ |
| 12 | pk_org | pk_org | pk_org | varchar2(20) | √ |
| 13 | def1 | def1 | def1 | varchar2(101) |
| 14 | def2 | def2 | def2 | varchar2(101) |
| 15 | def3 | def3 | def3 | varchar2(101) |
| 16 | def4 | def4 | def4 | varchar2(101) |
| 17 | def5 | def5 | def5 | varchar2(101) |
| 18 | creationtime | creationtime | creationtime | char(19) |
| 19 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 20 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 21 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 22 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 23 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |