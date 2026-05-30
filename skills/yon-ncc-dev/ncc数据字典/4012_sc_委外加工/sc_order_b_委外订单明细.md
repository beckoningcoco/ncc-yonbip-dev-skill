# |<<

**委外订单明细 (sc_order_b / nc.vo.sc.m61.entity.SCOrderItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5026.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_order_b | 委外订单明细 | pk_order_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 采购组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_采购组织 (purchaseorg) |
| 4 | pk_org_v | 采购组织 | pk_org_v | varchar(20) |  | 组织_业务单元_采购组织版本信息 (purchaseorg_v) |
| 5 | crowno | 行号 | crowno | varchar(20) |  | 字符串 (String) |
| 6 | pk_material | 加工品编码 | pk_material | varchar(20) |  | 物料基本信息（多版本） (material) |
| 7 | pk_srcmaterial | 加工品最新版本 | pk_srcmaterial | varchar(20) |  | 物料基本信息 (material_v) |
| 8 | cunitid | 主单位 | cunitid | varchar(20) |  | 计量单位 (measdoc) |
| 9 | nnum | 主数量 | nnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | cqtunitid | 单位 | cqtunitid | varchar(20) |  | 计量单位 (measdoc) |
| 11 | nqtunitnum | 数量 | nqtunitnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | nqtunitrate | 换算率 | nqtunitrate | varchar(60) |  | 字符串 (String) |
| 13 | nqtorigprice | 无税单价 | nqtorigprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | nqtorigtaxprice | 含税单价 | nqtorigtaxprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | nqtorignetprice | 无税净价 | nqtorignetprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | nqtorigtaxnetprc | 含税净价 | nqtorigtaxnetprc | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | nqtprice | 本币无税单价 | nqtprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | nqttaxprice | 本币含税单价 | nqttaxprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | nqtnetprice | 本币无税净价 | nqtnetprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | nqttaxnetprice | 本币含税净价 | nqttaxnetprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | nitemdiscountrate | 折扣率 | nitemdiscountrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 22 | norigmny | 无税金额 | norigmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 23 | norigtaxmny | 价税合计 | norigtaxmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 24 | norigtax | 原币税额 | norigtax | decimal(28, 8) |  | 数值 (UFDouble) |
| 25 | ntaxrate | 税率 | ntaxrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 26 | nmny | 本币无税金额 | nmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 27 | ntaxmny | 本币价税合计 | ntaxmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 28 | ntax | 税额 | ntax | decimal(28, 8) |  | 数值 (UFDouble) |
| 29 | norigprice | 主无税单价 | norigprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 30 | norigtaxprice | 主含税单价 | norigtaxprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 31 | norignetprice | 主无税净价 | norignetprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 32 | norigtaxnetprice | 主含税净价 | norigtaxnetprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 33 | nnetprice | 主本币无税净价 | nnetprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 34 | ntaxnetprice | 主本币含税净价 | ntaxnetprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 35 | nprice | 主本币无税单价 | nprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 36 | ntaxprice | 主本币含税单价 | ntaxprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 37 | naccumarrvnum | 累计到货主数量 | naccumarrvnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 38 | nbackarrvnum | 累计退货主数量 | nbackarrvnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 39 | naccumwastnum | 累计途耗主数量 | naccumwastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 40 | naccumstorenum | 累计入库主数量 | naccumstorenum | decimal(28, 8) |  | 数值 (UFDouble) |
| 41 | nbackstorenum | 累计退库主数量 | nbackstorenum | decimal(28, 8) |  | 数值 (UFDouble) |
| 42 | naccuminvoicenum | 累计开票主数量 | naccuminvoicenum | decimal(28, 8) |  | 数值 (UFDouble) |
| 43 | dplanarrvdate | 计划到货日期 | dplanarrvdate | char(19) |  | 日期(结束) (UFDateEnd) |
| 44 | pk_recvstordoc | 收货仓库 | pk_recvstordoc | varchar(20) |  | 仓库 (stordoc) |
| 45 | pk_receiveaddress | 收货地址 | pk_receiveaddress | varchar(20) |  | 客户收货地址 (custaddress) |
| 46 | vbmemo | 备注 | vbmemo | varchar(181) |  | 字符串 (String) |
| 47 | pk_batchcode | 批次号主键 | pk_batchcode | varchar(20) |  | 批次档案 (BatchcodeVO) |
| 48 | vbatchcode | 批次号 | vbatchcode | varchar(40) |  | 字符串 (String) |
| 49 | pk_ct_pu | 采购合同 | pk_ct_pu | varchar(20) |  | 采购合同 (ct_pu) |
| 50 | pk_ct_pu_b | 采购合同表体主键 | pk_ct_pu_b | varchar(50) |  | 字符串 (String) |
| 51 | ctvbillcode | 合同号 | ctvbillcode | varchar(40) |  | 字符串 (String) |
| 52 | pk_priceaudit | 价格审批单主键 | pk_priceaudit | varchar(20) |  | 价格审批单 (purp_priceaudit) |
| 53 | pk_priceaudit_b | 价格审批单表体主键 | pk_priceaudit_b | varchar(20) |  | 字符串 (String) |
| 54 | vfirsttype | 源头单据类型 | vfirsttype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 55 | vfirsttrantype | 源头交易类型 | vfirsttrantype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 56 | vfirstcode | 源头单据号 | vfirstcode | varchar(40) |  | 字符串 (String) |
| 57 | vfirstrowno | 源头单据行号 | vfirstrowno | varchar(20) |  | 字符串 (String) |
| 58 | cfirstid | 源头单据主表主键 | cfirstid | varchar(20) |  | 字符串 (String) |
| 59 | cfirstbid | 源头单据表体主键 | cfirstbid | varchar(20) |  | 字符串 (String) |
| 60 | vsrctype | 来源单据类型 | vsrctype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 61 | vsrctrantype | 来源交易类型 | vsrctrantype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 62 | vsrccode | 来源单据号 | vsrccode | varchar(40) |  | 字符串 (String) |
| 63 | vsrcrowno | 来源单据行号 | vsrcrowno | varchar(20) |  | 字符串 (String) |
| 64 | csrcid | 来源单据主表主键 | csrcid | varchar(20) |  | 字符串 (String) |
| 65 | csrcbid | 来源单据表体主键 | csrcbid | varchar(20) |  | 字符串 (String) |
| 66 | bclose | 关闭 | bclose | char(1) |  | 布尔类型 (UFBoolean) |
| 67 | closer | 关闭人 | closer | varchar(20) |  | 用户 (user) |
| 68 | closereason | 关闭原因 | closereason | varchar(181) |  | 字符串 (String) |
| 69 | closetime | 关闭时间 | closetime | varchar(19) |  | 日期时间 (UFDateTime) |
| 70 | ftaxtypeflag | 扣税类别 | ftaxtypeflag | int |  | 扣税类别 (taxtype) |  | 1=应税外加; |