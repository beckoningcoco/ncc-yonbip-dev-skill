# |<<

**调拨入库单表体 (ic_transin_b / nc.vo.ic.m4e.entity.TransInBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2992.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cgeneralbid | 入库单表体主键 | cgeneralbid | char(20) | √ | 主键 (UFID) |
| 2 | crowno | 行号 | crowno | varchar(20) |  | 字符串 (String) |
| 3 | corpoid | 公司最新版本 | corpoid | varchar(20) |  | 组织_业务单元_公司 (corp) |
| 4 | corpvid | 公司 | corpvid | varchar(20) |  | 组织_业务单元_公司版本信息 (corp_v) |
| 5 | cstateid | 库存状态 | cstateid | varchar(20) |  | 库存状态 (ic_storestate) |
| 6 | cmaterialoid | 物料 | cmaterialoid | varchar(20) | √ | 物料基本信息 (material_v) |
| 7 | cmaterialvid | 物料编码 | cmaterialvid | varchar(20) | √ | 物料基本信息（多版本） (material) |
| 8 | cunitid | 主单位 | cunitid | varchar(20) |  | 计量单位 (measdoc) |
| 9 | castunitid | 单位 | castunitid | varchar(20) |  | 计量单位 (measdoc) |
| 10 | vchangerate | 换算率 | vchangerate | varchar(60) |  | 字符串 (String) |
| 11 | cvendorid | 供应商 | cvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 12 | vbatchcode | 批次号 | vbatchcode | varchar(40) |  | 字符串 (String) |
| 13 | nshouldassistnum | 应收数量 | nshouldassistnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | nshouldnum | 应收主数量 | nshouldnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | nassistnum | 实收数量 | nassistnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | nnum | 实收主数量 | nnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | cproductorid | 生产厂商 | cproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 18 | cvmivenderid | 寄存供应商 | cvmivenderid | varchar(20) |  | 供应商基本信息 (supplier) |
| 19 | cprojectid | 项目 | cprojectid | varchar(20) |  | 项目 (project) |
| 20 | casscustid | 客户 | casscustid | varchar(20) |  | 客户基本信息 (customer) |
| 21 | ncostprice | 单价 | ncostprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 22 | ncostmny | 金额 | ncostmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 23 | nplannedprice | 计划单价 | nplannedprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 24 | nplannedmny | 计划金额 | nplannedmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 25 | dbizdate | 入库日期 | dbizdate | varchar(19) |  | 日期 (UFDate) |
| 26 | clocationid | 货位 | clocationid | varchar(20) |  | 货位 (rack) |
| 27 | vnotebody | 行备注 | vnotebody | varchar(181) |  | 字符串 (String) |
| 28 | nbarcodenum | 条码数量 | nbarcodenum | decimal(28, 8) |  | 数值 (UFDouble) |
| 29 | bbarcodeclose | 单据行是否条码关闭 | bbarcodeclose | char(1) |  | 布尔类型 (UFBoolean) |
| 30 | dproducedate | 生产日期 | dproducedate | varchar(19) |  | 日期(结束) (UFDateEnd) |
| 31 | dvalidate | 失效日期 | dvalidate | varchar(19) |  | 日期(结束) (UFDateEnd) |
| 32 | csourcebillhid | 来源单据表头主键 | csourcebillhid | varchar(20) |  | 主键 (UFID) |
| 33 | csourcebillbid | 来源单据表体行主键 | csourcebillbid | varchar(20) |  | 主键 (UFID) |
| 34 | csourcetype | 来源单据类型 | csourcetype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 35 | csourcetranstype | 来源交易类型 | csourcetranstype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 36 | vsourcebillcode | 来源单据号 | vsourcebillcode | varchar(40) |  | 字符串 (String) |
| 37 | vsourcerowno | 来源单据行号 | vsourcerowno | varchar(20) |  | 字符串 (String) |
| 38 | ccorrespondbid | 对应入库单表体主键 | ccorrespondbid | varchar(20) |  | 主键 (UFID) |
| 39 | ccorrespondhid | 对应入库单表头主键 | ccorrespondhid | varchar(20) |  | 主键 (UFID) |
| 40 | ccorrespondtype | 对应入库单类型 | ccorrespondtype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 41 | ccorrespondtranstype | 对应入库单交易类型 | ccorrespondtranstype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 42 | ccorrespondcode | 对应入库单单据号 | ccorrespondcode | varchar(40) |  | 字符串 (String) |
| 43 | ccorrespondrowno | 对应入库单行号 | ccorrespondrowno | varchar(20) |  | 字符串 (String) |
| 44 | flargess | 赠品 | flargess | char(1) |  | 布尔类型 (UFBoolean) |
| 45 | bsourcelargess | 上游赠品行 | bsourcelargess | char(1) |  | 布尔类型 (UFBoolean) |
| 46 | cfirsttype | 源头单据类型 | cfirsttype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 47 | cfirsttranstype | 源头交易类型 | cfirsttranstype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 48 | cfirstbillhid | 源头单据表头 | cfirstbillhid | varchar(20) |  | 主键 (UFID) |
| 49 | cfirstbillbid | 源头单据表体 | cfirstbillbid | varchar(20) |  | 主键 (UFID) |
| 50 | vfirstbillcode | 源头单据号 | vfirstbillcode | varchar(40) |  | 字符串 (String) |
| 51 | vfirstrowno | 源头单据行号 | vfirstrowno | varchar(20) |  | 字符串 (String) |
| 52 | ncountnum | 箱数 | ncountnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 53 | pk_packsort | 包装类型 | pk_packsort | varchar(20) |  | 包装箱类型 (PackTypeVO) |
| 54 | bonroadflag | 在途 | bonroadflag | char(1) |  | 布尔类型 (UFBoolean) |
| 55 | vvehiclecode | 运输工具号 | vvehiclecode | varchar(20) |  | 字符串 (String) |
| 56 | vtransfercode | 收货车号 | vtransfercode | varchar(20) |  | 字符串 (String) |
| 57 | pk_measware | 计量器具 | pk_measware | varchar(20) |  | 计量器具维护 (pd_meastool) |
| 58 | ntarenum | 皮重主数量 | ntarenum | decimal(28, 8) |  | 数值 (UFDouble) |
| 59 | csrc2billtype | 其他来源单据类型编码 | csrc2billtype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 60 | csrc2transtype | 其他来源交易类型编码 | csrc2transtype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 61 | csrc2billhid | 其他来源单头主键 | csrc2billhid | varchar(20) |  | 主键 (UFID) |
| 62 | vsrc2billcode | 其他来源单据号 | vsrc2billcode | varchar(40) |  | 字符串 (String) |
| 63 | csrc2billbid | 其他来源单行主键 | csrc2billbid | varchar(20) |  | 主键 (UFID) |
| 64 | vsrc2billrowno | 其他来源单行号 | vsrc2billrowno | varchar(20) |  | 字符串 (String) |
| 65 | idesatype | 拆解类型 | idesatype | int |  | 整数 (Integer) |
| 66 | cselastunitid | 选择拆解单位 | cselastunitid | varchar(20) |  | 主键 (UFID) |
| 67 | ngrossnum | 毛重主数量 | ngrossnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 68 | vbilltypeu8rm | 来自于零售之单据类型 | vbilltypeu8rm | varchar(20) |  | 字符串 (String) |
| 69 | cliabilityoid | 调入利润中心最新版本 | cliabilityoid | varchar(20) |  | 利润中心 (profitcenter) |
| 70 | cliabilityvid | 调入利润中心 | cliabilityvid | varchar(20) |  | 利润中心版本 (profitcenterVersion) |
| 71 | nweight | 重量 | nweight | decimal(28, 8) |  | 数值 (UFDouble) |
| 72 | nvolume | 体积 | nvolume | decimal(28, 8) |  | 数值 (UFDouble) |
| 73 | npiece | 件数 | npiece | decimal(28, 8) |  | 数值 (UFDouble) |
| 74 | cbodytranstypecode | 出入库类型 | cbodytranstypecode | varchar(20) |  | 单据类型 (BilltypeVO) |
| 75 | pk_org_v | 库存组织 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 76 | pk_org | 库存组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 77 | cbodywarehouseid | 仓库 | cbodywarehouseid | varchar(20) |  | 仓库 (stordoc) |
| 78 | dfirstbilldate | 调拨订单日期 | dfirstbilldate | varchar(19) |  | 日期 (UFDate) |
| 79 | dplanoutdate | 计划发货日期 | dplanoutdate | varchar(19) |  | 日期(开始) (UFDateBegin) |
| 80 | dplanarrivedate | 计划到货日期 | dplanarrivedate | varchar(19) |  | 日期(结束) (UFDateEnd) |
| 81 | bassetcard | 已生成设备卡片 | bassetcard | char(1) |  | 布尔类型 (UFBoolean) |
| 82 | bfixedasset | 已转固 | bfixedasset | char(1) |  | 布尔类型 (UFBoolean) |
| 83 | csrcmaterialoid | 来源物料 | csrcmaterialoid | varchar(20) |  | 物料基本信息 (material_v) |
| 84 | csrcmaterialvid | 来源物料编码 | csrcmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 85 | bhasiabill | 是否已传存货核算 | bhasiabill | char(1) |  | 布尔类型 (UFBoolean) |
| 86 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 87 | pk_batchcode | 批次档案 | pk_batchcode | varchar(20) |  | 批次档案 (BatchcodeVO) |
| 88 | coutcalbodyoid | 调出库存组织 | coutcalbodyoid | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 89 | coutcalbodyvid | 调出库存组织版本 | coutcalbodyvid | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 90 | ntotalpicknum | 累计拣配主数量 | ntotalpicknum | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 91 | cioliabilityoid | 调出利润中心最新版本 | cioliabilityoid | varchar(20) |  | 利润中心 (profitcenter) |
| 92 | cioliabilityvid | 调出利润中心 | cioliabilityvid | varchar(20) |  | 利润中心版本 (profitcenterVersion) |
| 93 | vserialcode | 序列号 | vserialcode | varchar(128) |  | 字符串 (String) |
| 94 | pk_serialcode | 序列号主键 | pk_serialcode | varchar(20) |  | 序列号档案 (SerialNoVO) |
| 95 | vbillbarcode | 单据条码 | vbillbarcode | varchar(128) |  | 字符串 (String) |
| 96 | cffileid | 特征码 | cffileid | varchar(20) |  | 特征码档案 (bd_ffile) |
| 97 | nretailmny | 零售金额 | nretailmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 98 | vfree1 | 自由辅助属性1 | vfree1 | varchar(101) |  | 自由项 (Custom) |
| 99 | vfree2 | 自由辅助属性2 | vfree2 | varchar(101) |  | 自由项 (Custom) |
| 100 | vfree3 | 自由辅助属性3 | vfree3 | varchar(101) |  | 自由项 (Custom) |
| 101 | vfree4 | 自由辅助属性4 | vfree4 | varchar(101) |  | 自由项 (Custom) |
| 102 | vfree5 | 自由辅助属性5 | vfree5 | varchar(101) |  | 自由项 (Custom) |
| 103 | vfree6 | 自由辅助属性6 | vfree6 | varchar(101) |  | 自由项 (Custom) |
| 104 | vfree7 | 自由辅助属性7 | vfree7 | varchar(101) |  | 自由项 (Custom) |
| 105 | vfree8 | 自由辅助属性8 | vfree8 | varchar(101) |  | 自由项 (Custom) |
| 106 | vfree9 | 自由辅助属性9 | vfree9 | varchar(101) |  | 自由项 (Custom) |
| 107 | vfree10 | 自由辅助属性10 | vfree10 | varchar(101) |  | 自由项 (Custom) |
| 108 | vbdef1 | 表体自定义项1 | vbdef1 | varchar(101) |  | 自定义项 (Custom) |
| 109 | vbdef2 | 表体自定义项2 | vbdef2 | varchar(101) |  | 自定义项 (Custom) |
| 110 | vbdef3 | 表体自定义项3 | vbdef3 | varchar(101) |  | 自定义项 (Custom) |
| 111 | vbdef4 | 表体自定义项4 | vbdef4 | varchar(101) |  | 自定义项 (Custom) |
| 112 | vbdef5 | 表体自定义项5 | vbdef5 | varchar(101) |  | 自定义项 (Custom) |
| 113 | vbdef6 | 表体自定义项6 | vbdef6 | varchar(101) |  | 自定义项 (Custom) |
| 114 | vbdef7 | 表体自定义项7 | vbdef7 | varchar(101) |  | 自定义项 (Custom) |
| 115 | vbdef8 | 表体自定义项8 | vbdef8 | varchar(101) |  | 自定义项 (Custom) |
| 116 | vbdef9 | 表体自定义项9 | vbdef9 | varchar(101) |  | 自定义项 (Custom) |
| 117 | vbdef10 | 表体自定义项10 | vbdef10 | varchar(101) |  | 自定义项 (Custom) |
| 118 | vbdef11 | 表体自定义项11 | vbdef11 | varchar(101) |  | 自定义项 (Custom) |
| 119 | vbdef12 | 表体自定义项12 | vbdef12 | varchar(101) |  | 自定义项 (Custom) |
| 120 | vbdef13 | 表体自定义项13 | vbdef13 | varchar(101) |  | 自定义项 (Custom) |
| 121 | vbdef14 | 表体自定义项14 | vbdef14 | varchar(101) |  | 自定义项 (Custom) |
| 122 | vbdef15 | 表体自定义项15 | vbdef15 | varchar(101) |  | 自定义项 (Custom) |
| 123 | vbdef16 | 表体自定义项16 | vbdef16 | varchar(101) |  | 自定义项 (Custom) |
| 124 | vbdef17 | 表体自定义项17 | vbdef17 | varchar(101) |  | 自定义项 (Custom) |
| 125 | vbdef18 | 表体自定义项18 | vbdef18 | varchar(101) |  | 自定义项 (Custom) |
| 126 | vbdef19 | 表体自定义项19 | vbdef19 | varchar(101) |  | 自定义项 (Custom) |
| 127 | vbdef20 | 表体自定义项20 | vbdef20 | varchar(101) |  | 自定义项 (Custom) |
| 128 | vbdef21 | 表体自定义项21 | vbdef21 | varchar(101) |  | 自定义项 (Custom) |
| 129 | vbdef22 | 表体自定义项22 | vbdef22 | varchar(101) |  | 自定义项 (Custom) |
| 130 | vbdef23 | 表体自定义项23 | vbdef23 | varchar(101) |  | 自定义项 (Custom) |
| 131 | vbdef24 | 表体自定义项24 | vbdef24 | varchar(101) |  | 自定义项 (Custom) |
| 132 | vbdef25 | 表体自定义项25 | vbdef25 | varchar(101) |  | 自定义项 (Custom) |
| 133 | vbdef26 | 表体自定义项26 | vbdef26 | varchar(101) |  | 自定义项 (Custom) |
| 134 | vbdef27 | 表体自定义项27 | vbdef27 | varchar(101) |  | 自定义项 (Custom) |
| 135 | vbdef28 | 表体自定义项28 | vbdef28 | varchar(101) |  | 自定义项 (Custom) |
| 136 | vbdef29 | 表体自定义项29 | vbdef29 | varchar(101) |  | 自定义项 (Custom) |
| 137 | vbdef30 | 表体自定义项30 | vbdef30 | varchar(101) |  | 自定义项 (Custom) |
| 138 | vbdef31 | 表体自定义项31 | vbdef31 | varchar(101) |  | 自定义项 (Custom) |
| 139 | vbdef32 | 表体自定义项32 | vbdef32 | varchar(101) |  | 自定义项 (Custom) |
| 140 | vbdef33 | 表体自定义项33 | vbdef33 | varchar(101) |  | 自定义项 (Custom) |
| 141 | vbdef34 | 表体自定义项34 | vbdef34 | varchar(101) |  | 自定义项 (Custom) |
| 142 | vbdef35 | 表体自定义项35 | vbdef35 | varchar(101) |  | 自定义项 (Custom) |
| 143 | vbdef36 | 表体自定义项36 | vbdef36 | varchar(101) |  | 自定义项 (Custom) |
| 144 | vbdef37 | 表体自定义项37 | vbdef37 | varchar(101) |  | 自定义项 (Custom) |
| 145 | vbdef38 | 表体自定义项38 | vbdef38 | varchar(101) |  | 自定义项 (Custom) |
| 146 | vbdef39 | 表体自定义项39 | vbdef39 | varchar(101) |  | 自定义项 (Custom) |
| 147 | vbdef40 | 表体自定义项40 | vbdef40 | varchar(101) |  | 自定义项 (Custom) |
| 148 | vbdef41 | 表体自定义项41 | vbdef41 | varchar(101) |  | 自定义项 (Custom) |
| 149 | vbdef42 | 表体自定义项42 | vbdef42 | varchar(101) |  | 自定义项 (Custom) |
| 150 | vbdef43 | 表体自定义项43 | vbdef43 | varchar(101) |  | 自定义项 (Custom) |
| 151 | vbdef44 | 表体自定义项44 | vbdef44 | varchar(101) |  | 自定义项 (Custom) |
| 152 | vbdef45 | 表体自定义项45 | vbdef45 | varchar(101) |  | 自定义项 (Custom) |
| 153 | vbdef46 | 表体自定义项46 | vbdef46 | varchar(101) |  | 自定义项 (Custom) |
| 154 | vbdef47 | 表体自定义项47 | vbdef47 | varchar(101) |  | 自定义项 (Custom) |
| 155 | vbdef48 | 表体自定义项48 | vbdef48 | varchar(101) |  | 自定义项 (Custom) |
| 156 | vbdef49 | 表体自定义项49 | vbdef49 | varchar(101) |  | 自定义项 (Custom) |
| 157 | vbdef50 | 表体自定义项50 | vbdef50 | varchar(101) |  | 自定义项 (Custom) |