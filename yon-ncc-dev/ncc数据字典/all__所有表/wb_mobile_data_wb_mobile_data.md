# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12979.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(36) | √ |
| 2 | created_by | created_by | created_by | varchar2(255) |
| 3 | created_date | created_date | created_date | timestamp(6) |
| 4 | last_modified_by | last_modified_by | last_modified_by | varchar2(255) |
| 5 | last_modified_date | last_modified_date | last_modified_date | timestamp(6) |
| 6 | name | name | name | varchar2(255) |
| 7 | pid | pid | pid | varchar2(36) |
| 8 | sys_tenant_id | sys_tenant_id | sys_tenant_id | varchar2(255) |
| 9 | tenant_id | tenant_id | tenant_id | varchar2(255) |
| 10 | type | type | type | varchar2(255) |
| 11 | ts | ts | ts | timestamp(6) |  |  | cast(sysdate as timestamp) |