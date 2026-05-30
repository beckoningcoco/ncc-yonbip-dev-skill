# |<<

**还本计划 (cdmc_repprcpl_plan / nc.vo.cdmc.cdm.repayprcpl.RepayPrcplPlanVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1403.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_repprcpl_plan | 主键 | pk_repprcpl_plan | char(20) | √ | 主键 (UFID) |
| 2 | pk_repayprcpl | 还本主表主键 | pk_repayprcpl | char(20) |  | 主键 (UFID) |
| 3 | pk_repayplan | 还款计划编号 | pk_repayplan | varchar(20) |  | 还款计划 (PlanRepayVO) |
| 4 | shdrepaymny | 应还本金 | shdrepaymny | decimal(28, 8) |  | 金额 (UFMoney) |
| 5 | shdrepayolcmny | 应还本金组织本币 | shdrepayolcmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 6 | shdrepayglcmny | 应还本金集团本币 | shdrepayglcmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 7 | shdrepaygllcmny | 应还本金全局本币 | shdrepaygllcmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 8 | actrepaymny | 折算放款还本金额 | actrepaymny | decimal(28, 8) |  | 金额 (UFMoney) |
| 9 | actrepayolcmny | 组织折算放款还本本币 | actrepayolcmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 10 | actrepayglcmny | 集团折算放款还本本币 | actrepayglcmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 11 | actrepaygllcmny | 全局折算放款还本本币 | actrepaygllcmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 12 | repaydate | 还本日期 | repaydate | char(19) |  | 日期时间 (UFDateTime) |
| 13 | pk_plancurrtype | 还款计划币种 | pk_plancurrtype | varchar(20) |  | 币种 (currtype) |
| 14 | pk_financepay_b | 放款编号 | pk_financepay_b | varchar(20) |  | 贷款放款 (FinancepayVO) |
| 15 | intrstoffbyprcplflag | 利随本清 | intrstoffbyprcplflag | char(1) |  | 布尔类型 (UFBoolean) |
| 16 | isadvancerepay | 提前还本 | isadvancerepay | char(1) |  | 布尔类型 (UFBoolean) |
| 17 | regenrepayplan | 是否重算 | regenrepayplan | char(1) |  | 布尔类型 (UFBoolean) |
| 18 | debittoloan | 借转贷 | debittoloan | char(1) |  | 布尔类型 (UFBoolean) |
| 19 | olcrate | 组织本币汇率 | olcrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | glcrate | 集团本币汇率 | glcrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | gllcrate | 全局本币汇率 | gllcrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 22 | finactrepaymny | 还本金额 | finactrepaymny | decimal(28, 8) |  | 金额 (UFMoney) |
| 23 | finactrepayolcmny | 还本金额组织本币 | finactrepayolcmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 24 | finactrepayglcmny | 还本金额集团本币 | finactrepayglcmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 25 | finactrepaygllcmny | 还本金额全局本币 | finactrepaygllcmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 26 | intstmny | 利息金额 | intstmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 27 | olcintstmny | 利息本币金额 | olcintstmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 28 | fin_intstmny | 折算放款利息金额 | fin_intstmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 29 | vdef1 | 自定义项1 | vdef1 | varchar(101) |  | 自定义项 (Custom) |
| 30 | vdef2 | 自定义项2 | vdef2 | varchar(101) |  | 自定义项 (Custom) |
| 31 | vdef3 | 自定义项3 | vdef3 | varchar(101) |  | 自定义项 (Custom) |
| 32 | vdef4 | 自定义项4 | vdef4 | varchar(101) |  | 自定义项 (Custom) |
| 33 | vdef5 | 自定义项5 | vdef5 | varchar(101) |  | 自定义项 (Custom) |
| 34 | vdef6 | 自定义项6 | vdef6 | varchar(101) |  | 自定义项 (Custom) |
| 35 | vdef7 | 自定义项7 | vdef7 | varchar(101) |  | 自定义项 (Custom) |
| 36 | vdef8 | 自定义项8 | vdef8 | varchar(101) |  | 自定义项 (Custom) |
| 37 | vdef9 | 自定义项9 | vdef9 | varchar(101) |  | 自定义项 (Custom) |
| 38 | vdef10 | 自定义项10 | vdef10 | varchar(101) |  | 自定义项 (Custom) |
| 39 | vdef11 | 自定义项11 | vdef11 | varchar(101) |  | 自定义项 (Custom) |
| 40 | vdef12 | 自定义项12 | vdef12 | varchar(101) |  | 自定义项 (Custom) |
| 41 | vdef13 | 自定义项13 | vdef13 | varchar(101) |  | 自定义项 (Custom) |
| 42 | vdef14 | 自定义项14 | vdef14 | varchar(101) |  | 自定义项 (Custom) |
| 43 | vdef15 | 自定义项15 | vdef15 | varchar(101) |  | 自定义项 (Custom) |
| 44 | vdef16 | 自定义项16 | vdef16 | varchar(101) |  | 自定义项 (Custom) |
| 45 | vdef17 | 自定义项17 | vdef17 | varchar(101) |  | 自定义项 (Custom) |
| 46 | vdef18 | 自定义项18 | vdef18 | varchar(101) |  | 自定义项 (Custom) |
| 47 | vdef19 | 自定义项19 | vdef19 | varchar(101) |  | 自定义项 (Custom) |
| 48 | vdef20 | 自定义项20 | vdef20 | varchar(101) |  | 自定义项 (Custom) |