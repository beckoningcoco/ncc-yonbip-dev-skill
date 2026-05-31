# |<<

**发出商品总账 (ia_goodsnab / nc.vo.ia.goodsnab.entity.GoodsNABVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2808.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cgoodsnabid | 发出商品明细帐总帐主键 | cgoodsnabid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 字符串 (String) |
| 3 | pk_book | 所属账簿 | pk_book | varchar(20) |  | 字符串 (String) |
| 4 | pk_org | 成本域 | pk_org | varchar(20) |  | 字符串 (String) |
| 5 | ccustomerid | 开票客户 | ccustomerid | varchar(20) |  | 字符串 (String) |
| 6 | cinventoryid | 物料主键 | cinventoryid | varchar(20) |  | 字符串 (String) |
| 7 | ccalcrangeid | 计算维度主键 | ccalcrangeid | varchar(20) |  | 字符串 (String) |
| 8 | fpricemodeflag | 计价方式 | fpricemodeflag | int |  | 整数 (Integer) |
| 9 | nabnum | 结存数量 | nabnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | nabprice | 结存单价 | nabprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | nabmny | 结存金额 | nabmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | nabvarymny | 结存差异 | nabvarymny | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | nabplanedmny | 结存计划金额 | nabplanedmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | nabglobalmny | 结存全局本币金额 | nabglobalmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | nabgroupmny | 结存集团本币金额 | nabgroupmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | nabppv | 结存PPV | nabppv | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | nabipv | 结存IPV | nabipv | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | nppvrate | PPV差异率 | nppvrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | nipvrate | IPV差异率 | nipvrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | nabupmny | 上层结存金额 | nabupmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | nabupprice | 上层结存单价 | nabupprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 22 | nabupppv | 上层结存PPV | nabupppv | decimal(28, 8) |  | 数值 (UFDouble) |
| 23 | nabupipv | 上层结存IPV | nabupipv | decimal(28, 8) |  | 数值 (UFDouble) |
| 24 | nabupplanedmny | 上层标准金额 | nabupplanedmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 25 | nupppvrate | 上层PPV差异率 | nupppvrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 26 | nupipvrate | 上层IPV差异率 | nupipvrate | decimal(28, 8) |  | 数值 (UFDouble) |