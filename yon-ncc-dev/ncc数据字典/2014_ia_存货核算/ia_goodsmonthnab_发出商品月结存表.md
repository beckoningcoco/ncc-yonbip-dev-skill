# |<<

**发出商品月结存表 (ia_goodsmonthnab / nc.vo.ia.monthaccount.entity.GoodsMonthnabVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2806.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cgoodsmonthnabid | 发出商品明细帐总帐主键 | cgoodsmonthnabid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_book | 所属账簿 | pk_book | varchar(20) |  | 账簿_财务核算账簿 (accountingbook) |
| 4 | pk_org | 成本域 | pk_org | varchar(20) |  | 组织_成本域 (costregion) |
| 5 | caccountperiod | 会计期间 | caccountperiod | char(7) |  | 主键 (UFID) |
| 6 | ccustomerid | 开票客户 | ccustomerid | varchar(20) |  | 客户基本信息 (customer) |
| 7 | cinventoryid | 物料主键 | cinventoryid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 8 | ccalcrangeid | 计算维度主键 | ccalcrangeid | varchar(20) |  | 计算维度表 (ia_calcrange) |
| 9 | fpricemodeflag | 计价方式 | fpricemodeflag | int |  | 整数 (Integer) |
| 10 | nabnum | 结存数量 | nabnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | nabprice | 结存单价 | nabprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | nabmny | 结存金额 | nabmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | nabvarymny | 结存差异 | nabvarymny | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | nabplanedmny | 结存计划金额 | nabplanedmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | nabglobalmny | 结存全局本币金额 | nabglobalmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | nabgroupmny | 结存集团本币金额 | nabgroupmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | nabppv | 结存PPV | nabppv | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | nabipv | 结存IPV | nabipv | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | nabupmny | 上层结存金额 | nabupmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | nabupprice | 上层结存单价 | nabupprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | nabupppv | 上层结存PPV | nabupppv | decimal(28, 8) |  | 数值 (UFDouble) |
| 22 | nabupipv | 上层结存IPV | nabupipv | decimal(28, 8) |  | 数值 (UFDouble) |
| 23 | nabupplanedmny | 上层标准金额 | nabupplanedmny | decimal(28, 8) |  | 数值 (UFDouble) |