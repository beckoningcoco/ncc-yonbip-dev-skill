---
tags: ["BIP", "元数据", "数据字典", "IMPSFC", "sfc.pieceworkcollect.PieceworkCollect"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 计件数据采集 (`sfc.pieceworkcollect.PieceworkCollect`)

> IMPSFC | 物理表：`imp_sfc_piecework_collection`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 计件数据采集 |
| 物理表 | `imp_sfc_piecework_collection` |
| domain/服务域 | `IMP-SFC` |
| schema | `production_order` |
| 所属应用 | `IMPSFC` |
| 构建时间 | `2026-06-05 09:20:49.3890` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（23个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `collectTime` | 采集时间 | `collect_time` | DateTime |
| 2 | `creator` | 创建人名称 | `creator` | String |
| 3 | `attrCode` | 属性标识码 | `attr_code` | String |
| 4 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 5 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 6 | `modifier` | 修改人名称 | `modifier` | String |
| 7 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 8 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 9 | `createType` | 创建方式 | `create_type` | Short |
| 10 | `deviceCode` | 设备编码 | `device_code` | String |
| 11 | `deviceId` | 设备 | `device_id` | e9f23971-1c19-49e1-83d7-3a84ebcb187e |
| 12 | `orgId` | 工厂 | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 13 | `unit` | 计量单位 | `unit` | String |
| 14 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 15 | `createTime` | 创建时间 | `create_time` | DateTime |
| 16 | `collectQty` | 采集数量 | `collect_qty` | Decimal |
| 17 | `reportedQty` | 已报工数量 | `reported_qty` | Decimal |
| 18 | `startTime` | 采集开始时间 | `start_time` | DateTime |
| 19 | `endTime` | 采集结束时间 | `end_time` | DateTime |
| 20 | `id` | ID | `id` | Long |
| 21 | `pubts` | 时间戳 | `pubts` | DateTime |
| 22 | `attrName` | 属性名称 | `attr_name` | String |
| 23 | `createDate` | 创建日期 | `create_date` | Date |

---

## 关联属性（5个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 3 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 4 | `deviceId` | 设备 | `aim.equip.EquipHeadVO` | Service |  |
| 5 | `orgId` | 工厂 | `org.func.BaseOrg` | Service |  |
