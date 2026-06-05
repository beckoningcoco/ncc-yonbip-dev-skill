---
tags: ["BIP", "元数据", "数据字典", "DCRP", "cmp.dailydemandcapacity.DocWcAllocation"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 单据加工中心分配关系 (`cmp.dailydemandcapacity.DocWcAllocation`)

> DCRP | 物理表：`cmp_doc_wc_allocation`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 单据加工中心分配关系 |
| 物理表 | `cmp_doc_wc_allocation` |
| 数据库 schema | `yonbip-mm-plan` |
| 所属应用 | `DCRP` |
| 构建时间 | `2026-06-05 13:59:28.0740` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（37个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | ID | `id` | Long |
| 3 | `calculateId` | 产能运算ID | `calculate_id` | 12a493ee-e7d1-4aac-b52d-8dd0dc02121b |
| 4 | `constraintRuleVerId` | 排产版本 | `constraint_rule_ver_id` | 1c76a52f-4c51-4554-9bec-dc552617ce6c |
| 5 | `capacityDemand` | 能力需求(订单) | `capacity_demand_id` | c09df742-e522-466c-a5ac-757f34e80092 |
| 6 | `srcDocId` | 能力需求来源ID(订单ID) | `src_doc_id` | Long |
| 7 | `srcDocType` | 能力需求来源类型 | `src_doc_type` | String |
| 8 | `demandCapacityId` | 工艺约束 | `demand_capacity_id` | 1550bbc9-2eed-432c-84cd-6c36a16d9507 |
| 9 | `srcRouteId` | 工艺约束来源ID | `src_route_id` | Long |
| 10 | `srcRouteType` | 工艺约束来源类型 | `src_route_type` | String |
| 11 | `routeLineId` | 工艺约束行 | `route_line_id` | bd70e207-3153-4d6f-8a3f-11dae94555da |
| 12 | `capacityObject` | 加工中心 | `capacity_object` | e3034100-f166-46e1-b750-d85fb84474b7 |
| 13 | `srcWCId` | 加工中心来源ID(工作中心/生产线) | `src_wc_id` | Long |
| 14 | `srcWCType` | 加工中心来源类型 | `src_wc_type` | String |
| 15 | `quantity` | 数量 | `quantity` | Decimal |
| 16 | `unit` | 单位 | `unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 17 | `mainQuantity` | 主数量 | `main_quantity` | Decimal |
| 18 | `mainUnit` | 主单位 | `main_unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 19 | `dosageUnit` | 单位用量(小时) | `dosage_unit` | Decimal |
| 20 | `mainDosageUnit` | 单位用量(主单位)(小时) | `main_dosage_unit` | Decimal |
| 21 | `conversionRate` | 换算率 | `conversion_rate` | Decimal |
| 22 | `dataClassType` | 数据类类型 | `data_class_type` | String |
| 23 | `dataClassItem` | 数据类项 | `data_class_item` | String |
| 24 | `dataClassSubItem` | 数据子项 | `data_class_sub_item` | String |
| 25 | `appScene` | 应用场景 | `app_scene` | String |
| 26 | `dr` | 逻辑删除标记 | `dr` | Short |
| 27 | `createTime` | 创建时间 | `create_time` | DateTime |
| 28 | `createDate` | 创建日期 | `create_date` | Date |
| 29 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 30 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 31 | `creator` | 创建人名称 | `creator` | String |
| 32 | `modifier` | 修改人名称 | `modifier` | String |
| 33 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 34 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 35 | `pubts` | 时间戳 | `pubts` | DateTime |
| 36 | `conversionRateDen` | 换算率分母 | `conversion_rateden` | Decimal |
| 37 | `conversionRateNum` | 换算率分子 | `conversion_ratenum` | Decimal |

---

## 关联属性（11个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `mainUnit` | 主单位 | `pc.unit.Unit` | Service |  |
| 2 | `unit` | 单位 | `pc.unit.Unit` | Service |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `constraintRuleVerId` | 排产版本 | `cmp.constraintRuleVersion.ConstraintRuleVersion` | None |  |
| 5 | `routeLineId` | 工艺约束行 | `cmp.demandcapacity.DemandCapacityList` | None |  |
| 6 | `calculateId` | 产能运算ID | `cmp.capacitycalculate.CapacityCalculate` | None |  |
| 7 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 8 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 9 | `capacityObject` | 加工中心 | `cmp.capacityobject.CapacityObject` | None |  |
| 10 | `capacityDemand` | 能力需求(订单) | `cmp.capacitydemand.CapacityDemand` | None |  |
| 11 | `demandCapacityId` | 工艺约束 | `cmp.demandcapacity.DemandCapacity` | None |  |
