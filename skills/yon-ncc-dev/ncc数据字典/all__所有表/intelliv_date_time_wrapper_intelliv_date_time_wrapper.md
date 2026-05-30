# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9235.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | number(38, 0) | √ |
| 2 | instant | instant | instant | timestamp(6) |
| 3 | local_date | local_date | local_date | timestamp(6) |
| 4 | local_date_time | local_date_time | local_date_time | timestamp(6) |
| 5 | local_time | local_time | local_time | timestamp(6) |
| 6 | offset_date_time | offset_date_time | offset_date_time | timestamp(6) |
| 7 | offset_time | offset_time | offset_time | timestamp(6) |
| 8 | zoned_date_time | zoned_date_time | zoned_date_time | timestamp(6) |
| 9 | ts | ts | ts | timestamp(6) |  |  | cast(sysdate as timestamp) |