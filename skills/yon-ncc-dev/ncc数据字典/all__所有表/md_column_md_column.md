# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9813.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(50) | √ |
| 2 | columnlength | columnlength | columnlength | number(38, 0) |
| 3 | columnsequence | columnsequence | columnsequence | number(38, 0) |
| 4 | columntype | columntype | columntype | number(38, 0) |
| 5 | createtime | createtime | createtime | char(19) |
| 6 | defaultvalue | defaultvalue | defaultvalue | varchar2(512) |
| 7 | description | description | description | varchar2(512) |
| 8 | displayname | displayname | displayname | varchar2(90) |
| 9 | forlocale | forlocale | forlocale | char(1) |
| 10 | groupid | groupid | groupid | varchar2(50) |
| 11 | help | help | help | varchar2(1024) |
| 12 | identitied | identitied | identitied | char(1) |
| 13 | incrementseed | incrementseed | incrementseed | number(38, 0) |
| 14 | incrementstep | incrementstep | incrementstep | number(38, 0) |
| 15 | isactive | isactive | isactive | char(1) |
| 16 | modifytime | modifytime | modifytime | char(19) |
| 17 | name | name | name | varchar2(50) | √ |
| 18 | nullable | nullable | nullable | char(1) |
| 19 | pkey | pkey | pkey | char(1) |
| 20 | precise | precise | precise | number(38, 0) |
| 21 | resid | resid | resid | varchar2(90) |
| 22 | sqldatetype | sqldatetype | sqldatetype | varchar2(50) |
| 23 | tableid | tableid | tableid | varchar2(50) |
| 24 | versiontype | versiontype | versiontype | number(38, 0) | √ |
| 25 | creator | creator | creator | varchar2(30) |
| 26 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 27 | modifier | modifier | modifier | varchar2(30) |
| 28 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |