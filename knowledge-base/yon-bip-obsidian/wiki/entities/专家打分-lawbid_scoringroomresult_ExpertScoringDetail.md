---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.scoringroomresult.ExpertScoringDetail"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 专家打分 (`lawbid.scoringroomresult.ExpertScoringDetail`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_mark_detail`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 专家打分 |
| 物理表 | `cpu_mark_detail` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 20:02:57.4440` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 评分明细 |

## 部署信息

- 部署时间: 2025-01-17 23:15:20:000

---

## 直接属性（39个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `bidSectionId` | 标段(包) | `bid_section_id` | 0409e7d6-ed4c-4c0d-bc0d-dde79bdbf461 |
| 2 | `bidType` | 采购方式 | `bid_type` | String |
| 3 | `bidderCode` | 投标人编码 | `bidder_code` | String |
| 4 | `bidderName` | 投标人名称 | `bidder_name` | String |
| 5 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 6 | `dr` | 逻辑删除标记 | `dr` | Short |
| 7 | `enterpriseId` | 租户 | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 8 | `enterpriseName` | 租户名 | `enterprise_name` | String |
| 9 | `expertExternalId` | 专家外部系统 | `expert_external_id` | String |
| 10 | `expertId` | 专家 | `expert_doc_id` | ddf859b7-981f-4c8a-b2b9-9d760e5d2bc7 |
| 11 | `expertName` | 专家名称 | `expert_name` | String |
| 12 | `id` | 评分明细 | `id` | Long |
| 13 | `markItemDescribe` | 评审项描述 | `mark_item_describe` | String |
| 14 | `markItemId` | 评审项 | `mark_item_id` | 926220d5-7691-44b6-9d7e-3b5264ca8f7c |
| 15 | `markItemName` | 评审项名称 | `mark_item_name` | String |
| 16 | `markItemStandard` | 评分标准 | `mark_item_standard` | String |
| 17 | `markResult` | 评审结果 | `mark_result` | String |
| 18 | `markSegmentId` | 评审环节 | `mark_segment_id` | 89b6414c-2d9a-4b4f-9faa-a2cbdd58f101 |
| 19 | `markSegmentName` | 评审环节名称 | `mark_segment_name` | String |
| 20 | `markStatus` | 评审状态 | `mark_status` | String |
| 21 | `markType` | 评审方式 | `mark_type` | String |
| 22 | `memo` | 评审意见 | `memo` | String |
| 23 | `multipleCurrentStage` | 招标阶段 | `multiple_current_stage` | Integer |
| 24 | `projectId` | 招标项目 | `project_id` | 070c3520-bf5d-4b3e-a523-59e73d9f6349 |
| 25 | `pubts` | 时间戳 | `pubts` | DateTime |
| 26 | `qualifyCheckStep` | 资格审核当前流程阶段 | `qualify_check_step` | Integer |
| 27 | `qualifyCheckType` | 资格审核方式 | `qualify_check_type` | Integer |
| 28 | `roomSegmentId` | 环节汇总信息 | `room_segment_id` | 37368fe3-ea12-4e0a-9f0f-5624bbc10a30 |
| 29 | `scoreFile` | 评审附件 | `score_file` | String |
| 30 | `scoreRound` | 当前评标轮次 | `score_round` | Integer |
| 31 | `scoringGroupId` | 评标组 | `scoring_group_id` | bd52c08b-9c24-45c6-b5ba-6209956c1411 |
| 32 | `suggestResultItemId` | 建议评审结果主键 | `suggest_result_item_id` | d3760785-116a-485c-899b-e0d176e6b89d |
| 33 | `supEnterpriseId` | 投标人 | `bidder_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 34 | `supplydocId` | 供应商档案 | `supplydoc_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 35 | `targetReviewScore` | 指标评审定级 | `target_review_score` | String |
| 36 | `taskId` | 评分任务 | `task_id` | 9914a85f-e115-42d7-8eac-8309577e6fb8 |
| 37 | `ts` | 时间戳 | `ts` | DateTime |
| 38 | `userId` | 人员 | `expert_id` | Long |
| 39 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（13个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `expertId` | 专家 | `lawbid.cpuexpert.CpuExpert` | None |  |
| 2 | `suggestResultItemId` | 建议评审结果主键 | `lawbid.aimark.CpuAiMarkResultItem` | None |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `roomSegmentId` | 环节汇总信息 | `lawbid.scoringroomresult.ScoringRoomSegment` | None | true |
| 5 | `scoringGroupId` | 评标组 | `lawbid.scoringgroup.ScoringGroupVO` | None |  |
| 6 | `markItemId` | 评审项 | `lawbid.scoreplan.BidScorePlanItem` | None |  |
| 7 | `markSegmentId` | 评审环节 | `lawbid.scoreplan.BidScorePlanSegment` | None |  |
| 8 | `supplydocId` | 供应商档案 | `aa.vendor.Vendor` | Service |  |
| 9 | `supEnterpriseId` | 投标人 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 10 | `enterpriseId` | 租户 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 11 | `projectId` | 招标项目 | `lawbid.project.LawbidProject` | None |  |
| 12 | `taskId` | 评分任务 | `lawbid.scoringtask.ExpertScoringTask` | None |  |
| 13 | `bidSectionId` | 标段(包) | `lawbid.section.LawbidSection` | None |  |
