---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.cpuexpertplanchg.CpuExpertPlanContentChg"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 专家补抽单表体标段包信息 (`lawbid.cpuexpertplanchg.CpuExpertPlanContentChg`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_expert_plan_content_chg`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 专家补抽单表体标段包信息 |
| 物理表 | `cpu_expert_plan_content_chg` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 20:00:04.3690` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

## 部署信息

- 部署时间: 2025-10-24 23:58:14:000

## 依赖接口（3个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 2 | 跨租户采购商租户接口 | `cpu.itf.IBuyerTenant` | 10 |
| 3 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |

---

## 直接属性（17个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | id | `id` | Long |
| 2 | `expertContentId` | 原评标内容主键 | `expert_content_id` | 2e85a2ed-178f-40ec-a7ec-56c0a97fdb90 |
| 3 | `expertPlanChgId` | 抽取方案ID | `expert_plan_chg_id` | 3b7262c7-c461-45b8-b8cc-950f46405e46 |
| 4 | `bidSectionId` | 标段ID | `bid_section_id` | 0409e7d6-ed4c-4c0d-bc0d-dde79bdbf461 |
| 5 | `cpuExpertPlanContentChgDefineCharacter` | 专家补抽单表体标段包信息特征 | `define_character_id` | 8b6415ab-09c8-4633-b2b6-70f63d812d07 |
| 6 | `bidSectionCode` | 标段编码 | `bid_section_code` | String |
| 7 | `bidSectionName` | 标段名称 | `bid_section_name` | String |
| 8 | `bidOpenTime` | 开标时间 | `bid_open_time` | DateTime |
| 9 | `dr` | 删除标志 | `dr` | Short |
| 10 | `sectionStatus` | 标包状态 | `section_status` | String |
| 11 | `multipleLatestStage` | 是否最新阶段:0否 1是 | `multiple_latest_stage` | Short |
| 12 | `multipleCurrentStage` | 当前招标阶段 | `multiple_current_stage` | Integer |
| 13 | `pubts` | 最后修改时间 | `ts` | DateTime |
| 14 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 15 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 16 | `expertPlanId` | 抽取方案ID | `expert_plan_id` | 68a1e01e-9b68-40bd-9070-bcaaf8b65d03 |
| 17 | `cpuExpertPlanContentDefineCharacter` | 评标内容特征 | `define_character_id` | 9897f7e3-1740-452d-b3a3-fc301b8e504f |

---

## 关联属性（7个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `cpuExpertPlanContentChgDefineCharacter` | 专家补抽单表体标段包信息特征 | `lawbid.cpuexpertplanchg.CpuExpertPlanContentChgDefineCharacter` | None |  |
| 3 | `expertContentId` | 原评标内容主键 | `lawbid.cpuexpertplan.CpuExpertPlanContent` | None |  |
| 4 | `expertPlanChgId` | 抽取方案ID | `lawbid.cpuexpertplanchg.CpuExpertPlanChg` | None | true |
| 5 | `expertPlanId` | 抽取方案ID | `lawbid.cpuexpertplan.CpuExpertPlan` | None |  |
| 6 | `cpuExpertPlanContentDefineCharacter` | 评标内容特征 | `lawbid.cpuexpertplan.CpuExpertPlanContentDefineCharacter` | None |  |
| 7 | `bidSectionId` | 标段ID | `lawbid.section.LawbidSection` | None |  |
