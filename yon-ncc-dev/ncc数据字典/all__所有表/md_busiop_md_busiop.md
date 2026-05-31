# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9810.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(50) | √ |
| 2 | industry | industry | industry | varchar2(50) | √ |
| 3 | versiontype | versiontype | versiontype | number(38, 0) | √ |
| 4 | authorizable | authorizable | authorizable | char(1) |
| 5 | componentid | componentid | componentid | varchar2(50) | √ |
| 6 | createtime | createtime | createtime | char(19) |
| 7 | description | description | description | varchar2(512) |
| 8 | displayname | displayname | displayname | varchar2(90) |
| 9 | help | help | help | varchar2(1024) |
| 10 | isbusiactivity | isbusiactivity | isbusiactivity | char(1) |
| 11 | logtype | logtype | logtype | char(10) |
| 12 | modifytime | modifytime | modifytime | char(19) |
| 13 | name | name | name | varchar2(50) | √ |
| 14 | needlog | needlog | needlog | char(1) |
| 15 | ownertype | ownertype | ownertype | varchar2(50) |
| 16 | parentid | parentid | parentid | varchar2(50) |
| 17 | resid | resid | resid | varchar2(90) |
| 18 | creator | creator | creator | varchar2(30) |
| 19 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 20 | modifier | modifier | modifier | varchar2(30) |
| 21 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |