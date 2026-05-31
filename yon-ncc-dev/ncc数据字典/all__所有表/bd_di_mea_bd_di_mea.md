# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6886.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_measure | pk_measure | pk_measure | char(20) | √ |
| 2 | displayname | displayname | displayname | varchar2(50) |
| 3 | id | id | id | varchar2(50) |
| 4 | isstandard | isstandard | isstandard | char(1) |
| 5 | meaorder | meaorder | meaorder | number(38, 0) |
| 6 | measurecode | measurecode | measurecode | varchar2(50) |
| 7 | modulecode | modulecode | modulecode | varchar2(50) |
| 8 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 9 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 10 | pk_scheme | pk_scheme | pk_scheme | varchar2(50) |
| 11 | type_name | type_name | type_name | varchar2(50) |
| 12 | type_order | type_order | type_order | varchar2(50) |
| 13 | creationtime | creationtime | creationtime | char(19) |
| 14 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 15 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 16 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 17 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 18 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |