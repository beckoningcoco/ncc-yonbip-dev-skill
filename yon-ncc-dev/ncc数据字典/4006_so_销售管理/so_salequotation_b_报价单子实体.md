# |<<

**报价单子实体 (so_salequotation_b / nc.vo.so.salequotation.entity.SalequotationBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5438.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_salequotation_b | 销售报价单子实体 | pk_salequotation_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org_v | 销售组织版本信息 | pk_org_v | varchar(20) |  | 组织_业务单元_销售组织版本信息 (salesorg_v) |
| 4 | pk_org | 销售组织 | pk_org | varchar(20) |  | 组织_业务单元_销售组织 (salesorg) |
| 5 | crowno | 行号 | crowno | varchar(20) |  | 字符串 (String) |
| 6 | ccustmaterialid | 客户物料码 | ccustmaterialid | varchar(20) |  | 客户物料码 (custmaterial) |
| 7 | pk_material_v | 物料编码 | pk_material_v | varchar(20) |  | 物料基本信息（多版本） (material) |
| 8 | pk_material | 物料最新版本 | pk_material | varchar(20) |  | 物料基本信息 (material_v) |
| 9 | pk_qualitylevel | 质量等级 | pk_qualitylevel | varchar(20) |  | 质量等级 (scm_qualitylevel_b) |
| 10 | pk_project | 项目 | pk_project | varchar(20) |  | 项目 (project) |
| 11 | pk_productor | 生产厂商 | pk_productor | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 12 | pk_supplier | 供应商 | pk_supplier | varchar(20) |  | 供应商基本信息 (supplier) |
| 13 | castunitid | 单位 | castunitid | varchar(20) |  | 计量单位 (measdoc) |
| 14 | nassistnum | 数量 | nassistnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | nchangerate | 换算率 | nchangerate | varchar(60) |  | 字符串 (String) |
| 16 | pk_unit | 主单位 | pk_unit | varchar(20) |  | 计量单位 (measdoc) |
| 17 | nnum | 主数量 | nnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | cqtunitid | 报价单位 | cqtunitid | varchar(20) |  | 计量单位 (measdoc) |
| 19 | nqtnum | 报价数量 | nqtnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | nqtchangerate | 报价换算率 | nqtchangerate | varchar(60) |  | 字符串 (String) |
| 21 | pk_areacl | 收货地区 | pk_areacl | varchar(20) |  | 地区分类 (areaclass) |
| 22 | nqtorigprice | 无税单价 | nqtorigprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 23 | ctaxcodeid | 税码 | ctaxcodeid | varchar(20) |  | 增值税税码税率 (taxcode) |
| 24 | ntaxrate | 税率(%) | ntaxrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 25 | ftaxtypeflag | 扣税类别 | ftaxtypeflag | int |  | 扣税类别 (taxtype) |  | 1=应税外加; |