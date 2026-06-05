---
tags: ["BIP", "元数据", "数据字典", "QMSQIT", "QMSQIT.CheckPlan.CheckDevice"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 检验仪器设备 (`QMSQIT.CheckPlan.CheckDevice`)

> QMSQIT | 物理表：`qms_qit_checkplan_m_device`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 检验仪器设备 |
| 物理表 | `qms_qit_checkplan_m_device` |
| 数据库 schema | `QMS-QIT` |
| 所属应用 | `QMSQIT` |
| 构建时间 | `2026-06-05 16:44:56.0870` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（16个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | ID | `id` | Long |
| 3 | `bodyID` | 表体ID | `body_id` | ad4dfcac-8d02-4f5f-9f0c-cdbd98788ee8 |
| 4 | `lineNo` | 行号 | `line_no` | Decimal |
| 5 | `deviceId` | 仪器设备id | `device_id` | 3125a9f7-0630-4531-b129-e10d05feb67f |
| 6 | `defineCharacter` | 自定义项特征组 | `define_character` | 5fcc87e2-a118-4474-bdac-3a9c548443bc |
| 7 | `dr` | 逻辑删除标记 | `dr` | Short |
| 8 | `createTime` | 创建时间 | `create_time` | DateTime |
| 9 | `createDate` | 创建日期 | `create_date` | Date |
| 10 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 11 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 12 | `creator` | 创建人名称 | `creator` | String |
| 13 | `modifier` | 修改人名称 | `modifier` | String |
| 14 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 15 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 16 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（6个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 3 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 4 | `bodyID` | 表体ID | `QMSQIT.CheckPlan.CheckPlanBody` | None | true |
| 5 | `defineCharacter` | 自定义项特征组 | `QMSQIT.CheckPlan.CheckDeviceDefineCharacter` | None |  |
| 6 | `deviceId` | 仪器设备id | `QMSDFM.inspectinstrumequip.InspectInstrumEquip` | Service |  |
