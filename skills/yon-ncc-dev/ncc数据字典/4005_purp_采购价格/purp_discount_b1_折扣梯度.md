# |<<

**折扣梯度 (purp_discount_b1 / nc.vo.pp.pub.discount.entity.DiscountGradsItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4803.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_discount_b1 | 折扣梯度 | pk_discount_b1 | char(20) | √ | 主键 (UFID) |
| 2 | bincludelower | 是否包含下限 | bincludelower | char(1) |  | 布尔类型 (UFBoolean) |
| 3 | nlower | 起始数 | nlower | decimal(28, 8) |  | 数值 (UFDouble) |
| 4 | nupper | 终止数 | nupper | decimal(28, 8) |  | 数值 (UFDouble) |
| 5 | bincludeupper | 是否包含上限 | bincludeupper | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | nmoneypercent | 金额百分比 | nmoneypercent | decimal(28, 8) |  | 数值 (UFDouble) |
| 7 | npricepercent | 单价百分比 | npricepercent | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | npricenum | 单价数值 | npricenum | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 10 | pk_org_v | 采购组织 | pk_org_v | varchar(20) |  | 组织_业务单元_采购组织版本信息 (purchaseorg_v) |
| 11 | pk_org | 采购组织版本 | pk_org | varchar(20) |  | 组织_业务单元_采购组织 (purchaseorg) |