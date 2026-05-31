# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/13011.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(40) | √ |
| 2 | analysis_id | analysis_id | analysis_id | varchar2(40) |
| 3 | error_msg | error_msg | error_msg | clob |
| 4 | storage_value | storage_value | storage_value | varchar2(255) |
| 5 | sum_result | sum_result | sum_result | varchar2(10) |
| 6 | sum_rule_id | sum_rule_id | sum_rule_id | varchar2(40) |
| 7 | sum_tree_id | sum_tree_id | sum_tree_id | varchar2(40) |
| 8 | title_label | title_label | title_label | varchar2(255) |
| 9 | user_id | user_id | user_id | varchar2(40) |
| 10 | ts | ts | ts | timestamp(6) |  |  | cast(sysdate as timestamp) |