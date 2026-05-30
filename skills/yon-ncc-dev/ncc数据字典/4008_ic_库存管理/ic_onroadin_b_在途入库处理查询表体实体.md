# |<<

**在途入库处理查询表体实体 (ic_onroadin_b / nc.vo.ic.onroadin.OnroadInCondBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2940.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cgeneralbid | 表体主键 | cgeneralbid | char(20) | √ | 主键 (UFID) |
| 2 | cmaterialoid | 物料 | cmaterialoid | varchar(20) | √ | 物料基本信息 (material_v) |
| 3 | cmaterialvid | 物料编码 | cmaterialvid | varchar(20) | √ | 物料基本信息（多版本） (material) |
| 4 | cunitid | 主单位 | cunitid | varchar(20) |  | 计量单位 (measdoc) |
| 5 | castunitid | 单位 | castunitid | varchar(20) |  | 计量单位 (measdoc) |
| 6 | vchangerate | 换算率 | vchangerate | varchar(60) |  | 字符串 (String) |
| 7 | cvendorid | 供应商 | cvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 8 | vbatchcode | 批次号 | vbatchcode | varchar(40) |  | 字符串 (String) |
| 9 | nshouldassistnum | 应收数量 | nshouldassistnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | nshouldnum | 应收主数量 | nshouldnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | nassistnum | 实收数量 | nassistnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | nnum | 实收主数量 | nnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | cproductorid | 生产厂商 | cproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 14 | cvmivenderid | 寄存供应商 | cvmivenderid | varchar(20) |  | 供应商基本信息 (supplier) |
| 15 | cprojectid | 项目 | cprojectid | varchar(20) |  | 项目 (project) |
| 16 | ncostprice | 单价 | ncostprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | ncostmny | 金额 | ncostmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | nplannedprice | 计划单价 | nplannedprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | nplannedmny | 计划金额 | nplannedmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | dbizdate | 入库日期 | dbizdate | char(19) |  | 日期 (UFDate) |
| 21 | clocationid | 货位 | clocationid | varchar(20) |  | 货位 (rack) |
| 22 | dproducedate | 生产日期 | dproducedate | char(19) |  | 日期 (UFDate) |
| 23 | dvalidate | 失效日期 | dvalidate | char(19) |  | 日期 (UFDate) |
| 24 | csourcebillhid | 来源单据表头主键 | csourcebillhid | char(20) |  | 主键 (UFID) |
| 25 | csourcebillbid | 来源单据表体主键 | csourcebillbid | char(20) |  | 主键 (UFID) |
| 26 | csourcetype | 来源单据类型 | csourcetype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 27 | csourcetranstype | 来源交易类型 | csourcetranstype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 28 | cfirsttype | 源头单据类型 | cfirsttype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 29 | cfirsttranstype | 源头交易类型 | cfirsttranstype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 30 | vfirstbillcode | 源头单据号 | vfirstbillcode | varchar(50) |  | 字符串 (String) |
| 31 | vvehiclecode | 运输工具号 | vvehiclecode | varchar(50) |  | 字符串 (String) |
| 32 | vtransfercode | 收货车号 | vtransfercode | varchar(50) |  | 字符串 (String) |
| 33 | dplanoutdate | 计划发货日期 | dplanoutdate | char(19) |  | 日期 (UFDate) |
| 34 | dplanarrivedate | 计划到货日期 | dplanarrivedate | char(19) |  | 日期 (UFDate) |
| 35 | cstateid | 库存状态 | cstateid | varchar(20) |  | 库存状态 (ic_storestate) |
| 36 | vsourcebillcode | 来源单据号 | vsourcebillcode | varchar(40) |  | 字符串 (String) |
| 37 | cffileid | 特征码 | cffileid | varchar(20) |  | 特征码档案 (bd_ffile) |
| 38 | casscustid | 客户 | casscustid | varchar(20) |  | 客户基本信息 (customer) |
| 39 | vfree1 | 自由辅助属性1 | vfree1 | varchar(101) |  | 自由项 (Custom) |
| 40 | vfree2 | 自由辅助属性2 | vfree2 | varchar(101) |  | 自由项 (Custom) |
| 41 | vfree3 | 自由辅助属性3 | vfree3 | varchar(101) |  | 自由项 (Custom) |
| 42 | vfree4 | 自由辅助属性4 | vfree4 | varchar(101) |  | 自由项 (Custom) |
| 43 | vfree5 | 自由辅助属性5 | vfree5 | varchar(101) |  | 自由项 (Custom) |
| 44 | vfree6 | 自由辅助属性6 | vfree6 | varchar(101) |  | 自由项 (Custom) |
| 45 | vfree7 | 自由辅助属性7 | vfree7 | varchar(101) |  | 自由项 (Custom) |
| 46 | vfree8 | 自由辅助属性8 | vfree8 | varchar(101) |  | 自由项 (Custom) |
| 47 | vfree9 | 自由辅助属性9 | vfree9 | varchar(101) |  | 自由项 (Custom) |
| 48 | vfree10 | 自由辅助属性10 | vfree10 | varchar(101) |  | 自由项 (Custom) |
| 49 | vbdef1 | 表体自定义项1 | vbdef1 | varchar(100) |  | 字符串 (String) |
| 50 | vbdef2 | 表体自定义项2 | vbdef2 | varchar(100) |  | 字符串 (String) |
| 51 | vbdef3 | 表体自定义项3 | vbdef3 | varchar(100) |  | 字符串 (String) |
| 52 | vbdef4 | 表体自定义项4 | vbdef4 | varchar(100) |  | 字符串 (String) |
| 53 | vbdef5 | 表体自定义项5 | vbdef5 | varchar(100) |  | 字符串 (String) |
| 54 | vbdef6 | 表体自定义项6 | vbdef6 | varchar(100) |  | 字符串 (String) |
| 55 | vbdef7 | 表体自定义项7 | vbdef7 | varchar(100) |  | 字符串 (String) |
| 56 | vbdef8 | 表体自定义项8 | vbdef8 | varchar(100) |  | 字符串 (String) |
| 57 | vbdef9 | 表体自定义项9 | vbdef9 | varchar(100) |  | 字符串 (String) |
| 58 | vbdef10 | 表体自定义项10 | vbdef10 | varchar(100) |  | 字符串 (String) |
| 59 | vbdef11 | 表体自定义项11 | vbdef11 | varchar(100) |  | 字符串 (String) |
| 60 | vbdef12 | 表体自定义项12 | vbdef12 | varchar(100) |  | 字符串 (String) |
| 61 | vbdef13 | 表体自定义项13 | vbdef13 | varchar(100) |  | 字符串 (String) |
| 62 | vbdef14 | 表体自定义项14 | vbdef14 | varchar(100) |  | 字符串 (String) |
| 63 | vbdef15 | 表体自定义项15 | vbdef15 | varchar(100) |  | 字符串 (String) |
| 64 | vbdef16 | 表体自定义项16 | vbdef16 | varchar(100) |  | 字符串 (String) |
| 65 | vbdef17 | 表体自定义项17 | vbdef17 | varchar(100) |  | 字符串 (String) |
| 66 | vbdef18 | 表体自定义项18 | vbdef18 | varchar(100) |  | 字符串 (String) |
| 67 | vbdef19 | 表体自定义项19 | vbdef19 | varchar(100) |  | 字符串 (String) |
| 68 | vbdef20 | 表体自定义项20 | vbdef20 | varchar(100) |  | 字符串 (String) |
| 69 | vbdef21 | 表体自定义项21 | vbdef21 | varchar(100) |  | 字符串 (String) |
| 70 | vbdef22 | 表体自定义项22 | vbdef22 | varchar(100) |  | 字符串 (String) |
| 71 | vbdef23 | 表体自定义项23 | vbdef23 | varchar(100) |  | 字符串 (String) |
| 72 | vbdef24 | 表体自定义项24 | vbdef24 | varchar(100) |  | 字符串 (String) |
| 73 | vbdef25 | 表体自定义项25 | vbdef25 | varchar(100) |  | 字符串 (String) |
| 74 | vbdef26 | 表体自定义项26 | vbdef26 | varchar(100) |  | 字符串 (String) |
| 75 | vbdef27 | 表体自定义项27 | vbdef27 | varchar(100) |  | 字符串 (String) |
| 76 | vbdef28 | 表体自定义项28 | vbdef28 | varchar(100) |  | 字符串 (String) |
| 77 | vbdef29 | 表体自定义项29 | vbdef29 | varchar(100) |  | 字符串 (String) |
| 78 | vbdef30 | 表体自定义项30 | vbdef30 | varchar(100) |  | 字符串 (String) |
| 79 | vbdef31 | 表体自定义项31 | vbdef31 | varchar(100) |  | 字符串 (String) |
| 80 | vbdef32 | 表体自定义项32 | vbdef32 | varchar(100) |  | 字符串 (String) |
| 81 | vbdef33 | 表体自定义项33 | vbdef33 | varchar(100) |  | 字符串 (String) |
| 82 | vbdef34 | 表体自定义项34 | vbdef34 | varchar(100) |  | 字符串 (String) |
| 83 | vbdef35 | 表体自定义项35 | vbdef35 | varchar(100) |  | 字符串 (String) |
| 84 | vbdef36 | 表体自定义项36 | vbdef36 | varchar(100) |  | 字符串 (String) |
| 85 | vbdef37 | 表体自定义项37 | vbdef37 | varchar(100) |  | 字符串 (String) |
| 86 | vbdef38 | 表体自定义项38 | vbdef38 | varchar(100) |  | 字符串 (String) |
| 87 | vbdef39 | 表体自定义项39 | vbdef39 | varchar(100) |  | 字符串 (String) |
| 88 | vbdef40 | 表体自定义项40 | vbdef40 | varchar(100) |  | 字符串 (String) |
| 89 | vbdef41 | 表体自定义项41 | vbdef41 | varchar(100) |  | 字符串 (String) |
| 90 | vbdef42 | 表体自定义项42 | vbdef42 | varchar(100) |  | 字符串 (String) |
| 91 | vbdef43 | 表体自定义项43 | vbdef43 | varchar(100) |  | 字符串 (String) |
| 92 | vbdef44 | 表体自定义项44 | vbdef44 | varchar(100) |  | 字符串 (String) |
| 93 | vbdef45 | 表体自定义项45 | vbdef45 | varchar(100) |  | 字符串 (String) |
| 94 | vbdef46 | 表体自定义项46 | vbdef46 | varchar(100) |  | 字符串 (String) |
| 95 | vbdef47 | 表体自定义项47 | vbdef47 | varchar(100) |  | 字符串 (String) |
| 96 | vbdef48 | 表体自定义项48 | vbdef48 | varchar(100) |  | 字符串 (String) |
| 97 | vbdef49 | 表体自定义项49 | vbdef49 | varchar(100) |  | 字符串 (String) |
| 98 | vbdef50 | 表体自定义项50 | vbdef50 | varchar(100) |  | 字符串 (String) |