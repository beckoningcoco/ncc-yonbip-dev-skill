# |<<

**押汇合同还款 (lcm_docurepay / nc.vo.lcm.repaydocubills.DocuRePayVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3567.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_repayrcpt | 押汇合同还款主键 | pk_repayrcpt | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 3 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 4 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | isinitial | 期初标识 | isinitial | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | vbillno | 单据编号 | vbillno | varchar(50) |  | 字符串 (String) |
| 7 | pk_contract | 合同编号 | pk_contract | varchar(20) |  | 押汇合同 (lcm_LocuContract) |
| 8 | contractamount | 合同金额 | contractamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 9 | pk_procurr | 授信币种 | pk_procurr | varchar(20) |  | 币种 (currtype) |
| 10 | collectasrepay | 代收抵还款 | collectasrepay | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | ispayrelease | 还本释放额度 | ispayrelease | char(1) |  | 布尔类型 (UFBoolean) |
| 12 | payreleaseamount | 释放授信额度 | payreleaseamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | pk_debitcost | 成本中心 | pk_debitcost | varchar(20) |  | 成本中心 (resacostcenter) |
| 14 | pk_debitprof | 利润中心 | pk_debitprof | varchar(20) |  | 利润中心 (profitcenter) |
| 15 | pk_debitprof_v | 利润中心版本 | pk_debitprof_v | varchar(20) |  | 利润中心版本 (profitcenterVersion) |
| 16 | pk_debitunitacct | 借款单位账户 | pk_debitunitacct | varchar(20) |  | 银行账户子户 (bankaccsub) |
| 17 | repaydate | 还款日期 | repaydate | char(19) |  | 日期 (UFDate) |
| 18 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 19 | repayamount | 还本金金额 | repayamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 20 | interest | 利息金额 | interest | decimal(28, 8) |  | 金额 (UFMoney) |
| 21 | sumamount | 还款金额合计 | sumamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 22 | remark | 备注 | remark | varchar(200) |  | 字符串 (String) |
| 23 | vbillstatus | 审批状态 | vbillstatus | int |  | 单据状态 (BillstatusEnum) |  | 0=审批未通过; |