# |<<

**坏账损失子表 (arap_bdloss_d / nccloud.vo.arap.bdloss.BdLossChildVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/155.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_bdloss_d | 主键 | pk_bdloss_d | char(20) | √ | 主键 (UFID) |
| 2 | pk_bdloss | 坏账损失主表主键 | pk_bdloss | varchar(20) |  | 坏账损失 (bdloss) |
| 3 | pk_bill | 单据主键 | pk_bill | varchar(20) |  | 客户应收单 (recbill) |
| 4 | lossmoney | 损失原币金额 | lossmoney | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 5 | losslocalmoney | 损失组织本币金额 | losslocalmoney | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 6 | lossgroupmoney | 损失集团本币金额 | lossgroupmoney | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 7 | lossglobalmoney | 损失全局本币金额 | lossglobalmoney | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 8 | lossrate | 损失汇率 | lossrate | decimal(28, 8) |  | 数值 (UFDouble) | 1 |
| 9 | lossgrouprate | 损失集团汇率 | lossgrouprate | decimal(28, 8) |  | 数值 (UFDouble) | 1 |
| 10 | lossglobalrate | 损失全局汇率 | lossglobalrate | decimal(28, 8) |  | 数值 (UFDouble) | 1 |