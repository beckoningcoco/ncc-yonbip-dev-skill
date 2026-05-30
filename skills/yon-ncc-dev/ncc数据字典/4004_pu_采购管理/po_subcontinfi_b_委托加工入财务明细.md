# |<<

**委托加工入财务明细 (po_subcontinfi_b / nc.vo.pu.m4203.entity.SubcontinFIItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4639.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_stockps_b | 委托加工入明细主键 | pk_stockps_b | char(20) | √ | 主键 (UFID) |
| 2 | crowno | 行号 | crowno | varchar(20) |  | 字符串 (String) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 库存组织 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 5 | pk_org_v | 库存组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 6 | pk_financeorg | 结算财务组织 | pk_financeorg | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 7 | pk_financeorg_v | 结算财务组织版本 | pk_financeorg_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 8 | pk_corp | 公司最新版本 | pk_corp | varchar(20) |  | 组织_业务单元_公司 (corp) |
| 9 | pk_corp_v | 公司 | pk_corp_v | varchar(20) |  | 组织_业务单元_公司版本信息 (corp_v) |
| 10 | pk_apfinanceorg | 应付财务组织 | pk_apfinanceorg | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 11 | pk_apfinanceorg_v | 应付财务组织版本 | pk_apfinanceorg_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 12 | pk_costregion | 成本域 | pk_costregion | varchar(20) |  | 组织_成本域 (costregion) |
| 13 | pk_purchaseorg | 采购组织 | pk_purchaseorg | varchar(20) |  | 组织_业务单元_采购组织 (purchaseorg) |
| 14 | pk_purchaseorg_v | 采购组织版本 | pk_purchaseorg_v | varchar(20) |  | 组织_业务单元_采购组织版本信息 (purchaseorg_v) |
| 15 | pk_apliabcenter | 利润中心 | pk_apliabcenter | varchar(20) |  | 利润中心 (profitcenter) |
| 16 | pk_apliabcenter_v | 利润中心版本 | pk_apliabcenter_v | varchar(20) |  | 利润中心版本 (profitcenterVersion) |
| 17 | pk_srcmaterial | 物料 | pk_srcmaterial | varchar(20) |  | 物料基本信息 (material_v) |
| 18 | pk_material | 物料编码 | pk_material | varchar(20) |  | 物料基本信息（多版本） (material) |
| 19 | pk_batchcode | 批次档案 | pk_batchcode | varchar(20) |  | 主键 (UFID) |
| 20 | vbatchcode | 批次号 | vbatchcode | varchar(40) |  | 字符串 (String) |
| 21 | dbizdate | 业务日期 | dbizdate | char(19) |  | 日期 (UFDate) |
| 22 | dtocostapdate | 暂估日期 | dtocostapdate | char(19) |  | 日期时间 (UFDateTime) |
| 23 | castunitid | 单位 | castunitid | varchar(20) |  | 计量单位 (measdoc) |
| 24 | ninnum | 入库主数量 | ninnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 25 | ninassistnum | 实入辅数量 | ninassistnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 26 | cprojectid | 项目 | cprojectid | varchar(20) |  | 项目 (project) |
| 27 | vchangerate | 换算率 | vchangerate | varchar(60) |  | 字符串 (String) |
| 28 | csourcetypecode | 来源单据类型 | csourcetypecode | varchar(20) |  | 字符串 (String) |
| 29 | vsourcetrantype | 来源交易类型 | vsourcetrantype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 30 | csourceid | 来源单据表头 | csourceid | varchar(20) |  | 字符串 (String) |
| 31 | csourcebid | 来源单据表体 | csourcebid | varchar(20) |  | 字符串 (String) |
| 32 | vsourcecode | 来源单据号 | vsourcecode | varchar(40) |  | 字符串 (String) |
| 33 | vsourcerowno | 来源单据行号 | vsourcerowno | varchar(20) |  | 字符串 (String) |
| 34 | cfirsttypecode | 源头单据类型 | cfirsttypecode | varchar(20) |  | 字符串 (String) |
| 35 | vfirsttrantype | 源头单据交易类型 | vfirsttrantype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 36 | cfirstid | 源头单据表头 | cfirstid | varchar(20) |  | 字符串 (String) |
| 37 | cfirstbid | 源头单据表体 | cfirstbid | varchar(20) |  | 字符串 (String) |
| 38 | vfirstcode | 源头单据号 | vfirstcode | varchar(40) |  | 字符串 (String) |
| 39 | vfirstrowno | 源头单据行号 | vfirstrowno | varchar(20) |  | 字符串 (String) |
| 40 | dfirstbilldate | 源头单据制单日期 | dfirstbilldate | varchar(19) |  | 字符串 (String) |
| 41 | vnotebody | 行备注 | vnotebody | varchar(181) |  | 字符串 (String) |
| 42 | vordertrantypecode | 订单交易类型 | vordertrantypecode | varchar(50) |  | 字符串 (String) |
| 43 | pk_order | 订单 | pk_order | varchar(20) |  | 字符串 (String) |
| 44 | pk_order_b | 订单明细 | pk_order_b | varchar(20) |  | 字符串 (String) |
| 45 | vordercode | 订单号 | vordercode | varchar(50) |  | 字符串 (String) |
| 46 | cproductorid | 生产厂商 | cproductorid | varchar(20) |  | 字符串 (String) |
| 47 | cstateid | 库存状态 | cstateid | varchar(20) |  | 字符串 (String) |
| 48 | cqualitylevelid | 质量等级 | cqualitylevelid | varchar(20) |  | 质量等级 (scm_qualitylevel_b) |
| 49 | pk_supplier | 供应商 | pk_supplier | varchar(20) |  | 供应商基本信息 (supplier) |
| 50 | vctcode | 采购合同号 | vctcode | varchar(50) |  | 字符串 (String) |
| 51 | cunitid | 主单位 | cunitid | varchar(20) |  | 计量单位 (measdoc) |
| 52 | ncostprice | 单价 | ncostprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 53 | ncostmny | 金额 | ncostmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 54 | nplannedprice | 计划单价 | nplannedprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 55 | nplannedmny | 计划金额 | nplannedmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 56 | ccurrencyid | 本位币 | ccurrencyid | varchar(20) |  | 字符串 (String) |
| 57 | vproductbillcode | 生产订单号 | vproductbillcode | varchar(40) |  | 字符串 (String) |
| 58 | vproductbatch | 生产批号 | vproductbatch | varchar(40) |  | 字符串 (String) |
| 59 | cworkcenterid | 工作中心 | cworkcenterid | varchar(20) |  | 工作中心 (bd_wk) |
| 60 | ftoiaflag | 传成本标志 | ftoiaflag | int |  | 传成本标志 (传成本标志) | 0 | 0=未传成本; |