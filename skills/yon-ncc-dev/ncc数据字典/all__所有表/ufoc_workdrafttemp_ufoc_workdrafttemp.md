# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12361.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_workdrafttemp | pk_workdrafttemp | pk_workdrafttemp | char(20) | √ |
| 2 | code | code | code | varchar2(40) |
| 3 | dataorigin | dataorigin | dataorigin | varchar2(50) |
| 4 | dxshowtype | dxshowtype | dxshowtype | number(38, 0) |  |  | 1 |
| 5 | innertype | innertype | innertype | number(38, 0) |  |  | 1 |
| 6 | isshowascolumn | isshowascolumn | isshowascolumn | char(1) |
| 7 | isshowasrow | isshowasrow | isshowasrow | char(1) |
| 8 | name | name | name | varchar2(300) |
| 9 | name2 | name2 | name2 | varchar2(300) |
| 10 | name3 | name3 | name3 | varchar2(300) |
| 11 | name4 | name4 | name4 | varchar2(300) |
| 12 | name5 | name5 | name5 | varchar2(300) |
| 13 | name6 | name6 | name6 | varchar2(300) |
| 14 | note | note | note | varchar2(1024) |
| 15 | pk_group | pk_group | pk_group | char(20) |  |  | '~' |
| 16 | pk_keygroup | pk_keygroup | pk_keygroup | varchar2(20) |  |  | '~' |
| 17 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 18 | pk_report | pk_report | pk_report | char(20) |  |  | '~' |
| 19 | unitshowtype | unitshowtype | unitshowtype | number(38, 0) |  |  | 2 |
| 20 | creationtime | creationtime | creationtime | char(19) |
| 21 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 22 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 23 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 24 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 25 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |