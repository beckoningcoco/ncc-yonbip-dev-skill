# |<<

**材料出库单表体 (ic_material_b / nc.vo.ic.m4d.entity.MaterialOutBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2922.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cgeneralbid | 材料出库单表体主键 | cgeneralbid | char(20) | √ | 主键 (UFID) |
| 2 | crowno | 行号 | crowno | varchar(20) |  | 字符串 (String) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | corpoid | 公司最新版本 | corpoid | varchar(20) |  | 组织_业务单元_公司 (corp) |
| 5 | corpvid | 公司 | corpvid | varchar(20) |  | 组织_业务单元_公司版本信息 (corp_v) |
| 6 | cstateid | 库存状态 | cstateid | varchar(20) |  | 库存状态 (ic_storestate) |
| 7 | cmaterialoid | 物料 | cmaterialoid | varchar(20) |  | 物料基本信息 (material_v) |
| 8 | cmaterialvid | 物料编码 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 9 | cunitid | 主单位 | cunitid | varchar(20) |  | 计量单位 (measdoc) |
| 10 | castunitid | 单位 | castunitid | varchar(20) |  | 计量单位 (measdoc) |
| 11 | vchangerate | 换算率 | vchangerate | varchar(60) |  | 字符串 (String) |
| 12 | vbatchcode | 批次号 | vbatchcode | varchar(40) |  | 字符串 (String) |
| 13 | nshouldnum | 应发主数量 | nshouldnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | nshouldassistnum | 应发数量 | nshouldassistnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | nnum | 实发主数量 | nnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | nassistnum | 实发数量 | nassistnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | ncostprice | 单价 | ncostprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | ncostmny | 金额 | ncostmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | nplannedprice | 计划单价 | nplannedprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | nplannedmny | 计划金额 | nplannedmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | dbizdate | 出库日期 | dbizdate | varchar(19) |  | 日期 (UFDate) |
| 22 | drequiredate | 需求日期 | drequiredate | varchar(19) |  | 日期(结束) (UFDateEnd) |
| 23 | ccostobject | 产成品 | ccostobject | varchar(20) |  | 物料基本信息（多版本） (material) |
| 24 | cprodprojectid | 产成品辅助属性-项目 | cprodprojectid | varchar(20) |  | 项目 (project) |
| 25 | cprodasscustid | 产成品辅助属性-客户 | cprodasscustid | varchar(20) |  | 客户基本信息 (customer) |
| 26 | cprodvendorid | 产成品辅助属性-供应商 | cprodvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 27 | cprodproductorid | 产成品辅助属性-生产厂商 | cprodproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 28 | vprodfree1 | 产成品辅助属性-自由辅助属性1 | vprodfree1 | varchar(101) |  | 自由项 (Custom) |
| 29 | vprodfree2 | 产成品辅助属性-自由辅助属性2 | vprodfree2 | varchar(101) |  | 自由项 (Custom) |
| 30 | vprodfree3 | 产成品辅助属性-自由辅助属性3 | vprodfree3 | varchar(101) |  | 自由项 (Custom) |
| 31 | vprodfree4 | 产成品辅助属性-自由辅助属性4 | vprodfree4 | varchar(101) |  | 自由项 (Custom) |
| 32 | vprodfree5 | 产成品辅助属性-自由辅助属性5 | vprodfree5 | varchar(101) |  | 自由项 (Custom) |
| 33 | vprodfree6 | 产成品辅助属性-自由辅助属性6 | vprodfree6 | varchar(101) |  | 自由项 (Custom) |
| 34 | vprodfree7 | 产成品辅助属性-自由辅助属性7 | vprodfree7 | varchar(101) |  | 自由项 (Custom) |
| 35 | vprodfree8 | 产成品辅助属性-自由辅助属性8 | vprodfree8 | varchar(101) |  | 自由项 (Custom) |
| 36 | vprodfree9 | 产成品辅助属性-自由辅助属性9 | vprodfree9 | varchar(101) |  | 自由项 (Custom) |
| 37 | vprodfree10 | 产成品辅助属性-自由辅助属性10 | vprodfree10 | varchar(101) |  | 自由项 (Custom) |
| 38 | vproductbatch | 生产订单号 | vproductbatch | varchar(40) |  | 字符串 (String) |
| 39 | cworkcenterid | 工作中心主键 | cworkcenterid | varchar(20) |  | 工作中心 (bd_wk) |
| 40 | cworksiteid | 投料点主键 | cworksiteid | varchar(20) |  | 主键 (UFID) |
| 41 | cwp | 工序号 | cwp | varchar(181) |  | 字符串 (String) |
| 42 | clocationid | 货位 | clocationid | varchar(20) |  | 货位 (rack) |
| 43 | csourcebillhid | 来源单据主键 | csourcebillhid | varchar(20) |  | 主键 (UFID) |
| 44 | csourcebillbid | 来源单据表体主键 | csourcebillbid | varchar(20) |  | 主键 (UFID) |
| 45 | csourcetype | 来源单据类型 | csourcetype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 46 | csourcetranstype | 来源交易类型 | csourcetranstype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 47 | vsourcebillcode | 来源单据号 | vsourcebillcode | varchar(40) |  | 字符串 (String) |
| 48 | vsourcerowno | 来源单据行标识 | vsourcerowno | varchar(20) |  | 字符串 (String) |
| 49 | cprojectid | 项目 | cprojectid | varchar(20) |  | 项目 (project) |
| 50 | casscustid | 客户 | casscustid | varchar(20) |  | 客户基本信息 (customer) |
| 51 | ccorrespondbid | 对应入库单表体主键 | ccorrespondbid | varchar(20) |  | 主键 (UFID) |
| 52 | ccorrespondhid | 对应入库单主键 | ccorrespondhid | varchar(20) |  | 主键 (UFID) |
| 53 | ccorrespondtype | 对应入库单类型 | ccorrespondtype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 54 | ccorrespondtranstype | 对应入库单交易类型 | ccorrespondtranstype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 55 | ccorrespondcode | 对应入库单单据号 | ccorrespondcode | varchar(40) |  | 字符串 (String) |
| 56 | ccorrespondrowno | 对应入库单行标识 | ccorrespondrowno | varchar(50) |  | 字符串 (String) |
| 57 | cfirsttype | 源头单据类型 | cfirsttype | varchar(20) |  | 字符串 (String) |
| 58 | cfirsttranstype | 源头交易类型 | cfirsttranstype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 59 | cfirstbillhid | 源头单据表头主键 | cfirstbillhid | varchar(20) |  | 主键 (UFID) |
| 60 | vfirstbillcode | 源头单据号 | vfirstbillcode | varchar(40) |  | 字符串 (String) |
| 61 | vfirstrowno | 源头单据行标识 | vfirstrowno | varchar(20) |  | 字符串 (String) |
| 62 | cfirstbillbid | 源头单据表体主键 | cfirstbillbid | varchar(20) |  | 主键 (UFID) |
| 63 | cvendorid | 供应商 | cvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 64 | vnotebody | 行备注 | vnotebody | varchar(181) |  | 字符串 (String) |
| 65 | ncountnum | 箱数 | ncountnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 66 | pk_packsort | 包装类型 | pk_packsort | varchar(20) |  | 包装箱类型 (PackTypeVO) |
| 67 | nbarcodenum | 条码主数量 | nbarcodenum | decimal(28, 8) |  | 数值 (UFDouble) |
| 68 | bbarcodeclose | 单据行是否条码关闭 | bbarcodeclose | char(1) |  | 布尔类型 (UFBoolean) |
| 69 | bonroadflag | 是否在途 | bonroadflag | char(1) |  | 布尔类型 (UFBoolean) |
| 70 | vvehiclecode | 运输工具号 | vvehiclecode | varchar(50) |  | 字符串 (String) |
| 71 | vtransfercode | 收货车号 | vtransfercode | varchar(50) |  | 字符串 (String) |
| 72 | pk_measware | 计量器具 | pk_measware | varchar(20) |  | 计量器具维护 (pd_meastool) |
| 73 | ngrossnum | 毛重主数量 | ngrossnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 74 | ntarenum | 皮重主数量 | ntarenum | decimal(28, 8) |  | 数值 (UFDouble) |
| 75 | csrc2billtype | 其他来源单据类型编码 | csrc2billtype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 76 | csrc2transtype | 其他来源交易类型编码 | csrc2transtype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 77 | csrc2billhid | 其他来源单主键 | csrc2billhid | varchar(20) |  | 主键 (UFID) |
| 78 | vsrc2billcode | 其他来源单据号 | vsrc2billcode | varchar(40) |  | 字符串 (String) |
| 79 | csrc2billbid | 其他来源单行主键 | csrc2billbid | varchar(20) |  | 主键 (UFID) |
| 80 | vsrc2billrowno | 其他来源单行标识 | vsrc2billrowno | varchar(20) |  | 字符串 (String) |
| 81 | idesatype | 拆解类型 | idesatype | int |  | 整数 (Integer) |
| 82 | cselastunitid | 选择拆解单位 | cselastunitid | varchar(20) |  | 主键 (UFID) |
| 83 | dproducedate | 生产日期 | dproducedate | char(19) |  | 日期(结束) (UFDateEnd) |
| 84 | dvalidate | 失效日期 | dvalidate | char(19) |  | 日期(结束) (UFDateEnd) |
| 85 | vbilltypeu8rm | 来自于零售之单据类型 | vbilltypeu8rm | varchar(4) |  | 字符串 (String) |
| 86 | vtranstypeu8rm | 来自于零售之交易类型 | vtranstypeu8rm | varchar(20) |  | 主键 (UFID) |
| 87 | cbodytranstypecode | 出入库类型 | cbodytranstypecode | varchar(20) |  | 单据类型 (BilltypeVO) |
| 88 | pk_org | 库存组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 89 | pk_org_v | 库存组织 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 90 | cbodywarehouseid | 库存仓库 | cbodywarehouseid | varchar(20) |  | 仓库 (stordoc) |
| 91 | cproductorid | 生产厂商 | cproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 92 | cvmivenderid | 寄存供应商 | cvmivenderid | varchar(20) |  | 供应商基本信息 (supplier) |
| 93 | vexigencyhid | 紧急放行申请单主键 | vexigencyhid | varchar(20) |  | 主键 (UFID) |
| 94 | vexigencycode | 紧急放行申请单号 | vexigencycode | varchar(40) |  | 字符串 (String) |
| 95 | vexigencybid | 紧急放行申请单行主键 | vexigencybid | varchar(20) |  | 主键 (UFID) |
| 96 | vexigencyrowno | 紧急放行申请单行号 | vexigencyrowno | varchar(20) |  | 字符串 (String) |
| 97 | cliabilityoid | 领料利润中心 | cliabilityoid | varchar(20) |  | 利润中心 (profitcenter) |
| 98 | cliabilityvid | 领料利润中心版本 | cliabilityvid | varchar(20) |  | 利润中心版本 (profitcenterVersion) |
| 99 | nweight | 重量 | nweight | decimal(28, 8) |  | 数值 (UFDouble) |
| 100 | nvolume | 体积 | nvolume | decimal(28, 8) |  | 数值 (UFDouble) |
| 101 | npiece | 件数 | npiece | decimal(28, 8) |  | 数值 (UFDouble) |
| 102 | ctplcustomerid | 货主客户 | ctplcustomerid | varchar(20) |  | 客户基本信息 (customer) |
| 103 | pk_batchcode | 批次主键 | pk_batchcode | varchar(20) |  | 批次档案 (BatchcodeVO) |
| 104 | bassetcard | 是否生成资产卡片 | bassetcard | char(1) |  | 布尔类型 (UFBoolean) |
| 105 | chandoverhid | 交接单头主键 | chandoverhid | char(20) |  | 主键 (UFID) |
| 106 | chandoverbid | 交接单体主键 | chandoverbid | char(20) |  | 主键 (UFID) |
| 107 | chandvoertranstype | 交接单交易类型 | chandvoertranstype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 108 | vhandovercode | 交接单单据号 | vhandovercode | varchar(50) |  | 字符串 (String) |
| 109 | csrcmaterialoid | 来源物料编码 | csrcmaterialoid | varchar(20) |  | 物料基本信息 (material_v) |
| 110 | csrcmaterialvid | 来源物料版本 | csrcmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 111 | cprojecttaskid | 项目任务 | cprojecttaskid | varchar(20) |  | 项目任务 (WBS) |
| 112 | creporthid | 生产报告表头主键 | creporthid | varchar(20) |  | 主键 (UFID) |
| 113 | creportbid | 生产报告表体主键 | creportbid | varchar(20) |  | 主键 (UFID) |
| 114 | cworkorderhid | 维修工单表头主键 | cworkorderhid | varchar(20) |  | 字符串 (String) |
| 115 | cworkorderbid | 维修工单表体主键 | cworkorderbid | varchar(20) |  | 字符串 (String) |
| 116 | cworkordercode | 维修工单号 | cworkordercode | varchar(40) |  | 字符串 (String) |
| 117 | cworkorderrowno | 维修工单行号 | cworkorderrowno | varchar(20) |  | 字符串 (String) |
| 118 | cworkordertrantype | 维修工单交易类型 | cworkordertrantype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 119 | cpickmhid | 备料计划表头主键 | cpickmhid | varchar(20) |  | 字符串 (String) |
| 120 | cpickmbid | 备料计划表体主键 | cpickmbid | varchar(20) |  | 字符串 (String) |
| 121 | cpickmcode | 备料计划单据号 | cpickmcode | varchar(40) |  | 字符串 (String) |
| 122 | cpickmrowno | 备料计划行号 | cpickmrowno | varchar(20) |  | 字符串 (String) |
| 123 | cpickmtranstype | 备料计划交易类型 | cpickmtranstype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 124 | crcid | 工序类型 | crcid | varchar(20) |  | 标准工序 (pd_rc) |
| 125 | pk_cbsnode | cbs | pk_cbsnode | varchar(20) |  | 成本分解结构成员 (cbsnode) |
| 126 | cioliabilityoid | 出库利润中心 | cioliabilityoid | varchar(20) |  | 利润中心 (profitcenter) |
| 127 | cioliabilityvid | 出库利润中心版本 | cioliabilityvid | varchar(20) |  | 利润中心版本 (profitcenterVersion) |
| 128 | vserialcode | 序列号 | vserialcode | varchar(128) |  | 字符串 (String) |
| 129 | pk_serialcode | 序列号主键 | pk_serialcode | varchar(20) |  | 序列号档案 (SerialNoVO) |
| 130 | vcontractcode | 项目合同编码 | vcontractcode | varchar(101) |  | 字符串 (String) |
| 131 | vbillbarcode | 单据条码 | vbillbarcode | varchar(128) |  | 字符串 (String) |
| 132 | breworkflag | 产成品返修 | breworkflag | char(1) |  | 布尔类型 (UFBoolean) | N |
| 133 | cffileid | 特征码 | cffileid | varchar(20) |  | 特征码档案 (bd_ffile) |
| 134 | cmffileid | 产成品辅助属性-特征码 | cmffileid | varchar(20) |  | 特征码档案 (bd_ffile) |
| 135 | nonhandnum | 现存量 | nonhandnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 136 | nretailmny | 零售金额 | nretailmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 137 | materialpackage | 耗材包包码 | materialpackage | varchar(50) |  | 字符串 (String) |
| 138 | casenumber | 病案号 | casenumber | varchar(50) |  | 字符串 (String) |
| 139 | setpartcode | 耗材包编码 | setpartcode | varchar(20) |  | 物料基本信息（多版本） (material) |
| 140 | setpartname | 耗材包名称 | setpartname | varchar(50) |  | 字符串 (String) |
| 141 | chargeprocode | 收费项目编码 | chargeprocode | varchar(50) |  | 字符串 (String) |
| 142 | chargeproname | 收费项目名称 | chargeproname | varchar(50) |  | 字符串 (String) |
| 143 | vfree1 | 自由辅助属性1 | vfree1 | varchar(101) |  | 自由项 (Custom) |
| 144 | vfree2 | 自由辅助属性2 | vfree2 | varchar(101) |  | 自由项 (Custom) |
| 145 | vfree3 | 自由辅助属性3 | vfree3 | varchar(101) |  | 自由项 (Custom) |
| 146 | vfree4 | 自由辅助属性4 | vfree4 | varchar(101) |  | 自由项 (Custom) |
| 147 | vfree5 | 自由辅助属性5 | vfree5 | varchar(101) |  | 自由项 (Custom) |
| 148 | vfree6 | 自由辅助属性6 | vfree6 | varchar(101) |  | 自由项 (Custom) |
| 149 | vfree7 | 自由辅助属性7 | vfree7 | varchar(101) |  | 自由项 (Custom) |
| 150 | vfree8 | 自由辅助属性8 | vfree8 | varchar(101) |  | 自由项 (Custom) |
| 151 | vfree9 | 自由辅助属性9 | vfree9 | varchar(101) |  | 自由项 (Custom) |
| 152 | vfree10 | 自由辅助属性10 | vfree10 | varchar(101) |  | 自由项 (Custom) |
| 153 | vbdef1 | 表体自定义项1 | vbdef1 | varchar(101) |  | 自定义项 (Custom) |
| 154 | vbdef2 | 表体自定义项2 | vbdef2 | varchar(101) |  | 自定义项 (Custom) |
| 155 | vbdef3 | 表体自定义项3 | vbdef3 | varchar(101) |  | 自定义项 (Custom) |
| 156 | vbdef4 | 表体自定义项4 | vbdef4 | varchar(101) |  | 自定义项 (Custom) |
| 157 | vbdef5 | 表体自定义项5 | vbdef5 | varchar(101) |  | 自定义项 (Custom) |
| 158 | vbdef6 | 表体自定义项6 | vbdef6 | varchar(101) |  | 自定义项 (Custom) |
| 159 | vbdef7 | 表体自定义项7 | vbdef7 | varchar(101) |  | 自定义项 (Custom) |
| 160 | vbdef8 | 表体自定义项8 | vbdef8 | varchar(101) |  | 自定义项 (Custom) |
| 161 | vbdef9 | 表体自定义项9 | vbdef9 | varchar(101) |  | 自定义项 (Custom) |
| 162 | vbdef10 | 表体自定义项10 | vbdef10 | varchar(101) |  | 自定义项 (Custom) |
| 163 | vbdef11 | 表体自定义项11 | vbdef11 | varchar(101) |  | 自定义项 (Custom) |
| 164 | vbdef12 | 表体自定义项12 | vbdef12 | varchar(101) |  | 自定义项 (Custom) |
| 165 | vbdef13 | 表体自定义项13 | vbdef13 | varchar(101) |  | 自定义项 (Custom) |
| 166 | vbdef14 | 表体自定义项14 | vbdef14 | varchar(101) |  | 自定义项 (Custom) |
| 167 | vbdef15 | 表体自定义项15 | vbdef15 | varchar(101) |  | 自定义项 (Custom) |
| 168 | vbdef16 | 表体自定义项16 | vbdef16 | varchar(101) |  | 自定义项 (Custom) |
| 169 | vbdef17 | 表体自定义项17 | vbdef17 | varchar(101) |  | 自定义项 (Custom) |
| 170 | vbdef18 | 表体自定义项18 | vbdef18 | varchar(101) |  | 自定义项 (Custom) |
| 171 | vbdef19 | 表体自定义项19 | vbdef19 | varchar(101) |  | 自定义项 (Custom) |
| 172 | vbdef20 | 表体自定义项20 | vbdef20 | varchar(101) |  | 自定义项 (Custom) |
| 173 | vbdef21 | 表体自定义项21 | vbdef21 | varchar(101) |  | 自定义项 (Custom) |
| 174 | vbdef22 | 表体自定义项22 | vbdef22 | varchar(101) |  | 自定义项 (Custom) |
| 175 | vbdef23 | 表体自定义项23 | vbdef23 | varchar(101) |  | 自定义项 (Custom) |
| 176 | vbdef24 | 表体自定义项24 | vbdef24 | varchar(101) |  | 自定义项 (Custom) |
| 177 | vbdef25 | 表体自定义项25 | vbdef25 | varchar(101) |  | 自定义项 (Custom) |
| 178 | vbdef26 | 表体自定义项26 | vbdef26 | varchar(101) |  | 自定义项 (Custom) |
| 179 | vbdef27 | 表体自定义项27 | vbdef27 | varchar(101) |  | 自定义项 (Custom) |
| 180 | vbdef28 | 表体自定义项28 | vbdef28 | varchar(101) |  | 自定义项 (Custom) |
| 181 | vbdef29 | 表体自定义项29 | vbdef29 | varchar(101) |  | 自定义项 (Custom) |
| 182 | vbdef30 | 表体自定义项30 | vbdef30 | varchar(101) |  | 自定义项 (Custom) |
| 183 | vbdef31 | 表体自定义项31 | vbdef31 | varchar(101) |  | 自定义项 (Custom) |
| 184 | vbdef32 | 表体自定义项32 | vbdef32 | varchar(101) |  | 自定义项 (Custom) |
| 185 | vbdef33 | 表体自定义项33 | vbdef33 | varchar(101) |  | 自定义项 (Custom) |
| 186 | vbdef34 | 表体自定义项34 | vbdef34 | varchar(101) |  | 自定义项 (Custom) |
| 187 | vbdef35 | 表体自定义项35 | vbdef35 | varchar(101) |  | 自定义项 (Custom) |
| 188 | vbdef36 | 表体自定义项36 | vbdef36 | varchar(101) |  | 自定义项 (Custom) |
| 189 | vbdef37 | 表体自定义项37 | vbdef37 | varchar(101) |  | 自定义项 (Custom) |
| 190 | vbdef38 | 表体自定义项38 | vbdef38 | varchar(101) |  | 自定义项 (Custom) |
| 191 | vbdef39 | 表体自定义项39 | vbdef39 | varchar(101) |  | 自定义项 (Custom) |
| 192 | vbdef40 | 表体自定义项40 | vbdef40 | varchar(101) |  | 自定义项 (Custom) |
| 193 | vbdef41 | 表体自定义项41 | vbdef41 | varchar(101) |  | 自定义项 (Custom) |
| 194 | vbdef42 | 表体自定义项42 | vbdef42 | varchar(101) |  | 自定义项 (Custom) |
| 195 | vbdef43 | 表体自定义项43 | vbdef43 | varchar(101) |  | 自定义项 (Custom) |
| 196 | vbdef44 | 表体自定义项44 | vbdef44 | varchar(101) |  | 自定义项 (Custom) |
| 197 | vbdef45 | 表体自定义项45 | vbdef45 | varchar(101) |  | 自定义项 (Custom) |
| 198 | vbdef46 | 表体自定义项46 | vbdef46 | varchar(101) |  | 自定义项 (Custom) |
| 199 | vbdef47 | 表体自定义项47 | vbdef47 | varchar(101) |  | 自定义项 (Custom) |
| 200 | vbdef48 | 表体自定义项48 | vbdef48 | varchar(101) |  | 自定义项 (Custom) |
| 201 | vbdef49 | 表体自定义项49 | vbdef49 | varchar(101) |  | 自定义项 (Custom) |
| 202 | vbdef50 | 表体自定义项50 | vbdef50 | varchar(101) |  | 自定义项 (Custom) |