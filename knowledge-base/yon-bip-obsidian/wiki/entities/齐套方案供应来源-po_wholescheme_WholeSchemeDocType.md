---
tags: ["BIP", "元数据", "数据字典", "PO", "po.wholescheme.WholeSchemeDocType"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 齐套方案供应来源 (`po.wholescheme.WholeSchemeDocType`)

> PO | 物理表：`po_wholescheme_doctype`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 齐套方案供应来源 |
| 物理表 | `po_wholescheme_doctype` |
| domain/服务域 | `productionorder` |
| 所属应用 | `PO` |
| 构建时间 | `2026-06-05 09:35:44.0140` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（7个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | ID | `id` | Long |
| 3 | `wholeSchemeId` | 齐套分析方案id | `whole_scheme_id` | 6be06ae9-de34-4f29-9179-350ede7390b9 |
| 4 | `dsDocTypeId` | 供应需求类型id | `ds_doctype_id` | 60aac41e-1091-4a47-95aa-f9ae351aedc5 |
| 5 | `dsDocTypeSn` | 顺序号 | `ds_doctype_sn` | Integer |
| 6 | `isCal` | 是否参与运算 | `is_cal` | Boolean |
| 7 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（3个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `wholeSchemeId` | 齐套分析方案id | `po.wholescheme.WholeScheme` | None | true |
| 3 | `dsDocTypeId` | 供应需求类型id | `po.ds.DocType` | None |  |
