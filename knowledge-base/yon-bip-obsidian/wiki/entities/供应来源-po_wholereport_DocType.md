---
tags: ["BIP", "元数据", "数据字典", "PO", "po.wholereport.DocType"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 供应来源 (`po.wholereport.DocType`)

> PO | 物理表：`po_whole_doctype`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 供应来源 |
| 物理表 | `po_whole_doctype` |
| domain/服务域 | `productionorder` |
| 所属应用 | `PO` |
| 构建时间 | `2026-06-05 09:34:15.1770` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（8个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 2 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 3 | `dsDocTypeCode` | 供应来源编码 | `ds_doctype_code` | String |
| 4 | `dsDocTypeId` | 供应来源ID | `ds_doctype_id` | 60aac41e-1091-4a47-95aa-f9ae351aedc5 |
| 5 | `dsDocTypeSn` | 供应来源顺序 | `ds_doctype_sn` | Integer |
| 6 | `id` | ID | `id` | Long |
| 7 | `pubts` | 时间戳 | `pubts` | DateTime |
| 8 | `wholeId` | 齐套分析ID | `whole_id` | a8af8064-3e34-4ffe-9eb9-8f289b1aabcc |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `wholeId` | 齐套分析ID | `po.wholereport.WholeReport` | None | true |
| 3 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
| 4 | `dsDocTypeId` | 供应来源ID | `po.ds.DocType` | None |  |
