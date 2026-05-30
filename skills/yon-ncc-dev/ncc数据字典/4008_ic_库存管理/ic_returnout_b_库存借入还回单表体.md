# |<<

**库存借入还回单表体 (ic_returnout_b / nc.vo.ic.m4j.entity.ReturnOutBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2968.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cgeneralbid | 借入还回单表体主键 | cgeneralbid | char(20) | √ | 主键 (UFID) |
| 2 | crowno | 行号 | crowno | varchar(20) |  | 字符串 (String) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | corpoid | 公司最新版本 | corpoid | varchar(20) |  | 组织_业务单元_公司 (corp) |
| 5 | corpvid | 公司 | corpvid | varchar(20) |  | 组织_业务单元_公司版本信息 (corp_v) |
| 6 | cstateid | 库存状态 | cstateid | varchar(20) |  | 库存状态 (ic_storestate) |
| 7 | cmaterialoid | 物料 | cmaterialoid | varchar(20) | √ | 物料基本信息 (material_v) |
| 8 | cmaterialvid | 物料编码 | cmaterialvid | varchar(20) | √ | 物料基本信息（多版本） (material) |
| 9 | cunitid | 主单位 | cunitid | varchar(20) |  | 计量单位 (measdoc) |
| 10 | castunitid | 单位 | castunitid | varchar(20) |  | 计量单位 (measdoc) |
| 11 | vchangerate | 换算率 | vchangerate | varchar(60) |  | 字符串 (String) |
| 12 | vbatchcode | 批次号 | vbatchcode | varchar(40) |  | 字符串 (String) |
| 13 | nshouldnum | 应还回主数量 | nshouldnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | nshouldassistnum | 应还回数量 | nshouldassistnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | nnum | 还回主数量 | nnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | nassistnum | 还回数量 | nassistnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | ncostprice | 单价 | ncostprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | ncostmny | 金额 | ncostmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | dbizdate | 出库日期 | dbizdate | char(19) |  | 日期 (UFDate) |
| 20 | clocationid | 货位 | clocationid | varchar(20) |  | 货位 (rack) |
| 21 | csourcebillhid | 来源单据主键 | csourcebillhid | varchar(20) |  | 主键 (UFID) |
| 22 | csourcebillbid | 来源单据表体主键 | csourcebillbid | varchar(20) |  | 主键 (UFID) |
| 23 | csourcetype | 来源单据类型 | csourcetype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 24 | csourcetranstype | 来源单据交易类型 | csourcetranstype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 25 | vsourcebillcode | 来源单据号 | vsourcebillcode | varchar(40) |  | 字符串 (String) |
| 26 | vsourcerowno | 来源单据行号 | vsourcerowno | varchar(20) |  | 字符串 (String) |
| 27 | cprojectid | 项目 | cprojectid | varchar(20) |  | 项目 (project) |
| 28 | casscustid | 客户 | casscustid | varchar(20) |  | 客户基本信息 (customer) |
| 29 | ccorrespondbid | 对应入库单表体主键 | ccorrespondbid | varchar(20) |  | 主键 (UFID) |
| 30 | ccorrespondhid | 对应入库单主键 | ccorrespondhid | varchar(20) |  | 主键 (UFID) |
| 31 | ccorrespondtype | 对应入库单类型 | ccorrespondtype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 32 | ccorrespondtranstype | 对应入库单交易类型 | ccorrespondtranstype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 33 | ccorrespondcode | 对应入库单单据号 | ccorrespondcode | varchar(40) |  | 字符串 (String) |
| 34 | ccorrespondrowno | 对应入库单行号 | ccorrespondrowno | varchar(20) |  | 字符串 (String) |
| 35 | cfirsttype | 源头单据类型 | cfirsttype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 36 | cfirsttranstype | 源头单据交易类型 | cfirsttranstype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 37 | cfirstbillhid | 源头单据表头主键 | cfirstbillhid | varchar(20) |  | 主键 (UFID) |
| 38 | vfirstbillcode | 源头单据号 | vfirstbillcode | varchar(40) |  | 字符串 (String) |
| 39 | vfirstrowno | 源头单据行号 | vfirstrowno | varchar(20) |  | 字符串 (String) |
| 40 | cfirstbillbid | 源头单据表体主键 | cfirstbillbid | varchar(20) |  | 主键 (UFID) |
| 41 | cvendorid | 供应商 | cvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 42 | vnotebody | 行备注 | vnotebody | varchar(181) |  | 字符串 (String) |
| 43 | ncountnum | 箱数 | ncountnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 44 | pk_packsort | 包装类型 | pk_packsort | varchar(20) |  | 包装箱类型 (PackTypeVO) |
| 45 | nbarcodenum | 条码主数量 | nbarcodenum | decimal(28, 8) |  | 数值 (UFDouble) |
| 46 | bbarcodeclose | 单据行是否条码关闭 | bbarcodeclose | char(1) |  | 布尔类型 (UFBoolean) |
| 47 | bonroadflag | 是否在途 | bonroadflag | char(1) |  | 布尔类型 (UFBoolean) |
| 48 | vvehiclecode | 运输工具号 | vvehiclecode | varchar(20) |  | 字符串 (String) |
| 49 | vtransfercode | 收货车号 | vtransfercode | varchar(20) |  | 字符串 (String) |
| 50 | pk_measware | 计量器具 | pk_measware | varchar(20) |  | 计量器具维护 (pd_meastool) |
| 51 | ngrossnum | 毛重主数量 | ngrossnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 52 | ntarenum | 皮重主数量 | ntarenum | decimal(28, 8) |  | 数值 (UFDouble) |
| 53 | csrc2billtype | 其他来源单据类型编码 | csrc2billtype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 54 | csrc2transtype | 其他来源交易类型编码 | csrc2transtype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 55 | csrc2billhid | 其他来源单主键 | csrc2billhid | varchar(20) |  | 主键 (UFID) |
| 56 | vsrc2billcode | 其他来源单据号 | vsrc2billcode | varchar(40) |  | 字符串 (String) |
| 57 | csrc2billbid | 其他来源单行主键 | csrc2billbid | varchar(20) |  | 主键 (UFID) |
| 58 | vsrc2billrowno | 其他来源单行号 | vsrc2billrowno | varchar(20) |  | 字符串 (String) |
| 59 | idesatype | 拆解类型 | idesatype | int |  | 整数 (Integer) |
| 60 | cselastunitid | 选择拆解单位 | cselastunitid | varchar(20) |  | 主键 (UFID) |
| 61 | dproducedate | 生产日期 | dproducedate | varchar(19) |  | 日期 (UFDate) |
| 62 | dvalidate | 失效日期 | dvalidate | varchar(19) |  | 日期 (UFDate) |
| 63 | vbilltypeu8rm | 来自于零售之单据类型 | vbilltypeu8rm | varchar(20) |  | 字符串 (String) |
| 64 | vtranstypeu8rm | 来自于零售之交易类型 | vtranstypeu8rm | varchar(20) |  | 主键 (UFID) |
| 65 | cbodytranstypecode | 出入库类型 | cbodytranstypecode | varchar(20) |  | 单据类型 (BilltypeVO) |
| 66 | pk_org | 库存组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 67 | pk_org_v | 库存组织 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 68 | cbodywarehouseid | 库存仓库 | cbodywarehouseid | varchar(20) |  | 仓库 (stordoc) |
| 69 | cproductorid | 生产厂商 | cproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 70 | cvmivenderid | 寄存供应商 | cvmivenderid | varchar(20) |  | 供应商基本信息 (supplier) |
| 71 | nweight | 重量 | nweight | decimal(28, 8) |  | 数值 (UFDouble) |
| 72 | nvolume | 体积 | nvolume | decimal(28, 8) |  | 数值 (UFDouble) |
| 73 | npiece | 件数 | npiece | decimal(28, 8) |  | 数值 (UFDouble) |
| 74 | pk_batchcode | 批次主键 | pk_batchcode | varchar(20) |  | 批次档案 (BatchcodeVO) |
| 75 | ncorrespondnum | 累计出库主数量 | ncorrespondnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 76 | ncorrespondastnum | 累计出库数量 | ncorrespondastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 77 | ncorrespondgrsnum | 累计出库毛重主数量 | ncorrespondgrsnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 78 | vserialcode | 序列号 | vserialcode | varchar(128) |  | 字符串 (String) |
| 79 | pk_serialcode | 序列号主键 | pk_serialcode | varchar(20) |  | 序列号档案 (SerialNoVO) |
| 80 | cffileid | 特征码 | cffileid | varchar(20) |  | 特征码档案 (bd_ffile) |
| 81 | vfree1 | 自由辅助属性1 | vfree1 | varchar(101) |  | 自由项 (Custom) |
| 82 | vfree2 | 自由辅助属性2 | vfree2 | varchar(101) |  | 自由项 (Custom) |
| 83 | vfree3 | 自由辅助属性3 | vfree3 | varchar(101) |  | 自由项 (Custom) |
| 84 | vfree4 | 自由辅助属性4 | vfree4 | varchar(101) |  | 自由项 (Custom) |
| 85 | vfree5 | 自由辅助属性5 | vfree5 | varchar(101) |  | 自由项 (Custom) |
| 86 | vfree6 | 自由辅助属性6 | vfree6 | varchar(101) |  | 自由项 (Custom) |
| 87 | vfree7 | 自由辅助属性7 | vfree7 | varchar(101) |  | 自由项 (Custom) |
| 88 | vfree8 | 自由辅助属性8 | vfree8 | varchar(101) |  | 自由项 (Custom) |
| 89 | vfree9 | 自由辅助属性9 | vfree9 | varchar(101) |  | 自由项 (Custom) |
| 90 | vfree10 | 自由辅助属性10 | vfree10 | varchar(101) |  | 自由项 (Custom) |
| 91 | vbdef1 | 表体自定义项1 | vbdef1 | varchar(101) |  | 自定义项 (Custom) |
| 92 | vbdef2 | 表体自定义项2 | vbdef2 | varchar(101) |  | 自定义项 (Custom) |
| 93 | vbdef3 | 表体自定义项3 | vbdef3 | varchar(101) |  | 自定义项 (Custom) |
| 94 | vbdef4 | 表体自定义项4 | vbdef4 | varchar(101) |  | 自定义项 (Custom) |
| 95 | vbdef5 | 表体自定义项5 | vbdef5 | varchar(101) |  | 自定义项 (Custom) |
| 96 | vbdef6 | 表体自定义项6 | vbdef6 | varchar(101) |  | 自定义项 (Custom) |
| 97 | vbdef7 | 表体自定义项7 | vbdef7 | varchar(101) |  | 自定义项 (Custom) |
| 98 | vbdef8 | 表体自定义项8 | vbdef8 | varchar(101) |  | 自定义项 (Custom) |
| 99 | vbdef9 | 表体自定义项9 | vbdef9 | varchar(101) |  | 自定义项 (Custom) |
| 100 | vbdef10 | 表体自定义项10 | vbdef10 | varchar(101) |  | 自定义项 (Custom) |
| 101 | vbdef11 | 表体自定义项11 | vbdef11 | varchar(101) |  | 自定义项 (Custom) |
| 102 | vbdef12 | 表体自定义项12 | vbdef12 | varchar(101) |  | 自定义项 (Custom) |
| 103 | vbdef13 | 表体自定义项13 | vbdef13 | varchar(101) |  | 自定义项 (Custom) |
| 104 | vbdef14 | 表体自定义项14 | vbdef14 | varchar(101) |  | 自定义项 (Custom) |
| 105 | vbdef15 | 表体自定义项15 | vbdef15 | varchar(101) |  | 自定义项 (Custom) |
| 106 | vbdef16 | 表体自定义项16 | vbdef16 | varchar(101) |  | 自定义项 (Custom) |
| 107 | vbdef17 | 表体自定义项17 | vbdef17 | varchar(101) |  | 自定义项 (Custom) |
| 108 | vbdef18 | 表体自定义项18 | vbdef18 | varchar(101) |  | 自定义项 (Custom) |
| 109 | vbdef19 | 表体自定义项19 | vbdef19 | varchar(101) |  | 自定义项 (Custom) |
| 110 | vbdef20 | 表体自定义项20 | vbdef20 | varchar(101) |  | 自定义项 (Custom) |
| 111 | vbdef21 | 表体自定义项21 | vbdef21 | varchar(101) |  | 自定义项 (Custom) |
| 112 | vbdef22 | 表体自定义项22 | vbdef22 | varchar(101) |  | 自定义项 (Custom) |
| 113 | vbdef23 | 表体自定义项23 | vbdef23 | varchar(101) |  | 自定义项 (Custom) |
| 114 | vbdef24 | 表体自定义项24 | vbdef24 | varchar(101) |  | 自定义项 (Custom) |
| 115 | vbdef25 | 表体自定义项25 | vbdef25 | varchar(101) |  | 自定义项 (Custom) |
| 116 | vbdef26 | 表体自定义项26 | vbdef26 | varchar(101) |  | 自定义项 (Custom) |
| 117 | vbdef27 | 表体自定义项27 | vbdef27 | varchar(101) |  | 自定义项 (Custom) |
| 118 | vbdef28 | 表体自定义项28 | vbdef28 | varchar(101) |  | 自定义项 (Custom) |
| 119 | vbdef29 | 表体自定义项29 | vbdef29 | varchar(101) |  | 自定义项 (Custom) |
| 120 | vbdef30 | 表体自定义项30 | vbdef30 | varchar(101) |  | 自定义项 (Custom) |
| 121 | vbdef31 | 表体自定义项31 | vbdef31 | varchar(101) |  | 自定义项 (Custom) |
| 122 | vbdef32 | 表体自定义项32 | vbdef32 | varchar(101) |  | 自定义项 (Custom) |
| 123 | vbdef33 | 表体自定义项33 | vbdef33 | varchar(101) |  | 自定义项 (Custom) |
| 124 | vbdef34 | 表体自定义项34 | vbdef34 | varchar(101) |  | 自定义项 (Custom) |
| 125 | vbdef35 | 表体自定义项35 | vbdef35 | varchar(101) |  | 自定义项 (Custom) |
| 126 | vbdef36 | 表体自定义项36 | vbdef36 | varchar(101) |  | 自定义项 (Custom) |
| 127 | vbdef37 | 表体自定义项37 | vbdef37 | varchar(101) |  | 自定义项 (Custom) |
| 128 | vbdef38 | 表体自定义项38 | vbdef38 | varchar(101) |  | 自定义项 (Custom) |
| 129 | vbdef39 | 表体自定义项39 | vbdef39 | varchar(101) |  | 自定义项 (Custom) |
| 130 | vbdef40 | 表体自定义项40 | vbdef40 | varchar(101) |  | 自定义项 (Custom) |
| 131 | vbdef41 | 表体自定义项41 | vbdef41 | varchar(101) |  | 自定义项 (Custom) |
| 132 | vbdef42 | 表体自定义项42 | vbdef42 | varchar(101) |  | 自定义项 (Custom) |
| 133 | vbdef43 | 表体自定义项43 | vbdef43 | varchar(101) |  | 自定义项 (Custom) |
| 134 | vbdef44 | 表体自定义项44 | vbdef44 | varchar(101) |  | 自定义项 (Custom) |
| 135 | vbdef45 | 表体自定义项45 | vbdef45 | varchar(101) |  | 自定义项 (Custom) |
| 136 | vbdef46 | 表体自定义项46 | vbdef46 | varchar(101) |  | 自定义项 (Custom) |
| 137 | vbdef47 | 表体自定义项47 | vbdef47 | varchar(101) |  | 自定义项 (Custom) |
| 138 | vbdef48 | 表体自定义项48 | vbdef48 | varchar(101) |  | 自定义项 (Custom) |
| 139 | vbdef49 | 表体自定义项49 | vbdef49 | varchar(101) |  | 自定义项 (Custom) |
| 140 | vbdef50 | 表体自定义项50 | vbdef50 | varchar(101) |  | 自定义项 (Custom) |