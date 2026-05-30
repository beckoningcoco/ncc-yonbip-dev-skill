# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10984.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_model | pk_model | pk_model | char(20) | √ |
| 2 | column_code | column_code | column_code | varchar2(50) | √ |
| 3 | column_system | column_system | column_system | varchar2(100) | √ |
| 4 | column_type | column_type | column_type | number(38, 0) | √ |
| 5 | column_user | column_user | column_user | varchar2(100) | √ |
| 6 | column_width | column_width | column_width | number(38, 0) | √ |
| 7 | col_expressions | col_expressions | col_expressions | varchar2(1100) |
| 8 | data_type | data_type | data_type | number(38, 0) | √ |  | 1 |
| 9 | group_order | group_order | group_order | number(38, 0) |
| 10 | idcolname | idcolname | idcolname | varchar2(100) |
| 11 | if_default | if_default | if_default | char(1) | √ |  | 'N' |
| 12 | if_must | if_must | if_must | char(1) | √ |  | 'N' |
| 13 | if_no | if_no | if_no | char(1) | √ |  | 'N' |
| 14 | if_sum | if_sum | if_sum | char(1) |
| 15 | is_thmark | is_thmark | is_thmark | char(1) |
| 16 | item_order | item_order | item_order | number(38, 0) | √ |  | 0 |
| 17 | node_code | node_code | node_code | varchar2(60) |
| 18 | order_order | order_order | order_order | number(38, 0) |
| 19 | order_type | order_type | order_type | char(1) |
| 20 | pk_corp | pk_corp | pk_corp | char(20) | √ |
| 21 | pk_templet | pk_templet | pk_templet | char(20) | √ |
| 22 | report_pos | report_pos | report_pos | number(38, 0) | √ |  | 1 |
| 23 | resid_system | resid_system | resid_system | varchar2(20) |
| 24 | resid_user | resid_user | resid_user | varchar2(20) |
| 25 | select_type | select_type | select_type | number(38, 0) | √ |
| 26 | userdefflag | userdefflag | userdefflag | char(1) |
| 27 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 28 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |