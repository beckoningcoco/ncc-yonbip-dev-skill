# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/13010.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(64) | √ |
| 2 | created_by | created_by | created_by | varchar2(255) |
| 3 | created_date | created_date | created_date | timestamp(6) |  |  | null |
| 4 | inner_id | inner_id | inner_id | varchar2(36) |
| 5 | last_modified_by | last_modified_by | last_modified_by | varchar2(255) |
| 6 | last_modified_date | last_modified_date | last_modified_date | timestamp(6) |  |  | null |
| 7 | pid | pid | pid | varchar2(255) |
| 8 | sheet_name | sheet_name | sheet_name | varchar2(255) |
| 9 | sheet_type | sheet_type | sheet_type | varchar2(20) |
| 10 | show_seqs | show_seqs | show_seqs | number(38, 0) |
| 11 | sys_tenant_id | sys_tenant_id | sys_tenant_id | varchar2(255) |
| 12 | tenant_id | tenant_id | tenant_id | varchar2(255) |
| 13 | ts | ts | ts | timestamp(6) |  |  | cast(sysdate as timestamp) |