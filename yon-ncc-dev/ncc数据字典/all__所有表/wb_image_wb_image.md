# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12957.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(64) | √ |
| 2 | created_by | created_by | created_by | varchar2(255) |
| 3 | created_date | created_date | created_date | timestamp(6) |  |  | null |
| 4 | image_size | image_size | image_size | number(38, 0) | √ |
| 5 | is_cite | is_cite | is_cite | number(38, 0) | √ |
| 6 | is_share | is_share | is_share | number(38, 0) | √ |
| 7 | last_modified_by | last_modified_by | last_modified_by | varchar2(255) |
| 8 | last_modified_date | last_modified_date | last_modified_date | timestamp(6) |  |  | null |
| 9 | modify_assert | modify_assert | modify_assert | clob | √ |
| 10 | name | name | name | varchar2(255) | √ |
| 11 | show_assert | show_assert | show_assert | clob | √ |
| 12 | sys_tenant_id | sys_tenant_id | sys_tenant_id | varchar2(255) | √ |
| 13 | tenant_id | tenant_id | tenant_id | varchar2(255) | √ |
| 14 | type | type | type | varchar2(255) | √ |
| 15 | url | url | url | varchar2(255) | √ |
| 16 | user_id | user_id | user_id | varchar2(255) | √ |
| 17 | user_name | user_name | user_name | varchar2(255) | √ |
| 18 | ts | ts | ts | timestamp(6) |  |  | cast(sysdate as timestamp) |