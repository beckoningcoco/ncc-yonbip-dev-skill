# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/13023.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(64) | √ |
| 2 | created_by | created_by | created_by | varchar2(255) |
| 3 | created_date | created_date | created_date | timestamp(6) |  |  | null |
| 4 | last_modified_by | last_modified_by | last_modified_by | varchar2(255) |
| 5 | last_modified_date | last_modified_date | last_modified_date | timestamp(6) |  |  | null |
| 6 | mobile_tenant_id | mobile_tenant_id | mobile_tenant_id | varchar2(64) |
| 7 | tenant_id | tenant_id | tenant_id | varchar2(255) | √ |
| 8 | user_pk | user_pk | user_pk | varchar2(255) | √ |
| 9 | ts | ts | ts | timestamp(6) |  |  | cast(sysdate as timestamp) |