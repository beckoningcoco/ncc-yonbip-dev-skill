# |<<

**出库调整单明细 (ia_iabill_b / nc.vo.ia.mia.entity.IAItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2831.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cbill_bid | 出库调整单明细 | cbill_bid | char(20) | √ | 主键 (UFID) |
| 2 | crowno | 行号 | crowno | varchar(20) |  | 字符串 (String) |
| 3 | cinventoryid | 物料 | cinventoryid | varchar(20) | √ | 物料基本信息 (material_v) |
| 4 | cinventoryvid | 物料版本 | cinventoryvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 5 | vbatchcode | 批次号 | vbatchcode | varchar(40) |  | 字符串 (String) |
| 6 | nmny | 金额 | nmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 7 | nplanedmny | 标准金额 | nplanedmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | nvarymny | 差异金额 | nvarymny | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | ccurrencyid | 本位币 | ccurrencyid | varchar(20) |  | 币种 (currtype) |
| 10 | ngroupexchgrate | 集团本位币汇率 | ngroupexchgrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | nglobalexchgrate | 全局本位币汇率 | nglobalexchgrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | ngroupmny | 集团本币无税金额 | ngroupmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | nglobalmny | 全局本币无税金额 | nglobalmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | dbizdate | 业务日期 | dbizdate | char(19) |  | 日期 (UFDate) |
| 15 | approver | 审核人 | approver | varchar(20) |  | 用户 (user) |
| 16 | taudittime | 审核时间 | taudittime | varchar(19) |  | 日期时间 (UFDateTime) |
| 17 | ccostclassid | 产成品成本分类 | ccostclassid | varchar(20) |  | 物料成本分类 (marcostclass) |
| 18 | ccostobjid | 产成品 | ccostobjid | varchar(20) |  | 物料基本信息 (material_v) |
| 19 | vproducebatch | 产成品生产批次 | vproducebatch | varchar(40) |  | 字符串 (String) |
| 20 | cworkcenterid | 工作中心 | cworkcenterid | varchar(20) |  | 工作中心 (bd_wk) |
| 21 | ccostcenterid | 成本中心 | ccostcenterid | varchar(20) |  | 成本中心 (resacostcenter) |
| 22 | cprofitcenterid | 利润中心 | cprofitcenterid | varchar(20) |  | 利润中心 (profitcenter) |
| 23 | cprofitcentervid | 利润中心版本 | cprofitcentervid | varchar(20) |  | 利润中心版本 (profitcenterVersion) |
| 24 | cvendorid | 供应商 | cvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 25 | cprojectid | 项目 | cprojectid | varchar(20) |  | 项目 (project) |
| 26 | casscustid | 客户 | casscustid | varchar(20) |  | 客户基本信息 (customer) |
| 27 | cproductorid | 生产厂商 | cproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 28 | vfirsttype | 源头单据类型 | vfirsttype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 29 | vfirsttrantype | 源头交易类型 | vfirsttrantype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 30 | vfirstcode | 源头单据号 | vfirstcode | varchar(40) |  | 字符串 (String) |
| 31 | cfirstid | 源头单据 | cfirstid | varchar(20) |  | 字符串 (String) |
| 32 | cfirstbid | 源头单据分录 | cfirstbid | varchar(20) |  | 字符串 (String) |
| 33 | vfirstrowno | 源头单据行号 | vfirstrowno | varchar(20) |  | 字符串 (String) |
| 34 | vsrctype | 来源单据类型 | vsrctype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 35 | vsrctrantype | 来源交易类型 | vsrctrantype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 36 | vsrccode | 来源单据号 | vsrccode | varchar(40) |  | 字符串 (String) |
| 37 | csrcid | 来源单据 | csrcid | varchar(20) |  | 字符串 (String) |
| 38 | vsrcrowno | 来源单据行号 | vsrcrowno | varchar(20) |  | 字符串 (String) |
| 39 | csrcbid | 来源单据分录 | csrcbid | char(20) |  | 主键 (UFID) |
| 40 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 41 | pk_book | 所属账簿 | pk_book | varchar(20) |  | 账簿_财务核算账簿 (accountingbook) |
| 42 | pk_org | 成本域 | pk_org | varchar(20) |  | 组织_成本域 (costregion) |
| 43 | caccountperiod | 会计期间 | caccountperiod | char(7) |  | 字符串 (String) |
| 44 | dbilldate | 单据日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 45 | ccalcthreadid | 计算线索主键 | ccalcthreadid | varchar(20) |  | 字符串 (String) |
| 46 | ccalcid | 计算关系主键 | ccalcid | varchar(20) |  | 字符串 (String) |
| 47 | fcalcbizflag | 计算关系的业务类型 | fcalcbizflag | int |  | 计算业务类型 (calcbiztype) |  | 1=普通计算类型; |