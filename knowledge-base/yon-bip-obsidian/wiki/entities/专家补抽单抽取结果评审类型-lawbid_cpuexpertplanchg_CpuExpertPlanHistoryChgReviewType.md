---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.cpuexpertplanchg.CpuExpertPlanHistoryChgReviewType"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 专家补抽单抽取结果评审类型 (`lawbid.cpuexpertplanchg.CpuExpertPlanHistoryChgReviewType`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_expert_plan_history_chg_review_type`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 专家补抽单抽取结果评审类型 |
| 物理表 | `cpu_expert_plan_history_chg_review_type` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 20:14:47.0730` |

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

## 直接属性（7个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `dr` | 逻辑删除标记 | `dr` | Short |
| 2 | `expertHistoryReviewTypeId` | 原抽取方案抽取结果评审类型主键 | `expert_history_review_type_id` | f275cbeb-3391-44dd-a382-11e4a5b362b6 |
| 3 | `historyChgId` | 专家补抽单抽取结果ID | `history_chg_id` | 3a1361e7-95f5-45ed-a0b5-461a35167852 |
| 4 | `id` | id | `id` | Long |
| 5 | `pubts` | 时间戳 | `pubts` | DateTime |
| 6 | `reviewTypeId` | 评审类型 | `review_type_id` | 9e20b788-0e74-4843-8bf7-c86c428f7e26 |
| 7 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `historyChgId` | 专家补抽单抽取结果ID | `lawbid.cpuexpertplanchg.CpuExpertPlanHistoryChg` | None | true |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `expertHistoryReviewTypeId` | 原抽取方案抽取结果评审类型主键 | `lawbid.cpuexpertplan.CpuExpertPlanHistoryReviewType` | None |  |
| 4 | `reviewTypeId` | 评审类型 | `cpu-basedoc.userdef.UserDefineVO` | Service |  |
