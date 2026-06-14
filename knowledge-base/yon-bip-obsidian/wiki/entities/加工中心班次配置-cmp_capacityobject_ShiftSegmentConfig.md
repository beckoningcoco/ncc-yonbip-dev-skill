---
tags: ["BIP", "元数据", "数据字典", "DCRP", "cmp.capacityobject.ShiftSegmentConfig"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 加工中心班次配置 (`cmp.capacityobject.ShiftSegmentConfig`)

> DCRP | 物理表：`cmp_shift_segment_config`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 加工中心班次配置 |
| 物理表 | `cmp_shift_segment_config` |
| domain/服务域 | `yonbip-mm-plan` |
| schema | `requirements_planning` |
| 所属应用 | `DCRP` |
| 构建时间 | `2026-06-05 14:00:04.1140` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（8个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | ID | `id` | Long |
| 3 | `shiftId` | 班次 | `shift_id` | 6b8e0e86-1416-4b56-b3c3-02dac58aa640 |
| 4 | `capacityObject` | 加工中心 | `capacity_object` | e3034100-f166-46e1-b750-d85fb84474b7 |
| 5 | `seq` | 顺序号 | `seq` | Integer |
| 6 | `effectiveDate` | 生效日期 | `effective_date` | DateTime |
| 7 | `expiryDate` | 失效日期 | `expiry_date` | DateTime |
| 8 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（3个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `shiftId` | 班次 | `cmp.shift.Shift` | None |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `capacityObject` | 加工中心 | `cmp.capacityobject.CapacityObject` | None | true |
