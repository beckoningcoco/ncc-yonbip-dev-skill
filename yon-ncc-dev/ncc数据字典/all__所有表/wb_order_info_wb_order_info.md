# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12983.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(40) | √ |
| 2 | amount | amount | amount | number(38, 0) |
| 3 | created_by | created_by | created_by | varchar2(255) |
| 4 | created_date | created_date | created_date | timestamp(6) |
| 5 | dimension_code | dimension_code | dimension_code | varchar2(255) |
| 6 | end_date | end_date | end_date | timestamp(6) |
| 7 | last_modified_by | last_modified_by | last_modified_by | varchar2(255) |
| 8 | last_modified_date | last_modified_date | last_modified_date | timestamp(6) |
| 9 | source_order_id | source_order_id | source_order_id | varchar2(255) |
| 10 | start_date | start_date | start_date | timestamp(6) |
| 11 | status | status | status | number(38, 0) |
| 12 | sys_tenant_id | sys_tenant_id | sys_tenant_id | varchar2(255) |
| 13 | tenant_id | tenant_id | tenant_id | varchar2(255) |
| 14 | ts | ts | ts | timestamp(6) |  |  | cast(sysdate as timestamp) |