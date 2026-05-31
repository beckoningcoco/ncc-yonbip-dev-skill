# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12933.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(36) | √ |
| 2 | created_by | created_by | created_by | varchar2(255) |
| 3 | created_date | created_date | created_date | timestamp(6) |
| 4 | is_default | is_default | is_default | number(38, 0) |
| 5 | last_modified_by | last_modified_by | last_modified_by | varchar2(255) |
| 6 | last_modified_date | last_modified_date | last_modified_date | timestamp(6) |
| 7 | set_id | set_id | set_id | varchar2(36) |
| 8 | version_code | version_code | version_code | varchar2(255) |
| 9 | version_name | version_name | version_name | varchar2(255) |
| 10 | ts | ts | ts | timestamp(6) |  |  | cast(sysdate as timestamp) |