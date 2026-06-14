---
tags: ["BIP", "元数据", "数据字典", "MR", "mr.timefence.TimeFence"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 计划策略 (`mr.timefence.TimeFence`)

> MR | 物理表：`mr_time_fence`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 计划策略 |
| 物理表 | `mr_time_fence` |
| domain/服务域 | `yonbip-mm-plan` |
| schema | `requirements_planning` |
| 所属应用 | `MR` |
| 构建时间 | `2026-06-05 15:13:47.0530` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |
| 编码 | `code` | String | 编码 |

---

## 直接属性（38个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `createDate` | 创建日期 | `create_date` | Date |
| 2 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 3 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 4 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 5 | `pubts` | 时间戳 | `pubts` | DateTime |
| 6 | `stoptime` | 停用时间 | `stop_time` | DateTime |
| 7 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 8 | `id` | id | `id` | Long |
| 9 | `orgId` | 计划组织 | `org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 10 | `code` | 编码 | `code` | String |
| 11 | `preDeductPeriodNumber` | 向前冲销 | `pre_deduct_period` | Integer |
| 12 | `afterDeductPeriodNumber` | 向后冲销 | `after_deduct_period` | Integer |
| 13 | `name` | 名称 | `name` | String |
| 14 | `prefabFlag` | 系统预置 | `prefab_flag` | Boolean |
| 15 | `stopstatus` | 启用状态 | `stopstatus` | Boolean |
| 16 | `remark` | 备注 | `remark` | String |
| 17 | `deductMethod` | 冲销方式 | `deduc_method` | DeductMethodEnum |
| 18 | `deductPeriod` | 冲销期间 | `deduct_period` | DeductPeriodEnum |
| 19 | `checkboxFirst` | 复选框 | `checkbox_first` | Boolean |
| 20 | `timeQuantumFirst` | 时段1 | `time_quant_first` | Integer |
| 21 | `requirementSourceFirst` | 需求来源 | `requirement_source_first` | RequirementSourceEnum |
| 22 | `checkboxSecond` | 复选框 | `checkbox_second` | Boolean |
| 23 | `timeQuantumSecond` | 时段2 | `time_quant_second` | Integer |
| 24 | `requirementSourceSecond` | 需求来源 | `requirement_source_second` | RequirementSourceEnum |
| 25 | `checkboxThird` | 复选框 | `checkbox_third` | Boolean |
| 26 | `timeQuantumThird` | 时段3 | `time_quant_third` | Integer |
| 27 | `requirementSourceThird` | 需求来源 | `requirement_source_third` | RequirementSourceEnum |
| 28 | `creator` | 创建人 | `creator` | String |
| 29 | `createTime` | 创建时间 | `create_time` | DateTime |
| 30 | `modifier` | 修改人 | `modifier` | String |
| 31 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 32 | `datasub` | 应用来源 | `datasub` | String |
| 33 | `demandType` | 计划策略独立需求来源类型 | `` | 6dedcba9-c8fb-4433-ab64-4c017ec27485 |
| 34 | `forecastDoc` | 预测单据 | `forecast_doc` | String |
| 35 | `mdsCalculation` | 按MDS运算 | `mds_calculation` | Boolean |
| 36 | `reversalDoc` | 冲销单据 | `reversal_doc` | String |
| 37 | `timeFenceType` | 类型 | `time_fence_type` | String |
| 38 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（6个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 3 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 4 | `orgId` | 计划组织 | `aa.baseorg.OrgMV` | Service |  |
| 5 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
| 6 | `demandType` | 计划策略独立需求来源类型 | `mr.timefence.TimeFenceDemandTypes` | None | true |
