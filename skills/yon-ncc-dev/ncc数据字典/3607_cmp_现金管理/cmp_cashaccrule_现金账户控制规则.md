# |<<

**现金账户控制规则 (cmp_cashaccrule / nc.vo.cmp.cashaccrule.CashaccRuleVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1541.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cashaccrule | 现金账户控制规则主键 | pk_cashaccrule | char(20) | √ | 主键 (UFID) |
| 2 | pk_cashaccount | 现金账户主键 | pk_cashaccount | varchar(20) |  | 现金账户 (cashaccount) |
| 3 | islowmnycontrol | 最低余额控制 | islowmnycontrol | char(1) |  | 布尔类型 (UFBoolean) |
| 4 | lowmoney | 最低余额 | lowmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 5 | lowmnycontrolsche | 最低余额控制方案 | lowmnycontrolsche | varchar(10) |  | 控制方案 (controlschedule) |  | hint=提示信息; |