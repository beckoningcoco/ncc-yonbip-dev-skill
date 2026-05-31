# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12974.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(64) | √ |
| 2 | created_by | created_by | created_by | varchar2(255) |
| 3 | created_date | created_date | created_date | timestamp(6) |  |  | null |
| 4 | icon | icon | icon | varchar2(255) |
| 5 | last_modified_by | last_modified_by | last_modified_by | varchar2(255) |
| 6 | last_modified_date | last_modified_date | last_modified_date | timestamp(6) |  |  | null |
| 7 | modify_assert | modify_assert | modify_assert | clob | √ |
| 8 | name | name | name | varchar2(255) | √ |
| 9 | pid | pid | pid | varchar2(255) |
| 10 | show_assert | show_assert | show_assert | clob | √ |
| 11 | sys_tenant_id | sys_tenant_id | sys_tenant_id | varchar2(255) | √ |
| 12 | tag | tag | tag | varchar2(255) |
| 13 | tenant_id | tenant_id | tenant_id | varchar2(255) | √ |
| 14 | url | url | url | varchar2(255) |
| 15 | user_id | user_id | user_id | varchar2(50) |
| 16 | ts | ts | ts | timestamp(6) |  |  | cast(sysdate as timestamp) |