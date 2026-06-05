---
tags: ["BIP", "元数据", "数据字典", "IMP_PES", "pes.equipBom.EquipBOMInfo"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 设备BOM (`pes.equipBom.EquipBOMInfo`)

> IMP_PES | 物理表：`imp_pes_equip_bom`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 设备BOM |
| 物理表 | `imp_pes_equip_bom` |
| 数据库 schema | `imppes` |
| 所属应用 | `IMP_PES` |
| 构建时间 | `2026-06-05 17:18:05.8350` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `code` | String | BOM编码 |

---

## 直接属性（20个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `orgId` | 组织 | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 2 | `code` | BOM编码 | `code` | String |
| 3 | `name` | BOM名称 | `name` | String |
| 4 | `desc` | 描述 | `desc` | String |
| 5 | `partsModelId` | 配件树模型 | `parts_model_Id` | aebac340-12aa-4ebf-975f-919001321347 |
| 6 | `equipmentId` | 关联设备 | `equipment_id` | e9f23971-1c19-49e1-83d7-3a84ebcb187e |
| 7 | `associationStatus` | 关联状态 | `association_status` | Integer |
| 8 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 9 | `creator` | 创建人 | `creator` | String |
| 10 | `createTime` | 创建时间 | `create_time` | DateTime |
| 11 | `createDate` | 创建日期 | `create_date` | Date |
| 12 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 13 | `modifier` | 最后修改人 | `modifier` | String |
| 14 | `modifyTime` | 最后修改时间 | `modify_time` | DateTime |
| 15 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 16 | `id` | ID | `id` | Long |
| 17 | `tenant` | 租户ID | `tenant_id` | String |
| 18 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 19 | `pubts` | 时间戳 | `pubts` | DateTime |
| 20 | `equipBomTree` | 设备BOM树 | `` | 51162cb7-12e5-46a2-9557-a41f5b74d3a8 |

---

## 关联属性（7个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `equipBomTree` | 设备BOM树 | `pes.equipBom.EquipBomTree` | None | true |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 4 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 5 | `partsModelId` | 配件树模型 | `pes.partsTree.PartsTreeModel` | None |  |
| 6 | `equipmentId` | 关联设备 | `aim.equip.EquipHeadVO` | Service |  |
| 7 | `orgId` | 组织 | `org.func.BaseOrg` | Service |  |
