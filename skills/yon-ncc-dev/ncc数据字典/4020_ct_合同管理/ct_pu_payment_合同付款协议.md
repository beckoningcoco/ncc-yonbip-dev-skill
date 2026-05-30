# |<<

**合同付款协议 (ct_pu_payment / nc.vo.ct.purdaily.entity.CtPaymentVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1671.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ct_pu_payment | 合同付款协议 | pk_ct_pu_payment | char(20) | √ | 主键 (UFID) |
| 2 | showorder | 付款期 | showorder | int |  | 整数 (Integer) |
| 3 | accrate | 付款比例（%） | accrate | decimal(16, 4) |  | 数值 (UFDouble) |
| 4 | prepayment | 预付款 | prepayment | char(1) |  | 布尔类型 (UFBoolean) |
| 5 | pk_payperiod | 起效日期 | pk_payperiod | varchar(20) |  | 付款时点 (payperiod) |
| 6 | effectdateadddate | 起效日期延期天数 | effectdateadddate | int |  | 整数 (Integer) |
| 7 | paymentday | 账期天数 | paymentday | int |  | 整数 (Integer) |
| 8 | checkdata | 固定结账日 | checkdata | int |  | 整数 (Integer) |
| 9 | effectmonth | 生效月 | effectmonth | int |  | 生效月 (CtEffectMonth) |  | 0=当月生效; |