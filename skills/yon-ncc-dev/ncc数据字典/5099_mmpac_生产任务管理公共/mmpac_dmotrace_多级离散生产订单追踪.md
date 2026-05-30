# |<<

**多级离散生产订单追踪 (mmpac_dmotrace / nc.vo.mmpac.dmo.dmot.entity.DmoTraceVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3807.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_dmotrace | 多级离散生产订单追踪 | pk_dmotrace | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 工厂最新版本 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 4 | pk_org_v | 工厂 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 5 | cplanfactoryid | 计划组织最新版本 | cplanfactoryid | varchar(20) |  | 组织 (org) |
| 6 | cplanfactoryvid | 计划组织 | cplanfactoryvid | varchar(20) |  | 组织_版本信息 (org_v) |
| 7 | dbilldate | 单据日期 | dbilldate | varchar(50) |  | 字符串 (String) |
| 8 | cmoid | 生产订单 | cmoid | varchar(50) |  | 字符串 (String) |
| 9 | vbillcode | 生产订单号 | vbillcode | varchar(50) |  | 字符串 (String) |
| 10 | ctrantypeid | 订单交易类型 | ctrantypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 11 | vtrantypecode | 订单交易类型编码 | vtrantypecode | varchar(50) |  | 字符串 (String) |
| 12 | fbillstatus | 订单状态 | fbillstatus | varchar(50) |  | 字符串 (String) |
| 13 | fitemstatus | 生产订单行状态 | fitemstatus | varchar(50) |  | 字符串 (String) |
| 14 | cmoitemid | 生产订单明细 | cmoitemid | varchar(50) |  | 字符串 (String) |
| 15 | cmorowno | 生产订单行号 | cmorowno | varchar(50) |  | 字符串 (String) |
| 16 | cmaterialid | 产品最新版本 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 17 | cmaterialvid | 产品 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 18 | cunitid | 主单位 | cunitid | varchar(20) |  | 计量单位 (measdoc) |
| 19 | castunitid | 单位 | castunitid | varchar(20) |  | 计量单位 (measdoc) |
| 20 | nnum | 主数量 | nnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | nastnum | 数量 | nastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 22 | vchangerate | 换算率 | vchangerate | varchar(60) |  | 字符串 (String) |
| 23 | nplanputastnum | 计划投入数量 | nplanputastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 24 | nplanputnum | 计划投入主数量 | nplanputnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 25 | nmmastnum | 计划产出数量 | nmmastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 26 | nmmnum | 计划产出主数量 | nmmnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 27 | nrwxis | 废品系数 | nrwxis | decimal(28, 8) |  | 数值 (UFDouble) |
| 28 | nwrastnum | 完工数量 | nwrastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 29 | nwrnum | 完工主数量 | nwrnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 30 | cdeptid | 生产部门最新 | cdeptid | varchar(20) |  | 组织_部门 (dept) |
| 31 | cdeptvid | 生产部门 | cdeptvid | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 32 | cemployeeid | 业务员 | cemployeeid | varchar(20) |  | 人员基本信息 (psndoc) |
| 33 | cwkid | 生产线 | cwkid | varchar(20) |  | 工作中心 (bd_wk) |
| 34 | cclassid | 班次 | cclassid | varchar(20) |  | 班次 (bdshift) |
| 35 | cteamid | 班组 | cteamid | varchar(20) |  | 班组定义维护表信息 (bd_team) |
| 36 | cbomversionid | 生产BOM版本 | cbomversionid | varchar(20) |  | 物料清单 (bd_bom) |
| 37 | vbomversion | 生产BOM版本号 | vbomversion | varchar(50) |  | 字符串 (String) |
| 38 | cpackbomid | 包装BOM版本 | cpackbomid | varchar(20) |  | 物料清单 (bd_bom) |
| 39 | vpackbomversion | 包装BOM版本号 | vpackbomversion | varchar(50) |  | 字符串 (String) |
| 40 | crtversionid | 工艺路线版本 | crtversionid | varchar(20) |  | 工艺路线主表 (pd_rt) |
| 41 | vrtversion | 工艺路线版本号 | vrtversion | varchar(50) |  | 字符串 (String) |
| 42 | tplanstarttime | 计划开工时间 | tplanstarttime | char(19) |  | 日期时间 (UFDateTime) |
| 43 | tplanendtime | 计划完工时间 | tplanendtime | char(19) |  | 日期时间 (UFDateTime) |
| 44 | twillendtime | 预计完工时间 | twillendtime | char(19) |  | 日期时间 (UFDateTime) |
| 45 | tactstarttime | 实际开工时间 | tactstarttime | char(19) |  | 日期时间 (UFDateTime) |
| 46 | tactendtime | 实际完工时间 | tactendtime | char(19) |  | 日期时间 (UFDateTime) |
| 47 | vsalebillcode | 销售订单号 | vsalebillcode | varchar(50) |  | 字符串 (String) |
| 48 | ccustmaterialid | 客户物料编码 | ccustmaterialid | varchar(50) |  | 字符串 (String) |
| 49 | cbatchid | 生产批次 | cbatchid | varchar(50) |  | 字符串 (String) |
| 50 | vbatchcode | 生产批次号 | vbatchcode | varchar(50) |  | 字符串 (String) |
| 51 | vconfigcode | 配置号 | vconfigcode | varchar(50) |  | 字符串 (String) |
| 52 | burgent | 加急 | burgent | char(1) |  | 布尔类型 (UFBoolean) |
| 53 | vnote | 备注 | vnote | varchar(200) |  | 备注 (Memo) |
| 54 | fprintstatus | 打印状态 | fprintstatus | varchar(50) |  | 字符串 (String) |
| 55 | cqualitylevelid | 质量等级 | cqualitylevelid | varchar(20) |  | 质量等级 (scm_qualitylevel_b) |
| 56 | cvendorid | 供应商 | cvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 57 | cproductorid | 生产厂商 | cproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 58 | cprojectid | 项目 | cprojectid | varchar(20) |  | 项目 (project) |
| 59 | ccustomerid | 客户 | ccustomerid | varchar(20) |  | 客户基本信息 (customer) |
| 60 | cffileid | 特征码 | cffileid | varchar(20) |  | 特征码档案 (bd_ffile) |
| 61 | vsrctrantypeid | 来源交易类型 | vsrctrantypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 62 | vsrctrantype | 来源交易类型编码 | vsrctrantype | varchar(50) |  | 字符串 (String) |
| 63 | vsrctype | 来源单据类型 | vsrctype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 64 | vsrcid | 来源单据 | vsrcid | varchar(50) |  | 字符串 (String) |
| 65 | vsrccode | 来源单据号 | vsrccode | varchar(50) |  | 字符串 (String) |
| 66 | vsrcbid | 来源单据明细 | vsrcbid | varchar(50) |  | 字符串 (String) |
| 67 | vsrcrowno | 来源单据行号 | vsrcrowno | varchar(50) |  | 字符串 (String) |
| 68 | crequireorg | 需求库存组织最新版本 | crequireorg | varchar(20) |  | 组织 (org) |
| 69 | crequireorgvid | 需求库存组织 | crequireorgvid | varchar(20) |  | 组织_版本信息 (org_v) |
| 70 | trequiredate | 需求日期 | trequiredate | char(19) |  | 日期 (UFDate) |
| 71 | tsupplytime | 供给可用日期 | tsupplytime | char(19) |  | 日期 (UFDate) |
| 72 | vfirsttrantypeid | 源头交易类型 | vfirsttrantypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 73 | vfirsttrantype | 源头交易类型编码 | vfirsttrantype | varchar(50) |  | 字符串 (String) |
| 74 | vfirsttype | 源头单据类型 | vfirsttype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 75 | vfirstid | 源头单据 | vfirstid | varchar(50) |  | 字符串 (String) |
| 76 | vfirstcode | 源头单据号 | vfirstcode | varchar(50) |  | 字符串 (String) |
| 77 | vfirstbid | 源头单据明细 | vfirstbid | varchar(50) |  | 字符串 (String) |
| 78 | vfirstrowno | 源头单据行号 | vfirstrowno | varchar(50) |  | 字符串 (String) |
| 79 | nzcgnum | 转采购主数量 | nzcgnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 80 | nzcgastnum | 转采购数量 | nzcgastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 81 | nzwwnum | 转委外主数量 | nzwwnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 82 | nzwwastnum | 转委外数量 | nzwwastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 83 | nzdbnum | 转调拨主数量 | nzdbnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 84 | nzdbastnum | 转调拨数量 | nzdbastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 85 | nholdastnum | 被预留数量 | nholdastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 86 | nholdnum | 被预留主数量 | nholdnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 87 | ninastnum | 合格入库数量 | ninastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 88 | ninnum | 合格入库主数量 | ninnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 89 | nreastnum | 返工数量 | nreastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 90 | nrenum | 返工主数量 | nrenum | decimal(28, 8) |  | 数值 (UFDouble) |
| 91 | nrebillastnum | 返工补单数量 | nrebillastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 92 | nrebillnum | 返工补单主数量 | nrebillnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 93 | nrwnum | 报废主数量 | nrwnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 94 | nrwastnum | 报废数量 | nrwastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 95 | nrwbillastnum | 报废补单数量 | nrwbillastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 96 | nrwbillnum | 报废补单主数量 | nrwbillnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 97 | vparentmotype | 上级生产订单类型 | vparentmotype | varchar(50) |  | 字符串 (String) |
| 98 | cparentmoid | 上级生产订单 | cparentmoid | varchar(50) |  | 字符串 (String) |
| 99 | vparentmocode | 上级生产订单号 | vparentmocode | varchar(50) |  | 字符串 (String) |
| 100 | cparentmobid | 上级生产订单行 | cparentmobid | varchar(50) |  | 字符串 (String) |
| 101 | vparentmorowno | 上级生产订单行号 | vparentmorowno | varchar(50) |  | 字符串 (String) |
| 102 | vsrcmotype | 来源生产订单类型 | vsrcmotype | varchar(50) |  | 字符串 (String) |
| 103 | csrcmoid | 来源生产订单 | csrcmoid | varchar(50) |  | 字符串 (String) |
| 104 | vsrcmocode | 来源生产订单号 | vsrcmocode | varchar(50) |  | 字符串 (String) |
| 105 | csrcmobid | 来源生产订单行 | csrcmobid | varchar(50) |  | 字符串 (String) |
| 106 | vsrcmorowno | 来源生产订单行号 | vsrcmorowno | varchar(50) |  | 字符串 (String) |
| 107 | vfirstmotype | 源头生产订单类型 | vfirstmotype | varchar(50) |  | 字符串 (String) |
| 108 | cfirstmoid | 源头生产订单 | cfirstmoid | varchar(50) |  | 字符串 (String) |
| 109 | vfirstmocode | 源头生产订单号 | vfirstmocode | varchar(50) |  | 字符串 (String) |
| 110 | cfirstmobid | 源头生产订单行 | cfirstmobid | varchar(50) |  | 字符串 (String) |
| 111 | vfirstmorowno | 源头生产订单行号 | vfirstmorowno | varchar(50) |  | 字符串 (String) |
| 112 | version | 订单版本号 | version | varchar(10) |  | 字符串 (String) |
| 113 | nrejectnum | 原单报废补投主数量 | nrejectnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 114 | nrejectastnum | 原单报废补投数量 | nrejectastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 115 | cpdmoprocedureno | 母单工序 | cpdmoprocedureno | varchar(20) |  | 工序计划 (mm_dmo_procedure) |
| 116 | vbilltype | 补单类型 | vbilltype | int |  | 返工和报废类型 (DmoBilltypeEnum) |  | 0=普通订单; |