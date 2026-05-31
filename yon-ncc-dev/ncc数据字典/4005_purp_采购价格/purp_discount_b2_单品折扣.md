# |<<

**单品折扣 (purp_discount_b2 / nc.vo.pp.pub.discount.entity.DiscountSingleItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4804.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_discount_b2 | 单品折扣 | pk_discount_b2 | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_marbasclass | 物料分类 | pk_marbasclass | varchar(20) |  | 物料基本分类 (marbasclass) |
| 4 | pk_material | 物料编码 | pk_material | varchar(20) |  | 物料基本信息 (material_v) |
| 5 | pk_org_v | 采购组织 | pk_org_v | varchar(20) |  | 组织_业务单元_采购组织版本信息 (purchaseorg_v) |
| 6 | pk_org | 采购组织版本 | pk_org | varchar(20) |  | 组织_业务单元_采购组织 (purchaseorg) |