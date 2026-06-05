---
tags: ["BIP", "元数据", "数据字典", "QIC", "QMSDFM.instrumentequipclass.InstrumentEquipClass"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 仪器设备分类 (`QMSDFM.instrumentequipclass.InstrumentEquipClass`)

> QIC | 物理表：`qms_dfm_instrument_equip_class`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 仪器设备分类 |
| 物理表 | `qms_dfm_instrument_equip_class` |
| 数据库 schema | `QMS-DFM` |
| 所属应用 | `QIC` |
| 构建时间 | `2026-06-05 16:47:11.8230` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `code` | String | 编码 |

---

## 直接属性（22个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | ID | `id` | Long |
| 3 | `orgId` | 质检组织 | `org_id` | 9d2a4a8b-1b44-4c00-b39d-4fbcf8fa958a |
| 4 | `code` | 编码 | `code` | String |
| 5 | `name` | 名称 | `name` | String |
| 6 | `note` | 备注 | `note` | String |
| 7 | `parent` | 上级分类 | `parent_id` | b43cc8a0-c0f5-47d0-8b9f-018641fa5355 |
| 8 | `dr` | 逻辑删除标记 | `dr` | Short |
| 9 | `level` | 层级 | `level` | Integer |
| 10 | `path` | 路径 | `path` | String |
| 11 | `sort` | 排序号 | `sort_num` | Integer |
| 12 | `isEnd` | 是否末级 | `isEnd` | Boolean |
| 13 | `createTime` | 创建时间 | `create_time` | DateTime |
| 14 | `createDate` | 创建日期 | `create_date` | Date |
| 15 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 16 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 17 | `creator` | 创建人名称 | `creator` | String |
| 18 | `modifier` | 修改人名称 | `modifier` | String |
| 19 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 20 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 21 | `pubts` | 时间戳 | `pubts` | DateTime |
| 22 | `definect_h` | 自定义项特征组 | `definect_h` | a2a98f1a-c34c-48a5-a441-efb04dde7bca |

---

## 关联属性（6个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `parent` | 上级分类 | `QMSDFM.instrumentequipclass.InstrumentEquipClass` | None |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 4 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 5 | `definect_h` | 自定义项特征组 | `QMSDFM.instrumentequipclass.InstrumentEquipClassDefineCharacter` | None |  |
| 6 | `orgId` | 质检组织 | `org.func.QualityOrg` | Service |  |
