# |<<

**内贷放款申请 (icdmc_financepayapply / nc.vo.icdmc.icdmc.financepayapply.FinancepayApplyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3043.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_financepayapply | 内贷放款申请主键 | pk_financepayapply | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 4 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 5 | vbillno | 单据编号 | vbillno | varchar(50) |  | 字符串 (String) |
| 6 | contractid | 合同编号 | contractid | varchar(20) |  | 内部贷款合同 (icontract) |
| 7 | loandate | 放款日期 | loandate | char(19) |  | 日期(开始) (UFDateBegin) |
| 8 | olcrate | 组织本币汇率 | olcrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | glcrate | 集团本币汇率 | glcrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | gllcrate | 全局本币汇率 | gllcrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | loanmny | 放款金额 | loanmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | olcloanmny | 放款金额组织本币 | olcloanmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | glcloanmny | 放款金额集团本币 | glcloanmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | gllcloanmny | 放款金额全局本币 | gllcloanmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | payplan | 放款计划编号 | payplan | varchar(20) |  | 放款计划 (payplan) |
| 16 | pk_planitem | 计划项目 | pk_planitem | varchar(20) |  | 资金计划项目 (fundplan) |
| 17 | busistatus | 单据状态 | busistatus | varchar(50) |  | 放款申请单状态 (FinApplyStatusEnum) |  | -1=待提交; |