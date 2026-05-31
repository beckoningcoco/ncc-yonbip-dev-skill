# |<<

**产成品入库单表体 (ic_finprodin_b / nc.vo.ic.m46.entity.FinProdInBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2900.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cgeneralbid | 产成品入库单表体主键 | cgeneralbid | char(20) | √ | 主键 (UFID) |
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
| 13 | nshouldnum | 应收主数量 | nshouldnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | nshouldassistnum | 应收数量 | nshouldassistnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | nnum | 实收主数量 | nnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | nassistnum | 实收数量 | nassistnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | ncostprice | 单价 | ncostprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | ncostmny | 金额 | ncostmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | nplannedprice | 计划单价 | nplannedprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | nplannedmny | 计划金额 | nplannedmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | dbizdate | 入库日期 | dbizdate | char(19) |  | 日期 (UFDate) |
| 22 | clocationid | 货位 | clocationid | varchar(20) |  | 货位 (rack) |
| 23 | vproductbatch | 生产订单号 | vproductbatch | varchar(40) |  | 字符串 (String) |
| 24 | cworkcenterid | 工作中心主键 | cworkcenterid | varchar(20) |  | 工作中心 (bd_wk) |
| 25 | csourcebillhid | 来源单据主键 | csourcebillhid | varchar(20) |  | 主键 (UFID) |
| 26 | csourcebillbid | 来源单据表体主键 | csourcebillbid | varchar(20) |  | 主键 (UFID) |
| 27 | csourcetype | 来源单据类型 | csourcetype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 28 | csourcetranstype | 来源交易类型 | csourcetranstype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 29 | vsourcebillcode | 来源单据号 | vsourcebillcode | varchar(40) |  | 字符串 (String) |
| 30 | vsourcerowno | 来源单据行标识 | vsourcerowno | varchar(20) |  | 字符串 (String) |
| 31 | csourcematerialoid | 来源单据物料 | csourcematerialoid | varchar(20) |  | 主键 (UFID) |
| 32 | casscustid | 客户 | casscustid | varchar(20) |  | 客户基本信息 (customer) |
| 33 | cprojectid | 项目 | cprojectid | varchar(20) |  | 项目 (project) |
| 34 | ccorrespondbid | 对应入库单表体主键 | ccorrespondbid | varchar(20) |  | 主键 (UFID) |
| 35 | ccorrespondhid | 对应入库单主键 | ccorrespondhid | varchar(20) |  | 主键 (UFID) |
| 36 | ccorrespondtype | 对应入库单类型 | ccorrespondtype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 37 | ccorrespondtranstype | 对应入库单交易类型 | ccorrespondtranstype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 38 | ccorrespondcode | 对应入库单单据号 | ccorrespondcode | varchar(40) |  | 字符串 (String) |
| 39 | ccorrespondrowno | 对应入库单行标识 | ccorrespondrowno | varchar(50) |  | 字符串 (String) |
| 40 | cfirsttype | 源头单据类型 | cfirsttype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 41 | cfirsttranstype | 源头交易类型 | cfirsttranstype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 42 | cfirstbillhid | 源头单据表头主键 | cfirstbillhid | varchar(20) |  | 主键 (UFID) |
| 43 | vfirstbillcode | 源头单据号 | vfirstbillcode | varchar(40) |  | 字符串 (String) |
| 44 | vfirstrowno | 源头单据行标识 | vfirstrowno | varchar(20) |  | 字符串 (String) |
| 45 | cfirstbillbid | 源头单据表体主键 | cfirstbillbid | varchar(20) |  | 主键 (UFID) |
| 46 | cvendorid | 供应商 | cvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 47 | vnotebody | 行备注 | vnotebody | varchar(200) |  | 字符串 (String) |
| 48 | ncountnum | 箱数 | ncountnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 49 | pk_packsort | 包装类型 | pk_packsort | varchar(20) |  | 包装箱类型 (PackTypeVO) |
| 50 | nbarcodenum | 条码主数量 | nbarcodenum | decimal(28, 8) |  | 数值 (UFDouble) |
| 51 | bbarcodeclose | 单据行是否条码关闭 | bbarcodeclose | char(1) |  | 布尔类型 (UFBoolean) |
| 52 | bonroadflag | 是否在途 | bonroadflag | char(1) |  | 布尔类型 (UFBoolean) |
| 53 | vvehiclecode | 运输工具号 | vvehiclecode | varchar(50) |  | 字符串 (String) |
| 54 | vtransfercode | 收货车号 | vtransfercode | varchar(50) |  | 字符串 (String) |
| 55 | pk_measware | 计量器具 | pk_measware | varchar(20) |  | 计量器具维护 (pd_meastool) |
| 56 | ngrossnum | 毛重主数量 | ngrossnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 57 | ntarenum | 皮重主数量 | ntarenum | decimal(28, 8) |  | 数值 (UFDouble) |
| 58 | csrc2billtype | 其他来源单据类型编码 | csrc2billtype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 59 | csrc2transtype | 其他来源交易类型编码 | csrc2transtype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 60 | csrc2billhid | 其他来源单主键 | csrc2billhid | varchar(20) |  | 主键 (UFID) |
| 61 | vsrc2billcode | 其他来源单据号 | vsrc2billcode | varchar(40) |  | 字符串 (String) |
| 62 | csrc2billbid | 其他来源单行主键 | csrc2billbid | varchar(20) |  | 主键 (UFID) |
| 63 | vsrc2billrowno | 其他来源单行标识 | vsrc2billrowno | varchar(20) |  | 字符串 (String) |
| 64 | idesatype | 拆解类型 | idesatype | int |  | 整数 (Integer) |
| 65 | cselastunitid | 选择拆解单位 | cselastunitid | varchar(20) |  | 主键 (UFID) |
| 66 | dproducedate | 生产日期 | dproducedate | varchar(19) |  | 日期(结束) (UFDateEnd) |
| 67 | dvalidate | 失效日期 | dvalidate | varchar(19) |  | 日期(结束) (UFDateEnd) |
| 68 | vbilltypeu8rm | 来自于零售之单据类型 | vbilltypeu8rm | varchar(4) |  | 字符串 (String) |
| 69 | vtranstypeu8rm | 来自于零售之交易类型 | vtranstypeu8rm | varchar(20) |  | 主键 (UFID) |
| 70 | cbodytranstypecode | 出入库类型 | cbodytranstypecode | varchar(20) |  | 单据类型 (BilltypeVO) |
| 71 | pk_org | 库存组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 72 | pk_org_v | 库存组织 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 73 | cbodywarehouseid | 库存仓库 | cbodywarehouseid | varchar(20) |  | 仓库 (stordoc) |
| 74 | cproductorid | 生产厂商 | cproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 75 | cvmivenderid | 寄存供应商 | cvmivenderid | varchar(20) |  | 供应商基本信息 (supplier) |
| 76 | vexigencyhid | 紧急放行申请单主键 | vexigencyhid | varchar(20) |  | 主键 (UFID) |
| 77 | vexigencycode | 紧急放行申请单号 | vexigencycode | varchar(50) |  | 字符串 (String) |
| 78 | vexigencybid | 紧急放行申请单行主键 | vexigencybid | varchar(20) |  | 主键 (UFID) |
| 79 | vexigencyrowno | 紧急放行申请单行号 | vexigencyrowno | varchar(50) |  | 字符串 (String) |
| 80 | cliabilityoid | 生产利润中心最新版本 | cliabilityoid | varchar(20) |  | 利润中心 (profitcenter) |
| 81 | cliabilityvid | 生产利润中心 | cliabilityvid | varchar(20) |  | 利润中心版本 (profitcenterVersion) |
| 82 | nweight | 重量 | nweight | decimal(28, 8) |  | 数值 (UFDouble) |
| 83 | nvolume | 体积 | nvolume | decimal(28, 8) |  | 数值 (UFDouble) |
| 84 | npiece | 件数 | npiece | decimal(28, 8) |  | 数值 (UFDouble) |
| 85 | ctplcustomerid | 货主客户 | ctplcustomerid | varchar(20) |  | 客户基本信息 (customer) |
| 86 | flargess | 赠品 | flargess | char(1) |  | 布尔类型 (UFBoolean) |
| 87 | pk_batchcode | 批次主键 | pk_batchcode | varchar(20) |  | 批次档案 (BatchcodeVO) |
| 88 | chandoverhid | 交接单表头主键 | chandoverhid | char(20) |  | 主键 (UFID) |
| 89 | chandoverbid | 交接单表体主键 | chandoverbid | char(20) |  | 主键 (UFID) |
| 90 | chandvoertranstype | 交接单交易类型 | chandvoertranstype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 91 | vhandovercode | 交接单单据号 | vhandovercode | varchar(50) |  | 字符串 (String) |
| 92 | csrcmaterialoid | 来源物料 | csrcmaterialoid | varchar(20) |  | 物料基本信息 (material_v) |
| 93 | csrcmaterialvid | 来源物料编码 | csrcmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 94 | cproductid | 主产品 | cproductid | varchar(20) |  | 物料基本信息 (material_v) |
| 95 | fproductclass | 产品类型 | fproductclass | int |  | 产出类型 (outputtype) |  | 1=主产品; |