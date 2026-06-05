---
tags: ["BIP", "元数据", "数据字典", "MR", "mr.planparam.MPSPlanParam"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 主生产计划运行 (`mr.planparam.MPSPlanParam`)

> MR | 物理表：`mr_plan_param`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 主生产计划运行 |
| 物理表 | `mr_plan_param` |
| 数据库 schema | `yonbip-mm-plan` |
| 所属应用 | `MR` |
| 构建时间 | `2026-06-05 15:10:30.9200` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `code` | String | 编码 |

---

## 直接属性（49个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `calculationMethod` | 计算方式 | `calculation_method` | calculation_method_enum |
| 2 | `closeDays` | 截止天数 | `close_days` | Integer |
| 3 | `code` | 编码 | `code` | String |
| 4 | `considerCurrentStock` | 只考虑现存量 | `consider_current_stock` | Boolean |
| 5 | `simulateStatus` | 模拟状态 | `simulate_status` | Integer |
| 6 | `supplyByPriorFlag` | 根据优先级重新分配供应 | `supply_by_prior_flag` | Short |
| 7 | `changeType` | 主需求计划改写方式 | `change_type` | change_type_enum |
| 8 | `versionId` | 主需求计划版本 | `version_id` | bc3e8b64-090b-403a-b32f-42cb0efa5b2c |
| 9 | `mdsPush` | MDS下推 | `mds_push` | Short |
| 10 | `createDate` | 创建日期 | `create_date` | Date |
| 11 | `createTime` | 创建时间 | `create_time` | DateTime |
| 12 | `creator` | 创建人名称 | `creator` | String |
| 13 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 14 | `customDate` | 自定义时间 | `custom_date` | DateTime |
| 15 | `datasub` | 应用来源 | `datasub` | String |
| 16 | `daysOffset` | 过期天数 | `days_offset` | Integer |
| 17 | `enabled` | 启用 | `enabled` | Boolean |
| 18 | `exceptionInfoCount` | 上次生成例外信息数量 | `exception_info_count` | Integer |
| 19 | `extendData` | 扩展字段 | `extenddata` | String |
| 20 | `futureDays` | 计划展望天数 | `future_days` | Integer |
| 21 | `hasMoreSupply` | 考虑需求日期之后供需 | `has_more_supply` | Boolean |
| 22 | `hasZeroPlan` | 生成需求为零的计划 | `has_zero_plan` | Boolean |
| 23 | `id` | ID | `id` | Long |
| 24 | `isAllowOverResource` | 计划数量允许超出需求来源 | `is_allow_over_resource` | Boolean |
| 25 | `modifier` | 修改人名称 | `modifier` | String |
| 26 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 27 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 28 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 29 | `name` | 名称 | `name` | String |
| 30 | `orgId` | 计划组织id | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 31 | `planEndDate` | 计划截止日期 | `plan_end_date` | DateTime |
| 32 | `planOrderCount` | 上次生成计划订单数量 | `plan_order_count` | Integer |
| 33 | `planSchemeExtendId` | 扩展计划方案 | `plan_scheme_extend_id` | 0807eed3-7def-4362-b2ec-8fea5c435fc7 |
| 34 | `planSchemeId` | 计划方案 | `plan_scheme_id` | 0807eed3-7def-4362-b2ec-8fea5c435fc7 |
| 35 | `planStartDate` | 计划开始日期 | `plan_start_date` | DateTime |
| 36 | `planType` | 计划参数类型 | `plan_type` | PlanTypeAllEnum |
| 37 | `pubts` | 时间戳 | `pubts` | DateTime |
| 38 | `recentPlanDate` | 最近计划日期 | `recent_plan_date` | DateTime |
| 39 | `recentPlanEndDate` | 最近计划结束时间 | `recent_plan_end_date` | DateTime |
| 40 | `recentPlanStartDate` | 最近计划起始时间 | `recent_plan_start_date` | DateTime |
| 41 | `remark` | 备注 | `remark` | String |
| 42 | `runPlanStatus` | 运行状态 | `run_plan_status` | Integer |
| 43 | `runVersions` | 计划执行版本 | `run_versions` | Integer |
| 44 | `snapshotFlag` | 快照 | `snapshot_flag` | Boolean |
| 45 | `status` | 计划状态 | `status` | PlanParamStatusEnum |
| 46 | `supplyDemandExpiredDays` | 过期供应天数 | `supply_demand_expired_days` | Integer |
| 47 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 48 | `timeFenceId` | 时界 | `time_fence_id` | 69a6556e-bd79-4981-b6fd-86d13b77c6aa |
| 49 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（9个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `versionId` | 主需求计划版本 | `mr.planscheme.Version` | None |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 4 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 5 | `planSchemeExtendId` | 扩展计划方案 | `mr.planscheme.PlanScheme` | None |  |
| 6 | `timeFenceId` | 时界 | `mr.timefence.TimeFence` | None |  |
| 7 | `planSchemeId` | 计划方案 | `mr.planscheme.PlanScheme` | None |  |
| 8 | `orgId` | 计划组织id | `org.func.BaseOrg` | Service |  |
| 9 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
