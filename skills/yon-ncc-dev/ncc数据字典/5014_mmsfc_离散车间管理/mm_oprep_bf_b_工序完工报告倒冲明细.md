# |<<

**工序完工报告倒冲明细 (mm_oprep_bf_b / nc.vo.mmsfc.operationrep.backflush.entity.BfItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3713.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_oprep_bf_b | 工序完工报告倒冲明细 | pk_oprep_bf_b | varchar(50) | √ | 字符串 (String) |
| 2 | cpickmid | 备料计划单 | cpickmid | char(20) |  | 主键 (UFID) |
| 3 | cpickm_bid | 备料计划明细 | cpickm_bid | char(20) |  | 主键 (UFID) |
| 4 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | pk_org | 工厂 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 6 | pk_org_v | 工厂版本 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 7 | bvhbillcode | 备料计划单号 | bvhbillcode | varchar(40) |  | 字符串 (String) |
| 8 | bvhbusitypeid | 备料类型 | bvhbusitypeid | varchar(20) |  | 字符串 (String) |
| 9 | bvhbusitype | 备料类型编码 | bvhbusitype | varchar(50) |  | 字符串 (String) |
| 10 | bvhbomversion | 生产BOM版本 | bvhbomversion | varchar(20) |  | 字符串 (String) |
| 11 | bvhbomversionnumber | 生产BOM版本号 | bvhbomversionnumber | varchar(10) |  | 字符串 (String) |
| 12 | bvhpbomversion | 包装BOM版本 | bvhpbomversion | varchar(20) |  | 字符串 (String) |
| 13 | bvhpbomversionnumber | 包装BOM版本号 | bvhpbomversionnumber | varchar(10) |  | 字符串 (String) |
| 14 | bbhsetparts | 成套发料 | bbhsetparts | char(1) |  | 布尔类型 (UFBoolean) |
| 15 | bchcustmaterialid | 客户物料 | bchcustmaterialid | varchar(20) |  | 字符串 (String) |
| 16 | bvbrowno | 序号 | bvbrowno | varchar(20) |  | 字符串 (String) |
| 17 | bfbitemtype | 子项类型 | bfbitemtype | int |  | 整数 (Integer) |
| 18 | bfbitemsource | 备料来源 | bfbitemsource | int |  | 整数 (Integer) |
| 19 | bcbmaterialid | 材料最新版本 | bcbmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 20 | bcbmaterialvid | 材料 | bcbmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 21 | bcbunitid | 主单位 | bcbunitid | varchar(20) |  | 计量单位 (measdoc) |
| 22 | bcbastunitid | 单位 | bcbastunitid | varchar(20) |  | 计量单位 (measdoc) |
| 23 | bvbchangerate | 换算率 | bvbchangerate | varchar(50) |  | 字符串 (String) |
| 24 | bdbrequiredate | 需用日期 | bdbrequiredate | char(19) |  | 日期 (UFDate) |
| 25 | bbbcontroll | 控制 | bbbcontroll | char(1) |  | 布尔类型 (UFBoolean) |
| 26 | bnbquotnum | 主定额用量 | bnbquotnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 27 | bnbquotastnum | 定额用量 | bnbquotastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 28 | bvbprocessno | 需用工序 | bvbprocessno | varchar(20) |  | 字符串 (String) |
| 29 | bcbprocessid | 工序类型 | bcbprocessid | varchar(20) |  | 标准工序 (pd_rc) |
| 30 | bbboverissue | 超额领料 | bbboverissue | char(1) |  | 布尔类型 (UFBoolean) |
| 31 | bcbwkid | 工作中心 | bcbwkid | varchar(20) |  | 字符串 (String) |
| 32 | bcbfeedid | 投料点编码 | bcbfeedid | varchar(20) |  | 字符串 (String) |
| 33 | bcbdeliverorgid | 发料组织最新 | bcbdeliverorgid | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 34 | bcbdeliverorgvid | 发料组织 | bcbdeliverorgvid | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 35 | bcboutstockid | 发料仓库 | bcboutstockid | varchar(20) |  | 仓库 (stordoc) |
| 36 | bcbstockbatchid | 库存批次ID | bcbstockbatchid | char(20) |  | 主键 (UFID) |
| 37 | bvbstockbatchcode | 库存批次号 | bvbstockbatchcode | varchar(40) |  | 字符串 (String) |
| 38 | bcbstockmanid | 库管员 | bcbstockmanid | varchar(20) |  | 字符串 (String) |
| 39 | bnbsldoneastnum | 消耗数量 | bnbsldoneastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 40 | bnbsldonenum | 消耗主数量 | bnbsldonenum | decimal(28, 8) |  | 数值 (UFDouble) |
| 41 | bnboneastnum | 本次消耗数量 | bnboneastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 42 | bnbonenum | 本次消耗主数量 | bnbonenum | decimal(28, 8) |  | 数值 (UFDouble) |
| 43 | bnbplanoutastnum | 计划出库数量 | bnbplanoutastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 44 | bnbplanoutnum | 计划出库主数量 | bnbplanoutnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 45 | bnbshouldastnum | 累计待发数量 | bnbshouldastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 46 | bnbshouldnum | 累计待发主数量 | bnbshouldnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 47 | bnbaccoutastnum | 累计出库数量 | bnbaccoutastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 48 | bnbaccoutnum | 累计出库主数量 | bnbaccoutnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 49 | bnbsetpartsnum | 成套套数 | bnbsetpartsnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 50 | bbbcandeliver | 发料 | bbbcandeliver | char(1) |  | 布尔类型 (UFBoolean) |
| 51 | bbbcanreplace | 可替代 | bbbcanreplace | char(1) |  | 布尔类型 (UFBoolean) |
| 52 | bcbreplacesrcid | 替代来源 | bcbreplacesrcid | char(20) |  | 主键 (UFID) |
| 53 | bcbrealsubs | 实际替代关系ID | bcbrealsubs | char(20) |  | 主键 (UFID) |
| 54 | bfbreplacetype | 替代类型 | bfbreplacetype | int |  | 整数 (Integer) |
| 55 | bnbreplaceorder | 替代顺序 | bnbreplaceorder | int |  | 整数 (Integer) |
| 56 | bnbreplacequotiety | 替代系数 | bnbreplacequotiety | decimal(28, 8) |  | 数值 (UFDouble) |
| 57 | bfbreplaceinfo | 替代信息 | bfbreplaceinfo | int |  | 整数 (Integer) |
| 58 | bbbbackflush | 倒冲 | bbbbackflush | char(1) |  | 布尔类型 (UFBoolean) |
| 59 | bfbbackflushtype | 倒冲方式 | bfbbackflushtype | int |  | 整数 (Integer) |
| 60 | bfbbackflushtime | 倒冲时机 | bfbbackflushtime | int |  | 整数 (Integer) |
| 61 | bfbsupplytype | 供应方式 | bfbsupplytype | int |  | 整数 (Integer) |
| 62 | bvbmatchcode | 配套组号 | bvbmatchcode | varchar(20) |  | 字符串 (String) |
| 63 | bbbmainmaterial | 主要材料 | bbbmainmaterial | char(1) |  | 布尔类型 (UFBoolean) |
| 64 | bbbkitmaterial | 齐料 | bbbkitmaterial | char(1) |  | 布尔类型 (UFBoolean) |
| 65 | bcbustomermaterial | 客户专用料 | bcbustomermaterial | char(1) |  | 布尔类型 (UFBoolean) |
| 66 | bbbupwardround | 向上取整 | bbbupwardround | char(1) |  | 布尔类型 (UFBoolean) |
| 67 | bnbatpastnum | 预留数量 | bnbatpastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 68 | bnbatpnum | 预留主数量 | bnbatpnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 69 | bnbunitnum | 主单位定额 | bnbunitnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 70 | bnbunitastnum | 单位定额 | bnbunitastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 71 | bbbautobuilt | 系统生成 | bbbautobuilt | char(1) |  | 布尔类型 (UFBoolean) |
| 72 | bnbunituseastnum | 单位用量 | bnbunituseastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 73 | bnbunitusenum | 单位主用量 | bnbunitusenum | decimal(28, 8) |  | 数值 (UFDouble) |
| 74 | bnbdissipationum | 损耗系数 | bnbdissipationum | decimal(28, 8) |  | 数值 (UFDouble) |
| 75 | bnbwithdissipatioastnum | 含损耗数量 | bnbwithdissipatioastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 76 | bnbwithdissipationum | 含损耗主数量 | bnbwithdissipationum | decimal(28, 8) |  | 数值 (UFDouble) |
| 77 | bnboverreqastnum | 累计超额数量 | bnboverreqastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 78 | bnboverreqnum | 累计超额主数量 | bnboverreqnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 79 | bnbaccbackastnum | 累计退库数量 | bnbaccbackastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 80 | bnbaccbacknum | 累计退库主数量 | bnbaccbacknum | decimal(28, 8) |  | 数值 (UFDouble) |
| 81 | bnbnormaloutnum | 限额标记数量 | bnbnormaloutnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 82 | bcbvendorid | 供应商 | bcbvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 83 | bcbproductorid | 生产厂商 | bcbproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 84 | bcbprojectid | 项目 | bcbprojectid | varchar(20) |  | 项目 (project) |
| 85 | bcbustomerid | 客户 | bcbustomerid | varchar(20) |  | 客户基本信息 (customer) |
| 86 | bcbqualitylevelid | 质量等级 | bcbqualitylevelid | varchar(20) |  | 字符串 (String) |
| 87 | bcffileid | 特征码 | bcffileid | varchar(20) |  | 特征码档案 (bd_ffile) |
| 88 | bvbfree1 | 自由辅助属性1 | bvbfree1 | varchar(101) |  | 自由项 (Custom) |
| 89 | bvbfree2 | 自由辅助属性2 | bvbfree2 | varchar(101) |  | 自由项 (Custom) |
| 90 | bvbfree3 | 自由辅助属性3 | bvbfree3 | varchar(101) |  | 自由项 (Custom) |
| 91 | bvbfree4 | 自由辅助属性4 | bvbfree4 | varchar(101) |  | 自由项 (Custom) |
| 92 | bvbfree5 | 自由辅助属性5 | bvbfree5 | varchar(101) |  | 自由项 (Custom) |
| 93 | bvbfree6 | 自由辅助属性6 | bvbfree6 | varchar(101) |  | 自由项 (Custom) |
| 94 | bvbfree7 | 自由辅助属性7 | bvbfree7 | varchar(101) |  | 自由项 (Custom) |
| 95 | bvbfree8 | 自由辅助属性8 | bvbfree8 | varchar(101) |  | 自由项 (Custom) |
| 96 | bvbfree9 | 自由辅助属性9 | bvbfree9 | varchar(101) |  | 自由项 (Custom) |
| 97 | bvbfree10 | 自由辅助属性10 | bvbfree10 | varchar(101) |  | 自由项 (Custom) |
| 98 | bhts | 备料计划表头时间戳 | bhts | char(19) |  | 日期时间 (UFDateTime) |
| 99 | bbts | 备料计划明细时间戳 | bbts | char(19) |  | 日期时间 (UFDateTime) |
| 100 | bvbnote | 备注 | bvbnote | varchar(181) |  | 字符串 (String) |
| 101 | cdispatchpickmid | 派工用料需求 | cdispatchpickmid | char(20) |  | 主键 (UFID) |
| 102 | bvbdef1 | 自定义项1 | bvbdef1 | varchar(101) |  | 自定义项 (Custom) |
| 103 | bvbdef2 | 自定义项2 | bvbdef2 | varchar(101) |  | 自定义项 (Custom) |
| 104 | bvbdef3 | 自定义项3 | bvbdef3 | varchar(101) |  | 自定义项 (Custom) |
| 105 | bvbdef4 | 自定义项4 | bvbdef4 | varchar(101) |  | 自定义项 (Custom) |
| 106 | bvbdef5 | 自定义项5 | bvbdef5 | varchar(101) |  | 自定义项 (Custom) |
| 107 | bvbdef6 | 自定义项6 | bvbdef6 | varchar(101) |  | 自定义项 (Custom) |
| 108 | bvbdef7 | 自定义项7 | bvbdef7 | varchar(101) |  | 自定义项 (Custom) |
| 109 | bvbdef8 | 自定义项8 | bvbdef8 | varchar(101) |  | 自定义项 (Custom) |
| 110 | bvbdef9 | 自定义项9 | bvbdef9 | varchar(101) |  | 自定义项 (Custom) |
| 111 | bvbdef10 | 自定义项10 | bvbdef10 | varchar(101) |  | 自定义项 (Custom) |
| 112 | bvbdef11 | 自定义项11 | bvbdef11 | varchar(101) |  | 自定义项 (Custom) |
| 113 | bvbdef12 | 自定义项12 | bvbdef12 | varchar(101) |  | 自定义项 (Custom) |
| 114 | bvbdef13 | 自定义项13 | bvbdef13 | varchar(101) |  | 自定义项 (Custom) |
| 115 | bvbdef14 | 自定义项14 | bvbdef14 | varchar(101) |  | 自定义项 (Custom) |
| 116 | bvbdef15 | 自定义项15 | bvbdef15 | varchar(101) |  | 自定义项 (Custom) |
| 117 | bvbdef16 | 自定义项16 | bvbdef16 | varchar(101) |  | 自定义项 (Custom) |
| 118 | bvbdef17 | 自定义项17 | bvbdef17 | varchar(101) |  | 自定义项 (Custom) |
| 119 | bvbdef18 | 自定义项18 | bvbdef18 | varchar(101) |  | 自定义项 (Custom) |
| 120 | bvbdef19 | 自定义项19 | bvbdef19 | varchar(101) |  | 自定义项 (Custom) |
| 121 | bvbdef20 | 自定义项20 | bvbdef20 | varchar(101) |  | 自定义项 (Custom) |