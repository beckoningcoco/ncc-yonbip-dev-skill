# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9656.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_mailrule | pk_mailrule | pk_mailrule | char(20) | √ |
| 2 | bulletintype | bulletintype | bulletintype | varchar2(50) |
| 3 | bybulletin | bybulletin | bybulletin | char(1) |
| 4 | bymail | bymail | bymail | char(1) |
| 5 | bymobile | bymobile | bymobile | char(1) |
| 6 | byreplibrary | byreplibrary | byreplibrary | char(1) |
| 7 | content | content | content | varchar2(500) |
| 8 | datatype | datatype | datatype | number(38, 0) |
| 9 | enddate | enddate | enddate | varchar2(19) |
| 10 | execuser | execuser | execuser | char(20) |
| 11 | filecompressed | filecompressed | filecompressed | char(1) |
| 12 | name | name | name | varchar2(300) |
| 13 | name2 | name2 | name2 | varchar2(300) |
| 14 | name3 | name3 | name3 | varchar2(300) |
| 15 | name4 | name4 | name4 | varchar2(300) |
| 16 | name5 | name5 | name5 | varchar2(300) |
| 17 | name6 | name6 | name6 | varchar2(300) |
| 18 | note | note | note | varchar2(128) |
| 19 | pk_accscheme | pk_accscheme | pk_accscheme | char(20) |
| 20 | pk_group | pk_group | pk_group | char(20) |
| 21 | pk_hbscheme | pk_hbscheme | pk_hbscheme | char(20) |
| 22 | pk_keygroup | pk_keygroup | pk_keygroup | char(20) | √ |
| 23 | pk_mailrulesort | pk_mailrulesort | pk_mailrulesort | char(20) | √ |
| 24 | pk_org | pk_org | pk_org | char(20) |
| 25 | pk_task | pk_task | pk_task | char(20) |
| 26 | reltype | reltype | reltype | varchar2(1) |
| 27 | rulecontent | rulecontent | rulecontent | blob |
| 28 | startdate | startdate | startdate | varchar2(19) |
| 29 | title | title | title | varchar2(128) |
| 30 | creationtime | creationtime | creationtime | char(19) |
| 31 | creator | creator | creator | char(20) |
| 32 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 33 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 34 | modifier | modifier | modifier | char(20) |
| 35 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |