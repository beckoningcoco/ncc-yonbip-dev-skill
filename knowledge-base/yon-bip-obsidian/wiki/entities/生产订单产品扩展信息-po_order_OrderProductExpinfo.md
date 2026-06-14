---
tags: ["BIP", "元数据", "数据字典", "PO", "po.order.OrderProductExpinfo"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 生产订单产品扩展信息 (`po.order.OrderProductExpinfo`)

> PO | 物理表：`po_order_product_expinfo`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 生产订单产品扩展信息 |
| 物理表 | `po_order_product_expinfo` |
| domain/服务域 | `productionorder` |
| 所属应用 | `PO` |
| 构建时间 | `2026-06-05 09:25:41.5090` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | 8eadf170-a715-41e1-b654-51ef707f7e90 | 生产订单产品ID |

---

## 直接属性（40个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `apsLock` | 排程状态 | `aps_lock` | Integer |
| 2 | `bizOrderCode` | 业务订单编码 | `biz_order_code` | String |
| 3 | `bizOrderLineNo` | 业务订单行号 | `biz_order_line_no` | Decimal |
| 4 | `bizOrderType` | 业务订单类型 | `biz_order_type` | String |
| 5 | `bomUnitChangeRateDen` | BOM单位换算率分母 | `bom_unit_change_rateden` | Decimal |
| 6 | `bomUnitChangeRateNum` | BOM单位换算率分子 | `bom_unit_change_ratenum` | Decimal |
| 7 | `bomUnitChangeType` | BOM单位换算方式 | `bom_unit_change_type` | ChangeType |
| 8 | `cfmReceivedKit` | 确认已领套数 | `cfm_received_kit` | Decimal |
| 9 | `changeRateDen` | 换算率分母 | `change_rateden` | Decimal |
| 10 | `changeRateNum` | 换算率分子 | `change_ratenum` | Decimal |
| 11 | `firstCheck` | 首检 | `first_check` | String |
| 12 | `firstCheckStatus` | 首检状态 | `first_check_status` | String |
| 13 | `firstCheckType` | 首检控制方式 | `first_check_type` | String |
| 14 | `fromQuantity` | 从数量 | `from_quantity` | Decimal |
| 15 | `id` | 生产订单产品ID | `id` | 8eadf170-a715-41e1-b654-51ef707f7e90 |
| 16 | `inspectionDate` | 检验日期 | `inspection_date` | Date |
| 17 | `isAutoExp` | 自动展开 | `is_auto_exp` | Boolean |
| 18 | `isSerialNoManage` | 序列号管理 | `is_serial_no_manage` | Boolean |
| 19 | `isUpdateStock` | 是否更新存量 | `is_update_stock` | Integer |
| 20 | `machiningCenterId` | 加工中心ID | `machiningcenter_id` | 2c63b6a3-15b5-49e8-bd53-72b1ddab2d0f |
| 21 | `mergeOrderId` | 合并订单id | `merge_order_id` | Long |
| 22 | `orderProductId` | 生产订单产品ID | `order_product_id` | d421b3fa-9bcd-4db2-b43b-fbc55db29ae7 |
| 23 | `parentOrderCode` | 父生产订单单号 | `parent_order_code` | String |
| 24 | `parentOrderMaterialId` | 父生产订单材料ID | `parent_order_material_id` | Long |
| 25 | `parentOrderProductId` | 父生产订单产品ID | `parent_order_product_id` | Long |
| 26 | `parentOrderProductLineNo` | 父生产订单产品行号 | `parent_order_product_line_no` | Decimal |
| 27 | `processRptPoint` | 工序委外产品报告点 | `process_rpt_point` | Short |
| 28 | `pubts` | 时间戳 | `pubts` | DateTime |
| 29 | `quantityControl` | 数量控制 | `quantity_control` | Boolean |
| 30 | `realStartDate` | 实际开工日期 | `real_start_date` | Date |
| 31 | `receivedKit` | 已领料套数 | `received_kit` | Decimal |
| 32 | `reportDate` | 分析日期 | `report_date` | DateTime |
| 33 | `rootOrderProductId` | 根生产订单产品ID | `root_order_product_id` | Long |
| 34 | `rootOrderProductLineNo` | 根生产订单产品行号 | `root_order_product_line_no` | Decimal |
| 35 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 36 | `toQuantity` | 到数量 | `to_quantity` | Decimal |
| 37 | `wholeQuantity` | 齐套数量 | `whole_quantity` | Decimal |
| 38 | `wholeResultId` | 齐套分析结果ID | `whole_result_id` | Long |
| 39 | `wholeStatus` | 齐套状态 | `whole_status` | Short |
| 40 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（5个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `id` | 生产订单产品ID | `po.order.OrderProduct` | None | true |
| 3 | `machiningCenterId` | 加工中心ID | `ed.workcenter.WorkCenter` | Service |  |
| 4 | `orderProductId` | 生产订单产品ID | `base.entity.BizObject` | None |  |
| 5 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
