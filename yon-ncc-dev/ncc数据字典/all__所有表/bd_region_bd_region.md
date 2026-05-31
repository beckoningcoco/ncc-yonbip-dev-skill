# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7057.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_region | pk_region | pk_region | char(20) | √ |
| 2 | code | code | code | varchar2(40) | √ |
| 3 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |  |  | 0 |
| 4 | enablestate | enablestate | enablestate | number(38, 0) |  |  | 2 |
| 5 | innercode | innercode | innercode | varchar2(200) |
| 6 | isvisible | isvisible | isvisible | number(38, 0) |
| 7 | memcode | memcode | memcode | varchar2(50) |
| 8 | name | name | name | varchar2(300) | √ |
| 9 | name2 | name2 | name2 | varchar2(300) |
| 10 | name3 | name3 | name3 | varchar2(300) |
| 11 | name4 | name4 | name4 | varchar2(300) |
| 12 | name5 | name5 | name5 | varchar2(300) |
| 13 | name6 | name6 | name6 | varchar2(300) |
| 14 | pk_country | pk_country | pk_country | varchar2(20) |  |  | '~' |
| 15 | pk_father | pk_father | pk_father | varchar2(20) |  |  | '~' |
| 16 | pk_format | pk_format | pk_format | varchar2(20) |  |  | '~' |
| 17 | pk_group | pk_group | pk_group | char(20) | √ |
| 18 | pk_lang | pk_lang | pk_lang | varchar2(20) |  |  | '~' |
| 19 | pk_org | pk_org | pk_org | char(20) | √ |
| 20 | pk_timezone | pk_timezone | pk_timezone | varchar2(20) |  |  | '~' |
| 21 | shortname | shortname | shortname | varchar2(300) |
| 22 | shortname2 | shortname2 | shortname2 | varchar2(300) |
| 23 | shortname3 | shortname3 | shortname3 | varchar2(300) |
| 24 | shortname4 | shortname4 | shortname4 | varchar2(300) |
| 25 | shortname5 | shortname5 | shortname5 | varchar2(300) |
| 26 | shortname6 | shortname6 | shortname6 | varchar2(300) |
| 27 | zipcode | zipcode | zipcode | varchar2(50) |
| 28 | creationtime | creationtime | creationtime | char(19) |
| 29 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 30 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 31 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 32 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 33 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |