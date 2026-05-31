# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12948.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(64) | √ |
| 2 | bind_obj_id | bind_obj_id | bind_obj_id | varchar2(36) |
| 3 | code_col | code_col | code_col | varchar2(255) |
| 4 | created_by | created_by | created_by | varchar2(255) |
| 5 | created_date | created_date | created_date | timestamp(6) |  |  | null |
| 6 | data_set_id | data_set_id | data_set_id | varchar2(36) |
| 7 | data_source_id | data_source_id | data_source_id | varchar2(255) |
| 8 | enum_data_group_id | enum_data_group_id | enum_data_group_id | varchar2(255) |
| 9 | enum_name | enum_name | enum_name | varchar2(255) | √ |
| 10 | enum_type | enum_type | enum_type | varchar2(255) | √ |
| 11 | ext_headers | ext_headers | ext_headers | clob |
| 12 | ext_url | ext_url | ext_url | clob |
| 13 | last_modified_by | last_modified_by | last_modified_by | varchar2(255) |
| 14 | last_modified_date | last_modified_date | last_modified_date | timestamp(6) |  |  | null |
| 15 | name_col | name_col | name_col | varchar2(255) |
| 16 | sys_tenant_id | sys_tenant_id | sys_tenant_id | varchar2(255) |
| 17 | table_id | table_id | table_id | varchar2(255) |
| 18 | tenant_id | tenant_id | tenant_id | varchar2(255) |
| 19 | ts | ts | ts | timestamp(6) |  |  | cast(sysdate as timestamp) |