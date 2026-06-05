---
tags: ["BIP", "元数据", "数据字典", "PO", "po.order.OrderActivity"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 资源 (`po.order.OrderActivity`)

> PO | 物理表：`po_order_activity`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 资源 |
| 物理表 | `po_order_activity` |
| 数据库 schema | `productionorder` |
| 所属应用 | `PO` |
| 构建时间 | `2026-06-05 09:22:55.0300` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（42个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `activityClass` | 资源类别 | `activity_class` | Short |
| 2 | `activityId` | 资源标准ID | `activity_id` | Long |
| 3 | `activityType` | 资源类型 | `activity_type` | acbdbe5a-3db1-4c88-aa59-9d89338af77b |
| 4 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 5 | `ecnNo` | 工程变更单号 | `ecn_no` | String |
| 6 | `ecnUser` | 变更人 | `ecn_user` | String |
| 7 | `ecnDetailNo` | 工程变更行号 | `ecn_detail_no` | String |
| 8 | `ecnDetails` | 变更详情 | `ecn_details` | String |
| 9 | `ecnId` | 工程变更ID | `ecn_id` | Long |
| 10 | `ecnDetailId` | 工程变更行ID | `ecn_detail_id` | Long |
| 11 | `ecnTime` | 变更时间 | `ecn_time` | DateTime |
| 12 | `ecnStatus` | 变更状态 | `ecn_status` | Integer |
| 13 | `activityUnit` | 数量单位 | `activity_unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 14 | `opSn` | 工序顺序号 | `op_sn` | Decimal |
| 15 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 16 | `usageBasis` | 计量基础 | `usage_basis` | Short |
| 17 | `costCenterId` | 成本中心ID | `cost_center_id` | 872630ba-e8f4-4080-817d-8fc9a6958733 |
| 18 | `id` | ID | `id` | Long |
| 19 | `pubts` | 时间戳 | `pubts` | DateTime |
| 20 | `lineNum` | 行号 | `line_num` | Decimal |
| 21 | `supplyVirtualAccbodyId` | 供方利润中心ID | `supply_virtual_accbody_id` | e33ec72a-3857-4167-89e2-a437168ed3bb |
| 22 | `orderId` | 订单ID | `order_id` | Long |
| 23 | `orderProductId` | 产品行ID | `order_product_id` | 8eadf170-a715-41e1-b654-51ef707f7e90 |
| 24 | `orderProcessId` | 工序ID | `order_process_id` | 980e8d68-00ee-467f-bfd6-5fbd69855bd7 |
| 25 | `operationId` | 标准工序ID | `operation_id` | 5929debb-7319-44fb-8583-5c7d0d5af701 |
| 26 | `workCenterId` | 工作中心ID | `workcenter_id` | 2c63b6a3-15b5-49e8-bd53-72b1ddab2d0f |
| 27 | `activityQty` | 数量 | `activity_qty` | Decimal |
| 28 | `usageQty` | 标准资源量 | `usage_qty` | Decimal |
| 29 | `denominatorQuantity` | 母件底数 | `denominator_quantity` | Decimal |
| 30 | `usageUnit` | 计量单位ID | `usage_unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 31 | `stdUsageQty` | 额定总用量 | `std_usage_qty` | Decimal |
| 32 | `planUsageQty` | 计划总用量 | `plan_usage_qty` | Decimal |
| 33 | `actualUsageQty` | 实际总用量 | `actual_usage_qty` | Decimal |
| 34 | `isCalcCost` | 计算成本 | `is_calccost` | Boolean |
| 35 | `chargeType` | 申报时机 | `charge_type` | String |
| 36 | `isReported` | 已计量 | `is_reported` | Short |
| 37 | `isAutoCreate` | 自动创建 | `is_auto_create` | Short |
| 38 | `sourceType` | 来源单据类型 | `source_type` | String |
| 39 | `sourceDocId` | 来源单据ID | `source_doc_id` | Long |
| 40 | `sourceDetailId` | 来源单据行ID | `source_detail_id` | Long |
| 41 | `sourceCode` | 来源单据号 | `source_code` | String |
| 42 | `sourceLineNum` | 来源单据行号 | `source_linenum` | String |

---

## 关联属性（11个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `supplyVirtualAccbodyId` | 供方利润中心ID | `bd.virtualaccbody.VirtualAccbody` | Service |  |
| 2 | `usageUnit` | 计量单位ID | `pc.unit.Unit` | Service |  |
| 3 | `orderProcessId` | 工序ID | `po.order.OrderProcess` | None |  |
| 4 | `activityUnit` | 数量单位 | `pc.unit.Unit` | Service |  |
| 5 | `costCenterId` | 成本中心ID | `bd.costcenter.CostCenter` | Service |  |
| 6 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 7 | `workCenterId` | 工作中心ID | `ed.workcenter.WorkCenter` | Service |  |
| 8 | `operationId` | 标准工序ID | `ed.operation.Operation` | Service |  |
| 9 | `orderProductId` | 产品行ID | `po.order.OrderProduct` | None | true |
| 10 | `activityType` | 资源类型 | `bd.activity.Activity` | Service |  |
| 11 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
