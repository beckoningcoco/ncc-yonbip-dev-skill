# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12929.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(64) | √ |
| 2 | code | code | code | varchar2(255) |
| 3 | created_by | created_by | created_by | varchar2(255) |
| 4 | created_date | created_date | created_date | timestamp(6) |  |  | null |
| 5 | icon | icon | icon | varchar2(255) |
| 6 | last_modified_by | last_modified_by | last_modified_by | varchar2(255) |
| 7 | last_modified_date | last_modified_date | last_modified_date | timestamp(6) |  |  | null |
| 8 | modify_assert | modify_assert | modify_assert | varchar2(255) |
| 9 | name | name | name | varchar2(255) |
| 10 | show_assert | show_assert | show_assert | varchar2(255) |
| 11 | state | state | state | number(38, 0) |
| 12 | sys_tenant_id | sys_tenant_id | sys_tenant_id | varchar2(255) |
| 13 | tenant_id | tenant_id | tenant_id | varchar2(255) |
| 14 | url | url | url | varchar2(255) |
| 15 | ts | ts | ts | timestamp(6) |  |  | cast(sysdate as timestamp) |