---
tags: ["BIP", "元数据", "数据字典", "ST", "st.storeout.StoreOutDetailParallel"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 调拨出库单子表平行表 (`st.storeout.StoreOutDetailParallel`)

> ST | 物理表：`st_storeout_b_parallel`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 调拨出库单子表平行表 |
| 物理表 | `st_storeout_b_parallel` |
| domain/服务域 | `ustock` |
| schema | `ustock` |
| 所属应用 | `ST` |
| 构建时间 | `2026-06-05 09:58:51.3530` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | 115a7d25-c0a5-4953-975c-b3e50dbeb868 | 调拨出库单子表id |

---

## 直接属性（29个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `approvedLossQty` | 已途损数量 | `approved_loss_qty` | Decimal |
| 2 | `approvedLossRedQty` | 已途损数量 | `approved_loss_red_qty` | Decimal |
| 3 | `approvedRejectQty` | 已审拒收数量 | `approved_reject_qty` | Decimal |
| 4 | `collaborationPocode` | 协同来源单据编码 | `collaboration_pocode` | String |
| 5 | `collaborationPodetailid` | 协同来源单据行 | `collaboration_podetailid` | Long |
| 6 | `collaborationPoid` | 协同来源单据主表id | `collaboration_poid` | Long |
| 7 | `collaborationPolineno` | 协同来源单据行号 | `collaboration_polineno` | Decimal |
| 8 | `collaborationSource` | 协同来源单据类型 | `collaboration_source` | String |
| 9 | `consumerProfitCenter` | 需方利润中心 | `consumer_profit_center` | e33ec72a-3857-4167-89e2-a437168ed3bb |
| 10 | `id` | 调拨出库单子表id | `id` | 115a7d25-c0a5-4953-975c-b3e50dbeb868 |
| 11 | `inCostCenter` | 调入成本中心 | `in_cost_center` | 872630ba-e8f4-4080-817d-8fc9a6958733 |
| 12 | `newfirstsource` | 源头单据类型 | `newfirstsource` | String |
| 13 | `newfirstsourceGrandchildrenId` | 源头单据孙表id | `newfirstsourcegrandchildrenid` | Long |
| 14 | `newfirstsourceautoid` | 源头单据子表id | `newfirstsourceautoid` | Long |
| 15 | `newfirstsourceid` | 源头单据主表id | `newfirstsourceid` | Long |
| 16 | `newfirstupcode` | 源头单据号 | `newfirstupcode` | String |
| 17 | `newfirstuplineno` | 源头单据行号 | `newfirstuplineno` | Decimal |
| 18 | `outCostCenter` | 调出成本中心 | `out_cost_center` | 872630ba-e8f4-4080-817d-8fc9a6958733 |
| 19 | `providerProfitCenter` | 供方利润中心 | `provider_profit_center` | e33ec72a-3857-4167-89e2-a437168ed3bb |
| 20 | `returnQty` | 已调出退回数量 | `return_qty` | Decimal |
| 21 | `returnSubQty` | 已调出退回件数 | `return_subqty` | Decimal |
| 22 | `signConfirmId` | 签收单id | `sign_confirm_id` | Long |
| 23 | `signConfirmRowId` | 签收单行id | `sign_confirm_row_id` | Long |
| 24 | `sourcesalesoutbilltype` | 源销售出库单据类型 | `iSourceSalesOutBillType` | String |
| 25 | `sourcesalesoutcode` | 源销售出库单号 | `iSourceSalesOutCode` | String |
| 26 | `sourcesalesoutid` | 源销售出库单id | `iSourceSalesOutId` | Long |
| 27 | `sourcesalesoutrowid` | 源销售出库单行id | `iSourceSalesOutRowId` | Long |
| 28 | `sourcesalesoutrowno` | 源销售出库单行号 | `iSourceSalesOutRowNo` | Decimal |
| 29 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（6个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `providerProfitCenter` | 供方利润中心 | `bd.virtualaccbody.VirtualAccbody` | Service |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `outCostCenter` | 调出成本中心 | `bd.costcenter.CostCenter` | Service |  |
| 4 | `id` | 调拨出库单子表id | `st.storeout.StoreOutDetail` | None | true |
| 5 | `consumerProfitCenter` | 需方利润中心 | `bd.virtualaccbody.VirtualAccbody` | Service |  |
| 6 | `inCostCenter` | 调入成本中心 | `bd.costcenter.CostCenter` | Service |  |
