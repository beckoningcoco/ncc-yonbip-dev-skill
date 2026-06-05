---
tags: ["BIP", "元数据", "数据字典", "QIC", "QMSDFM.badItems.badItems"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 不良项目 (`QMSDFM.badItems.badItems`)

> QIC | 物理表：`qms_dfm_baditems`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 不良项目 |
| 物理表 | `qms_dfm_baditems` |
| 数据库 schema | `QMS-DFM` |
| 所属应用 | `QIC` |
| 构建时间 | `2026-06-05 09:22:39.1170` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | ID |
| 编码 | `code` | String | 代码 |

---

## 直接属性（21个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `tenant` | 租户ID | `tenant_id` | String |
| 3 | `id` | ID | `id` | String |
| 4 | `pk_org` | 质检中心 | `pk_org` | 9d2a4a8b-1b44-4c00-b39d-4fbcf8fa958a |
| 5 | `code` | 代码 | `code` | String |
| 6 | `name` | 名称 | `name` | String |
| 7 | `vnote` | 备注 | `vnote` | String |
| 8 | `externalSourceId` | 外部来源ID | `externalSourceId` | String |
| 9 | `externalSourceType` | 外部来源类型 | `externalSourceType` | String |
| 10 | `createDate` | 创建日期 | `create_date` | Date |
| 11 | `createTime` | 创建时间 | `create_time` | DateTime |
| 12 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 13 | `creator` | 创建人 | `creator` | String |
| 14 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 15 | `modifier` | 修改人 | `modifier` | String |
| 16 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 17 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 18 | `pubts` | 时间戳 | `pubts` | DateTime |
| 19 | `dr` | 逻辑删除标记 | `dr` | Short |
| 20 | `defineCTH` | 自定义项特征 | `definect_h` | 8279c7cd-ee1c-4962-a3bd-641c3b6545b8 |
| 21 | `badItemDef` | 不良项目自定义项 | `` | 80e66ff6-873d-4d65-b000-01cafc593750 |

---

## 关联属性（6个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `badItemDef` | 不良项目自定义项 | `QMSDFM.badItems.badItemDef` | None | true |
| 3 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 4 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 5 | `defineCTH` | 自定义项特征 | `QMSDFM.badItems.BadItemsDefineCharacter` | None |  |
| 6 | `pk_org` | 质检中心 | `org.func.QualityOrg` | Service |  |
