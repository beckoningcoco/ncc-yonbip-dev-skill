# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7314.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | guid | guid | guid | char(20) | √ |
| 2 | assetindustry | assetindustry | assetindustry | varchar2(20) |  |  | '~' |
| 3 | assetlayer | assetlayer | assetlayer | varchar2(10) |  |  | '4' |
| 4 | columnindex | columnindex | columnindex | number(38, 0) |
| 5 | columnname | columnname | columnname | varchar2(50) |
| 6 | columnprecision | columnprecision | columnprecision | number(38, 0) |
| 7 | columnscale | columnscale | columnscale | number(38, 0) |
| 8 | datatype | datatype | datatype | varchar2(50) |
| 9 | dbcolumntype | dbcolumntype | dbcolumntype | number(38, 0) |
| 10 | defaultvalue | defaultvalue | defaultvalue | varchar2(50) |
| 11 | displayname | displayname | displayname | varchar2(300) |
| 12 | displayname2 | displayname2 | displayname2 | varchar2(300) |
| 13 | displayname3 | displayname3 | displayname3 | varchar2(300) |
| 14 | displayname4 | displayname4 | displayname4 | varchar2(300) |
| 15 | displayname5 | displayname5 | displayname5 | varchar2(300) |
| 16 | displayname6 | displayname6 | displayname6 | varchar2(300) |
| 17 | note | note | note | varchar2(768) |
| 18 | nullable | nullable | nullable | char(1) |
| 19 | pkey | pkey | pkey | char(1) |
| 20 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 21 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 22 | tableguid | tableguid | tableguid | varchar2(50) |
| 23 | creationtime | creationtime | creationtime | char(19) |
| 24 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 25 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 26 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 27 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 28 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |