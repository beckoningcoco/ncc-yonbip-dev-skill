# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8164.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_rent | pk_rent | pk_rent | char(20) | √ |
| 2 | area | area | area | number(28, 8) |
| 3 | fact_date | fact_date | fact_date | char(19) |
| 4 | fact_rent | fact_rent | fact_rent | number(28, 8) |
| 5 | month_rent | month_rent | month_rent | number(28, 8) |
| 6 | pk_bill | pk_bill | pk_bill | varchar2(20) |
| 7 | pk_bill_b | pk_bill_b | pk_bill_b | varchar2(20) |
| 8 | pk_card | pk_card | pk_card | char(20) | √ |
| 9 | rent_date | rent_date | rent_date | char(19) |
| 10 | reside_period | reside_period | reside_period | varchar2(80) |
| 11 | term_date | term_date | term_date | char(19) |
| 12 | total_rent | total_rent | total_rent | number(28, 8) |
| 13 | undertaker | undertaker | undertaker | varchar2(80) |
| 14 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 15 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |