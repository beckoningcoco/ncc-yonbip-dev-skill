# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12939.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | created_by | created_by | created_by | varchar2(255) |
| 2 | created_date | created_date | created_date | timestamp(6) |
| 3 | description | description | description | varchar2(255) |
| 4 | dm_id | dm_id | dm_id | varchar2(36) | √ |
| 5 | enable | enable | enable | number(38, 0) |
| 6 | end_time | end_time | end_time | varchar2(50) |
| 7 | exp | exp | exp | varchar2(255) | √ |
| 8 | exp_type | exp_type | exp_type | number(38, 0) | √ |
| 9 | extra_content | extra_content | extra_content | clob |
| 10 | id | id | id | varchar2(36) | √ |
| 11 | index_column | index_column | index_column | varchar2(255) |
| 12 | last_exec_time | last_exec_time | last_exec_time | timestamp(6) |
| 13 | last_modified_by | last_modified_by | last_modified_by | varchar2(255) |
| 14 | last_modified_date | last_modified_date | last_modified_date | timestamp(6) |
| 15 | last_status | last_status | last_status | varchar2(100) |
| 16 | last_succ_time | last_succ_time | last_succ_time | timestamp(6) |
| 17 | materialize_type | materialize_type | materialize_type | varchar2(10) |
| 18 | start_time | start_time | start_time | varchar2(50) |
| 19 | sys_tenant_id | sys_tenant_id | sys_tenant_id | varchar2(255) | √ |
| 20 | tenant_id | tenant_id | tenant_id | varchar2(255) | √ |
| 21 | trigger_name | trigger_name | trigger_name | varchar2(255) | √ |
| 22 | ts_column | ts_column | ts_column | varchar2(100) |
| 23 | ts | ts | ts | timestamp(6) | √ |  | cast(sysdate as timestamp) |