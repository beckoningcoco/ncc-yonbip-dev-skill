---
tags: ["BIP", "元数据", "数据字典", "OSM", "osm.OSMOrder.OSMOrderProductExpinfo"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 委外订单产品扩展信息 (`osm.OSMOrder.OSMOrderProductExpinfo`)

> OSM | 物理表：`po_order_product_expinfo`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 委外订单产品扩展信息 |
| 物理表 | `po_order_product_expinfo` |
| 数据库 schema | `productionorder` |
| 所属应用 | `OSM` |
| 构建时间 | `2026-06-05 09:57:52.0030` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | 7d39c327-90bf-4f63-b030-c953035dd99e | 生产订单产品ID |

---

## 直接属性（40个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `quantityControl` | 数量控制 | `quantity_control` | Boolean |
| 2 | `rootOrderProductLineNo` | 根生产订单产品行号 | `root_order_product_line_no` | Decimal |
| 3 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 4 | `mergeOrderId` | 合并订单id | `merge_order_id` | Long |
| 5 | `fromQuantity` | 从数量 | `from_quantity` | Decimal |
| 6 | `parentOrderProductId` | 父生产订单产品ID | `parent_order_product_id` | Long |
| 7 | `orderProductId` | 生产订单产品ID | `order_product_id` | d421b3fa-9bcd-4db2-b43b-fbc55db29ae7 |
| 8 | `isAutoExp` | 自动展开 | `is_auto_exp` | Boolean |
| 9 | `toQuantity` | 到数量 | `to_quantity` | Decimal |
| 10 | `parentOrderProductLineNo` | 父生产订单产品行号 | `parent_order_product_line_no` | Decimal |
| 11 | `rootOrderProductId` | 根生产订单产品ID | `root_order_product_id` | Long |
| 12 | `id` | 生产订单产品ID | `id` | 7d39c327-90bf-4f63-b030-c953035dd99e |
| 13 | `apsLock` | 排程状态 | `aps_lock` | Integer |
| 14 | `pubts` | 时间戳 | `pubts` | DateTime |
| 15 | `isSerialNoManage` | 序列号管理 | `is_serial_no_manage` | Boolean |
| 16 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 17 | `bizOrderCode` | 业务订单编码 | `biz_order_code` | String |
| 18 | `bizOrderLineNo` | 业务订单行号 | `biz_order_line_no` | Decimal |
| 19 | `bizOrderType` | 业务订单类型 | `biz_order_type` | String |
| 20 | `bomUnitChangeRateDen` | BOM单位换算率分母 | `bom_unit_change_rateden` | Decimal |
| 21 | `bomUnitChangeRateNum` | BOM单位换算率分子 | `bom_unit_change_ratenum` | Decimal |
| 22 | `bomUnitChangeType` | BOM单位换算方式 | `bom_unit_change_type` | ChangeType |
| 23 | `cfmReceivedKit` | 确认已领套数 | `cfm_received_kit` | Decimal |
| 24 | `changeRateDen` | 换算率分母 | `change_rateden` | Decimal |
| 25 | `changeRateNum` | 换算率分子 | `change_ratenum` | Decimal |
| 26 | `firstCheck` | 首检 | `first_check` | String |
| 27 | `firstCheckStatus` | 首检状态 | `first_check_status` | String |
| 28 | `firstCheckType` | 首检控制方式 | `first_check_type` | String |
| 29 | `inspectionDate` | 检验日期 | `inspection_date` | Date |
| 30 | `isUpdateStock` | 是否更新存量 | `is_update_stock` | Integer |
| 31 | `machiningCenterId` | 加工中心ID | `machiningcenter_id` | 2c63b6a3-15b5-49e8-bd53-72b1ddab2d0f |
| 32 | `parentOrderCode` | 父生产订单单号 | `parent_order_code` | String |
| 33 | `parentOrderMaterialId` | 父生产订单材料ID | `parent_order_material_id` | Long |
| 34 | `processRptPoint` | 工序委外产品报告点 | `process_rpt_point` | Short |
| 35 | `realStartDate` | 实际开工日期 | `real_start_date` | Date |
| 36 | `receivedKit` | 已领料套数 | `received_kit` | Decimal |
| 37 | `reportDate` | 分析日期 | `report_date` | DateTime |
| 38 | `wholeQuantity` | 齐套数量 | `whole_quantity` | Decimal |
| 39 | `wholeResultId` | 齐套分析结果ID | `whole_result_id` | Long |
| 40 | `wholeStatus` | 齐套状态 | `whole_status` | Short |

---

## 关联属性（5个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `id` | 生产订单产品ID | `osm.OSMOrder.OSMOrderProduct` | None | true |
| 3 | `machiningCenterId` | 加工中心ID | `ed.workcenter.WorkCenter` | Service |  |
| 4 | `orderProductId` | 生产订单产品ID | `base.entity.BizObject` | None |  |
| 5 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
