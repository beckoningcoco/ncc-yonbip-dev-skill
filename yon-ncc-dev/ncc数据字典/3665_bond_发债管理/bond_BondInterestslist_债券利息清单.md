# |<<

**债券利息清单 (bond_BondInterestslist / nc.vo.bond.bondmanage.bondinterestslist.BondInterestslistVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1238.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_bondinterestslist | 主键 | pk_bondinterestslist | char(20) | √ | 主键 (UFID) |
| 2 | gllcrepprcremain | 全局未还本金本币金额 | gllcrepprcremain | decimal(28, 8) |  | 金额 (UFMoney) |
| 3 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | glcsumintmnt | 利息集团本币合计 | glcsumintmnt | decimal(28, 8) |  | 数值 (UFDouble) |
| 5 | gllcsumintmnt | 利息全局本币合计 | gllcsumintmnt | decimal(28, 8) |  | 数值 (UFDouble) |
| 6 | vbillno | 清单编号 | vbillno | varchar(40) |  | 字符串 (String) |
| 7 | iabilltype | 清单类型 | iabilltype | varchar(50) |  | 清单类型 (IabilltypeEnum) |  | 1=计息清单; |