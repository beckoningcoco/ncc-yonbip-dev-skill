# |<<

**完工产品取数明细 (cm_product_bs / nc.vo.cm.product.entity.ProductFetchVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1495.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cproduct_bsid | 完工产品表取数明细 | cproduct_bsid | char(20) | √ | 主键 (UFID) |
| 2 | ccostcenterid | 成本中心 | ccostcenterid | varchar(20) |  | 成本中心 (resacostcenter) |
| 3 | cperiod | 会计期间 | cperiod | varchar(50) |  | 字符串 (String) |
| 4 | ccostregionid | 成本域 | ccostregionid | varchar(20) |  | 组织_成本域 (costregion) |
| 5 | nnum | 数量 | nnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 6 | cmaterialid | 物料最新版本 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 7 | cmaterialvid | 物料 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 8 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 9 | pk_org | 工厂最新版本 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 10 | pk_org_v | 工厂 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 11 | cproduct_bid | 完工单明细 | cproduct_bid | varchar(20) |  | 完工单明细 (cm_product_b) |