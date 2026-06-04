---
tags: ["BIP", "元数据", "数据字典", "lawbid.scoringroomresultapproval.ScoringRoomGatherApproval"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 评标结果审批单汇总表 (`lawbid.scoringroomresultapproval.ScoringRoomGatherApproval`)

> **平台版本：BIP 旗舰版 V5**

>  模块 | 物理表：`cpu_scoring_group_gather_approval`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 评标结果审批单汇总表 |
| 物理表 | `cpu_scoring_group_gather_approval` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `` |
| 构建时间 | `2026-06-04 20:16:49.9870` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 主键 |

## 部署信息

- 部署时间: 2026-05-22 22:09:33:000

## 依赖接口（3个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 2 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |
| 3 | 跨租户采购商租户接口 | `cpu.itf.IBuyerTenant` | 10 |

---

## 直接属性（27个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | 主键 | `id` | Long |
| 2 | `approvalId` | 评标结果审批 | `approval_id` | edc8535f-9b8d-48ab-8575-cf38ee3b7f5f |
| 3 | `gatherId` | 结果汇总 | `gather_id` | 26b11e1d-e5b6-4cb4-b991-d0c2f0597955 |
| 4 | `projectId` | 招标项目 | `project_id` | 070c3520-bf5d-4b3e-a523-59e73d9f6349 |
| 5 | `bidSectionId` | 标段(包) | `bid_section_id` | 0409e7d6-ed4c-4c0d-bc0d-dde79bdbf461 |
| 6 | `supEnterpriseId` | 投标人名称 | `sup_enterpriseId` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 7 | `markSegmentId` | 打分项目主键 | `mark_segment_id` | 89b6414c-2d9a-4b4f-9faa-a2cbdd58f101 |
| 8 | `markResult` | 评分结果 | `mark_result` | String |
| 9 | `priceMainId` | 报价单 | `price_main_id` | d7ba184f-30df-4eb9-a0d9-91c375b93db8 |
| 10 | `markType` | 评分方式 | `mark_type` | String |
| 11 | `biddingId` | 投标单 | `bidding_id` | 560d390c-4459-4448-8e73-f6ce26a04dba |
| 12 | `markResultvirtual` | 评分结果 | `mark_result_virtual` | String |
| 13 | `totalScore` | 总分 | `total_score` | Decimal |
| 14 | `bidPrice` | 无税投标价格 | `bid_price` | Decimal |
| 15 | `bidderName` | 投标人名称 | `bidder_name` | String |
| 16 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 17 | `dr` | 逻辑删除标记 | `dr` | Short |
| 18 | `eliminateStatus` | 淘汰状态 | `eliminate_status` | Integer |
| 19 | `markPrice` | 无税评标价格 | `mark_price` | Decimal |
| 20 | `markSegment` | 打分项目 | `mark_segment` | String |
| 21 | `markSegmentName` | 打分项目名称 | `mark_segment_name` | String |
| 22 | `pubts` | 时间戳 | `pubts` | DateTime |
| 23 | `qualifiedSupplier` | 合格供应商 | `qualified_supplier` | Integer |
| 24 | `rank` | 排名 | `rank` | String |
| 25 | `taxBidPrice` | 含税投标价格 | `tax_bid_price` | Decimal |
| 26 | `taxMarkPrice` | 含税评标价格 | `tax_mark_price` | Decimal |
| 27 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（9个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `gatherId` | 结果汇总 | `lawbid.scoringroomresult.ScoringRoomGather` | None |  |
| 3 | `priceMainId` | 报价单 | `lawbid.scoringdata.ScoringDataMark` | None |  |
| 4 | `supEnterpriseId` | 投标人名称 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 5 | `approvalId` | 评标结果审批 | `lawbid.scoringroomresultapproval.ScoringGroupApproval` | None | true |
| 6 | `biddingId` | 投标单 | `lawbid.bid.BiddingVO` | None |  |
| 7 | `projectId` | 招标项目 | `lawbid.project.LawbidProject` | None |  |
| 8 | `markSegmentId` | 打分项目主键 | `lawbid.scoreplan.BidScorePlanSegment` | None |  |
| 9 | `bidSectionId` | 标段(包) | `lawbid.section.LawbidSection` | None |  |
