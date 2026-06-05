---
tags: ["BIP", "元数据", "数据字典", "QIC", "QMSDFM.checkProject.BadItemBody"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 不良项目 (`QMSDFM.checkProject.BadItemBody`)

> QIC | 物理表：`qms_dfm_checkprobaditem`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 不良项目 |
| 物理表 | `qms_dfm_checkprobaditem` |
| 数据库 schema | `QMS-DFM` |
| 所属应用 | `QIC` |
| 构建时间 | `2026-06-05 16:46:26.2640` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | ID |

---

## 直接属性（21个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `tenant` | 租户ID | `tenant_id` | String |
| 3 | `id` | ID | `id` | String |
| 4 | `detailId` | 检验项目主表id | `detail_id` | 3ef85f41-6ab5-4748-9805-2c9ccf03e399 |
| 5 | `code` | 代码 | `code` | String |
| 6 | `name` | 名称id | `name` | 3de0c23e-ee02-46b4-bae7-0a982de498ce |
| 7 | `createDate` | 创建日期 | `create_date` | Date |
| 8 | `createTime` | 创建时间 | `create_time` | DateTime |
| 9 | `externalSourceId` | 外部来源ID | `externalSourceId` | String |
| 10 | `externalSourceType` | 外部来源类型 | `externalSourceType` | String |
| 11 | `isDefault` | 是否默认 | `is_default` | String |
| 12 | `defineCharacteristics` | 自定义项特征组 | `define_cts` | 027a23ac-48f5-4cb9-b1c4-4f86a892c9e6 |
| 13 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 14 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 15 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 16 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 17 | `rowNum` | 行号 | `row_num` | Integer |
| 18 | `dr` | 逻辑删除标记 | `dr` | Short |
| 19 | `pubts` | 时间戳 | `pubts` | DateTime |
| 20 | `modifier` | 修改人 | `modifier` | String |
| 21 | `creator` | 创建人 | `creator` | String |

---

## 关联属性（6个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `defineCharacteristics` | 自定义项特征组 | `QMSDFM.checkProject.badItemBody_defineCharacter` | None |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `name` | 名称id | `QMSDFM.badItems.badItems` | None |  |
| 4 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 5 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 6 | `detailId` | 检验项目主表id | `QMSDFM.checkProject.checkProjectDetail` | None | true |
