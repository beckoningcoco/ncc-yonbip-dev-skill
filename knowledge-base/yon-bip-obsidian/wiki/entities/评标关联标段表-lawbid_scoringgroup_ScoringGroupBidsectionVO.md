---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.scoringgroup.ScoringGroupBidsectionVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 评标关联标段表 (`lawbid.scoringgroup.ScoringGroupBidsectionVO`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_scoring_group_bidsection`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 评标关联标段表 |
| 物理表 | `cpu_scoring_group_bidsection` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 20:02:52.0110` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 主键 |

## 部署信息

- 部署时间: 2026-01-23 23:56:30:000

## 依赖接口（3个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 2 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |
| 3 | 跨租户采购商租户接口 | `cpu.itf.IBuyerTenant` | 10 |

---

## 直接属性（33个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `bidOpenTime` | 开标时间 | `bid_open_time` | DateTime |
| 2 | `bidScoreSegmentId` | 评分环节 | `bid_score_segment_id` | 89b6414c-2d9a-4b4f-9faa-a2cbdd58f101 |
| 3 | `bidSectionId` | 标段(包) | `bid_section_id` | 0409e7d6-ed4c-4c0d-bc0d-dde79bdbf461 |
| 4 | `isConirmResult` | 结果是否确认 | `is_fonirmresult` | Short |
| 5 | `bidScorePlanId` | 评标模板 | `bid_score_plan_id` | 47d2f6a7-a9be-4eb1-af5f-b15b0564d14a |
| 6 | `parallelParam` | 并行参数 | `parallel_param` | String |
| 7 | `abandonedBid` | 是否废标 | `abandoned_bid` | Integer |
| 8 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 9 | `dr` | 逻辑删除标记 | `dr` | Short |
| 10 | `enterpriseId` | 租户 | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 11 | `enterpriseName` | 租户名 | `enterprise_name` | String |
| 12 | `evalBidMethod` | 评标办法 | `eval_bid_method` | String |
| 13 | `id` | 主键 | `id` | Long |
| 14 | `ifIntenational` | 是否国际标 | `if_intenational` | String |
| 15 | `isEnd` | 评标是否结束 | `is_end` | Short |
| 16 | `isSubmitResult` | 是否提交评标结果 | `is_submit_result` | Integer |
| 17 | `lawbidSystemId` | 原始主键 | `lawbid_system_id` | Long |
| 18 | `markEndTime` | 评标结束时间 | `mark_end_time` | DateTime |
| 19 | `markStatus` | 评标进度值 | `mark_status` | String |
| 20 | `multipleCurrentStage` | 招标阶段 | `multiple_current_stage` | Integer |
| 21 | `principalId` | 委托人 | `principal_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 22 | `principalName` | 委托人 | `principal_name` | String |
| 23 | `projectId` | 招标项目 | `project_id` | 070c3520-bf5d-4b3e-a523-59e73d9f6349 |
| 24 | `pubts` | 时间戳 | `pubts` | DateTime |
| 25 | `purType` | 采购方式 | `pur_type` | String |
| 26 | `purchaseType` | 采购类别 | `purchase_type` | String |
| 27 | `qualifyCheckStep` | 当前阶段 | `qualify_check_step` | Integer |
| 28 | `qualifyCheckType` | 资格审核方式 | `qualify_check_type` | Integer |
| 29 | `scoringGroupId` | 评标组 | `scoring_group_id` | bd52c08b-9c24-45c6-b5ba-6209956c1411 |
| 30 | `status` | 状态 | `status` | String |
| 31 | `templateSegmentIndex` | 评标模板环节序号 | `template_segment_index` | Integer |
| 32 | `templateSegmentName` | 评标模板环节名称 | `template_segment_name` | String |
| 33 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（8个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `bidScoreSegmentId` | 评分环节 | `lawbid.scoreplan.BidScorePlanSegment` | None |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `bidScorePlanId` | 评标模板 | `lawbid.scoreplan.BidScorePlan` | None |  |
| 4 | `principalId` | 委托人 | `bd.staff.Staff` | Service |  |
| 5 | `scoringGroupId` | 评标组 | `lawbid.scoringgroup.ScoringGroupVO` | None | true |
| 6 | `enterpriseId` | 租户 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 7 | `projectId` | 招标项目 | `lawbid.project.LawbidProject` | None |  |
| 8 | `bidSectionId` | 标段(包) | `lawbid.section.LawbidSection` | None |  |
