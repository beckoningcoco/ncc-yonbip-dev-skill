# |<<

**完工单明细 (cm_product_b / nc.vo.cm.product.entity.ProductItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1494.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cproduct_bid | 完工单明细 | cproduct_bid | char(20) | √ | 主键 (UFID) |
| 2 | cproductid | 完工单 | cproductid | char(20) |  | 主键 (UFID) |
| 3 | ccostobjectid | 成本对象 | ccostobjectid | varchar(20) |  | 成本对象 (cm_costobject) |
| 4 | nnum | 完工数量 | nnum | decimal(20, 8) |  | 数值 (UFDouble) |
| 5 | istatus | 状态 | istatus | int |  | 单据状态(成本) (CMStatusEnum) | 1 | 1=自由; |