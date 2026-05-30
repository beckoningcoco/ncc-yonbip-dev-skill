# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/13021.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(255) | √ |
| 2 | created_by | created_by | created_by | varchar2(255) |
| 3 | created_date | created_date | created_date | timestamp(6) |
| 4 | last_modified_by | last_modified_by | last_modified_by | varchar2(255) |
| 5 | last_modified_date | last_modified_date | last_modified_date | timestamp(6) |
| 6 | p_type | p_type | p_type | varchar2(255) |
| 7 | p_value | p_value | p_value | clob |
| 8 | tenant_id | tenant_id | tenant_id | varchar2(255) |
| 9 | user_id | user_id | user_id | varchar2(255) |
| 10 | ts | ts | ts | timestamp(6) |  |  | cast(sysdate as timestamp) |