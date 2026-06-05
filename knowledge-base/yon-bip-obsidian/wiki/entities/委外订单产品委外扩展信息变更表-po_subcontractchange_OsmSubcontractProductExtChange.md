---
tags: ["BIP", "元数据", "数据字典", "OSM", "po.subcontractchange.OsmSubcontractProductExtChange"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 委外订单产品委外扩展信息变更表 (`po.subcontractchange.OsmSubcontractProductExtChange`)

> OSM | 物理表：`osm_order_product_subcontract_ext_change`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 委外订单产品委外扩展信息变更表 |
| 物理表 | `osm_order_product_subcontract_ext_change` |
| 数据库 schema | `productionorder` |
| 所属应用 | `OSM` |
| 构建时间 | `2026-06-05 09:58:26.6940` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | 874c6c6f-0c0e-4582-800e-77098c273c53 | id |

---

## 直接属性（29个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `arriveClose` | 到货关闭 | `arrive_close` | Short |
| 2 | `arrivePlanNoQty` | 到货计划未到货数量 | `arrive_plan_no_qty` | Decimal |
| 3 | `arrivePlanNoSubQty` | 到货计划未到货件数 | `arrive_plan_no_sub_qty` | Decimal |
| 4 | `arrivePlanQty` | 累计到货计划数量 | `arrive_plan_qty` | Decimal |
| 5 | `arrivePlanSubQty` | 累计到货计划件数 | `arrive_plan_sub_qty` | Decimal |
| 6 | `autoClose` | 自动关闭 | `auto_close` | Short |
| 7 | `closeApply` | 关闭申请 | `close_apply` | Short |
| 8 | `demandToPurchaseDen` | 需求换算率分母 | `demand_to_purchaseden` | Decimal |
| 9 | `demandToPurchaseNum` | 需求换算率分子 | `demand_to_purchasenum` | Decimal |
| 10 | `entrustProcessType` | 受托加工类型 | `entrust_process_type` | Short |
| 11 | `hasArrivePlan` | 有到货计划 | `has_arrive_plan` | Boolean |
| 12 | `id` | id | `id` | 874c6c6f-0c0e-4582-800e-77098c273c53 |
| 13 | `inClose` | 入库关闭 | `in_close` | Short |
| 14 | `invoiceClose` | 发票关闭 | `invoice_close` | Boolean |
| 15 | `invoiceCloseDateTime` | 发票关闭时间 | `invoice_close_datetime` | DateTime |
| 16 | `invoiceClosePerson` | 发票关闭人 | `invoice_close_person` | String |
| 17 | `invoiceClosePersonId` | 发票关闭人ID | `invoice_close_personid` | Long |
| 18 | `originalOrderId` | 原单id | `original_order_id` | b80026c8-0517-4255-aca1-b7f374771eb6 |
| 19 | `originalOrderProductId` | 原单产品id | `original_subcontract_product_id` | 47609e4d-5bb6-4d1c-b362-ef1ce5d4ef72 |
| 20 | `payClose` | 付款关闭 | `pay_close` | Boolean |
| 21 | `payCloseDateTime` | 付款关闭时间 | `pay_close_datetime` | DateTime |
| 22 | `payClosePerson` | 付款关闭人 | `pay_close_person` | String |
| 23 | `payClosePersonId` | 付款关闭人ID | `pay_close_personid` | Long |
| 24 | `sourceSfcFlowCardId` | 来源工序流转卡工序id | `source_sfc_flow_card_id` | Long |
| 25 | `specialBizType` | 特殊业务类型 | `special_biz_type` | String |
| 26 | `subcontractToPriceDen` | 计价换算率分母 | `subcontract_to_priceden` | Decimal |
| 27 | `subcontractToPriceNum` | 计价换算率分子 | `subcontract_to_pricenum` | Decimal |
| 28 | `vendorProductModelDes` | 供应商物料规格说明 | `vendor_product_modeldes` | String |
| 29 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `originalOrderProductId` | 原单产品id | `po.order.SubcontractProductExt` | None |  |
| 2 | `originalOrderId` | 原单id | `po.order.Order` | None |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `id` | id | `po.subcontractchange.OsmOrderProductChange` | None | true |
