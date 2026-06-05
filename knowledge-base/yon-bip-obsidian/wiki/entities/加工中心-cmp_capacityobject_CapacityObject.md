---
tags: ["BIP", "元数据", "数据字典", "DCRP", "cmp.capacityobject.CapacityObject"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 加工中心 (`cmp.capacityobject.CapacityObject`)

> DCRP | 物理表：`cmp_capacity_object`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 加工中心 |
| 物理表 | `cmp_capacity_object` |
| 数据库 schema | `yonbip-mm-plan` |
| 所属应用 | `DCRP` |
| 构建时间 | `2026-06-05 13:59:09.8920` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `code` | String | 编码 |

---

## 直接属性（66个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | ID | `id` | Long |
| 3 | `orgId` | 组织 | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 4 | `code` | 编码 | `code` | String |
| 5 | `name` | 名称 | `name` | String |
| 6 | `departmentId` | 部门 | `department_id` | 8e8fa65a-f8d9-454d-a8f8-4b7af543cdd5 |
| 7 | `calculateMark` | 计算能力标识 | `calculate_mark` | Short |
| 8 | `memo` | 备注 | `memo` | String |
| 9 | `defineCharacter` | 加工中心自定义项 | `define_character` | 9bf0e5ad-1845-4af8-af1e-17d7295c241d |
| 10 | `sourceType` | 来源对象类型 | `source_type` | String |
| 11 | `sourceId` | 来源对象ID | `source_id` | Long |
| 12 | `calculateId` | 产能运算ID | `calculate_id` | 12a493ee-e7d1-4aac-b52d-8dd0dc02121b |
| 13 | `overLoadRate` | 超载率 | `over_load_rate` | Decimal |
| 14 | `lowLoadRate` | 低载率 | `low_load_rate` | Decimal |
| 15 | `constraintRuleVerId` | 排产版本 | `constraint_rule_ver_id` | 1c76a52f-4c51-4554-9bec-dc552617ce6c |
| 16 | `quantity` | 数量 | `quantity` | Decimal |
| 17 | `capacityValue` | 能力值 | `capacity_value` | Decimal |
| 18 | `availability` | 利用率 | `availability` | Decimal |
| 19 | `limitCapacityMark` | 有限能力标识 | `limit_capacity_mark` | Short |
| 20 | `effectiveDate` | 生效日期 | `effective_date` | DateTime |
| 21 | `expiryDate` | 失效日期 | `expiry_date` | DateTime |
| 22 | `workCalendar` | 工作日历 | `work_calendar` | 54e52ba8-a2cf-47cc-b47b-95fc6f4dffbd |
| 23 | `outsourcing` | 是否委外标识 | `outsourcing` | Short |
| 24 | `providerId` | 委外商 | `provider_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 25 | `bottleneckWorkCenter` | 瓶颈工作中心 | `bottleneck_workcenter` | Short |
| 26 | `parentWorkCenter` | 上级工作中心 | `parent_workcenter_id` | 2c63b6a3-15b5-49e8-bd53-72b1ddab2d0f |
| 27 | `powerUnitType` | 能力单位类型 | `power_unit_type` | String |
| 28 | `outputUnit` | 产量单位 | `output_unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 29 | `standardOutput` | 标准产量 | `standard_output` | Decimal |
| 30 | `maxOutput` | 最大产量 | `max_output` | Decimal |
| 31 | `productionRate` | 生产速率 | `production_rate` | Decimal |
| 32 | `productionRateUnit` | 生产速率单位 | `production_rate_unit` | String |
| 33 | `dataClassType` | 数据类类型 | `data_class_type` | String |
| 34 | `dataClassItem` | 数据类项 | `data_class_item` | String |
| 35 | `workCalendarName` | 工作日历名称 | `work_calendar_name` | String |
| 36 | `capacityAdjustMark` | 能力调节标志 | `capacity_adjust_mark` | Short |
| 37 | `excessCoefficient` | 超额系数 | `excess_coefficient` | Decimal |
| 38 | `timeUnit` | 时间单位 | `time_unit` | String |
| 39 | `bussinessKey` | 业务主键 | `bussiness_key` | String |
| 40 | `dataType` | 数据类型 | `data_type` | Integer |
| 41 | `workTime` | 工作时间 | `work_time` | Decimal |
| 42 | `productId` | 物料ID | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 43 | `freeCharacteristics` | 自由项特征组 | `free_characteristics` | ff233410-3d86-4af4-a16b-335474944540 |
| 44 | `unit` | 计量单位 | `unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 45 | `mainUnit` | 主计量单位 | `main_unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 46 | `conversionRate` | 换算率 | `conversion_rate` | Decimal |
| 47 | `dr` | 逻辑删除标记 | `dr` | Short |
| 48 | `enable` | 启用 | `enable` | sys_intboolean |
| 49 | `enablets` | 启用时间 | `enablets` | DateTime |
| 50 | `disablets` | 停用时间 | `disablets` | DateTime |
| 51 | `createTime` | 创建时间 | `create_time` | DateTime |
| 52 | `createDate` | 创建日期 | `create_date` | Date |
| 53 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 54 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 55 | `creator` | 创建人名称 | `creator` | String |
| 56 | `modifier` | 修改人名称 | `modifier` | String |
| 57 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 58 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 59 | `pubts` | 时间戳 | `pubts` | DateTime |
| 60 | `capacityObjectLocs` | 能力对象位置 | `` | 70f2a2a3-4e8a-4141-935c-c3dc89925137 |
| 61 | `conversionRateDen` | 换算率分母 | `conversion_rateden` | Decimal |
| 62 | `conversionRateNum` | 换算率分子 | `conversion_ratenum` | Decimal |
| 63 | `moldCavityQty` | 模腔数 | `mold_cavity_qty` | Integer |
| 64 | `objectAdjustList` | 加工中心调整明细 | `` | 4bd3db92-0477-406f-9e6f-8a2b6b2cc4d1 |
| 65 | `objectCapacityList` | 加工中心清单 | `` | 33487762-ab7d-408b-913b-9a1bd8ec6b4d |
| 66 | `shiftSegmentConfigs` | 加工中心班次配置 | `` | 3a5a5607-2098-427b-a2ae-e24d4f6f9ed2 |

---

## 关联属性（20个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `mainUnit` | 主计量单位 | `pc.unit.Unit` | Service |  |
| 2 | `productId` | 物料ID | `pc.product.Product` | Service |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `constraintRuleVerId` | 排产版本 | `cmp.constraintRuleVersion.ConstraintRuleVersion` | None |  |
| 5 | `departmentId` | 部门 | `aa.baseorg.DeptMV` | Service |  |
| 6 | `calculateId` | 产能运算ID | `cmp.capacitycalculate.CapacityCalculate` | None |  |
| 7 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 8 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 9 | `parentWorkCenter` | 上级工作中心 | `ed.workcenter.WorkCenter` | Service |  |
| 10 | `workCalendar` | 工作日历 | `calendar.workingCalendar.WorkingCalendar` | Service |  |
| 11 | `shiftSegmentConfigs` | 加工中心班次配置 | `cmp.capacityobject.ShiftSegmentConfig` | None | true |
| 12 | `objectCapacityList` | 加工中心清单 | `cmp.capacityobject.ObjectCapacityList` | None | true |
| 13 | `orgId` | 组织 | `org.func.BaseOrg` | Service |  |
| 14 | `unit` | 计量单位 | `pc.unit.Unit` | Service |  |
| 15 | `freeCharacteristics` | 自由项特征组 | `cmp.capacityobject.CapacityObjectFCT` | None |  |
| 16 | `providerId` | 委外商 | `aa.vendor.Vendor` | Service |  |
| 17 | `capacityObjectLocs` | 能力对象位置 | `cmp.capacityobject.CapacityObjectLoc` | None | true |
| 18 | `outputUnit` | 产量单位 | `pc.unit.Unit` | Service |  |
| 19 | `defineCharacter` | 加工中心自定义项 | `cmp.capacityobject.CapacityObjectDefineCharacter` | None |  |
| 20 | `objectAdjustList` | 加工中心调整明细 | `cmp.capacityobject.CapacityObjectAdjust` | None | true |
