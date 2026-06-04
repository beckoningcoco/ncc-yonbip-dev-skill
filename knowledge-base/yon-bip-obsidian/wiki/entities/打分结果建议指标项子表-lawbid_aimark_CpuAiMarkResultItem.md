---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.aimark.CpuAiMarkResultItem"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 打分结果建议指标项子表 (`lawbid.aimark.CpuAiMarkResultItem`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_ai_mark_result_item`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 打分结果建议指标项子表 |
| 物理表 | `cpu_ai_mark_result_item` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 19:56:19.7900` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

## 部署信息

- 部署时间: 2026-01-23 23:56:02:000

## 依赖接口（2个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 2 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |

---

## 直接属性（14个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `bidderId` | 投标人主键 | `bidder_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 2 | `currentEvaluationStage` | 当前评标阶段 | `current_evaluation_stage` | Integer |
| 3 | `dr` | 逻辑删除标记 | `dr` | Short |
| 4 | `fileId` | AI打分结果文件ID | `file_id` | String |
| 5 | `id` | id | `id` | Long |
| 6 | `markItemId` | 指标项主键 | `mark_item_id` | 926220d5-7691-44b6-9d7e-3b5264ca8f7c |
| 7 | `markItemStandard` | 评分标准 | `mark_item_standard` | String |
| 8 | `markType` | 评分方式：1、符合式  2、打分式 | `mark_type` | String |
| 9 | `maxScore` | 分值上限 | `max_score` | Decimal |
| 10 | `minScore` | 分值下限 | `min_score` | Decimal |
| 11 | `pubts` | 时间戳 | `pubts` | DateTime |
| 12 | `resultId` | 打分结果建议主表ID | `result_id` | 05c79d5b-7ce2-40ae-b01b-3e3fbdbaf606 |
| 13 | `suggestMarkResult` | 建议打分结果 | `suggest_mark_result` | String |
| 14 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `resultId` | 打分结果建议主表ID | `lawbid.aimark.CpuAiMarkResult` | None | true |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `bidderId` | 投标人主键 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 4 | `markItemId` | 指标项主键 | `lawbid.scoreplan.BidScorePlanItem` | None |  |
