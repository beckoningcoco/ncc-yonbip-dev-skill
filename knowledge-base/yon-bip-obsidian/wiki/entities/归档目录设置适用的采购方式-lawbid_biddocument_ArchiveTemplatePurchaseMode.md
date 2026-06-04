---
tags: ["BIP", "元数据", "数据字典", "lawbid.biddocument.ArchiveTemplatePurchaseMode"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 归档目录设置适用的采购方式 (`lawbid.biddocument.ArchiveTemplatePurchaseMode`)

> **平台版本：BIP 旗舰版 V5**

>  模块 | 物理表：`cpu_archive_template_purchase_mode`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 归档目录设置适用的采购方式 |
| 物理表 | `cpu_archive_template_purchase_mode` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `` |
| 构建时间 | `2026-06-04 20:14:23.9160` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 主键 |

## 部署信息

- 部署时间: 2025-10-24 23:57:20:000

## 依赖接口（3个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 跨租户采购商租户接口 | `cpu.itf.IBuyerTenant` | 10 |
| 2 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |
| 3 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |

---

## 直接属性（7个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | 主键 | `id` | Long |
| 2 | `bidDocumentId` | 模板 | `bid_document_id` | a38e5e29-f268-42a0-82cc-b02f7bbae455 |
| 3 | `purchaseModeId` | 适用采购方式 | `purchase_mode_id` | 81c6880b-694a-4667-987f-81b5615f2401 |
| 4 | `dr` | 逻辑删除标记 | `dr` | Short |
| 5 | `ytenant` | 租户 | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 6 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 7 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（3个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户 | `yht.tenant.YhtTenant` | Service |  |
| 2 | `purchaseModeId` | 适用采购方式 | `lawbid.purchasedoc.PurchaseDoc` | None |  |
| 3 | `bidDocumentId` | 模板 | `lawbid.biddocument.BidDocument` | None | true |
