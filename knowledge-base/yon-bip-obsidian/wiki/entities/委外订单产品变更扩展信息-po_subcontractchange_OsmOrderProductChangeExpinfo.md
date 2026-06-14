---
tags: ["BIP", "元数据", "数据字典", "OSM", "po.subcontractchange.OsmOrderProductChangeExpinfo"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 委外订单产品变更扩展信息 (`po.subcontractchange.OsmOrderProductChangeExpinfo`)

> OSM | 物理表：`osm_order_product_change_expinfo`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 委外订单产品变更扩展信息 |
| 物理表 | `osm_order_product_change_expinfo` |
| domain/服务域 | `productionorder` |
| 所属应用 | `OSM` |
| 构建时间 | `2026-06-05 09:58:20.7940` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | 874c6c6f-0c0e-4582-800e-77098c273c53 | 委外订单变更产品ID |

---

## 直接属性（40个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `apsLock` | 排程状态 | `aps_lock` | Integer |
| 2 | `fromQuantity` | 从数量 | `from_quantity` | Decimal |
| 3 | `id` | 委外订单变更产品ID | `id` | 874c6c6f-0c0e-4582-800e-77098c273c53 |
| 4 | `isAutoExp` | 自动展开 | `is_auto_exp` | Boolean |
| 5 | `mergeOrderId` | 合并订单id | `merge_order_id` | Long |
| 6 | `orderProductId` | 生产订单产品ID | `order_product_id` | d421b3fa-9bcd-4db2-b43b-fbc55db29ae7 |
| 7 | `parentOrderProductId` | 父生产订单产品ID | `parent_order_product_id` | Long |
| 8 | `parentOrderProductLineNo` | 父生产订单产品行号 | `parent_order_product_line_no` | Decimal |
| 9 | `pubts` | 时间戳 | `pubts` | DateTime |
| 10 | `quantityControl` | 数量控制 | `quantity_control` | Boolean |
| 11 | `rootOrderProductId` | 根生产订单产品ID | `root_order_product_id` | Long |
| 12 | `rootOrderProductLineNo` | 根生产订单产品行号 | `root_order_product_line_no` | Decimal |
| 13 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 14 | `toQuantity` | 到数量 | `to_quantity` | Decimal |
| 15 | `bizOrderCode` | 业务订单编码 | `biz_order_code` | String |
| 16 | `bizOrderLineNo` | 业务订单行号 | `biz_order_line_no` | Decimal |
| 17 | `bizOrderType` | 业务订单类型 | `biz_order_type` | String |
| 18 | `bomUnitChangeRateDen` | BOM单位换算率分母 | `bom_unit_change_rateden` | Decimal |
| 19 | `bomUnitChangeRateNum` | BOM单位换算率分子 | `bom_unit_change_ratenum` | Decimal |
| 20 | `bomUnitChangeType` | BOM单位换算方式 | `bom_unit_change_type` | ChangeType |
| 21 | `cfmReceivedKit` | 确认已领套数 | `cfm_received_kit` | Decimal |
| 22 | `changeRateDen` | 换算率分母 | `change_rateden` | Decimal |
| 23 | `changeRateNum` | 换算率分子 | `change_ratenum` | Decimal |
| 24 | `firstCheck` | 首检 | `first_check` | String |
| 25 | `firstCheckStatus` | 首检状态 | `first_check_status` | String |
| 26 | `firstCheckType` | 首检控制方式 | `first_check_type` | String |
| 27 | `inspectionDate` | 检验日期 | `inspection_date` | Date |
| 28 | `isSerialNoManage` | 序列号管理 | `is_serial_no_manage` | Boolean |
| 29 | `isUpdateStock` | 是否更新存量 | `is_update_stock` | Integer |
| 30 | `machiningCenterId` | 加工中心ID | `machiningcenter_id` | 2c63b6a3-15b5-49e8-bd53-72b1ddab2d0f |
| 31 | `parentOrderCode` | 父生产订单单号 | `parent_order_code` | String |
| 32 | `parentOrderMaterialId` | 父生产订单材料ID | `parent_order_material_id` | Long |
| 33 | `processRptPoint` | 工序委外产品报告点 | `process_rpt_point` | Short |
| 34 | `realStartDate` | 实际开工日期 | `real_start_date` | Date |
| 35 | `receivedKit` | 已领料套数 | `received_kit` | Decimal |
| 36 | `reportDate` | 分析日期 | `report_date` | DateTime |
| 37 | `wholeQuantity` | 齐套数量 | `whole_quantity` | Decimal |
| 38 | `wholeResultId` | 齐套分析结果ID | `whole_result_id` | Long |
| 39 | `wholeStatus` | 齐套状态 | `whole_status` | Short |
| 40 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（5个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `id` | 委外订单变更产品ID | `po.subcontractchange.OsmOrderProductChange` | None | true |
| 3 | `machiningCenterId` | 加工中心ID | `ed.workcenter.WorkCenter` | Service |  |
| 4 | `orderProductId` | 生产订单产品ID | `base.entity.BizObject` | None |  |
| 5 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
