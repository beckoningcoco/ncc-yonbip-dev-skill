# |<<

**自动结算之红蓝入库单 (po_rule_rbstock / nc.vo.pu.m27.entity.RBStockOptionableVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4632.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_rbstock | 红蓝入库单主键 | pk_rbstock | char(20) | √ | 主键 (UFID) |
| 2 | bsuppliersame | 供应商相同 | bsuppliersame | char(1) |  | 布尔类型 (UFBoolean) |
| 3 | bdeptsame | 部门相同 | bdeptsame | char(1) |  | 布尔类型 (UFBoolean) |
| 4 | bbuyersame | 采购员相同 | bbuyersame | char(1) |  | 布尔类型 (UFBoolean) |
| 5 | bnumabssame | 红蓝入库单数量绝对值相同 | bnumabssame | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | bbatchcodesame | 批次相同 | bbatchcodesame | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | bordersame | 来源同一订单 | bordersame | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | btrantypesame | 入库类型相同 | btrantypesame | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | borigpricesame | 主无税净价相同 | borigpricesame | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | bproductorsame | 生产厂商相同 | bproductorsame | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | bprojectsame | 项目相同 | bprojectsame | char(1) |  | 布尔类型 (UFBoolean) |
| 12 | bfreeitemsame | 自由辅助属性相同 | bfreeitemsame | char(1) |  | 布尔类型 (UFBoolean) |
| 13 | bfinanceorgsame | 财务组织相同 | bfinanceorgsame | char(1) |  | 布尔类型 (UFBoolean) |
| 14 | bmaterialsame | 物料相同 | bmaterialsame | char(1) |  | 布尔类型 (UFBoolean) |