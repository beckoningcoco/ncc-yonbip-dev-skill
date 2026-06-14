---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.scoringgroup.ScoringGroupExpertReviewTypeVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 评标组专家评标类型表 (`lawbid.scoringgroup.ScoringGroupExpertReviewTypeVO`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_scoring_group_expert_reviewtype`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 评标组专家评标类型表 |
| 物理表 | `cpu_scoring_group_expert_reviewtype` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 20:16:48.6990` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

## 部署信息

- 部署时间: 2025-10-24 23:57:34:000

## 依赖接口（3个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 2 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |
| 3 | 跨租户采购商租户接口 | `cpu.itf.IBuyerTenant` | 10 |

---

## 直接属性（12个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 2 | `dr` | 逻辑删除标记 | `dr` | Short |
| 3 | `enterpriseId` | 租户 | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 4 | `lawbidSystemId` | 原始主键 | `lawbid_system_id` | Long |
| 5 | `pubts` | 时间戳 | `pubts` | DateTime |
| 6 | `scoringGroupExpertId` | 评标组专家 | `scoring_group_expert_id` | e20263d2-5a5e-49b8-ac5e-2b894374f692 |
| 7 | `scoringGroupId` | 评标组 | `scoring_group_id` | bd52c08b-9c24-45c6-b5ba-6209956c1411 |
| 8 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 9 | `id` | id | `id` | Long |
| 10 | `reviewTypeName` | 评委类型 | `review_type_name` | String |
| 11 | `reviewTypeCode` | 评委类型编码 | `review_type_code` | String |
| 12 | `reviewTypeId` | 评委类型 | `review_type_id` | 9e20b788-0e74-4843-8bf7-c86c428f7e26 |

---

## 关联属性（5个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `scoringGroupExpertId` | 评标组专家 | `lawbid.scoringgroup.ScoringGroupExpertVO` | None | true |
| 3 | `scoringGroupId` | 评标组 | `lawbid.scoringgroup.ScoringGroupVO` | None |  |
| 4 | `enterpriseId` | 租户 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 5 | `reviewTypeId` | 评委类型 | `cpu-basedoc.userdef.UserDefineVO` | Service |  |
