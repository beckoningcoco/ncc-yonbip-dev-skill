---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.cpuexpertplanchg.CpuExpertPlanReviewTypeChg"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 专家补抽单评审类型 (`lawbid.cpuexpertplanchg.CpuExpertPlanReviewTypeChg`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_expert_plan_review_type_chg`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 专家补抽单评审类型 |
| 物理表 | `cpu_expert_plan_review_type_chg` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 20:14:48.3860` |

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

## 直接属性（9个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | id | `id` | Long |
| 2 | `expertReviewTypeId` | 原抽取方案评审类型主键 | `expert_review_type_id` | 89f19f5e-b7f7-4010-948b-49aeff895e78 |
| 3 | `ruleChgId` | 抽取规则ID | `rule_chg_id` | 5e60a4d1-d9ee-4ba9-8069-59b5cae899dd |
| 4 | `reviewTypeId` | 评委类型 | `review_type_id` | 9e20b788-0e74-4843-8bf7-c86c428f7e26 |
| 5 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 6 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 7 | `dr` | 逻辑删除标记 | `dr` | Short |
| 8 | `ruleId` | 抽取规则ID | `rule_id` | 9e065ec2-d70e-48c2-8c3b-f24c7ddbeb5d |
| 9 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（5个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `expertReviewTypeId` | 原抽取方案评审类型主键 | `lawbid.cpuexpertplan.CpuExpertPlanReviewType` | None |  |
| 3 | `ruleId` | 抽取规则ID | `lawbid.cpuexpertplan.CpuExpertPlanRule` | None |  |
| 4 | `reviewTypeId` | 评委类型 | `cpu-basedoc.userdef.UserDefineVO` | Service |  |
| 5 | `ruleChgId` | 抽取规则ID | `lawbid.cpuexpertplanchg.CpuExpertPlanRuleChg` | None | true |
