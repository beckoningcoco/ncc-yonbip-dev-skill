# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/13016.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(64) | √ |
| 2 | business_record_pk | business_record_pk | business_record_pk | varchar2(255) | √ |
| 3 | created_by | created_by | created_by | varchar2(255) |
| 4 | created_date | created_date | created_date | timestamp(6) |  |  | null |
| 5 | description | description | description | varchar2(255) |
| 6 | last_modified_by | last_modified_by | last_modified_by | varchar2(255) |
| 7 | last_modified_date | last_modified_date | last_modified_date | timestamp(6) |  |  | null |
| 8 | record_type_pk | record_type_pk | record_type_pk | varchar2(255) | √ |
| 9 | status | status | status | number(38, 0) | √ |
| 10 | sys_tenant_id | sys_tenant_id | sys_tenant_id | varchar2(255) | √ |
| 11 | tenant_id | tenant_id | tenant_id | varchar2(255) | √ |
| 12 | tenant_pk | tenant_pk | tenant_pk | varchar2(255) | √ |
| 13 | ts | ts | ts | timestamp(6) |  |  | cast(sysdate as timestamp) |