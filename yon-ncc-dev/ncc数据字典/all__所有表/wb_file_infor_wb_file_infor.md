# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12954.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(36) | √ |
| 2 | create_date | create_date | create_date | timestamp(6) |
| 3 | file_size | file_size | file_size | number(38, 0) | √ |
| 4 | file_type | file_type | file_type | varchar2(255) | √ |
| 5 | name | name | name | varchar2(255) |
| 6 | pid | pid | pid | varchar2(36) |
| 7 | store_type | store_type | store_type | varchar2(20) | √ |
| 8 | url | url | url | varchar2(255) | √ |
| 9 | ts | ts | ts | timestamp(6) |  |  | cast(sysdate as timestamp) |