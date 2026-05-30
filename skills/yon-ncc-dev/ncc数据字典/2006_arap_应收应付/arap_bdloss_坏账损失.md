# |<<

**坏账损失 (arap_bdloss / nccloud.vo.arap.bdloss.BdLossVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/154.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_bdloss | 主键 | pk_bdloss | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | billno | 单据号 | billno | varchar(50) |  | 字符串 (String) |
| 5 | billdate | 单据日期 | billdate | char(19) |  | 日期 (UFDate) |
| 6 | period | 会计期间 | period | varchar(50) |  | 字符串 (String) |
| 7 | lossmoney | 损失原币金额 | lossmoney | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 8 | losslocalmoney | 损失组织本币金额 | losslocalmoney | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 9 | lossgroupmoney | 损失集团本币金额 | lossgroupmoney | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 10 | lossglobalmoney | 损失全局本币金额 | lossglobalmoney | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 11 | lossreason | 损失原因 | lossreason | varchar(500) |  | 字符串 (String) |
| 12 | pk_billtype | 单据类型 | pk_billtype | varchar(50) |  | 字符串 (String) |
| 13 | billstatus | 单据状态 | billstatus | int |  | 单据状态 (billstatusenum) |  | -1=保存; |