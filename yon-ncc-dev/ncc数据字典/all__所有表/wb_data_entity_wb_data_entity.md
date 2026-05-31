# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12935.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(64) | √ |
| 2 | created_by | created_by | created_by | varchar2(255) |
| 3 | created_date | created_date | created_date | timestamp(6) |  |  | null |
| 4 | last_modified_by | last_modified_by | last_modified_by | varchar2(255) |
| 5 | last_modified_date | last_modified_date | last_modified_date | timestamp(6) |  |  | null |
| 6 | modify_assert | modify_assert | modify_assert | clob |
| 7 | obj_code | obj_code | obj_code | varchar2(255) | √ |
| 8 | obj_comment | obj_comment | obj_comment | varchar2(255) |
| 9 | obj_type | obj_type | obj_type | varchar2(255) | √ |
| 10 | show_assert | show_assert | show_assert | clob |
| 11 | source_id | source_id | source_id | varchar2(255) | √ |
| 12 | sys_tenant_id | sys_tenant_id | sys_tenant_id | varchar2(255) | √ |
| 13 | tenant_id | tenant_id | tenant_id | varchar2(255) | √ |
| 14 | ts | ts | ts | timestamp(6) |  |  | cast(sysdate as timestamp) |