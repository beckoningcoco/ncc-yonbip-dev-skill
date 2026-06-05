---
tags: ["BIP", "元数据", "数据字典", "OSM", "po.returnorder.OsmReturnOrderProductExt"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 委外退货单表体扩展 (`po.returnorder.OsmReturnOrderProductExt`)

> OSM | 物理表：`po_osm_arrive_order_product_ext`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 委外退货单表体扩展 |
| 物理表 | `po_osm_arrive_order_product_ext` |
| 数据库 schema | `productionorder` |
| 所属应用 | `OSM` |
| 构建时间 | `2026-06-05 09:57:09.8400` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | 0d67012a-9649-4ece-9baa-17c7b5144dac | 委外退货单产品ID |

---

## 直接属性（19个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `arrivePlanId` | 到货计划id | `arrive_plan_id` | Long |
| 2 | `arrivePlanLineNo` | 到货计划行号 | `arrive_plan_line_no` | Decimal |
| 3 | `changeRateDen` | 换算率分母 | `change_rateden` | Decimal |
| 4 | `changeRateNum` | 换算率分子 | `change_ratenum` | Decimal |
| 5 | `collaborationPocode` | 协同源头单据号 | `collaboration_pocode` | String |
| 6 | `collaborationPodetailid` | 协同源头单据行 | `collaboration_podetailid` | Long |
| 7 | `collaborationPoid` | 协同源头单据主表id | `collaboration_poid` | Long |
| 8 | `collaborationPolineno` | 协同源头单据行号 | `collaboration_polineno` | Decimal |
| 9 | `collaborationSource` | 协同源头单据类型 | `collaboration_source` | String |
| 10 | `id` | 委外退货单产品ID | `id` | 0d67012a-9649-4ece-9baa-17c7b5144dac |
| 11 | `inspectionCtrlPoint` | 检验控制点 | `inspection_ctrl_point` | osmInspectionCtrlPoint |
| 12 | `noRequireCheck` | 不需要委外核销 | `no_require_check` | Short |
| 13 | `offChartReceipt` | 表外产出 | `off_chart_receipt` | Boolean |
| 14 | `sourceOsmOrderByProductId` | 来源委外订单联副行ID | `source_osm_order_byproduct_id` | 815c3a03-9e21-40c0-baa1-08961b64fc38 |
| 15 | `sourceOsmOrderProductId` | 来源委外订单行ID | `source_osm_order_product_id` | 7d39c327-90bf-4f63-b030-c953035dd99e |
| 16 | `sourceSfcFlowCardId` | 来源工序流转卡工序id | `source_sfc_flow_card_id` | Long |
| 17 | `subcontractToPriceDen` | 换算率分母 | `subcontract_to_priceden` | Decimal |
| 18 | `subcontractToPriceNum` | 换算率分子 | `subcontract_to_pricenum` | Decimal |
| 19 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `sourceOsmOrderProductId` | 来源委外订单行ID | `osm.OSMOrder.OSMOrderProduct` | None |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `id` | 委外退货单产品ID | `po.returnorder.OsmReturnOrderProduct` | None | true |
| 4 | `sourceOsmOrderByProductId` | 来源委外订单联副行ID | `osm.OSMOrder.OSMOrderByProduct` | None |  |
