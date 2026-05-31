# |<<

**内贷付息 (icdmc_repinterest / nc.vo.icdmc.icdmc.repayintst.RepayIntstVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3060.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_repayintsticdmc | 内贷付息主键 | pk_repayintsticdmc | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 资金组织 | pk_org | varchar(20) |  | 组织_业务单元_资金组织 (fundorg) |
| 4 | pk_org_v | 资金组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_资金组织版本信息 (fundorg_v) |
| 5 | vbillno | 单据编号 | vbillno | varchar(50) |  | 字符串 (String) |
| 6 | pk_contract_icdmc | 合同编号 | pk_contract_icdmc | varchar(20) |  | 内部贷款合同 (icontract) |
| 7 | contractcode | 合同编号ID | contractcode | varchar(50) |  | 字符串 (String) |
| 8 | pk_innerloanpay | 放款单编号 | pk_innerloanpay | varchar(20) |  | 内贷放款 (FinancepayVO) |
| 9 | loancode | 放款单编号ID | loancode | varchar(20) |  | 内贷放款 (FinancepayVO) |
| 10 | pk_debitunit | 借款单位 | pk_debitunit | varchar(20) |  | 组织 (org) |
| 11 | financorgid | 贷款单位 | financorgid | varchar(20) |  | 组织 (org) |
| 12 | contractmny | 合同总金额 | contractmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | olccontractmny | 合同总金额组织本币 | olccontractmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | glccontractmny | 合同总金额集团本币 | glccontractmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | gllccontractmny | 合同总金额全局本币 | gllccontractmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | loanbegindate | 放款日期 | loanbegindate | char(19) |  | 日期 (UFDate) |
| 17 | loandate | 付息日期 | loandate | char(19) |  | 日期 (UFDate) |
| 18 | olcrate | 组织本币汇率 | olcrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | glcrate | 集团本币汇率 | glcrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | gllcrate | 全局本币汇率 | gllcrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | shdpayintmny | 应付利息金额 | shdpayintmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 22 | olcshdpayintmny | 组织本币应付利息金额 | olcshdpayintmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 23 | glcshdpayintmny | 集团本币应付利息金额 | glcshdpayintmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 24 | gllshdpayintmny | 全局本币应付利息金额 | gllshdpayintmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 25 | payintmoney | 付息金额 | payintmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 26 | oclpayintmoney | 组织本币付息金额 | oclpayintmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 27 | glcpayintmoney | 集团本币付息金额 | glcpayintmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 28 | gllpayintmoney | 全局本币付息金额 | gllpayintmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 29 | unpayintmoney | 未付息金额 | unpayintmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 30 | oclunpayintmoney | 组织本币未付息金额 | oclunpayintmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 31 | glcunpayintmoney | 集团本币未付息金额 | glcunpayintmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 32 | gllunpayintmoney | 全局本币未付息金额 | gllunpayintmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 33 | loanunitid | 付息账号 | loanunitid | varchar(20) |  | 银行账户子户 (bankaccsub) |
| 34 | loanaccount | 贷款账户 | loanaccount | varchar(20) |  | 银行账户子户 (bankaccsub) |
| 35 | fininstitutionid | 单位内部账户 | fininstitutionid | varchar(20) |  | 内部账户 (bd_accid) |
| 36 | subfinstitutionid | 内部贷款账户 | subfinstitutionid | varchar(20) |  | 内部账户 (bd_accid) |
| 37 | debittoloan | 借转贷 | debittoloan | char(1) |  | 布尔类型 (UFBoolean) |
| 38 | accept_date | 受理日期 | accept_date | char(19) |  | 日期 (UFDate) |
| 39 | informent | 业务流水号 | informent | varchar(50) |  | 字符串 (String) |
| 40 | sourcesystypecode | 来源 | sourcesystypecode | int |  | 来源 (BillResources) |  | 1=还本利随本清; |