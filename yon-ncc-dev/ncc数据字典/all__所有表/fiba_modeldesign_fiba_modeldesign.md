# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8263.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_modeldesign | pk_modeldesign | pk_modeldesign | char(20) | √ |
| 2 | code | code | code | varchar2(20) |
| 3 | isenabale | isenabale | isenabale | char(1) |
| 4 | ispreset | ispreset | ispreset | varchar2(50) |
| 5 | isvalidate | isvalidate | isvalidate | char(1) |
| 6 | memo | memo | memo | varchar2(1000) |
| 7 | name | name | name | varchar2(100) |
| 8 | pk_datamodelclass | pk_datamodelclass | pk_datamodelclass | varchar2(20) |  |  | '~' |
| 9 | pk_group | pk_group | pk_group | varchar2(50) |
| 10 | pk_model | pk_model | pk_model | varchar2(20) |  |  | '~' |
| 11 | pk_org | pk_org | pk_org | varchar2(50) |
| 12 | creationtime | creationtime | creationtime | char(19) |
| 13 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 14 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 15 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 16 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 17 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |