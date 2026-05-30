# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/13017.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(64) | √ |
| 2 | begin_date | begin_date | begin_date | varchar2(255) |
| 3 | client | client | client | varchar2(255) |
| 4 | created_by | created_by | created_by | varchar2(255) |
| 5 | created_date | created_date | created_date | timestamp(6) |  |  | null |
| 6 | end_date | end_date | end_date | varchar2(255) |
| 7 | last_modified_by | last_modified_by | last_modified_by | varchar2(255) |
| 8 | last_modified_date | last_modified_date | last_modified_date | timestamp(6) |  |  | null |
| 9 | params | params | params | clob |
| 10 | status | status | status | number(38, 0) |
| 11 | sys_code | sys_code | sys_code | varchar2(255) |
| 12 | tenant_id | tenant_id | tenant_id | varchar2(255) |
| 13 | ts | ts | ts | timestamp(6) |  |  | cast(sysdate as timestamp) |