---
tags: ["BIP", "元数据", "数据字典", "ycSouring", "lawbid.cpuexpert.CpuExpertExperience"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 专家考核表 (`lawbid.cpuexpert.CpuExpertExperience`)

> **平台版本：BIP 旗舰版 V5**

> ycSouring 模块 | 物理表：`cpu_expert_experience`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 专家考核表 |
| 物理表 | `cpu_expert_experience` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `ycSouring` |
| 构建时间 | `2026-06-04 20:14:40.5350` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

## 部署信息

- 部署时间: 2026-01-23 23:56:20:000

## 依赖接口（3个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 2 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |
| 3 | 跨租户采购商租户接口 | `cpu.itf.IBuyerTenant` | 10 |

---

## 直接属性（6个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | id | `id` | Long |
| 2 | `expertId` | 专家档案 | `expert_id` | ddf859b7-981f-4c8a-b2b9-9d760e5d2bc7 |
| 3 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 4 | `dr` | 逻辑删除标记 | `dr` | Short |
| 5 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 6 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（2个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `expertId` | 专家档案 | `lawbid.cpuexpert.CpuExpert` | None | true |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
