# |<<

**供应商供货目录 (vrm_vendormater / nc.vo.scmbd.vrm.vm.entity.VendorMaterBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6315.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_vendorstock | 供应商物料关系主键 | pk_vendorstock | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 采购组织版本信息 | pk_org | varchar(20) |  | 组织_业务单元_采购组织 (purchaseorg) |
| 4 | pk_org_v | 采购组织 | pk_org_v | varchar(20) |  | 组织_业务单元_采购组织版本信息 (purchaseorg_v) |
| 5 | pk_material | 物料版本信息 | pk_material | varchar(20) |  | 物料基本信息（多版本） (material) |
| 6 | pk_srcmaterial | 物料信息 | pk_srcmaterial | varchar(20) |  | 物料基本信息 (material_v) |
| 7 | pk_supplier | 供应商 | pk_supplier | varchar(20) |  | 供应商基本信息 (supplier) |
| 8 | bmainvendor | 是否主供应商 | bmainvendor | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | bnocheck | 是否免检 | bnocheck | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | bfrozen | 是否冻结 | bfrozen | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | cqualitylevelid | 质量等级 | cqualitylevelid | varchar(20) |  | 质量等级 (scm_qualitylevel_b) |
| 12 | npriority | 优先级 | npriority | int |  | 整数 (Integer) |
| 13 | iconsignadvance | 发货提前期 | iconsignadvance | int |  | 整数 (Integer) |
| 14 | iloadadvance | 装运提前期 | iloadadvance | int |  | 整数 (Integer) |
| 15 | iappcustomadvance | 报关提前期 | iappcustomadvance | int |  | 整数 (Integer) |
| 16 | ioutcustomadvance | 出关提前期 | ioutcustomadvance | int |  | 整数 (Integer) |
| 17 | nminiordernum | 最小订货量 | nminiordernum | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | norderbatchnum | 订货批量 | norderbatchnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | nquota | 供货配额 | nquota | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | nbatchnum | 批量能力 | nbatchnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | vvendinventorycode | 对应物料编码 | vvendinventorycode | varchar(30) |  | 字符串 (String) |
| 22 | vvendinventoryname | 对应物料名称 | vvendinventoryname | varchar(60) |  | 字符串 (String) |
| 23 | nquotabase | 配额基数 | nquotabase | decimal(28, 8) |  | 数值 (UFDouble) |
| 24 | pk_marbasclass | 物料基本分类 | pk_marbasclass | varchar(20) |  | 物料基本分类 (marbasclass) |
| 25 | deligeffectday | 合格有效期至 | deligeffectday | char(19) |  | 日期(结束) (UFDateEnd) |
| 26 | feffectrange | 生效范围 | feffectrange | int |  | 生效范围 (enum) |  | 0=供应链; |