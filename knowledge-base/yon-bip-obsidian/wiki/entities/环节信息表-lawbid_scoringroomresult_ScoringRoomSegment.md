---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.scoringroomresult.ScoringRoomSegment"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 环节信息表 (`lawbid.scoringroomresult.ScoringRoomSegment`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_mark_result_describe`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 环节信息表 |
| 物理表 | `cpu_mark_result_describe` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 19:24:58.9680` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 主键 |
| 编码 | `id` | Long | 主键 |

## 部署信息

- 部署时间: 2025-10-24 23:58:06:000

## 依赖接口（4个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 2 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |
| 3 | 跨租户采购商租户接口 | `cpu.itf.IBuyerTenant` | 10 |
| 4 | lawbidTenant租户相关 | `lawbid.itf.ITenant` | 2 |

---

## 直接属性（26个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 2 | `dr` | 逻辑删除标记 | `dr` | Short |
| 3 | `multipleCurrentStage` | 招标阶段 | `multiple_current_stage` | Integer |
| 4 | `pubts` | 时间戳 | `pubts` | DateTime |
| 5 | `scoringGroupId` | 评标组 | `group_id` | c67f065b-c2cc-4b6b-ab41-acf2ba3956f2 |
| 6 | `ts` | 默认值 | `ts` | DateTime |
| 7 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 8 | `id` | 主键 | `id` | Long |
| 9 | `tenantId` | tenantId | `tenant_id` | String |
| 10 | `enterpriseId` | 租户id | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 11 | `enterpriseName` | 租户名称 | `enterprise_name` | String |
| 12 | `bidProjectId` | 招标方案主表ID | `bid_project_id` | 070c3520-bf5d-4b3e-a523-59e73d9f6349 |
| 13 | `bidSectionId` | 招标方案标段包ID | `bid_section_id` | 0409e7d6-ed4c-4c0d-bc0d-dde79bdbf461 |
| 14 | `bidScoreTemplateId` | 评分模板主键 | `bid_score_template_id` | 47d2f6a7-a9be-4eb1-af5f-b15b0564d14a |
| 15 | `bidScoreSegmentId` | 评分环节主键 | `bid_score_segment_id` | 89b6414c-2d9a-4b4f-9faa-a2cbdd58f101 |
| 16 | `currentSegment` | 当前环节 | `current_segment` | String |
| 17 | `conclusionInfo` | 当前环节评审结论信息 | `conclusion_info` | String |
| 18 | `evaluationQuoteType` | 供应商报价 | `evaluation_quote_type` | Short |
| 19 | `file` | 附件 | `file` | String |
| 20 | `scoringRoomSegmentDefineCharacter` | 评标汇总特征自定义项 | `define_character_id` | aa826b80-49c3-4665-8d03-df07881f5dcb |
| 21 | `billVersionId` | 版本id | `bill_version_id` | a3a5ef89-acd9-4d26-bfa0-f2828d18ef6b |
| 22 | `currentEvaluationStage` | 分步开评标阶段标识 | `current_evaluation_stage` | Integer |
| 23 | `defines` | 环节信息表自定义项 | `` | b6ad3455-3ddd-4fcb-a5c7-ac1246c4011d |
| 24 | `detailList` | 环节打分结果 | `` | 29632e73-08db-4455-be7c-cd452cd9b1e7 |
| 25 | `expertDetailList` | 专家打分 | `` | e62a903b-3789-4ba3-a2b7-bf6b866995aa |
| 26 | `expertList` | 环节信息专家汇总表 | `` | 19c73bc6-0b42-42fb-bc6f-485306de171b |

---

## 关联属性（13个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `billVersionId` | 版本id | `lawbid.billversion.BizBillVersion` | None |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `scoringGroupId` | 评标组 | `lawbid.scoringroomresult.ScoringGroupVO` | None | true |
| 4 | `bidProjectId` | 招标方案主表ID | `lawbid.project.LawbidProject` | None |  |
| 5 | `defines` | 环节信息表自定义项 | `lawbid.scoringroomresult.ScoringRoomSegmentFreeDefine` | None | true |
| 6 | `bidScoreSegmentId` | 评分环节主键 | `lawbid.scoreplan.BidScorePlanSegment` | None |  |
| 7 | `bidScoreTemplateId` | 评分模板主键 | `lawbid.scoreplan.BidScorePlan` | None |  |
| 8 | `detailList` | 环节打分结果 | `lawbid.scoringroomresult.ScoringRoomSegmentResult` | None | true |
| 9 | `enterpriseId` | 租户id | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 10 | `expertList` | 环节信息专家汇总表 | `lawbid.scoringroomresult.ScoringRoomSegmentExpert` | None | true |
| 11 | `bidSectionId` | 招标方案标段包ID | `lawbid.section.LawbidSection` | None |  |
| 12 | `scoringRoomSegmentDefineCharacter` | 评标汇总特征自定义项 | `lawbid.scoringroomresult.ScoringRoomSegmentDefineCharacter` | None |  |
| 13 | `expertDetailList` | 专家打分 | `lawbid.scoringroomresult.ExpertScoringDetail` | None | true |
