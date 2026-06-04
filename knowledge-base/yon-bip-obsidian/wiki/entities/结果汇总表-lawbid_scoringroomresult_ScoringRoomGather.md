---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.scoringroomresult.ScoringRoomGather"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 结果汇总表 (`lawbid.scoringroomresult.ScoringRoomGather`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_mark_result_gather`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 结果汇总表 |
| 物理表 | `cpu_mark_result_gather` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 20:02:58.9130` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 主键 |

## 部署信息

- 部署时间: 2025-10-24 23:58:06:000

## 依赖接口（3个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 2 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |
| 3 | 跨租户采购商租户接口 | `cpu.itf.IBuyerTenant` | 10 |

---

## 直接属性（36个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `adjustPrice` | 调整价格 | `adjust_price` | Decimal |
| 2 | `bidType` | 采购方式 | `bid_type` | String |
| 3 | `bidderCode` | 投标人编码 | `bidder_code` | String |
| 4 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 5 | `dr` | 逻辑删除标记 | `dr` | Short |
| 6 | `eliminateReason` | 淘汰原因 | `eliminate_reason` | String |
| 7 | `enterpriseId` | 租户 | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 8 | `enterpriseName` | 租户名 | `enterprise_name` | String |
| 9 | `multipleCurrentStage` | 招标阶段 | `multiple_current_stage` | Integer |
| 10 | `pubts` | 时间戳 | `pubts` | DateTime |
| 11 | `qualifyCheckStep` | 资格审核当前流程阶段 | `qualify_check_step` | Integer |
| 12 | `qualifyCheckType` | 资格审核方式 | `qualify_check_type` | Integer |
| 13 | `scoreRound` | 当前评标轮次 | `score_round` | Integer |
| 14 | `scoringGroupId` | 评标组 | `scoring_group_id` | c67f065b-c2cc-4b6b-ab41-acf2ba3956f2 |
| 15 | `scoringRoomGatherDefineCharacter` | 评标结果特征自定义项 | `define_character_id` | 430f0ed1-362b-40fb-b13c-0b6f28a7a87c |
| 16 | `status` | 状态 | `status` | String |
| 17 | `ts` | 时间戳 | `ts` | DateTime |
| 18 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 19 | `id` | 主键 | `id` | Long |
| 20 | `projectId` | 招标项目ID | `project_id` | 070c3520-bf5d-4b3e-a523-59e73d9f6349 |
| 21 | `bidSectionId` | 标段(包)主键 | `bid_section_id` | 0409e7d6-ed4c-4c0d-bc0d-dde79bdbf461 |
| 22 | `markType` | 评分方式 | `mark_type` | String |
| 23 | `supEnterpriseId` | 投标人名称 | `bidder_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 24 | `priceMainId` | 报价单 | `price_main_id` | d7ba184f-30df-4eb9-a0d9-91c375b93db8 |
| 25 | `markSegmentId` | 打分项目主键 | `mark_segment_id` | 89b6414c-2d9a-4b4f-9faa-a2cbdd58f101 |
| 26 | `markResult` | 价格得分 | `mark_result` | String |
| 27 | `bidPrice` | 无税投标价格 | `bid_price` | Decimal |
| 28 | `bidderName` | 投标人名称 | `bidder_name` | String |
| 29 | `conclusion` | 当前环节评审结论 | `conclusion` | String |
| 30 | `currentEvaluationStage` | 分步开评标阶段标识 | `current_evaluation_stage` | Integer |
| 31 | `defines` | 结果汇总表自定义项 | `` | 743608b1-723b-4c6b-ba6a-ac32c739fc07 |
| 32 | `markPrice` | 无税评标价格 | `mark_price` | Decimal |
| 33 | `markSegment` | 打分项目 | `mark_segment` | String |
| 34 | `priceDetailId` | 报价单子表id | `price_detail_id` | 8c4341a0-e9a3-4c70-9df2-525171b82f42 |
| 35 | `taxBidPrice` | 含税投标价格 | `tax_bid_price` | Decimal |
| 36 | `taxMarkPrice` | 含税评标价格 | `tax_mark_price` | Decimal |

---

## 关联属性（11个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `priceMainId` | 报价单 | `lawbid.scoringdata.ScoringDataMark` | None |  |
| 3 | `priceDetailId` | 报价单子表id | `lawbid.scoringdata.ScoringDataMarkMateriel` | None |  |
| 4 | `supEnterpriseId` | 投标人名称 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 5 | `scoringGroupId` | 评标组 | `lawbid.scoringroomresult.ScoringGroupVO` | None | true |
| 6 | `scoringRoomGatherDefineCharacter` | 评标结果特征自定义项 | `lawbid.scoringroomresult.ScoringRoomGatherDefineCharacter` | None |  |
| 7 | `enterpriseId` | 租户 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 8 | `projectId` | 招标项目ID | `lawbid.project.LawbidProject` | None |  |
| 9 | `markSegmentId` | 打分项目主键 | `lawbid.scoreplan.BidScorePlanSegment` | None |  |
| 10 | `bidSectionId` | 标段(包)主键 | `lawbid.section.LawbidSection` | None |  |
| 11 | `defines` | 结果汇总表自定义项 | `lawbid.scoringroomresult.ScoringRoomGatherFreeDefine` | None | true |
