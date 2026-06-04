---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.cpuexpertplan.CpuExpertPlanHistoryReviewType"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 专家抽取方案抽取结果评审类型 (`lawbid.cpuexpertplan.CpuExpertPlanHistoryReviewType`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_expert_plan_history_review_type`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 专家抽取方案抽取结果评审类型 |
| 物理表 | `cpu_expert_plan_history_review_type` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 20:14:44.5280` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

## 部署信息

- 部署时间: 2026-05-22 23:55:07:000

## 依赖接口（2个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 2 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |

---

## 直接属性（6个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `dr` | 逻辑删除标记 | `dr` | Short |
| 2 | `historyId` | 抽取结果ID | `history_id` | fd8db517-307c-41c8-90f9-dd752772768b |
| 3 | `id` | id | `id` | Long |
| 4 | `pubts` | 时间戳 | `pubts` | DateTime |
| 5 | `reviewTypeId` | 评审类型 | `review_type_id` | 9e20b788-0e74-4843-8bf7-c86c428f7e26 |
| 6 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（3个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `historyId` | 抽取结果ID | `lawbid.cpuexpertplan.CpuExpertPlanHistory` | None | true |
| 3 | `reviewTypeId` | 评审类型 | `cpu-basedoc.userdef.UserDefineVO` | Service |  |
