---
tags: ["BIP", "元数据", "数据字典", "IMP_PES", "pes.equipBom.EquipPartsSerialNumber"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 设备配件序列号 (`pes.equipBom.EquipPartsSerialNumber`)

> IMP_PES | 物理表：`imp_pes_bom_part_serial_number`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 设备配件序列号 |
| 物理表 | `imp_pes_bom_part_serial_number` |
| domain/服务域 | `imppes` |
| 所属应用 | `IMP_PES` |
| 构建时间 | `2026-06-05 17:20:24.1000` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（6个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `serialNum` | 序列号 | `serial_num` | String |
| 2 | `partId` | 设备配件 | `part_id` | 1131107b-ee70-4da4-ac1e-cba5834d2eb5 |
| 3 | `id` | ID | `id` | Long |
| 4 | `tenant` | 租户ID | `tenant_id` | String |
| 5 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 6 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（2个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `partId` | 设备配件 | `pes.equipBom.EquipPartsInfo` | None | true |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
