# |<<

**债券还本还款计划 (bond_repaymentrepayplan / nc.vo.bond.bondmanage.repayprinciple.BondRepaymentRepayPlanVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1257.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_bondrepayprcplplan_b | 主键 | pk_bondrepayprcplplan_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | vbillno | 还本编号 | vbillno | varchar(50) |  | 字符串 (String) |
| 6 | pk_billtypeid | 单据类型主键 | pk_billtypeid | varchar(50) |  | 字符串 (String) |
| 7 | pk_billtypecode | 单据类型编码 | pk_billtypecode | varchar(50) |  | 字符串 (String) |
| 8 | pk_trantypeid | 交易类型主键 | pk_trantypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 9 | pk_trantypecode | 交易类型编码 | pk_trantypecode | varchar(50) |  | 字符串 (String) |
| 10 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 11 | summary | 摘要 | summary | varchar(200) |  | 备注 (Memo) |
| 12 | remark | 详细说明 | remark | varchar(200) |  | 备注 (Memo) |
| 13 | pk_srcbilltypeid | 来源单据类型主键 | pk_srcbilltypeid | varchar(50) |  | 字符串 (String) |
| 14 | srcbillno | 来源单据号 | srcbillno | varchar(50) |  | 字符串 (String) |
| 15 | pk_srcbill | 来源单据主键 | pk_srcbill | varchar(50) |  | 字符串 (String) |
| 16 | sourcesystypecode | 来源系统 | sourcesystypecode | varchar(50) |  | 字符串 (String) |
| 17 | olcrate | 组织本币汇率 | olcrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | glcrate | 集团本币汇率 | glcrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | gllcrate | 全局本币汇率 | gllcrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | pk_srcbillrowid | 来源单据行主键 | pk_srcbillrowid | varchar(50) |  | 字符串 (String) |
| 21 | pk_fsrcbill | 源头单据主键 | pk_fsrcbill | varchar(50) |  | 字符串 (String) |
| 22 | pk_fsrcbilltypeid | 源头单据类型主键 | pk_fsrcbilltypeid | varchar(50) |  | 字符串 (String) |
| 23 | fsrcbilltypecode | 源头单据类型编码 | fsrcbilltypecode | varchar(50) |  | 字符串 (String) |
| 24 | rowno | 行号 | rowno | varchar(50) |  | 字符串 (String) |
| 25 | issueno | 发行编号_弃用 | issueno | varchar(20) |  | 债券发行 (BondRegisterVO) |
| 26 | repplan | 还款计划 | repplan | varchar(20) |  | 还款计划 (BondRepayPlanVO) |
| 27 | repno | 还款编号 | repno | varchar(50) |  | 字符串 (String) |
| 28 | repdate | 还款日期 | repdate | char(19) |  | 日期时间 (UFDateTime) |
| 29 | orgprereplc | 组织预还本金本币 | orgprereplc | decimal(28, 8) |  | 金额 (UFMoney) |
| 30 | orgrealreplc | 组织实还本金本币 | orgrealreplc | decimal(28, 8) |  | 金额 (UFMoney) |
| 31 | repaymentdate | 计划还本日期 | repaymentdate | char(19) |  | 日期时间 (UFDateTime) |
| 32 | planrepaymny | 预计还本金 | planrepaymny | decimal(28, 8) |  | 金额 (UFMoney) |
| 33 | realrepaymny | 实还本金 | realrepaymny | decimal(28, 8) |  | 金额 (UFMoney) |
| 34 | vdef1 | 自定义项1 | vdef1 | varchar(101) |  | 自定义项 (Custom) |
| 35 | vdef2 | 自定义项2 | vdef2 | varchar(101) |  | 自定义项 (Custom) |
| 36 | vdef3 | 自定义项3 | vdef3 | varchar(101) |  | 自定义项 (Custom) |
| 37 | vdef4 | 自定义项4 | vdef4 | varchar(101) |  | 自定义项 (Custom) |
| 38 | vdef5 | 自定义项5 | vdef5 | varchar(101) |  | 自定义项 (Custom) |
| 39 | vdef6 | 自定义项6 | vdef6 | varchar(101) |  | 自定义项 (Custom) |
| 40 | vdef7 | 自定义项7 | vdef7 | varchar(101) |  | 自定义项 (Custom) |
| 41 | vdef8 | 自定义项8 | vdef8 | varchar(101) |  | 自定义项 (Custom) |
| 42 | vdef9 | 自定义项9 | vdef9 | varchar(101) |  | 自定义项 (Custom) |
| 43 | vdef10 | 自定义项10 | vdef10 | varchar(101) |  | 自定义项 (Custom) |
| 44 | vdef11 | 自定义项11 | vdef11 | varchar(101) |  | 自定义项 (Custom) |
| 45 | vdef12 | 自定义项12 | vdef12 | varchar(101) |  | 自定义项 (Custom) |
| 46 | vdef13 | 自定义项13 | vdef13 | varchar(101) |  | 自定义项 (Custom) |
| 47 | vdef14 | 自定义项14 | vdef14 | varchar(101) |  | 自定义项 (Custom) |
| 48 | vdef15 | 自定义项15 | vdef15 | varchar(101) |  | 自定义项 (Custom) |
| 49 | vdef16 | 自定义项16 | vdef16 | varchar(101) |  | 自定义项 (Custom) |
| 50 | vdef17 | 自定义项17 | vdef17 | varchar(101) |  | 自定义项 (Custom) |
| 51 | vdef18 | 自定义项18 | vdef18 | varchar(101) |  | 自定义项 (Custom) |
| 52 | vdef19 | 自定义项19 | vdef19 | varchar(101) |  | 自定义项 (Custom) |
| 53 | vdef20 | 自定义项20 | vdef20 | varchar(101) |  | 自定义项 (Custom) |