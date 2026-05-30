# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/13006.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(64) | √ |
| 2 | created_by | created_by | created_by | varchar2(255) |
| 3 | created_date | created_date | created_date | timestamp(6) |  |  | null |
| 4 | description | description | description | varchar2(255) |
| 5 | end_time | end_time | end_time | varchar2(255) |
| 6 | exp | exp | exp | varchar2(255) | √ |
| 7 | extra_content | extra_content | extra_content | clob |
| 8 | last_exec_time | last_exec_time | last_exec_time | varchar2(255) |
| 9 | last_modified_by | last_modified_by | last_modified_by | varchar2(255) |  |  | null |
| 10 | last_modified_date | last_modified_date | last_modified_date | timestamp(6) |
| 11 | last_status | last_status | last_status | number(38, 0) | √ |  | -1 |
| 12 | priority | priority | priority | number(38, 0) | √ |  | -1 |
| 13 | schedule_task_id | schedule_task_id | schedule_task_id | varchar2(255) | √ |
| 14 | start_time | start_time | start_time | varchar2(255) |
| 15 | sys_tenant_id | sys_tenant_id | sys_tenant_id | varchar2(255) | √ |
| 16 | tenant_id | tenant_id | tenant_id | varchar2(255) | √ |
| 17 | type | type | type | number(38, 0) | √ |  | -1 |
| 18 | ts | ts | ts | timestamp(6) |  |  | cast(sysdate as timestamp) |