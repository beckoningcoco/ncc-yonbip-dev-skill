---
tags: ["BIP", "元数据", "数据字典", "QIC", "QMSDFM.sampleMethod.sampleMethod"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 取样方式(停用) (`QMSDFM.sampleMethod.sampleMethod`)

> QIC | 物理表：`qms_dfm_samplemethod`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 取样方式(停用) |
| 物理表 | `qms_dfm_samplemethod` |
| 数据库 schema | `QMS-DFM` |
| 所属应用 | `QIC` |
| 构建时间 | `2026-06-05 16:44:47.0840` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | ID |
| 编码 | `code` | String | 编码 |

---

## 直接属性（18个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `pk_org` | 质检组织id | `pk_org` | 9d2a4a8b-1b44-4c00-b39d-4fbcf8fa958a |
| 2 | `code` | 编码 | `code` | String |
| 3 | `name` | 名称 | `name` | String |
| 4 | `creator` | 创建人id | `creator` | String |
| 5 | `creatorId` | 创建人id | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 6 | `modifier` | 修改人id | `modifier` | String |
| 7 | `createTime` | 创建时间 | `create_time` | DateTime |
| 8 | `modifierId` | 修改人id | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 9 | `tenant` | 租户ID | `tenant_id` | String |
| 10 | `id` | ID | `id` | String |
| 11 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 12 | `pubts` | 时间戳 | `pubts` | DateTime |
| 13 | `dr` | 逻辑删除标记 | `dr` | Short |
| 14 | `applyRangeList` | 取样方式适用范围 | `` | 3ccc9df3-bdd8-4ea1-9982-b3d20edb2ab2 |
| 15 | `createDate` | 创建日期 | `create_date` | Date |
| 16 | `detailId` | 取样方式主表id | `detail_id` | 5653b278-1a57-42ea-81ab-e579e060556a |
| 17 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 18 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（6个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `applyRangeList` | 取样方式适用范围 | `QMSDFM.sampleMethod.sampleMethodApplyRange` | None | true |
| 3 | `creatorId` | 创建人id | `base.user.User` | Service |  |
| 4 | `modifierId` | 修改人id | `base.user.User` | Service |  |
| 5 | `detailId` | 取样方式主表id | `QMSDFM.sampleMethod.sampleMethodDetail` | None | true |
| 6 | `pk_org` | 质检组织id | `org.func.QualityOrg` | Service |  |
