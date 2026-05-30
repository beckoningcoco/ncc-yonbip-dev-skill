# |<<

**采购折扣 (purp_discount_h / nc.vo.pp.pub.discount.entity.DiscountHeaderVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4807.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_discount_h | 采购折扣 | pk_discount_h | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org_v | 采购组织多版本 | pk_org_v | varchar(20) |  | 组织_业务单元_采购组织版本信息 (purchaseorg_v) |
| 4 | pk_supplier | 供应商编码 | pk_supplier | varchar(20) |  | 供应商基本信息 (supplier) |
| 5 | fcondition | 折扣条件 | fcondition | int |  | 折扣计算条件 (discountcondition) |  | 0=金额; |