# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/13014.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(64) | √ |
| 2 | applicant | applicant | applicant | varchar2(255) |
| 3 | apply_description | apply_description | apply_description | varchar2(255) |
| 4 | apply_time | apply_time | apply_time | timestamp(6) |  |  | null |
| 5 | auditor | auditor | auditor | varchar2(255) |
| 6 | audit_description | audit_description | audit_description | varchar2(255) |
| 7 | audit_time | audit_time | audit_time | timestamp(6) |  |  | null |
| 8 | auth_status | auth_status | auth_status | number(38, 0) |
| 9 | created_by | created_by | created_by | varchar2(255) |
| 10 | created_date | created_date | created_date | timestamp(6) |  |  | null |
| 11 | data_source_name | data_source_name | data_source_name | varchar2(255) |
| 12 | last_modified_by | last_modified_by | last_modified_by | varchar2(255) |
| 13 | last_modified_date | last_modified_date | last_modified_date | timestamp(6) |  |  | null |
| 14 | record_type_pk | record_type_pk | record_type_pk | varchar2(255) |
| 15 | stop_description | stop_description | stop_description | varchar2(255) |
| 16 | sys_tenant_id | sys_tenant_id | sys_tenant_id | varchar2(255) |
| 17 | tenant_id | tenant_id | tenant_id | varchar2(255) |
| 18 | tenant_pk | tenant_pk | tenant_pk | varchar2(255) |
| 19 | ts | ts | ts | timestamp(6) |  |  | cast(sysdate as timestamp) |