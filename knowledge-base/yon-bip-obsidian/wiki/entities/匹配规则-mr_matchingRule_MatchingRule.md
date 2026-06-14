---
tags: ["BIP", "元数据", "数据字典", "MR", "mr.matchingRule.MatchingRule"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 匹配规则 (`mr.matchingRule.MatchingRule`)

> MR | 物理表：`mr_matching_rule`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 匹配规则 |
| 物理表 | `mr_matching_rule` |
| domain/服务域 | `yonbip-mm-plan` |
| schema | `requirements_planning` |
| 所属应用 | `MR` |
| 构建时间 | `2026-06-05 15:11:53.9290` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（10个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `charactorMatchingRules` | 特征匹配规则 | `` | bbd7a4a0-f927-47e1-b81b-103252799180 |
| 2 | `createTime` | 创建时间 | `create_time` | DateTime |
| 3 | `customerMatchingRules` | 客户匹配规则 | `` | 2aea5384-1afb-44e8-bb3e-11647414485c |
| 4 | `id` | ID | `id` | Long |
| 5 | `name` | 名称 | `name` | String |
| 6 | `orgId` | 工厂 | `org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 7 | `pubts` | 时间戳 | `pubts` | DateTime |
| 8 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 9 | `transactionTypes` | 交易类型 | `` | 7a07b337-4829-40f7-88c7-e6c8d46c98bd |
| 10 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（6个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `customerMatchingRules` | 客户匹配规则 | `mr.matchingRule.CustomerMatchingRule` | None | true |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `transactionTypes` | 交易类型 | `mr.matchingRule.TransactionType` | None | true |
| 4 | `charactorMatchingRules` | 特征匹配规则 | `mr.matchingRule.CharactorMatchingRule` | None | true |
| 5 | `orgId` | 工厂 | `aa.baseorg.OrgMV` | Service |  |
| 6 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
