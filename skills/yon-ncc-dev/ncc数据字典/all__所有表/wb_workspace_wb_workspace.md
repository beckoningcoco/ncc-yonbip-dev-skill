# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/13024.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(64) | √ |
| 2 | code | code | code | varchar2(50) | √ |
| 3 | created_by | created_by | created_by | varchar2(255) |
| 4 | created_date | created_date | created_date | timestamp(6) |  |  | null |
| 5 | last_modified_by | last_modified_by | last_modified_by | varchar2(255) |
| 6 | last_modified_date | last_modified_date | last_modified_date | timestamp(6) |  |  | null |
| 7 | name | name | name | varchar2(255) | √ |
| 8 | ts | ts | ts | timestamp(6) |  |  | cast(sysdate as timestamp) |