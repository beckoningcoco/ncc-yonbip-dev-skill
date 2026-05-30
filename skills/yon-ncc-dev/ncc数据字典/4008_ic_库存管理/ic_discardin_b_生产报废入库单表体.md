# |<<

**生产报废入库单表体 (ic_discardin_b / nc.vo.ic.m4x.entity.DiscardInBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2894.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cgeneralbid | 生产报废入库单表体主键 | cgeneralbid | char(20) | √ | 主键 (UFID) |
| 2 | crowno | 行号 | crowno | varchar(20) |  | 字符串 (String) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | corpoid | 公司最新版本 | corpoid | varchar(20) |  | 组织_业务单元_公司 (corp) |
| 5 | corpvid | 公司 | corpvid | varchar(20) |  | 组织_业务单元_公司版本信息 (corp_v) |
| 6 | cmaterialoid | 物料 | cmaterialoid | varchar(20) | √ | 物料基本信息 (material_v) |
| 7 | cmaterialvid | 物料编码 | cmaterialvid | varchar(20) | √ | 物料基本信息（多版本） (material) |
| 8 | cunitid | 主单位 | cunitid | varchar(20) |  | 计量单位 (measdoc) |
| 9 | castunitid | 单位 | castunitid | varchar(20) |  | 计量单位 (measdoc) |
| 10 | vchangerate | 换算率 | vchangerate | varchar(60) |  | 字符串 (String) |
| 11 | cstateid | 库存状态 | cstateid | varchar(20) |  | 库存状态 (ic_storestate) |
| 12 | cproductorid | 生产厂商 | cproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 13 | vbatchcode | 批次号 | vbatchcode | varchar(40) |  | 字符串 (String) |
| 14 | pk_batchcode | 批次主键 | pk_batchcode | varchar(20) |  | 批次档案 (BatchcodeVO) |
| 15 | cqualitylevelid | 质量等级 | cqualitylevelid | varchar(20) |  | 质量等级 (scm_qualitylevel_b) |
| 16 | dproducedate | 生产日期 | dproducedate | varchar(19) |  | 日期 (UFDate) |
| 17 | dvalidate | 失效日期 | dvalidate | varchar(19) |  | 日期 (UFDate) |
| 18 | vvendbatchcode | 供应商批次 | vvendbatchcode | varchar(20) |  | 字符串 (String) |
| 19 | nshouldnum | 应收主数量 | nshouldnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | nshouldassistnum | 应收数量 | nshouldassistnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | nnum | 实收主数量 | nnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 22 | nassistnum | 实收数量 | nassistnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 23 | ncostprice | 单价 | ncostprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 24 | ncostmny | 金额 | ncostmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 25 | dbizdate | 入库日期 | dbizdate | varchar(19) |  | 日期 (UFDate) |
| 26 | vproductbatch | 生产订单号 | vproductbatch | varchar(40) |  | 主键 (UFID) |
| 27 | clocationid | 货位 | clocationid | varchar(20) |  | 货位 (rack) |
| 28 | cvendorid | 供应商 | cvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 29 | cprojectid | 项目 | cprojectid | varchar(20) |  | 项目 (project) |
| 30 | casscustid | 客户 | casscustid | varchar(20) |  | 客户基本信息 (customer) |
| 31 | nweight | 重量 | nweight | decimal(28, 8) |  | 数值 (UFDouble) |
| 32 | nvolume | 体积 | nvolume | decimal(28, 8) |  | 数值 (UFDouble) |
| 33 | npiece | 件数 | npiece | decimal(28, 8) |  | 数值 (UFDouble) |
| 34 | csourcebillhid | 来源单据表头主键 | csourcebillhid | varchar(20) |  | 主键 (UFID) |
| 35 | csourcebillbid | 来源单据表体主键 | csourcebillbid | varchar(20) |  | 主键 (UFID) |
| 36 | csourcetype | 来源单据类型 | csourcetype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 37 | csourcetranstype | 来源单据交易类型 | csourcetranstype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 38 | vsourcebillcode | 来源单据号 | vsourcebillcode | varchar(40) |  | 字符串 (String) |
| 39 | vsourcerowno | 来源单据行号 | vsourcerowno | varchar(20) |  | 字符串 (String) |
| 40 | cfirstbillhid | 源头单据表头主键 | cfirstbillhid | varchar(20) |  | 主键 (UFID) |
| 41 | cfirstbillbid | 源头单据表体主键 | cfirstbillbid | varchar(20) |  | 主键 (UFID) |
| 42 | cfirsttype | 源头单据类型 | cfirsttype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 43 | cfirsttranstype | 源头单据交易类型 | cfirsttranstype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 44 | vfirstbillcode | 源头单据号 | vfirstbillcode | varchar(40) |  | 字符串 (String) |
| 45 | cfirstrowno | 源头单据行号 | cfirstrowno | varchar(20) |  | 字符串 (String) |
| 46 | cworkcenterid | 工作中心主键 | cworkcenterid | varchar(20) |  | 工作中心 (bd_wk) |
| 47 | cwp | 加工工序 | cwp | varchar(20) |  | 字符串 (String) |
| 48 | ccheckstateid | 质检状态 | ccheckstateid | varchar(20) |  | 主键 (UFID) |
| 49 | ngrossnum | 毛重主数量 | ngrossnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 50 | ntarenum | 皮重主数量 | ntarenum | decimal(28, 8) |  | 数值 (UFDouble) |
| 51 | pk_org | 库存组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 52 | pk_org_v | 库存组织 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 53 | vnotebody | 行备注 | vnotebody | varchar(181) |  | 字符串 (String) |
| 54 | vbatchcodenote | 批次档案备注 | vbatchcodenote | varchar(50) |  | 字符串 (String) |
| 55 | tchecktime | 检验时间 | tchecktime | char(19) |  | 日期时间 (UFDateTime) |
| 56 | tbcts | 批次形成时间 | tbcts | char(19) |  | 日期时间 (UFDateTime) |
| 57 | ccorrespondbid | 对应入库单表体主键 | ccorrespondbid | varchar(20) |  | 主键 (UFID) |
| 58 | ccorrespondhid | 对应入库单主键 | ccorrespondhid | varchar(20) |  | 主键 (UFID) |
| 59 | ccorrespondtype | 对应入库单类型 | ccorrespondtype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 60 | ccorrespondtranstype | 对应入库单交易类型 | ccorrespondtranstype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 61 | ccorrespondcode | 对应入库单单据号 | ccorrespondcode | varchar(40) |  | 字符串 (String) |
| 62 | ccorrespondrowno | 对应入库单行号 | ccorrespondrowno | varchar(20) |  | 字符串 (String) |
| 63 | csrc2billtype | 其他来源单据类型编码 | csrc2billtype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 64 | csrc2billbid | 其它来源单据表体主键 | csrc2billbid | varchar(20) |  | 主键 (UFID) |
| 65 | csrc2billhid | 其它来源单据主键 | csrc2billhid | varchar(20) |  | 主键 (UFID) |
| 66 | csrc2transtype | 其它来源交易类型 | csrc2transtype | varchar(20) |  | 字符串 (String) |
| 67 | vsrc2billcode | 其它来源单据号 | vsrc2billcode | varchar(40) |  | 字符串 (String) |
| 68 | vsrc2billrowno | 其它来源单据行号 | vsrc2billrowno | varchar(20) |  | 字符串 (String) |
| 69 | cproductid | 主产品 | cproductid | varchar(20) |  | 物料基本信息 (material_v) |
| 70 | fproductclass | 产品类型 | fproductclass | int |  | 产出类型 (outputtype) |  | 1=主产品; |