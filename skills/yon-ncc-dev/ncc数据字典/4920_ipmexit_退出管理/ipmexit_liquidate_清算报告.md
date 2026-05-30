# |<<

**清算报告 (ipmexit_liquidate / nc.vo.ipmexit.exitliquidate.ExitLiquidateVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3273.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_liquidate | 清算报告主键 | pk_liquidate | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | vbillcode | 单据编号 | vbillcode | varchar(50) |  | 字符串 (String) |
| 6 | pk_fund | 基金 | pk_fund | varchar(20) |  | 基金库 (IPMFundLibVO) |
| 7 | pk_projectlib | 标的项目 | pk_projectlib | varchar(20) |  | 投资项目档案 (ProjectLibVO) |
| 8 | target_enterprise | 标的企业 | target_enterprise | varchar(20) |  | 企业&自然人 (EnterprisePersonVO) |
| 9 | corigcurrencyid | 原币币种 | corigcurrencyid | varchar(20) |  | 币种 (currtype) |
| 10 | noriginvestamountmny | 投资金额 | noriginvestamountmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | nbaseinvestamountmny | 投资金额组织本币 | nbaseinvestamountmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | ngpinvestamountmny | 投资金额集团本币 | ngpinvestamountmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | nallinvestamountmny | 投资金额全局本币 | nallinvestamountmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | hold_ratio | 投后占股比例(%) | hold_ratio | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | latest_hold_ratio | 最新持股比例(%) | latest_hold_ratio | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | liquidate_reason | 清算原因 | liquidate_reason | varchar(50) |  | 基金终止原因 (TerminationReason) |  | 1=协议约定; |