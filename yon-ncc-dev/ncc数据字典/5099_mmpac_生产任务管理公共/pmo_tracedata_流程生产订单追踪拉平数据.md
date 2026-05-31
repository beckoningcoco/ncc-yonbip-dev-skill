# |<<

**流程生产订单追踪拉平数据 (pmo_tracedata / nc.vo.mmpac.pmotrace.pac0402.entity.PmoTreeQueryVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4576.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cmoid | 流程生产订单明细 | cmoid | char(20) | √ | 主键 (UFID) |
| 2 | cpmohid | 上层单据 | cpmohid | char(20) |  | 主键 (UFID) |
| 3 | vrowno | 行号 | vrowno | varchar(50) |  | 字符串 (String) |
| 4 | fitemstatus | 行状态 | fitemstatus | int |  | 整数 (Integer) |
| 5 | cmaterialid | 产品最新版本 | cmaterialid | varchar(20) |  | 字符串 (String) |
| 6 | cmaterialvid | 产品 | cmaterialvid | varchar(20) |  | 字符串 (String) |
| 7 | cunitid | 主单位 | cunitid | varchar(20) |  | 字符串 (String) |
| 8 | castunitid | 单位 | castunitid | varchar(20) |  | 字符串 (String) |
| 9 | nnum | 主数量 | nnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | nastnum | 数量 | nastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | vchangerate | 换算率 | vchangerate | varchar(60) |  | 字符串 (String) |
| 12 | nplanputastnum | 计划投入数量 | nplanputastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | nplanputnum | 计划投入主数量 | nplanputnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | nmmastnum | 计划产出数量 | nmmastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | nmmnum | 计划产出主数量 | nmmnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | nrwxis | 废品系数 | nrwxis | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | nwrastnum | 完工数量 | nwrastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | nwrnum | 完工主数量 | nwrnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | fbillstatus | 订单状态2 | fbillstatus | int |  | 整数 (Integer) |
| 20 | cdeptid | 生产部门 | cdeptid | varchar(20) |  | 字符串 (String) |
| 21 | cdeptvid | 生产部门版本 | cdeptvid | varchar(20) |  | 字符串 (String) |
| 22 | cemployeeid | 业务员 | cemployeeid | varchar(20) |  | 字符串 (String) |
| 23 | cwkid | 生产线 | cwkid | varchar(20) |  | 字符串 (String) |
| 24 | cclassid | 班次 | cclassid | varchar(20) |  | 字符串 (String) |
| 25 | cteamid | 班组 | cteamid | varchar(20) |  | 字符串 (String) |
| 26 | cbomversionid | 生产BOM版本 | cbomversionid | varchar(20) |  | 字符串 (String) |
| 27 | vbomversion | 生产BOM版本号 | vbomversion | varchar(20) |  | 字符串 (String) |
| 28 | cpackbomid | 包装BOM版本 | cpackbomid | varchar(20) |  | 字符串 (String) |
| 29 | vpackbomversion | 包装BOM版本号 | vpackbomversion | varchar(50) |  | 字符串 (String) |
| 30 | crtversionid | 工艺路线版本 | crtversionid | varchar(20) |  | 字符串 (String) |
| 31 | vrtversion | 工艺路线版本号 | vrtversion | varchar(20) |  | 字符串 (String) |
| 32 | tplanstarttime | 计划开工时间 | tplanstarttime | char(19) |  | 日期时间 (UFDateTime) |
| 33 | tplanendtime | 计划完工时间 | tplanendtime | char(19) |  | 日期时间 (UFDateTime) |
| 34 | twillendtime | 预计完工时间 | twillendtime | char(19) |  | 日期时间 (UFDateTime) |
| 35 | tactstarttime | 实际开工时间 | tactstarttime | char(19) |  | 日期时间 (UFDateTime) |
| 36 | tactendtime | 实际完工时间 | tactendtime | char(19) |  | 日期时间 (UFDateTime) |
| 37 | vsalebillcode | 销售订单号 | vsalebillcode | varchar(40) |  | 字符串 (String) |
| 38 | ccustmaterialid | 客户物料编码 | ccustmaterialid | varchar(50) |  | 字符串 (String) |
| 39 | cbatchid | 生产批次 | cbatchid | varchar(50) |  | 字符串 (String) |
| 40 | vbatchcode | 生产批次号 | vbatchcode | varchar(30) |  | 字符串 (String) |
| 41 | vconfigcode | 配置号 | vconfigcode | varchar(30) |  | 字符串 (String) |
| 42 | burgent | 加急 | burgent | char(1) |  | 布尔类型 (UFBoolean) |
| 43 | vnote | 备注 | vnote | varchar(200) |  | 备注 (Memo) |
| 44 | fprintstatus | 打印状态 | fprintstatus | int |  | 整数 (Integer) |
| 45 | cqualitylevelid | 质量等级 | cqualitylevelid | varchar(20) |  | 字符串 (String) |
| 46 | approver | 审核人 | approver | varchar(25) |  | 字符串 (String) |
| 47 | approvertime | 审核日期 | approvertime | varchar(19) |  | 字符串 (String) |
| 48 | cvendorid | 供应商 | cvendorid | varchar(20) |  | 字符串 (String) |
| 49 | cproductorid | 生产厂商 | cproductorid | varchar(20) |  | 字符串 (String) |
| 50 | cprojectid | 项目 | cprojectid | varchar(20) |  | 字符串 (String) |
| 51 | ccustomerid | 客户 | ccustomerid | varchar(20) |  | 字符串 (String) |
| 52 | cffileid | 特征码 | cffileid | varchar(20) |  | 字符串 (String) |
| 53 | vsrctrantypeid | 来源交易类型 | vsrctrantypeid | varchar(20) |  | 字符串 (String) |
| 54 | vsrctrantype | 来源交易类型编码 | vsrctrantype | varchar(50) |  | 字符串 (String) |
| 55 | vsrctype | 来源单据类型 | vsrctype | varchar(20) |  | 字符串 (String) |
| 56 | vsrcid | 来源单据 | vsrcid | varchar(50) |  | 字符串 (String) |
| 57 | vsrccode | 来源单据号 | vsrccode | varchar(40) |  | 字符串 (String) |
| 58 | vsrcbid | 来源单据明细 | vsrcbid | varchar(50) |  | 字符串 (String) |
| 59 | vsrcrowno | 来源单据行号 | vsrcrowno | varchar(20) |  | 字符串 (String) |
| 60 | crequireorg | 需求库存组织最新版本 | crequireorg | char(20) |  | 主键 (UFID) |
| 61 | crequireorgvid | 需求库存组织 | crequireorgvid | char(20) |  | 主键 (UFID) |
| 62 | trequiredate | 需求日期 | trequiredate | char(19) |  | 日期时间 (UFDateTime) |
| 63 | tsupplytime | 供给可用日期 | tsupplytime | char(19) |  | 日期时间 (UFDateTime) |
| 64 | vfirsttrantype | 源头交易类型编码 | vfirsttrantype | varchar(50) |  | 字符串 (String) |
| 65 | vfirsttype | 源头单据类型 | vfirsttype | varchar(20) |  | 字符串 (String) |
| 66 | vfirstid | 源头单据 | vfirstid | varchar(50) |  | 字符串 (String) |
| 67 | vfirstcode | 源头单据号 | vfirstcode | varchar(40) |  | 字符串 (String) |
| 68 | vfirstbid | 源头单据明细 | vfirstbid | varchar(50) |  | 字符串 (String) |
| 69 | vfirstrowno | 源头单据行号 | vfirstrowno | varchar(20) |  | 字符串 (String) |
| 70 | nzcgastnum | 转采购数量 | nzcgastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 71 | nzcgnum | 转采购主数量 | nzcgnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 72 | nzwwastnum | 转委外数量 | nzwwastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 73 | nzwwnum | 转委外主数量 | nzwwnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 74 | nzdbastnum | 转调拨数量 | nzdbastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 75 | nzdbnum | 转调拨主数量 | nzdbnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 76 | nholdastnum | 被预留数量 | nholdastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 77 | nholdnum | 被预留主数量 | nholdnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 78 | ninastnum | 合格入库数量 | ninastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 79 | ninnum | 合格入库主数量 | ninnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 80 | nreastnum | 返工数量 | nreastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 81 | nrenum | 返工主数量 | nrenum | decimal(28, 8) |  | 数值 (UFDouble) |
| 82 | nrebillastnum | 返工补单数量 | nrebillastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 83 | nrebillnum | 返工补单主数量 | nrebillnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 84 | nrwastnum | 报废数量 | nrwastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 85 | nrwnum | 报废主数量 | nrwnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 86 | nrwbillastnum | 报废补单数量 | nrwbillastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 87 | nrwbillnum | 报废补单主数量 | nrwbillnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 88 | vparentmotype | 上级生产订单类型 | vparentmotype | varchar(50) |  | 字符串 (String) |
| 89 | vparentbillid | 上级生产订单 | vparentbillid | varchar(50) |  | 字符串 (String) |
| 90 | vparentbillcode | 上级生产订单号 | vparentbillcode | varchar(50) |  | 字符串 (String) |
| 91 | cparentmobid | 上级生产订单行 | cparentmobid | char(20) |  | 主键 (UFID) |
| 92 | vparentmorowno | 上级生产订单行号 | vparentmorowno | varchar(40) |  | 字符串 (String) |
| 93 | vsrcmotype | 来源生产订单类型 | vsrcmotype | varchar(50) |  | 字符串 (String) |
| 94 | vfromid | 来源生产订单 | vfromid | char(20) |  | 主键 (UFID) |
| 95 | vfromcode | 来源生产订单号 | vfromcode | varchar(40) |  | 字符串 (String) |
| 96 | csrcmobid | 来源生产订单行 | csrcmobid | char(20) |  | 主键 (UFID) |
| 97 | vsrcmorowno | 来源生产订单行号 | vsrcmorowno | varchar(50) |  | 字符串 (String) |
| 98 | vfirstmotype | 源头生产订单类型 | vfirstmotype | varchar(50) |  | 字符串 (String) |
| 99 | cfirstmoid | 源头生产订单 | cfirstmoid | char(20) |  | 主键 (UFID) |
| 100 | vfirstmocode | 源头生产订单号 | vfirstmocode | varchar(40) |  | 字符串 (String) |
| 101 | cfirstmobid | 源头生产订单行 | cfirstmobid | varchar(50) |  | 字符串 (String) |
| 102 | vfirstmorowno | 源头生产订单行号 | vfirstmorowno | varchar(50) |  | 字符串 (String) |
| 103 | pk_group | 集团 | pk_group | varchar(20) |  | 字符串 (String) |
| 104 | pk_org | 工厂最新版本 | pk_org | varchar(20) |  | 字符串 (String) |
| 105 | pk_org_v | 工厂 | pk_org_v | varchar(20) |  | 字符串 (String) |
| 106 | cplanfactoryid | 计划组织最新版本 | cplanfactoryid | varchar(20) |  | 字符串 (String) |
| 107 | cplanfactoryvid | 计划组织 | cplanfactoryvid | varchar(20) |  | 字符串 (String) |
| 108 | dbilldate | 单据日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 109 | vbillcode | 流程生产订单号 | vbillcode | varchar(40) |  | 字符串 (String) |
| 110 | ctrantypeid | 订单交易类型 | ctrantypeid | varchar(20) |  | 字符串 (String) |
| 111 | vtrantypecode | 订单交易类型编码 | vtrantypecode | varchar(20) |  | 字符串 (String) |
| 112 | temp_puorg | 采购组织 | temp_puorg | varchar(50) |  | 字符串 (String) |
| 113 | temp_supplier | 寻源供应商 | temp_supplier | varchar(50) |  | 字符串 (String) |
| 114 | temp_currencyid | 币种 | temp_currencyid | varchar(50) |  | 字符串 (String) |
| 115 | temp_issc | 是否委外 | temp_issc | varchar(50) |  | 字符串 (String) |
| 116 | dsourcets | 来源时间戳 | dsourcets | varchar(50) |  | 字符串 (String) |
| 117 | temp_nmaxrenum | 最大可补单主数量 | temp_nmaxrenum | decimal(28, 8) |  | 数值 (UFDouble) |
| 118 | temp_nmaxreastnum | 最大可补单数量 | temp_nmaxreastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 119 | temp_nbcrenum | 本次补单主数量 | temp_nbcrenum | decimal(28, 8) |  | 数值 (UFDouble) |
| 120 | temp_nbcreastnum | 本次补单数量 | temp_nbcreastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 121 | temp_idestbilltype | 分流单据类型 | temp_idestbilltype | decimal(28, 8) |  | 数值 (UFDouble) |
| 122 | temp_ntogoastnum | 可分流数量 | temp_ntogoastnum | varchar(50) |  | 字符串 (String) |
| 123 | temp_ntogonum | 可分流主数量 | temp_ntogonum | decimal(28, 8) |  | 数值 (UFDouble) |
| 124 | temp_ngoastnum | 本次分流数量 | temp_ngoastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 125 | temp_ngonum | 本次分流主数量 | temp_ngonum | decimal(28, 8) |  | 数值 (UFDouble) |
| 126 | version | 订单版本号 | version | varchar(10) |  | 字符串 (String) |
| 127 | cparentprocedureid | 母单工序 | cparentprocedureid | varchar(20) |  | 工序计划明细 (mm_pmo_procedure) |
| 128 | fsrcmooper | 补单类型 | fsrcmooper | int |  | 补单类型 (PMOFSrcMoOperTypeEnum) |  | 0=普通订单; |