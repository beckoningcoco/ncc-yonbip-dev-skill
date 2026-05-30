# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11072.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | number(38, 0) |
| 2 | key_type_name | key_type_name | key_type_name | varchar2(32) | √ |
| 3 | key_type_value | key_type_value | key_type_value | varchar2(32) | √ |
| 4 | key_word | key_word | key_word | varchar2(64) | √ |
| 5 | ts | ts | ts | timestamp(6) |  |  | cast(sysdate as timestamp) |