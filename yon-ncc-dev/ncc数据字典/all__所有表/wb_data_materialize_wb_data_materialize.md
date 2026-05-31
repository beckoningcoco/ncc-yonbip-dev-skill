# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12937.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(36) | √ |
| 2 | created_by | created_by | created_by | varchar2(255) |
| 3 | created_date | created_date | created_date | timestamp(6) |
| 4 | ds_id | ds_id | ds_id | varchar2(255) | √ |
| 5 | last_column | last_column | last_column | clob |
| 6 | last_column_map | last_column_map | last_column_map | clob |
| 7 | last_modified_by | last_modified_by | last_modified_by | varchar2(255) |
| 8 | last_modified_date | last_modified_date | last_modified_date | timestamp(6) |
| 9 | last_table_name | last_table_name | last_table_name | varchar2(255) |
| 10 | mdata_source | mdata_source | mdata_source | varchar2(255) |
| 11 | mtable_desc | mtable_desc | mtable_desc | varchar2(255) |
| 12 | mtable_name | mtable_name | mtable_name | varchar2(255) | √ |
| 13 | query_sql | query_sql | query_sql | clob |
| 14 | schedule_info | schedule_info | schedule_info | clob |
| 15 | source_type | source_type | source_type | varchar2(10) |
| 16 | sys_tenant_id | sys_tenant_id | sys_tenant_id | varchar2(255) | √ |
| 17 | tenant_id | tenant_id | tenant_id | varchar2(255) | √ |
| 18 | ts | ts | ts | timestamp(6) | √ |  | cast(sysdate as timestamp) |