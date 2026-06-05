---
tags: ["BIP", "元数据", "数据字典", "IMP_PES", "pes.serviceplan.ServicePlanVO"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 服务计划 (`pes.serviceplan.ServicePlanVO`)

> IMP_PES | 物理表：`imp_pes_sp`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 服务计划 |
| 物理表 | `imp_pes_sp` |
| 数据库 schema | `imppes` |
| 所属应用 | `IMP_PES` |
| 构建时间 | `2026-06-05 17:19:25.2790` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | id |
| 编码 | `code` | String | 计划编码 |

---

## 直接属性（40个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `orgId` | 组织id | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 2 | `code` | 计划编码 | `code` | String |
| 3 | `name` | 计划名称 | `name` | String |
| 4 | `transactionTypeId` | 交易类型id | `transaction_type_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 5 | `serviceTypeId` | 服务类型id | `service_type_id` | 792f6d8f-bf3b-4090-ac4d-a7f2e9230758 |
| 6 | `equipmentCategoryId` | 设备分类id | `equipment_category_id` | 2cc09807-e5f0-4c71-a7ac-c4f932b8bdb7 |
| 7 | `qaType` | 质保类型 | `qa_type` | String |
| 8 | `equipmentUsedStatus` | 设备状态 | `equipment_used_status` | 6c5e29e8-10de-4a61-88cd-7f97ca7608d0 |
| 9 | `acceptanceStatus` | 验收状态 | `acceptance_status` | String |
| 10 | `servicePlanTemplateId` | 服务计划模板id | `service_plan_template_id` | 1c684a58-6c2a-4ead-af06-b0e3bd45dd9f |
| 11 | `customerLevelId` | 客户级别id | `customer_level_id` | 40e121d8-8927-4bf1-ba4f-22a7b9f7b3b5 |
| 12 | `positionId` | 地区id | `position_id` | 95577e23-979f-4f09-a629-61fea93e576d |
| 13 | `servicePlanRuleId` | 服务计划规则id | `service_plan_rule_id` | 47b77117-abd1-458f-b828-61beec151938 |
| 14 | `startTime` | 计划开始时间 | `start_time` | DateTime |
| 15 | `endTime` | 计划结束时间 | `end_time` | DateTime |
| 16 | `status` | 状态 | `status` | String |
| 17 | `enable` | 启用 | `enable` | String |
| 18 | `memo` | 备注 | `memo` | String |
| 19 | `taskId` | 任务id | `task_id` | String |
| 20 | `businessKey` | 业务主键 | `business_key` | String |
| 21 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 22 | `creator` | 创建人 | `creator` | String |
| 23 | `createTime` | 创建时间 | `create_time` | DateTime |
| 24 | `createDate` | 创建日期 | `create_date` | Date |
| 25 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 26 | `modifier` | 修改人名称 | `modifier` | String |
| 27 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 28 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 29 | `id` | id | `id` | String |
| 30 | `enablets` | 启用时间 | `enablets` | DateTime |
| 31 | `disablets` | 停用时间 | `disablets` | DateTime |
| 32 | `dr` | DR | `dr` | Short |
| 33 | `tenant` | 租户ID | `tenant_id` | String |
| 34 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 35 | `pubts` | 时间戳 | `pubts` | DateTime |
| 36 | `ExecutionLogVOList` | 执行日志 | `` | 4f7e9c48-8577-42ab-bc81-7612853504bf |
| 37 | `MaterialQuotaVOList` | 物料定额 | `` | 748bc5f7-5373-486d-b99e-204c00f752c7 |
| 38 | `RelationEquipmentVOList` | 关联设备 | `` | a49da1f8-2bb2-4e9f-8cf2-1b9e025a3397 |
| 39 | `ServiceProjectStandardVOList` | 服务项目标准 | `` | fa8c9dcf-714e-454a-bf38-414095237753 |
| 40 | `customId` | 客户 | `custom_id` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 |

---

## 关联属性（17个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `MaterialQuotaVOList` | 物料定额 | `pes.serviceplan.MaterialQuotaVO` | None | true |
| 2 | `transactionTypeId` | 交易类型id | `bd.bill.TransType` | Service |  |
| 3 | `equipmentCategoryId` | 设备分类id | `ampub.ambase.CategoryVO` | Service |  |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 5 | `RelationEquipmentVOList` | 关联设备 | `pes.serviceplan.RelationEquipmentVO` | None | true |
| 6 | `customerLevelId` | 客户级别id | `aa.agentlevel.AgentLevel` | Service |  |
| 7 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 8 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 9 | `servicePlanRuleId` | 服务计划规则id | `pes.serviceplanrule.ServicePlanRuleVO` | None |  |
| 10 | `customId` | 客户 | `aa.merchant.Merchant` | Service |  |
| 11 | `orgId` | 组织id | `org.func.BaseOrg` | Service |  |
| 12 | `positionId` | 地区id | `bd.region.BaseRegionVO` | Service |  |
| 13 | `ServiceProjectStandardVOList` | 服务项目标准 | `pes.serviceplan.ServiceProjectStandardVO` | None | true |
| 14 | `serviceTypeId` | 服务类型id | `pes.tos.Tos` | None |  |
| 15 | `servicePlanTemplateId` | 服务计划模板id | `pes.serviceplantemplate.ServicePlanTemplateVO` | None |  |
| 16 | `equipmentUsedStatus` | 设备状态 | `ampub.equipbase.StatusVO` | Service |  |
| 17 | `ExecutionLogVOList` | 执行日志 | `pes.serviceplan.ExecutionLogVO` | None | true |
