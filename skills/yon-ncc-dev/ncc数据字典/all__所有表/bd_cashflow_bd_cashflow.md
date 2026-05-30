# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6794.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cashflow | pk_cashflow | pk_cashflow | char(20) | √ |
| 2 | code | code | code | varchar2(40) | √ |
| 3 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |
| 4 | enablestate | enablestate | enablestate | number(38, 0) |
| 5 | innercode | innercode | innercode | varchar2(200) |
| 6 | ismain | ismain | ismain | char(1) |
| 7 | itemtype | itemtype | itemtype | number(38, 0) |
| 8 | memcode | memcode | memcode | varchar2(50) |
| 9 | name | name | name | varchar2(300) | √ |
| 10 | name2 | name2 | name2 | varchar2(300) |
| 11 | name3 | name3 | name3 | varchar2(300) |
| 12 | name4 | name4 | name4 | varchar2(300) |
| 13 | name5 | name5 | name5 | varchar2(300) |
| 14 | name6 | name6 | name6 | varchar2(300) |
| 15 | pk_group | pk_group | pk_group | varchar2(20) | √ |
| 16 | pk_org | pk_org | pk_org | varchar2(20) | √ |
| 17 | pk_parent | pk_parent | pk_parent | varchar2(20) |  |  | '~' |
| 18 | seq | seq | seq | varchar2(20) |
| 19 | creationtime | creationtime | creationtime | char(19) |
| 20 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 21 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 22 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 23 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 24 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |