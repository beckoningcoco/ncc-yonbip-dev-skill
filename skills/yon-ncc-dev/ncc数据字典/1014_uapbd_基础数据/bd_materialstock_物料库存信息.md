# |<<

**物料库存信息 (bd_materialstock / nc.vo.bd.material.stock.MaterialStockVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/907.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_materialstock | 物料库存信息主键 | pk_materialstock | char(20) | √ | 主键 (UFID) |
| 2 | pk_material | 物料基本信息主键 | pk_material | char(20) | √ | 物料基本信息（多版本） (material) |
| 3 | pk_group | 所属集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 4 | pk_org | 所属库存组织 | pk_org | char(20) | √ | 组织_业务单元_库存组织 (stockorg) |
| 5 | pk_purchaseorg | 采购组织 | pk_purchaseorg | varchar(20) |  | 组织_业务单元_采购组织 (purchaseorg) |
| 6 | pk_suplystockorg | 供货库存组织 | pk_suplystockorg | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 7 | martype | 物料类型 | martype | char(2) | √ | 物料类型 (matertype) |  | FR=补货件; |