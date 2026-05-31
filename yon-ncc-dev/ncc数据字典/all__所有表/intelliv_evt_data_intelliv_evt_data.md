# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9237.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | event_id | event_id | event_id | number(38, 0) | √ |
| 2 | name | name | name | varchar2(150) | √ |
| 3 | value | value | value | varchar2(255) |
| 4 | ts | ts | ts | timestamp(6) |  |  | cast(sysdate as timestamp) |