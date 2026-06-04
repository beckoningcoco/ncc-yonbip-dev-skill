---
tags: ["BIP", "元数据", "数据字典", "ycSouring", "lawbid.cpuexpert.CpuExpertAss"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 专家参评项目表 (`lawbid.cpuexpert.CpuExpertAss`)

> **平台版本：BIP 旗舰版 V5**

> ycSouring 模块 | 物理表：`cpu_expert_ass`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 专家参评项目表 |
| 物理表 | `cpu_expert_ass` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `ycSouring` |
| 构建时间 | `2026-06-04 20:14:37.6550` |

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

## 直接属性（15个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | id | `id` | Long |
| 2 | `expertId` | 专家档案 | `expert_id` | ddf859b7-981f-4c8a-b2b9-9d760e5d2bc7 |
| 3 | `assDate` | 考核日期 | `ass_date` | Date |
| 4 | `bidSectionCode` | 标段编码 | `bid_section_code` | String |
| 5 | `bidSectionId` | 标段 | `bid_section_id` | 0409e7d6-ed4c-4c0d-bc0d-dde79bdbf461 |
| 6 | `bidSectionName` | 标段名称 | `bid_section_name` | String |
| 7 | `projectId` | 招标项目 | `project_id` | 070c3520-bf5d-4b3e-a523-59e73d9f6349 |
| 8 | `score` | 分值 | `score` | Decimal |
| 9 | `scoringGroupId` | 评标组 | `scoring_group_id` | bd52c08b-9c24-45c6-b5ba-6209956c1411 |
| 10 | `scoringGroupCode` | 评标组编码 | `scoring_group_code` | String |
| 11 | `scoringGroupName` | 评标组名称 | `scoring_group_name` | String |
| 12 | `pubts` | 时间戳 | `ts` | DateTime |
| 13 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 14 | `dr` | 逻辑删除标记 | `dr` | Short |
| 15 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |

---

## 关联属性（5个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `expertId` | 专家档案 | `lawbid.cpuexpert.CpuExpert` | None | true |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `scoringGroupId` | 评标组 | `lawbid.scoringgroup.ScoringGroupVO` | None |  |
| 4 | `projectId` | 招标项目 | `lawbid.project.LawbidProject` | None |  |
| 5 | `bidSectionId` | 标段 | `lawbid.section.LawbidSection` | None |  |
