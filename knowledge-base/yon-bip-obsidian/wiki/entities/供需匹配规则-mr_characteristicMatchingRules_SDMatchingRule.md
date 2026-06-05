---
tags: ["BIP", "元数据", "数据字典", "MR", "mr.characteristicMatchingRules.SDMatchingRule"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 供需匹配规则 (`mr.characteristicMatchingRules.SDMatchingRule`)

> MR | 物理表：`mr_sd_matching_rule`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 供需匹配规则 |
| 物理表 | `mr_sd_matching_rule` |
| 数据库 schema | `yonbip-mm-plan` |
| 所属应用 | `MR` |
| 构建时间 | `2026-06-05 15:12:08.2860` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（16个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `characteristicMatchingRules` | 特征供需匹配规则 | `` | fe5b515c-6087-4000-b979-0b6f2835443a |
| 2 | `createDate` | 创建日期 | `create_date` | Date |
| 3 | `createTime` | 创建时间 | `create_time` | DateTime |
| 4 | `creator` | 创建人名称 | `creator` | String |
| 5 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 6 | `datasub` | 应用来源 | `datasub` | String |
| 7 | `id` | ID | `id` | Long |
| 8 | `inventoryMode` | 项目库存料匹配方式 | `inventory_mode` | String |
| 9 | `inventoryRule` | 项目库存料匹配规则 | `inventory_rule` | String |
| 10 | `modifier` | 修改人名称 | `modifier` | String |
| 11 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 12 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 13 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 14 | `orgId` | 工厂 | `org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 15 | `pubts` | 时间戳 | `pubts` | DateTime |
| 16 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（5个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 3 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 4 | `orgId` | 工厂 | `aa.baseorg.OrgMV` | Service |  |
| 5 | `characteristicMatchingRules` | 特征供需匹配规则 | `mr.characteristicMatchingRules.CharacteristicMatchingRules` | None | true |
