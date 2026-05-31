# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9236.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | event_id | event_id | event_id | number(38, 0) | √ |
| 2 | event_date | event_date | event_date | timestamp(6) |
| 3 | event_type | event_type | event_type | varchar2(255) |
| 4 | principal | principal | principal | varchar2(50) | √ |
| 5 | ts | ts | ts | timestamp(6) |  |  | cast(sysdate as timestamp) |