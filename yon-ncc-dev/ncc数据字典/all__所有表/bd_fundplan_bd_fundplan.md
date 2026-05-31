# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6940.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_fundplan | pk_fundplan | pk_fundplan | char(20) | √ |
| 2 | code | code | code | varchar2(40) | √ |
| 3 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |
| 4 | enablestate | enablestate | enablestate | number(38, 0) |  |  | 2 |
| 5 | innercode | innercode | innercode | varchar2(200) |
| 6 | inoutdirect | inoutdirect | inoutdirect | number(38, 0) | √ |  | 0 |
| 7 | isused | isused | isused | char(1) |
| 8 | memo | memo | memo | varchar2(300) |
| 9 | mnecode | mnecode | mnecode | varchar2(50) |
| 10 | name | name | name | varchar2(300) | √ |
| 11 | name2 | name2 | name2 | varchar2(300) |
| 12 | name3 | name3 | name3 | varchar2(300) |
| 13 | name4 | name4 | name4 | varchar2(300) |
| 14 | name5 | name5 | name5 | varchar2(300) |
| 15 | name6 | name6 | name6 | varchar2(300) |
| 16 | pk_cashflow | pk_cashflow | pk_cashflow | varchar2(20) |  |  | '~' |
| 17 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 18 | pk_org | pk_org | pk_org | char(20) | √ |
| 19 | pk_parent | pk_parent | pk_parent | varchar2(20) |  |  | '~' |
| 20 | pri | pri | pri | number(38, 0) |  |  | 1 |
| 21 | seq | seq | seq | varchar2(20) |
| 22 | def1 | def1 | def1 | varchar2(101) |
| 23 | def2 | def2 | def2 | varchar2(101) |
| 24 | def3 | def3 | def3 | varchar2(101) |
| 25 | def4 | def4 | def4 | varchar2(101) |
| 26 | def5 | def5 | def5 | varchar2(101) |
| 27 | creationtime | creationtime | creationtime | char(19) |
| 28 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 29 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 30 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 31 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 32 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |