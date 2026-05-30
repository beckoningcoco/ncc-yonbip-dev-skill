# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/13001.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(64) | √ |
| 2 | created_by | created_by | created_by | varchar2(255) |
| 3 | created_date | created_date | created_date | timestamp(6) |  |  | null |
| 4 | data_set_id | data_set_id | data_set_id | varchar2(255) | √ |
| 5 | last_modified_by | last_modified_by | last_modified_by | varchar2(255) |
| 6 | last_modified_date | last_modified_date | last_modified_date | timestamp(6) |  |  | null |
| 7 | materialization_sql | materialization_sql | materialization_sql | clob |
| 8 | materialization_type | materialization_type | materialization_type | number(38, 0) | √ |  | -1 |
| 9 | pk_col_name | pk_col_name | pk_col_name | varchar2(255) |
| 10 | schedule_task_id | schedule_task_id | schedule_task_id | varchar2(255) | √ |
| 11 | sys_tenant_id | sys_tenant_id | sys_tenant_id | varchar2(255) | √ |
| 12 | target_data_source_id | target_data_source_id | target_data_source_id | varchar2(255) | √ |
| 13 | target_data_source_type | target_data_source_type | target_data_source_type | number(38, 0) | √ |
| 14 | target_table_discription | target_table_discription | target_table_discription | varchar2(255) |
| 15 | target_table_name | target_table_name | target_table_name | varchar2(255) |
| 16 | tenant_id | tenant_id | tenant_id | varchar2(255) | √ |
| 17 | time_col_name | time_col_name | time_col_name | varchar2(255) |
| 18 | ts | ts | ts | timestamp(6) |  |  | cast(sysdate as timestamp) |