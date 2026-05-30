# |<<

**成本发出商品明细账 (ia_ccpgoods / nc.vo.ia.ccpgoods.entity.CcpGoodsVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2798.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cccpgoodsid | 成本发出商品明细帐 | cccpgoodsid | char(20) | √ | 主键 (UFID) |
| 2 | cdetailledgerid | 单据明细表 | cdetailledgerid | varchar(50) |  | 字符串 (String) |
| 3 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_book | 所属账簿 | pk_book | varchar(20) |  | 账簿_财务核算账簿 (accountingbook) |
| 5 | pk_org | 成本域 | pk_org | varchar(20) |  | 组织_成本域 (costregion) |
| 6 | caccountperiod | 会计期间 | caccountperiod | varchar(20) |  | 会计月份 (accperiodmonth) |
| 7 | ccostcompid | 成本组件主键 | ccostcompid | varchar(20) |  | 成本组件 (bd_costcomponent) |
| 8 | ccurrencyid | 本位币 | ccurrencyid | varchar(20) |  | 币种 (currtype) |
| 9 | nprice | 单价 | nprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | nmny | 金额 | nmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | nplanedprice | 标准单价 | nplanedprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | nplanedmny | 标准金额 | nplanedmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | nppv | PPV | nppv | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | nipv | IPV | nipv | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | nupprice | 上层单价 | nupprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | nupmny | 上层金额 | nupmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | nupplanedprice | 上层标准单价 | nupplanedprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | nupplanedmny | 上层标准金额 | nupplanedmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | nupppv | 上层PPV | nupppv | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | nupipv | 上层IPV | nupipv | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | ngroupmny | 集团本币无税金额 | ngroupmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 22 | nglobalmny | 全局本币无税金额 | nglobalmny | decimal(28, 8) |  | 数值 (UFDouble) |