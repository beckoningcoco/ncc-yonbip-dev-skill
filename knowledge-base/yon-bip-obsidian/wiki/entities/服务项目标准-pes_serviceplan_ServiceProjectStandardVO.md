---
tags: ["BIP", "元数据", "数据字典", "IMP_PES", "pes.serviceplan.ServiceProjectStandardVO"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 服务项目标准 (`pes.serviceplan.ServiceProjectStandardVO`)

> IMP_PES | 物理表：`imp_pes_sp_project_standard`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 服务项目标准 |
| 物理表 | `imp_pes_sp_project_standard` |
| domain/服务域 | `imppes` |
| 所属应用 | `IMP_PES` |
| 构建时间 | `2026-06-05 17:20:04.2690` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | id |

---

## 直接属性（20个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `lineNo` | 序号 | `line_no` | Integer |
| 2 | `serviceProjectId` | 服务项目id | `service_project_id` | 80e2a9ee-50bc-440b-97c0-694cf5697ccc |
| 3 | `serviceProjectStandardId` | 服务项目标准id | `service_project_standard_id` | eb39b0ca-1f77-4946-83eb-9424e55b95ce |
| 4 | `servicePlanId` | 服务计划ID | `service_plan_id` | da03b7d0-3bee-4528-bb4a-34b21f182a5f |
| 5 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 6 | `creator` | 创建人名称 | `creator` | String |
| 7 | `createTime` | 创建时间 | `create_time` | DateTime |
| 8 | `createDate` | 创建日期 | `create_date` | Date |
| 9 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 10 | `modifier` | 修改人名称 | `modifier` | String |
| 11 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 12 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 13 | `id` | id | `id` | String |
| 14 | `enable` | 启用 | `enable` | sys_intboolean |
| 15 | `enablets` | 启用时间 | `enablets` | DateTime |
| 16 | `disablets` | 停用时间 | `disablets` | DateTime |
| 17 | `dr` | DR | `dr` | Short |
| 18 | `tenant` | 租户ID | `tenant_id` | String |
| 19 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 20 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（6个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 3 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 4 | `servicePlanId` | 服务计划ID | `pes.serviceplan.ServicePlanVO` | None | true |
| 5 | `serviceProjectId` | 服务项目id | `pes.serviceProject.ServiceProject` | None |  |
| 6 | `serviceProjectStandardId` | 服务项目标准id | `PES.standardAllot.StandardAllot` | None |  |
