# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6885.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_dimension | pk_dimension | pk_dimension | char(20) | √ |
| 2 | defaultmember | defaultmember | defaultmember | varchar2(20) |
| 3 | dftmembername | dftmembername | dftmembername | varchar2(50) |
| 4 | dimcode | dimcode | dimcode | varchar2(50) |
| 5 | dimorder | dimorder | dimorder | number(38, 0) |
| 6 | dimtype | dimtype | dimtype | varchar2(50) |
| 7 | displayname | displayname | displayname | varchar2(50) |
| 8 | id | id | id | varchar2(50) |
| 9 | isdeafault | isdeafault | isdeafault | char(1) |
| 10 | isdefdoc | isdefdoc | isdefdoc | char(1) |
| 11 | isreclassify | isreclassify | isreclassify | char(1) |
| 12 | metadataid | metadataid | metadataid | varchar2(50) |
| 13 | modulecode | modulecode | modulecode | varchar2(50) |
| 14 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 15 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 16 | pk_scheme | pk_scheme | pk_scheme | varchar2(20) |  |  | '~' |
| 17 | smartmodelpk | smartmodelpk | smartmodelpk | varchar2(20) |
| 18 | type_dir_order | type_dir_order | type_dir_order | number(38, 0) |
| 19 | type_name | type_name | type_name | varchar2(50) |
| 20 | creationtime | creationtime | creationtime | char(19) |
| 21 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 22 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 23 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 24 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 25 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |