# |<<

**合同基本 (fct_ap_b / nc.vo.fct.ap.entity.CtApBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2166.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_fct_ap_b | 合同基本主键 | pk_fct_ap_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 3 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 4 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | pk_srcmaterial | 物料最新版本 | pk_srcmaterial | varchar(20) |  | 物料基本信息 (material_v) |
| 6 | pk_material | 物料编码 | pk_material | varchar(20) |  | 物料基本信息（多版本） (material) |
| 7 | pk_marbasclass | 物料分类编码 | pk_marbasclass | varchar(20) |  | 物料基本分类 (marbasclass) |
| 8 | crowno | 行号 | crowno | varchar(20) |  | 字符串 (String) |
| 9 | csrcbbid | 来源单据子子表主键 | csrcbbid | varchar(20) |  | 主键 (UFID) |
| 10 | csrcbid | 来源单据子表行主键 | csrcbid | varchar(20) |  | 主键 (UFID) |
| 11 | csrcid | 来源单据主表主键 | csrcid | varchar(20) |  | 主键 (UFID) |
| 12 | vsrcrowno | 来源单据行号 | vsrcrowno | varchar(20) |  | 字符串 (String) |
| 13 | vsrctype | 来源单据类型 | vsrctype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 14 | vrstrantypecode | 来源单据交易类型 | vrstrantypecode | varchar(20) |  | 单据类型 (BilltypeVO) |
| 15 | vsrccode | 来源单据号 | vsrccode | varchar(40) |  | 字符串 (String) |
| 16 | castunitid | 单位 | castunitid | varchar(20) |  | 计量单位 (measdoc) |
| 17 | nastnum | 数量 | nastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | vchangerate | 换算率 | vchangerate | varchar(60) |  | 字符串 (String) |
| 19 | cunitid | 主单位 | cunitid | varchar(20) |  | 计量单位 (measdoc) |
| 20 | nnum | 主数量 | nnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | ntaxrate | 税率 | ntaxrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 22 | cproductorid | 生产厂商 | cproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 23 | cqualitylevelid | 质量等级 | cqualitylevelid | varchar(20) |  | 质量等级 (scm_qualitylevel_b) |
| 24 | ctranspmodeid | 运输方式 | ctranspmodeid | varchar(20) |  | 运输方式 (transporttype) |
| 25 | delivdate | 计划收发货日期 | delivdate | varchar(19) |  | 日期 (UFDate) |
| 26 | vmemo | 备注 | vmemo | varchar(181) |  | 字符串 (String) |
| 27 | pk_receiveaddress | 收货地址 | pk_receiveaddress | varchar(20) |  | 地址簿 (address) |
| 28 | cdevareaid | 收货地区 | cdevareaid | varchar(20) |  | 地区分类 (areaclass) |
| 29 | cdevaddrid | 收货地点 | cdevaddrid | varchar(20) |  | 地点档案 (addressdoc) |
| 30 | pk_arrvstoorg | 收货单位 | pk_arrvstoorg | varchar(20) |  | 客户基本信息 (customer) |
| 31 | pk_arrvstoorg_v | 收货组织版本 | pk_arrvstoorg_v | varchar(20) |  | 主键 (UFID) |
| 32 | pk_financeorg | 财务组织冗余 | pk_financeorg | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 33 | pk_financeorg_v | 财务组织版本冗余 | pk_financeorg_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 34 | norigtaxprice | 主含税单价 | norigtaxprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 35 | norigprice | 主无税单价 | norigprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 36 | ngprice | 主本币无税单价 | ngprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 37 | ngtaxprice | 主本币含税单价 | ngtaxprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 38 | nqtunitnum | 报价数量 | nqtunitnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 39 | cqtunitid | 报价单位 | cqtunitid | varchar(20) |  | 计量单位 (measdoc) |
| 40 | vqtunitrate | 报价换算率 | vqtunitrate | varchar(60) |  | 字符串 (String) |
| 41 | nqtorigprice | 报价无税单价 | nqtorigprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 42 | nqtorigtaxprice | 报价含税单价 | nqtorigtaxprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 43 | nqtprice | 报价本币无税单价 | nqtprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 44 | nqttaxprice | 报价本币含税单价 | nqttaxprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 45 | norigmny | 无税金额 | norigmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 46 | norigtaxmny | 原币价税合计 | norigtaxmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 47 | ntaxmny | 本币价税合计 | ntaxmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 48 | norigtax | 原币税额 | norigtax | decimal(28, 8) |  | 数值 (UFDouble) |
| 49 | nmny | 本币无税金额 | nmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 50 | ntax | 税额 | ntax | decimal(28, 8) |  | 数值 (UFDouble) |
| 51 | noritotalgpmny | 累计原币付款金额 | noritotalgpmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 52 | ntotalgpmny | 累计本币付款金额 | ntotalgpmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 53 | nglobalmny | 全局本币无税金额 | nglobalmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 54 | nglobaltaxmny | 全局本币价税合计 | nglobaltaxmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 55 | ngroupmny | 集团本币无税金额 | ngroupmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 56 | ngrouptaxmny | 集团本币价税合计 | ngrouptaxmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 57 | nordnum | 累计订单主数量 | nordnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 58 | nordsum | 累计订单价税合计 | nordsum | decimal(28, 8) |  | 数值 (UFDouble) |
| 59 | noricopegpmny | 累计原币应付金额 | noricopegpmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 60 | ncopegpmny | 累计本币应付金额 | ncopegpmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 61 | ftaxtypeflag | 扣税类别 | ftaxtypeflag | int |  | 扣税类别 (taxtype) |  | 1=应税外加; |