# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9834.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(50) | √ |
| 2 | versiontype | versiontype | versiontype | number(38, 0) | √ |
| 3 | createtime | createtime | createtime | char(19) |
| 4 | databaseid | databaseid | databaseid | varchar2(50) |
| 5 | description | description | description | varchar2(512) |
| 6 | displayname | displayname | displayname | varchar2(90) |
| 7 | help | help | help | varchar2(1024) |
| 8 | isactive | isactive | isactive | char(1) |
| 9 | modifytime | modifytime | modifytime | char(19) |
| 10 | name | name | name | varchar2(50) | √ |
| 11 | resid | resid | resid | varchar2(90) |
| 12 | creator | creator | creator | varchar2(30) |
| 13 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 14 | modifier | modifier | modifier | varchar2(30) |
| 15 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |