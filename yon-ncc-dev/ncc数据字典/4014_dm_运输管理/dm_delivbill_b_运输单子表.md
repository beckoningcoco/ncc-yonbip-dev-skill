# |<<

**运输单子表 (dm_delivbill_b / nc.vo.dm.m4804.entity.DelivBillBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1720.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cdelivbill_bid | 运输单子表主键 | cdelivbill_bid | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 物流组织 | pk_org | varchar(20) |  | 组织_业务单元_物流组织 (trafficorg) |
| 3 | dbilldate | 单据日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 4 | cinventoryid | 物料版本信息 | cinventoryid | varchar(20) | √ | 物料基本信息 (material_v) |
| 5 | cinventoryvid | 物料 | cinventoryvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 6 | nnum | 主数量 | nnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 7 | nastnum | 数量 | nastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | nprice | 主单价 | nprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | nmoney | 金额 | nmoney | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | nweight | 重量 | nweight | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | nvolumn | 体积 | nvolumn | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | cunitid | 主单位 | cunitid | varchar(20) |  | 计量单位 (measdoc) |
| 13 | castunitid | 单位 | castunitid | varchar(20) |  | 计量单位 (measdoc) |
| 14 | vchangerate | 换算率 | vchangerate | varchar(60) |  | 字符串 (String) |
| 15 | vbatchcode | 批次号 | vbatchcode | varchar(40) |  | 字符串 (String) |
| 16 | pk_batchcode | 批次档案 | pk_batchcode | varchar(40) |  | 字符串 (String) |
| 17 | crowno | 行号 | crowno | varchar(20) |  | 字符串 (String) |
| 18 | csettlefinorgvid | 结算财务组织 | csettlefinorgvid | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 19 | csettlefinorgid | 结算财务组织版本信息 | csettlefinorgid | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 20 | csendstoreorgvid | 发货库存组织 | csendstoreorgvid | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 21 | csendstoreorgid | 发货库存组织版本信息 | csendstoreorgid | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 22 | csendstoreid | 发货仓库 | csendstoreid | varchar(20) |  | 仓库 (stordoc) |
| 23 | csendareaid | 发货地区 | csendareaid | varchar(20) |  | 地区分类 (areaclass) |
| 24 | csendaddrdocid | 发货地点 | csendaddrdocid | varchar(20) |  | 地点档案 (addressdoc) |
| 25 | csendvendorid | 发货供应商 | csendvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 26 | csendaddrid | 发货地址 | csendaddrid | varchar(20) |  | 地址簿 (address) |
| 27 | vsender | 内部联系人 | vsender | varchar(20) |  | 人员基本信息 (psndoc) |
| 28 | vbsenderphone | 发货联系电话 | vbsenderphone | varchar(28) |  | 字符串 (String) |
| 29 | creceivestoreorgvid | 收货库存组织 | creceivestoreorgvid | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 30 | creceivestoreorgid | 收货库存组织版本信息 | creceivestoreorgid | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 31 | creceivestoreid | 收货仓库 | creceivestoreid | varchar(20) |  | 仓库 (stordoc) |
| 32 | creceiveareaid | 收货地区 | creceiveareaid | varchar(20) |  | 地区分类 (areaclass) |
| 33 | creceiveaddrdocid | 收货地点 | creceiveaddrdocid | varchar(20) |  | 地点档案 (addressdoc) |
| 34 | casscustid | 客户 | casscustid | varchar(20) |  | 客户基本信息 (customer) |
| 35 | creceivecustid | 收货客户 | creceivecustid | varchar(20) |  | 客户基本信息 (customer) |
| 36 | creceiveaddrid | 收货地址 | creceiveaddrid | varchar(20) |  | 地址簿 (address) |
| 37 | vreceiver | 收货联系人 | vreceiver | varchar(20) |  | 人员基本信息 (psndoc) |
| 38 | vreceivephone | 收货联系电话 | vreceivephone | varchar(28) |  | 字符串 (String) |
| 39 | dsenddate | 发货日期 | dsenddate | char(19) |  | 日期 (UFDate) |
| 40 | dsendtime | 发货时间 | dsendtime | char(19) |  | 日期时间 (UFDateTime) |
| 41 | drequiredate | 要求收货日期 | drequiredate | char(19) |  | 日期 (UFDate) |
| 42 | drequiretime | 要求收货时间 | drequiretime | char(19) |  | 日期时间 (UFDateTime) |
| 43 | vsrctype | 来源单据类型 | vsrctype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 44 | vsrccode | 来源单据号 | vsrccode | varchar(40) |  | 字符串 (String) |
| 45 | csrcid | 来源单据主表主键 | csrcid | varchar(20) |  | 字符串 (String) |
| 46 | csrcbid | 来源单据表体主键 | csrcbid | varchar(20) |  | 字符串 (String) |
| 47 | vsrcrowno | 来源单据行号 | vsrcrowno | varchar(20) |  | 字符串 (String) |
| 48 | vsrctrantype | 来源交易类型 | vsrctrantype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 49 | vfirsttype | 源头单据类型 | vfirsttype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 50 | vfirstcode | 源头单据号 | vfirstcode | varchar(40) |  | 字符串 (String) |
| 51 | cfirstid | 源头单据主表主键 | cfirstid | varchar(20) |  | 字符串 (String) |
| 52 | cfirstbid | 源头单据表体主键 | cfirstbid | varchar(20) |  | 字符串 (String) |
| 53 | vfirstrowno | 源头单据行号 | vfirstrowno | varchar(20) |  | 字符串 (String) |
| 54 | vfirsttrantype | 源头交易类型 | vfirsttrantype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 55 | cpuorder_bb1id | 采购到货计划行主键 | cpuorder_bb1id | varchar(20) |  | 字符串 (String) |
| 56 | vpuplancode | 采购到货计划号 | vpuplancode | varchar(40) |  | 字符串 (String) |
| 57 | nroutemile | 起到点间里程 | nroutemile | decimal(28, 8) |  | 数值 (UFDouble) |
| 58 | nspecialmile1 | 特殊路线1里程 | nspecialmile1 | decimal(28, 8) |  | 数值 (UFDouble) |
| 59 | nspecialmile2 | 特殊路线2里程 | nspecialmile2 | decimal(28, 8) |  | 数值 (UFDouble) |
| 60 | nspecialmile3 | 特殊路线3里程 | nspecialmile3 | decimal(28, 8) |  | 数值 (UFDouble) |
| 61 | nspecialmile4 | 特殊路线4里程 | nspecialmile4 | decimal(28, 8) |  | 数值 (UFDouble) |
| 62 | ccosignid | 委托单位 | ccosignid | varchar(20) |  | 客户基本信息 (customer) |
| 63 | ctakefeeid | 运费承担单位 | ctakefeeid | varchar(20) |  | 客户基本信息 (customer) |
| 64 | nsignnum | 签收主数量 | nsignnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 65 | nsignastnum | 签收数量 | nsignastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 66 | nsignweight | 签收重量 | nsignweight | decimal(28, 8) |  | 数值 (UFDouble) |
| 67 | nsignvolume | 签收体积 | nsignvolume | decimal(28, 8) |  | 数值 (UFDouble) |
| 68 | csignerid | 签收人 | csignerid | varchar(20) |  | 用户 (user) |
| 69 | dsigndate | 签收日期 | dsigndate | char(19) |  | 日期 (UFDate) |
| 70 | vbnote | 备注 | vbnote | varchar(181) |  | 字符串 (String) |
| 71 | cprojectid | 项目 | cprojectid | varchar(20) |  | 项目 (project) |
| 72 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 73 | cdmsupplierid | 供应商 | cdmsupplierid | varchar(20) |  | 供应商基本信息 (supplier) |
| 74 | cqualitylevel | 质量等级 | cqualitylevel | varchar(20) |  | 质量等级 (scm_qualitylevel_b) |
| 75 | cdefdoc | 生产厂商 | cdefdoc | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 76 | cffileid | 特征码 | cffileid | varchar(20) |  | 特征码档案 (bd_ffile) |
| 77 | cbiztypeid | 业务流程 | cbiztypeid | varchar(20) |  | 业务流程 (BusitypeVO) |
| 78 | bapflag | 已生成代垫运费发票 | bapflag | char(1) |  | 布尔类型 (UFBoolean) |
| 79 | barflag | 已生成应收运费发票 | barflag | char(1) |  | 布尔类型 (UFBoolean) |
| 80 | vbdef1 | 自定义项1 | vbdef1 | varchar(101) |  | 自定义项 (Custom) |
| 81 | vbdef2 | 自定义项2 | vbdef2 | varchar(101) |  | 自定义项 (Custom) |
| 82 | vbdef3 | 自定义项3 | vbdef3 | varchar(101) |  | 自定义项 (Custom) |
| 83 | vbdef4 | 自定义项4 | vbdef4 | varchar(101) |  | 自定义项 (Custom) |
| 84 | vbdef5 | 自定义项5 | vbdef5 | varchar(101) |  | 自定义项 (Custom) |
| 85 | vbdef6 | 自定义项6 | vbdef6 | varchar(101) |  | 自定义项 (Custom) |
| 86 | vbdef7 | 自定义项7 | vbdef7 | varchar(101) |  | 自定义项 (Custom) |
| 87 | vbdef8 | 自定义项8 | vbdef8 | varchar(101) |  | 自定义项 (Custom) |
| 88 | vbdef9 | 自定义项9 | vbdef9 | varchar(101) |  | 自定义项 (Custom) |
| 89 | vbdef10 | 自定义项10 | vbdef10 | varchar(101) |  | 自定义项 (Custom) |
| 90 | vbdef11 | 自定义项11 | vbdef11 | varchar(101) |  | 自定义项 (Custom) |
| 91 | vbdef12 | 自定义项12 | vbdef12 | varchar(101) |  | 自定义项 (Custom) |
| 92 | vbdef13 | 自定义项13 | vbdef13 | varchar(101) |  | 自定义项 (Custom) |
| 93 | vbdef14 | 自定义项14 | vbdef14 | varchar(101) |  | 自定义项 (Custom) |
| 94 | vbdef15 | 自定义项15 | vbdef15 | varchar(101) |  | 自定义项 (Custom) |
| 95 | vbdef16 | 自定义项16 | vbdef16 | varchar(101) |  | 自定义项 (Custom) |
| 96 | vbdef17 | 自定义项17 | vbdef17 | varchar(101) |  | 自定义项 (Custom) |
| 97 | vbdef18 | 自定义项18 | vbdef18 | varchar(101) |  | 自定义项 (Custom) |
| 98 | vbdef19 | 自定义项19 | vbdef19 | varchar(101) |  | 自定义项 (Custom) |
| 99 | vbdef20 | 自定义项20 | vbdef20 | varchar(101) |  | 自定义项 (Custom) |
| 100 | vbdef21 | 自定义项21 | vbdef21 | varchar(101) |  | 自定义项 (Custom) |
| 101 | vbdef22 | 自定义项22 | vbdef22 | varchar(101) |  | 自定义项 (Custom) |
| 102 | vbdef23 | 自定义项23 | vbdef23 | varchar(101) |  | 自定义项 (Custom) |
| 103 | vbdef24 | 自定义项24 | vbdef24 | varchar(101) |  | 自定义项 (Custom) |
| 104 | vbdef25 | 自定义项25 | vbdef25 | varchar(101) |  | 自定义项 (Custom) |
| 105 | vbdef26 | 自定义项26 | vbdef26 | varchar(101) |  | 自定义项 (Custom) |
| 106 | vbdef27 | 自定义项27 | vbdef27 | varchar(101) |  | 自定义项 (Custom) |
| 107 | vbdef28 | 自定义项28 | vbdef28 | varchar(101) |  | 自定义项 (Custom) |
| 108 | vbdef29 | 自定义项29 | vbdef29 | varchar(101) |  | 自定义项 (Custom) |
| 109 | vbdef30 | 自定义项30 | vbdef30 | varchar(101) |  | 自定义项 (Custom) |
| 110 | vbdef31 | 自定义项31 | vbdef31 | varchar(101) |  | 自定义项 (Custom) |
| 111 | vbdef32 | 自定义项32 | vbdef32 | varchar(101) |  | 自定义项 (Custom) |
| 112 | vbdef33 | 自定义项33 | vbdef33 | varchar(101) |  | 自定义项 (Custom) |
| 113 | vbdef34 | 自定义项34 | vbdef34 | varchar(101) |  | 自定义项 (Custom) |
| 114 | vbdef35 | 自定义项35 | vbdef35 | varchar(101) |  | 自定义项 (Custom) |
| 115 | vbdef36 | 自定义项36 | vbdef36 | varchar(101) |  | 自定义项 (Custom) |
| 116 | vbdef37 | 自定义项37 | vbdef37 | varchar(101) |  | 自定义项 (Custom) |
| 117 | vbdef38 | 自定义项38 | vbdef38 | varchar(101) |  | 自定义项 (Custom) |
| 118 | vbdef39 | 自定义项39 | vbdef39 | varchar(101) |  | 自定义项 (Custom) |
| 119 | vbdef40 | 自定义项40 | vbdef40 | varchar(101) |  | 自定义项 (Custom) |
| 120 | vbdef41 | 自定义项41 | vbdef41 | varchar(101) |  | 自定义项 (Custom) |
| 121 | vbdef42 | 自定义项42 | vbdef42 | varchar(101) |  | 自定义项 (Custom) |
| 122 | vbdef43 | 自定义项43 | vbdef43 | varchar(101) |  | 自定义项 (Custom) |
| 123 | vbdef44 | 自定义项44 | vbdef44 | varchar(101) |  | 自定义项 (Custom) |
| 124 | vbdef45 | 自定义项45 | vbdef45 | varchar(101) |  | 自定义项 (Custom) |
| 125 | vbdef46 | 自定义项46 | vbdef46 | varchar(101) |  | 自定义项 (Custom) |
| 126 | vbdef47 | 自定义项47 | vbdef47 | varchar(101) |  | 自定义项 (Custom) |
| 127 | vbdef48 | 自定义项48 | vbdef48 | varchar(101) |  | 自定义项 (Custom) |
| 128 | vbdef49 | 自定义项49 | vbdef49 | varchar(101) |  | 自定义项 (Custom) |
| 129 | vbdef50 | 自定义项50 | vbdef50 | varchar(101) |  | 自定义项 (Custom) |
| 130 | vfree1 | 自由辅助属性1 | vfree1 | varchar(101) |  | 自由项 (Custom) |
| 131 | vfree2 | 自由辅助属性2 | vfree2 | varchar(101) |  | 自由项 (Custom) |
| 132 | vfree3 | 自由辅助属性3 | vfree3 | varchar(101) |  | 自由项 (Custom) |
| 133 | vfree4 | 自由辅助属性4 | vfree4 | varchar(101) |  | 自由项 (Custom) |
| 134 | vfree5 | 自由辅助属性5 | vfree5 | varchar(101) |  | 自由项 (Custom) |
| 135 | vfree6 | 自由辅助属性6 | vfree6 | varchar(101) |  | 自由项 (Custom) |
| 136 | vfree7 | 自由辅助属性7 | vfree7 | varchar(101) |  | 自由项 (Custom) |
| 137 | vfree8 | 自由辅助属性8 | vfree8 | varchar(101) |  | 自由项 (Custom) |
| 138 | vfree9 | 自由辅助属性9 | vfree9 | varchar(101) |  | 自由项 (Custom) |
| 139 | vfree10 | 自由辅助属性10 | vfree10 | varchar(101) |  | 自由项 (Custom) |