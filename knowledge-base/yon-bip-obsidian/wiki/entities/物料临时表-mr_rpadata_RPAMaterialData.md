---
tags: ["BIP", "元数据", "数据字典", "MR", "mr.rpadata.RPAMaterialData"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 物料临时表 (`mr.rpadata.RPAMaterialData`)

> MR | 物理表：`mr_rpa_material_data`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 物料临时表 |
| 物理表 | `mr_rpa_material_data` |
| domain/服务域 | `yonbip-mm-plan` |
| schema | `requirements_planning` |
| 所属应用 | `MR` |
| 构建时间 | `2026-06-05 15:11:02.5460` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（72个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `allowDelayDays` | 允许延后天数 | `allow_delay_days` | Integer |
| 2 | `allowForwardDays` | 允许提前天数 | `allow_forward_days` | Integer |
| 3 | `createDate` | 创建日期 | `create_date` | Date |
| 4 | `createTime` | 创建时间 | `create_time` | DateTime |
| 5 | `creator` | 创建人名称 | `creator` | String |
| 6 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 7 | `currentQuantity` | 现存量 | `current_quantity` | Decimal |
| 8 | `demandMergeDayType` | 合并需求日 | `demand_merge_day_type` | ItemMergeStartDayEnum |
| 9 | `demandMergeFlag` | 需求合并标识 | `demand_merge_flag` | ItemDemandMergeFlagEnum |
| 10 | `demandMergePeriodType` | 合并时格 | `demand_merge_period_type` | ItemMergePeriodTypeEnum |
| 11 | `demandMergePeriods` | 合并时格数  | `demand_merge_periods` | Integer |
| 12 | `demandMergeType` | 合并类型 | `demand_merge_type` | ItemDemandMergeTypeEnum |
| 13 | `departmentId` | 部门 | `department_id` | String |
| 14 | `docOrgId` | 单据组织 | `doc_org_id` | String |
| 15 | `dr` | 逻辑删除标识 | `dr` | Integer |
| 16 | `fixedLossQty` | 固定损耗量 | `fixed_loss_qty` | Decimal |
| 17 | `free1` | 规格1 | `free1` | String |
| 18 | `free10` | 规格10 | `free10` | String |
| 19 | `free2` | 规格2 | `free2` | String |
| 20 | `free3` | 规格3 | `free3` | String |
| 21 | `free4` | 规格4 | `free4` | String |
| 22 | `free5` | 规格5 | `free5` | String |
| 23 | `free6` | 规格6 | `free6` | String |
| 24 | `free7` | 规格7 | `free7` | String |
| 25 | `free8` | 规格8 | `free8` | String |
| 26 | `free9` | 规格9 | `free9` | String |
| 27 | `id` | ID | `id` | Long |
| 28 | `leadTimeFix` | 固定提前期 | `lead_time_fix` | Integer |
| 29 | `leadTimeLot` | 提前期批量 | `lead_time_lot` | Decimal |
| 30 | `leadTimePost` | 后段提前期 | `lead_time_post` | Integer |
| 31 | `leadTimePre` | 前段提前期 | `lead_time_pre` | Integer |
| 32 | `leadTimeRate` | 提前期系数 | `lead_time_rate` | Decimal |
| 33 | `lossRate` | 损耗率 | `loss_rate` | Decimal |
| 34 | `lotBatchQty` | 批量倍量 | `lot_batch_qty` | Decimal |
| 35 | `lotEcoQty` | 经济批量 | `lot_eco_qty` | Decimal |
| 36 | `lotFixedQty` | 固定批量 | `lot_fixed_qty` | Decimal |
| 37 | `lotRule` | 批量规则 | `lot_rule` | ItemLotRuleEnum |
| 38 | `lowLevelCode` | 最大低阶码 | `low_level_code` | Integer |
| 39 | `mainUnitId` | 主单位id | `main_unit_id` | Long |
| 40 | `materialId` | 制造物料 | `material_id` | Long |
| 41 | `modifier` | 修改人名称 | `modifier` | String |
| 42 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 43 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 44 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 45 | `orgId` | 计划组织 | `org_id` | String |
| 46 | `overDays` | 超期供给天数 | `over_days` | Integer |
| 47 | `planCategory` | 计划分类 | `plan_category_id` | Long |
| 48 | `planMethod` | 计划方法 | `plan_method` | ItemPlanMethodEnum |
| 49 | `planParamId` | 计划名称 | `plan_param_id` | Long |
| 50 | `planParamVersion` | 计划版本 | `plan_param_version` | Integer |
| 51 | `planProperty` | 计划属性 | `plan_property` | ItemPlanPropertyEnum |
| 52 | `planStaffId` | 计划员 | `plan_staff_id` | Long |
| 53 | `precision` | 主计量精度 | `precision` | Integer |
| 54 | `prepareFeed` | 是否长周期备料 | `prepare_feed` | Boolean |
| 55 | `productCode` | 物料编码 | `product_code` | String |
| 56 | `productId` | 物料 | `product_id` | Long |
| 57 | `pubts` | 时间戳 | `pubts` | DateTime |
| 58 | `purchaseStaffId` | 采购员 | `purchase_staff_id` | String |
| 59 | `recordId` | 运算快照id | `record_id` | fd0f9ce5-d5c7-43cb-812b-41733565df18 |
| 60 | `resetBackwardDays` | 重拍后移天数 | `reset_backward_days` | Integer |
| 61 | `resetForwardDays` | 重拍前移天数 | `reset_forward_days` | Integer |
| 62 | `safetyStock` | 安全库存 | `safety_stock` | Decimal |
| 63 | `skuId` | SKU | `sku_id` | Long |
| 64 | `specialMaterials` | 是否专用料 | `special_materials` | Boolean |
| 65 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 66 | `timeFenceId` | 计划策略 | `time_fence_id` | Long |
| 67 | `trackNumber` | 跟踪号 | `track_number` | String |
| 68 | `truncationType` | 舍位方式 | `truncation_type` | ItemTruncationTypeEnum |
| 69 | `vendorId` | 供应商 | `vendor_id` | Long |
| 70 | `virtualPart` | 是否虚拟件 | `virtual_part` | Boolean |
| 71 | `wasteRate` | 废品率 | `waste_rate` | Decimal |
| 72 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（5个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `recordId` | 运算快照id | `mr.rpadata.Record` | None | true |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 4 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 5 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
