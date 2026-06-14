---
tags: ["BIP", "元数据", "数据字典", "IMP_PES", "pes.serviceplantemplate.ServiceItemVO"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 服务项目 (`pes.serviceplantemplate.ServiceItemVO`)

> IMP_PES | 物理表：`imp_pes_sp_tpl_item`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 服务项目 |
| 物理表 | `imp_pes_sp_tpl_item` |
| domain/服务域 | `imppes` |
| 所属应用 | `IMP_PES` |
| 构建时间 | `2026-06-05 17:19:29.8190` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | id |

---

## 直接属性（17个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `lineNo` | 行号 | `line_no` | Integer |
| 2 | `serviceItemId` | 服务项目id | `service_item_id` | 80e2a9ee-50bc-440b-97c0-694cf5697ccc |
| 3 | `serviceStandId` | 服务项目标准id | `service_stand_id` | eb39b0ca-1f77-4946-83eb-9424e55b95ce |
| 4 | `servicePlanTemplateId` | 服务计划模板id | `service_plan_template_id` | 1c684a58-6c2a-4ead-af06-b0e3bd45dd9f |
| 5 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 6 | `creator` | 创建人名称 | `creator` | String |
| 7 | `createTime` | 创建时间 | `create_time` | DateTime |
| 8 | `createDate` | 创建日期 | `create_date` | Date |
| 9 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 10 | `modifier` | 修改人名称 | `modifier` | String |
| 11 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 12 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 13 | `id` | id | `id` | String |
| 14 | `dr` | DR | `dr` | Short |
| 15 | `tenant` | 租户ID | `tenant_id` | String |
| 16 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 17 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（6个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `serviceItemId` | 服务项目id | `pes.serviceProject.ServiceProject` | None |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 4 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 5 | `servicePlanTemplateId` | 服务计划模板id | `pes.serviceplantemplate.ServicePlanTemplateVO` | None | true |
| 6 | `serviceStandId` | 服务项目标准id | `PES.standardAllot.StandardAllot` | None |  |
