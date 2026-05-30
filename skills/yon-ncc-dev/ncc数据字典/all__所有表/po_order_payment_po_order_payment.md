# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10777.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_payment | pk_payment | pk_payment | char(20) | √ |
| 2 | accountday | accountday | accountday | number(38, 0) |
| 3 | accrate | accrate | accrate | number(16, 4) | √ |
| 4 | checkdata | checkdata | checkdata | number(38, 0) |
| 5 | effectaddmonth | effectaddmonth | effectaddmonth | number(38, 0) |
| 6 | effectdateadddate | effectdateadddate | effectdateadddate | number(38, 0) |  |  | 0 |
| 7 | effectmonth | effectmonth | effectmonth | number(38, 0) |
| 8 | isdeposit | isdeposit | isdeposit | char(1) |
| 9 | paymentday | paymentday | paymentday | number(38, 0) |  |  | 0 |
| 10 | pk_balatype | pk_balatype | pk_balatype | varchar2(20) |  |  | '~' |
| 11 | pk_order | pk_order | pk_order | char(20) | √ |
| 12 | pk_payperiod | pk_payperiod | pk_payperiod | varchar2(20) | √ |  | '~' |
| 13 | pk_rate | pk_rate | pk_rate | varchar2(20) |  |  | '~' |
| 14 | prepayment | prepayment | prepayment | char(1) |
| 15 | showorder | showorder | showorder | number(38, 0) | √ |
| 16 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 17 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |