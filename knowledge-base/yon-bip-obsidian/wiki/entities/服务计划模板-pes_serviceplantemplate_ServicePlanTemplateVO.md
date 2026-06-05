---
tags: ["BIP", "元数据", "数据字典", "IMP_PES", "pes.serviceplantemplate.ServicePlanTemplateVO"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 服务计划模板 (`pes.serviceplantemplate.ServicePlanTemplateVO`)

> IMP_PES | 物理表：`imp_pes_sp_template`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 服务计划模板 |
| 物理表 | `imp_pes_sp_template` |
| 数据库 schema | `imppes` |
| 所属应用 | `IMP_PES` |
| 构建时间 | `2026-06-05 17:19:32.6470` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | id |
| 编码 | `code` | String | 编码 |

---

## 直接属性（24个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `code` | 编码 | `code` | String |
| 2 | `name` | 名称 | `name` | String |
| 3 | `equipmentCategoryId` | 设备分类id | `equipment_category_id` | 2cc09807-e5f0-4c71-a7ac-c4f932b8bdb7 |
| 4 | `serviceType` | 服务类型id | `service_type` | 792f6d8f-bf3b-4090-ac4d-a7f2e9230758 |
| 5 | `warrantyType` | 质保类型 | `warranty_type` | String |
| 6 | `enable` | 启用 | `enable` | sys_intboolean |
| 7 | `mark` | 备注 | `mark` | String |
| 8 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 9 | `creator` | 创建人 | `creator` | String |
| 10 | `createTime` | 创建时间 | `create_time` | DateTime |
| 11 | `createDate` | 创建日期 | `create_date` | Date |
| 12 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 13 | `modifier` | 修改人名称 | `modifier` | String |
| 14 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 15 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 16 | `id` | id | `id` | String |
| 17 | `enablets` | 启用时间 | `enablets` | DateTime |
| 18 | `disablets` | 停用时间 | `disablets` | DateTime |
| 19 | `dr` | DR | `dr` | Short |
| 20 | `tenant` | 租户ID | `tenant_id` | String |
| 21 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 22 | `pubts` | 时间戳 | `pubts` | DateTime |
| 23 | `ServiceMaterialList` | 物料子表 | `` | 645efbcd-a5b8-46a1-8f19-c9b53dfecb8d |
| 24 | `serviceItemList` | 服务项目 | `` | 15887c71-8b6b-457c-9d38-e4a0c7b5e12b |

---

## 关联属性（7个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `serviceType` | 服务类型id | `pes.tos.Tos` | None |  |
| 2 | `serviceItemList` | 服务项目 | `pes.serviceplantemplate.ServiceItemVO` | None | true |
| 3 | `equipmentCategoryId` | 设备分类id | `ampub.ambase.CategoryVO` | Service |  |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 5 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 6 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 7 | `ServiceMaterialList` | 物料子表 | `pes.serviceplantemplate.ServiceMaterialVO` | None | true |
