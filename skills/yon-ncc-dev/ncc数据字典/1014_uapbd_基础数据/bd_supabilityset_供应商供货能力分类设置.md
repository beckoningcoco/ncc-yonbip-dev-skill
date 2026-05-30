# |<<

**供应商供货能力分类设置 (bd_supabilityset / nc.vo.bd.supplier.supplyabilityset.SupplyabilitysetVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/970.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_supabilityset | 主表主键 | pk_supabilityset | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 3 | pk_supabclass | 供货能力分类 | pk_supabclass | varchar(20) |  | 供货能力分类 (supply_ability_class) |
| 4 | pk_supplyname | 供应商编码 | pk_supplyname | varchar(20) |  | 供应商基本信息 (supplier) |
| 5 | pk_supgradesys | 供应商等级 | pk_supgradesys | varchar(20) |  | 等级信息 (supplier_grade) |
| 6 | modifiedtype | 变更来源 | modifiedtype | varchar(50) |  | 变更来源 (enum) |  | 1=评估报告; |