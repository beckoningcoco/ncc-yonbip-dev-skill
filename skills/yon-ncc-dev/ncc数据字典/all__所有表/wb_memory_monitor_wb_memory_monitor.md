# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12973.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(36) | √ |
| 2 | ana_id | ana_id | ana_id | varchar2(255) |
| 3 | created_by | created_by | created_by | varchar2(255) |
| 4 | created_date | created_date | created_date | timestamp(6) |
| 5 | last_modified_by | last_modified_by | last_modified_by | varchar2(255) |
| 6 | last_modified_date | last_modified_date | last_modified_date | timestamp(6) |
| 7 | max_ava_memory | max_ava_memory | max_ava_memory | number(38, 0) | √ |
| 8 | nano | nano | nano | number(38, 0) |
| 9 | stacktrace | stacktrace | stacktrace | clob |
| 10 | sys_tenant_id | sys_tenant_id | sys_tenant_id | varchar2(255) |
| 11 | tenant_id | tenant_id | tenant_id | varchar2(255) | √ |
| 12 | used_memory | used_memory | used_memory | number(38, 0) | √ |
| 13 | user_id | user_id | user_id | varchar2(255) | √ |
| 14 | ts | ts | ts | timestamp(6) |  |  | cast(sysdate as timestamp) |