# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12953.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(36) | √ |
| 2 | created_by | created_by | created_by | varchar2(36) |
| 3 | created_date | created_date | created_date | timestamp(6) |
| 4 | file_id | file_id | file_id | varchar2(36) | √ |
| 5 | last_modified_by | last_modified_by | last_modified_by | varchar2(36) |
| 6 | last_modified_date | last_modified_date | last_modified_date | timestamp(6) |
| 7 | name | name | name | varchar2(255) |
| 8 | share_state | share_state | share_state | number(38, 0) |  |  | 0 |
| 9 | store_type | store_type | store_type | varchar2(20) |
| 10 | sys_tenant_id | sys_tenant_id | sys_tenant_id | varchar2(36) |
| 11 | tenant_id | tenant_id | tenant_id | varchar2(36) |
| 12 | ts | ts | ts | timestamp(6) |  |  | cast(sysdate as timestamp) |