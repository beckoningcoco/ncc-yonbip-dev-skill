---
tags: ["BIP", "元数据", "数据字典", "QMSQIT", "QMSQIT.originalrecord.OriginalRecordEquipment"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 原始记录检验仪器设备 (`QMSQIT.originalrecord.OriginalRecordEquipment`)

> QMSQIT | 物理表：`qms_qit_originalrecord_equipment`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 原始记录检验仪器设备 |
| 物理表 | `qms_qit_originalrecord_equipment` |
| domain/服务域 | `QMS-QIT` |
| schema | `qms_qit_rejectbill` |
| 所属应用 | `QMSQIT` |
| 构建时间 | `2026-06-05 16:43:18.4860` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 主键 |

---

## 直接属性（9个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | 主键 | `id` | Long |
| 3 | `originalRecordId` | 原始记录id | `originalrecord_id` | d380185e-d5f5-439c-8c3e-e88eb07140fd |
| 4 | `equipmentClassId` | 仪器设备分类id | `equipment_class_id` | b43cc8a0-c0f5-47d0-8b9f-018641fa5355 |
| 5 | `equipmentId` | 仪器设备id | `equipment_id` | 3125a9f7-0630-4531-b129-e10d05feb67f |
| 6 | `definect_equip` | 仪器设备自定义项特征 | `definect_equip` | 8b4cc162-7d16-432a-924a-0b88974b1f73 |
| 7 | `lineNo` | 行号 | `line_no` | Integer |
| 8 | `dr` | 逻辑删除标记 | `dr` | Short |
| 9 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（5个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `definect_equip` | 仪器设备自定义项特征 | `QMSQIT.originalrecord.OriginalRecordEquipDefineCharacter` | None |  |
| 2 | `originalRecordId` | 原始记录id | `QMSQIT.originalrecord.OriginalRecordHead` | None | true |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `equipmentClassId` | 仪器设备分类id | `QMSDFM.instrumentequipclass.InstrumentEquipClass` | Service |  |
| 5 | `equipmentId` | 仪器设备id | `QMSDFM.inspectinstrumequip.InspectInstrumEquip` | Service |  |
