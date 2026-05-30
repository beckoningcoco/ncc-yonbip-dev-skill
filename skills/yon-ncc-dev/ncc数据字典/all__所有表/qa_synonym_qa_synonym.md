# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11077.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(36) | √ |
| 2 | created_by | created_by | created_by | varchar2(36) |
| 3 | created_date | created_date | created_date | timestamp(6) |
| 4 | field_code | field_code | field_code | varchar2(100) |
| 5 | field_name | field_name | field_name | varchar2(100) |
| 6 | key_type | key_type | key_type | varchar2(32) |
| 7 | last_modified_by | last_modified_by | last_modified_by | varchar2(36) |
| 8 | last_modified_date | last_modified_date | last_modified_date | timestamp(6) |
| 9 | modify_assert | modify_assert | modify_assert | clob |
| 10 | ori_code | ori_code | ori_code | varchar2(100) |
| 11 | ori_name | ori_name | ori_name | varchar2(100) |
| 12 | ori_type | ori_type | ori_type | varchar2(32) |
| 13 | resource_id | resource_id | resource_id | varchar2(36) |
| 14 | resource_type | resource_type | resource_type | varchar2(20) |
| 15 | show_assert | show_assert | show_assert | clob |
| 16 | synonym_name | synonym_name | synonym_name | varchar2(100) |
| 17 | synonym_type | synonym_type | synonym_type | varchar2(20) |
| 18 | sys_tenant_id | sys_tenant_id | sys_tenant_id | varchar2(36) |
| 19 | tenant_id | tenant_id | tenant_id | varchar2(36) |
| 20 | ts | ts | ts | timestamp(6) | √ |  | cast(sysdate as timestamp) |