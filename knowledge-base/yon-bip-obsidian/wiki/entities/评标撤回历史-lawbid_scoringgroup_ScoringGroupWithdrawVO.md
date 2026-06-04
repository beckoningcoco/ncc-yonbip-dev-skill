---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.scoringgroup.ScoringGroupWithdrawVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 评标撤回历史 (`lawbid.scoringgroup.ScoringGroupWithdrawVO`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_scoring_group_withdraw`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 评标撤回历史 |
| 物理表 | `cpu_scoring_group_withdraw` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 20:02:56.1390` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

## 部署信息

- 部署时间: 2026-01-23 23:56:30:000

## 依赖接口（2个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 2 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |

---

## 直接属性（8个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `dr` | 逻辑删除标记 | `dr` | Short |
| 2 | `id` | id | `id` | Long |
| 3 | `pubts` | 时间戳 | `pubts` | DateTime |
| 4 | `scoringGroupId` | 评标组Id | `scoring_group_id` | bd52c08b-9c24-45c6-b5ba-6209956c1411 |
| 5 | `withdrawDate` | 撤回时间 | `withdraw_date` | DateTime |
| 6 | `withdrawPsnid` | 撤回人 | `withdraw_psnid` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 7 | `withdrawReason` | 撤回原因 | `withdraw_reason` | String |
| 8 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（3个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `scoringGroupId` | 评标组Id | `lawbid.scoringgroup.ScoringGroupVO` | None | true |
| 3 | `withdrawPsnid` | 撤回人 | `bd.staff.Staff` | Service |  |
