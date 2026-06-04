---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.cpuexpertplan.CpuExpertPlanContent"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 专家抽取方案表体标段包信息 (`lawbid.cpuexpertplan.CpuExpertPlanContent`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_expert_plan_content`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 专家抽取方案表体标段包信息 |
| 物理表 | `cpu_expert_plan_content` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 19:56:52.8270` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 主键 |

## 部署信息

- 部署时间: 2024-11-22 23:19:04:000

## 依赖接口（3个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 2 | 跨租户采购商租户接口 | `cpu.itf.IBuyerTenant` | 10 |
| 3 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |

---

## 直接属性（14个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | 主键 | `id` | Long |
| 2 | `bidSectionId` | 标段主键 | `bid_section_id` | 0409e7d6-ed4c-4c0d-bc0d-dde79bdbf461 |
| 3 | `sectionStatus` | 标段状态 | `section_status` | String |
| 4 | `bidSectionName` | 标段(包)名称 | `bid_section_name` | String |
| 5 | `bidSectionCode` | 标段(包)编号 | `bid_section_code` | String |
| 6 | `bidOpenTime` | 开标时间 | `bid_open_time` | DateTime |
| 7 | `multipleCurrentStage` | 当前招标阶段 | `multiple_current_stage` | Integer |
| 8 | `cpuExpertPlanContentDefineCharacter` | 评标内容自定义项 | `define_character_id` | 9897f7e3-1740-452d-b3a3-fc301b8e504f |
| 9 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 10 | `dr` | 删除标志 | `dr` | Short |
| 11 | `expertPlanId` | 抽取方案ID | `expert_plan_id` | 68a1e01e-9b68-40bd-9070-bcaaf8b65d03 |
| 12 | `multipleLatestStage` | 是否最新阶段:0否 1是 | `multiple_latest_stage` | Short |
| 13 | `pubts` | 最后修改时间 | `ts` | DateTime |
| 14 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `expertPlanId` | 抽取方案ID | `lawbid.cpuexpertplan.CpuExpertPlan` | None | true |
| 3 | `cpuExpertPlanContentDefineCharacter` | 评标内容自定义项 | `lawbid.cpuexpertplan.CpuExpertPlanContentDefineCharacter` | None |  |
| 4 | `bidSectionId` | 标段主键 | `lawbid.section.LawbidSection` | None |  |
