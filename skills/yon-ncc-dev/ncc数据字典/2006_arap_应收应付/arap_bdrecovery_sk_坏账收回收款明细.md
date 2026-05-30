# |<<

**坏账收回收款明细 (arap_bdrecovery_sk / nccloud.vo.arap.bdrecovery.BdRecoverySKVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/164.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_bdrecovery_sk | 坏账收回收款明细主键 | pk_bdrecovery_sk | char(20) | √ | 主键 (UFID) |
| 2 | pk_gatherbill | 收款单主键 | pk_gatherbill | varchar(20) |  | 客户收款单 (gatherbill) |
| 3 | pk_gatheritem | 收款单明细主键 | pk_gatheritem | varchar(20) |  | 客户收款单行 (gatheritem) |
| 4 | money | 收回原币金额 | money | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 5 | localmoney | 收回组织本币金额 | localmoney | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 6 | groupmoney | 收回集团本币金额 | groupmoney | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 7 | globalmoney | 收回全局本币金额 | globalmoney | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 8 | rate | 收回汇率 | rate | decimal(28, 8) |  | 数值 (UFDouble) | 1 |
| 9 | grouprate | 收回集团汇率 | grouprate | decimal(28, 8) |  | 数值 (UFDouble) | 1 |
| 10 | globalrate | 收回全局汇率 | globalrate | decimal(28, 8) |  | 数值 (UFDouble) | 1 |