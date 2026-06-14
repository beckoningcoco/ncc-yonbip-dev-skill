---
tags: ["BIP", "元数据", "数据字典", "MR", "mr.planworkbench.PlanParam"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 计划参数 (`mr.planworkbench.PlanParam`)

> MR | 物理表：`mr_plan_param`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 计划参数 |
| 物理表 | `mr_plan_param` |
| domain/服务域 | `yonbip-mm-plan` |
| schema | `requirements_planning` |
| 所属应用 | `MR` |
| 构建时间 | `2026-06-05 15:13:15.7220` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 计划参数id |
| 编码 | `code` | String | 编码 |

---

## 直接属性（52个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `closeDays` | 截止天数 | `close_days` | Integer |
| 2 | `datasub` | 应用来源 | `datasub` | String |
| 3 | `exceptionInfoCount` | 上次生成例外信息数量 | `exception_info_count` | Integer |
| 4 | `extendData` | 扩展字段 | `extenddata` | String |
| 5 | `supplyByPriorFlag` | 根据优先级重新分配供应 | `supply_by_prior_flag` | Short |
| 6 | `changeType` | 主需求计划改写方式 | `change_type` | change_type_enum |
| 7 | `versionId` | 主需求计划版本 | `version_id` | bc3e8b64-090b-403a-b32f-42cb0efa5b2c |
| 8 | `mdsPush` | MDS下推 | `mds_push` | Short |
| 9 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 10 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 11 | `planOrderCount` | 上次生成计划订单数量 | `plan_order_count` | Integer |
| 12 | `planSchemeExtendId` | 扩展计划方案 | `plan_scheme_extend_id` | 0807eed3-7def-4362-b2ec-8fea5c435fc7 |
| 13 | `recentPlanDate` | 最近计划日期 | `recent_plan_date` | DateTime |
| 14 | `runVersions` | 计划执行版本 | `run_versions` | Integer |
| 15 | `simulateStatus` | 模拟状态 | `simulate_status` | Integer |
| 16 | `supplyDemandExpiredDays` | 过期供应天数 | `supply_demand_expired_days` | Integer |
| 17 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 18 | `timeFenceId` | 时界 | `time_fence_id` | 69a6556e-bd79-4981-b6fd-86d13b77c6aa |
| 19 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 20 | `id` | 计划参数id | `id` | Long |
| 21 | `code` | 编码 | `code` | String |
| 22 | `orgId` | 计划组织id | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 23 | `name` | 名称 | `name` | String |
| 24 | `createDate` | 当前时间 | `create_date` | Date |
| 25 | `customDate` | 开始日期 | `custom_date` | DateTime |
| 26 | `planEndDate` | 截止日期 | `plan_end_date` | DateTime |
| 27 | `daysOffset` | 过期供需天数 | `days_offset` | Integer |
| 28 | `planSchemeId` | 计划方案ID | `plan_scheme_id` | 0807eed3-7def-4362-b2ec-8fea5c435fc7 |
| 29 | `futureDays` | 计划展望天数 | `future_days` | Integer |
| 30 | `planStartDate` | 计划开始日期 | `plan_start_date` | DateTime |
| 31 | `considerCurrentStock` | 只考虑现存量 | `consider_current_stock` | Boolean |
| 32 | `enabled` | 启用状态 | `enabled` | Boolean |
| 33 | `hasMoreSupply` | 考虑需求日期之后供需 | `has_more_supply` | Boolean |
| 34 | `snapshotFlag` | 快照 | `snapshot_flag` | Boolean |
| 35 | `hasZeroPlan` | 生成数量为0计划订单 | `has_zero_plan` | Boolean |
| 36 | `runPlanStatus` | 运算状态 | `run_plan_status` | Integer |
| 37 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 38 | `isAllowOverResource` | 计划数量允许超出需求来源 | `is_allow_over_resource` | Boolean |
| 39 | `recentPlanEndDate` | 计划运算时间 | `recent_plan_end_date` | DateTime |
| 40 | `creator` | 创建人 | `creator` | String |
| 41 | `recentPlanStartDate` | 计划开始时间 | `recent_plan_start_date` | DateTime |
| 42 | `calculationMethod` | 计算方式 | `calculation_method` | calculation_method_enum |
| 43 | `createTime` | 创建时间 | `create_time` | DateTime |
| 44 | `modifier` | 修改人 | `modifier` | String |
| 45 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 46 | `status` | 状态 | `status` | PlanParamStatusEnum |
| 47 | `planType` | 计划类型 | `plan_type` | PlanTypeAllEnum |
| 48 | `remark` | 备注 | `remark` | String |
| 49 | `pubts` | 时间戳 | `pubts` | DateTime |
| 50 | `planOrders` | 计划订单 | `` | 8217afbf-acdc-42ef-a799-75a88d9fa69d |
| 51 | `planParamExt` | 计划参数扩展 | `` | b318f122-8caf-432e-877c-82e4c0174e53 |
| 52 | `planParamItem` | 计划参数明细 | `` | 765b3e8c-be3a-41f4-9145-93a7a0c60ebf |

---

## 关联属性（12个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `versionId` | 主需求计划版本 | `mr.planscheme.Version` | None |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `planParamExt` | 计划参数扩展 | `mr.planworkbench.PlanParamExt` | None | true |
| 4 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 5 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 6 | `planParamItem` | 计划参数明细 | `mr.planworkbench.PlanParamItem` | None | true |
| 7 | `planSchemeExtendId` | 扩展计划方案 | `mr.planscheme.PlanScheme` | None |  |
| 8 | `planOrders` | 计划订单 | `mr.planworkbench.PlanOrder` | None | true |
| 9 | `timeFenceId` | 时界 | `mr.timefence.TimeFence` | None |  |
| 10 | `planSchemeId` | 计划方案ID | `mr.planscheme.PlanScheme` | None |  |
| 11 | `orgId` | 计划组织id | `org.func.BaseOrg` | Service |  |
| 12 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
