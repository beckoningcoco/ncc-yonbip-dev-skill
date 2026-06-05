---
tags: ["BIP", "元数据", "数据字典", "IMP_PES", "pes.serviceplan.MaterialQuotaVO"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 物料定额 (`pes.serviceplan.MaterialQuotaVO`)

> IMP_PES | 物理表：`imp_pes_sp_material_quota`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 物料定额 |
| 物理表 | `imp_pes_sp_material_quota` |
| 数据库 schema | `imppes` |
| 所属应用 | `IMP_PES` |
| 构建时间 | `2026-06-05 17:19:22.4250` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | id |

---

## 直接属性（24个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `materialId` | 物料Id | `material_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 2 | `quantity` | 数量 | `quantity` | Decimal |
| 3 | `unit` | 单位id | `unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 4 | `autoConsume` | 自动消耗 | `auto_consume` | Short |
| 5 | `memo` | 备注 | `memo` | String |
| 6 | `servicePlanId` | 服务计划ID | `service_plan_id` | da03b7d0-3bee-4528-bb4a-34b21f182a5f |
| 7 | `materialCode` | 物料编码 | `material_code` | String |
| 8 | `materialName` | 物料名称 | `material_name` | String |
| 9 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 10 | `creator` | 创建人名称 | `creator` | String |
| 11 | `createTime` | 创建时间 | `create_time` | DateTime |
| 12 | `createDate` | 创建日期 | `create_date` | Date |
| 13 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 14 | `modifier` | 修改人名称 | `modifier` | String |
| 15 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 16 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 17 | `id` | id | `id` | String |
| 18 | `enable` | 启用 | `enable` | sys_intboolean |
| 19 | `enablets` | 启用时间 | `enablets` | DateTime |
| 20 | `disablets` | 停用时间 | `disablets` | DateTime |
| 21 | `dr` | DR | `dr` | Short |
| 22 | `tenant` | 租户ID | `tenant_id` | String |
| 23 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 24 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（6个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `unit` | 单位id | `pc.unit.Unit` | Service |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 4 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 5 | `servicePlanId` | 服务计划ID | `pes.serviceplan.ServicePlanVO` | None | true |
| 6 | `materialId` | 物料Id | `pc.product.Product` | Service |  |
