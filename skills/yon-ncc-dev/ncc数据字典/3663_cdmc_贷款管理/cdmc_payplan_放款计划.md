# |<<

**放款计划 (cdmc_payplan / nc.vo.cdmc.cdm.contract.PayPlanVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1391.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_payplan_b | 主键 | pk_payplan_b | char(20) | √ | 主键 (UFID) |
| 2 | payplancode | 放款编码 | payplancode | varchar(50) |  | 字符串 (String) |
| 3 | creditdate | 放款日期 | creditdate | char(19) |  | 日期时间 (UFDateTime) |
| 4 | paymny | 放款金额 | paymny | decimal(28, 8) |  | 数值 (UFDouble) |
| 5 | canpaymny | 可放款金额 | canpaymny | decimal(28, 8) |  | 数值 (UFDouble) |
| 6 | isquoted | 是否被引用 | isquoted | int |  | 整数 (Integer) |
| 7 | olcpayrate | 组织本币汇率 | olcpayrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | glcpayrate | 集团本币汇率 | glcpayrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | gllpayrate | 全局本币汇率 | gllpayrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | olcpaycdtlnamt | 组织本币额度 | olcpaycdtlnamt | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | glcpaycdtlnamt | 集团本币额度 | glcpaycdtlnamt | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | gllpaycdtlnamt | 全局本币额度 | gllpaycdtlnamt | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | vdef1 | 自定义项1 | vdef1 | varchar(101) |  | 自定义项 (Custom) |
| 14 | vdef2 | 自定义项2 | vdef2 | varchar(101) |  | 自定义项 (Custom) |
| 15 | vdef3 | 自定义项3 | vdef3 | varchar(101) |  | 自定义项 (Custom) |
| 16 | vdef4 | 自定义项4 | vdef4 | varchar(101) |  | 自定义项 (Custom) |
| 17 | vdef5 | 自定义项5 | vdef5 | varchar(101) |  | 自定义项 (Custom) |
| 18 | vdef6 | 自定义项6 | vdef6 | varchar(101) |  | 自定义项 (Custom) |
| 19 | vdef7 | 自定义项7 | vdef7 | varchar(101) |  | 自定义项 (Custom) |
| 20 | vdef8 | 自定义项8 | vdef8 | varchar(101) |  | 自定义项 (Custom) |
| 21 | vdef9 | 自定义项9 | vdef9 | varchar(101) |  | 自定义项 (Custom) |
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
| 33 | vdef21 | 自定义项21 | vdef21 | varchar(101) |  | 自定义项 (Custom) |
| 34 | vdef22 | 自定义项22 | vdef22 | varchar(101) |  | 自定义项 (Custom) |
| 35 | vdef23 | 自定义项23 | vdef23 | varchar(101) |  | 自定义项 (Custom) |
| 36 | vdef24 | 自定义项24 | vdef24 | varchar(101) |  | 自定义项 (Custom) |
| 37 | vdef25 | 自定义项25 | vdef25 | varchar(101) |  | 自定义项 (Custom) |
| 38 | vdef26 | 自定义项26 | vdef26 | varchar(101) |  | 自定义项 (Custom) |
| 39 | vdef27 | 自定义项27 | vdef27 | varchar(101) |  | 自定义项 (Custom) |
| 40 | vdef28 | 自定义项28 | vdef28 | varchar(101) |  | 自定义项 (Custom) |
| 41 | vdef29 | 自定义项29 | vdef29 | varchar(101) |  | 自定义项 (Custom) |
| 42 | vdef30 | 自定义项30 | vdef30 | varchar(101) |  | 自定义项 (Custom) |