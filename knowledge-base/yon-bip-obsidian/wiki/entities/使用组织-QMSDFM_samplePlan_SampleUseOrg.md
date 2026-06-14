---
tags: ["BIP", "元数据", "数据字典", "QIC", "QMSDFM.samplePlan.SampleUseOrg"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 使用组织 (`QMSDFM.samplePlan.SampleUseOrg`)

> QIC | 物理表：`qms_dfm_sampleplanuseorg`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 使用组织 |
| 物理表 | `qms_dfm_sampleplanuseorg` |
| domain/服务域 | `QMS-DFM` |
| schema | `qms_dfm` |
| 所属应用 | `QIC` |
| 构建时间 | `2026-06-05 16:48:18.7200` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（17个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `createDate` | 创建时间 | `create_date` | DateTime |
| 2 | `dr` | 逻辑删除标记 | `dr` | Short |
| 3 | `isApplied` | 是否被分配使用 | `isApplied` | Boolean |
| 4 | `isCreator` | 是否创建者 | `isCreator` | Boolean |
| 5 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 6 | `parentId` | 关联组织ID | `parentId` | 5539bfee-9f1a-4ea1-84d3-fc996d2426c4 |
| 7 | `pubts` | 时间戳 | `pubts` | DateTime |
| 8 | `tenant` | 租户ID | `tenant_id` | String |
| 9 | `id` | ID | `id` | Long |
| 10 | `orgId` | orgId | `org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 11 | `creatorId` | 创建人id | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 12 | `creator` | 创建人 | `creator` | String |
| 13 | `createTime` | 创建时间 | `create_time` | DateTime |
| 14 | `modifierId` | 修改人id | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 15 | `modifier` | 修改人 | `modifier` | String |
| 16 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 17 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（5个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `creatorId` | 创建人id | `base.user.User` | Service |  |
| 3 | `modifierId` | 修改人id | `base.user.User` | Service |  |
| 4 | `orgId` | orgId | `aa.baseorg.OrgMV` | Service |  |
| 5 | `parentId` | 关联组织ID | `QMSDFM.samplePlan.SamplePlan` | None | true |
