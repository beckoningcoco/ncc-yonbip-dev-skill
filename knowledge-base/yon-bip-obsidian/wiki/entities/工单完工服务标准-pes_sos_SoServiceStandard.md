---
tags: ["BIP", "元数据", "数据字典", "IMP_PES", "pes.sos.SoServiceStandard"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 工单完工服务标准 (`pes.sos.SoServiceStandard`)

> IMP_PES | 物理表：`sms_so_complete_standard`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 工单完工服务标准 |
| 物理表 | `sms_so_complete_standard` |
| 数据库 schema | `imppes` |
| 所属应用 | `IMP_PES` |
| 构建时间 | `2026-06-05 17:20:21.6230` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | ID |

---

## 直接属性（18个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `factValue` | 实际值 | `fact_value` | String |
| 2 | `id` | ID | `id` | String |
| 3 | `isSatisfied` | 满足标识 | `is_satisfied` | Integer |
| 4 | `orgId` | 组织 | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 5 | `soCompleteId` | 工单完工Id | `so_complete_id` | fec504f5-e447-48a7-80bd-0d4b4f5a972d |
| 6 | `soEquipmentId` | 工单设备子表ID | `so_equipment_id` | 25487918-5ce6-4ec1-ac75-96ac434f137f |
| 7 | `soId` | 工单Id | `so_id` | 18332b41-ebd3-4301-90af-714dfea07d9f |
| 8 | `standardServiceId` | 服务标准Id | `standard_service_id` | 98445ec1-4f62-4ff1-8586-5f434484ce2e |
| 9 | `UserDefineCharacter` | 自定义项特征 | `user_define_character` | 445db41d-8b23-4a55-968c-86d316a66806 |
| 10 | `createTimeStr` | 创建时间 | `create_time` | String |
| 11 | `tenant` | 租户ID | `tenant_id` | String |
| 12 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 13 | `dr` | 逻辑删除 | `dr` | Integer |
| 14 | `lastModified` | 最近修改时间 | `last_modified` | String |
| 15 | `lastModifyUser` | 最近修改者 | `last_modify_user` | String |
| 16 | `createUser` | 创建者 | `create_user` | String |
| 17 | `ts` | 版本号 | `ts` | String |
| 18 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（7个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `soId` | 工单Id | `pes.sos.SmsSos` | None | true |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `soCompleteId` | 工单完工Id | `pes.sos.SoComplete` | None |  |
| 4 | `UserDefineCharacter` | 自定义项特征 | `pes.sos.SmsSoCompleteStandardDefineCharacter` | None |  |
| 5 | `soEquipmentId` | 工单设备子表ID | `pes.sos.SmsSosEquipment` | None |  |
| 6 | `orgId` | 组织 | `org.func.BaseOrg` | Service |  |
| 7 | `standardServiceId` | 服务标准Id | `pes.serviceProject.ServiceStandard` | None |  |
