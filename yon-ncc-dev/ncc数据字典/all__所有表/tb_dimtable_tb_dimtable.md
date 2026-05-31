# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12015.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_obj | pk_obj | pk_obj | char(20) | √ |
| 2 | dbtableclassid | dbtableclassid | dbtableclassid | varchar2(38) |
| 3 | dbtablename | dbtablename | dbtablename | varchar2(38) | √ |
| 4 | dbtabletype | dbtabletype | dbtabletype | char(1) |
| 5 | pk_dimdef | pk_dimdef | pk_dimdef | char(20) | √ |
| 6 | tabledesc | tabledesc | tabledesc | varchar2(60) |
| 7 | tabledesc2 | tabledesc2 | tabledesc2 | varchar2(60) |
| 8 | tabledesc3 | tabledesc3 | tabledesc3 | varchar2(60) |
| 9 | tabledesc4 | tabledesc4 | tabledesc4 | varchar2(60) |
| 10 | tabledesc5 | tabledesc5 | tabledesc5 | varchar2(60) |
| 11 | tabledesc6 | tabledesc6 | tabledesc6 | varchar2(60) |
| 12 | visible | visible | visible | char(1) | √ |
| 13 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 14 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |