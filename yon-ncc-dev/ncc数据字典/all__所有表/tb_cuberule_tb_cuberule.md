# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12001.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_obj | pk_obj | pk_obj | char(20) | √ |
| 2 | orderindex | orderindex | orderindex | number(38, 0) |
| 3 | pk_busirule | pk_busirule | pk_busirule | char(20) | √ |
| 4 | pk_cube | pk_cube | pk_cube | char(20) | √ |
| 5 | rule_type | rule_type | rule_type | char(1) | √ |
| 6 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 7 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |