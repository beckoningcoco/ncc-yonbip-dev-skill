---
tags: ["BIP", "元数据", "数据字典", "IMP_PES", "pes.equip.EquipServiceInfoRecord"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 设备服务记录 (`pes.equip.EquipServiceInfoRecord`)

> IMP_PES | 物理表：`sms_sis_record`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 设备服务记录 |
| 物理表 | `sms_sis_record` |
| domain/服务域 | `imppes` |
| 所属应用 | `IMP_PES` |
| 构建时间 | `2026-06-05 17:18:38.2840` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（7个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `soId` | 工单Id | `so_id` | 18332b41-ebd3-4301-90af-714dfea07d9f |
| 2 | `siId` | 设备服务信息ID | `si_id` | 4ba8e18b-e89c-47e4-9531-0886b549774d |
| 3 | `equipmentId` | 设备ID | `equipment_id` | e9f23971-1c19-49e1-83d7-3a84ebcb187e |
| 4 | `id` | ID | `id` | Long |
| 5 | `tenant` | 租户ID | `tenant_id` | String |
| 6 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 7 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `soId` | 工单Id | `pes.sos.SmsSos` | None |  |
| 2 | `siId` | 设备服务信息ID | `pes.equip.EquipServiceInfo` | None | true |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `equipmentId` | 设备ID | `aim.equip.EquipHeadVO` | Service |  |
