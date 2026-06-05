---
tags: ["BIP", "元数据", "数据字典", "QIC", "QMSDFM.checkProjectClass.checkProjectClassBody"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 分配组织(弃用) (`QMSDFM.checkProjectClass.checkProjectClassBody`)

> QIC | 物理表：`qms_dfm_checkprojectclassb`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 分配组织(弃用) |
| 物理表 | `qms_dfm_checkprojectclassb` |
| 数据库 schema | `QMS-DFM` |
| 所属应用 | `QIC` |
| 构建时间 | `2026-06-05 16:48:00.0390` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | ID |

---

## 直接属性（7个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `tenant` | 租户ID | `tenant_id` | String |
| 3 | `id` | ID | `id` | String |
| 4 | `pk_org` | 工厂组织 | `pk_org` | dcff4710-92a6-4b3a-85c0-553ad21aabc3 |
| 5 | `pk_checkProjectClass` | 检验项目分类 | `pk_checkProjectClass` | c3b4c20b-a758-485f-8565-7cec8f466bf4 |
| 6 | `pubts` | 时间戳 | `pubts` | DateTime |
| 7 | `dr` | 逻辑删除标记 | `dr` | Short |

---

## 关联属性（3个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `pk_checkProjectClass` | 检验项目分类 | `QMSDFM.checkProjectClass.checkProjectClass` | None | true |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `pk_org` | 工厂组织 | `org.func.FactoryOrg` | Service |  |
