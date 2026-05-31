# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12923.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(36) | √ |
| 2 | modify_assert | modify_assert | modify_assert | varchar2(500) |
| 3 | node_sum | node_sum | node_sum | number(11, 0) | √ |
| 4 | process_name | process_name | process_name | varchar2(150) | √ |
| 5 | process_type | process_type | process_type | varchar2(10) | √ |
| 6 | show_assert | show_assert | show_assert | varchar2(500) |
| 7 | sys_tenant_id | sys_tenant_id | sys_tenant_id | varchar2(36) | √ |
| 8 | tenant_id | tenant_id | tenant_id | varchar2(36) | √ |
| 9 | user_id | user_id | user_id | varchar2(36) |
| 10 | ts | ts | ts | timestamp(6) | √ |  | cast(sysdate as timestamp) |