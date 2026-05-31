# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6409.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_asset | pk_asset | pk_asset | char(20) | √ |
| 2 | assetcode | assetcode | assetcode | varchar2(50) | √ |
| 3 | assetdesc | assetdesc | assetdesc | varchar2(1024) |
| 4 | assetlayer | assetlayer | assetlayer | varchar2(50) | √ |
| 5 | assetname | assetname | assetname | varchar2(300) | √ |
| 6 | assetname2 | assetname2 | assetname2 | varchar2(300) |
| 7 | assetname3 | assetname3 | assetname3 | varchar2(300) |
| 8 | assetname4 | assetname4 | assetname4 | varchar2(300) |
| 9 | assetname5 | assetname5 | assetname5 | varchar2(300) |
| 10 | assetname6 | assetname6 | assetname6 | varchar2(300) |
| 11 | dataid | dataid | dataid | varchar2(50) | √ |
| 12 | dataidname | dataidname | dataidname | varchar2(300) |
| 13 | dataidname2 | dataidname2 | dataidname2 | varchar2(300) |
| 14 | dataidname3 | dataidname3 | dataidname3 | varchar2(300) |
| 15 | dataidname4 | dataidname4 | dataidname4 | varchar2(300) |
| 16 | dataidname5 | dataidname5 | dataidname5 | varchar2(300) |
| 17 | dataidname6 | dataidname6 | dataidname6 | varchar2(300) |
| 18 | isvalid | isvalid | isvalid | varchar2(50) | √ |
| 19 | pk_aamindustry | pk_aamindustry | pk_aamindustry | varchar2(50) |  |  | '~' |
| 20 | pk_assettype | pk_assettype | pk_assettype | char(20) | √ |
| 21 | pk_countryzone | pk_countryzone | pk_countryzone | varchar2(20) |  |  | '~' |
| 22 | pk_developer | pk_developer | pk_developer | varchar2(20) |  |  | '~' |
| 23 | pk_developorg | pk_developorg | pk_developorg | varchar2(20) |  |  | '~' |
| 24 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 25 | pk_industry | pk_industry | pk_industry | varchar2(20) |  |  | '~' |
| 26 | pk_module | pk_module | pk_module | varchar2(20) |  |  | '~' |
| 27 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 28 | def1 | def1 | def1 | varchar2(1024) |
| 29 | def2 | def2 | def2 | varchar2(50) |
| 30 | def3 | def3 | def3 | varchar2(50) |
| 31 | def4 | def4 | def4 | varchar2(50) |
| 32 | def5 | def5 | def5 | varchar2(50) |
| 33 | creationtime | creationtime | creationtime | char(19) |
| 34 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 35 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 36 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 37 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 38 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |