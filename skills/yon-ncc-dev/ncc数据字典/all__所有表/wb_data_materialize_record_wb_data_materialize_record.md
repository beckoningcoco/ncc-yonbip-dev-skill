# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12938.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | created_by | created_by | created_by | varchar2(255) |
| 2 | created_date | created_date | created_date | timestamp(6) |
| 3 | data_count | data_count | data_count | number(38, 0) |  |  | 0 |
| 4 | error_message | error_message | error_message | clob |
| 5 | id | id | id | varchar2(36) | √ |
| 6 | last_modified_by | last_modified_by | last_modified_by | varchar2(255) |
| 7 | last_modified_date | last_modified_date | last_modified_date | timestamp(6) |
| 8 | status | status | status | varchar2(10) |
| 9 | time_consuming | time_consuming | time_consuming | number(38, 0) |
| 10 | trigger_id | trigger_id | trigger_id | varchar2(36) | √ |
| 11 | vtrace | vtrace | vtrace | varchar2(100) |
| 12 | ts | ts | ts | timestamp(6) | √ |  | cast(sysdate as timestamp) |