# |<<

**坏账收回 (arap_bdrecovery / nccloud.vo.arap.bdrecovery.BdRecoveryVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/163.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_bdrecovery | 坏账收回主键 | pk_bdrecovery | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | billno | 单据号 | billno | varchar(50) |  | 字符串 (String) |
| 5 | billdate | 单据日期 | billdate | char(19) |  | 日期 (UFDate) |
| 6 | pk_billtype | 单据类型 | pk_billtype | varchar(50) |  | 字符串 (String) |
| 7 | period | 会计期间 | period | varchar(50) |  | 字符串 (String) |
| 8 | recreason | 收回原因 | recreason | varchar(50) |  | 字符串 (String) |
| 9 | nolossbill | 无损失单对应 | nolossbill | char(1) |  | 布尔类型 (UFBoolean) | N |
| 10 | money | 收回原币金额 | money | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 11 | localmoney | 收回组织本币金额 | localmoney | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 12 | groupmoney | 收回集团本币金额 | groupmoney | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 13 | globalmoney | 收回全局本币金额 | globalmoney | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 14 | billstatus | 单据状态 | billstatus | int |  | 单据状态 (billstatusenum) |  | -1=保存; |