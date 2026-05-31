# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12968.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(255) | √ |
| 2 | ana_id | ana_id | ana_id | varchar2(255) |
| 3 | created_by | created_by | created_by | varchar2(255) |
| 4 | created_date | created_date | created_date | timestamp(6) |  |  | null |
| 5 | ds_id | ds_id | ds_id | varchar2(255) |
| 6 | last_modified_by | last_modified_by | last_modified_by | varchar2(255) |
| 7 | last_modified_date | last_modified_date | last_modified_date | timestamp(6) |  |  | null |
| 8 | report_key | report_key | report_key | varchar2(255) |
| 9 | sys_tenant_id | sys_tenant_id | sys_tenant_id | varchar2(255) |
| 10 | tenant_id | tenant_id | tenant_id | varchar2(255) |
| 11 | ts | ts | ts | timestamp(6) |  |  | cast(sysdate as timestamp) |