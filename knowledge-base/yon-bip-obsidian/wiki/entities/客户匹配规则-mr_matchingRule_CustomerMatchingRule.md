---
tags: ["BIP", "元数据", "数据字典", "MR", "mr.matchingRule.CustomerMatchingRule"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 客户匹配规则 (`mr.matchingRule.CustomerMatchingRule`)

> MR | 物理表：`mr_customer_macthing_rule`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 客户匹配规则 |
| 物理表 | `mr_customer_macthing_rule` |
| 数据库 schema | `yonbip-mm-plan` |
| 所属应用 | `MR` |
| 构建时间 | `2026-06-05 15:12:28.3730` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 | 工厂 |

---

## 直接属性（19个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 2 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 3 | `id` | ID | `id` | Long |
| 4 | `orgId` | 工厂 | `org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 5 | `matchingRuleId` | 匹配规则id | `matching_rule_id` | bacac19a-6cdf-4006-bb9d-9a46176da2e9 |
| 6 | `name` | 名称 | `name` | String |
| 7 | `rule` | 匹配规则 | `rule` | matchingRuleWhetherStrictEnum |
| 8 | `dimension` | 匹配维度 | `dimension` | customerInformationMatchingDimensionEnum |
| 9 | `customerId` | 客户id | `customer_id` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 |
| 10 | `datasub` | 应用来源 | `datasub` | String |
| 11 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 12 | `creator` | 创建人名称 | `creator` | String |
| 13 | `createDate` | 创建日期 | `create_date` | Date |
| 14 | `createTime` | 创建时间 | `create_time` | DateTime |
| 15 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 16 | `modifier` | 修改人名称 | `modifier` | String |
| 17 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 18 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 19 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（7个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `customerId` | 客户id | `aa.merchant.Merchant` | Service |  |
| 3 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 4 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 5 | `matchingRuleId` | 匹配规则id | `mr.matchingRule.MatchingRule` | None | true |
| 6 | `orgId` | 工厂 | `aa.baseorg.OrgMV` | Service |  |
| 7 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
