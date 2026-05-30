# |<<

**暂估明细协议 (arap_estitally_agr / nc.vo.arap.tally.EstiTallyAgrVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/183.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_estitally_agr | 主键 | pk_estitally_agr | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | char(20) |  | 主键 (UFID) |
| 3 | pk_org | 财务组织 | pk_org | char(20) |  | 主键 (UFID) |
| 4 | pk_org_v | 财务组织版本 | pk_org_v | char(20) |  | 主键 (UFID) |
| 5 | expiredate | 协议到期日 | expiredate | char(19) |  | 日期 (UFDate) |
| 6 | money_de | 借方原币金额 | money_de | decimal(28, 8) |  | 数值 (UFDouble) |
| 7 | local_money_de | 组织借方本币金额 | local_money_de | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | grouplocal_money_de | 集团借方本币金额 | grouplocal_money_de | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | globallocal_money_de | 全局借方本币金额 | globallocal_money_de | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | quantity_de | 借方数量 | quantity_de | decimal(20, 8) |  | 数值 (UFDouble) |
| 11 | quantity_cr | 贷方数量 | quantity_cr | decimal(20, 8) |  | 数值 (UFDouble) |
| 12 | local_money_cr | 组织贷方本币金额 | local_money_cr | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | grouplocal_money_cr | 集团贷方本币金额 | grouplocal_money_cr | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | globallocal_money_cr | 全局贷方本币金额 | globallocal_money_cr | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | money_cr | 贷方原币金额 | money_cr | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | pk_bill | 单据表主键 | pk_bill | char(20) |  | 主键 (UFID) |
| 17 | pk_termitem | 单据协议主键 | pk_termitem | char(20) |  | 主键 (UFID) |