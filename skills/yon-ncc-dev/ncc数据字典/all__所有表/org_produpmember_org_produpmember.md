# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10272.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_prodmember | pk_prodmember | pk_prodmember | char(20) | √ |
| 2 | code | code | code | varchar2(50) |
| 3 | idx | idx | idx | number(38, 0) |
| 4 | innercode | innercode | innercode | varchar2(200) |
| 5 | name | name | name | varchar2(300) |
| 6 | name2 | name2 | name2 | varchar2(300) |
| 7 | name3 | name3 | name3 | varchar2(300) |
| 8 | name4 | name4 | name4 | varchar2(300) |
| 9 | name5 | name5 | name5 | varchar2(300) |
| 10 | name6 | name6 | name6 | varchar2(300) |
| 11 | pk_fathermember | pk_fathermember | pk_fathermember | varchar2(20) |  |  | '~' |
| 12 | pk_fatherorg | pk_fatherorg | pk_fatherorg | varchar2(20) |  |  | '~' |
| 13 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 14 | pk_prod | pk_prod | pk_prod | varchar2(20) |  |  | '~' |
| 15 | virtualorg | virtualorg | virtualorg | char(1) |
| 16 | creationtime | creationtime | creationtime | char(19) |
| 17 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 18 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 19 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 20 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 21 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |