---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.cpuexpertplanchg.CpuExpertPlanRuleChg"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 专家补抽单表体抽取规则 (`lawbid.cpuexpertplanchg.CpuExpertPlanRuleChg`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_expert_plan_rule_chg`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 专家补抽单表体抽取规则 |
| 物理表 | `cpu_expert_plan_rule_chg` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 20:00:07.1820` |

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

## 直接属性（20个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | id | `id` | Long |
| 2 | `expertRuleId` | 原抽取规则主键 | `expert_rule_id` | 9e065ec2-d70e-48c2-8c3b-f24c7ddbeb5d |
| 3 | `expertPlanChgId` | 专家抽取方案ID | `expert_plan_chg_id` | 3b7262c7-c461-45b8-b8cc-950f46405e46 |
| 4 | `cpuExpertPlanRuleChgDefineCharacter` | 专家补抽单表体抽取规则特征 | `define_character_id` | d52e9129-3754-4cb7-a6da-053152bd8374 |
| 5 | `condition` | 规则配置 | `content` | String |
| 6 | `expressionDisplay` | 规则配置描述 | `expression_display` | String |
| 7 | `state` | 状态 | `state` | String |
| 8 | `drawNum` | 抽取人数 | `draw_num` | Integer |
| 9 | `realNum` | 已确认参评人数 | `real_num` | Integer |
| 10 | `remark` | 备注 | `remark` | String |
| 11 | `reviewTypeId` | 评审类型主键 | `review_type_id` | 9e20b788-0e74-4843-8bf7-c86c428f7e26 |
| 12 | `reviewType` | 评审类型 | `review_type` | String |
| 13 | `batchNo` | 批次 | `batch_no` | Integer |
| 14 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 15 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 16 | `dr` | 逻辑删除标记 | `dr` | Short |
| 17 | `expertPlanId` | 专家抽取方案ID | `plan_id` | 68a1e01e-9b68-40bd-9070-bcaaf8b65d03 |
| 18 | `cpuExpertPlanRuleDefineCharacter` | 抽取规则特征 | `define_character_id` | 6e4cb1f1-4d12-45bf-8e47-5f1fcf1ab832 |
| 19 | `pubts` | 时间戳 | `pubts` | DateTime |
| 20 | `reviewTypeChgList` | 专家补抽单评审类型 | `` | 4af0a812-576c-4cf6-8995-973882ccb4b6 |

---

## 关联属性（8个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `cpuExpertPlanRuleChgDefineCharacter` | 专家补抽单表体抽取规则特征 | `lawbid.cpuexpertplanchg.CpuExpertPlanRuleChgDefineCharacter` | None |  |
| 2 | `expertRuleId` | 原抽取规则主键 | `lawbid.cpuexpertplan.CpuExpertPlanRule` | None |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `cpuExpertPlanRuleDefineCharacter` | 抽取规则特征 | `lawbid.cpuexpertplan.CpuExpertPlanRuleDefineCharacter` | None |  |
| 5 | `expertPlanChgId` | 专家抽取方案ID | `lawbid.cpuexpertplanchg.CpuExpertPlanChg` | None | true |
| 6 | `expertPlanId` | 专家抽取方案ID | `lawbid.cpuexpertplan.CpuExpertPlan` | None |  |
| 7 | `reviewTypeChgList` | 专家补抽单评审类型 | `lawbid.cpuexpertplanchg.CpuExpertPlanReviewTypeChg` | None | true |
| 8 | `reviewTypeId` | 评审类型主键 | `cpu-basedoc.userdef.UserDefineVO` | Service |  |
