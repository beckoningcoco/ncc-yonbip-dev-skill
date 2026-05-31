# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9822.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(50) | √ |
| 2 | versiontype | versiontype | versiontype | number(38, 0) | √ |
| 3 | authorizable | authorizable | authorizable | char(1) |
| 4 | createtime | createtime | createtime | char(19) |
| 5 | datatypestyle | datatypestyle | datatypestyle | number(38, 0) | √ |
| 6 | defclassname | defclassname | defclassname | varchar2(50) |
| 7 | description | description | description | varchar2(512) |
| 8 | displayname | displayname | displayname | varchar2(90) |
| 9 | forbusinessentity | forbusinessentity | forbusinessentity | char(1) | √ |
| 10 | help | help | help | varchar2(1024) |
| 11 | isaggvoreturn | isaggvoreturn | isaggvoreturn | char(1) |
| 12 | isbusiactivity | isbusiactivity | isbusiactivity | char(1) |
| 13 | methodexception | methodexception | methodexception | varchar2(50) |
| 14 | modifytime | modifytime | modifytime | char(19) |
| 15 | name | name | name | varchar2(50) | √ |
| 16 | ownerelementid | ownerelementid | ownerelementid | varchar2(50) | √ |
| 17 | resid | resid | resid | varchar2(50) |
| 18 | returntype | returntype | returntype | varchar2(50) |
| 19 | tansactiontype | tansactiontype | tansactiontype | number(38, 0) | √ |
| 20 | visibility | visibility | visibility | number(38, 0) |
| 21 | creator | creator | creator | varchar2(30) |
| 22 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 23 | modifier | modifier | modifier | varchar2(30) |
| 24 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |