# |<<

**自动结算之红蓝发票 (po_rule_rbinvoice / nc.vo.pu.m27.entity.RBInvoiceOptionableVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4631.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_rbinvoice | 红蓝发票主键 | pk_rbinvoice | char(20) | √ | 主键 (UFID) |
| 2 | bdeptsame | 部门相同 | bdeptsame | char(1) |  | 布尔类型 (UFBoolean) |
| 3 | bbuyersame | 采购员相同 | bbuyersame | char(1) |  | 布尔类型 (UFBoolean) |
| 4 | bnumabssame | 红蓝发票数量绝对值相同 | bnumabssame | char(1) |  | 布尔类型 (UFBoolean) |
| 5 | bbatchcodesame | 批次相同 | bbatchcodesame | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | bordersame | 来源同一订单 | bordersame | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | bproductorsame | 生产厂商相同 | bproductorsame | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | bprojectsame | 项目相同 | bprojectsame | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | bfreeitemsame | 自由辅助属性相同 | bfreeitemsame | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | bfinanceorgsame | 财务组织相同 | bfinanceorgsame | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | bsuppliersame | 供应商相同 | bsuppliersame | char(1) |  | 布尔类型 (UFBoolean) |
| 12 | bmaterialsame | 物料相同 | bmaterialsame | char(1) |  | 布尔类型 (UFBoolean) |
| 13 | binvoicetypesame | 发票类型相同 | binvoicetypesame | char(1) |  | 布尔类型 (UFBoolean) |
| 14 | bnorigpricesame | 主无税单价相同 | bnorigpricesame | char(1) |  | 布尔类型 (UFBoolean) |