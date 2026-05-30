# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10310.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_sssmember | pk_sssmember | pk_sssmember | char(20) | √ |
| 2 | code | code | code | varchar2(40) |
| 3 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |  |  | 0 |
| 4 | idx | idx | idx | number(38, 0) |
| 5 | innercode | innercode | innercode | varchar2(200) |
| 6 | mnecode | mnecode | mnecode | varchar2(75) |
| 7 | name | name | name | varchar2(300) |
| 8 | name2 | name2 | name2 | varchar2(300) |
| 9 | name3 | name3 | name3 | varchar2(300) |
| 10 | name4 | name4 | name4 | varchar2(300) |
| 11 | name5 | name5 | name5 | varchar2(300) |
| 12 | name6 | name6 | name6 | varchar2(300) |
| 13 | pk_fathermember | pk_fathermember | pk_fathermember | varchar2(20) |  |  | '~' |
| 14 | pk_fatherorg | pk_fatherorg | pk_fatherorg | varchar2(101) |
| 15 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 16 | pk_org | pk_org | pk_org | varchar2(101) |
| 17 | pk_sss | pk_sss | pk_sss | varchar2(20) |  |  | '~' |
| 18 | reltype | reltype | reltype | number(38, 0) | √ |
| 19 | shortname | shortname | shortname | varchar2(300) |
| 20 | shortname2 | shortname2 | shortname2 | varchar2(300) |
| 21 | shortname3 | shortname3 | shortname3 | varchar2(300) |
| 22 | shortname4 | shortname4 | shortname4 | varchar2(300) |
| 23 | shortname5 | shortname5 | shortname5 | varchar2(300) |
| 24 | shortname6 | shortname6 | shortname6 | varchar2(300) |
| 25 | creationtime | creationtime | creationtime | char(19) |
| 26 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 27 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 28 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 29 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 30 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |