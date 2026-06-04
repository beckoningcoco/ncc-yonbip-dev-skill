---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.scoringroomresult.ScoringRoomSegmentResult"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 环节打分结果 (`lawbid.scoringroomresult.ScoringRoomSegmentResult`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_mark_result`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 环节打分结果 |
| 物理表 | `cpu_mark_result` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 20:03:01.6520` |

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
| 2 | 跨租户采购商租户接口 | `cpu.itf.IBuyerTenant` | 10 |
| 3 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |

---

## 直接属性（45个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `markResultShow` | 评分结果展示 | `mark_result_show` | String |
| 2 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 3 | `dr` | 逻辑删除标记 | `dr` | Short |
| 4 | `evaluationQuoteType` | 计算价格分类型 | `evaluation_quote_type` | Short |
| 5 | `id` | 主键 | `id` | Long |
| 6 | `pubts` | 时间戳 | `pubts` | DateTime |
| 7 | `ts` | 时间戳 | `ts` | DateTime |
| 8 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 9 | `priceMainId` | 报价单 | `price_main_id` | d7ba184f-30df-4eb9-a0d9-91c375b93db8 |
| 10 | `segmentId` | 环节信息主表外键 | `segment_id` | 37368fe3-ea12-4e0a-9f0f-5624bbc10a30 |
| 11 | `projectId` | 招标项目ID | `project_id` | 070c3520-bf5d-4b3e-a523-59e73d9f6349 |
| 12 | `bidSectionId` | 标段(包)主键 | `bid_section_id` | 0409e7d6-ed4c-4c0d-bc0d-dde79bdbf461 |
| 13 | `bidType` | 采购方式 | `bid_type` | String |
| 14 | `qualifyCheckType` | 资格审核方式 | `qualify_check_type` | Integer |
| 15 | `qualifyCheckStep` | 资格审核当前流程阶段 | `qualify_check_step` | Integer |
| 16 | `supEnterpriseId` | 投标人主键 | `bidder_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 17 | `adjustPrice` | 调整价格 | `adjust_price` | Decimal |
| 18 | `bidderCode` | 投标人编码 | `bidder_code` | String |
| 19 | `isValidScore` | 是否有效分 | `is_valid_score` | String |
| 20 | `reason` | 不符合原因 | `reason` | String |
| 21 | `invalidScoreReason` | 价格无效原因 | `invalid_score_reason` | String |
| 22 | `markSegmentId` | 打分项目主键 | `mark_segment_id` | 89b6414c-2d9a-4b4f-9faa-a2cbdd58f101 |
| 23 | `attrFile` | 说明附件 | `attr_file` | String |
| 24 | `supplydocId` | 供应商档案ID | `supplydoc_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 25 | `scoreRound` | 当前评标轮次 | `score_round` | Integer |
| 26 | `markItemId` | 评分标准主键 | `mark_item_id` | 926220d5-7691-44b6-9d7e-3b5264ca8f7c |
| 27 | `multipleCurrentStage` | 当前招标阶段 | `multiple_current_stage` | Integer |
| 28 | `markType` | 评分方式 | `mark_type` | String |
| 29 | `markResult` | 评分结果 | `mark_result` | String |
| 30 | `enterpriseId` | 租户主键 | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 31 | `conclusion` | 结论 | `conclusion` | String |
| 32 | `enterpriseName` | 租户名 | `enterprise_name` | String |
| 33 | `scoringGroupId` | 评标组主键 | `scoring_group_id` | c67f065b-c2cc-4b6b-ab41-acf2ba3956f2 |
| 34 | `scoringRoomSegmentResultDefineCharacter` | 评标环节特征自定义项 | `define_character_id` | 776a74e9-e100-41c2-8d49-ce5d332ff893 |
| 35 | `eliminateReason` | 淘汰原因 | `eliminate_reason` | String |
| 36 | `bidPrice` | 投标价格 | `bid_price` | Decimal |
| 37 | `bidderName` | 投标人名称 | `bidder_name` | String |
| 38 | `calcuateMarkResult` | 公式计算得分 | `calcuate_mark_result` | Decimal |
| 39 | `defines` | 环节打分结果表自定义项 | `` | f563aab4-2e9b-4260-ae88-e791f773d94f |
| 40 | `markItemDescribe` | 评审项描述 | `mark_item_describe` | String |
| 41 | `markItemName` | 评分标准名称 | `mark_item_name` | String |
| 42 | `markItemStandard` | 评分标准 | `mark_item_standard` | String |
| 43 | `markPrice` | 评标价格 | `mark_price` | Decimal |
| 44 | `markSegmentName` | 打分项目 | `mark_segment_name` | String |
| 45 | `priceDetailId` | 报价单子表id | `price_detail_id` | 8c4341a0-e9a3-4c70-9df2-525171b82f42 |

---

## 关联属性（14个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `scoringRoomSegmentResultDefineCharacter` | 评标环节特征自定义项 | `lawbid.scoringroomresult.ScoringRoomSegmentResultDefineCharacter` | None |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `scoringGroupId` | 评标组主键 | `lawbid.scoringroomresult.ScoringGroupVO` | None |  |
| 4 | `markItemId` | 评分标准主键 | `lawbid.scoreplan.BidScorePlanItem` | None |  |
| 5 | `markSegmentId` | 打分项目主键 | `lawbid.scoreplan.BidScorePlanSegment` | None |  |
| 6 | `defines` | 环节打分结果表自定义项 | `lawbid.scoringroomresult.ScoringRoomSegmentResultFreeDefine` | None | true |
| 7 | `supplydocId` | 供应商档案ID | `aa.vendor.Vendor` | Service |  |
| 8 | `priceMainId` | 报价单 | `lawbid.scoringdata.ScoringDataMark` | None |  |
| 9 | `priceDetailId` | 报价单子表id | `lawbid.scoringdata.ScoringDataMarkMateriel` | None |  |
| 10 | `segmentId` | 环节信息主表外键 | `lawbid.scoringroomresult.ScoringRoomSegment` | None | true |
| 11 | `supEnterpriseId` | 投标人主键 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 12 | `enterpriseId` | 租户主键 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 13 | `projectId` | 招标项目ID | `lawbid.project.LawbidProject` | None |  |
| 14 | `bidSectionId` | 标段(包)主键 | `lawbid.section.LawbidSection` | None |  |
