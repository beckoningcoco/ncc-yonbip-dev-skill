# |<<

**历史成本明细 (ia_hisccpdetail / nc.vo.ia.ccpdetail.entity.HisCcpDetailVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2810.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cccpdetailid | 主键 | cccpdetailid | char(20) | √ | 主键 (UFID) |
| 2 | cbillid | 单据主表主键 | cbillid | varchar(20) |  | 主键 (UFID) |
| 3 | cbill_bid | 单据子表主键 | cbill_bid | varchar(20) |  | 主键 (UFID) |
| 4 | cdetailledgerid | 单据明细表主键 | cdetailledgerid | varchar(20) |  | 主键 (UFID) |
| 5 | pk_book | 所属账簿 | pk_book | varchar(20) |  | 账簿_核算账簿 (accbook) |
| 6 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 7 | pk_org | 成本域 | pk_org | varchar(20) |  | 组织_成本域 (costregion) |
| 8 | caccountperiod | 会计期间 | caccountperiod | varchar(20) |  | 会计月份 (accperiodmonth) |
| 9 | ccostcompid | 成本组件主键 | ccostcompid | varchar(20) |  | 成本组件 (bd_costcomponent) |
| 10 | ccurrencyid | 本位币 | ccurrencyid | varchar(20) |  | 币种 (currtype) |
| 11 | nprice | 单价 | nprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | nmny | 金额 | nmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | nplanedprice | 标准单价 | nplanedprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | nplanedmny | 标准金额 | nplanedmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | nppv | PPV | nppv | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | nipv | IPV | nipv | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | nupprice | 上层单价 | nupprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | nupmny | 上层金额 | nupmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | nupplanedprice | 上层标准单价 | nupplanedprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | nupplanedmny | 上层标准金额 | nupplanedmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | nupppv | 上层PPV | nupppv | decimal(28, 8) |  | 数值 (UFDouble) |
| 22 | nupipv | 上层IPV | nupipv | decimal(28, 8) |  | 数值 (UFDouble) |
| 23 | ngroupmny | 集团本币无税金额 | ngroupmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 24 | nglobalmny | 全局本币无税金额 | nglobalmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 25 | nincometaxmny | 进项税转出金额 | nincometaxmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 26 | nreasonalwastmny | 合理损耗金额 | nreasonalwastmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 27 | nreasonalwastprice | 合理损耗单价 | nreasonalwastprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 28 | nfactor1 | 成本要素1 | nfactor1 | decimal(28, 8) |  | 数值 (UFDouble) |
| 29 | nfactor2 | 成本要素2 | nfactor2 | decimal(28, 8) |  | 数值 (UFDouble) |
| 30 | nfactor3 | 成本要素3 | nfactor3 | decimal(28, 8) |  | 数值 (UFDouble) |
| 31 | nfactor4 | 成本要素4 | nfactor4 | decimal(28, 8) |  | 数值 (UFDouble) |
| 32 | nfactor5 | 成本要素5 | nfactor5 | decimal(28, 8) |  | 数值 (UFDouble) |
| 33 | nfactor6 | 成本要素6 | nfactor6 | decimal(28, 8) |  | 数值 (UFDouble) |
| 34 | nfactor7 | 成本要素7 | nfactor7 | decimal(28, 8) |  | 数值 (UFDouble) |
| 35 | nfactor8 | 成本要素8 | nfactor8 | decimal(28, 8) |  | 数值 (UFDouble) |
| 36 | nfactor9 | 成本要素9 | nfactor9 | decimal(28, 8) |  | 数值 (UFDouble) |
| 37 | nfactor10 | 成本要素10 | nfactor10 | decimal(28, 8) |  | 数值 (UFDouble) |
| 38 | nfactor11 | 成本要素11 | nfactor11 | decimal(28, 8) |  | 数值 (UFDouble) |
| 39 | nfactor12 | 成本要素12 | nfactor12 | decimal(28, 8) |  | 数值 (UFDouble) |
| 40 | nfactor13 | 成本要素13 | nfactor13 | decimal(28, 8) |  | 数值 (UFDouble) |
| 41 | nfactor14 | 成本要素14 | nfactor14 | decimal(28, 8) |  | 数值 (UFDouble) |
| 42 | nfactor15 | 成本要素15 | nfactor15 | decimal(28, 8) |  | 数值 (UFDouble) |
| 43 | nfactor16 | 成本要素16 | nfactor16 | decimal(28, 8) |  | 数值 (UFDouble) |
| 44 | nfactor17 | 成本要素17 | nfactor17 | decimal(28, 8) |  | 数值 (UFDouble) |
| 45 | nfactor18 | 成本要素18 | nfactor18 | decimal(28, 8) |  | 数值 (UFDouble) |
| 46 | nfactor19 | 成本要素19 | nfactor19 | decimal(28, 8) |  | 数值 (UFDouble) |
| 47 | nfactor20 | 成本要素20 | nfactor20 | decimal(28, 8) |  | 数值 (UFDouble) |