# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6829.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_crossbusimap | pk_crossbusimap | pk_crossbusimap | char(20) | √ |
| 2 | obj_property_name | obj_property_name | obj_property_name | varchar2(50) |
| 3 | pk_business | pk_business | pk_business | varchar2(20) |
| 4 | pk_refobj | pk_refobj | pk_refobj | varchar2(50) |
| 5 | pk_scope | pk_scope | pk_scope | varchar2(20) |  |  | '~' |
| 6 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 7 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |