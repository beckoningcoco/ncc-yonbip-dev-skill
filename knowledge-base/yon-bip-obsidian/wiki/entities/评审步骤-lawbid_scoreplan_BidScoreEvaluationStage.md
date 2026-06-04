---
tags: ["BIP", "元数据", "数据字典", "lawbid.scoreplan.BidScoreEvaluationStage"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 评审步骤 (`lawbid.scoreplan.BidScoreEvaluationStage`)

> **平台版本：BIP 旗舰版 V5**

>  模块 | 物理表：`cpu_score_evaluation_stage`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 评审步骤 |
| 物理表 | `cpu_score_evaluation_stage` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `` |
| 构建时间 | `2026-06-04 20:16:45.8480` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

## 部署信息

- 部署时间: 2025-10-24 23:57:33:000

## 依赖接口（4个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 2 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |
| 3 | 企业ID | `cpu.itf.IEnterprise` | 6 |
| 4 | 跨租户采购商租户接口 | `cpu.itf.IBuyerTenant` | 10 |

---

## 直接属性（12个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `bidScorePlanId` | 评标模板ID | `bid_score_template_id` | 47d2f6a7-a9be-4eb1-af5f-b15b0564d14a |
| 2 | `bidSectionId` | 标段ID | `bid_section_id` | 0409e7d6-ed4c-4c0d-bc0d-dde79bdbf461 |
| 3 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 4 | `currentEvaluationStageId` | 开评标阶段id | `current_evaluation_stage_id` | 4d4d2764-485a-496c-a32c-c4f9478a5fc9 |
| 5 | `dr` | 逻辑删除标记 | `dr` | Short |
| 6 | `enterpriseId` | 所属租户id | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 7 | `evaluationTypes` | 评审内容 | `` | fa5d5b30-b1c3-41d9-b8cb-0b1a235c8f17 |
| 8 | `finalResultWay` | 淘汰供应商的最低分 | `final_result_way` | String |
| 9 | `finalResultWayType` | 评分是否淘汰供应商 | `final_result_way_type` | String |
| 10 | `id` | ID | `id` | Long |
| 11 | `pubts` | 时间戳 | `pubts` | DateTime |
| 12 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（6个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `currentEvaluationStageId` | 开评标阶段id | `lawbid.evaluationstage.SectionEvaluationStageArchives` | None |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `evaluationTypes` | 评审内容 | `lawbid.scoreplan.BidScoreEvaluationType` | None | true |
| 4 | `bidScorePlanId` | 评标模板ID | `lawbid.scoreplan.BidScorePlan` | None | true |
| 5 | `enterpriseId` | 所属租户id | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 6 | `bidSectionId` | 标段ID | `lawbid.section.LawbidSection` | None |  |
