# |<<

**付款账期 (bd_paymentch / nc.vo.bd.payment.PaymentChVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/921.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_paymentch | 账期主键 | pk_paymentch | char(20) | √ | 主键 (UFID) |
| 2 | showorder | 付款期 | showorder | smallint | √ | 整数 (Integer) |
| 3 | accrate | 付款比例 | accrate | decimal(16, 4) | √ | 数值 (UFDouble) |
| 4 | prepayment | 预付款 | prepayment | char(1) |  | 布尔类型 (UFBoolean) |
| 5 | pk_payperiod | 账期起效日期 | pk_payperiod | varchar(20) | √ | 付款时点 (payperiod) |
| 6 | effectdateadddate | 起效日期延迟天数 | effectdateadddate | int |  | 整数 (Integer) | 0 |
| 7 | paymentday | 账期天数 | paymentday | int |  | 整数 (Integer) | 0 |
| 8 | checkdata | 固定结账日 | checkdata | int |  | 整数 (Integer) |
| 9 | effectmonth | 生效月 | effectmonth | char(4) |  | 生效月 (effectmonth) |  | 0=当月生效; |