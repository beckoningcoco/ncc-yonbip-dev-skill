---
tags: ["BIP", "元数据", "数据字典", "QIC", "QMSDFM.checkProject.checkProject"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 检验项目 (`QMSDFM.checkProject.checkProject`)

> QIC | 物理表：`qms_dfm_checkproject`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 检验项目 |
| 物理表 | `qms_dfm_checkproject` |
| domain/服务域 | `QMS-DFM` |
| schema | `qms_dfm` |
| 所属应用 | `QIC` |
| 构建时间 | `2026-06-05 16:44:12.6680` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | id |
| 编码 | `code` | String | 检验项目编码 |

---

## 直接属性（19个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `tenant` | 租户ID | `tenant_id` | String |
| 3 | `id` | id | `id` | String |
| 4 | `qualityinSpectionCenter` | 管理组织 | `qualityinSpectionCenter` | 9d2a4a8b-1b44-4c00-b39d-4fbcf8fa958a |
| 5 | `code` | 检验项目编码 | `code` | String |
| 6 | `name` | 名称 | `name` | String |
| 7 | `detailId` | 检验项目详情 | `detail_id` | 3ef85f41-6ab5-4748-9805-2c9ccf03e399 |
| 8 | `modifier` | 修改人id | `modifier` | String |
| 9 | `modifierId` | 修改人id | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 10 | `createDate` | 创建日期 | `create_date` | Date |
| 11 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 12 | `dr` | 逻辑删除标记 | `dr` | Short |
| 13 | `createTime` | 创建时间 | `create_time` | DateTime |
| 14 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 15 | `creatorId` | 创建人id | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 16 | `pubts` | 时间戳 | `pubts` | DateTime |
| 17 | `creator` | 创建人id | `creator` | String |
| 18 | `checkProjectclassId` | 检验项目分类id | `checkProjectclassId` | c3b4c20b-a758-485f-8565-7cec8f466bf4 |
| 19 | `applyRangeList` | 检验项目适用范围 | `` | 9d38fcc5-fc77-4c7d-a2b4-5f85413ef5c2 |

---

## 关联属性（7个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `applyRangeList` | 检验项目适用范围 | `QMSDFM.checkProject.checkProjectApplyRange` | None | true |
| 3 | `checkProjectclassId` | 检验项目分类id | `QMSDFM.checkProjectClass.checkProjectClass` | None |  |
| 4 | `creatorId` | 创建人id | `base.user.User` | Service |  |
| 5 | `modifierId` | 修改人id | `base.user.User` | Service |  |
| 6 | `detailId` | 检验项目详情 | `QMSDFM.checkProject.checkProjectDetail` | None | true |
| 7 | `qualityinSpectionCenter` | 管理组织 | `org.func.QualityOrg` | Service |  |
