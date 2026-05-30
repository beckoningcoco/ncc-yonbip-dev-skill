# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12035.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_imptable_m | pk_imptable_m | pk_imptable_m | char(20) | √ |
| 2 | coldesc | coldesc | coldesc | varchar2(50) |
| 3 | colname | colname | colname | varchar2(50) | √ |
| 4 | datalength | datalength | datalength | number(10, 0) |
| 5 | datatype | datatype | datatype | number(10, 0) |
| 6 | docattr_type | docattr_type | docattr_type | number(10, 0) |
| 7 | doccode | doccode | doccode | varchar2(20) |
| 8 | isindex | isindex | isindex | char(1) |
| 9 | pk_imptable | pk_imptable | pk_imptable | varchar2(20) | √ |
| 10 | pk_sysreg | pk_sysreg | pk_sysreg | varchar2(20) | √ |
| 11 | sys_attrname | sys_attrname | sys_attrname | varchar2(50) |
| 12 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 13 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |