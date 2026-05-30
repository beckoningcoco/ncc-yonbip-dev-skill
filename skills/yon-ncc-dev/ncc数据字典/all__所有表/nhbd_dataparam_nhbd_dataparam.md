# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9992.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_datatool_para | pk_datatool_para | pk_datatool_para | char(20) | √ |
| 2 | decimal_max | decimal_max | decimal_max | varchar2(50) |
| 3 | decimal_min | decimal_min | decimal_min | varchar2(50) |
| 4 | parameter_length | parameter_length | parameter_length | number(38, 0) |
| 5 | parameter_order | parameter_order | parameter_order | number(38, 0) |
| 6 | parameter_type | parameter_type | parameter_type | number(38, 0) |
| 7 | param_name | param_name | param_name | varchar2(50) |
| 8 | pk_datatool | pk_datatool | pk_datatool | char(20) | √ |
| 9 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 10 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 11 | ref_name | ref_name | ref_name | varchar2(50) |
| 12 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 13 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |