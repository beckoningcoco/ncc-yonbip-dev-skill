# |<<

**还款计划 (cdmc_consignprcplplan / nc.vo.cdmc.ccm.consigncreditrepayprcpl.ConsignCreditPrcplPlanVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1363.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_repprcpl_plan | 主键 | pk_repprcpl_plan | char(20) | √ | 主键 (UFID) |
| 2 | pk_repayplan | 还款编号 | pk_repayplan | varchar(20) |  | 委托贷款还款计划 (ConsignCreditFinRepayPlanVO) |
| 3 | repayplandate | 还款日期 | repayplandate | char(19) |  | 日期时间 (UFDateTime) |
| 4 | premny | 预计还本金 | premny | decimal(28, 8) |  | 金额 (UFMoney) |
| 5 | olcpremny | 预计还本金本币 | olcpremny | decimal(28, 8) |  | 金额 (UFMoney) |
| 6 | glcpremny | 集团预计还本金本币 | glcpremny | decimal(28, 8) |  | 金额 (UFMoney) |
| 7 | gllcpremny | 全局预计还本金本币 | gllcpremny | decimal(28, 8) |  | 金额 (UFMoney) |
| 8 | actrepaymny | 实还本金 | actrepaymny | decimal(28, 8) |  | 金额 (UFMoney) |
| 9 | olcactrepaymny | 实还本金本币 | olcactrepaymny | decimal(28, 8) |  | 金额 (UFMoney) |
| 10 | glcactrepaymny | 集团实还本金本币 | glcactrepaymny | decimal(28, 8) |  | 金额 (UFMoney) |
| 11 | gllcactrepaymny | 全局实还本金本币 | gllcactrepaymny | decimal(28, 8) |  | 金额 (UFMoney) |
| 12 | vdef1 | 自定义项1 | vdef1 | varchar(101) |  | 自定义项 (Custom) |
| 13 | vdef2 | 自定义项2 | vdef2 | varchar(101) |  | 自定义项 (Custom) |
| 14 | vdef3 | 自定义项3 | vdef3 | varchar(101) |  | 自定义项 (Custom) |
| 15 | vdef4 | 自定义项4 | vdef4 | varchar(101) |  | 自定义项 (Custom) |
| 16 | vdef5 | 自定义项5 | vdef5 | varchar(101) |  | 自定义项 (Custom) |
| 17 | vdef6 | 自定义项6 | vdef6 | varchar(101) |  | 自定义项 (Custom) |
| 18 | vdef7 | 自定义项7 | vdef7 | varchar(101) |  | 自定义项 (Custom) |
| 19 | vdef8 | 自定义项8 | vdef8 | varchar(101) |  | 自定义项 (Custom) |
| 20 | vdef9 | 自定义项9 | vdef9 | varchar(101) |  | 自定义项 (Custom) |
| 21 | vdef10 | 自定义项10 | vdef10 | varchar(101) |  | 自定义项 (Custom) |
| 22 | vdef11 | 自定义项11 | vdef11 | varchar(101) |  | 自定义项 (Custom) |
| 23 | vdef12 | 自定义项12 | vdef12 | varchar(101) |  | 自定义项 (Custom) |
| 24 | vdef13 | 自定义项13 | vdef13 | varchar(101) |  | 自定义项 (Custom) |
| 25 | vdef14 | 自定义项14 | vdef14 | varchar(101) |  | 自定义项 (Custom) |
| 26 | vdef15 | 自定义项15 | vdef15 | varchar(101) |  | 自定义项 (Custom) |
| 27 | vdef16 | 自定义项16 | vdef16 | varchar(101) |  | 自定义项 (Custom) |
| 28 | vdef17 | 自定义项17 | vdef17 | varchar(101) |  | 自定义项 (Custom) |
| 29 | vdef18 | 自定义项18 | vdef18 | varchar(101) |  | 自定义项 (Custom) |
| 30 | vdef19 | 自定义项19 | vdef19 | varchar(101) |  | 自定义项 (Custom) |
| 31 | vdef20 | 自定义项20 | vdef20 | varchar(101) |  | 自定义项 (Custom) |
| 32 | vdef21 | 自定义项21 | vdef21 | varchar(101) |  | 自定义项 (Custom) |
| 33 | vdef22 | 自定义项22 | vdef22 | varchar(101) |  | 自定义项 (Custom) |
| 34 | vdef23 | 自定义项23 | vdef23 | varchar(101) |  | 自定义项 (Custom) |
| 35 | vdef24 | 自定义项24 | vdef24 | varchar(101) |  | 自定义项 (Custom) |
| 36 | vdef25 | 自定义项25 | vdef25 | varchar(101) |  | 自定义项 (Custom) |
| 37 | vdef26 | 自定义项26 | vdef26 | varchar(101) |  | 自定义项 (Custom) |
| 38 | vdef27 | 自定义项27 | vdef27 | varchar(101) |  | 自定义项 (Custom) |
| 39 | vdef28 | 自定义项28 | vdef28 | varchar(101) |  | 自定义项 (Custom) |
| 40 | vdef29 | 自定义项29 | vdef29 | varchar(101) |  | 自定义项 (Custom) |
| 41 | vdef30 | 自定义项30 | vdef30 | varchar(101) |  | 自定义项 (Custom) |