# |<<

**坏账收回应收明细 (arap_bdrecovery_ys / nccloud.vo.arap.bdrecovery.BdRecoveryYSVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/165.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_bdrecovery_ys | 坏账收回应收明细主键 | pk_bdrecovery_ys | char(20) | √ | 主键 (UFID) |
| 2 | pk_recbill | 应收单主键 | pk_recbill | varchar(20) |  | 客户应收单 (recbill) |
| 3 | pk_recitem | 应收单明细主键 | pk_recitem | varchar(20) |  | 客户应收单行 (recitem) |
| 4 | money | 收回原币金额 | money | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 5 | localmoney | 收回本币金额 | localmoney | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 6 | groupmoney | 收回集团本币金额 | groupmoney | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 7 | globalmoney | 收回全局本币金额 | globalmoney | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 8 | rate | 收回汇率 | rate | decimal(28, 8) |  | 数值 (UFDouble) | 1 |
| 9 | grouprate | 收回集团汇率 | grouprate | decimal(28, 8) |  | 数值 (UFDouble) | 1 |
| 10 | globalrate | 收回全局汇率 | globalrate | decimal(28, 8) |  | 数值 (UFDouble) | 1 |