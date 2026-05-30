# |<<

**內贷还本申请 (icdmc_repayprcplapply / nc.vo.icdmc.icdmc.repayprcplapply.RepayPrcplApplyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3057.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_repayprcplapply | 主键 | pk_repayprcplapply | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 3 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 4 | vbillno | 单据编号 | vbillno | varchar(50) |  | 字符串 (String) |
| 5 | pk_financepay | 放款单号 | pk_financepay | varchar(20) |  | 内贷放款 (FinancepayVO) |
| 6 | pk_contract | 合同编号 | pk_contract | varchar(20) |  | 内部贷款合同 (icontract) |
| 7 | applydate | 申请日期 | applydate | char(19) |  | 日期(开始) (UFDateBegin) |
| 8 | repaydate | 还本日期 | repaydate | char(19) |  | 日期(开始) (UFDateBegin) |
| 9 | repaymny | 还本金额 | repaymny | decimal(28, 8) |  | 金额 (UFMoney) |
| 10 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 11 | debitunitacctid | 单位还本账户 | debitunitacctid | varchar(20) |  | 银行账户子户 (bankaccsub) |
| 12 | loanaccount | 还入银行账户 | loanaccount | varchar(20) |  | 银行账户子户 (bankaccsub) |
| 13 | pk_repayplanitem | 计划项目 | pk_repayplanitem | varchar(20) |  | 资金计划项目 (fundplan) |
| 14 | vbillstatus | 审批状态 | vbillstatus | int |  | 单据状态 (BillstatusEnum) |  | 0=审批未通过; |