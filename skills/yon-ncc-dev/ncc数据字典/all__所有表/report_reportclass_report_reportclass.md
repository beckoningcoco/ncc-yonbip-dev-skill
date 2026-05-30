# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11132.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_reportclass | pk_reportclass | pk_reportclass | char(20) | √ |
| 2 | domain | domain | domain | varchar2(50) |
| 3 | ispreset | ispreset | ispreset | char(1) |
| 4 | moduleid | moduleid | moduleid | varchar2(50) |
| 5 | name | name | name | varchar2(200) |
| 6 | name2 | name2 | name2 | varchar2(200) |
| 7 | name3 | name3 | name3 | varchar2(200) |
| 8 | name4 | name4 | name4 | varchar2(200) |
| 9 | name5 | name5 | name5 | varchar2(200) |
| 10 | name6 | name6 | name6 | varchar2(200) |
| 11 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 12 | pk_parent | pk_parent | pk_parent | char(20) |
| 13 | preclass | preclass | preclass | varchar2(20) |  |  | '~' |
| 14 | sequence | sequence | sequence | varchar2(50) |
| 15 | type | type | type | varchar2(50) |
| 16 | creationtime | creationtime | creationtime | char(19) |
| 17 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 18 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 19 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 20 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 21 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |