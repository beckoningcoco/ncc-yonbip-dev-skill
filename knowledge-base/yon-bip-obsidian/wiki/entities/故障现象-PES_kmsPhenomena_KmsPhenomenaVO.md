---
tags: ["BIP", "元数据", "数据字典", "IMP_PES", "PES.kmsPhenomena.KmsPhenomenaVO"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 故障现象 (`PES.kmsPhenomena.KmsPhenomenaVO`)

> IMP_PES | 物理表：`kms_phenomena`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 故障现象 |
| 物理表 | `kms_phenomena` |
| 数据库 schema | `imppes` |
| 所属应用 | `IMP_PES` |
| 构建时间 | `2026-06-05 17:17:18.5520` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | ID |

---

## 直接属性（23个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `orgId` | 组织id | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 2 | `code` | 编码 | `code` | String |
| 3 | `name` | 名称 | `name` | String |
| 4 | `kmsCategoryId` | 故障分类ID | `kms_category_id` | e47c578a-b780-4988-aa12-97132d21f153 |
| 5 | `isEffective` | 启用状态 | `is_effective` | Short |
| 6 | `memo` | 描述 | `memo` | String |
| 7 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 8 | `creator` | 创建人名称 | `creator` | String |
| 9 | `createUser` | 创建者 | `create_user` | String |
| 10 | `createTime` | 创建时间 | `create_time` | DateTime |
| 11 | `createDate` | 创建日期 | `create_date` | Date |
| 12 | `lastModified` | 最近修改时间 | `last_modified` | String |
| 13 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 14 | `modifier` | 修改人名称 | `modifier` | String |
| 15 | `lastModifyUser` | 最近修改者 | `last_modify_user` | String |
| 16 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 17 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 18 | `id` | ID | `id` | String |
| 19 | `dr` | 逻辑删除 | `dr` | Integer |
| 20 | `tenant` | 租户ID | `tenant_id` | String |
| 21 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 22 | `pubts` | 时间戳 | `pubts` | DateTime |
| 23 | `ts` | 版本号 | `ts` | String |

---

## 关联属性（5个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `kmsCategoryId` | 故障分类ID | `pes.kmsCategoryTree.KmsCategoryTreeVO` | None |  |
| 3 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 4 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 5 | `orgId` | 组织id | `org.func.BaseOrg` | Service |  |
