# |<<

**费用待摊摊销信息 (er_expamtinfo / nc.vo.erm.expamortize.ExpamtinfoVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1892.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_expamtinfo | 主键 | pk_expamtinfo | char(20) | √ | 主键 (UFID) |
| 2 | pk_jkbx | 报销单 | pk_jkbx | varchar(20) |  | 报销单 (bxzb) |
| 3 | bx_billno | 报销单编号 | bx_billno | varchar(50) |  | 字符串 (String) |
| 4 | total_period | 总摊销期 | total_period | int |  | 整数 (Integer) |
| 5 | total_amount | 总摊销金额 | total_amount | decimal(28, 8) |  | 数值 (UFDouble) |
| 6 | res_period | 剩余摊销期 | res_period | int |  | 整数 (Integer) |
| 7 | res_amount | 剩余摊销金额 | res_amount | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | start_period | 起摊会计期间 | start_period | varchar(50) |  | 字符串 (String) |
| 9 | end_period | 止摊会计期间 | end_period | varchar(50) |  | 字符串 (String) |
| 10 | bzbm | 币种 | bzbm | varchar(20) |  | 币种 (currtype) |
| 11 | bbhl | 组织本币汇率 | bbhl | decimal(15, 8) |  | 数值 (UFDouble) |
| 12 | globalbbhl | 全局本币汇率 | globalbbhl | decimal(15, 8) |  | 数值 (UFDouble) |
| 13 | groupbbhl | 集团本币汇率 | groupbbhl | decimal(15, 8) |  | 数值 (UFDouble) |
| 14 | bbje | 组织本币总金额 | bbje | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | globalbbje | 全局本币总金额 | globalbbje | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | groupbbje | 集团本币总金额 | groupbbje | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | res_orgamount | 组织本币剩余金额 | res_orgamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | res_groupamount | 集团本币剩余金额 | res_groupamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | res_globalamount | 全局本币剩余金额 | res_globalamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 21 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 22 | billstatus | 单据状态 | billstatus | int |  | 待摊摊销信息单据状态 (enum) |  | 0=初始态; |