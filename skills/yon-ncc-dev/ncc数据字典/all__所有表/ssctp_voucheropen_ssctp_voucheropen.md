# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11928.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_opentype | pk_opentype | pk_opentype | char(20) | √ |
| 2 | extendinfo | extendinfo | extendinfo | varchar2(500) |
| 3 | opentype | opentype | opentype | varchar2(50) |
| 4 | params | params | params | varchar2(500) |
| 5 | pk_billtype | pk_billtype | pk_billtype | varchar2(50) |
| 6 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 7 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 8 | pk_ots | pk_ots | pk_ots | varchar2(20) |  |  | '~' |
| 9 | pk_transtype | pk_transtype | pk_transtype | varchar2(20) |  |  | '~' |
| 10 | transtype_code | transtype_code | transtype_code | varchar2(50) |
| 11 | url | url | url | varchar2(500) |
| 12 | creationtime | creationtime | creationtime | char(19) |
| 13 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 14 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 15 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 16 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 17 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |