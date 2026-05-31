# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12964.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(64) | √ |
| 2 | attribute_id | attribute_id | attribute_id | varchar2(36) |
| 3 | created_by | created_by | created_by | varchar2(255) |
| 4 | created_date | created_date | created_date | timestamp(6) |  |  | null |
| 5 | default_rule | default_rule | default_rule | number(38, 0) | √ |  | -1 |
| 6 | function_code | function_code | function_code | varchar2(255) |
| 7 | label_code | label_code | label_code | varchar2(255) | √ |
| 8 | label_name | label_name | label_name | varchar2(255) | √ |
| 9 | label_type | label_type | label_type | number(38, 0) | √ |  | -1 |
| 10 | last_modified_by | last_modified_by | last_modified_by | varchar2(255) |
| 11 | last_modified_date | last_modified_date | last_modified_date | timestamp(6) |  |  | null |
| 12 | members | members | members | clob |
| 13 | sys_tenant_id | sys_tenant_id | sys_tenant_id | varchar2(255) | √ |
| 14 | tenant_id | tenant_id | tenant_id | varchar2(255) | √ |
| 15 | ts | ts | ts | timestamp(6) |  |  | cast(sysdate as timestamp) |