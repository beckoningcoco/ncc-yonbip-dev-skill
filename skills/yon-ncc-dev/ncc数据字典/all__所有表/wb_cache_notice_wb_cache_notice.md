# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12928.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(36) | √ |
| 2 | cache_key | cache_key | cache_key | varchar2(128) | √ |
| 3 | cache_name | cache_name | cache_name | varchar2(128) | √ |
| 4 | created_by | created_by | created_by | varchar2(255) |
| 5 | created_date | created_date | created_date | timestamp(6) |
| 6 | last_modified_by | last_modified_by | last_modified_by | varchar2(255) |
| 7 | last_modified_date | last_modified_date | last_modified_date | timestamp(6) |
| 8 | notice_type | notice_type | notice_type | number(38, 0) | √ |
| 9 | server_ids | server_ids | server_ids | varchar2(255) |  |  | '' |
| 10 | ts | ts | ts | timestamp(6) | √ |  | cast(sysdate as timestamp) |