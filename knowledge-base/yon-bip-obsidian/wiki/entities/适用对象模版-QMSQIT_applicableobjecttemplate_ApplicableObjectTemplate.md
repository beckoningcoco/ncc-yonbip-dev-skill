---
tags: ["BIP", "元数据", "数据字典", "QMSQIT", "QMSQIT.applicableobjecttemplate.ApplicableObjectTemplate"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 适用对象模版 (`QMSQIT.applicableobjecttemplate.ApplicableObjectTemplate`)

> QMSQIT | 物理表：`qms_qit_applicable_object_template`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 适用对象模版 |
| 物理表 | `qms_qit_applicable_object_template` |
| 数据库 schema | `QMS-QIT` |
| 所属应用 | `QMSQIT` |
| 构建时间 | `2026-06-05 16:42:11.3390` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `code` | String | 编码 |

---

## 直接属性（27个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | ID | `id` | Long |
| 3 | `code` | 编码 | `code` | String |
| 4 | `name` | 名称 | `name` | String |
| 5 | `parent` | 上级分组 | `parent_id` | 9cf5f5cd-70ea-4d73-bb89-e348a0630dc2 |
| 6 | `parentCode` | 上级分组编码 | `parent_code` | String |
| 7 | `templateUsage` | 模版用途 | `template_usage` | String |
| 8 | `memo` | 备注 | `memo` | String |
| 9 | `preset` | 预置 | `preset` | Boolean |
| 10 | `level` | 层级 | `level` | Integer |
| 11 | `isEnd` | 是否末级 | `isEnd` | Boolean |
| 12 | `path` | 路径 | `path` | String |
| 13 | `createTime` | 创建时间 | `create_time` | DateTime |
| 14 | `createDate` | 创建日期 | `create_date` | Date |
| 15 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 16 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 17 | `creator` | 创建人名称 | `creator` | String |
| 18 | `modifier` | 修改人名称 | `modifier` | String |
| 19 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 20 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 21 | `dr` | 逻辑删除标记 | `dr` | Short |
| 22 | `enable` | 启用 | `enable` | sys_intboolean |
| 23 | `enablets` | 启用时间 | `enablets` | DateTime |
| 24 | `disablets` | 停用时间 | `disablets` | DateTime |
| 25 | `sort` | 排序号 | `sort_num` | Integer |
| 26 | `pubts` | 时间戳 | `pubts` | DateTime |
| 27 | `dims` | 适用对象维度 | `` | 43edafb7-131b-4cf9-8cfa-4b7abed38703 |

---

## 关联属性（5个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `parent` | 上级分组 | `QMSQIT.applicableobjecttemplate.ApplicableObjectTemplate` | None |  |
| 2 | `dims` | 适用对象维度 | `QMSQIT.applicableobjecttemplate.ApplicableObjectDim` | None | true |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 5 | `modifierId` | 修改人 | `base.user.User` | Service |  |
