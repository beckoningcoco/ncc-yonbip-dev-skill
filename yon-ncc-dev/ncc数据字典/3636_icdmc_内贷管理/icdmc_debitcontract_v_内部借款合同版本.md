# |<<

**内部借款合同版本 (icdmc_debitcontract_v / nc.vo.icdmc.icdmc.debitcontract.version.DebitContractVersionVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3030.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_version | 主键 | pk_version | char(20) | √ | 主键 (UFID) |
| 2 | pk_debitcontract_icdmc | 合同主键 | pk_debitcontract_icdmc | char(20) | √ | 主键 (UFID) |
| 3 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 5 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 6 | vbillno | 单据编码 | vbillno | varchar(50) |  | 字符串 (String) |
| 7 | applyno | 申请编号 | applyno | varchar(50) |  | 字符串 (String) |
| 8 | contractno | 合同编号 | contractno | varchar(50) |  | 字符串 (String) |
| 9 | pk_financorg | 借款单位 | pk_financorg | varchar(20) |  | 组织 (org) |
| 10 | transacttype | 融资品种 | transacttype | varchar(20) |  | 投融资品种 (FinVarietyVO) |
| 11 | pk_loanorg | 贷款单位 | pk_loanorg | varchar(20) |  | 组织_业务单元_资金组织 (fundorg) |
| 12 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 13 | loanmny | 合同金额 | loanmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | olcrate | 组织本币汇率 | olcrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | olcloanmny | 合同金额组织本币 | olcloanmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | glcrate | 集团本币汇率 | glcrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | glcloanmny | 合同金额集团本币 | glcloanmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | gllcrate | 全局本币汇率 | gllcrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | gllcloanmny | 合同金额全局本币 | gllcloanmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | begindate | 开始日期 | begindate | char(19) |  | 日期(开始) (UFDateBegin) |
| 21 | periodunit | 期间单位 | periodunit | varchar(50) |  | 期间单位 (PeriodUnit) |  | DAY=天; |