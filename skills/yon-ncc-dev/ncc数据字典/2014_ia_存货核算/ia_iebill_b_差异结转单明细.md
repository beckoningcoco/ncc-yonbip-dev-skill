# |<<

**差异结转单明细 (ia_iebill_b / nc.vo.ia.mie.entity.IEItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2838.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cbill_bid | 差异结转单明细 | cbill_bid | char(20) | √ | 主键 (UFID) |
| 2 | crowno | 行号 | crowno | varchar(20) |  | 字符串 (String) |
| 3 | cinventoryid | 物料 | cinventoryid | varchar(20) | √ | 物料基本信息 (material_v) |
| 4 | cinventoryvid | 物料版本 | cinventoryvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 5 | vbatchcode | 批次号 | vbatchcode | varchar(40) |  | 字符串 (String) |
| 6 | nmny | 金额 | nmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 7 | nplanedmny | 计划金额 | nplanedmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | nvarymny | 差异金额 | nvarymny | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | ccurrencyid | 本位币 | ccurrencyid | varchar(20) |  | 币种 (currtype) |
| 10 | ngroupexchgrate | 集团本位币汇率 | ngroupexchgrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | nglobalexchgrate | 全局本位币汇率 | nglobalexchgrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | ngroupmny | 集团本币无税金额 | ngroupmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | nglobalmny | 全局本币无税金额 | nglobalmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | dbizdate | 业务日期 | dbizdate | char(19) |  | 日期 (UFDate) |
| 15 | blargessflag | 赠品标志 | blargessflag | char(1) |  | 布尔类型 (UFBoolean) |
| 16 | approver | 审核人 | approver | varchar(20) |  | 用户 (user) |
| 17 | taudittime | 审核时间 | taudittime | char(19) |  | 日期时间 (UFDateTime) |
| 18 | ccostclassid | 成本对象成本分类 | ccostclassid | varchar(20) |  | 物料成本分类 (marcostclass) |
| 19 | ccostobjid | 成本对象产品 | ccostobjid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 20 | vproducebatch | 成本对象生产批次 | vproducebatch | varchar(30) |  | 字符串 (String) |
| 21 | cworkcenterid | 工作中心 | cworkcenterid | varchar(20) |  | 工作中心 (bd_wk) |
| 22 | ccostcenterid | 成本中心 | ccostcenterid | varchar(20) |  | 成本中心 (resacostcenter) |
| 23 | cfactorid | 核算要素 | cfactorid | varchar(20) |  | 主键 (UFID) |
| 24 | vproduceordercode | 生产订单号 | vproduceordercode | varchar(40) |  | 字符串 (String) |
| 25 | cprofitcenterid | 利润中心 | cprofitcenterid | varchar(20) |  | 利润中心 (profitcenter) |
| 26 | cprofitcentervid | 利润中心版本 | cprofitcentervid | varchar(20) |  | 利润中心版本 (profitcenterVersion) |
| 27 | cvendorid | 供应商 | cvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 28 | cprojectid | 项目 | cprojectid | varchar(20) |  | 项目 (project) |
| 29 | casscustid | 客户 | casscustid | varchar(20) |  | 客户基本信息 (customer) |
| 30 | cproductorid | 生产厂家 | cproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 31 | vsrctype | 来源单据类型 | vsrctype | varchar(20) |  | 字符串 (String) |
| 32 | vsrctrantype | 来源交易类型 | vsrctrantype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 33 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 34 | pk_book | 所属账簿 | pk_book | varchar(20) |  | 账簿_财务核算账簿 (accountingbook) |
| 35 | pk_org | 成本域 | pk_org | varchar(20) |  | 组织_成本域 (costregion) |
| 36 | caccountperiod | 会计期间 | caccountperiod | char(7) |  | 字符串 (String) |
| 37 | dbilldate | 单据日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 38 | nppv | PPV | nppv | decimal(28, 8) |  | 数值 (UFDouble) |
| 39 | nipv | IPV | nipv | decimal(28, 8) |  | 数值 (UFDouble) |
| 40 | nupmny | 上层金额 | nupmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 41 | nupppv | 上层PPV | nupppv | decimal(28, 8) |  | 数值 (UFDouble) |
| 42 | nupipv | 上层IPV | nupipv | decimal(28, 8) |  | 数值 (UFDouble) |
| 43 | vfree1 | 自由辅助属性1 | vfree1 | varchar(101) |  | 自由项 (Custom) |
| 44 | vfree2 | 自由辅助属性2 | vfree2 | varchar(101) |  | 自由项 (Custom) |
| 45 | vfree3 | 自由辅助属性3 | vfree3 | varchar(101) |  | 自由项 (Custom) |
| 46 | vfree4 | 自由辅助属性4 | vfree4 | varchar(101) |  | 自由项 (Custom) |
| 47 | vfree5 | 自由辅助属性5 | vfree5 | varchar(101) |  | 自由项 (Custom) |
| 48 | vfree6 | 自由辅助属性6 | vfree6 | varchar(101) |  | 自由项 (Custom) |
| 49 | vfree7 | 自由辅助属性7 | vfree7 | varchar(101) |  | 自由项 (Custom) |
| 50 | vfree8 | 自由辅助属性8 | vfree8 | varchar(101) |  | 自由项 (Custom) |
| 51 | vfree9 | 自由辅助属性9 | vfree9 | varchar(101) |  | 自由项 (Custom) |
| 52 | vfree10 | 自由辅助属性10 | vfree10 | varchar(101) |  | 自由项 (Custom) |
| 53 | vbdef1 | 表体自定义项1 | vbdef1 | varchar(101) |  | 自定义项 (Custom) |
| 54 | vbdef2 | 表体自定义项2 | vbdef2 | varchar(101) |  | 自定义项 (Custom) |
| 55 | vbdef3 | 表体自定义项3 | vbdef3 | varchar(101) |  | 自定义项 (Custom) |
| 56 | vbdef4 | 表体自定义项4 | vbdef4 | varchar(101) |  | 自定义项 (Custom) |
| 57 | vbdef5 | 表体自定义项5 | vbdef5 | varchar(101) |  | 自定义项 (Custom) |
| 58 | vbdef6 | 表体自定义项6 | vbdef6 | varchar(101) |  | 自定义项 (Custom) |
| 59 | vbdef7 | 表体自定义项7 | vbdef7 | varchar(101) |  | 自定义项 (Custom) |
| 60 | vbdef8 | 表体自定义项8 | vbdef8 | varchar(101) |  | 自定义项 (Custom) |
| 61 | vbdef9 | 表体自定义项9 | vbdef9 | varchar(101) |  | 自定义项 (Custom) |
| 62 | vbdef10 | 表体自定义项10 | vbdef10 | varchar(101) |  | 自定义项 (Custom) |
| 63 | vbdef11 | 表体自定义项11 | vbdef11 | varchar(101) |  | 自定义项 (Custom) |
| 64 | vbdef12 | 表体自定义项12 | vbdef12 | varchar(101) |  | 自定义项 (Custom) |
| 65 | vbdef13 | 表体自定义项13 | vbdef13 | varchar(101) |  | 自定义项 (Custom) |
| 66 | vbdef14 | 表体自定义项14 | vbdef14 | varchar(101) |  | 自定义项 (Custom) |
| 67 | vbdef15 | 表体自定义项15 | vbdef15 | varchar(101) |  | 自定义项 (Custom) |
| 68 | vbdef16 | 表体自定义项16 | vbdef16 | varchar(101) |  | 自定义项 (Custom) |
| 69 | vbdef17 | 表体自定义项17 | vbdef17 | varchar(101) |  | 自定义项 (Custom) |
| 70 | vbdef18 | 表体自定义项18 | vbdef18 | varchar(101) |  | 自定义项 (Custom) |
| 71 | vbdef19 | 表体自定义项19 | vbdef19 | varchar(101) |  | 自定义项 (Custom) |
| 72 | vbdef20 | 表体自定义项20 | vbdef20 | varchar(101) |  | 自定义项 (Custom) |
| 73 | vbdef21 | 表体自定义项21 | vbdef21 | varchar(101) |  | 自定义项 (Custom) |
| 74 | vbdef22 | 表体自定义项22 | vbdef22 | varchar(101) |  | 自定义项 (Custom) |
| 75 | vbdef23 | 表体自定义项23 | vbdef23 | varchar(101) |  | 自定义项 (Custom) |
| 76 | vbdef24 | 表体自定义项24 | vbdef24 | varchar(101) |  | 自定义项 (Custom) |
| 77 | vbdef25 | 表体自定义项25 | vbdef25 | varchar(101) |  | 自定义项 (Custom) |
| 78 | vbdef26 | 表体自定义项26 | vbdef26 | varchar(101) |  | 自定义项 (Custom) |
| 79 | vbdef27 | 表体自定义项27 | vbdef27 | varchar(101) |  | 自定义项 (Custom) |
| 80 | vbdef28 | 表体自定义项28 | vbdef28 | varchar(101) |  | 自定义项 (Custom) |
| 81 | vbdef29 | 表体自定义项29 | vbdef29 | varchar(101) |  | 自定义项 (Custom) |
| 82 | vbdef30 | 表体自定义项30 | vbdef30 | varchar(101) |  | 自定义项 (Custom) |
| 83 | vbdef31 | 表体自定义项31 | vbdef31 | varchar(101) |  | 自定义项 (Custom) |
| 84 | vbdef32 | 表体自定义项32 | vbdef32 | varchar(101) |  | 自定义项 (Custom) |
| 85 | vbdef33 | 表体自定义项33 | vbdef33 | varchar(101) |  | 自定义项 (Custom) |
| 86 | vbdef34 | 表体自定义项34 | vbdef34 | varchar(101) |  | 自定义项 (Custom) |
| 87 | vbdef35 | 表体自定义项35 | vbdef35 | varchar(101) |  | 自定义项 (Custom) |
| 88 | vbdef36 | 表体自定义项36 | vbdef36 | varchar(101) |  | 自定义项 (Custom) |
| 89 | vbdef37 | 表体自定义项37 | vbdef37 | varchar(101) |  | 自定义项 (Custom) |
| 90 | vbdef38 | 表体自定义项38 | vbdef38 | varchar(101) |  | 自定义项 (Custom) |
| 91 | vbdef39 | 表体自定义项39 | vbdef39 | varchar(101) |  | 自定义项 (Custom) |
| 92 | vbdef40 | 表体自定义项40 | vbdef40 | varchar(101) |  | 自定义项 (Custom) |
| 93 | vbdef41 | 表体自定义项41 | vbdef41 | varchar(101) |  | 自定义项 (Custom) |
| 94 | vbdef42 | 表体自定义项42 | vbdef42 | varchar(101) |  | 自定义项 (Custom) |
| 95 | vbdef43 | 表体自定义项43 | vbdef43 | varchar(101) |  | 自定义项 (Custom) |
| 96 | vbdef44 | 表体自定义项44 | vbdef44 | varchar(101) |  | 自定义项 (Custom) |
| 97 | vbdef45 | 表体自定义项45 | vbdef45 | varchar(101) |  | 自定义项 (Custom) |
| 98 | vbdef46 | 表体自定义项46 | vbdef46 | varchar(101) |  | 自定义项 (Custom) |
| 99 | vbdef47 | 表体自定义项47 | vbdef47 | varchar(101) |  | 自定义项 (Custom) |
| 100 | vbdef48 | 表体自定义项48 | vbdef48 | varchar(101) |  | 自定义项 (Custom) |
| 101 | vbdef49 | 表体自定义项49 | vbdef49 | varchar(101) |  | 自定义项 (Custom) |
| 102 | vbdef50 | 表体自定义项50 | vbdef50 | varchar(101) |  | 自定义项 (Custom) |