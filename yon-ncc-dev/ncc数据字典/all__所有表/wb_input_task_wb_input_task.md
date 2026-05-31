# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12960.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(36) | √ |
| 2 | analysis_id | analysis_id | analysis_id | varchar2(36) |
| 3 | create_person | create_person | create_person | varchar2(50) |
| 4 | create_time | create_time | create_time | timestamp(6) |
| 5 | end_time | end_time | end_time | timestamp(6) |
| 6 | start_time | start_time | start_time | timestamp(6) |
| 7 | sys_tenant_id | sys_tenant_id | sys_tenant_id | varchar2(36) |
| 8 | task_name | task_name | task_name | varchar2(150) |
| 9 | task_status | task_status | task_status | varchar2(20) |
| 10 | tenant_id | tenant_id | tenant_id | varchar2(36) |
| 11 | ts | ts | ts | timestamp(6) |  |  | cast(sysdate as timestamp) |