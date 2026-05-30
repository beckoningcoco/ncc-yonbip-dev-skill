# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12944.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(64) | √ |
| 2 | copy_assert | copy_assert | copy_assert | clob |
| 3 | created_by | created_by | created_by | varchar2(255) |
| 4 | created_date | created_date | created_date | timestamp(6) |  |  | null |
| 5 | description | description | description | clob |
| 6 | last_modified_by | last_modified_by | last_modified_by | varchar2(255) |
| 7 | last_modified_date | last_modified_date | last_modified_date | timestamp(6) |  |  | null |
| 8 | modify_assert | modify_assert | modify_assert | clob |
| 9 | name | name | name | varchar2(255) | √ |
| 10 | pid | pid | pid | varchar2(255) | √ |
| 11 | publish_assert | publish_assert | publish_assert | clob |
| 12 | remove_assert | remove_assert | remove_assert | clob |
| 13 | show_assert | show_assert | show_assert | clob |
| 14 | sys_tenant_id | sys_tenant_id | sys_tenant_id | varchar2(255) | √ |
| 15 | tenant_id | tenant_id | tenant_id | varchar2(255) | √ |
| 16 | type | type | type | varchar2(36) |
| 17 | work_space_id | work_space_id | work_space_id | varchar2(255) | √ |
| 18 | ts | ts | ts | timestamp(6) |  |  | cast(sysdate as timestamp) |