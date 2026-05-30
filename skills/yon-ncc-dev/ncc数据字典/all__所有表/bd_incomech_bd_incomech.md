# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6952.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_paymentch | pk_paymentch | pk_paymentch | char(20) | √ |
| 2 | accountday | accountday | accountday | number(38, 0) |
| 3 | accrate | accrate | accrate | number(28, 8) |
| 4 | checkdata | checkdata | checkdata | number(38, 0) |
| 5 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |
| 6 | effectaddmonth | effectaddmonth | effectaddmonth | number(38, 0) |
| 7 | effectdate | effectdate | effectdate | varchar2(50) |
| 8 | effectdateadddate | effectdateadddate | effectdateadddate | number(38, 0) |  |  | 0 |
| 9 | effectmonth | effectmonth | effectmonth | char(4) |
| 10 | isdeposit | isdeposit | isdeposit | char(1) |
| 11 | paymentday | paymentday | paymentday | number(38, 0) |  |  | 0 |
| 12 | pk_balatype | pk_balatype | pk_balatype | varchar2(20) |  |  | '~' |
| 13 | pk_incomeperiod | pk_incomeperiod | pk_incomeperiod | varchar2(20) |
| 14 | pk_payment | pk_payment | pk_payment | char(20) | √ |
| 15 | pk_rate | pk_rate | pk_rate | varchar2(20) |  |  | '~' |
| 16 | prepayment | prepayment | prepayment | char(1) |
| 17 | showorder | showorder | showorder | number(38, 0) |
| 18 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 19 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |