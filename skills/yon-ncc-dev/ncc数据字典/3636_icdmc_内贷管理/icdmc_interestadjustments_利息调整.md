# |<<

**利息调整 (icdmc_interestadjustments / nc.vo.icdmc.icdmc.interestadjustments.InterestAdjustmentsVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3047.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_interestadj | 主键 | pk_interestadj | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_fundorg | 资金组织 | pk_fundorg | varchar(20) |  | 组织_业务单元_资金组织 (fundorg) |
| 4 | pk_fundorg_v | 资金组织版本 | pk_fundorg_v | varchar(20) |  | 组织_业务单元_资金组织版本信息 (fundorg_v) |
| 5 | vbillno | 单据编号 | vbillno | varchar(50) |  | 字符串 (String) |
| 6 | pk_innerloanpay | 放款编号 | pk_innerloanpay | varchar(20) |  | 内贷放款 (FinancepayVO) |
| 7 | pk_returnmethod | 还款方式 | pk_returnmethod | varchar(20) |  | 还款方式 (RepaymentMethod) |
| 8 | pk_borrowunit | 借款单位 | pk_borrowunit | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 9 | pk_loanunit | 贷款单位 | pk_loanunit | varchar(20) |  | 组织 (org) |
| 10 | pk_contract | 合同编号 | pk_contract | varchar(20) |  | 内部贷款合同 (icontract) |
| 11 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 12 | adjustbeforeinterest | 调整前应付利息 | adjustbeforeinterest | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | adjustmoney | 调整差额 | adjustmoney | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | adjustafterinterest | 调整后应付利息 | adjustafterinterest | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | rate | 本币汇率 | rate | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | pk_interestlisticdmc | 调整清单编号 | pk_interestlisticdmc | varchar(20) |  | 利息清单 (InterestlistIcdmcVO) |
| 17 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 18 | adjustdate | 调整日期 | adjustdate | char(19) |  | 日期 (UFDate) |
| 19 | billmaker | 制单人 | billmaker | varchar(20) |  | 用户 (user) |
| 20 | billmaketime | 制单日期 | billmaketime | char(19) |  | 日期 (UFDate) |
| 21 | vbillstatus | 单据状态 | vbillstatus | int |  | 利息调整单据状态 (InterestAdjBillStatusEnum) |  | 1=待提交; |