# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12988.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(64) | √ |
| 2 | and_id | and_id | and_id | varchar2(255) |
| 3 | case_name | case_name | case_name | varchar2(255) |
| 4 | created_by | created_by | created_by | varchar2(255) |
| 5 | created_date | created_date | created_date | timestamp(6) |  |  | null |
| 6 | delete_assert | delete_assert | delete_assert | varchar2(255) |
| 7 | from_id | from_id | from_id | varchar2(255) |
| 8 | is_default | is_default | is_default | number(38, 0) |
| 9 | last_modified_by | last_modified_by | last_modified_by | varchar2(255) |
| 10 | last_modified_date | last_modified_date | last_modified_date | timestamp(6) |  |  | null |
| 11 | modify_assert | modify_assert | modify_assert | clob |
| 12 | share_assert | share_assert | share_assert | varchar2(255) |
| 13 | show_assert | show_assert | show_assert | clob |
| 14 | sort | sort | sort | number(38, 0) |
| 15 | sys_tenant_id | sys_tenant_id | sys_tenant_id | varchar2(255) |
| 16 | tenant_id | tenant_id | tenant_id | varchar2(255) |
| 17 | ts | ts | ts | timestamp(6) |  |  | cast(sysdate as timestamp) |