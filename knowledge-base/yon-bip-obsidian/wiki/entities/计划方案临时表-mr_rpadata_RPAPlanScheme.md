---
tags: ["BIP", "元数据", "数据字典", "MR", "mr.rpadata.RPAPlanScheme"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 计划方案临时表 (`mr.rpadata.RPAPlanScheme`)

> MR | 物理表：`mr_rpa_plan_scheme`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 计划方案临时表 |
| 物理表 | `mr_rpa_plan_scheme` |
| domain/服务域 | `yonbip-mm-plan` |
| schema | `requirements_planning` |
| 所属应用 | `MR` |
| 构建时间 | `2026-06-05 15:11:11.7060` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（51个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `considerCurrentStock` | 只考虑现存量 | `consider_current_stock` | Boolean |
| 2 | `createDate` | 创建日期 | `create_date` | Date |
| 3 | `createTime` | 创建时间 | `create_time` | DateTime |
| 4 | `creator` | 创建人名称 | `creator` | String |
| 5 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 6 | `daysOffset` | 过期天数 | `days_offset` | Integer |
| 7 | `demandMergeDayType` | 合并需求日 | `demand_merge_day_type` | merg_start_day_enum |
| 8 | `demandMergeFlag` | 需求合并标识 | `demand_merge_flag` | Boolean |
| 9 | `demandMergePeriodType` | 合并时格 | `demand_merge_period_type` | period_type_enum |
| 10 | `demandMergePeriods` | 合并时格数 | `demand_merge_periods` | Integer |
| 11 | `demandMergeType` | 合并类型 | `demand_merge_type` | merge_type_enum |
| 12 | `demandOrder` | 需求排序 | `demand_order` | String |
| 13 | `docDateMethod` | 工单日期处理方式 | `doc_date_method` | doc_date_type_enum |
| 14 | `dr` | 逻辑删除标识 | `dr` | Integer |
| 15 | `futureDays` | 计划展望天数 | `future_days` | Integer |
| 16 | `hasMoreSupply` | 考虑需求日期之后供需 | `has_more_supply` | Boolean |
| 17 | `hasZeroPlan` | 生成需求为零的计划 | `has_zero_plan` | Boolean |
| 18 | `id` | ID | `id` | Long |
| 19 | `isAllowOverResource` | 计划数量允许超出需求来源 | `is_allow_over_resource` | Boolean |
| 20 | `itemScopeType` | 物料范围类型 | `item_scope_type` | item_scope_enum |
| 21 | `items` | 物料 | `items` | String |
| 22 | `modifier` | 修改人名称 | `modifier` | String |
| 23 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 24 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 25 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 26 | `orgId` | 计划组织 | `org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 27 | `orgMatchStrict` | 组织严格匹配 | `org_match_strict` | String |
| 28 | `overDays` | 超期供应天数 | `over_days` | Integer |
| 29 | `overDemandAsFlag` | 过期需求正排 | `over_demand_as_flag` | Boolean |
| 30 | `planEndDate` | 计划截止日期 | `plan_end_date` | DateTime |
| 31 | `planNameEndDate` | 计划名称截止日期 | `plan_name_end_date` | DateTime |
| 32 | `planNameEndDays` | 计划名称截止天数 | `plan_name_end_days` | Integer |
| 33 | `planNameStartDate` | 计划名称开始日期 | `plan_name_start_date` | DateTime |
| 34 | `planParamId` | 计划名称 | `plan_param_id` | 0d105898-52f1-4a97-971d-b334f721c74b |
| 35 | `planParamVersion` | 计划版本 | `plan_param_version` | Integer |
| 36 | `planSchemeId` | 计划方案 | `plan_scheme_id` | 0807eed3-7def-4362-b2ec-8fea5c435fc7 |
| 37 | `planStartDate` | 计划开始日期 | `plan_start_date` | DateTime |
| 38 | `planType` | 计划类型 | `plan_type` | PlanTypeAllEnum |
| 39 | `planners` | 计划员 | `planners` | String |
| 40 | `pubts` | 时间戳 | `pubts` | DateTime |
| 41 | `recordId` | 运算快照id | `record_id` | fd0f9ce5-d5c7-43cb-812b-41733565df18 |
| 42 | `rescheduleBackwardDays` | 重排后移天数 | `reschedule_backward_days` | Integer |
| 43 | `rescheduleForwardDays` | 重排前移天数 | `reschedule_forward_days` | Integer |
| 44 | `subItemFlag` | 考虑替代料 | `sub_item_flag` | Boolean |
| 45 | `supplyDemandExpiredDays` | 过期供应天数 | `supply_demand_expired_days` | Integer |
| 46 | `supplyDemandMatching` | 供需匹配维度 | `supply_demand_matching` | String |
| 47 | `supplyDocTypes` | 供应来源 | `supply_doc_types` | String |
| 48 | `supplyOrder` | 供应排序 | `supply_order` | String |
| 49 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 50 | `timeFenceId` | 计划策略 | `time_fence_id` | 69a6556e-bd79-4981-b6fd-86d13b77c6aa |
| 51 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（9个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `recordId` | 运算快照id | `mr.rpadata.Record` | None | true |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 4 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 5 | `planParamId` | 计划名称 | `mr.planworkbench.PlanParam` | None |  |
| 6 | `timeFenceId` | 计划策略 | `mr.timefence.TimeFence` | None |  |
| 7 | `planSchemeId` | 计划方案 | `mr.planscheme.PlanScheme` | None |  |
| 8 | `orgId` | 计划组织 | `aa.baseorg.OrgMV` | Service |  |
| 9 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
