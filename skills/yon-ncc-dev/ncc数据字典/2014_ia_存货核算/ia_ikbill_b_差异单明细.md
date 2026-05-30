# |<<

**差异单明细 (ia_ikbill_b / nc.vo.ia.mik.entity.IKItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2848.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cbill_bid | 差异单明细 | cbill_bid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_book | 所属账簿 | pk_book | varchar(20) |  | 账簿_核算账簿 (accbook) |
| 4 | pk_org | 成本域 | pk_org | varchar(20) |  | 组织_成本域 (costregion) |
| 5 | crowno | 行号 | crowno | varchar(50) |  | 字符串 (String) |
| 6 | caccountperiod | 会计期间 | caccountperiod | varchar(50) |  | 字符串 (String) |
| 7 | dbilldate | 单据日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 8 | daccountdate | 会计期间计算日期 | daccountdate | char(19) |  | 日期 (UFDate) |
| 9 | cinventoryid | 物料 | cinventoryid | varchar(20) |  | 物料基本信息 (material_v) |
| 10 | cinventoryvid | 物料多版本 | cinventoryvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 11 | cinvclassid | 物料分类 | cinvclassid | varchar(20) |  | 物料基本分类 (marbasclass) |
| 12 | vbatchcode | 批次号 | vbatchcode | varchar(50) |  | 字符串 (String) |
| 13 | cunitid | 主单位 | cunitid | varchar(20) |  | 计量单位 (measdoc) |
| 14 | castunitid | 单位 | castunitid | varchar(20) |  | 计量单位 (measdoc) |
| 15 | vchangerate | 换算率 | vchangerate | varchar(50) |  | 字符串 (String) |
| 16 | nmny | 金额 | nmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | nplanedmny | 标准金额 | nplanedmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | nvarymny | 差异金额 | nvarymny | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | nppv | PPV | nppv | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | nipv | IPV | nipv | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | nupmny | 上层金额 | nupmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 22 | nupplanedmny | 上层标准金额 | nupplanedmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 23 | nupppv | 上层PPV | nupppv | decimal(28, 8) |  | 数值 (UFDouble) |
| 24 | nupipv | 上层IPV | nupipv | decimal(28, 8) |  | 数值 (UFDouble) |
| 25 | ccurrencyid | 本位币 | ccurrencyid | varchar(20) |  | 币种 (currtype) |
| 26 | ngroupexchgrate | 集团本位币汇率 | ngroupexchgrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 27 | nglobalexchgrate | 全局本位币汇率 | nglobalexchgrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 28 | ngroupmny | 集团本币无税金额 | ngroupmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 29 | nglobalmny | 全局本币无税金额 | nglobalmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 30 | cprofitcenterid | 利润中心 | cprofitcenterid | varchar(20) |  | 利润中心 (profitcenter) |
| 31 | cprofitcentervid | 利润中心版本 | cprofitcentervid | varchar(20) |  | 利润中心版本 (profitcenterVersion) |
| 32 | vfirsttype | 源头单据类型 | vfirsttype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 33 | vfirsttrantype | 源头交易类型 | vfirsttrantype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 34 | vfirstcode | 源头单据号 | vfirstcode | varchar(50) |  | 字符串 (String) |
| 35 | cfirstid | 源头单据 | cfirstid | varchar(50) |  | 字符串 (String) |
| 36 | cfirstbid | 源头单据分录 | cfirstbid | varchar(50) |  | 字符串 (String) |
| 37 | vfirstrowno | 源头单据行号 | vfirstrowno | varchar(50) |  | 字符串 (String) |
| 38 | vsrctype | 来源单据类型 | vsrctype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 39 | vsrctrantype | 来源交易类型 | vsrctrantype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 40 | vsrccode | 来源单据号 | vsrccode | varchar(50) |  | 字符串 (String) |
| 41 | csrcid | 来源单据 | csrcid | varchar(50) |  | 字符串 (String) |
| 42 | vsrcrowno | 来源单据行号 | vsrcrowno | varchar(50) |  | 字符串 (String) |
| 43 | csrcbid | 来源单据分录 | csrcbid | varchar(50) |  | 字符串 (String) |
| 44 | cicitemid | 库存子表 | cicitemid | varchar(50) |  | 字符串 (String) |
| 45 | cvendorid | 供应商 | cvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 46 | cprojectid | 项目 | cprojectid | varchar(20) |  | 项目 (project) |
| 47 | casscustid | 客户 | casscustid | varchar(20) |  | 客户基本信息 (customer) |
| 48 | cproductorid | 生产厂商 | cproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 49 | ccalcthreadid | 计算线索 | ccalcthreadid | varchar(50) |  | 字符串 (String) |
| 50 | ccalcid | 计算关系 | ccalcid | varchar(50) |  | 字符串 (String) |
| 51 | fcalcbizflag | 计算关系的业务类型 | fcalcbizflag | int |  | 计算业务类型 (calcbiztype) |  | 1=普通计算类型; |