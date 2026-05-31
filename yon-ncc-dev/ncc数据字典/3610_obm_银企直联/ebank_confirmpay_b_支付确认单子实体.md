# |<<

**支付确认单子实体 (ebank_confirmpay_b / nc.vo.obm.ebankconfirmpay.ConfirmPayBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1756.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_confirmpay_b | 支付确认单字表主键 | pk_confirmpay_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_confirmpay_h | 主表主键 | pk_confirmpay_h | varchar(20) |  | 支付确认单 (ebank_confirmpay_h) |
| 3 | sourcebillpk | 来源子表主键 | sourcebillpk | varchar(36) |  | 字符串 (String) |
| 4 | cdtracc | 收款银行账号 | cdtracc | varchar(50) |  | 字符串 (String) |
| 5 | cdtraccname | 收方账户名称 | cdtraccname | varchar(100) |  | 字符串 (String) |
| 6 | cdtrbranchname | 收款开户银行 | cdtrbranchname | varchar(100) |  | 字符串 (String) |
| 7 | acceptstate | 受理状态 | acceptstate | int |  | 记录受理状态 (stateEnum) |  | -1=未补录; |