# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12100.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_absfunc_m | pk_absfunc_m | pk_absfunc_m | char(20) | √ |
| 2 | coldesc | coldesc | coldesc | varchar2(50) |
| 3 | colname | colname | colname | varchar2(50) | √ |
| 4 | datatype | datatype | datatype | number(10, 0) |
| 5 | pk_absfunc | pk_absfunc | pk_absfunc | varchar2(20) | √ |
| 6 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 7 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |