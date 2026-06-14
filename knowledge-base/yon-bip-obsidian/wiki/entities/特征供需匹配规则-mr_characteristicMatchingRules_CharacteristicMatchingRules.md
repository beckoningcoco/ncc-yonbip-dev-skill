---
tags: ["BIP", "元数据", "数据字典", "MR", "mr.characteristicMatchingRules.CharacteristicMatchingRules"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 特征供需匹配规则 (`mr.characteristicMatchingRules.CharacteristicMatchingRules`)

> MR | 物理表：`mr_characteristic_matching_rules`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 特征供需匹配规则 |
| 物理表 | `mr_characteristic_matching_rules` |
| domain/服务域 | `yonbip-mm-plan` |
| schema | `requirements_planning` |
| 所属应用 | `MR` |
| 构建时间 | `2026-06-05 15:10:36.2620` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `dimension` | CharacteristicDimensionEnum | 匹配维度 |

---

## 直接属性（24个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 2 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 3 | `id` | ID | `id` | Long |
| 4 | `orgId` | 工厂 | `org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 5 | `rule` | 匹配规则 | `rule` | matchingRuleWhetherStrictEnum |
| 6 | `dimension` | 匹配维度 | `dimension` | CharacteristicDimensionEnum |
| 7 | `characteristicsId` | 特征组id | `characteristics_id` | 2bbf5f38-d9cd-41f4-828c-936c89972323 |
| 8 | `charactorId` | 特征id | `charactor_id` | 1a5d304f-40a4-47a2-a075-f8b5ab6af37b |
| 9 | `name` | 特征名称 | `name` | String |
| 10 | `charactorCode` | 特征编码 | `charactor_code` | String |
| 11 | `charactorDataType` | 特征数据类型 | `charactor_data_type` | Short |
| 12 | `charactorPrecision` | 特征精度 | `charactor_precision` | Integer |
| 13 | `datasub` | 应用来源 | `datasub` | String |
| 14 | `creator` | 创建人名称 | `creator` | String |
| 15 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 16 | `createDate` | 创建日期 | `create_date` | Date |
| 17 | `createTime` | 创建时间 | `create_time` | DateTime |
| 18 | `modifier` | 修改人名称 | `modifier` | String |
| 19 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 20 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 21 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 22 | `pubts` | 时间戳 | `pubts` | DateTime |
| 23 | `SDMatchingRuleId` | 供需匹配规则ID | `sd_matching_rule_id` | b6c0fa75-5289-4ff5-896a-67e4db867438 |
| 24 | `characteristicMatchingRuleDetail` | 特征匹配规则子表 | `` | 0e0d3c0a-63f4-4090-85c6-3df07d12b06f |

---

## 关联属性（9个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `characteristicsId` | 特征组id | `base.character.Characteristics` | Service |  |
| 2 | `charactorId` | 特征id | `base.character.Character` | Service |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `characteristicMatchingRuleDetail` | 特征匹配规则子表 | `mr.characteristicMatchingRules.CharacteristicMatchingRuleDetail` | None | true |
| 5 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 6 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 7 | `SDMatchingRuleId` | 供需匹配规则ID | `mr.characteristicMatchingRules.SDMatchingRule` | None | true |
| 8 | `orgId` | 工厂 | `aa.baseorg.OrgMV` | Service |  |
| 9 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
