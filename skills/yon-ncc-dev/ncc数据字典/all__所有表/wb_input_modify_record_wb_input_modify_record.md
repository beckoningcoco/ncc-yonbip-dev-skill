# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12959.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(36) | √ |
| 2 | ana_id | ana_id | ana_id | varchar2(36) |
| 3 | commit_id | commit_id | commit_id | varchar2(36) | √ |
| 4 | create_time | create_time | create_time | timestamp(6) | √ |
| 5 | data_area | data_area | data_area | varchar2(100) |
| 6 | design_position | design_position | design_position | varchar2(20) |
| 7 | dim_value | dim_value | dim_value | clob |
| 8 | dim_value_hash | dim_value_hash | dim_value_hash | number(38, 0) |
| 9 | float_moddify_recod | float_moddify_recod | float_moddify_recod | varchar2(50) |
| 10 | last_report_time | last_report_time | last_report_time | timestamp(6) |
| 11 | modified_value | modified_value | modified_value | varchar2(150) |
| 12 | operation_type | operation_type | operation_type | varchar2(20) |
| 13 | original_value | original_value | original_value | varchar2(150) |
| 14 | origin_position | origin_position | origin_position | varchar2(20) |
| 15 | reason_for_change | reason_for_change | reason_for_change | varchar2(200) |
| 16 | save_id | save_id | save_id | varchar2(36) |
| 17 | sheet_id | sheet_id | sheet_id | varchar2(36) |
| 18 | show_index | show_index | show_index | varchar2(200) |
| 19 | user_id | user_id | user_id | varchar2(36) |
| 20 | user_name | user_name | user_name | varchar2(50) |
| 21 | ts | ts | ts | timestamp(6) |  |  | cast(sysdate as timestamp) |