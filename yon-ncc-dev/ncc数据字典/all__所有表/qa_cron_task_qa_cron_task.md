# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11071.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | created_by | created_by | created_by | varchar2(36) |
| 2 | created_date | created_date | created_date | timestamp(6) |
| 3 | cron_key | cron_key | cron_key | varchar2(255) |  |  | '' |
| 4 | cron_status | cron_status | cron_status | varchar2(36) |
| 5 | cron_url | cron_url | cron_url | varchar2(36) |
| 6 | current_type | current_type | current_type | varchar2(36) |
| 7 | description | description | description | varchar2(255) |
| 8 | end_time | end_time | end_time | varchar2(36) |
| 9 | exp | exp | exp | varchar2(100) |
| 10 | extra_content | extra_content | extra_content | clob |
| 11 | id | id | id | varchar2(36) | √ |
| 12 | last_modified_by | last_modified_by | last_modified_by | varchar2(36) |
| 13 | last_modified_date | last_modified_date | last_modified_date | timestamp(6) |
| 14 | modify_assert | modify_assert | modify_assert | clob |
| 15 | show_assert | show_assert | show_assert | clob |
| 16 | start_time | start_time | start_time | varchar2(36) |
| 17 | sys_tenant_id | sys_tenant_id | sys_tenant_id | varchar2(36) |
| 18 | tenant_id | tenant_id | tenant_id | varchar2(36) |
| 19 | ts | ts | ts | timestamp(6) | √ |  | cast(sysdate as timestamp) |