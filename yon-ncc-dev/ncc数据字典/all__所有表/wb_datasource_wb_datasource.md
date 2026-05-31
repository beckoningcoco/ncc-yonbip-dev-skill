# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12934.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(64) | √ |
| 2 | address | address | address | varchar2(512) | √ |
| 3 | auth_tables | auth_tables | auth_tables | clob |
| 4 | auto_load | auto_load | auto_load | number(38, 0) |
| 5 | capability | capability | capability | varchar2(255) |
| 6 | caps_lock | caps_lock | caps_lock | number(38, 0) |
| 7 | case_sensitive | case_sensitive | case_sensitive | number(38, 0) |
| 8 | comments | comments | comments | varchar2(255) |
| 9 | copy_assert | copy_assert | copy_assert | clob |
| 10 | created_by | created_by | created_by | varchar2(255) |
| 11 | created_date | created_date | created_date | timestamp(6) |  |  | null |
| 12 | db_name | db_name | db_name | varchar2(255) | √ |
| 13 | db_type | db_type | db_type | varchar2(50) |  |  | 'outside' |
| 14 | dialect | dialect | dialect | varchar2(255) | √ |
| 15 | driver_class_name | driver_class_name | driver_class_name | varchar2(255) |
| 16 | enable | enable | enable | number(38, 0) | √ |
| 17 | file_infos | file_infos | file_infos | clob |
| 18 | filters | filters | filters | clob | √ |
| 19 | last_modified_by | last_modified_by | last_modified_by | varchar2(255) |
| 20 | last_modified_date | last_modified_date | last_modified_date | timestamp(6) |  |  | null |
| 21 | modify_assert | modify_assert | modify_assert | clob |
| 22 | pool_initial_size | pool_initial_size | pool_initial_size | number(38, 0) | √ |
| 23 | pool_max_active | pool_max_active | pool_max_active | number(38, 0) | √ |
| 24 | pool_max_idle | pool_max_idle | pool_max_idle | number(38, 0) | √ |
| 25 | pool_max_wait | pool_max_wait | pool_max_wait | number(38, 0) | √ |
| 26 | pool_min_idle | pool_min_idle | pool_min_idle | number(38, 0) | √ |
| 27 | publish_assert | publish_assert | publish_assert | clob |
| 28 | pwd | pwd | pwd | varchar2(255) |
| 29 | remove_assert | remove_assert | remove_assert | clob |
| 30 | schema_name | schema_name | schema_name | varchar2(255) |
| 31 | show_assert | show_assert | show_assert | clob |
| 32 | sys_tenant_id | sys_tenant_id | sys_tenant_id | varchar2(255) | √ |
| 33 | tag | tag | tag | clob |
| 34 | tenant_id | tenant_id | tenant_id | varchar2(255) | √ |
| 35 | user_name | user_name | user_name | varchar2(255) | √ |
| 36 | ts | ts | ts | timestamp(6) |  |  | cast(sysdate as timestamp) |