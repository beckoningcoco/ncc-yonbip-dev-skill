---
tags: ["BIP", "元数据", "数据字典", "MR", "mr.rpadata.RPATimeFence"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 计划策略临时表 (`mr.rpadata.RPATimeFence`)

> MR | 物理表：`mr_rpa_time_fence`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 计划策略临时表 |
| 物理表 | `mr_rpa_time_fence` |
| 数据库 schema | `yonbip-mm-plan` |
| 所属应用 | `MR` |
| 构建时间 | `2026-06-05 15:11:20.9130` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（33个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `allotCategory` | 计划分类 | `allot_category` | 5f9b1ee7-d6e8-4ba0-b5d7-6728fa089ae3 |
| 2 | `allotItem` | 物料 | `allot_item` | Long |
| 3 | `allotOrg` | 组织 | `allot_org` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 4 | `allotType` | 分配类型 | `allot_type` | TacticAllotTypeEnum |
| 5 | `checkboxFirst` | 复选框 | `checkbox_first` | Boolean |
| 6 | `checkboxSecond` | 复选框 | `checkbox_second` | Boolean |
| 7 | `checkboxThird` | 复选框 | `checkbox_third` | Boolean |
| 8 | `createDate` | 创建日期 | `create_date` | Date |
| 9 | `createTime` | 创建时间 | `create_time` | DateTime |
| 10 | `creator` | 创建人名称 | `creator` | String |
| 11 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 12 | `deductMethod` | 冲销方式 | `deduc_method` | DeductMethodEnum |
| 13 | `demandTypes` | 独立需求来源类型 | `demand_types` | String |
| 14 | `dr` | 逻辑删除标识 | `dr` | Integer |
| 15 | `id` | ID | `id` | Long |
| 16 | `modifier` | 修改人名称 | `modifier` | String |
| 17 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 18 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 19 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 20 | `orgId` | 计划组织 | `org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 21 | `planParamId` | 计划名称 | `plan_param_id` | 0d105898-52f1-4a97-971d-b334f721c74b |
| 22 | `planParamVersion` | 计划版本 | `plan_param_version` | Integer |
| 23 | `pubts` | 时间戳 | `pubts` | DateTime |
| 24 | `recordId` | 运算快照id | `record_id` | fd0f9ce5-d5c7-43cb-812b-41733565df18 |
| 25 | `requirementSourceFirst` | 需求来源 | `requirement_source_first` | RequirementSourceEnum |
| 26 | `requirementSourceSecond` | 需求来源 | `requirement_source_second` | RequirementSourceEnum |
| 27 | `requirementSourceThird` | 需求来源 | `requirement_source_third` | RequirementSourceEnum |
| 28 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 29 | `timeFenceId` | 计划策略ID | `time_fence_id` | Long |
| 30 | `timeQuantumFirst` | 时界段 | `time_quant_first` | Integer |
| 31 | `timeQuantumSecond` | 时界段 | `time_quant_second` | Integer |
| 32 | `timeQuantumThird` | 时界段 | `time_quant_third` | Integer |
| 33 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（9个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `recordId` | 运算快照id | `mr.rpadata.Record` | None | true |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 4 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 5 | `planParamId` | 计划名称 | `mr.planworkbench.PlanParam` | None |  |
| 6 | `allotCategory` | 计划分类 | `pc.cls.PlanClass` | Service |  |
| 7 | `allotOrg` | 组织 | `aa.baseorg.OrgMV` | Service |  |
| 8 | `orgId` | 计划组织 | `aa.baseorg.OrgMV` | Service |  |
| 9 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
