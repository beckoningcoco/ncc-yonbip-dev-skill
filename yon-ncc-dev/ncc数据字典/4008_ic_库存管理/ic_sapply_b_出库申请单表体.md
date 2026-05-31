# |<<

**出库申请单表体 (ic_sapply_b / nc.vo.ic.m4455.entity.SapplyBillBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2974.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cgeneralbid | 出库申请单表体主键 | cgeneralbid | char(20) | √ | 主键 (UFID) |
| 2 | crowno | 行号 | crowno | varchar(20) |  | 字符串 (String) |
| 3 | cmaterialoid | 物料 | cmaterialoid | char(20) | √ | 物料基本信息 (material_v) |
| 4 | cmaterialvid | 物料编码 | cmaterialvid | varchar(20) | √ | 物料基本信息（多版本） (material) |
| 5 | corpoid | 公司最新版本 | corpoid | varchar(20) |  | 组织_业务单元_公司 (corp) |
| 6 | corpvid | 公司 | corpvid | varchar(20) |  | 组织_业务单元_公司版本信息 (corp_v) |
| 7 | castunitid | 单位 | castunitid | varchar(20) |  | 计量单位 (measdoc) |
| 8 | nassistnum | 申请数量 | nassistnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | vchangerate | 换算率 | vchangerate | varchar(60) |  | 字符串 (String) |
| 10 | cunitid | 主单位 | cunitid | varchar(20) |  | 计量单位 (measdoc) |
| 11 | nnum | 申请主数量 | nnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | ncostprice | 单价 | ncostprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | ncostmny | 金额 | ncostmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | vbatchcode | 批次 | vbatchcode | varchar(40) |  | 字符串 (String) |
| 15 | dplanrecvdate | 计划领用日期 | dplanrecvdate | char(19) |  | 日期(结束) (UFDateEnd) |
| 16 | cwarehouseid | 发料仓库 | cwarehouseid | varchar(20) |  | 仓库 (stordoc) |
| 17 | cprojectid | 项目 | cprojectid | varchar(20) |  | 项目 (project) |
| 18 | casscustid | 客户 | casscustid | varchar(20) |  | 客户基本信息 (customer) |
| 19 | cproductorid | 生产厂商 | cproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 20 | cvendorid | 供应商 | cvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 21 | cprojectcostclsid | 项目成本分类 | cprojectcostclsid | varchar(20) |  | 主键 (UFID) |
| 22 | costclsidreason | 成本要素 | costclsidreason | varchar(20) |  | 主键 (UFID) |
| 23 | ccostobjectid | 产成品 | ccostobjectid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 24 | vproductbatch | 生产订单号 | vproductbatch | varchar(40) |  | 字符串 (String) |
| 25 | cworkcenterid | 工作中心 | cworkcenterid | varchar(20) |  | 工作中心 (bd_wk) |
| 26 | vnotebody | 备注 | vnotebody | varchar(181) |  | 字符串 (String) |
| 27 | csourcetype | 来源单据类型 | csourcetype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 28 | csourcetranstype | 来源交易类型 | csourcetranstype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 29 | vsourcebillcode | 来源单据号 | vsourcebillcode | varchar(40) |  | 字符串 (String) |
| 30 | vsourcerowno | 来源单据行号 | vsourcerowno | varchar(20) |  | 字符串 (String) |
| 31 | isclosed | 是否关闭 | isclosed | char(1) |  | 布尔类型 (UFBoolean) |
| 32 | pk_batchcode | 批次主键 | pk_batchcode | varchar(20) |  | 批次档案 (BatchcodeVO) |
| 33 | csourcebillhid | 来源单据表头主键 | csourcebillhid | varchar(20) |  | 主键 (UFID) |
| 34 | csourcebillbid | 来源单据表体主键 | csourcebillbid | varchar(20) |  | 主键 (UFID) |
| 35 | cfirstbillhid | 源头单据表头主键 | cfirstbillhid | varchar(20) |  | 主键 (UFID) |
| 36 | cfirstbillbid | 源头单据表体主键 | cfirstbillbid | varchar(20) |  | 主键 (UFID) |
| 37 | cfirsttype | 源头单据类型 | cfirsttype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 38 | cfirsttranstype | 源头单据交易类型 | cfirsttranstype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 39 | vfirstbillcode | 源头单据号 | vfirstbillcode | varchar(50) |  | 字符串 (String) |
| 40 | vfirstrowno | 源头单据行号 | vfirstrowno | varchar(50) |  | 字符串 (String) |
| 41 | pk_org | 库存组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 42 | pk_org_v | 库存组织 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 43 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 44 | cwastewarehouseid | 报废仓库 | cwastewarehouseid | varchar(20) |  | 仓库 (stordoc) |
| 45 | cprojecttaskid | 项目任务 | cprojecttaskid | varchar(20) |  | 项目任务 (WBS) |
| 46 | cwp | 工序号 | cwp | varchar(50) |  | 字符串 (String) |
| 47 | crcid | 工序类型 | crcid | varchar(20) |  | 标准工序 (pd_rc) |
| 48 | pk_cbsnode | cbs | pk_cbsnode | varchar(20) |  | 成本分解结构成员 (cbsnode) |
| 49 | vcontractcode | 项目合同编码 | vcontractcode | varchar(101) |  | 字符串 (String) |
| 50 | cffileid | 特征码 | cffileid | varchar(20) |  | 特征码档案 (bd_ffile) |
| 51 | cprodprojectid | 产成品辅助属性-项目 | cprodprojectid | varchar(20) |  | 项目 (project) |
| 52 | cprodasscustid | 产成品辅助属性-客户 | cprodasscustid | varchar(20) |  | 客户基本信息 (customer) |
| 53 | cprodproductorid | 产成品辅助属性-生产厂商 | cprodproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 54 | cprodvendorid | 产成品辅助属性-供应商 | cprodvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 55 | cmffileid | 产成品辅助属性-特征码 | cmffileid | varchar(20) |  | 特征码档案 (bd_ffile) |
| 56 | vprodfree1 | 产成品辅助属性-自由辅助属性1 | vprodfree1 | varchar(101) |  | 自由项 (Custom) |
| 57 | vprodfree2 | 产成品辅助属性-自由辅助属性2 | vprodfree2 | varchar(101) |  | 自由项 (Custom) |
| 58 | vprodfree3 | 产成品辅助属性-自由辅助属性3 | vprodfree3 | varchar(101) |  | 自由项 (Custom) |
| 59 | vprodfree4 | 产成品辅助属性-自由辅助属性4 | vprodfree4 | varchar(101) |  | 自由项 (Custom) |
| 60 | vprodfree5 | 产成品辅助属性-自由辅助属性5 | vprodfree5 | varchar(101) |  | 自由项 (Custom) |
| 61 | vprodfree6 | 产成品辅助属性-自由辅助属性6 | vprodfree6 | varchar(101) |  | 自由项 (Custom) |
| 62 | vprodfree7 | 产成品辅助属性-自由辅助属性7 | vprodfree7 | varchar(101) |  | 自由项 (Custom) |
| 63 | vprodfree8 | 产成品辅助属性-自由辅助属性8 | vprodfree8 | varchar(101) |  | 自由项 (Custom) |
| 64 | vprodfree9 | 产成品辅助属性-自由辅助属性9 | vprodfree9 | varchar(101) |  | 自由项 (Custom) |
| 65 | vprodfree10 | 产成品辅助属性-自由辅助属性10 | vprodfree10 | varchar(101) |  | 自由项 (Custom) |
| 66 | vfree1 | 自由辅助属性1 | vfree1 | varchar(101) |  | 自由项 (Custom) |
| 67 | vfree2 | 自由辅助属性2 | vfree2 | varchar(101) |  | 自由项 (Custom) |
| 68 | vfree3 | 自由辅助属性3 | vfree3 | varchar(101) |  | 自由项 (Custom) |
| 69 | vfree4 | 自由辅助属性4 | vfree4 | varchar(101) |  | 自由项 (Custom) |
| 70 | vfree5 | 自由辅助属性5 | vfree5 | varchar(101) |  | 自由项 (Custom) |
| 71 | vfree6 | 自由辅助属性6 | vfree6 | varchar(101) |  | 自由项 (Custom) |
| 72 | vfree7 | 自由辅助属性7 | vfree7 | varchar(101) |  | 自由项 (Custom) |
| 73 | vfree8 | 自由辅助属性8 | vfree8 | varchar(101) |  | 自由项 (Custom) |
| 74 | vfree9 | 自由辅助属性9 | vfree9 | varchar(101) |  | 自由项 (Custom) |
| 75 | vfree10 | 自由辅助属性10 | vfree10 | varchar(101) |  | 自由项 (Custom) |
| 76 | vbdef1 | 表体自定义项1 | vbdef1 | varchar(101) |  | 自定义项 (Custom) |
| 77 | vbdef2 | 表体自定义项2 | vbdef2 | varchar(101) |  | 自定义项 (Custom) |
| 78 | vbdef3 | 表体自定义项3 | vbdef3 | varchar(101) |  | 自定义项 (Custom) |
| 79 | vbdef4 | 表体自定义项4 | vbdef4 | varchar(101) |  | 自定义项 (Custom) |
| 80 | vbdef5 | 表体自定义项5 | vbdef5 | varchar(101) |  | 自定义项 (Custom) |
| 81 | vbdef6 | 表体自定义项6 | vbdef6 | varchar(101) |  | 自定义项 (Custom) |
| 82 | vbdef7 | 表体自定义项7 | vbdef7 | varchar(101) |  | 自定义项 (Custom) |
| 83 | vbdef8 | 表体自定义项8 | vbdef8 | varchar(101) |  | 自定义项 (Custom) |
| 84 | vbdef9 | 表体自定义项9 | vbdef9 | varchar(101) |  | 自定义项 (Custom) |
| 85 | vbdef10 | 表体自定义项10 | vbdef10 | varchar(101) |  | 自定义项 (Custom) |
| 86 | vbdef11 | 表体自定义项11 | vbdef11 | varchar(101) |  | 自定义项 (Custom) |
| 87 | vbdef12 | 表体自定义项12 | vbdef12 | varchar(101) |  | 自定义项 (Custom) |
| 88 | vbdef13 | 表体自定义项13 | vbdef13 | varchar(101) |  | 自定义项 (Custom) |
| 89 | vbdef14 | 表体自定义项14 | vbdef14 | varchar(101) |  | 自定义项 (Custom) |
| 90 | vbdef15 | 表体自定义项15 | vbdef15 | varchar(101) |  | 自定义项 (Custom) |
| 91 | vbdef16 | 表体自定义项16 | vbdef16 | varchar(101) |  | 自定义项 (Custom) |
| 92 | vbdef17 | 表体自定义项17 | vbdef17 | varchar(101) |  | 自定义项 (Custom) |
| 93 | vbdef18 | 表体自定义项18 | vbdef18 | varchar(101) |  | 自定义项 (Custom) |
| 94 | vbdef19 | 表体自定义项19 | vbdef19 | varchar(101) |  | 自定义项 (Custom) |
| 95 | vbdef20 | 表体自定义项20 | vbdef20 | varchar(101) |  | 自定义项 (Custom) |
| 96 | vbdef21 | 表体自定义项21 | vbdef21 | varchar(101) |  | 自定义项 (Custom) |
| 97 | vbdef22 | 表体自定义项22 | vbdef22 | varchar(101) |  | 自定义项 (Custom) |
| 98 | vbdef23 | 表体自定义项23 | vbdef23 | varchar(101) |  | 自定义项 (Custom) |
| 99 | vbdef24 | 表体自定义项24 | vbdef24 | varchar(101) |  | 自定义项 (Custom) |
| 100 | vbdef25 | 表体自定义项25 | vbdef25 | varchar(101) |  | 自定义项 (Custom) |
| 101 | vbdef26 | 表体自定义项26 | vbdef26 | varchar(101) |  | 自定义项 (Custom) |
| 102 | vbdef27 | 表体自定义项27 | vbdef27 | varchar(101) |  | 自定义项 (Custom) |
| 103 | vbdef28 | 表体自定义项28 | vbdef28 | varchar(101) |  | 自定义项 (Custom) |
| 104 | vbdef29 | 表体自定义项29 | vbdef29 | varchar(101) |  | 自定义项 (Custom) |
| 105 | vbdef30 | 表体自定义项30 | vbdef30 | varchar(101) |  | 自定义项 (Custom) |
| 106 | vbdef31 | 表体自定义项31 | vbdef31 | varchar(101) |  | 自定义项 (Custom) |
| 107 | vbdef32 | 表体自定义项32 | vbdef32 | varchar(101) |  | 自定义项 (Custom) |
| 108 | vbdef33 | 表体自定义项33 | vbdef33 | varchar(101) |  | 自定义项 (Custom) |
| 109 | vbdef34 | 表体自定义项34 | vbdef34 | varchar(101) |  | 自定义项 (Custom) |
| 110 | vbdef35 | 表体自定义项35 | vbdef35 | varchar(101) |  | 自定义项 (Custom) |
| 111 | vbdef36 | 表体自定义项36 | vbdef36 | varchar(101) |  | 自定义项 (Custom) |
| 112 | vbdef37 | 表体自定义项37 | vbdef37 | varchar(101) |  | 自定义项 (Custom) |
| 113 | vbdef38 | 表体自定义项38 | vbdef38 | varchar(101) |  | 自定义项 (Custom) |
| 114 | vbdef39 | 表体自定义项39 | vbdef39 | varchar(101) |  | 自定义项 (Custom) |
| 115 | vbdef40 | 表体自定义项40 | vbdef40 | varchar(101) |  | 自定义项 (Custom) |
| 116 | vbdef41 | 表体自定义项41 | vbdef41 | varchar(101) |  | 自定义项 (Custom) |
| 117 | vbdef42 | 表体自定义项42 | vbdef42 | varchar(101) |  | 自定义项 (Custom) |
| 118 | vbdef43 | 表体自定义项43 | vbdef43 | varchar(101) |  | 自定义项 (Custom) |
| 119 | vbdef44 | 表体自定义项44 | vbdef44 | varchar(101) |  | 自定义项 (Custom) |
| 120 | vbdef45 | 表体自定义项45 | vbdef45 | varchar(101) |  | 自定义项 (Custom) |
| 121 | vbdef46 | 表体自定义项46 | vbdef46 | varchar(101) |  | 自定义项 (Custom) |
| 122 | vbdef47 | 表体自定义项47 | vbdef47 | varchar(101) |  | 自定义项 (Custom) |
| 123 | vbdef48 | 表体自定义项48 | vbdef48 | varchar(101) |  | 自定义项 (Custom) |
| 124 | vbdef49 | 表体自定义项49 | vbdef49 | varchar(101) |  | 自定义项 (Custom) |
| 125 | vbdef50 | 表体自定义项50 | vbdef50 | varchar(101) |  | 自定义项 (Custom) |