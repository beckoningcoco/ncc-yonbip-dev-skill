# |<<

**单据坏账累计金额记录 (arap_bdbill / nccloud.vo.arap.bdbill.BdBillVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/153.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_bdbill | 主键 | pk_bdbill | char(20) | √ | 主键 (UFID) |
| 2 | pk_bill | 单据主键 | pk_bill | varchar(20) |  | 客户应收单 (recbill) |
| 3 | pk_item | 单据行主键 | pk_item | varchar(20) |  | 客户应收单行 (recitem) |
| 4 | pk_billtype | 单据类型 | pk_billtype | varchar(50) |  | 字符串 (String) |
| 5 | pk_bdprovisionrule | 计提规则 | pk_bdprovisionrule | varchar(20) |  | 坏账计提规则 (bdprovisionrule) |
| 6 | pk_dimratio | 计提比率维度行主键 | pk_dimratio | varchar(20) |  | 计提比率维度 (dimratio) |
| 7 | pk_bdprovision_d | 坏账计提明细主键 | pk_bdprovision_d | varchar(20) |  | 坏账计提明细 (bdprovision_d) |
| 8 | mnytotal | 累计计提原币金额 | mnytotal | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 9 | localmnytotal | 累计计提组织本币金额 | localmnytotal | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 10 | groupmnytotal | 累计计提集团本币金额 | groupmnytotal | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 11 | globalmnytotal | 累计计提全局本币金额 | globalmnytotal | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 12 | lossmnytotal | 累计损失原币金额 | lossmnytotal | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 13 | losslocalmnytotal | 累计损失组织本币金额 | losslocalmnytotal | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 14 | lossgroupmnytotal | 累计损失集团本币金额 | lossgroupmnytotal | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 15 | lossglobalmnytotal | 累计损失全局本币金额 | lossglobalmnytotal | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 16 | recmnytotal | 累计收回原币金额 | recmnytotal | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 17 | reclocalmnytotal | 累计收回组织本币金额 | reclocalmnytotal | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 18 | recgroupmnytotal | 累计收回集团本币金额 | recgroupmnytotal | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 19 | recglobalmnytotal | 累计收回全局本币金额 | recglobalmnytotal | decimal(28, 8) |  | 数值 (UFDouble) | 0 |