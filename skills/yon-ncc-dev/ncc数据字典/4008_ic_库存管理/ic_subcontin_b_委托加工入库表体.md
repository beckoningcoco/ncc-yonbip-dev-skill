# |<<

**委托加工入库表体 (ic_subcontin_b / nc.vo.ic.m47.entity.SubcontInBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2982.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cgeneralbid | 委托加工入库表体ID | cgeneralbid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | corpoid | 公司最新版本 | corpoid | varchar(20) |  | 组织_业务单元_公司 (corp) |
| 4 | corpvid | 公司 | corpvid | varchar(20) |  | 组织_业务单元_公司版本信息 (corp_v) |
| 5 | crowno | 行号 | crowno | varchar(20) |  | 字符串 (String) |
| 6 | cmaterialoid | 物料 | cmaterialoid | varchar(20) | √ | 物料基本信息 (material_v) |
| 7 | cmaterialvid | 物料编码 | cmaterialvid | varchar(20) | √ | 物料基本信息（多版本） (material) |
| 8 | cunitid | 主单位 | cunitid | varchar(20) |  | 计量单位 (measdoc) |
| 9 | castunitid | 单位 | castunitid | varchar(20) |  | 计量单位 (measdoc) |
| 10 | vchangerate | 换算率 | vchangerate | varchar(60) |  | 字符串 (String) |
| 11 | vbatchcode | 批次号 | vbatchcode | varchar(40) |  | 字符串 (String) |
| 12 | nshouldnum | 应收主数量 | nshouldnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | nshouldassistnum | 应收数量 | nshouldassistnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | nnum | 实收主数量 | nnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | nassistnum | 实收数量 | nassistnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | ncostprice | 单价 | ncostprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | ncostmny | 金额 | ncostmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | nplannedprice | 计划单价 | nplannedprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | nplannedmny | 计划金额 | nplannedmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | dbizdate | 入库日期 | dbizdate | char(19) |  | 日期 (UFDate) |
| 21 | dproducedate | 生产日期 | dproducedate | char(19) |  | 日期(结束) (UFDateEnd) |
| 22 | dvalidate | 失效日期 | dvalidate | char(19) |  | 日期(结束) (UFDateEnd) |
| 23 | cstateid | 库存状态 | cstateid | varchar(20) |  | 库存状态 (ic_storestate) |
| 24 | cqualitylevelid | 质量等级 | cqualitylevelid | varchar(20) |  | 质量等级 (scm_qualitylevel_b) |
| 25 | cproductorid | 生产厂商 | cproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 26 | cvendorid | 供应商 | cvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 27 | cprojectid | 项目 | cprojectid | varchar(20) |  | 项目 (project) |
| 28 | casscustid | 客户 | casscustid | varchar(20) |  | 客户基本信息 (customer) |
| 29 | clocationid | 货位 | clocationid | varchar(20) |  | 货位 (rack) |
| 30 | nweight | 重量 | nweight | decimal(28, 8) |  | 数值 (UFDouble) |
| 31 | nvolume | 体积 | nvolume | decimal(28, 8) |  | 数值 (UFDouble) |
| 32 | npiece | 件数 | npiece | decimal(28, 8) |  | 数值 (UFDouble) |
| 33 | vnotebody | 行备注 | vnotebody | varchar(181) |  | 字符串 (String) |
| 34 | vexigencyhid | 紧急放行申请单id | vexigencyhid | varchar(20) |  | 主键 (UFID) |
| 35 | vexigencybid | 紧急放行申请单行id | vexigencybid | varchar(20) |  | 主键 (UFID) |
| 36 | vexigencycode | 紧急放行申请单号 | vexigencycode | varchar(40) |  | 字符串 (String) |
| 37 | vexigencyrowno | 紧急放行申请单行号 | vexigencyrowno | varchar(20) |  | 字符串 (String) |
| 38 | csourcebillhid | 来源单据ID | csourcebillhid | varchar(20) |  | 主键 (UFID) |
| 39 | csourcebillbid | 来源单据表体ID | csourcebillbid | varchar(20) |  | 主键 (UFID) |
| 40 | carriveorder_bbid | 来源到货单质检明细ID | carriveorder_bbid | varchar(20) |  | 主键 (UFID) |
| 41 | csourcetype | 来源单据类型 | csourcetype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 42 | csourcetranstype | 来源交易类型 | csourcetranstype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 43 | vsourcebillcode | 来源单据号 | vsourcebillcode | varchar(40) |  | 字符串 (String) |
| 44 | vsourcerowno | 来源单据行号 | vsourcerowno | varchar(20) |  | 字符串 (String) |
| 45 | cfirstbillhid | 源头单据表头ID | cfirstbillhid | varchar(20) |  | 主键 (UFID) |
| 46 | cfirstbillbid | 源头单据表体ID | cfirstbillbid | varchar(20) |  | 主键 (UFID) |
| 47 | cfirsttype | 源头单据类型 | cfirsttype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 48 | cfirsttranstype | 源头交易类型 | cfirsttranstype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 49 | vfirstbillcode | 源头单据号 | vfirstbillcode | varchar(40) |  | 字符串 (String) |
| 50 | vfirstrowno | 源头单据行号 | vfirstrowno | varchar(20) |  | 字符串 (String) |
| 51 | pk_measware | 计量器具 | pk_measware | varchar(20) |  | 计量器具维护 (pd_meastool) |
| 52 | ngrossnum | 毛重主数量 | ngrossnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 53 | ntarenum | 皮重主数量 | ntarenum | decimal(28, 8) |  | 数值 (UFDouble) |
| 54 | ncorrespondnum | 累计出库主数量 | ncorrespondnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 55 | ncorrespondastnum | 累计出库数量 | ncorrespondastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 56 | ncorrespondgrsnum | 累计出库毛重主数量 | ncorrespondgrsnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 57 | cbodytranstypecode | 出入库类型 | cbodytranstypecode | varchar(20) |  | 单据类型 (BilltypeVO) |
| 58 | pk_org | 库存组织 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 59 | pk_org_v | 库存组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 60 | cbodywarehouseid | 库存仓库 | cbodywarehouseid | varchar(20) |  | 仓库 (stordoc) |
| 61 | pk_batchcode | 批次主键 | pk_batchcode | varchar(20) |  | 批次档案 (BatchcodeVO) |
| 62 | ncountnum | 箱数 | ncountnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 63 | nbarcodenum | 条码主数量 | nbarcodenum | decimal(28, 8) |  | 数值 (UFDouble) |
| 64 | vproductbill | 订单号 | vproductbill | varchar(40) |  | 字符串 (String) |
| 65 | vproductbatch | 生产批号 | vproductbatch | varchar(40) |  | 字符串 (String) |
| 66 | cworkcenterid | 工作中心 | cworkcenterid | varchar(20) |  | 工作中心 (bd_wk) |
| 67 | nsignnum | 累计开票主数量 | nsignnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 68 | csrc2billtype | 其他来源单据类型 | csrc2billtype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 69 | csrc2transtype | 其他来源交易类型 | csrc2transtype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 70 | csrc2billhid | 其他来源表头主键 | csrc2billhid | varchar(20) |  | 主键 (UFID) |
| 71 | csrc2billbid | 其他来源表体主键 | csrc2billbid | varchar(20) |  | 主键 (UFID) |
| 72 | vsrc2billcode | 其他来源单据号 | vsrc2billcode | varchar(40) |  | 字符串 (String) |
| 73 | vsrc2billrowno | 其他来源行号 | vsrc2billrowno | varchar(20) |  | 字符串 (String) |
| 74 | bonroadflag | 是否在途 | bonroadflag | char(1) |  | 布尔类型 (UFBoolean) |
| 75 | ccorrespondhid | 对应入库单主键 | ccorrespondhid | char(20) |  | 主键 (UFID) |
| 76 | ccorrespondbid | 对应入库单表体主键 | ccorrespondbid | char(20) |  | 主键 (UFID) |
| 77 | ccorrespondtype | 对应入库单类型 | ccorrespondtype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 78 | ccorrespondtranstype | 对应入库单交易类型 | ccorrespondtranstype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 79 | ccorrespondcode | 对应入库单单据号 | ccorrespondcode | varchar(40) |  | 字符串 (String) |
| 80 | ccorrespondrowno | 对应入库单行号 | ccorrespondrowno | varchar(20) |  | 字符串 (String) |
| 81 | ntotalpicknum | 累计拣配主数量 | ntotalpicknum | decimal(28, 8) |  | 数值 (UFDouble) |
| 82 | vserialcode | 序列号 | vserialcode | varchar(128) |  | 字符串 (String) |
| 83 | pk_serialcode | 序列号主键 | pk_serialcode | varchar(20) |  | 序列号档案 (SerialNoVO) |
| 84 | vbillbarcode | 单据条码 | vbillbarcode | varchar(128) |  | 字符串 (String) |
| 85 | foutputtype | 产品类型 | foutputtype | int |  | 产出类型 (outputtype) |  | 1=主产品; |