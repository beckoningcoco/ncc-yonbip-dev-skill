# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9823.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(50) | √ |
| 2 | industry | industry | industry | varchar2(50) | √ |
| 3 | versiontype | versiontype | versiontype | number(38, 0) | √ |
| 4 | authorizable | authorizable | authorizable | char(1) |
| 5 | componentid | componentid | componentid | varchar2(50) | √ |
| 6 | createtime | createtime | createtime | char(19) |
| 7 | defaultimplclassname | defaultimplclassname | defaultimplclassname | varchar2(256) |
| 8 | description | description | description | varchar2(512) |
| 9 | displayname | displayname | displayname | varchar2(90) |
| 10 | fullclassname | fullclassname | fullclassname | varchar2(256) |
| 11 | help | help | help | varchar2(1024) |
| 12 | implstrategy | implstrategy | implstrategy | varchar2(256) |
| 13 | isbusiactivity | isbusiactivity | isbusiactivity | char(1) |
| 14 | isbusioperation | isbusioperation | isbusioperation | char(1) |
| 15 | isservice | isservice | isservice | char(1) |
| 16 | modifytime | modifytime | modifytime | char(19) |
| 17 | name | name | name | varchar2(50) | √ |
| 18 | ownertype | ownertype | ownertype | varchar2(50) |
| 19 | parentid | parentid | parentid | varchar2(50) |
| 20 | remote | remote | remote | char(1) |
| 21 | resid | resid | resid | varchar2(90) |
| 22 | singleton | singleton | singleton | char(1) |
| 23 | visibility | visibility | visibility | number(38, 0) |
| 24 | creator | creator | creator | varchar2(30) |
| 25 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 26 | modifier | modifier | modifier | varchar2(30) |
| 27 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |