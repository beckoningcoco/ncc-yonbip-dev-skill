---
tags: ["BIP", "元数据", "数据字典", "MR", "mr.characteristicMatchingRules.CharacteristicMatchingRuleDetail"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 特征匹配规则子表 (`mr.characteristicMatchingRules.CharacteristicMatchingRuleDetail`)

> MR | 物理表：`mr_characteristic_matching_rules_detail`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 特征匹配规则子表 |
| 物理表 | `mr_characteristic_matching_rules_detail` |
| domain/服务域 | `yonbip-mm-plan` |
| schema | `requirements_planning` |
| 所属应用 | `MR` |
| 构建时间 | `2026-06-05 15:12:06.8210` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（17个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 2 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 3 | `id` | ID | `id` | Long |
| 4 | `charactorMatchingId` | 外键id | `charactor_match_id` | fe5b515c-6087-4000-b979-0b6f2835443a |
| 5 | `demandValue` | 需求值 | `demand_value` | Decimal |
| 6 | `supplyValue` | 供应值 | `supply_value` | String |
| 7 | `supplyPriority` | 供应优先级 | `supply_priority` | Integer |
| 8 | `datasub` | 应用来源 | `datasub` | String |
| 9 | `creator` | 创建人名称 | `creator` | String |
| 10 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 11 | `createDate` | 创建日期 | `create_date` | Date |
| 12 | `createTime` | 创建时间 | `create_time` | DateTime |
| 13 | `modifier` | 修改人名称 | `modifier` | String |
| 14 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 15 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 16 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 17 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（5个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 3 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 4 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
| 5 | `charactorMatchingId` | 外键id | `mr.characteristicMatchingRules.CharacteristicMatchingRules` | None | true |
