---
tags: ["BIP", "元数据", "数据字典", "OSM", "osm.OSMOrder.OSMSubcontractProductExt"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 委外产品扩展信息 (`osm.OSMOrder.OSMSubcontractProductExt`)

> OSM | 物理表：`po_order_product_subcontract_ext`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 委外产品扩展信息 |
| 物理表 | `po_order_product_subcontract_ext` |
| 数据库 schema | `productionorder` |
| 所属应用 | `OSM` |
| 构建时间 | `2026-06-05 09:57:55.9620` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | 7d39c327-90bf-4f63-b030-c953035dd99e | 委外订单产品id |

---

## 直接属性（26个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `arriveClose` | 到货关闭 | `arrive_close` | Short |
| 2 | `arrivePlanNoQty` | 到货计划未到货数量 | `arrive_plan_no_qty` | Decimal |
| 3 | `arrivePlanNoSubQty` | 到货计划未到货件数 | `arrive_plan_no_sub_qty` | Decimal |
| 4 | `arrivePlanQty` | 累计到货计划数量 | `arrive_plan_qty` | Decimal |
| 5 | `arrivePlanSubQty` | 累计到货计划件数 | `arrive_plan_sub_qty` | Decimal |
| 6 | `autoClose` | 自动关闭 | `auto_close` | Short |
| 7 | `demandToPurchaseDen` | 需求换算率分母 | `demand_to_purchaseden` | Decimal |
| 8 | `demandToPurchaseNum` | 需求换算率分子 | `demand_to_purchasenum` | Decimal |
| 9 | `entrustProcessType` | 受托加工类型 | `entrust_process_type` | Short |
| 10 | `hasArrivePlan` | 有到货计划 | `has_arrive_plan` | Boolean |
| 11 | `id` | 委外订单产品id | `id` | 7d39c327-90bf-4f63-b030-c953035dd99e |
| 12 | `inClose` | 入库关闭 | `in_close` | Short |
| 13 | `invoiceClose` | 发票关闭 | `invoice_close` | Boolean |
| 14 | `invoiceCloseDateTime` | 发票关闭时间 | `invoice_close_datetime` | DateTime |
| 15 | `invoiceClosePerson` | 发票关闭人 | `invoice_close_person` | String |
| 16 | `invoiceClosePersonId` | 发票关闭人ID | `invoice_close_personid` | Long |
| 17 | `payClose` | 付款关闭 | `pay_close` | Boolean |
| 18 | `payCloseDateTime` | 付款关闭时间 | `pay_close_datetime` | DateTime |
| 19 | `payClosePerson` | 付款关闭人 | `pay_close_person` | String |
| 20 | `payClosePersonId` | 付款关闭人ID | `pay_close_personid` | Long |
| 21 | `sourceSfcFlowCardId` | 来源工序流转卡工序id | `source_sfc_flow_card_id` | Long |
| 22 | `specialBizType` | 特殊业务类型 | `special_biz_type` | String |
| 23 | `subcontractToPriceDen` | 计价换算率分母 | `subcontract_to_priceden` | Decimal |
| 24 | `subcontractToPriceNum` | 计价换算率分子 | `subcontract_to_pricenum` | Decimal |
| 25 | `vendorProductModelDes` | 供应商物料规格说明 | `vendor_product_modeldes` | String |
| 26 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（2个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `id` | 委外订单产品id | `osm.OSMOrder.OSMOrderProduct` | None | true |
