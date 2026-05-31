# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7056.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | crefid | crefid | crefid | char(20) | √ |
| 2 | comp | comp | comp | varchar2(50) |
| 3 | orgtype | orgtype | orgtype | char(20) |
| 4 | referencedtablekey | referencedtablekey | referencedtablekey | varchar2(50) |
| 5 | referencedtablename | referencedtablename | referencedtablename | varchar2(50) |
| 6 | referencingkeycolumn | referencingkeycolumn | referencingkeycolumn | varchar2(50) |
| 7 | referencingtablecolumn | referencingtablecolumn | referencingtablecolumn | varchar2(50) |
| 8 | referencingtablename | referencingtablename | referencingtablename | varchar2(50) |
| 9 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 10 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |