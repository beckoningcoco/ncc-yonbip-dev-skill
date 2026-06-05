---
tags: ["BIP", "元数据", "数据字典", "PO", "po.orderchange.OrderActivityChange"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 订单资源变更表 (`po.orderchange.OrderActivityChange`)

> PO | 物理表：`po_order_activity_change`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 订单资源变更表 |
| 物理表 | `po_order_activity_change` |
| 数据库 schema | `productionorder` |
| 所属应用 | `PO` |
| 构建时间 | `2026-06-05 09:33:38.2500` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

---

## 直接属性（46个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `activityClass` | 资源类别 | `activity_class` | Short |
| 2 | `activityId` | 资源标准ID | `activity_id` | Long |
| 3 | `activityQty` | 数量 | `activity_qty` | Decimal |
| 4 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 5 | `ecnNo` | 工程变更单号 | `ecn_no` | String |
| 6 | `ecnUser` | 变更人 | `ecn_user` | String |
| 7 | `ecnDetailNo` | 工程变更行号 | `ecn_detail_no` | String |
| 8 | `ecnDetails` | 变更详情 | `ecn_details` | String |
| 9 | `ecnId` | 工程变更ID | `ecn_id` | Long |
| 10 | `ecnDetailId` | 工程变更行ID | `ecn_detail_id` | Long |
| 11 | `ecnTime` | 变更时间 | `ecn_time` | DateTime |
| 12 | `ecnStatus` | 变更状态 | `ecn_status` | Integer |
| 13 | `originalProcessId` | 原单工序id | `original_process_id` | Long |
| 14 | `activityType` | 资源类型 | `activity_type` | acbdbe5a-3db1-4c88-aa59-9d89338af77b |
| 15 | `activityUnit` | 数量单位 | `activity_unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 16 | `actualUsageQty` | 实际总用量 | `actual_usage_qty` | Decimal |
| 17 | `chargeType` | 申报时机 | `charge_type` | String |
| 18 | `costCenterId` | 成本中心 | `cost_center_id` | 872630ba-e8f4-4080-817d-8fc9a6958733 |
| 19 | `denominatorQuantity` | 母件底数 | `denominator_quantity` | Decimal |
| 20 | `id` | id | `id` | Long |
| 21 | `isAutoCreate` | 自动创建 | `is_auto_create` | Short |
| 22 | `isCalcCost` | 计算成本 | `is_calccost` | Boolean |
| 23 | `isReported` | 已计量 | `is_reported` | Short |
| 24 | `lineNum` | 行号 | `line_num` | Decimal |
| 25 | `opSn` | 工序顺序号 | `op_sn` | Decimal |
| 26 | `operationId` | 标准工序 | `operation_id` | 5929debb-7319-44fb-8583-5c7d0d5af701 |
| 27 | `orderId` | 订单id | `order_id` | Long |
| 28 | `orderProcessId` | 订单工序ID | `order_process_id` | 980e8d68-00ee-467f-bfd6-5fbd69855bd7 |
| 29 | `orderProductId` | 产品id | `order_product_id` | fbe0dedd-7f73-4c6b-91f0-6cd861f75f4f |
| 30 | `originalActivityId` | 原单资源ID | `original_order_activity_id` | 95fe7f6b-b857-4ce8-8d7f-8f57160c967b |
| 31 | `originalOrderId` | 原单id | `original_order_id` | b80026c8-0517-4255-aca1-b7f374771eb6 |
| 32 | `originalOrderProductId` | 原单产品id | `original_order_product_id` | 8eadf170-a715-41e1-b654-51ef707f7e90 |
| 33 | `planUsageQty` | 计划总用量 | `plan_usage_qty` | Decimal |
| 34 | `pubts` | 时间戳 | `pubts` | DateTime |
| 35 | `sourceCode` | 来源单据号 | `source_code` | String |
| 36 | `sourceDetailId` | 来源单据行ID | `source_detail_id` | Long |
| 37 | `sourceDocId` | 来源单据ID | `source_doc_id` | Long |
| 38 | `sourceLineNum` | 来源单据行号 | `source_linenum` | String |
| 39 | `sourceType` | 来源单据类型 | `source_type` | String |
| 40 | `stdUsageQty` | 额定总用量 | `std_usage_qty` | Decimal |
| 41 | `supplyVirtualAccbodyId` | 供方利润中心 | `supply_virtual_accbody_id` | e33ec72a-3857-4167-89e2-a437168ed3bb |
| 42 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 43 | `usageBasis` | 计量基础 | `usage_basis` | Short |
| 44 | `usageQty` | 标准资源量 | `usage_qty` | Decimal |
| 45 | `usageUnit` | 计量单位 | `usage_unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 46 | `workCenterId` | 工作中心ID | `workcenter_id` | 2c63b6a3-15b5-49e8-bd53-72b1ddab2d0f |

---

## 关联属性（14个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `supplyVirtualAccbodyId` | 供方利润中心 | `bd.virtualaccbody.VirtualAccbody` | Service |  |
| 2 | `usageUnit` | 计量单位 | `pc.unit.Unit` | Service |  |
| 3 | `originalOrderProductId` | 原单产品id | `po.order.OrderProduct` | None |  |
| 4 | `originalActivityId` | 原单资源ID | `po.order.OrderActivity` | None |  |
| 5 | `activityUnit` | 数量单位 | `pc.unit.Unit` | Service |  |
| 6 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 7 | `orderProductId` | 产品id | `po.orderchange.OrderProductChange` | None | true |
| 8 | `originalOrderId` | 原单id | `po.order.Order` | None |  |
| 9 | `orderProcessId` | 订单工序ID | `po.order.OrderProcess` | None |  |
| 10 | `costCenterId` | 成本中心 | `bd.costcenter.CostCenter` | Service |  |
| 11 | `workCenterId` | 工作中心ID | `ed.workcenter.WorkCenter` | Service |  |
| 12 | `operationId` | 标准工序 | `ed.operation.Operation` | Service |  |
| 13 | `activityType` | 资源类型 | `bd.activity.Activity` | Service |  |
| 14 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
