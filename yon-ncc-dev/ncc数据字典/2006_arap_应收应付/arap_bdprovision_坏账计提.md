# |<<

**坏账计提 (arap_bdprovision / nccloud.vo.arap.bdprovision.BdProvisionVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/157.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_bdprovision | 主键 | pk_bdprovision | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | billno | 单据号 | billno | varchar(40) |  | 字符串 (String) |
| 5 | billdate | 单据日期 | billdate | char(19) |  | 日期 (UFDate) |
| 6 | pk_billtype | 单据类型 | pk_billtype | varchar(50) |  | 字符串 (String) |
| 7 | pk_bdprovisionrule | 计提规则 | pk_bdprovisionrule | varchar(20) |  | 坏账计提规则 (bdprovisionrule) |
| 8 | period | 会计期间 | period | varchar(20) |  | 字符串 (String) |
| 9 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 10 | money | 计提原币金额 | money | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 11 | localmoney | 计提组织本币金额 | localmoney | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 12 | groupmoney | 计提集团本币金额 | groupmoney | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 13 | globalmoney | 计提全局本币金额 | globalmoney | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 14 | grouprate | 集团汇率 | grouprate | decimal(28, 8) |  | 数值 (UFDouble) | 1 |
| 15 | globalrate | 全局汇率 | globalrate | decimal(28, 8) |  | 数值 (UFDouble) | 1 |
| 16 | prostatus | 计提状态 | prostatus | int |  | 计提状态 (provisionstatusenum) |  | -1=未计提; |