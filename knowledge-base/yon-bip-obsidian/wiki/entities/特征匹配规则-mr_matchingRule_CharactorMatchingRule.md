---
tags: ["BIP", "元数据", "数据字典", "MR", "mr.matchingRule.CharactorMatchingRule"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 特征匹配规则 (`mr.matchingRule.CharactorMatchingRule`)

> MR | 物理表：`mr_charactor_macthing_rule`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 特征匹配规则 |
| 物理表 | `mr_charactor_macthing_rule` |
| domain/服务域 | `yonbip-mm-plan` |
| schema | `requirements_planning` |
| 所属应用 | `MR` |
| 构建时间 | `2026-06-05 15:12:27.0060` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |
| 编码 | `org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 | 工厂 |

---

## 直接属性（24个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 2 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 3 | `id` | id | `id` | Long |
| 4 | `orgId` | 工厂 | `org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 5 | `matchingRuleId` | 匹配规则id | `matching_rule_id` | bacac19a-6cdf-4006-bb9d-9a46176da2e9 |
| 6 | `name` | 名称 | `name` | String |
| 7 | `rule` | 匹配规则 | `rule` | matchingRuleWhetherStrictEnum |
| 8 | `dimension` | 匹配维度 | `dimension` | charactorMatchingDimensionEnum |
| 9 | `voucherTransTypeId` | 交易类型 | `voucher_trans_type_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 10 | `charactorId` | 特征id | `charactor_id` | 1a5d304f-40a4-47a2-a075-f8b5ab6af37b |
| 11 | `charactorCode` | 特征编码 | `charactor_code` | String |
| 12 | `charactorDataType` | 特征数据类型 | `charactor_data_type` | Short |
| 13 | `charactorPrecision` | 特征精度 | `charactor_precision` | Integer |
| 14 | `datasub` | 应用来源 | `datasub` | String |
| 15 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 16 | `creator` | 创建人名称 | `creator` | String |
| 17 | `createDate` | 创建日期 | `create_date` | Date |
| 18 | `createTime` | 创建时间 | `create_time` | DateTime |
| 19 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 20 | `modifier` | 修改人名称 | `modifier` | String |
| 21 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 22 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 23 | `pubts` | 时间戳 | `pubts` | DateTime |
| 24 | `charactorMatchingRuleDetail` | 特征匹配规则子表 | `` | 489088ed-f1da-4922-bc74-085784576752 |

---

## 关联属性（9个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `charactorId` | 特征id | `base.character.Character` | Service |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 4 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 5 | `charactorMatchingRuleDetail` | 特征匹配规则子表 | `mr.matchingRule.CharactorMatchingRuleDetail` | None | true |
| 6 | `matchingRuleId` | 匹配规则id | `mr.matchingRule.MatchingRule` | None | true |
| 7 | `orgId` | 工厂 | `aa.baseorg.OrgMV` | Service |  |
| 8 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
| 9 | `voucherTransTypeId` | 交易类型 | `bd.bill.TransType` | Service |  |
