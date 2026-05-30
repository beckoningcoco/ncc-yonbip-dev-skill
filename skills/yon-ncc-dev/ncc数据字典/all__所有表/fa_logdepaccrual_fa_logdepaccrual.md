# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8146.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_logdepaccrual | pk_logdepaccrual | pk_logdepaccrual | char(20) | √ |
| 2 | accounting_period | accounting_period | accounting_period | varchar2(50) |
| 3 | begin_liability | begin_liability | begin_liability | number(28, 8) |
| 4 | end_liability | end_liability | end_liability | number(28, 8) |
| 5 | local_accrued_interest | local_accrued_interest | local_accrued_interest | number(28, 8) |
| 6 | local_interest | local_interest | local_interest | number(28, 8) |
| 7 | pk_accbook | pk_accbook | pk_accbook | varchar2(20) |  |  | '~' |
| 8 | pk_card | pk_card | pk_card | char(20) |
| 9 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 10 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |