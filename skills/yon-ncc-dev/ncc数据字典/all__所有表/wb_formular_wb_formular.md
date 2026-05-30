# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12955.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(64) | √ |
| 2 | code | code | code | varchar2(255) |
| 3 | created_by | created_by | created_by | varchar2(255) |
| 4 | created_date | created_date | created_date | timestamp(6) |  |  | null |
| 5 | data_info | data_info | data_info | clob | √ |
| 6 | define | define | define | clob |
| 7 | description | description | description | clob |
| 8 | domain | domain | domain | varchar2(255) | √ |
| 9 | ds_type | ds_type | ds_type | varchar2(36) |
| 10 | entity | entity | entity | varchar2(255) | √ |
| 11 | last_modified_by | last_modified_by | last_modified_by | varchar2(255) |
| 12 | last_modified_date | last_modified_date | last_modified_date | timestamp(6) |  |  | null |
| 13 | name | name | name | varchar2(255) |
| 14 | sys_tenant_id | sys_tenant_id | sys_tenant_id | varchar2(255) |
| 15 | tenant_id | tenant_id | tenant_id | varchar2(255) |
| 16 | type | type | type | varchar2(36) |
| 17 | ts | ts | ts | timestamp(6) |  |  | cast(sysdate as timestamp) |