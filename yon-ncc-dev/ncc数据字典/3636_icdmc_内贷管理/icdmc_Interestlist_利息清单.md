# |<<

**利息清单 (icdmc_Interestlist / nc.vo.icdmc.icdmc.interestlist.InterestlistIcdmcVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3048.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_interestlisticdmc | 主键 | pk_interestlisticdmc | char(20) | √ | 主键 (UFID) |
| 2 | totalintstmny | 合计利息金额 | totalintstmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 3 | costcenter | 成本中心 | costcenter | varchar(20) |  | 成本中心 (resacostcenter) |
| 4 | gllcrepprcremain | 全局未还本金本币金额 | gllcrepprcremain | decimal(28, 8) |  | 金额 (UFMoney) |
| 5 | profitcenter | 利润中心 | profitcenter | varchar(20) |  | 利润中心 (profitcenter) |
| 6 | glcrepprcremain | 集团未还本金本币金额 | glcrepprcremain | decimal(28, 8) |  | 金额 (UFMoney) |
| 7 | iadate | 结息日 | iadate | varchar(20) |  | 结息日 (fi_settledate) |
| 8 | settledate | 结息日期 | settledate | char(19) |  | 日期 (UFDate) |
| 9 | returnmode | 还款方式 | returnmode | varchar(20) |  | 还款方式 (RepaymentMethod) |
| 10 | fininstitutionid | 金融机构 | fininstitutionid | varchar(20) |  | 非银行金融机构 (NonbankFinInstitution) |
| 11 | gllcrate | 全局本币汇率 | gllcrate | decimal(15, 8) |  | 数值 (UFDouble) |
| 12 | glcrate | 集团本币汇率 | glcrate | decimal(15, 8) |  | 数值 (UFDouble) |
| 13 | olcrate | 组织本币汇率 | olcrate | decimal(15, 8) |  | 数值 (UFDouble) |
| 14 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 15 | vbillno | 清单编号 | vbillno | varchar(40) |  | 字符串 (String) |
| 16 | iabilltype | 清单类型 | iabilltype | int |  | 清单类型 (IabilltypeIcdmcEnum) |  | 1=计息清单; |