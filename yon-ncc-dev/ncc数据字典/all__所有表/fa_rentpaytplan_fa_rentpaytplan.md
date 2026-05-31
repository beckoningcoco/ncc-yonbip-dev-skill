# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8163.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_rentpayplan | pk_rentpayplan | pk_rentpayplan | char(20) | √ |
| 2 | accounting_period | accounting_period | accounting_period | char(19) |
| 3 | adjustment_renttax | adjustment_renttax | adjustment_renttax | number(28, 8) |
| 4 | amount_type | amount_type | amount_type | number(38, 0) |  |  | 1 |
| 5 | calculate_rentnotax | calculate_rentnotax | calculate_rentnotax | number(28, 8) |
| 6 | calculate_renttax | calculate_renttax | calculate_renttax | number(28, 8) |
| 7 | calculate_tax | calculate_tax | calculate_tax | number(28, 8) |
| 8 | end_date | end_date | end_date | char(19) |
| 9 | nocalculate | nocalculate | nocalculate | char(1) |
| 10 | period_num | period_num | period_num | number(38, 0) |
| 11 | pk_card | pk_card | pk_card | char(20) |
| 12 | remarks | remarks | remarks | varchar2(200) |
| 13 | renewal_flag | renewal_flag | renewal_flag | char(1) |
| 14 | start_date | start_date | start_date | char(19) |
| 15 | def1 | def1 | def1 | varchar2(101) |
| 16 | def2 | def2 | def2 | varchar2(101) |
| 17 | def3 | def3 | def3 | varchar2(101) |
| 18 | def4 | def4 | def4 | varchar2(101) |
| 19 | def5 | def5 | def5 | varchar2(101) |
| 20 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 21 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |