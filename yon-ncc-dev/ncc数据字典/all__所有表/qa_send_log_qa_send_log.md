# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11076.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | created_by | created_by | created_by | varchar2(36) |
| 2 | created_date | created_date | created_date | timestamp(6) |
| 3 | description | description | description | varchar2(255) |
| 4 | end_time | end_time | end_time | timestamp(6) |
| 5 | exp | exp | exp | varchar2(36) |
| 6 | id | id | id | varchar2(36) | √ |
| 7 | last_modified_by | last_modified_by | last_modified_by | varchar2(36) |
| 8 | last_modified_date | last_modified_date | last_modified_date | timestamp(6) |
| 9 | modify_assert | modify_assert | modify_assert | clob |
| 10 | show_assert | show_assert | show_assert | clob |
| 11 | start_time | start_time | start_time | timestamp(6) |
| 12 | status | status | status | clob |
| 13 | sys_tenant_id | sys_tenant_id | sys_tenant_id | varchar2(36) |
| 14 | tenant_id | tenant_id | tenant_id | varchar2(36) |
| 15 | ts | ts | ts | timestamp(6) | √ |  | cast(sysdate as timestamp) |