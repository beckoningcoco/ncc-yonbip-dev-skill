---
tags: ["BIP", "元数据", "数据字典", "QIC", "QMSDFM.sampleMethod.sampleMethodApplyRange"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 取样方式适用范围 (`QMSDFM.sampleMethod.sampleMethodApplyRange`)

> QIC | 物理表：`qms_dfm_sample_method_apply_range`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 取样方式适用范围 |
| 物理表 | `qms_dfm_sample_method_apply_range` |
| 数据库 schema | `QMS-DFM` |
| 所属应用 | `QIC` |
| 构建时间 | `2026-06-05 16:47:17.4920` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（10个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `tenant` | 租户ID | `tenant_id` | String |
| 3 | `id` | ID | `id` | Long |
| 4 | `orgId` | 使用组织 | `org_id` | 9d2a4a8b-1b44-4c00-b39d-4fbcf8fa958a |
| 5 | `sampleMethodId` | 取样方式id(停用) | `sample_method_id` | d21eaba0-3431-4238-b178-c6216a31b34b |
| 6 | `sampleMethodDetailId` | 取样方式主表id | `sample_method_detail_id` | 5653b278-1a57-42ea-81ab-e579e060556a |
| 7 | `isAdmin` | 是否是管理组织 | `is_admin` | Boolean |
| 8 | `isApplied` | 使用组织是否已启用 | `is_applied` | Boolean |
| 9 | `dr` | 逻辑删除标记 | `dr` | Short |
| 10 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `sampleMethodId` | 取样方式id(停用) | `QMSDFM.sampleMethod.sampleMethod` | None | true |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `sampleMethodDetailId` | 取样方式主表id | `QMSDFM.sampleMethod.sampleMethodDetail` | None |  |
| 4 | `orgId` | 使用组织 | `org.func.QualityOrg` | Service |  |
