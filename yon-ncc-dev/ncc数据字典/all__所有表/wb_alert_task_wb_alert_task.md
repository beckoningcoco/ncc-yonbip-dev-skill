# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12919.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(36) | √ |
| 2 | analysis_define | analysis_define | analysis_define | clob |
| 3 | ana_id | ana_id | ana_id | varchar2(255) |
| 4 | created_by | created_by | created_by | varchar2(255) |
| 5 | created_date | created_date | created_date | timestamp(6) |
| 6 | display_define | display_define | display_define | clob |
| 7 | last_modified_by | last_modified_by | last_modified_by | varchar2(255) |
| 8 | last_modified_date | last_modified_date | last_modified_date | timestamp(6) |
| 9 | message_define | message_define | message_define | clob |
| 10 | name | name | name | varchar2(255) |
| 11 | polling_define | polling_define | polling_define | clob |
| 12 | sts | sts | sts | varchar2(20) |
| 13 | sys_tenant_id | sys_tenant_id | sys_tenant_id | varchar2(255) |
| 14 | tenant_id | tenant_id | tenant_id | varchar2(255) |
| 15 | ts | ts | ts | timestamp(6) |  |  | cast(sysdate as timestamp) |