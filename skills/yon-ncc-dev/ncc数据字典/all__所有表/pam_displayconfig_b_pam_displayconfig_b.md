# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10377.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_displayconfig_b | pk_displayconfig_b | pk_displayconfig_b | char(20) | √ |
| 2 | componetid | componetid | componetid | varchar2(50) |  |  | '~' |
| 3 | display_flag | display_flag | display_flag | char(1) |
| 4 | display_name | display_name | display_name | varchar2(60) |
| 5 | field_code | field_code | field_code | varchar2(60) |
| 6 | field_name | field_name | field_name | varchar2(50) |  |  | '~' |
| 7 | field_table | field_table | field_table | varchar2(50) |  |  | '~' |
| 8 | order_result | order_result | order_result | number(38, 0) |  |  | 0 |
| 9 | pk_displayconfig | pk_displayconfig | pk_displayconfig | char(20) | √ |
| 10 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 11 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |