---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.aimark.CpuAiMarkResult"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 打分结果建议主表 (`lawbid.aimark.CpuAiMarkResult`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_ai_mark_result`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 打分结果建议主表 |
| 物理表 | `cpu_ai_mark_result` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 19:26:08.4350` |

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

## 直接属性（7个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `bidSectionId` | 标段(包) | `bid_section_id` | 0409e7d6-ed4c-4c0d-bc0d-dde79bdbf461 |
| 2 | `detailList` | 打分结果建议指标项子表 | `` | d3760785-116a-485c-899b-e0d176e6b89d |
| 3 | `dr` | 逻辑删除标记 | `dr` | Short |
| 4 | `id` | id | `id` | Long |
| 5 | `pubts` | 时间戳 | `pubts` | DateTime |
| 6 | `taskStatus` | 任务执行状态 | `task_status` | String |
| 7 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（3个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `detailList` | 打分结果建议指标项子表 | `lawbid.aimark.CpuAiMarkResultItem` | None | true |
| 3 | `bidSectionId` | 标段(包) | `lawbid.section.LawbidSection` | None |  |
