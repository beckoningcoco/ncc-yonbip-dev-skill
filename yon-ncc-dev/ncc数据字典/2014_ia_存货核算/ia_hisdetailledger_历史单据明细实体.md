# |<<

**历史单据明细实体 (ia_hisdetailledger / nc.vo.ia.detailledger.entity.HisDetailLedgerVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2811.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cdetailledgerid | 单据明细表主键 | cdetailledgerid | char(20) | √ | 主键 (UFID) |
| 2 | cbillid | 单据主表主键 | cbillid | char(20) |  | 主键 (UFID) |
| 3 | cbill_bid | 单据子表主键 | cbill_bid | char(20) |  | 主键 (UFID) |
| 4 | pk_book | 所属账簿 | pk_book | varchar(20) |  | 账簿_核算账簿 (accbook) |
| 5 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 6 | pk_org | 成本域 | pk_org | varchar(20) |  | 组织_成本域 (costregion) |
| 7 | caccountperiod | 会计期间 | caccountperiod | varchar(20) |  | 会计月份 (accperiodmonth) |
| 8 | dbizdate | 业务日期 | dbizdate | char(19) |  | 日期 (UFDate) |
| 9 | crowno | 行号 | crowno | varchar(20) |  | 字符串 (String) |
| 10 | cinventoryid | 物料主键 | cinventoryid | varchar(20) |  | 物料基本信息 (material_v) |
| 11 | cinventoryvid | 物料版本主键 | cinventoryvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 12 | fpricemodeflag | 计价方式 | fpricemodeflag | int |  | 整数 (Integer) |
| 13 | cunitid | 主单位 | cunitid | varchar(20) |  | 计量单位 (measdoc) |
| 14 | nnum | 主数量 | nnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | nprice | 单价 | nprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | nplanedprice | 标准单价 | nplanedprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | nmny | 金额 | nmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | nplanedmny | 标准金额 | nplanedmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | nvarymny | 差异金额 | nvarymny | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | ccurrencyid | 本位币 | ccurrencyid | varchar(20) |  | 币种 (currtype) |
| 21 | nastnum | 数量 | nastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 22 | castunitid | 单位 | castunitid | varchar(20) |  | 计量单位 (measdoc) |
| 23 | vchangerate | 换算率 | vchangerate | varchar(60) |  | 字符串 (String) |
| 24 | blargessflag | 赠品标志 | blargessflag | char(1) |  | 布尔类型 (UFBoolean) |
| 25 | ncost | 费用 | ncost | decimal(28, 8) |  | 数值 (UFDouble) |
| 26 | ngroupexchgrate | 集团本位币汇率 | ngroupexchgrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 27 | nglobalexchgrate | 全局本位币汇率 | nglobalexchgrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 28 | ngroupmny | 集团本币无税金额 | ngroupmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 29 | nglobalmny | 全局本币无税金额 | nglobalmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 30 | fdatagetflag | 数据获得方式 | fdatagetflag | int |  | 数据获得方式 (datagetmodel) |  | 1=未取得数据; |