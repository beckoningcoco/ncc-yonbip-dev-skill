---
tags: ["BIP", "元数据", "数据字典", "ycSaleCoor", "order.paymentprogressack.SalePaymentProgressAcks"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 进度确认单子表 (`order.paymentprogressack.SalePaymentProgressAcks`)

> ycSaleCoor | 物理表：`cpu_sale_paymentprogressacks`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 进度确认单子表 |
| 物理表 | `cpu_sale_paymentprogressacks` |
| 数据库 schema | `cpu-cooperation` |
| 所属应用 | `ycSaleCoor` |
| 构建时间 | `2026-06-04 23:31:42.1160` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

---

## 直接属性（70个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | id | `id` | Long |
| 2 | `mainId` | 主表ID | `iMainId` | 75d5ef8d-3cf8-4e94-bd0f-33b51f76efe1 |
| 3 | `upLineno` | 上游单据行号 | `up_lineno` | Decimal |
| 4 | `product` | 物料 | `iProductid` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 5 | `productCode` | 物料编码 | `product_code` | String |
| 6 | `productName` | 物料名称 | `product_name` | String |
| 7 | `creatorId` | 创建人id | `creator_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 8 | `creator` | 创建人 | `creator` | String |
| 9 | `source` | 上游单据类型 | `source` | String |
| 10 | `dr` | 逻辑删除标记 | `dr` | Short |
| 11 | `groupTaskKey` | 分组任务KEY | `groupTaskKey` | String |
| 12 | `makeRuleCode` | 生单规则编号 | `makerule_code` | String |
| 13 | `pubts` | 时间戳 | `pubts` | DateTime |
| 14 | `sourceid` | 上游单据主表id | `sourceid` | Long |
| 15 | `sourceMainPubts` | 时间戳 | `sourceMainPubts` | DateTime |
| 16 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 17 | `sourceautoid` | 上游单据子表id | `sourceautoid` | Long |
| 18 | `upcode` | 上游单据号 | `upcode` | String |
| 19 | `productDesc` | 物料描述 | `product_desc` | String |
| 20 | `productDescription` | 规格说明 | `product_description` | String |
| 21 | `mainUnit` | 主单位id | `main_unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 22 | `mainUnitName` | 主单位 | `main_unit_name` | String |
| 23 | `mainQty` | 确认数量 | `main_qty` | Decimal |
| 24 | `priceQty` | 确认计价数量 | `price_qty` | Decimal |
| 25 | `priceUnit` | 计价单位id | `price_unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 26 | `priceUnitName` | 计价单位 | `price_unit_name` | String |
| 27 | `invPriceExchRate` | 计价换算率 | `invPriceExchRate` | Decimal |
| 28 | `executedMainQty` | 确认已执行数量 | `executed_main_qty` | Decimal |
| 29 | `executedPriceQty` | 确认已执行计价数量 | `executed_price_qty` | Decimal |
| 30 | `unExecutedMainQty` | 确认不执行数量 | `unexecuted_main_qty` | Decimal |
| 31 | `unExecutedPriceQty` | 确认不执行计价数量 | `unexecuted_price_qty` | Decimal |
| 32 | `discountTaxType` | 扣税类别 | `discountTaxType` | String |
| 33 | `priceMark` | 价格标识 | `price_mark` | Integer |
| 34 | `price` | 无税单价 | `price` | Decimal |
| 35 | `taxPrice` | 含税单价 | `tax_price` | Decimal |
| 36 | `amount` | 无税金额 | `amount` | Decimal |
| 37 | `taxAmount` | 含税金额 | `tax_amount` | Decimal |
| 38 | `tax` | 税额 | `tax` | Decimal |
| 39 | `taxitems` | 税目 | `iTaxItems` | 709cd092-3dd4-49ca-9eb9-7b8888551810 |
| 40 | `taxitemsCode` | 税目编码 | `taxitems_code` | String |
| 41 | `taxitemsName` | 税目名称 | `taxitems_name` | String |
| 42 | `taxRate` | 税率 | `tax_rate` | Decimal |
| 43 | `payRatio` | 付款比例 | `iPayRatio` | Decimal |
| 44 | `payMoney` | 应付金额 | `pay_money` | Decimal |
| 45 | `completedAmount` | 完成金额 | `completed_amount` | Decimal |
| 46 | `deductionAmount` | 扣款金额 | `deduction_amount` | Decimal |
| 47 | `memo` | 备注 | `cMemo` | String |
| 48 | `defineCharacter` | 表体自定义项特征 | `define_character` | 261b1e70-6b38-427c-b805-487e27a6b84e |
| 49 | `freeCharacteristics` | 自由项特征组 | `free_characteristics` | c38f0817-52ee-465b-8abb-38e77f3d1c7e |
| 50 | `project` | 项目id | `project_id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 |
| 51 | `projectCode` | 项目编码 | `project_code` | String |
| 52 | `projectName` | 项目名称 | `project_name` | String |
| 53 | `wbs` | WBS | `wbs` | 145cc7d2-79cf-4f3a-934c-c03b46d0fd42 |
| 54 | `wbsName` | WBS任务 | `wbs_name` | String |
| 55 | `wbsCode` | WBS任务编码 | `wbs_code` | String |
| 56 | `activity` | 活动主键 | `activity` | b4a90beb-49ed-4301-b12e-9221d0d12fd1 |
| 57 | `activityName` | 活动 | `activity_name` | String |
| 58 | `activityCode` | 活动编码 | `activity_code` | String |
| 59 | `purOrderId` | 采购订单主表id | `pur_order_id` | Long |
| 60 | `purOrderDetailId` | 采购订单行id | `pur_order_detail_id` | String |
| 61 | `purOrderCode` | 采购订单编号 | `pur_order_code` | String |
| 62 | `saleOrderId` | 销售订单id | `sale_order_id` | Long |
| 63 | `saleOrderDetailId` | 销售订单行id | `sale_order_detail_id` | String |
| 64 | `saleOrderCode` | 销售订单编号 | `sale_order_code` | String |
| 65 | `createTime` | 创建时间 | `create_time` | DateTime |
| 66 | `lineno` | 行号 | `lineno` | Decimal |
| 67 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 68 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 69 | `invPriceExchRateDen` | 计价换算率分母 | `invpriceexchrateden` | Decimal |
| 70 | `invPriceExchRateNum` | 计价换算率分子 | `invpriceexchratenum` | Decimal |

---

## 关联属性（12个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `priceUnit` | 计价单位id | `pc.unit.Unit` | Service |  |
| 2 | `mainUnit` | 主单位id | `pc.unit.Unit` | Service |  |
| 3 | `product` | 物料 | `pc.product.Product` | Service |  |
| 4 | `activity` | 活动主键 | `pgrm.projecttask.ProjectScheduleTask` | Service |  |
| 5 | `freeCharacteristics` | 自由项特征组 | `order.paymentprogressack.PaymentProgressAcksFreeCharacteristics` | None |  |
| 6 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 7 | `creatorId` | 创建人id | `base.user.User` | Service |  |
| 8 | `project` | 项目id | `bd.project.ProjectVO` | Service |  |
| 9 | `wbs` | WBS | `BGDM.wbs.wbs_doc` | Service |  |
| 10 | `mainId` | 主表ID | `order.paymentprogressack.SalePaymentProgressAck` | None | true |
| 11 | `defineCharacter` | 表体自定义项特征 | `order.paymentprogressack.PaymentProgressAcksDefineCharacter` | None |  |
| 12 | `taxitems` | 税目 | `archive.taxArchives.TaxRateArchive` | Service |  |
