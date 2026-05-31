# |<<

**内贷放款版本 (icdmc_financepay_v / nc.vo.icdmc.icdmc.financepay.version.FinancepayVersionVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3042.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_version | 主键 | pk_version | char(20) | √ | 主键 (UFID) |
| 2 | pk_innerloanpay | 放款主键 | pk_innerloanpay | varchar(50) |  | 字符串 (String) |
| 3 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 资金组织 | pk_org | varchar(20) |  | 组织_业务单元_资金组织 (fundorg) |
| 5 | pk_org_v | 资金组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_资金组织版本信息 (fundorg_v) |
| 6 | debittoloan | 借转贷 | debittoloan | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | contractid | 合同编号 | contractid | varchar(20) |  | 内部贷款合同 (icontract) |
| 8 | loandate | 放款日期 | loandate | char(19) |  | 日期(开始) (UFDateBegin) |
| 9 | financecorpid | 借款单位 | financecorpid | varchar(20) |  | 组织 (org) |
| 10 | vbillno | 单据编码 | vbillno | varchar(50) |  | 字符串 (String) |
| 11 | payplan | 放款计划 | payplan | varchar(20) |  | 放款计划 (payplan) |
| 12 | invstfincvartyid | 融资品种 | invstfincvartyid | varchar(20) |  | 投融资品种 (FinVarietyVO) |
| 13 | prepayinterest | 先付息 | prepayinterest | char(1) |  | 布尔类型 (UFBoolean) |
| 14 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 15 | initflag | 期初标识 | initflag | char(1) |  | 布尔类型 (UFBoolean) |
| 16 | olcrate | 组织本币汇率 | olcrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | glcrate | 集团本币汇率 | glcrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | gllcrate | 全局本币汇率 | gllcrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | loanmny | 放款金额 | loanmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | olcloanmny | 放款金额组织本币 | olcloanmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | glcloanmny | 放款金额集团本币 | glcloanmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 22 | gllcloanmny | 放款金额全局本币 | gllcloanmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 23 | canloanmny | 可放款金额 | canloanmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 24 | canolcloanmny | 可放款金额组织本币 | canolcloanmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 25 | canglcloanmny | 可放款金额集团本币 | canglcloanmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 26 | cangllcloanmny | 可放款金额全局本币 | cangllcloanmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 27 | periodcount | 期间 | periodcount | int |  | 整数 (Integer) |
| 28 | periodunit | 期间单位 | periodunit | varchar(50) |  | 期间单位 (PeriodUnitEnum) |  | DAY=天; |