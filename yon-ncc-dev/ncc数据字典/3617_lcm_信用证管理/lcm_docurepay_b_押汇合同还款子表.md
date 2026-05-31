# |<<

**押汇合同还款子表 (lcm_docurepay_b / nc.vo.lcm.repaydocubills.DocuRePayBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3568.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_repayrcpt_b | 还款回单子表主键 | pk_repayrcpt_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 3 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 4 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | pk_payrcpt | 放款单 | pk_payrcpt | varchar(20) |  | 押汇合同放款 (lcm_docupay) |
| 6 | payversionno | 放款单版本号 | payversionno | int |  | 整数 (Integer) |
| 7 | pk_repayplan | 还款计划 | pk_repayplan | varchar(20) |  | 押汇合同放款子表 (lcm_docupay_b) |
| 8 | pk_currtype | 合同币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 9 | repayamount | 实际还本金金额 | repayamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 10 | aprepayamount | 应还本金金额 | aprepayamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 11 | olcaprepayamount | 应还本金本币金额 | olcaprepayamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 12 | glcaprepayamount | 应还本金集团本币金额 | glcaprepayamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 13 | gllcaprepayamount | 应还本金全局本币金额 | gllcaprepayamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 14 | olcrepayamount | 实际还本金本币金额 | olcrepayamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 15 | glcrepayamount | 实际还本金集团本币金额 | glcrepayamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 16 | gllcrepayamount | 实际还本金全局本币金额 | gllcrepayamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 17 | vdef1 | 自定义项1 | vdef1 | varchar(101) |  | 自定义项 (Custom) |
| 18 | vdef2 | 自定义项2 | vdef2 | varchar(101) |  | 自定义项 (Custom) |
| 19 | vdef3 | 自定义项3 | vdef3 | varchar(101) |  | 自定义项 (Custom) |
| 20 | vdef4 | 自定义项4 | vdef4 | varchar(101) |  | 自定义项 (Custom) |
| 21 | vdef5 | 自定义项5 | vdef5 | varchar(101) |  | 自定义项 (Custom) |
| 22 | vdef6 | 自定义项6 | vdef6 | varchar(101) |  | 自定义项 (Custom) |
| 23 | vdef7 | 自定义项7 | vdef7 | varchar(101) |  | 自定义项 (Custom) |
| 24 | vdef8 | 自定义项8 | vdef8 | varchar(101) |  | 自定义项 (Custom) |
| 25 | vdef9 | 自定义项9 | vdef9 | varchar(101) |  | 自定义项 (Custom) |
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