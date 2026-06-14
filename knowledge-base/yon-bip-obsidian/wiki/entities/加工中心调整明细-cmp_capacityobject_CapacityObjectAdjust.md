---
tags: ["BIP", "元数据", "数据字典", "DCRP", "cmp.capacityobject.CapacityObjectAdjust"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 加工中心调整明细 (`cmp.capacityobject.CapacityObjectAdjust`)

> DCRP | 物理表：`cmp_capacity_object_adj`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 加工中心调整明细 |
| 物理表 | `cmp_capacity_object_adj` |
| domain/服务域 | `yonbip-mm-plan` |
| schema | `requirements_planning` |
| 所属应用 | `DCRP` |
| 构建时间 | `2026-06-05 13:59:58.1200` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（25个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | ID | `id` | Long |
| 3 | `capacityObject` | 加工中心 | `capacity_object` | e3034100-f166-46e1-b750-d85fb84474b7 |
| 4 | `srcWCId` | 加工中心来源ID(工作中心/生产线) | `src_wc_id` | Long |
| 5 | `srcWCType` | 加工中心来源类型 | `src_wc_type` | String |
| 6 | `adjustedQuantity` | 调整数量 | `adjusted_quantity` | Decimal |
| 7 | `adjustedTime` | 调节工作时间 | `adjusted_time` | Decimal |
| 8 | `adjustDate` | 调节日期 | `adjust_date` | Date |
| 9 | `adjustmentType` | 调节类型 | `adjustment_type` | Integer |
| 10 | `unit` | 单位 | `unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 11 | `mainUnit` | 主单位 | `main_unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 12 | `mainAdjustedQuantity` | 主计量调节数量 | `main_adjusted_quantity` | Decimal |
| 13 | `conversionRate` | 换算率 | `conversion_rate` | Decimal |
| 14 | `unitExchangeType` | 换算方式 | `unit_exchange_type` | Short |
| 15 | `createTime` | 创建时间 | `create_time` | DateTime |
| 16 | `createDate` | 创建日期 | `create_date` | Date |
| 17 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 18 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 19 | `creator` | 创建人名称 | `creator` | String |
| 20 | `modifier` | 修改人名称 | `modifier` | String |
| 21 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 22 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 23 | `pubts` | 时间戳 | `pubts` | DateTime |
| 24 | `conversionRateDen` | 换算率分母 | `conversion_rateden` | Decimal |
| 25 | `conversionRateNum` | 换算率分子 | `conversion_ratenum` | Decimal |

---

## 关联属性（6个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `mainUnit` | 主单位 | `pc.unit.Unit` | Service |  |
| 2 | `unit` | 单位 | `pc.unit.Unit` | Service |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 5 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 6 | `capacityObject` | 加工中心 | `cmp.capacityobject.CapacityObject` | None | true |
