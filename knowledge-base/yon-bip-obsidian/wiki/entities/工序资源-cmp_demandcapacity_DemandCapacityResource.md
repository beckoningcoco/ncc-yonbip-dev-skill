---
tags: ["BIP", "元数据", "数据字典", "DCRP", "cmp.demandcapacity.DemandCapacityResource"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 工序资源 (`cmp.demandcapacity.DemandCapacityResource`)

> DCRP | 物理表：`cmp_demand_capacity_resource`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 工序资源 |
| 物理表 | `cmp_demand_capacity_resource` |
| domain/服务域 | `yonbip-mm-plan` |
| schema | `requirements_planning` |
| 所属应用 | `DCRP` |
| 构建时间 | `2026-06-05 14:00:29.1680` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（28个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | ID | `id` | Long |
| 3 | `routeLineId` | 工艺约束行 | `route_line_id` | bd70e207-3153-4d6f-8a3f-11dae94555da |
| 4 | `serialNo` | 顺序号 | `serial_no` | Decimal |
| 5 | `capacityType` | 能力类型 | `capacity_type` | String |
| 6 | `capacityObjectId` | 加工中心 | `capacity_object_id` | e3034100-f166-46e1-b750-d85fb84474b7 |
| 7 | `priority` | 优先级 | `priority` | Short |
| 8 | `quantity` | 用量 | `quantity` | Decimal |
| 9 | `unit` | 单位 | `unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 10 | `memo` | 备注 | `memo` | String |
| 11 | `usageType` | 用量类型 | `usage_type` | Integer |
| 12 | `mainQuantity` | 主计量调节数量 | `main_quantity` | Decimal |
| 13 | `mainUnit` | 主单位 | `main_unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 14 | `conversionRate` | 换算率 | `conversion_rate` | Decimal |
| 15 | `denominatorQuantity` | 母件底数 | `denominator_quantity` | Decimal |
| 16 | `createTime` | 创建时间 | `create_time` | DateTime |
| 17 | `createDate` | 创建日期 | `create_date` | Date |
| 18 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 19 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 20 | `creator` | 创建人名称 | `creator` | String |
| 21 | `modifier` | 修改人名称 | `modifier` | String |
| 22 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 23 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 24 | `pubts` | 时间戳 | `pubts` | DateTime |
| 25 | `conversionRateDen` | 换算率分母 | `conversion_rateden` | Decimal |
| 26 | `conversionRateNum` | 换算率分子 | `conversion_ratenum` | Decimal |
| 27 | `moldCavityLocs` | 模腔位置 | `mold_cavity_locs` | String |
| 28 | `moldCavityQty` | 模腔数 | `mold_cavity_qty` | Integer |

---

## 关联属性（7个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `mainUnit` | 主单位 | `pc.unit.Unit` | Service |  |
| 2 | `unit` | 单位 | `pc.unit.Unit` | Service |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `routeLineId` | 工艺约束行 | `cmp.demandcapacity.DemandCapacityList` | None | true |
| 5 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 6 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 7 | `capacityObjectId` | 加工中心 | `cmp.capacityobject.CapacityObject` | None |  |
