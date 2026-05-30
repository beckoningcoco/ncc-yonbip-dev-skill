# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12924.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(36) | √ |
| 2 | approval_id | approval_id | approval_id | varchar2(36) |
| 3 | approval_node_id | approval_node_id | approval_node_id | varchar2(36) |
| 4 | approval_time | approval_time | approval_time | timestamp(6) | √ |
| 5 | approved_result | approved_result | approved_result | varchar2(20) | √ |
| 6 | commit_id | commit_id | commit_id | varchar2(36) | √ |
| 7 | reject_reason | reject_reason | reject_reason | varchar2(255) |
| 8 | user_id | user_id | user_id | varchar2(36) | √ |
| 9 | user_name | user_name | user_name | varchar2(150) | √ |
| 10 | ts | ts | ts | timestamp(6) |  |  | cast(sysdate as timestamp) |