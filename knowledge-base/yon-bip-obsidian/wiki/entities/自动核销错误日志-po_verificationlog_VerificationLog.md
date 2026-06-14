---
tags: ["BIP", "元数据", "数据字典", "OSM", "po.verificationlog.VerificationLog"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 自动核销错误日志 (`po.verificationlog.VerificationLog`)

> OSM | 物理表：`po_verification_log`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 自动核销错误日志 |
| 物理表 | `po_verification_log` |
| domain/服务域 | `productionorder` |
| 所属应用 | `OSM` |
| 构建时间 | `2026-06-05 09:55:20.9910` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（11个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `errMsg` | 错误信息 | `err_msg` | String |
| 2 | `id` | ID | `id` | Long |
| 3 | `pubts` | 时间戳 | `pubts` | DateTime |
| 4 | `purinrecordCode` | 入库单号 | `purinrecord_code` | String |
| 5 | `purinrecordsId` | 入库行id | `purinrecords_id` | 3928fe10-4802-4d6d-9545-dfd2ac3aba9c |
| 6 | `purinrecordsRowno` | 入库单行号 | `purinrecords_rowno` | String |
| 7 | `sourceType` | 来源 | `source_type` | String |
| 8 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 9 | `verificationTime` | 核销时间 | `verification_time` | DateTime |
| 10 | `verificationUserId` | 核销人 | `verification_user_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 11 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `purinrecordsId` | 入库行id | `st.osminrecord.OsmInRecords` | Service |  |
| 2 | `verificationUserId` | 核销人 | `bd.staff.Staff` | Service |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
