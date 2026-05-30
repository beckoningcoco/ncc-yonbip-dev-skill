# |<<

**个别计提明细 (arap_indiprovision_d / nccloud.vo.arap.indiprovision.IndiProvisionDetailVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/186.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_indiprovision_d | 主键 | pk_indiprovision_d | char(20) | √ | 主键 (UFID) |
| 2 | pk_indiprovision | 个别计提标识 | pk_indiprovision | varchar(20) |  | 个别计提 (indiprovision) |
| 3 | pk_recbill | 应收单主表 | pk_recbill | varchar(20) |  | 客户应收单 (recbill) |
| 4 | pk_recitem | 应收单子表 | pk_recitem | varchar(20) |  | 客户应收单行 (recitem) |
| 5 | reason | 计提原因 | reason | varchar(200) |  | 字符串 (String) |
| 6 | dimratio | 计提比率 | dimratio | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 7 | totalar | 应收账款总额 | totalar | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 8 | initbdreserve | 期初坏账准备 | initbdreserve | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 9 | endbdreserve | 期末坏账准备 | endbdreserve | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 10 | money | 计提原币金额 | money | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 11 | localmoney | 计提组织本币金额 | localmoney | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 12 | grouprate | 集团汇率 | grouprate | decimal(28, 8) |  | 数值 (UFDouble) | 1 |
| 13 | globalrate | 全局汇率 | globalrate | decimal(28, 8) |  | 数值 (UFDouble) | 1 |
| 14 | groupmoney | 计提集团本币金额 | groupmoney | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 15 | globalmoney | 计提全局本币金额 | globalmoney | decimal(28, 8) |  | 数值 (UFDouble) | 0 |