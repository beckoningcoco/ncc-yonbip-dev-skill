# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/13015.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(64) | √ |
| 2 | apply_user | apply_user | apply_user | varchar2(255) | √ |
| 3 | apply_user_name | apply_user_name | apply_user_name | varchar2(255) | √ |
| 4 | created_by | created_by | created_by | varchar2(255) |
| 5 | created_date | created_date | created_date | timestamp(6) |  |  | null |
| 6 | is_active | is_active | is_active | varchar2(255) | √ |
| 7 | is_enabled | is_enabled | is_enabled | varchar2(255) | √ |
| 8 | is_preset | is_preset | is_preset | varchar2(255) | √ |
| 9 | last_modified_by | last_modified_by | last_modified_by | varchar2(255) |
| 10 | last_modified_date | last_modified_date | last_modified_date | timestamp(6) |  |  | null |
| 11 | modify_assert | modify_assert | modify_assert | clob |
| 12 | show_assert | show_assert | show_assert | clob |
| 13 | sys_tenant_id | sys_tenant_id | sys_tenant_id | varchar2(255) | √ |
| 14 | tenant_code | tenant_code | tenant_code | varchar2(255) | √ |
| 15 | tenant_id | tenant_id | tenant_id | varchar2(255) | √ |
| 16 | tenant_name | tenant_name | tenant_name | varchar2(255) | √ |
| 17 | yht_create_time | yht_create_time | yht_create_time | timestamp(6) |  |  | null |
| 18 | ts | ts | ts | timestamp(6) |  |  | cast(sysdate as timestamp) |