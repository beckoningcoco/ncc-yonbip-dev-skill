---
tags: ["BIP", "元数据", "数据字典", "lawbid.scoreplan.BidScorePlanSegment"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 评标环节 (`lawbid.scoreplan.BidScorePlanSegment`)

> **平台版本：BIP 旗舰版 V5**

>  模块 | 物理表：`cpu_bid_score_segment`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 评标环节 |
| 物理表 | `cpu_bid_score_segment` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `` |
| 构建时间 | `2026-06-04 20:02:47.4170` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

## 部署信息

- 部署时间: 2025-10-24 23:57:33:000

## 依赖接口（4个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 企业ID | `cpu-base.itf.IEnterprise` | 7 |
| 2 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |
| 3 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 4 | 跨租户采购商租户接口 | `cpu.itf.IBuyerTenant` | 10 |

---

## 直接属性（35个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `agoSegmentId` | 上一阶段对应的segmentid | `ago_segment_id` | Long |
| 2 | `approvalType` | 评审类型 | `approval_type` | Integer |
| 3 | `bidScorePlanId` | 评标模板ID | `bid_score_template_id` | 47d2f6a7-a9be-4eb1-af5f-b15b0564d14a |
| 4 | `bidScorePlanItems` | 评标评审项 | `` | 926220d5-7691-44b6-9d7e-3b5264ca8f7c |
| 5 | `bidTotalScore` | 总分值 | `bid_total_score` | Decimal |
| 6 | `bidWeight` | 权重百分比 | `bid_weight` | Decimal |
| 7 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 8 | `calculation` | 计算方式 | `calculation` | String |
| 9 | `collectSameVoteNumRule` | 汇总平票规则 | `collect_same_vote_num_rule` | Integer |
| 10 | `concealedReview` | 暗标评审 | `concealed_review` | Integer |
| 11 | `currentEvaluationStage` | 当前评标阶段 | `current_evaluation_stage` | Integer |
| 12 | `dr` | 逻辑删除标记 | `dr` | Short |
| 13 | `dropMaxNum` | 去掉最高分个数 | `drop_max_num` | Integer |
| 14 | `dropMinNum` | 去掉最低分个数 | `drop_min_num` | Integer |
| 15 | `enterpriseId` | 所属租户id | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 16 | `enterpriseName` | 租户名称 | `enterprise_name` | String |
| 17 | `evaluationMethod` | 评审方式 | `evaluation_method` | String |
| 18 | `finalResultWay` | 最终结果 | `final_result_way` | String |
| 19 | `id` | ID | `id` | Long |
| 20 | `index` | 环节顺序 | `index` | Integer |
| 21 | `linkScore` | 环节分值权重 | `link_score` | Decimal |
| 22 | `multipleCurrentStage` | 当前招标阶段 | `multiple_current_stage` | Integer |
| 23 | `pubts` | 时间戳 | `ts` | DateTime |
| 24 | `reviewLinkName` | 环节名称 | `review_link_name` | String |
| 25 | `reviewLinkType` | 环节类型 | `review_link_type` | String |
| 26 | `reviewType` | 评审类型 | `review_type` | String |
| 27 | `reviewTypeId` | 评审类型ID | `review_type_id` | 92b613a5-0e7c-4f87-8a9b-7fccc9ba556a |
| 28 | `scoreIfSummary` | 评审结果 | `score_if_summary` | String |
| 29 | `scoreResultSummary` | 参与评标结果汇总 | `score_result_summary` | Integer |
| 30 | `scoreSummaryMethod` | 评审结果汇总方式 | `score_summary_method` | String |
| 31 | `segmentScore` | 总分值 | `segment_score` | Decimal |
| 32 | `singleResultWay` | 评审汇总规则 | `single_result_way` | String |
| 33 | `targetReviewScore` | 指标评审定级 | `target_review_score` | String |
| 34 | `voteSummarizing` | 投票汇总规则 | `vote_summarizing` | Integer |
| 35 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（5个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `bidScorePlanItems` | 评标评审项 | `lawbid.scoreplan.BidScorePlanItem` | None | true |
| 3 | `bidScorePlanId` | 评标模板ID | `lawbid.scoreplan.BidScorePlan` | None | true |
| 4 | `enterpriseId` | 所属租户id | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 5 | `reviewTypeId` | 评审类型ID | `bctask.basedoc.CustomerDocVO` | Service |  |
