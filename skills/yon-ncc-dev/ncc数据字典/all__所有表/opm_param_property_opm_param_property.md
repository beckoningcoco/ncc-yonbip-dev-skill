# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10138.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_param_property | pk_param_property | pk_param_property | char(20) | √ |
| 2 | code | code | code | varchar2(50) |
| 3 | data_type | data_type | data_type | varchar2(100) |
| 4 | describe | describe | describe | varchar2(200) |
| 5 | disabled | disabled | disabled | char(1) |
| 6 | isrevise | isrevise | isrevise | char(1) |
| 7 | maxlength | maxlength | maxlength | number(38, 0) |
| 8 | name | name | name | varchar2(100) |
| 9 | needtrans | needtrans | needtrans | char(1) |
| 10 | pk_param_area | pk_param_area | pk_param_area | char(20) | √ |
| 11 | refclass | refclass | refclass | varchar2(100) |
| 12 | required | required | required | char(1) |
| 13 | visible | visible | visible | char(1) |
| 14 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 15 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |