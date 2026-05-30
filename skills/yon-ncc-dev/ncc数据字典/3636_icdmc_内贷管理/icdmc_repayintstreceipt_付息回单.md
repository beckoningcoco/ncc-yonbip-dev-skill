# |<<

**付息回单 (icdmc_repayintstreceipt / nc.vo.icdmc.icdmc.repayintstreceipt.RepayIntstReceiptVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3055.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_repayintstreceipt | 内贷付息回单主键 | pk_repayintstreceipt | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | pk_org_r | 资金组织 | pk_org_r | varchar(20) |  | 组织_业务单元_资金组织 (fundorg) |
| 6 | pk_org_r_v | 资金组织版本 | pk_org_r_v | varchar(20) |  | 组织_业务单元_资金组织版本信息 (fundorg_v) |
| 7 | vbillno | 回单编号 | vbillno | varchar(50) |  | 字符串 (String) |
| 8 | pk_contract_icdmc | 合同编号 | pk_contract_icdmc | varchar(20) |  | 内部借款合同 (debitcontract) |
| 9 | contractcode | 合同编号ID | contractcode | varchar(50) |  | 字符串 (String) |
| 10 | pk_innerloanpay | 放款单编号 | pk_innerloanpay | varchar(20) |  | 内贷放款 (FinancepayVO) |
| 11 | loancode | 放款单编号ID | loancode | varchar(20) |  | 内贷放款 (FinancepayVO) |
| 12 | pk_debitunit | 借款单位 | pk_debitunit | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 13 | financorgid | 贷款单位 | financorgid | varchar(20) |  | 组织 (org) |
| 14 | contractmny | 合同总金额 | contractmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | olccontractmny | 合同总金额组织本币 | olccontractmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | glccontractmny | 合同总金额集团本币 | glccontractmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | gllccontractmny | 合同总金额全局本币 | gllccontractmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | loanbegindate | 放款日期 | loanbegindate | char(19) |  | 日期 (UFDate) |
| 19 | loandate | 付息日期 | loandate | char(19) |  | 日期 (UFDate) |
| 20 | olcrate | 组织本币汇率 | olcrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | glcrate | 集团本币汇率 | glcrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 22 | gllcrate | 全局本币汇率 | gllcrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 23 | shdpayintmny | 应付利息金额 | shdpayintmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 24 | olcshdpayintmny | 组织本币应付利息金额 | olcshdpayintmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 25 | glcshdpayintmny | 集团本币应付利息金额 | glcshdpayintmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 26 | gllshdpayintmny | 全局本币应付利息金额 | gllshdpayintmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 27 | payintmoney | 付息金额 | payintmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 28 | oclpayintmoney | 组织本币付息金额 | oclpayintmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 29 | glcpayintmoney | 集团本币付息金额 | glcpayintmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 30 | gllpayintmoney | 全局本币付息金额 | gllpayintmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 31 | unpayintmoney | 未付息金额 | unpayintmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 32 | oclunpayintmoney | 组织本币未付息金额 | oclunpayintmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 33 | glcunpayintmoney | 集团本币未付息金额 | glcunpayintmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 34 | gllunpayintmoney | 全局本币未付息金额 | gllunpayintmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 35 | loanunitid | 单位银行账户 | loanunitid | varchar(20) |  | 银行账户子户 (bankaccsub) |
| 36 | fininstitutionid | 单位内部账户 | fininstitutionid | varchar(20) |  | 内部账户 (bd_accid) |
| 37 | subfinstitutionid | 内部贷款账户 | subfinstitutionid | varchar(20) |  | 内部账户 (bd_accid) |
| 38 | loanaccount | 贷款账户 | loanaccount | varchar(20) |  | 银行账户子户 (bankaccsub) |
| 39 | debittoloan | 借转贷 | debittoloan | char(1) |  | 布尔类型 (UFBoolean) |
| 40 | accept_date | 受理日期 | accept_date | char(19) |  | 日期 (UFDate) |
| 41 | informent | 业务流水号 | informent | varchar(50) |  | 字符串 (String) |
| 42 | pk_srcbilltypeid | 来源单据类型主键 | pk_srcbilltypeid | varchar(50) |  | 字符串 (String) |
| 43 | srcbillno | 来源单据号 | srcbillno | varchar(50) |  | 字符串 (String) |
| 44 | pk_srcbill | 来源单据主键 | pk_srcbill | varchar(50) |  | 字符串 (String) |
| 45 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 46 | pk_billtypeid | 单据类型主键 | pk_billtypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 47 | pk_billtypecode | 单据类型编码 | pk_billtypecode | varchar(50) |  | 字符串 (String) |
| 48 | isfirstpayintst | 先付息 | isfirstpayintst | char(1) |  | 布尔类型 (UFBoolean) |
| 49 | pk_fundplan | 计划项目 | pk_fundplan | varchar(20) |  | 资金计划项目 (fundplan) |
| 50 | memo | 备注 | memo | varchar(200) |  | 备注 (Memo) |
| 51 | repaytointerest | 利随本清 | repaytointerest | char(1) |  | 布尔类型 (UFBoolean) |
| 52 | ispaytotalintst | 付累计利息 | ispaytotalintst | char(1) |  | 布尔类型 (UFBoolean) |
| 53 | paytotalintstmny | 应付累计利息金额 | paytotalintstmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 54 | olcpaytotalintstmny | 应付累计利息金额组织本币 | olcpaytotalintstmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 55 | glcpaytotalintstmny | 应付累计利息金额集团本币 | glcpaytotalintstmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 56 | gllpaytotalintstmny | 应付累计利息金额全局本币 | gllpaytotalintstmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 57 | pk_rate | 利率编码 | pk_rate | varchar(20) |  | 利率编码 (fi_ratecode) |
| 58 | pk_settledate | 结息日 | pk_settledate | varchar(20) |  | 结息日 (fi_settledate) |
| 59 | pk_returnmethod | 还款方式 | pk_returnmethod | varchar(20) |  | 还款方式 (RepaymentMethod) |
| 60 | fixrate | 固定利率 | fixrate | char(1) |  | 布尔类型 (UFBoolean) |
| 61 | accountinter | 核算利息 | accountinter | char(1) |  | 布尔类型 (UFBoolean) | Y |
| 62 | billmaker | 制单人 | billmaker | varchar(20) |  | 用户 (user) |
| 63 | billmakedate | 制单日期 | billmakedate | char(19) |  | 日期 (UFDate) |
| 64 | billmaketime | 制单时间 | billmaketime | char(19) |  | 日期时间 (UFDateTime) |
| 65 | transacter | 经办人 | transacter | varchar(20) |  | 用户 (user) |
| 66 | transacterdate | 经办日期 | transacterdate | char(19) |  | 日期 (UFDate) |
| 67 | transactertime | 经办时间 | transactertime | char(19) |  | 日期时间 (UFDateTime) |
| 68 | committor | 提交人 | committor | varchar(20) |  | 用户 (user) |
| 69 | commitdate | 提交日期 | commitdate | char(19) |  | 日期 (UFDate) |
| 70 | approver | 审批人 | approver | varchar(20) |  | 用户 (user) |
| 71 | approvedate | 审批日期 | approvedate | char(19) |  | 日期 (UFDate) |
| 72 | approvenote | 审批批语 | approvenote | varchar(50) |  | 字符串 (String) |
| 73 | settleflag | 结算状态 | settleflag | int |  | 整数 (Integer) |
| 74 | iabillid | 利息清单ID | iabillid | varchar(200) |  | 字符串 (String) |
| 75 | voucherflag | 已制证 | voucherflag | char(1) |  | 布尔类型 (UFBoolean) |
| 76 | tallyflag | 已记账 | tallyflag | char(1) |  | 布尔类型 (UFBoolean) |
| 77 | issettlement | 传结算 | issettlement | char(1) |  | 布尔类型 (UFBoolean) |
| 78 | loanmny | 放款金额 | loanmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 79 | initflag | 期初标识 | initflag | char(1) |  | 布尔类型 (UFBoolean) |
| 80 | makervuser | 制证人 | makervuser | varchar(20) |  | 用户 (user) |
| 81 | makevdate | 制证日期 | makevdate | char(19) |  | 日期 (UFDate) |
| 82 | makevtime | 制证时间 | makevtime | char(19) |  | 日期时间 (UFDateTime) |
| 83 | tallyoperator | 记账人 | tallyoperator | varchar(20) |  | 用户 (user) |
| 84 | tallydate | 记账日期 | tallydate | char(19) |  | 日期 (UFDate) |
| 85 | tallytime | 记账时间 | tallytime | char(19) |  | 日期时间 (UFDateTime) |
| 86 | tbbmessage | 预算提示信息 | tbbmessage | varchar(1025) |  | 字符串 (String) |
| 87 | saga_gtxid | 全局事务id | saga_gtxid | varchar(64) |  | 字符串 (String) |
| 88 | saga_btxid | 本地事务id | saga_btxid | varchar(64) |  | 字符串 (String) |
| 89 | saga_frozen | 冻结状态 | saga_frozen | int |  | 整数 (Integer) |
| 90 | saga_status | 事务状态 | saga_status | int |  | 整数 (Integer) |
| 91 | pk_profitcenter | 利润中心 | pk_profitcenter | varchar(20) |  | 利润中心 (profitcenter) |
| 92 | pk_debitcost | 成本中心 | pk_debitcost | varchar(20) |  | 成本中心 (resacostcenter) |
| 93 | vdef1 | 自定义项1 | vdef1 | varchar(101) |  | 自定义项 (Custom) |
| 94 | vdef2 | 自定义项2 | vdef2 | varchar(101) |  | 自定义项 (Custom) |
| 95 | vdef3 | 自定义项3 | vdef3 | varchar(101) |  | 自定义项 (Custom) |
| 96 | vdef4 | 自定义项4 | vdef4 | varchar(101) |  | 自定义项 (Custom) |
| 97 | vdef5 | 自定义项5 | vdef5 | varchar(101) |  | 自定义项 (Custom) |
| 98 | vdef6 | 自定义项6 | vdef6 | varchar(101) |  | 自定义项 (Custom) |
| 99 | vdef7 | 自定义项7 | vdef7 | varchar(101) |  | 自定义项 (Custom) |
| 100 | vdef8 | 自定义项8 | vdef8 | varchar(101) |  | 自定义项 (Custom) |
| 101 | vdef9 | 自定义项9 | vdef9 | varchar(101) |  | 自定义项 (Custom) |
| 102 | vdef10 | 自定义项10 | vdef10 | varchar(101) |  | 自定义项 (Custom) |
| 103 | vdef11 | 自定义项11 | vdef11 | varchar(101) |  | 自定义项 (Custom) |
| 104 | vdef12 | 自定义项12 | vdef12 | varchar(101) |  | 自定义项 (Custom) |
| 105 | vdef13 | 自定义项13 | vdef13 | varchar(101) |  | 自定义项 (Custom) |
| 106 | vdef14 | 自定义项14 | vdef14 | varchar(101) |  | 自定义项 (Custom) |
| 107 | vdef15 | 自定义项15 | vdef15 | varchar(101) |  | 自定义项 (Custom) |
| 108 | vdef16 | 自定义项16 | vdef16 | varchar(101) |  | 自定义项 (Custom) |
| 109 | vdef17 | 自定义项17 | vdef17 | varchar(101) |  | 自定义项 (Custom) |
| 110 | vdef18 | 自定义项18 | vdef18 | varchar(101) |  | 自定义项 (Custom) |
| 111 | vdef19 | 自定义项19 | vdef19 | varchar(101) |  | 自定义项 (Custom) |
| 112 | vdef20 | 自定义项20 | vdef20 | varchar(101) |  | 自定义项 (Custom) |
| 113 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 114 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 115 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 116 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |