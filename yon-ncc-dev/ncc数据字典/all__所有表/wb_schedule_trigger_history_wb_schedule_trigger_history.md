# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/13007.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(64) | √ |
| 2 | created_by | created_by | created_by | varchar2(255) |
| 3 | created_date | created_date | created_date | timestamp(6) |  |  | null |
| 4 | executed_time | executed_time | executed_time | number(38, 0) | √ |
| 5 | exec_time | exec_time | exec_time | number(38, 0) | √ |
| 6 | fire_time | fire_time | fire_time | number(38, 0) | √ |
| 7 | last_modified_by | last_modified_by | last_modified_by | varchar2(255) |
| 8 | last_modified_date | last_modified_date | last_modified_date | timestamp(6) |  |  | null |
| 9 | schedule_task_id | schedule_task_id | schedule_task_id | varchar2(255) | √ |
| 10 | schedule_trigger_id | schedule_trigger_id | schedule_trigger_id | varchar2(255) | √ |
| 11 | status | status | status | number(38, 0) | √ |  | -1 |
| 12 | sys_tenant_id | sys_tenant_id | sys_tenant_id | varchar2(255) | √ |
| 13 | tenant_id | tenant_id | tenant_id | varchar2(255) | √ |
| 14 | ts | ts | ts | timestamp(6) |  |  | cast(sysdate as timestamp) |