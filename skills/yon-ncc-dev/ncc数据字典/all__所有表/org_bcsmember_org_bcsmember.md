# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10164.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_bcsmember | pk_bcsmember | pk_bcsmember | char(20) | √ |
| 2 | code | code | code | varchar2(50) |
| 3 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |
| 4 | idx | idx | idx | number(38, 0) |
| 5 | innercode | innercode | innercode | varchar2(50) |
| 6 | islastversion | islastversion | islastversion | char(1) |
| 7 | name | name | name | varchar2(300) |
| 8 | name2 | name2 | name2 | varchar2(300) |
| 9 | name3 | name3 | name3 | varchar2(300) |
| 10 | name4 | name4 | name4 | varchar2(300) |
| 11 | name5 | name5 | name5 | varchar2(300) |
| 12 | name6 | name6 | name6 | varchar2(300) |
| 13 | pk_bcs | pk_bcs | pk_bcs | varchar2(20) |  |  | '~' |
| 14 | pk_fathermember | pk_fathermember | pk_fathermember | varchar2(20) |  |  | '~' |
| 15 | pk_fatherorg | pk_fatherorg | pk_fatherorg | varchar2(20) |  |  | '~' |
| 16 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 17 | pk_orgvid | pk_orgvid | pk_orgvid | varchar2(50) |  |  | '~' |
| 18 | pk_svid | pk_svid | pk_svid | varchar2(50) |  |  | '~' |
| 19 | pk_vid | pk_vid | pk_vid | varchar2(50) |  |  | '~' |
| 20 | venddate | venddate | venddate | char(19) |
| 21 | vname | vname | vname | varchar2(75) |
| 22 | vno | vno | vno | varchar2(50) |
| 23 | vstartdate | vstartdate | vstartdate | char(19) |
| 24 | creationtime | creationtime | creationtime | char(19) |
| 25 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 26 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 27 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 28 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 29 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |