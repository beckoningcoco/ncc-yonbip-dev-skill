---
tags: ["BIP", "元数据", "数据字典", "MR", "mr.planscheme.PlanScheme"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 计划方案 (`mr.planscheme.PlanScheme`)

> MR | 物理表：`mr_plan_scheme`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 计划方案 |
| 物理表 | `mr_plan_scheme` |
| 数据库 schema | `yonbip-mm-plan` |
| 所属应用 | `MR` |
| 构建时间 | `2026-06-05 15:12:47.2690` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（104个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `datasub` | 应用来源 | `datasub` | String |
| 2 | `originalId` | 计划方案原始id | `original_id` | Long |
| 3 | `calculationMethod` | 计算方式 | `calculation_method` | calculation_method_enum |
| 4 | `planArea` | 计划区域ID | `plan_area` | 332b10c1-76bf-45d5-8aa7-421964568756 |
| 5 | `considerCurrentStock` | 只考虑现存量 | `consider_current_stock` | Boolean |
| 6 | `createDate` | 创建日期 | `create_date` | Date |
| 7 | `demandOrder` | 需求排序 | `demand_order` | String |
| 8 | `userdefItemMergeFlag` | 按固定自定义项合并 | `userdef_item_merge_flag` | Boolean |
| 9 | `docDateMethod` | 工单日期处理方式 | `doc_date_method` | doc_date_type_enum |
| 10 | `reschedulePreparationRange` | 重展备料范围 | `reschedule_preparation_range` | String |
| 11 | `byproductCycleCheck` | 联副参与BOM循环检查 | `byproduct_cycle_check` | Integer |
| 12 | `futureDays` | 计划展望天数 | `future_days` | Integer |
| 13 | `safeStockMergeFlag` | 合并安全库存需求 | `safe_stock_merge_flag` | Boolean |
| 14 | `subItemReqAlternate` | 考虑计划备料需求替代 | `sub_item_req_alternate` | Boolean |
| 15 | `staySorceMergeFlag` | 合并后保留来源单据线索 | `stay_sorce_merge_flag` | Boolean |
| 16 | `rescheduleSupplyQuantityFlag` | 重排供应数量 | `reschedule_supply_quantity_flag` | Short |
| 17 | `cmpAssessFlag` | 能力评估标识 | `cmp_assess_flag` | Boolean |
| 18 | `simulateType` | 模拟类型 | `simulate_type` | simulate_type_enum |
| 19 | `capacityAssessmentPlanId` | 能力评估方案 | `capacity_assessment_plan_id` | 041020b1-3648-445c-9ed9-4343313ab927 |
| 20 | `rollingFutureDays` | 滚动展望天数 | `rolling_future_days` | Integer |
| 21 | `newLLCType` | 低阶码计算方式 | `new_llc_type` | llc_cal_type_enum |
| 22 | `enableProductReSupply` | 启用物料的供应重排参数 | `enable_product_resupply` | Boolean |
| 23 | `enableProductMeDemand` | 启用物料的需求合并参数 | `enable_product_medemand` | Boolean |
| 24 | `priorRuleId` | 需求优先级规则 | `prior_rule_id` | 17a09d25-1e8d-4e89-af42-76d5be478153 |
| 25 | `virtualPartBomExpand` | 虚拟件未展开BOM终止 | `virtual_part_bom_expand` | Short |
| 26 | `groupingDimension` | 分组维度 | `grouping_dimension` | String |
| 27 | `timeBucket` | 分析期间 | `time_bucket_id` | 4e2f676d-fbf6-448e-b43f-aae7fd6fa808 |
| 28 | `autoAuditFlag` | 自动审核主需求计划 | `auto_audit_flag` | Short |
| 29 | `changeType` | 主需求计划改写方式 | `change_type` | change_type_enum |
| 30 | `matchSrcProduct` | 来源物料作为供需匹配维度 | `match_src_product` | Boolean |
| 31 | `planDefaultAttribute` | 计划默认属性 | `plan_default_Attr` | String |
| 32 | `warehouseMatchStrict` | 仓库严格匹配 | `warehouse_match_strict` | Short |
| 33 | `orderOutputRange` | 计划订单输出范围类型 | `order_output_range` | item_scope_enum |
| 34 | `shortageCalMethod` | 缺料明细计算方式 | `shortage_cal_method` | String |
| 35 | `wholeSimFlag` | 齐套模拟 | `whole_sim_flag` | Short |
| 36 | `expandLevel` | 展开层次 | `expand_level` | String |
| 37 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 38 | `hasMoreSupply` | 考虑需求日期之后供需 | `has_more_supply` | Boolean |
| 39 | `isAllowOverResource` | 计划数量允许超出需求来源 | `is_allow_over_resource` | Boolean |
| 40 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 41 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 42 | `overDemandAsFlag` | 过期需求正排 | `over_demand_as_flag` | Boolean |
| 43 | `planEndDate` | 计划截止日期 | `plan_end_date` | DateTime |
| 44 | `planStartDate` | 计划开始日期 | `plan_start_date` | DateTime |
| 45 | `stopstatus` | 停用状态 | `stopstatus` | Boolean |
| 46 | `stoptime` | 停用时间 | `stop_time` | DateTime |
| 47 | `inverted` | 提前期不足是否倒排 | `inverted` | Boolean |
| 48 | `requirementSourceType` | 需求来源类型 | `requirement_source_type` | requirement_source_type_enum |
| 49 | `supplyDemandExpiredDays` | 过期供应天数 | `supply_demand_expired_days` | Integer |
| 50 | `bomUnfoldMark` | bom展开标识 | `bom_unfold_mark` | Boolean |
| 51 | `supplyOrder` | 供应排序 | `supply_order` | String |
| 52 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 53 | `orgId` | 计划组织ID | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 54 | `code` | 编码 | `code` | String |
| 55 | `expandLatestBom` | 按最新BOM版本展开 | `expand_latest_bom` | Short |
| 56 | `considerSafetyStock` | 考虑安全库存 | `consider_safety_stock` | Short |
| 57 | `name` | 名称 | `name` | String |
| 58 | `remark` | 备注 | `remark` | String |
| 59 | `enabled` | 启用状态 | `enabled` | Boolean |
| 60 | `timeFenceId` | 时界ID | `time_fence_id` | 69a6556e-bd79-4981-b6fd-86d13b77c6aa |
| 61 | `subItemFlag` | 考虑替代料 | `sub_item_flag` | Boolean |
| 62 | `hasZeroPlan` | 生成数量为0的计划订单 | `has_zero_plan` | Boolean |
| 63 | `rescheduleOrderPreparation` | 重展计划订单备料 | `reschedule_order_preparation` | Boolean |
| 64 | `itemScopeType` | 物料 | `item_scope_type` | item_scope_enum |
| 65 | `planners` | 按计划员ID | `planners` | 78bff1de-ddf1-4814-90de-b0b5f1eac78a |
| 66 | `items` | 制造物料ID | `items` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 67 | `orgMatchStrict` | 组织严格匹配 | `org_match_strict` | String |
| 68 | `overDays` | 供应超期天数 | `over_days` | Integer |
| 69 | `isDeduct` | 冲销 | `is_deduct` | Boolean |
| 70 | `stockType` | 库存 | `stock_type` | stock_enum |
| 71 | `deductPeriod` | 冲销期间 | `deduct_period` | write_off_period_enum |
| 72 | `supplyDocuments` | 供应单据 | `supply_documents` | supply_documents_enum |
| 73 | `daysOffset` | 过期供需天数 | `days_offset` | Integer |
| 74 | `deductDays` | 冲销天数 | `deduct_days` | Integer |
| 75 | `demandMergeFlag` | 需求合并标识 | `demand_merge_flag` | Boolean |
| 76 | `demandMergeType` | 合并类型 | `demand_merge_type` | merge_type_enum |
| 77 | `preDeductPeriodNumber` | 向前冲销 | `pre_deduct_period` | Integer |
| 78 | `afterDeductPeriodNumber` | 向后冲销 | `after_deduct_period` | Integer |
| 79 | `demandMergePeriodType` | 合并时格 | `demand_merge_period_type` | period_type_enum |
| 80 | `demandMergePeriods` | 合并时格数 | `demand_merge_periods` | Integer |
| 81 | `demandMergeDayType` | 合并需求日 | `demand_merge_day_type` | merg_start_day_enum |
| 82 | `rescheduleForwardDays` | 重排前移天数 | `reschedule_forward_days` | Integer |
| 83 | `rescheduleBackwardDays` | 重排后移天数 | `reschedule_backward_days` | Integer |
| 84 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 85 | `creator` | 创建人 | `creator` | String |
| 86 | `createTime` | 创建时间 | `create_time` | DateTime |
| 87 | `modifier` | 修改人 | `modifier` | String |
| 88 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 89 | `id` | ID | `id` | Long |
| 90 | `planType` | 计划类型 | `plan_type` | PlanTypeAllEnum |
| 91 | `supplyDemandMatching` | 附带字段 | `supply_demand_matching` | String |
| 92 | `pubts` | 时间戳 | `pubts` | DateTime |
| 93 | `fenceAllocatMethod` | 计划策略分配方式 | `fence_allocat_method` | fence_method_enum |
| 94 | `materialBatchStrategy` | 物料批量策略来源 | `material_batch_strategy` | material_batch_strategy_enum |
| 95 | `materialLeadtimeStrategy` | 物料提前期来源 | `material_leadtime_strategy` | material_leadtime_strategy_enum |
| 96 | `outsourcedLeadTimeType` | 委外件提前期计算方式 | `outsourced_leadTime_type` | Short |
| 97 | `planSchemeExt` | 计划方案扩展 | `` | 20cb2c7a-e9bc-492c-99cf-68547e00540f |
| 98 | `planSchemeItems` | 对应的物料表 | `` | d35ca39b-3f55-4940-88c4-d1e788855621 |
| 99 | `planSchemeOrgs` | 组织范围 | `` | c64bc520-d070-4129-ace1-9e960444deb0 |
| 100 | `planSchemeStockPlan` | 计划方案库存计划 | `` | 4fbc18ae-2b28-45cb-8be9-086b8ed0178a |
| 101 | `purchasedLeadTimeType` | 采购件提前期计算方式 | `purchased_leadTime_type` | Short |
| 102 | `safetyStockPriority` | 安全库存优先级 | `safety_stock_priority` | String |
| 103 | `supplyDoctypes` | 计划方案供需单据类型 | `` | 55ee369e-be57-438b-8899-60f47b8a2fc6 |
| 104 | `transTypeId` | 交易类型 | `trans_type_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |

---

## 关联属性（18个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `planSchemeItems` | 对应的物料表 | `mr.planscheme.PlanSchemeItem` | None | true |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 4 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 5 | `planSchemeStockPlan` | 计划方案库存计划 | `mr.planscheme.PlanSchemeStockPlan` | None | true |
| 6 | `capacityAssessmentPlanId` | 能力评估方案 | `cmp.capacityassessmentplan.CapacityAssessmentPlan` | None |  |
| 7 | `priorRuleId` | 需求优先级规则 | `mr.prioritization.Rules` | None |  |
| 8 | `planners` | 按计划员ID | `bd.staff.StaffNew` | Service |  |
| 9 | `orgId` | 计划组织ID | `org.func.BaseOrg` | Service |  |
| 10 | `planArea` | 计划区域ID | `mr.area.MrpArea` | None |  |
| 11 | `planSchemeOrgs` | 组织范围 | `mr.planscheme.PlanSchemeOrg` | None | true |
| 12 | `transTypeId` | 交易类型 | `bd.bill.TransType` | Service |  |
| 13 | `timeBucket` | 分析期间 | `mr.timebucket.TimeBucket` | None |  |
| 14 | `timeFenceId` | 时界ID | `mr.timefence.TimeFence` | None |  |
| 15 | `planSchemeExt` | 计划方案扩展 | `mr.planscheme.PlanSchemeExt` | None | true |
| 16 | `items` | 制造物料ID | `pc.product.Product` | Service |  |
| 17 | `supplyDoctypes` | 计划方案供需单据类型 | `mr.planscheme.PlanSchemeSupplyDocTypes` | None | true |
| 18 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
