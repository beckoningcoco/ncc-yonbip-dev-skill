---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.scoringgroup.ScoringGroupExpertAuthVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 评标专家权限 (`lawbid.scoringgroup.ScoringGroupExpertAuthVO`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_scoring_group_expert_authority`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 评标专家权限 |
| 物理表 | `cpu_scoring_group_expert_authority` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 20:02:53.3610` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

## 部署信息

- 部署时间: 2025-10-24 23:57:34:000

## 依赖接口（3个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 2 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |
| 3 | 跨租户采购商租户接口 | `cpu.itf.IBuyerTenant` | 10 |

---

## 直接属性（18个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `bidScoreItemId` | 评标环节指标项 | `bid_score_item_id` | 926220d5-7691-44b6-9d7e-3b5264ca8f7c |
| 2 | `bidScoreSegmentId` | 评分环节 | `bid_score_segment_id` | 89b6414c-2d9a-4b4f-9faa-a2cbdd58f101 |
| 3 | `bidScoreTemplateId` | 评分模板 | `bid_score_template_id` | 47d2f6a7-a9be-4eb1-af5f-b15b0564d14a |
| 4 | `bidSectionId` | 标段(包) | `bid_section_id` | 0409e7d6-ed4c-4c0d-bc0d-dde79bdbf461 |
| 5 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 6 | `dr` | 逻辑删除标记 | `dr` | Short |
| 7 | `enterpriseId` | 租户 | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 8 | `enterpriseName` | 租户名 | `enterprise_name` | String |
| 9 | `id` | id | `id` | Long |
| 10 | `itemName` | 指标名称 | `item_name` | String |
| 11 | `lawbidSystemId` | 原始主键 | `lawbid_system_id` | Long |
| 12 | `pubts` | 时间戳 | `pubts` | DateTime |
| 13 | `scoringGroupId` | 评标组 | `scoring_group_id` | bd52c08b-9c24-45c6-b5ba-6209956c1411 |
| 14 | `segmentIndex` | 评分模板环节序号 | `segment_index` | Integer |
| 15 | `segmentName` | 环节名称 | `segment_name` | String |
| 16 | `templatePropertyCodes` | 评标模板环节属性编码 | `template_property_codes` | String |
| 17 | `templatePropertyNames` | 评标模板环节属性名称 | `template_property_names` | String |
| 18 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（7个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `bidScoreSegmentId` | 评分环节 | `lawbid.scoreplan.BidScorePlanSegment` | None |  |
| 2 | `bidScoreItemId` | 评标环节指标项 | `lawbid.scoreplan.BidScorePlanItem` | None |  |
| 3 | `bidScoreTemplateId` | 评分模板 | `lawbid.scoreplan.BidScorePlan` | None |  |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 5 | `scoringGroupId` | 评标组 | `lawbid.scoringgroup.ScoringGroupVO` | None | true |
| 6 | `enterpriseId` | 租户 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 7 | `bidSectionId` | 标段(包) | `lawbid.section.LawbidSection` | None |  |
