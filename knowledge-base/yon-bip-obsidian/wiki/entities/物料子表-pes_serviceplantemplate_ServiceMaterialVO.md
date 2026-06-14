---
tags: ["BIP", "元数据", "数据字典", "IMP_PES", "pes.serviceplantemplate.ServiceMaterialVO"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 物料子表 (`pes.serviceplantemplate.ServiceMaterialVO`)

> IMP_PES | 物理表：`imp_pes_sp_tpl_material`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 物料子表 |
| 物理表 | `imp_pes_sp_tpl_material` |
| domain/服务域 | `imppes` |
| 所属应用 | `IMP_PES` |
| 构建时间 | `2026-06-05 17:19:31.2190` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | id |

---

## 直接属性（18个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `materialId` | 物料id | `material_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 2 | `num` | 数量 | `num` | Decimal |
| 3 | `isAutoConsumption` | 是否自动消耗 | `is_auto_consumption` | Short |
| 4 | `mark` | 备注 | `mark` | String |
| 5 | `servicePlanTemplateId` | 服务计划模板id | `service_plan_template_id` | 1c684a58-6c2a-4ead-af06-b0e3bd45dd9f |
| 6 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 7 | `creator` | 创建人名称 | `creator` | String |
| 8 | `createTime` | 创建时间 | `create_time` | DateTime |
| 9 | `createDate` | 创建日期 | `create_date` | Date |
| 10 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 11 | `modifier` | 修改人名称 | `modifier` | String |
| 12 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 13 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 14 | `id` | id | `id` | String |
| 15 | `dr` | DR | `dr` | Short |
| 16 | `tenant` | 租户ID | `tenant_id` | String |
| 17 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 18 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（5个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 3 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 4 | `servicePlanTemplateId` | 服务计划模板id | `pes.serviceplantemplate.ServicePlanTemplateVO` | None | true |
| 5 | `materialId` | 物料id | `pc.product.Product` | Service |  |
