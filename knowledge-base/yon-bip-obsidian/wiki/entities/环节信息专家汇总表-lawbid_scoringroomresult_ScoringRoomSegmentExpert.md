---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.scoringroomresult.ScoringRoomSegmentExpert"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 环节信息专家汇总表 (`lawbid.scoringroomresult.ScoringRoomSegmentExpert`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_mark_result_expert`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 环节信息专家汇总表 |
| 物理表 | `cpu_mark_result_expert` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 20:03:00.3100` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

## 部署信息

- 部署时间: 2025-10-24 23:58:06:000

## 依赖接口（3个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 跨租户采购商租户接口 | `cpu.itf.IBuyerTenant` | 10 |
| 2 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 3 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |

---

## 直接属性（14个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 2 | `defines` | 环节信息专家汇总表自定义项 | `` | e642eafc-6045-49d0-a273-4564e6647425 |
| 3 | `dr` | 逻辑删除标记 | `dr` | Short |
| 4 | `expertId` | 专家 | `expert_id` | ddf859b7-981f-4c8a-b2b9-9d760e5d2bc7 |
| 5 | `id` | id | `id` | Long |
| 6 | `lawbidSystemId` | 原始主键 | `lawbid_system_id` | Long |
| 7 | `markSegmentId` | 评审环节 | `mark_segment_id` | 89b6414c-2d9a-4b4f-9faa-a2cbdd58f101 |
| 8 | `markStatus` | 评审状态 | `mark_status` | String |
| 9 | `pubts` | 时间戳 | `pubts` | DateTime |
| 10 | `scoringGroupExpertId` | 评标组专家 | `scoring_group_expert_id` | e20263d2-5a5e-49b8-ac5e-2b894374f692 |
| 11 | `scoringGroupId` | 评标组 | `scoring_group_id` | bd52c08b-9c24-45c6-b5ba-6209956c1411 |
| 12 | `segmentId` | 环节 | `segment_id` | 37368fe3-ea12-4e0a-9f0f-5624bbc10a30 |
| 13 | `ucUserId` | 友互通ID | `uc_user_id` | String |
| 14 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（7个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `expertId` | 专家 | `lawbid.cpuexpert.CpuExpert` | None |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `scoringGroupExpertId` | 评标组专家 | `lawbid.scoringgroup.ScoringGroupExpertVO` | None |  |
| 4 | `segmentId` | 环节 | `lawbid.scoringroomresult.ScoringRoomSegment` | None | true |
| 5 | `scoringGroupId` | 评标组 | `lawbid.scoringgroup.ScoringGroupVO` | None |  |
| 6 | `markSegmentId` | 评审环节 | `lawbid.scoreplan.BidScorePlanSegment` | None |  |
| 7 | `defines` | 环节信息专家汇总表自定义项 | `lawbid.scoringroomresult.ScoringRoomSegmentExpertFreeDefine` | None | true |
