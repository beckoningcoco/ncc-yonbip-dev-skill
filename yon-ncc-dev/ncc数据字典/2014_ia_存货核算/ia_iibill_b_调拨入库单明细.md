# |<<

**调拨入库单明细 (ia_iibill_b / nc.vo.ia.mii.entity.IIItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2844.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cbill_bid | 调拨入库单明细 | cbill_bid | char(20) | √ | 主键 (UFID) |
| 2 | crowno | 行标识 | crowno | varchar(20) |  | 字符串 (String) |
| 3 | cinventoryid | 物料 | cinventoryid | varchar(20) | √ | 物料基本信息 (material_v) |
| 4 | cinventoryvid | 物料多版本 | cinventoryvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 5 | vbatchcode | 批次号 | vbatchcode | varchar(40) |  | 字符串 (String) |
| 6 | nnum | 主数量 | nnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 7 | nastnum | 数量 | nastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | cunitid | 主单位 | cunitid | varchar(20) |  | 计量单位 (measdoc) |
| 9 | castunitid | 单位 | castunitid | varchar(20) |  | 计量单位 (measdoc) |
| 10 | vchangerate | 换算率 | vchangerate | varchar(60) |  | 字符串 (String) |
| 11 | nprice | 单价 | nprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | nmny | 金额 | nmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | nplanedprice | 标准单价 | nplanedprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | nplanedmny | 标准金额 | nplanedmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | nvarymny | 差异金额 | nvarymny | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | ccurrencyid | 本位币 | ccurrencyid | varchar(20) |  | 币种 (currtype) |
| 17 | ngroupexchgrate | 集团本位币汇率 | ngroupexchgrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | nglobalexchgrate | 全局本位币汇率 | nglobalexchgrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | ngroupmny | 集团本币无税金额 | ngroupmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | nglobalmny | 全局本币无税金额 | nglobalmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | dbizdate | 业务日期 | dbizdate | char(19) |  | 日期 (UFDate) |
| 22 | blargessflag | 赠品标志 | blargessflag | char(1) |  | 布尔类型 (UFBoolean) |
| 23 | approver | 审核人 | approver | varchar(20) |  | 用户 (user) |
| 24 | taudittime | 审核时间 | taudittime | varchar(19) |  | 日期时间 (UFDateTime) |
| 25 | nadjustnum | 调整数量 | nadjustnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 26 | cadjustbillitemid | 调整单据分录 | cadjustbillitemid | varchar(20) |  | 字符串 (String) |
| 27 | cadjustbillid | 调整单据 | cadjustbillid | varchar(20) |  | 字符串 (String) |
| 28 | nredbacknum | 累计冲回数量 | nredbacknum | decimal(28, 8) |  | 数值 (UFDouble) |
| 29 | cprofitcenterid | 利润中心 | cprofitcenterid | varchar(20) |  | 利润中心 (profitcenter) |
| 30 | cprofitcentervid | 利润中心版本 | cprofitcentervid | varchar(20) |  | 利润中心版本 (profitcenterVersion) |
| 31 | cprojectid | 项目 | cprojectid | varchar(20) |  | 项目 (project) |
| 32 | casscustid | 客户 | casscustid | varchar(20) |  | 客户基本信息 (customer) |
| 33 | cproductorid | 生产厂商 | cproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 34 | vfirsttype | 源头单据类型 | vfirsttype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 35 | vfirsttrantype | 源头交易类型 | vfirsttrantype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 36 | vfirstcode | 源头单据号 | vfirstcode | varchar(40) |  | 字符串 (String) |
| 37 | cfirstid | 源头单据 | cfirstid | varchar(20) |  | 字符串 (String) |
| 38 | cfirstbid | 源头单据分录 | cfirstbid | varchar(20) |  | 字符串 (String) |
| 39 | vfirstrowno | 源头单据行号 | vfirstrowno | varchar(20) |  | 字符串 (String) |
| 40 | vsrctype | 来源单据类型 | vsrctype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 41 | vsrctrantype | 来源交易类型 | vsrctrantype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 42 | vsrccode | 来源单据号 | vsrccode | varchar(40) |  | 字符串 (String) |
| 43 | csrcid | 来源单据 | csrcid | varchar(20) |  | 字符串 (String) |
| 44 | vsrcrowno | 来源单据行号 | vsrcrowno | varchar(20) |  | 字符串 (String) |
| 45 | csrcbid | 来源单据分录 | csrcbid | varchar(20) |  | 字符串 (String) |
| 46 | cicitemid | 库存子表 | cicitemid | varchar(20) |  | 字符串 (String) |
| 47 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 48 | pk_book | 所属账簿 | pk_book | varchar(20) |  | 账簿_核算账簿 (accbook) |
| 49 | pk_org | 成本域 | pk_org | varchar(20) |  | 组织_成本域 (costregion) |
| 50 | caccountperiod | 会计期间 | caccountperiod | char(7) |  | 字符串 (String) |
| 51 | dbilldate | 单据日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 52 | ccalcthreadid | 计算线索 | ccalcthreadid | varchar(20) |  | 字符串 (String) |
| 53 | ccalcid | 计算关系 | ccalcid | varchar(20) |  | 字符串 (String) |
| 54 | fcalcbizflag | 计算关系的业务类型 | fcalcbizflag | int |  | 计算业务类型 (calcbiztype) |  | 1=普通计算类型; |