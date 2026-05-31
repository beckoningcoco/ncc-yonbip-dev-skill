# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8839.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_hr_sortcon | pk_hr_sortcon | pk_hr_sortcon | char(20) | √ |
| 2 | ascend_flag | ascend_flag | ascend_flag | char(1) | √ |
| 3 | field_code | field_code | field_code | varchar2(80) | √ |
| 4 | field_name | field_name | field_name | varchar2(120) | √ |
| 5 | field_seq | field_seq | field_seq | number(38, 0) | √ |
| 6 | pk_hr_sort | pk_hr_sort | pk_hr_sort | varchar2(20) | √ |
| 7 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 8 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |