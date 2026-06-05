---
tags: ["BIP", "元数据", "数据字典", "DCRP", "cmp.usages.DemandCapacityUsages"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 排产结果接口表 (`cmp.usages.DemandCapacityUsages`)

> DCRP | 物理表：`cmp_demand_capacity_usages`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 排产结果接口表 |
| 物理表 | `cmp_demand_capacity_usages` |
| 数据库 schema | `yonbip-mm-plan` |
| 所属应用 | `DCRP` |
| 构建时间 | `2026-06-05 13:57:58.4560` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（40个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | ID | `id` | Long |
| 3 | `orgId` | 计划组织 | `org_id` | String |
| 4 | `constraintRuleVerId` | 排产版本 | `constraint_rule_ver_id` | Long |
| 5 | `calculateId` | 产能运算ID | `calculate_id` | Long |
| 6 | `demandOrgId` | 需求组织 | `demand_org_id` | String |
| 7 | `capacityDemandId` | 能力需求ID | `capacity_demand_id` | Long |
| 8 | `capacityDemandDate` | 能力需求日期 | `capacity_demand_date` | DateTime |
| 9 | `supplyOrgId` | 供应组织 | `supply_org_id` | String |
| 10 | `demandCapacityId` | 工艺约束ID | `demand_capacity_id` | Long |
| 11 | `routeLineId` | 工艺约束行 | `route_line_id` | Long |
| 12 | `operationSerialNo` | 工序顺序号 | `operation_serial_no` | Decimal |
| 13 | `capacityObject` | 加工中心 | `capacity_object` | Long |
| 14 | `constraintDate` | 排产日期 | `constraint_date` | DateTime |
| 15 | `shiftId` | 班次 | `shift_id` | Long |
| 16 | `serialNo` | 排产顺序号 | `serial_no` | Decimal |
| 17 | `schedulingQuantity` | 排产数量 | `scheduling_quantity` | Decimal |
| 18 | `unit` | 排产单位 | `unit` | Long |
| 19 | `mainQuantity` | 排产主单位数量 | `main_quantity` | Decimal |
| 20 | `mainUnit` | 排产主单位 | `main_unit` | Long |
| 21 | `conversionRate` | 换算率 | `conversion_rate` | Decimal |
| 22 | `demandType` | 占用类型 | `demand_type` | String |
| 23 | `demandCapacity` | 占用时间 | `demand_capacity` | Decimal |
| 24 | `timeUnit` | 时间单位 | `time_unit` | String |
| 25 | `schedulingStartDate` | 排产开始时间 | `scheduling_start_date` | DateTime |
| 26 | `schedulingEndDate` | 排产结束时间 | `scheduling_end_date` | DateTime |
| 27 | `srcSysType` | 数据来源系统 | `src_sys_type` | Long |
| 28 | `srcFlag` | 数据来源标识 | `src_flag` | Long |
| 29 | `createTime` | 创建时间 | `create_time` | DateTime |
| 30 | `createDate` | 创建日期 | `create_date` | Date |
| 31 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 32 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 33 | `creator` | 创建人名称 | `creator` | String |
| 34 | `modifier` | 修改人名称 | `modifier` | String |
| 35 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 36 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 37 | `pubts` | 时间戳 | `pubts` | DateTime |
| 38 | `conversionRateDen` | 换算率分母 | `conversion_rateden` | Decimal |
| 39 | `conversionRateNum` | 换算率分子 | `conversion_ratenum` | Decimal |
| 40 | `dailyUsageLocs` | 排产结果接口表位置明细 | `` | 9ba48103-8326-4972-971f-d7dc3564fae0 |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `dailyUsageLocs` | 排产结果接口表位置明细 | `cmp.usages.DemandCapacityUsagesLoc` | None | true |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 4 | `modifierId` | 修改人 | `base.user.User` | Service |  |
