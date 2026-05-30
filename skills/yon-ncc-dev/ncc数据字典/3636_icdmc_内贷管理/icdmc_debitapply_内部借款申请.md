# |<<

**内部借款申请 (icdmc_debitapply / nc.vo.icdmc.icdmc.debitapply.DebitApplyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3028.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_debitapply | 主键 | pk_debitapply | char(20) | √ | 主键 (UFID) |
| 2 | applycode | 申请编号 | applycode | varchar(50) |  | 字符串 (String) |
| 3 | applydate | 申请日期 | applydate | char(19) |  | 日期 (UFDate) |
| 4 | pk_creditorg | 贷款单位 | pk_creditorg | varchar(20) |  | 组织_业务单元_资金组织 (fundorg) |
| 5 | pk_creditorg_v | 贷方组织版本 | pk_creditorg_v | varchar(20) |  | 组织_业务单元_资金组织版本信息 (fundorg_v) |
| 6 | creditaccount | 贷款账号 | creditaccount | varchar(20) |  | 银行账户子户 (bankaccsub) |
| 7 | innercreditaccount | 内部贷款账号 | innercreditaccount | varchar(20) |  | 内部账户 (bd_accid) |
| 8 | pk_debitorg | 借款单位 | pk_debitorg | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 9 | pk_debitorg_v | 借方组织版本 | pk_debitorg_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 10 | unitdebitaccount | 单位借款账号 | unitdebitaccount | varchar(20) |  | 银行账户子户 (bankaccsub) |
| 11 | fin_variety | 融资品种 | fin_variety | varchar(20) |  | 投融资品种 (FinVarietyVO) |
| 12 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 13 | applyamount | 申请贷款金额 | applyamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 14 | contractamount | 合同金额 | contractamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 15 | olcrate | 组织本币汇率 | olcrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | pk_olccurr | 组织本位币 | pk_olccurr | varchar(20) |  | 币种 (currtype) |
| 17 | olcapplymnt | 组织申请金额 | olcapplymnt | decimal(28, 8) |  | 金额 (UFMoney) |
| 18 | olccontractamount | 组织合同金额 | olccontractamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 19 | glcrate | 集团本币汇率 | glcrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | pk_glccurr | 集团本位币 | pk_glccurr | varchar(20) |  | 币种 (currtype) |
| 21 | glcapplymnt | 集团申请金额 | glcapplymnt | decimal(28, 8) |  | 金额 (UFMoney) |
| 22 | glccontractamount | 集团合同金额 | glccontractamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 23 | gllcrate | 全局本币汇率 | gllcrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 24 | pk_gllccurr | 全局本位币 | pk_gllccurr | varchar(20) |  | 币种 (currtype) |
| 25 | gllcapplymnt | 全局申请金额 | gllcapplymnt | decimal(28, 8) |  | 金额 (UFMoney) |
| 26 | gllccontractamount | 全局合同金额 | gllccontractamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 27 | begindate | 开始日期 | begindate | char(19) |  | 日期(开始) (UFDateBegin) |
| 28 | enddate | 结束日期 | enddate | char(19) |  | 日期(结束) (UFDateEnd) |
| 29 | periodcount | 期间 | periodcount | int |  | 整数 (Integer) |
| 30 | loanperiod | 借贷期间 | loanperiod | varchar(50) |  | 借款期间 (LoanPeriodEnum) |  | SHORT=短期; |