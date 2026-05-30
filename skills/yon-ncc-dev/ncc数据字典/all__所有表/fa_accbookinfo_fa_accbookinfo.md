# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8090.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_accbookinfo | pk_accbookinfo | pk_accbookinfo | char(20) | √ |
| 2 | accbooktypecode | accbooktypecode | accbooktypecode | varchar2(50) |
| 3 | accbooktypename | accbooktypename | accbooktypename | varchar2(50) |
| 4 | convert_date | convert_date | convert_date | number(38, 0) | √ |  | 0 |
| 5 | localoriginvalue | localoriginvalue | localoriginvalue | varchar2(200) |
| 6 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 7 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 8 | pk_setofbook | pk_setofbook | pk_setofbook | varchar2(20) |  |  | '~' |
| 9 | creationtime | creationtime | creationtime | char(19) |
| 10 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 11 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 12 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 13 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 14 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |