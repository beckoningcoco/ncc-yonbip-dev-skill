# |<<

**还本计划 (icdmc_repprcpl_plan / nc.vo.icdmc.icdmc.repayprcpl.RepayPrcplPlanVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3064.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_repprcpl_plan_c | 主键 | pk_repprcpl_plan_c | char(20) | √ | 主键 (UFID) |
| 2 | pk_repayplan | 还款计划编号 | pk_repayplan | varchar(20) |  | 还款计划 (PlanRepayVO) |
| 3 | shdrepaymny | 计划还本金 | shdrepaymny | decimal(28, 8) |  | 金额 (UFMoney) |
| 4 | shdrepayolcmny | 计划还本金组织本币 | shdrepayolcmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 5 | shdrepayglcmny | 计划还本金集团本币 | shdrepayglcmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 6 | shdrepaygllcmny | 计划还本金全局本币 | shdrepaygllcmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 7 | actrepaymny | 实还本金 | actrepaymny | decimal(28, 8) |  | 金额 (UFMoney) |
| 8 | actrepayolcmny | 实还本金组织本币 | actrepayolcmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 9 | actrepayglcmny | 实还本金集团本币 | actrepayglcmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 10 | actrepaygllcmny | 实还本金全局本币 | actrepaygllcmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 11 | repaydate | 计划还本日期 | repaydate | char(19) |  | 日期 (UFDate) |
| 12 | pk_plancurrtype | 还款计划币种 | pk_plancurrtype | varchar(20) |  | 币种 (currtype) |
| 13 | hasrepayflag | 还本标志 | hasrepayflag | char(1) |  | 布尔类型 (UFBoolean) | N |
| 14 | vdef1 | 自定义项1 | vdef1 | varchar(101) |  | 自定义项 (Custom) |
| 15 | vdef2 | 自定义项2 | vdef2 | varchar(101) |  | 自定义项 (Custom) |
| 16 | vdef3 | 自定义项3 | vdef3 | varchar(101) |  | 自定义项 (Custom) |
| 17 | vdef4 | 自定义项4 | vdef4 | varchar(101) |  | 自定义项 (Custom) |
| 18 | vdef5 | 自定义项5 | vdef5 | varchar(101) |  | 自定义项 (Custom) |
| 19 | vdef6 | 自定义项6 | vdef6 | varchar(101) |  | 自定义项 (Custom) |
| 20 | vdef7 | 自定义项7 | vdef7 | varchar(101) |  | 自定义项 (Custom) |
| 21 | vdef8 | 自定义项8 | vdef8 | varchar(101) |  | 自定义项 (Custom) |
| 22 | vdef10 | 自定义项10 | vdef10 | varchar(101) |  | 自定义项 (Custom) |
| 23 | vdef11 | 自定义项11 | vdef11 | varchar(101) |  | 自定义项 (Custom) |
| 24 | vdef12 | 自定义项12 | vdef12 | varchar(101) |  | 自定义项 (Custom) |
| 25 | vdef13 | 自定义项13 | vdef13 | varchar(101) |  | 自定义项 (Custom) |
| 26 | vdef14 | 自定义项14 | vdef14 | varchar(101) |  | 自定义项 (Custom) |
| 27 | vdef15 | 自定义项15 | vdef15 | varchar(101) |  | 自定义项 (Custom) |
| 28 | vdef16 | 自定义项16 | vdef16 | varchar(101) |  | 自定义项 (Custom) |
| 29 | vdef17 | 自定义项17 | vdef17 | varchar(101) |  | 自定义项 (Custom) |
| 30 | vdef18 | 自定义项18 | vdef18 | varchar(101) |  | 自定义项 (Custom) |
| 31 | vdef19 | 自定义项19 | vdef19 | varchar(101) |  | 自定义项 (Custom) |
| 32 | vdef20 | 自定义项20 | vdef20 | varchar(101) |  | 自定义项 (Custom) |