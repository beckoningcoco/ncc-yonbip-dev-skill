# |<<

**还款规则版本 (cdmc_repayrule_v / nc.vo.cdmc.cdm.contract.version.RepayRuleVersionVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1396.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_version_b | 主键 | pk_version_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_repayrule_b | 子表pk | pk_repayrule_b | char(20) |  | 主键 (UFID) |
| 3 | rulecode | 还款编码 | rulecode | varchar(50) |  | 字符串 (String) |
| 4 | repaydate | 还款日期 | repaydate | char(19) |  | 日期时间 (UFDateTime) |
| 5 | repaymny | 还本金额 | repaymny | decimal(28, 8) |  | 金额 (UFMoney) |
| 6 | isquoted | 是否被引用 | isquoted | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | olcrate | 组织本币汇率 | olcrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | glcrate | 集团本币汇率 | glcrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | gllcrate | 全局本币汇率 | gllcrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | repayolmny | 还本本币金额 | repayolmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 11 | repayglmny | 还本集团本币金额 | repayglmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 12 | repaygllmny | 还本全局本币金额 | repaygllmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 13 | occupyflag | 占用标志 | occupyflag | int |  | 整数 (Integer) |
| 14 | occupymny | 占用金额 | occupymny | decimal(28, 8) |  | 金额 (UFMoney) |
| 15 | occupyolmny | 占用本币金额 | occupyolmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 16 | occupyglmny | 占用集团本币金额 | occupyglmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 17 | occupygllmny | 占用全局本币金额 | occupygllmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 18 | vdef1 | 自定义项1 | vdef1 | varchar(101) |  | 自定义项 (Custom) |
| 19 | vdef2 | 自定义项2 | vdef2 | varchar(101) |  | 自定义项 (Custom) |
| 20 | vdef3 | 自定义项3 | vdef3 | varchar(101) |  | 自定义项 (Custom) |
| 21 | vdef4 | 自定义项4 | vdef4 | varchar(101) |  | 自定义项 (Custom) |
| 22 | vdef5 | 自定义项5 | vdef5 | varchar(101) |  | 自定义项 (Custom) |
| 23 | vdef6 | 自定义项6 | vdef6 | varchar(101) |  | 自定义项 (Custom) |
| 24 | vdef7 | 自定义项7 | vdef7 | varchar(101) |  | 自定义项 (Custom) |
| 25 | vdef8 | 自定义项8 | vdef8 | varchar(101) |  | 自定义项 (Custom) |
| 26 | vdef10 | 自定义项10 | vdef10 | varchar(101) |  | 自定义项 (Custom) |
| 27 | vdef11 | 自定义项11 | vdef11 | varchar(101) |  | 自定义项 (Custom) |
| 28 | vdef12 | 自定义项12 | vdef12 | varchar(101) |  | 自定义项 (Custom) |
| 29 | vdef13 | 自定义项13 | vdef13 | varchar(101) |  | 自定义项 (Custom) |
| 30 | vdef14 | 自定义项14 | vdef14 | varchar(101) |  | 自定义项 (Custom) |
| 31 | vdef15 | 自定义项15 | vdef15 | varchar(101) |  | 自定义项 (Custom) |
| 32 | vdef16 | 自定义项16 | vdef16 | varchar(101) |  | 自定义项 (Custom) |
| 33 | vdef17 | 自定义项17 | vdef17 | varchar(101) |  | 自定义项 (Custom) |
| 34 | vdef18 | 自定义项18 | vdef18 | varchar(101) |  | 自定义项 (Custom) |
| 35 | vdef19 | 自定义项19 | vdef19 | varchar(101) |  | 自定义项 (Custom) |
| 36 | vdef20 | 自定义项20 | vdef20 | varchar(101) |  | 自定义项 (Custom) |
| 37 | vdef21 | 自定义项21 | vdef21 | varchar(101) |  | 自定义项 (Custom) |
| 38 | vdef22 | 自定义项22 | vdef22 | varchar(101) |  | 自定义项 (Custom) |
| 39 | vdef23 | 自定义项23 | vdef23 | varchar(101) |  | 自定义项 (Custom) |
| 40 | vdef24 | 自定义项24 | vdef24 | varchar(101) |  | 自定义项 (Custom) |
| 41 | vdef25 | 自定义项25 | vdef25 | varchar(101) |  | 自定义项 (Custom) |
| 42 | vdef26 | 自定义项26 | vdef26 | varchar(101) |  | 自定义项 (Custom) |
| 43 | vdef27 | 自定义项27 | vdef27 | varchar(101) |  | 自定义项 (Custom) |
| 44 | vdef28 | 自定义项28 | vdef28 | varchar(101) |  | 自定义项 (Custom) |
| 45 | vdef29 | 自定义项29 | vdef29 | varchar(101) |  | 自定义项 (Custom) |
| 46 | vdef30 | 自定义项30 | vdef30 | varchar(101) |  | 自定义项 (Custom) |