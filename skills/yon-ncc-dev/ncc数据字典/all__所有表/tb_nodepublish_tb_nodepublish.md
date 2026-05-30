# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12074.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_obj | pk_obj | pk_obj | char(20) | √ |
| 2 | funtype | funtype | funtype | varchar2(25) |
| 3 | info | info | info | varchar2(300) |
| 4 | isncc | isncc | isncc | char(1) |
| 5 | issystem | issystem | issystem | char(1) |
| 6 | mvtypeclass | mvtypeclass | mvtypeclass | varchar2(20) |
| 7 | mvtypes | mvtypes | mvtypes | blob |
| 8 | nodetype | nodetype | nodetype | char(1) |
| 9 | objname | objname | objname | varchar2(300) |
| 10 | objname2 | objname2 | objname2 | varchar2(300) |
| 11 | objname3 | objname3 | objname3 | varchar2(300) |
| 12 | objname4 | objname4 | objname4 | varchar2(300) |
| 13 | objname5 | objname5 | objname5 | varchar2(300) |
| 14 | objname6 | objname6 | objname6 | varchar2(300) |
| 15 | paradims | paradims | paradims | blob |
| 16 | paramvtypeclass | paramvtypeclass | paramvtypeclass | varchar2(20) |
| 17 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 18 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 19 | pk_parent | pk_parent | pk_parent | varchar2(20) |
| 20 | pk_uapnode | pk_uapnode | pk_uapnode | varchar2(20) |
| 21 | sheetrange | sheetrange | sheetrange | varchar2(2048) |
| 22 | taskdefs | taskdefs | taskdefs | blob |
| 23 | creationtime | creationtime | creationtime | char(19) |
| 24 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 25 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 26 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 27 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 28 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |