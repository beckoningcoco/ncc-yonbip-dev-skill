# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6457.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_param | pk_param | pk_param | char(20) | √ |
| 2 | extfield | extfield | extfield | varchar2(2000) |
| 3 | paramid | paramid | paramid | varchar2(100) | √ |
| 4 | paramname | paramname | paramname | varchar2(200) |
| 5 | paramproperty | paramproperty | paramproperty | varchar2(200) |
| 6 | paramtype | paramtype | paramtype | varchar2(100) |
| 7 | param_value | param_value | param_value | varchar2(500) |
| 8 | pk_cube | pk_cube | pk_cube | char(20) |
| 9 | pk_schema | pk_schema | pk_schema | char(20) | √ |
| 10 | pk_srcparam | pk_srcparam | pk_srcparam | varchar2(50) |
| 11 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 12 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |