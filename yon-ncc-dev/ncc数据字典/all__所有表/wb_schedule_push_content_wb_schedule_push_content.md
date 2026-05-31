# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/13002.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(64) | √ |
| 2 | analyze_id | analyze_id | analyze_id | varchar2(255) | √ |
| 3 | appendix_type | appendix_type | appendix_type | number(38, 0) | √ |
| 4 | conditions | conditions | conditions | clob |
| 5 | created_by | created_by | created_by | varchar2(255) |
| 6 | created_date | created_date | created_date | timestamp(6) |  |  | null |
| 7 | dir_id | dir_id | dir_id | varchar2(255) |
| 8 | executor | executor | executor | varchar2(36) |
| 9 | last_modified_by | last_modified_by | last_modified_by | varchar2(255) |
| 10 | last_modified_date | last_modified_date | last_modified_date | timestamp(6) |  |  | null |
| 11 | max_save_num | max_save_num | max_save_num | number(38, 0) |
| 12 | name | name | name | varchar2(255) |
| 13 | schedule_task_id | schedule_task_id | schedule_task_id | varchar2(255) | √ |
| 14 | sheet_id | sheet_id | sheet_id | varchar2(255) |
| 15 | story_type | story_type | story_type | varchar2(36) |
| 16 | subscribe_name | subscribe_name | subscribe_name | varchar2(255) |
| 17 | sys_tenant_id | sys_tenant_id | sys_tenant_id | varchar2(255) | √ |
| 18 | tenant_id | tenant_id | tenant_id | varchar2(255) | √ |
| 19 | text | text | text | clob |
| 20 | ts | ts | ts | timestamp(6) |  |  | cast(sysdate as timestamp) |