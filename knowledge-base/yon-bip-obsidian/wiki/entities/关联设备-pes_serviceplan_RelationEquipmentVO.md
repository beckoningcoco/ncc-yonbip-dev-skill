---
tags: ["BIP", "元数据", "数据字典", "IMP_PES", "pes.serviceplan.RelationEquipmentVO"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 关联设备 (`pes.serviceplan.RelationEquipmentVO`)

> IMP_PES | 物理表：`imp_pes_sp_eqp_relation`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 关联设备 |
| 物理表 | `imp_pes_sp_eqp_relation` |
| 数据库 schema | `imppes` |
| 所属应用 | `IMP_PES` |
| 构建时间 | `2026-06-05 17:19:23.7810` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | id |

---

## 直接属性（19个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `equipmentServiceId` | 设备服务信息ID | `equipment_service_id` | 4ba8e18b-e89c-47e4-9531-0886b549774d |
| 2 | `servicePlanId` | 服务计划ID | `service_plan_id` | da03b7d0-3bee-4528-bb4a-34b21f182a5f |
| 3 | `equipmentId` | 设备Id | `equipment_id` | e9f23971-1c19-49e1-83d7-3a84ebcb187e |
| 4 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 5 | `creator` | 创建人名称 | `creator` | String |
| 6 | `createTime` | 创建时间 | `create_time` | DateTime |
| 7 | `createDate` | 创建日期 | `create_date` | Date |
| 8 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 9 | `modifier` | 修改人名称 | `modifier` | String |
| 10 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 11 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 12 | `id` | id | `id` | String |
| 13 | `enable` | 启用 | `enable` | sys_intboolean |
| 14 | `enablets` | 启用时间 | `enablets` | DateTime |
| 15 | `disablets` | 停用时间 | `disablets` | DateTime |
| 16 | `dr` | DR | `dr` | Short |
| 17 | `tenant` | 租户ID | `tenant_id` | String |
| 18 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 19 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（6个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `equipmentServiceId` | 设备服务信息ID | `pes.equip.EquipServiceInfo` | None |  |
| 3 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 4 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 5 | `servicePlanId` | 服务计划ID | `pes.serviceplan.ServicePlanVO` | None | true |
| 6 | `equipmentId` | 设备Id | `aim.equip.EquipHeadVO` | Service |  |
