# |<<

**采购入财务体 (po_purchaseinfi_b / nc.vo.pu.m4201.entity.PurchaseinFIItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4627.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_stockps_b | 采购入明细 | pk_stockps_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 库存组织 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 4 | pk_org_v | 库存组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 5 | pk_financeorg | 结算财务组织 | pk_financeorg | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 6 | pk_financeorg_v | 结算财务组织版本 | pk_financeorg_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 7 | pk_apfinanceorg | 应付财务组织 | pk_apfinanceorg | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 8 | pk_apfinanceorg_v | 应付财务组织版本 | pk_apfinanceorg_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 9 | pk_costregion | 成本域 | pk_costregion | varchar(20) |  | 组织_成本域 (costregion) |
| 10 | pk_purchaseorg | 采购组织 | pk_purchaseorg | varchar(20) |  | 组织_业务单元_采购组织 (purchaseorg) |
| 11 | pk_purchaseorg_v | 采购组织版本 | pk_purchaseorg_v | varchar(20) |  | 组织_业务单元_采购组织版本信息 (purchaseorg_v) |
| 12 | pk_apliabcenter | 结算利润中心最新版本 | pk_apliabcenter | varchar(20) |  | 利润中心 (profitcenter) |
| 13 | pk_apliabcenter_v | 结算利润中心 | pk_apliabcenter_v | varchar(20) |  | 利润中心版本 (profitcenterVersion) |
| 14 | pk_arrliabcenter | 收货利润中心最新版本 | pk_arrliabcenter | varchar(20) |  | 利润中心 (profitcenter) |
| 15 | pk_arrliabcenter_v | 收货利润中心 | pk_arrliabcenter_v | varchar(20) |  | 利润中心版本 (profitcenterVersion) |
| 16 | pk_srcmaterial | 物料 | pk_srcmaterial | varchar(20) |  | 物料基本信息 (material_v) |
| 17 | pk_material | 物料编码 | pk_material | varchar(20) |  | 物料基本信息（多版本） (material) |
| 18 | pk_batchcode | 批次档案 | pk_batchcode | varchar(20) |  | 主键 (UFID) |
| 19 | vbatchcode | 批次号 | vbatchcode | varchar(40) |  | 字符串 (String) |
| 20 | dbizdate | 业务日期 | dbizdate | char(19) |  | 日期 (UFDate) |
| 21 | castunitid | 单位 | castunitid | varchar(20) |  | 计量单位 (measdoc) |
| 22 | ninnum | 入库主数量 | ninnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 23 | ninassistnum | 实入辅数量 | ninassistnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 24 | blargess | 是否赠品 | blargess | char(1) |  | 布尔类型 (UFBoolean) |
| 25 | cprojectid | 项目 | cprojectid | varchar(20) |  | 项目 (project) |
| 26 | cprojecttaskid | 项目任务 | cprojecttaskid | varchar(20) |  | 项目任务 (WBS) |
| 27 | vchangerate | 换算率 | vchangerate | varchar(60) |  | 字符串 (String) |
| 28 | csourcetypecode | 来源单据类型 | csourcetypecode | varchar(20) |  | 字符串 (String) |
| 29 | vsourcetrantype | 来源交易类型 | vsourcetrantype | varchar(20) |  | 字符串 (String) |
| 30 | csourceid | 来源单据表头 | csourceid | varchar(20) |  | 主键 (UFID) |
| 31 | csourcebid | 来源单据表体 | csourcebid | varchar(20) |  | 主键 (UFID) |
| 32 | vsourcecode | 来源单据号 | vsourcecode | varchar(40) |  | 字符串 (String) |
| 33 | vsourcerowno | 来源单据行号 | vsourcerowno | varchar(20) |  | 字符串 (String) |
| 34 | cfirsttypecode | 源头单据类型 | cfirsttypecode | varchar(20) |  | 字符串 (String) |
| 35 | vfirsttrantype | 源头单据交易类型 | vfirsttrantype | varchar(20) |  | 字符串 (String) |
| 36 | cfirstid | 源头单据表头 | cfirstid | varchar(20) |  | 主键 (UFID) |
| 37 | cfirstbid | 源头单据表体 | cfirstbid | varchar(20) |  | 主键 (UFID) |
| 38 | vfirstcode | 源头单据号 | vfirstcode | varchar(40) |  | 字符串 (String) |
| 39 | vfirstrowno | 源头单据行号 | vfirstrowno | varchar(20) |  | 字符串 (String) |
| 40 | dfirstbilldate | 源头单据制单日期 | dfirstbilldate | varchar(19) |  | 日期 (UFDate) |
| 41 | vnotebody | 行备注 | vnotebody | varchar(181) |  | 字符串 (String) |
| 42 | creceieveid | 收货单位 | creceieveid | varchar(20) |  | 主键 (UFID) |
| 43 | crowno | 行号 | crowno | varchar(20) |  | 字符串 (String) |
| 44 | drequiredate | 需求日期 | drequiredate | varchar(19) |  | 日期 (UFDate) |
| 45 | pk_reqstockorg | 需求库存组织 | pk_reqstockorg | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 46 | pk_reqstockorg_v | 需求库存组织版本 | pk_reqstockorg_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 47 | pk_reqstocdoc | 需求仓库 | pk_reqstocdoc | varchar(20) |  | 仓库 (stordoc) |
| 48 | vordertrantypecode | 订单交易类型 | vordertrantypecode | varchar(50) |  | 字符串 (String) |
| 49 | pk_order | 订单 | pk_order | varchar(20) |  | 主键 (UFID) |
| 50 | pk_order_b | 订单明细 | pk_order_b | varchar(20) |  | 主键 (UFID) |
| 51 | vordercode | 订单号 | vordercode | varchar(50) |  | 字符串 (String) |
| 52 | cproductorid | 生产厂商 | cproductorid | varchar(20) |  | 主键 (UFID) |
| 53 | cstateid | 库存状态 | cstateid | varchar(20) |  | 主键 (UFID) |
| 54 | vctcode | 采购合同号 | vctcode | varchar(50) |  | 字符串 (String) |
| 55 | cunitid | 主单位 | cunitid | varchar(20) |  | 计量单位 (measdoc) |
| 56 | pk_supplier | 供应商 | pk_supplier | varchar(20) |  | 供应商基本信息 (supplier) |
| 57 | pk_vmisupplier | 寄存供应商 | pk_vmisupplier | varchar(20) |  | 供应商基本信息 (supplier) |
| 58 | ncostprice | 单价 | ncostprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 59 | ncostmny | 金额 | ncostmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 60 | nplannedprice | 计划单价 | nplannedprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 61 | nplannedmny | 计划金额 | nplannedmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 62 | cqtunitid | 报价单位 | cqtunitid | varchar(20) |  | 计量单位 (measdoc) |
| 63 | nqtunitnum | 报价数量 | nqtunitnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 64 | vqtunitrate | 报价单位换算率 | vqtunitrate | varchar(60) |  | 字符串 (String) |
| 65 | corigcurrencyid | 原币币种 | corigcurrencyid | varchar(20) |  | 币种 (currtype) |
| 66 | nqtorigprice | 无税单价 | nqtorigprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 67 | nqtorigtaxprice | 含税单价 | nqtorigtaxprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 68 | norigprice | 入库单主无税单价 | norigprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 69 | norigtaxprice | 入库单主含税单价 | norigtaxprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 70 | nqtorignetprice | 无税净价 | nqtorignetprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 71 | nqtorigtaxnetprice | 含税净价 | nqtorigtaxnetprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 72 | norignetprice | 主无税净价 | norignetprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 73 | norigtaxnetprice | 主含税净价 | norigtaxnetprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 74 | ntaxrate | 入库单税率 | ntaxrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 75 | ftaxtypeflag | 入库单扣税类别 | ftaxtypeflag | int |  | 扣税类别 (taxtype) |  | 1=应税外加; |