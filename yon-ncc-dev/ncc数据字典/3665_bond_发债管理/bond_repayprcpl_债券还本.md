# |<<

**债券还本 (bond_repayprcpl / nc.vo.bond.bondmanage.repayprinciple.BondRepayPrcplVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1260.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_bondrepayprcpl | 主键 | pk_bondrepayprcpl | char(20) | √ | 主键 (UFID) |
| 2 | bondcontract | 债券契约 | bondcontract | varchar(20) |  | 发债契约 (BondContractVO) |
| 3 | bondvariety | 发债品种 | bondvariety | varchar(20) |  | 投融资品种 (FinVarietyVO) |
| 4 | repayprcpldate | 还本日期 | repayprcpldate | char(19) |  | 日期时间 (UFDateTime) |
| 5 | init | 期初 | init | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | repprcreq | 应还本金额 | repprcreq | decimal(28, 8) |  | 金额 (UFMoney) |
| 7 | repprclcreq | 应还本本币金额 | repprclcreq | decimal(28, 8) |  | 金额 (UFMoney) |
| 8 | grepprclcreq | 集团应还本金本币金额 | grepprclcreq | decimal(28, 8) |  | 金额 (UFMoney) |
| 9 | grepprclcact | 集团实际还本金本币金额 | grepprclcact | decimal(28, 8) |  | 金额 (UFMoney) |
| 10 | glrepprclcreq | 全局应还本金本币金额 | glrepprclcreq | decimal(28, 8) |  | 金额 (UFMoney) |
| 11 | glrepprclcact | 全局实际还本金本币金额 | glrepprclcact | decimal(28, 8) |  | 金额 (UFMoney) |
| 12 | repprcact | 实际还本金额 | repprcact | decimal(28, 8) |  | 金额 (UFMoney) |
| 13 | repprclcact | 实际还本本币金额 | repprclcact | decimal(28, 8) |  | 金额 (UFMoney) |
| 14 | repprctotal | 累计还本金额 | repprctotal | decimal(28, 8) |  | 金额 (UFMoney) |
| 15 | repprclctotal | 累计还本本币金额 | repprclctotal | decimal(28, 8) |  | 金额 (UFMoney) |
| 16 | repprcremain | 未还本金 | repprcremain | decimal(28, 8) |  | 金额 (UFMoney) |
| 17 | repprclcremain | 未还本金本币金额 | repprclcremain | decimal(28, 8) |  | 金额 (UFMoney) |
| 18 | issueracco | 发行方账户 | issueracco | varchar(20) |  | 银行账户子户 (bankaccsub) |
| 19 | reporg | 还款机构 | reporg | varchar(20) |  | 非银行金融机构 (NonbankFinInstitution) |
| 20 | reporgacco | 还款机构账户 | reporgacco | varchar(20) |  | 非银行金融机构银行账户 (NonbankAcc) |
| 21 | prcplanproject | 本金计划项目 | prcplanproject | varchar(20) |  | 资金计划项目 (fundplan) |
| 22 | interestclearwithprc | 利随本清 | interestclearwithprc | char(1) |  | 布尔类型 (UFBoolean) |
| 23 | regenrepayplan | 重算还款计划 | regenrepayplan | char(1) |  | 布尔类型 (UFBoolean) |
| 24 | interestmny | 付息金额 | interestmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 25 | borrowtransloan | 借转贷 | borrowtransloan | char(1) |  | 布尔类型 (UFBoolean) |
| 26 | replacement | 置换 | replacement | char(1) |  | 布尔类型 (UFBoolean) |
| 27 | creditprotocol | 授信协议 | creditprotocol | varchar(20) |  | 银行授信协议 (bankprotocol) |
| 28 | creditcurrency | 授信币种 | creditcurrency | varchar(20) |  | 币种 (currtype) |
| 29 | creditbank | 授信银行 | creditbank | varchar(20) |  | 银行档案 (bankdoc) |
| 30 | credittype | 授信类别 | credittype | varchar(20) |  | 授信类别 (tmpub_cctype) |
| 31 | creditamount | 释放授信额度 | creditamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 32 | creditamountlc | 释放授信本币额度 | creditamountlc | decimal(28, 8) |  | 数值 (UFDouble) |
| 33 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 34 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 35 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 36 | vbillno | 还本编号 | vbillno | varchar(50) |  | 字符串 (String) |
| 37 | repayprcplno | 弃用遗留 | repayprcplno | varchar(50) |  | 字符串 (String) |
| 38 | pk_billtypeid | 单据类型主键 | pk_billtypeid | varchar(50) |  | 字符串 (String) |
| 39 | pk_billtypecode | 单据类型编码 | pk_billtypecode | varchar(50) |  | 字符串 (String) |
| 40 | busistatus | 单据状态 | busistatus | int |  | 债券还本单据状态 (RepaymentBillStatusEnum) |  | 0=待提交; |