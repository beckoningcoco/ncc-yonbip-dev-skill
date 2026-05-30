# |<<

**供应商价目表 (purp_supplierprice / nc.vo.pp.supplierprice.entity.SupplierPriceVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4815.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_supplierprice | 供应商价目表 | pk_supplierprice | char(20) | √ | 主键 (UFID) |
| 2 | crowno | 行号 | crowno | varchar(20) |  | 字符串 (String) |
| 3 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 采购组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_采购组织 (purchaseorg) |
| 5 | pk_org_v | 采购组织 | pk_org_v | varchar(20) |  | 组织_业务单元_采购组织版本信息 (purchaseorg_v) |
| 6 | pk_bizpsn | 采购员 | pk_bizpsn | varchar(20) |  | 人员基本信息 (psndoc) |
| 7 | pk_dept | 采购部门最新版本 | pk_dept | varchar(20) |  | 组织_部门 (dept) |
| 8 | pk_dept_v | 采购部门 | pk_dept_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 9 | corigcurrencyid | 币种 | corigcurrencyid | varchar(20) |  | 币种 (currtype) |
| 10 | bsc | 委外 | bsc | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | bcanorder | 可否订货 | bcanorder | char(1) |  | 布尔类型 (UFBoolean) |
| 12 | pk_srcmaterial | 物料最新版本 | pk_srcmaterial | varchar(20) |  | 物料基本信息 (material_v) |
| 13 | pk_material | 物料 | pk_material | varchar(20) |  | 物料基本信息（多版本） (material) |
| 14 | cproductorid | 生产厂商 | cproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 15 | cqualitylevelid | 质量等级 | cqualitylevelid | varchar(20) |  | 质量等级 (scm_qualitylevel_b) |
| 16 | cdevareaid | 收货地区 | cdevareaid | varchar(20) |  | 地区分类 (areaclass) |
| 17 | pk_transporttype | 运输方式 | pk_transporttype | varchar(20) |  | 运输方式 (transporttype) |
| 18 | cunitid | 主单位 | cunitid | varchar(20) |  | 计量单位 (measdoc) |
| 19 | nnum | 主数量 | nnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | norigtaxprice | 主含税单价 | norigtaxprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | norigprice | 主无税单价 | norigprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 22 | vchangerate | 换算率 | vchangerate | varchar(60) |  | 字符串 (String) |
| 23 | castunitid | 单位 | castunitid | varchar(20) |  | 计量单位 (measdoc) |
| 24 | nastnum | 数量 | nastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 25 | nastorigtaxprice | 含税单价 | nastorigtaxprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 26 | nastorigprice | 无税单价 | nastorigprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 27 | ntransportmny | 运杂费 | ntransportmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 28 | ninsurance | 保险费 | ninsurance | decimal(28, 8) |  | 数值 (UFDouble) |
| 29 | nimpost | 关税 | nimpost | decimal(28, 8) |  | 数值 (UFDouble) |
| 30 | pk_supplier | 供应商 | pk_supplier | varchar(20) |  | 供应商基本信息 (supplier) |
| 31 | ftaxtypeflag | 扣税类别 | ftaxtypeflag | int |  | 扣税类别 (taxtype) |  | 1=应税外加; |