# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/13004.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(64) | √ |
| 2 | content_label | content_label | content_label | clob |
| 3 | created_by | created_by | created_by | varchar2(255) |
| 4 | created_date | created_date | created_date | timestamp(6) |  |  | null |
| 5 | description | description | description | varchar2(255) |
| 6 | last_modified_by | last_modified_by | last_modified_by | varchar2(255) |
| 7 | last_modified_date | last_modified_date | last_modified_date | timestamp(6) |  |  | null |
| 8 | push_type | push_type | push_type | varchar2(255) |
| 9 | sys_tenant_id | sys_tenant_id | sys_tenant_id | varchar2(255) |
| 10 | task_merge_interval | task_merge_interval | task_merge_interval | number(38, 0) |
| 11 | task_name | task_name | task_name | varchar2(255) |
| 12 | tenant_id | tenant_id | tenant_id | varchar2(255) |
| 13 | title_label | title_label | title_label | varchar2(255) |
| 14 | type | type | type | number(38, 0) |
| 15 | ts | ts | ts | timestamp(6) |  |  | cast(sysdate as timestamp) |