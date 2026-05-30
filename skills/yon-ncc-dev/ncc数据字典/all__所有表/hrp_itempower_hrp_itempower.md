# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8774.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_item_power | pk_item_power | pk_item_power | char(20) | √ |
| 2 | impower_object | impower_object | impower_object | varchar2(20) |  |  | '~' |
| 3 | impower_type | impower_type | impower_type | number(38, 0) |
| 4 | item_year | item_year | item_year | char(4) |
| 5 | pk_budgetitem | pk_budgetitem | pk_budgetitem | varchar2(20) |  |  | '~' |
| 6 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 7 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 8 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 9 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |