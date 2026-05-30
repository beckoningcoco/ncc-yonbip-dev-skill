# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8130.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_expense | pk_expense | pk_expense | char(20) | √ |
| 2 | digest | digest | digest | varchar2(80) |
| 3 | money | money | money | number(28, 8) |
| 4 | occur_date | occur_date | occur_date | char(19) |
| 5 | pk_bill | pk_bill | pk_bill | varchar2(20) |
| 6 | pk_bill_b | pk_bill_b | pk_bill_b | varchar2(20) |
| 7 | pk_card | pk_card | pk_card | char(20) | √ |
| 8 | pk_costsubj | pk_costsubj | pk_costsubj | varchar2(20) |  |  | '~' |
| 9 | remark | remark | remark | varchar2(200) |
| 10 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 11 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |