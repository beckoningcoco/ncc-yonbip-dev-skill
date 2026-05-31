# |<<

**成本发出商品月结存实体 (ia_goodsmonthnab_ccp / nc.vo.ia.monthaccount.entity.GoodsMonthNABCcpVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2807.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cgoodsmonthnabccpid | 主键 | cgoodsmonthnabccpid | char(20) | √ | 主键 (UFID) |
| 2 | pk_book | 所属账簿 | pk_book | varchar(20) |  | 账簿_财务核算账簿 (accountingbook) |
| 3 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 成本域 | pk_org | varchar(20) |  | 组织_成本域 (costregion) |
| 5 | caccountperiod | 会计期间 | caccountperiod | char(7) |  | 字符串 (String) |
| 6 | ccustomerid | 开票客户 | ccustomerid | varchar(20) |  | 客户基本信息 (customer) |
| 7 | cinventoryid | 物料 | cinventoryid | varchar(20) |  | 物料基本信息 (material_v) |
| 8 | ccalcrangeid | 计算维度 | ccalcrangeid | varchar(20) |  | 计算维度表 (ia_calcrange) |
| 9 | ccostcompid | 成本组件 | ccostcompid | varchar(20) |  | 成本组件 (bd_costcomponent) |
| 10 | nabnum | 结存数量 | nabnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | nabprice | 结存单价 | nabprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | nabmny | 结存金额 | nabmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | nabplanedmny | 结存计划金额 | nabplanedmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | nabppv | 结存PPV | nabppv | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | nabipv | 结存IPV | nabipv | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | nabupmny | 上层结存金额 | nabupmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | nabupprice | 上层结存单价 | nabupprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | nabupplanedmny | 上层标准金额 | nabupplanedmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | nabupppv | 上层结存PPV | nabupppv | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | nabupipv | 上层结存IPV | nabupipv | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | fpricemodeflag | 计价方式 | fpricemodeflag | int |  | 整数 (Integer) |
| 22 | nabglobalmny | 结存全局本币金额 | nabglobalmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 23 | nabgroupmny | 结存集团本币金额 | nabgroupmny | decimal(28, 8) |  | 数值 (UFDouble) |