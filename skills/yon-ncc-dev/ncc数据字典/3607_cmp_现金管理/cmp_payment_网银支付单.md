# |<<

**网银支付单 (cmp_payment / nc.vo.cmp.payment.PaymentCrumbVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1575.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_payment | 支付单主键 | pk_payment | char(20) | √ | 主键 (UFID) |
| 2 | pk_corp | 公司 | pk_corp | char(4) |  | 主键 (UFID) |
| 3 | serial | 序列号 | serial | varchar(50) |  | 字符串 (String) |
| 4 | yurref | 参考号 | yurref | varchar(60) |  | 字符串 (String) |
| 5 | payer | 支付人 | payer | varchar(20) |  | 用户 (user) |
| 6 | paydate | 支付日期 | paydate | char(19) |  | 日期 (UFDate) |
| 7 | paystatus | 支付状态 | paystatus | int |  | 支付状态 (enum) |  | 0=支付成功; |