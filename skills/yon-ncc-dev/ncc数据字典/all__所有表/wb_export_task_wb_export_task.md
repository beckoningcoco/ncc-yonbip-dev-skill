# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12949.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | ana_id | ana_id | ana_id | varchar2(36) |
| 2 | ana_sheet_name | ana_sheet_name | ana_sheet_name | varchar2(400) |
| 3 | created_by | created_by | created_by | varchar2(255) |
| 4 | created_date | created_date | created_date | timestamp(6) |
| 5 | exec_status | exec_status | exec_status | varchar2(10) |
| 6 | file_name | file_name | file_name | varchar2(500) |
| 7 | file_path | file_path | file_path | varchar2(500) |
| 8 | id | id | id | varchar2(36) | √ |
| 9 | last_modified_by | last_modified_by | last_modified_by | varchar2(255) |
| 10 | last_modified_date | last_modified_date | last_modified_date | timestamp(6) |
| 11 | query_keys | query_keys | query_keys | varchar2(500) |
| 12 | sheet_id | sheet_id | sheet_id | varchar2(36) |
| 13 | sys_tenant_id | sys_tenant_id | sys_tenant_id | varchar2(255) |
| 14 | tenant_id | tenant_id | tenant_id | varchar2(255) |
| 15 | user_id | user_id | user_id | varchar2(36) |
| 16 | ts | ts | ts | timestamp(6) |  |  | cast(sysdate as timestamp) |