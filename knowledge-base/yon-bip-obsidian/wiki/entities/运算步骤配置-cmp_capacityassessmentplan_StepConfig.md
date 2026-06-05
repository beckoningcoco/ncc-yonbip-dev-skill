---
tags: ["BIP", "元数据", "数据字典", "DCRP", "cmp.capacityassessmentplan.StepConfig"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 运算步骤配置 (`cmp.capacityassessmentplan.StepConfig`)

> DCRP | 物理表：`cmp_capacity_cal_step_config`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 运算步骤配置 |
| 物理表 | `cmp_capacity_cal_step_config` |
| 数据库 schema | `yonbip-mm-plan` |
| 所属应用 | `DCRP` |
| 构建时间 | `2026-06-05 13:58:56.5080` |

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
| 3 | `planId` | 能力评估方案ID | `plan_id` | 041020b1-3648-445c-9ed9-4343313ab927 |
| 4 | `serialNo` | 顺序号 | `serial_no` | Decimal |
| 5 | `algorithmConfigurationId` | 算法配置ID | `algorithm_configuration_id` | e0cc2683-9758-484f-8a7b-81a49003db27 |
| 6 | `calStepId` | 运算步骤ID | `cal_step_id` | 193f4be0-344b-4d24-8692-a750270a13b9 |
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
| 4 | `planId` | 能力评估方案ID | `cmp.capacityassessmentplan.CapacityAssessmentPlan` | None | true |
| 5 | `calStepId` | 运算步骤ID | `cmp.calstep.CalStep` | None |  |
| 6 | `algorithmConfigurationId` | 算法配置ID | `cmp.alconfig.AlgorithmConfiguration` | None |  |
