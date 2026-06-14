---
tags: ["BIP", "元数据", "数据字典", "DCRP", "cmp.capacityassessmentplan.ConstraintRuleConfig"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 约束规则配置 (`cmp.capacityassessmentplan.ConstraintRuleConfig`)

> DCRP | 物理表：`cmp_capacity_constraint_rule_config`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 约束规则配置 |
| 物理表 | `cmp_capacity_constraint_rule_config` |
| domain/服务域 | `yonbip-mm-plan` |
| schema | `requirements_planning` |
| 所属应用 | `DCRP` |
| 构建时间 | `2026-06-05 13:58:52.4860` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（18个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | ID | `id` | Long |
| 3 | `algorithmConfigurationId` | 算法配置ID | `algorithm_configuration_id` | e0cc2683-9758-484f-8a7b-81a49003db27 |
| 4 | `ruleId` | 约束规则ID | `rule_id` | 563dd185-8121-44c6-8b06-b433af07e3fa |
| 5 | `planId` | 能力计划方案ID | `plan_id` | 041020b1-3648-445c-9ed9-4343313ab927 |
| 6 | `bSelect` | 选择 | `b_select` | Short |
| 7 | `createTime` | 创建时间 | `create_time` | DateTime |
| 8 | `createDate` | 创建日期 | `create_date` | Date |
| 9 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 10 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 11 | `creator` | 创建人名称 | `creator` | String |
| 12 | `modifier` | 修改人名称 | `modifier` | String |
| 13 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 14 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 15 | `enable` | 启用 | `enable` | sys_intboolean |
| 16 | `enablets` | 启用时间 | `enablets` | DateTime |
| 17 | `disablets` | 停用时间 | `disablets` | DateTime |
| 18 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（6个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 3 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 4 | `planId` | 能力计划方案ID | `cmp.capacityassessmentplan.CapacityAssessmentPlan` | None | true |
| 5 | `ruleId` | 约束规则ID | `cmp.constraintRule.ConstraintRule` | None |  |
| 6 | `algorithmConfigurationId` | 算法配置ID | `cmp.alconfig.AlgorithmConfiguration` | None |  |
