---
tags: ["BIP", "元数据", "数据字典", "IMP_PES", "pes.qrCode.PesServiceQrCode"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 服务二维码 (`pes.qrCode.PesServiceQrCode`)

> IMP_PES | 物理表：`pes_service_qr_code`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 服务二维码 |
| 物理表 | `pes_service_qr_code` |
| domain/服务域 | `imppes` |
| 所属应用 | `IMP_PES` |
| 构建时间 | `2026-06-05 17:18:16.0960` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |
| 编码 | `code` | String | 编码 |

---

## 直接属性（21个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `qrcode` | 二维码 | `qrcode` | String |
| 2 | `orgId` | 组织Id | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 3 | `code` | 编码 | `code` | String |
| 4 | `name` | 名称 | `name` | String |
| 5 | `equipmentServiceId` | 设备Id | `equipment_service_id` | 4ba8e18b-e89c-47e4-9531-0886b549774d |
| 6 | `posId` | 服务点Id | `pos_id` | c685b8cd-eb64-47a1-b5a2-fcf3296b3c7d |
| 7 | `personId` | 负责人id | `person_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 8 | `enable` | 启用状态 | `enable` | sys_intboolean |
| 9 | `memo` | 描述 | `memo` | String |
| 10 | `createUser` | 创建者 | `create_user` | String |
| 11 | `createTimeStr` | createTimeStr | `create_time` | String |
| 12 | `lastModifyUser` | 最近修改者 | `last_modify_user` | String |
| 13 | `lastModified` | 最近修改时间 | `last_modified` | String |
| 14 | `id` | id | `id` | Long |
| 15 | `enablets` | 启用时间 | `enablets` | DateTime |
| 16 | `disablets` | 停用时间 | `disablets` | DateTime |
| 17 | `dr` | 逻辑删除 | `dr` | Integer |
| 18 | `tenant` | 租户ID | `tenant_id` | String |
| 19 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 20 | `pubts` | 时间戳 | `pubts` | DateTime |
| 21 | `ts` | 版本号 | `ts` | String |

---

## 关联属性（5个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `posId` | 服务点Id | `pes.pos.Pos` | None |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `equipmentServiceId` | 设备Id | `pes.equip.EquipServiceInfo` | None |  |
| 4 | `personId` | 负责人id | `bd.staff.Staff` | Service |  |
| 5 | `orgId` | 组织Id | `org.func.BaseOrg` | Service |  |
