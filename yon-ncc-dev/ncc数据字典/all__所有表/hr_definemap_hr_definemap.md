# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8806.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_definemap | pk_definemap | pk_definemap | char(20) | √ |
| 2 | hr_fieldname | hr_fieldname | hr_fieldname | varchar2(100) |
| 3 | hr_tablename | hr_tablename | hr_tablename | varchar2(100) |
| 4 | pk_hrgroup | pk_hrgroup | pk_hrgroup | varchar2(20) |  |  | '~' |
| 5 | pk_uapgroup | pk_uapgroup | pk_uapgroup | varchar2(20) |  |  | '~' |
| 6 | propindex | propindex | propindex | varchar2(128) |
| 7 | uap_tablename | uap_tablename | uap_tablename | varchar2(100) |
| 8 | upa_fieldname | upa_fieldname | upa_fieldname | varchar2(100) |
| 9 | creationtime | creationtime | creationtime | char(19) |
| 10 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 11 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 12 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 13 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 14 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |