# |<<

**财资费用 (fmc_financingcost_h / nc.vo.fmc.financingcost.FinancingCostHVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2292.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_financingcost_h | 投融资费用主键 | pk_financingcost_h | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 3 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 4 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 5 | vbillno | 单据编号 | vbillno | varchar(50) |  | 字符串 (String) |
| 6 | pk_billtypeid | 单据类型主键 | pk_billtypeid | varchar(50) |  | 字符串 (String) |
| 7 | pk_billtypecode | 单据类型编码 | pk_billtypecode | varchar(50) |  | 字符串 (String) |
| 8 | amount | 费用金额 | amount | decimal(28, 8) |  | 金额 (UFMoney) |
| 9 | costdate | 费用日期 | costdate | char(19) |  | 日期 (UFDate) |
| 10 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 11 | isbeginperiod | 期初 | isbeginperiod | char(1) |  | 布尔类型 (UFBoolean) |
| 12 | olcamount | 组织本币金额 | olcamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 13 | olcrate | 组织本币汇率 | olcrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | glcamount | 集团本币金额 | glcamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 15 | glcrate | 集团本币汇率 | glcrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | gllcamount | 全局本币金额 | gllcamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 17 | gllcrate | 全局本币汇率 | gllcrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | costproject | 费用项目 | costproject | varchar(20) |  | 财资费用项目 (FinCostProjectVO) |
| 19 | direction | 费用方向 | direction | varchar(20) |  | 费用方向 (CostDirection) |  | 1=付费; |