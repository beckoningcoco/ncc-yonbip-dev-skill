---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.cpuexpertplan.CpuExpertPlanRule"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 专家抽取方案表体抽取规则 (`lawbid.cpuexpertplan.CpuExpertPlanRule`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_expert_plan_rule`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 专家抽取方案表体抽取规则 |
| 物理表 | `cpu_expert_plan_rule` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 19:56:55.5870` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 主键 |

## 部署信息

- 部署时间: 2025-05-24 00:30:28:000

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
| 1 | `id` | 主键 | `id` | Long |
| 2 | `expertPlanId` | 专家抽取方案ID | `plan_id` | 68a1e01e-9b68-40bd-9070-bcaaf8b65d03 |
| 3 | `state` | 状态 | `state` | String |
| 4 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 5 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 6 | `dr` | 逻辑删除标记 | `dr` | Short |
| 7 | `pubts` | 时间戳 | `pubts` | DateTime |
| 8 | `condition` | 专家抽取规则 | `content` | String |
| 9 | `expressionDisplay` | 专家抽取规则 | `expression_display` | String |
| 10 | `drawNum` | 抽取人数 | `draw_num` | Integer |
| 11 | `reviewTypeId` | 评审类型主键 | `review_type_id` | 9e20b788-0e74-4843-8bf7-c86c428f7e26 |
| 12 | `reviewType` | 评审类型编码 | `review_type` | String |
| 13 | `realNum` | 已抽人数 | `real_num` | Integer |
| 14 | `batchNo` | 抽取次数 | `batch_no` | Integer |
| 15 | `remark` | 备注 | `remark` | String |
| 16 | `cpuExpertPlanRuleDefineCharacter` | 抽取规则自定义项 | `define_character_id` | 6e4cb1f1-4d12-45bf-8e47-5f1fcf1ab832 |
| 17 | `reviewTypeList` | 专家抽取方案评审类型 | `` | 89f19f5e-b7f7-4010-948b-49aeff895e78 |

---

## 关联属性（5个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `reviewTypeList` | 专家抽取方案评审类型 | `lawbid.cpuexpertplan.CpuExpertPlanReviewType` | None | true |
| 3 | `cpuExpertPlanRuleDefineCharacter` | 抽取规则自定义项 | `lawbid.cpuexpertplan.CpuExpertPlanRuleDefineCharacter` | None |  |
| 4 | `expertPlanId` | 专家抽取方案ID | `lawbid.cpuexpertplan.CpuExpertPlan` | None | true |
| 5 | `reviewTypeId` | 评审类型主键 | `cpu-basedoc.userdef.UserDefineVO` | Service |  |
