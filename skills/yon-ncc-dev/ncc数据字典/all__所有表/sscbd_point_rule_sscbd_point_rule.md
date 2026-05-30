# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11801.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pointitem_rule | pk_pointitem_rule | pk_pointitem_rule | char(20) | √ |
| 2 | billtypecode | billtypecode | billtypecode | varchar2(50) |
| 3 | compare_area | compare_area | compare_area | varchar2(50) |
| 4 | compare_mode | compare_mode | compare_mode | number(38, 0) | √ |
| 5 | compare_name | compare_name | compare_name | varchar2(100) | √ |
| 6 | compare_value | compare_value | compare_value | varchar2(50) | √ |
| 7 | field | field | field | varchar2(50) | √ |
| 8 | field_area | field_area | field_area | varchar2(50) |
| 9 | field_name | field_name | field_name | varchar2(100) | √ |
| 10 | invoicetype | invoicetype | invoicetype | number(38, 0) | √ |
| 11 | operation | operation | operation | number(38, 0) | √ |
| 12 | pk_point_item | pk_point_item | pk_point_item | char(20) |
| 13 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 14 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |