# |<<

**价格结算单子表 (po_pricesettle_b / nc.vo.pu.m24.entity.PricestlItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4624.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pricesettle_b | 价格结算单子表 | pk_pricesettle_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 采购组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_采购组织 (purchaseorg) |
| 4 | pk_org_v | 采购组织 | pk_org_v | varchar(20) |  | 组织_业务单元_采购组织版本信息 (purchaseorg_v) |
| 5 | crowno | 行号 | crowno | varchar(50) |  | 字符串 (String) |
| 6 | pk_material | 物料编码 | pk_material | varchar(20) |  | 物料基本信息（多版本） (material) |
| 7 | pk_srcmaterial | 物料最新版本 | pk_srcmaterial | varchar(20) |  | 物料基本信息 (material_v) |
| 8 | pk_batchcode | 批次号档案 | pk_batchcode | varchar(20) |  | 主键 (UFID) |
| 9 | vbatchcode | 批次号 | vbatchcode | varchar(40) |  | 字符串 (String) |
| 10 | castunitid | 单位 | castunitid | varchar(20) |  | 计量单位 (measdoc) |
| 11 | vchangerate | 换算率 | vchangerate | varchar(60) |  | 字符串 (String) |
| 12 | cunitid | 主单位 | cunitid | varchar(20) |  | 计量单位 (measdoc) |
| 13 | nastarrvnum | 到货数量 | nastarrvnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | narrvnum | 到货主数量 | narrvnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | nastshouldinnum | 质检后数量 | nastshouldinnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | nshouldinnum | 质检后主数量 | nshouldinnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | nastinnum | 优质优价扣吨后数量 | nastinnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | ninnum | 优质优价扣吨后主数量 | ninnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | ftaxtypeflag | 扣税类别 | ftaxtypeflag | int |  | 扣税类别 (taxtype) |  | 1=应税外加; |