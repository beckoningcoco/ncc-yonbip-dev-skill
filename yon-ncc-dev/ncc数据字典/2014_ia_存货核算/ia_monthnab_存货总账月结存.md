# |<<

**存货总账月结存 (ia_monthnab / nc.vo.ia.monthaccount.entity.MonthnabVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2851.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cmonthnabid | 存货总账月结存 | cmonthnabid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_book | 所属账簿 | pk_book | varchar(20) |  | 账簿_财务核算账簿 (accountingbook) |
| 4 | pk_org | 成本域 | pk_org | varchar(20) |  | 组织_成本域 (costregion) |
| 5 | caccountperiod | 会计期间 | caccountperiod | char(7) |  | 字符串 (String) |
| 6 | cinventoryid | 物料 | cinventoryid | varchar(20) |  | 物料基本信息 (material_v) |
| 7 | fpricemodeflag | 计价方式 | fpricemodeflag | int |  | 整数 (Integer) |
| 8 | nabnum | 结存数量 | nabnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | nabprice | 结存单价 | nabprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | nabmny | 结存金额 | nabmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | nabvarymny | 结存差异 | nabvarymny | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | nmonthprice | 全月平均单价 | nmonthprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | nvariancerate | 差异率 | nvariancerate | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | ccalcrangeid | 计算维度 | ccalcrangeid | varchar(20) |  | 计算维度表 (ia_calcrange) |
| 15 | nabplanedmny | 结存标准金额 | nabplanedmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | nabglobalmny | 结存全局本币金额 | nabglobalmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | nabgroupmny | 结存集团本币金额 | nabgroupmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | nabppv | 结存PPV | nabppv | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | nabipv | 结存IPV | nabipv | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | nppvrate | PPV差异率 | nppvrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | nipvrate | IPV差异率 | nipvrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 22 | nabupmny | 结存上层金额 | nabupmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 23 | nabupplanedmny | 结存上层标准金额 | nabupplanedmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 24 | nabupprice | 结存上层单价 | nabupprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 25 | nabupppv | 结存上层PPV | nabupppv | decimal(28, 8) |  | 数值 (UFDouble) |
| 26 | nabupipv | 结存上层IPV | nabupipv | decimal(28, 8) |  | 数值 (UFDouble) |
| 27 | nupmonthprice | 上层全月平均单价 | nupmonthprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 28 | nupppvrate | 上层PPV差异率 | nupppvrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 29 | nupipvrate | 上层IPV差异率 | nupipvrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 30 | nabcalplanedmny | 结存计算标准金额 | nabcalplanedmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 31 | nabcalppv | 结存计算PPV | nabcalppv | decimal(28, 8) |  | 数值 (UFDouble) |
| 32 | nabcalipv | 结存计算IPV | nabcalipv | decimal(28, 8) |  | 数值 (UFDouble) |
| 33 | nabcalupplanedmny | 结存计算上层标准金额 | nabcalupplanedmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 34 | nabcalupppv | 结存计算上层PPV | nabcalupppv | decimal(28, 8) |  | 数值 (UFDouble) |
| 35 | nabcalupipv | 结存计算上层IPV | nabcalupipv | decimal(28, 8) |  | 数值 (UFDouble) |