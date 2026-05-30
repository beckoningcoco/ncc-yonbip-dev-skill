# |<<

**成本组件存货总账实体 (ia_generalnab_ccp / nc.vo.ia.generalnab.entity.GeneralNABCcpVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2804.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cgeneralnabccpid | 主键 | cgeneralnabccpid | char(20) | √ | 主键 (UFID) |
| 2 | pk_book | 所属账簿 | pk_book | varchar(20) |  | 账簿_核算账簿 (accbook) |
| 3 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 成本域 | pk_org | varchar(20) |  | 组织_成本域 (costregion) |
| 5 | cinventoryid | 物料 | cinventoryid | varchar(20) | √ | 物料基本信息 (material_v) |
| 6 | ccalcrangeid | 计算维度 | ccalcrangeid | varchar(20) |  | 计算维度表 (ia_calcrange) |
| 7 | ccostcompid | 成本组件 | ccostcompid | varchar(20) |  | 成本组件 (bd_costcomponent) |
| 8 | nabnum | 结存数量 | nabnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | nabprice | 结存单价 | nabprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | nabmny | 结存金额 | nabmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | nabplanedmny | 结存标准金额 | nabplanedmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | nabppv | 结存PPV | nabppv | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | nabipv | 结存IPV | nabipv | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | nppvrate | PPV差异率 | nppvrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | nipvrate | IPV差异率 | nipvrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | nmonthprice | 全月平均单价 | nmonthprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | nabupmny | 结存上层金额 | nabupmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | nabupprice | 结存上层单价 | nabupprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | nabupplanedmny | 结存上层标准金额 | nabupplanedmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | nabupppv | 结存上层PPV | nabupppv | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | nabupipv | 结存上层IPV | nabupipv | decimal(28, 8) |  | 数值 (UFDouble) |
| 22 | nupmonthprice | 上层全月平均单价 | nupmonthprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 23 | nupppvrate | 上层PPV差异率 | nupppvrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 24 | nupipvrate | 上层IPV差异率 | nupipvrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 25 | fpricemodeflag | 计价方式 | fpricemodeflag | int |  | 整数 (Integer) |
| 26 | nabgroupmny | 结存集团本币金额 | nabgroupmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 27 | nabglobalmny | 结存全局本币金额 | nabglobalmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 28 | nabcalplanedmny | 结存计算标准金额 | nabcalplanedmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 29 | nabcalppv | 结存计算PPV | nabcalppv | decimal(28, 8) |  | 数值 (UFDouble) |
| 30 | nabcalipv | 结存计算IPV | nabcalipv | decimal(28, 8) |  | 数值 (UFDouble) |
| 31 | nabcalupplanedmny | 结存计算上层标准金额 | nabcalupplanedmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 32 | nabcalupppv | 结存计算上层PPV | nabcalupppv | decimal(28, 8) |  | 数值 (UFDouble) |
| 33 | nabcalupipv | 结存计算上层IPV | nabcalupipv | decimal(28, 8) |  | 数值 (UFDouble) |