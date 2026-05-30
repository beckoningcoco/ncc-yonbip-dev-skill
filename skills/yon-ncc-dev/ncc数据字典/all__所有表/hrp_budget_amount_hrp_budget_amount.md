# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8758.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_budget_amount | pk_budget_amount | pk_budget_amount | char(20) | √ |
| 2 | pk_budget | pk_budget | pk_budget | char(20) |
| 3 | pk_budget_item | pk_budget_item | pk_budget_item | varchar2(20) |
| 4 | publish_state | publish_state | publish_state | number(38, 0) |
| 5 | value_def | value_def | value_def | number(31, 8) |
| 6 | value_junior | value_junior | value_junior | number(31, 8) |
| 7 | value_self | value_self | value_self | number(31, 8) |
| 8 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 9 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |