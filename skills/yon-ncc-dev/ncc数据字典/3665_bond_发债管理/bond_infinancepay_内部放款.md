# |<<

**内部放款 (bond_infinancepay / nc.vo.bond.bondmanage.register.BondInfinancepayVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1246.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_bondinfinancepay_b | 主键 | pk_bondinfinancepay_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | vbillno | 单据编码 | vbillno | varchar(50) |  | 字符串 (String) |
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
| 25 | borrowercorpid | 借款单位 | borrowercorpid | varchar(20) |  | 组织 (org) |
| 26 | innercontractid | 内贷合同主键 | innercontractid | varchar(200) |  | 字符串 (String) |
| 27 | innercontractcode | 内贷合同编号 | innercontractcode | varchar(200) |  | 字符串 (String) |
| 28 | infinancepayid | 内部放款主键 | infinancepayid | varchar(200) |  | 字符串 (String) |
| 29 | infinancepaycode | 内贷放款编号 | infinancepaycode | varchar(200) |  | 字符串 (String) |
| 30 | outfinancepayid | 外部放款id | outfinancepayid | varchar(200) |  | 字符串 (String) |
| 31 | loanmy | 占用债券金额 | loanmy | decimal(28, 8) |  | 金额 (UFMoney) |
| 32 | nowloanmy | 当前占用债券金额 | nowloanmy | decimal(28, 8) |  | 金额 (UFMoney) |
| 33 | loandate | 开始日期 | loandate | char(19) |  | 日期 (UFDate) |
| 34 | enddate | 结束日期 | enddate | char(19) |  | 日期 (UFDate) |
| 35 | olcloanmny | 占用债券本币金额 | olcloanmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 36 | olcnowloanmny | 当前占用债券本币金额 | olcnowloanmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 37 | glcloanmny | 占用债券集团本币金额 | glcloanmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 38 | glcnowloanmny | 当前占用债券集团本币金额 | glcnowloanmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 39 | gllcloanmny | 占用债券全局本币金额 | gllcloanmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 40 | gllcnowloanmny | 当前占用债券全局本币金额 | gllcnowloanmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 41 | versionno | 版本信息 | versionno | int |  | 整数 (Integer) |
| 42 | billtype | 标记位 | billtype | varchar(200) |  | 字符串 (String) |
| 43 | busistatus | 内贷放款单据状态 | busistatus | int |  | 整数 (Integer) |
| 44 | saga_frozen | 冻结状态 | saga_frozen | int |  | 整数 (Integer) |
| 45 | saga_gtxid | 全局事务id | saga_gtxid | varchar(64) |  | 字符串 (String) |
| 46 | saga_btxid | 本地事务id | saga_btxid | varchar(64) |  | 字符串 (String) |
| 47 | saga_status | saga事务状态 | saga_status | int |  | 整数 (Integer) |
| 48 | vdef1 | 自定义项1 | vdef1 | varchar(101) |  | 自定义项 (Custom) |
| 49 | vdef2 | 自定义项2 | vdef2 | varchar(101) |  | 自定义项 (Custom) |
| 50 | vdef3 | 自定义项3 | vdef3 | varchar(101) |  | 自定义项 (Custom) |
| 51 | vdef4 | 自定义项4 | vdef4 | varchar(101) |  | 自定义项 (Custom) |
| 52 | vdef5 | 自定义项5 | vdef5 | varchar(101) |  | 自定义项 (Custom) |
| 53 | vdef6 | 自定义项6 | vdef6 | varchar(101) |  | 自定义项 (Custom) |
| 54 | vdef7 | 自定义项7 | vdef7 | varchar(101) |  | 自定义项 (Custom) |
| 55 | vdef8 | 自定义项8 | vdef8 | varchar(101) |  | 自定义项 (Custom) |
| 56 | vdef9 | 自定义项9 | vdef9 | varchar(101) |  | 自定义项 (Custom) |
| 57 | vdef10 | 自定义项10 | vdef10 | varchar(101) |  | 自定义项 (Custom) |
| 58 | vdef11 | 自定义项11 | vdef11 | varchar(101) |  | 自定义项 (Custom) |
| 59 | vdef12 | 自定义项12 | vdef12 | varchar(101) |  | 自定义项 (Custom) |
| 60 | vdef13 | 自定义项13 | vdef13 | varchar(101) |  | 自定义项 (Custom) |
| 61 | vdef14 | 自定义项14 | vdef14 | varchar(101) |  | 自定义项 (Custom) |
| 62 | vdef15 | 自定义项15 | vdef15 | varchar(101) |  | 自定义项 (Custom) |
| 63 | vdef16 | 自定义项16 | vdef16 | varchar(101) |  | 自定义项 (Custom) |
| 64 | vdef17 | 自定义项17 | vdef17 | varchar(101) |  | 自定义项 (Custom) |
| 65 | vdef18 | 自定义项18 | vdef18 | varchar(101) |  | 自定义项 (Custom) |
| 66 | vdef19 | 自定义项19 | vdef19 | varchar(101) |  | 自定义项 (Custom) |
| 67 | vdef20 | 自定义项20 | vdef20 | varchar(101) |  | 自定义项 (Custom) |
| 68 | vdef21 | 自定义项21 | vdef21 | varchar(101) |  | 自定义项 (Custom) |
| 69 | vdef22 | 自定义项22 | vdef22 | varchar(101) |  | 自定义项 (Custom) |
| 70 | vdef23 | 自定义项23 | vdef23 | varchar(101) |  | 自定义项 (Custom) |
| 71 | vdef24 | 自定义项24 | vdef24 | varchar(101) |  | 自定义项 (Custom) |
| 72 | vdef25 | 自定义项25 | vdef25 | varchar(101) |  | 自定义项 (Custom) |
| 73 | vdef26 | 自定义项26 | vdef26 | varchar(101) |  | 自定义项 (Custom) |
| 74 | vdef27 | 自定义项27 | vdef27 | varchar(101) |  | 自定义项 (Custom) |
| 75 | vdef28 | 自定义项28 | vdef28 | varchar(101) |  | 自定义项 (Custom) |
| 76 | vdef29 | 自定义项29 | vdef29 | varchar(101) |  | 自定义项 (Custom) |
| 77 | vdef30 | 自定义项30 | vdef30 | varchar(101) |  | 自定义项 (Custom) |