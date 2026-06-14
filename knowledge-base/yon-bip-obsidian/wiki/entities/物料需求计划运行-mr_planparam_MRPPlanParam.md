---
tags: ["BIP", "元数据", "数据字典", "MR", "mr.planparam.MRPPlanParam"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 物料需求计划运行 (`mr.planparam.MRPPlanParam`)

> MR | 物理表：`mr_plan_param`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 物料需求计划运行 |
| 物理表 | `mr_plan_param` |
| domain/服务域 | `yonbip-mm-plan` |
| schema | `requirements_planning` |
| 所属应用 | `MR` |
| 构建时间 | `2026-06-05 15:10:32.7990` |

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
| 2 | `changeType` | 主需求计划改写方式 | `change_type` | change_type_enum |
| 3 | `closeDays` | 截止天数 | `close_days` | Integer |
| 4 | `code` | 编码 | `code` | String |
| 5 | `considerCurrentStock` | 只考虑现存量 | `consider_current_stock` | Boolean |
| 6 | `createDate` | 创建日期 | `create_date` | Date |
| 7 | `createTime` | 创建时间 | `create_time` | DateTime |
| 8 | `creator` | 创建人名称 | `creator` | String |
| 9 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 10 | `customDate` | 自定义时间 | `custom_date` | DateTime |
| 11 | `datasub` | 应用来源 | `datasub` | String |
| 12 | `daysOffset` | 过期天数 | `days_offset` | Integer |
| 13 | `enabled` | 启用 | `enabled` | Boolean |
| 14 | `exceptionInfoCount` | 上次生成例外信息数量 | `exception_info_count` | Integer |
| 15 | `extendData` | 扩展字段 | `extenddata` | String |
| 16 | `futureDays` | 计划展望天数 | `future_days` | Integer |
| 17 | `hasMoreSupply` | 考虑需求日期之后供需 | `has_more_supply` | Boolean |
| 18 | `hasZeroPlan` | 生成需求为零的计划 | `has_zero_plan` | Boolean |
| 19 | `id` | ID | `id` | Long |
| 20 | `isAllowOverResource` | 计划数量允许超出需求来源 | `is_allow_over_resource` | Boolean |
| 21 | `mdsPush` | MDS下推 | `mds_push` | Short |
| 22 | `modifier` | 修改人名称 | `modifier` | String |
| 23 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 24 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 25 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 26 | `name` | 名称 | `name` | String |
| 27 | `orgId` | 所属组织 | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 28 | `planEndDate` | 计划截止日期 | `plan_end_date` | DateTime |
| 29 | `planOrderCount` | 上次生成计划订单数量 | `plan_order_count` | Integer |
| 30 | `planSchemeExtendId` | 扩展计划方案 | `plan_scheme_extend_id` | 0807eed3-7def-4362-b2ec-8fea5c435fc7 |
| 31 | `planSchemeId` | 计划方案 | `plan_scheme_id` | 0807eed3-7def-4362-b2ec-8fea5c435fc7 |
| 32 | `planStartDate` | 计划开始日期 | `plan_start_date` | DateTime |
| 33 | `planType` | 计划参数类型 | `plan_type` | PlanTypeAllEnum |
| 34 | `pubts` | 时间戳 | `pubts` | DateTime |
| 35 | `recentPlanDate` | 最近计划日期 | `recent_plan_date` | DateTime |
| 36 | `recentPlanEndDate` | 最近计划结束时间 | `recent_plan_end_date` | DateTime |
| 37 | `recentPlanStartDate` | 最近计划起始时间 | `recent_plan_start_date` | DateTime |
| 38 | `remark` | 备注 | `remark` | String |
| 39 | `runPlanStatus` | 运行状态 | `run_plan_status` | Integer |
| 40 | `runVersions` | 计划执行版本 | `run_versions` | Integer |
| 41 | `simulateStatus` | 模拟状态 | `simulate_status` | Integer |
| 42 | `snapshotFlag` | 快照 | `snapshot_flag` | Boolean |
| 43 | `status` | 计划状态 | `status` | PlanParamStatusEnum |
| 44 | `supplyByPriorFlag` | 根据优先级重新分配供应 | `supply_by_prior_flag` | Short |
| 45 | `supplyDemandExpiredDays` | 过期供应天数 | `supply_demand_expired_days` | Integer |
| 46 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 47 | `timeFenceId` | 时界 | `time_fence_id` | 69a6556e-bd79-4981-b6fd-86d13b77c6aa |
| 48 | `versionId` | 主需求计划版本 | `version_id` | bc3e8b64-090b-403a-b32f-42cb0efa5b2c |
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
| 8 | `orgId` | 所属组织 | `org.func.BaseOrg` | Service |  |
| 9 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
