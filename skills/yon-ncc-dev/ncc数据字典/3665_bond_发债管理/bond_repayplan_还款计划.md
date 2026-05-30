# |<<

**还款计划 (bond_repayplan / nc.vo.bond.bondmanage.register.BondRepayPlanVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1258.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_bondrepaymentplan_b | 主键 | pk_bondrepaymentplan_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | vbillno | 单据编码 | vbillno | varchar(50) |  | 字符串 (String) |
| 6 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 7 | summary | 摘要 | summary | varchar(200) |  | 备注 (Memo) |
| 8 | remark | 详细说明 | remark | varchar(200) |  | 备注 (Memo) |
| 9 | olcrate | 组织本币汇率 | olcrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | glcrate | 集团本币汇率 | glcrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | gllcrate | 全局本币汇率 | gllcrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | repaymentcode | 还本编号 | repaymentcode | varchar(200) |  | 字符串 (String) |
| 13 | repaymentdate | 计划还款日期 | repaymentdate | char(19) |  | 日期时间 (UFDateTime) |
| 14 | repaymentprincipalmny | 预计债券还本金 | repaymentprincipalmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | repaymentinterestmny | 预计债券还利息 | repaymentinterestmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | repaymenttotalmny | 预计债券还本利合计 | repaymenttotalmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | version | 版本号 | version | int |  | 整数 (Integer) |
| 18 | versiondate | 版本日期 | versiondate | char(19) |  | 日期 (UFDate) |
| 19 | plantype | 还款计划类型1还本，2付息，3还本+付息 | plantype | varchar(50) |  | 还款计划类别 (BondRepayPlanTypeEnum) |  | 0=REPAY_PRCPL; |