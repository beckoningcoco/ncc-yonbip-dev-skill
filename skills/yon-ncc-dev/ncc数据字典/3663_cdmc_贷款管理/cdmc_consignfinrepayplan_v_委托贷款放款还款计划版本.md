# |<<

**委托贷款放款还款计划版本 (cdmc_consignfinrepayplan_v / nc.vo.cdmc.ccm.consigncreditfinancepay.version.ConsignCreditFinRepayPlanVersionVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1351.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_version_b | 主键 | pk_version_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_consignrepayplan_b | 子表pk | pk_consignrepayplan_b | char(20) |  | 主键 (UFID) |
| 3 | rowno | 行号 | rowno | varchar(50) |  | 字符串 (String) |
| 4 | repayplancode | 还款计划编码 | repayplancode | varchar(50) |  | 字符串 (String) |
| 5 | repayplandate | 计划还款日期 | repayplandate | char(19) |  | 日期时间 (UFDateTime) |
| 6 | olcrate | 组织本币汇率 | olcrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 7 | glcrate | 集团本币汇率 | glcrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | gllcrate | 全局本币汇率 | gllcrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | planrepayprcpmny | 预计还本金 | planrepayprcpmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 10 | olcplanrepayprcpmny | 预计还本金本币 | olcplanrepayprcpmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 11 | glcplanrepayprcpmny | 预计还本集团本币金额 | glcplanrepayprcpmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 12 | gllcplanrepayprcpmny | 预计还本全局本币金额 | gllcplanrepayprcpmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 13 | planrepayintstmny | 预计付利息 | planrepayintstmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 14 | olcplanrepayintstmny | 预计付利息本币 | olcplanrepayintstmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 15 | glcplanrepayintstmny | 预计付利息集团本币金额 | glcplanrepayintstmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 16 | gllcplanrepayintstmny | 预计付利息全局本币金额 | gllcplanrepayintstmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 17 | advcrepaymny | 提前还本金额 | advcrepaymny | decimal(28, 8) |  | 金额 (UFMoney) |
| 18 | olcadvcrepaymny | 提前还本本币金额 | olcadvcrepaymny | decimal(28, 8) |  | 金额 (UFMoney) |
| 19 | glcadvcrepaymny | 提前还本集团本币金额 | glcadvcrepaymny | decimal(28, 8) |  | 金额 (UFMoney) |
| 20 | gllcadvcrepaymny | 提前还本全局本币金额 | gllcadvcrepaymny | decimal(28, 8) |  | 金额 (UFMoney) |
| 21 | prcpintstsummny | 本利合计 | prcpintstsummny | decimal(28, 8) |  | 金额 (UFMoney) |
| 22 | olcprcpintstsummny | 本利合计本币金额 | olcprcpintstsummny | decimal(28, 8) |  | 金额 (UFMoney) |
| 23 | glcprcpintstsummny | 本利合计集团本币金额 | glcprcpintstsummny | decimal(28, 8) |  | 金额 (UFMoney) |
| 24 | gllcprcpintstsummny | 本利合计全局本币金额 | gllcprcpintstsummny | decimal(28, 8) |  | 金额 (UFMoney) |
| 25 | busitype | 业务类型 | busitype | varchar(50) |  | 业务类型 (BusiTypeEnum) |  | DEBIT=委借; |