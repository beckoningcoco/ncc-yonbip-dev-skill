---
tags: ["BIP", "元数据", "数据字典", "BCD", "aa.barcoderule.BarcodeRuleAllocation"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 条码解析规则分配 (`aa.barcoderule.BarcodeRuleAllocation`)

> BCD | 物理表：`aa_barcoderule_allocation`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 条码解析规则分配 |
| 物理表 | `aa_barcoderule_allocation` |
| domain/服务域 | `uscmpub` |
| schema | `usp_plantransportroute` |
| 所属应用 | `BCD` |
| 构建时间 | `2026-06-04 23:34:28.3860` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（16个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `iRuleID` | iRuleID | `iRuleID` | da284ef8-bbf6-4ba0-bb45-53214bad75a4 |
| 2 | `lineno` | 行号 | `lineno` | Decimal |
| 3 | `org` | 组织 | `iOrgid` | c1135e08-c4bf-4499-90bf-67030d1f2654 |
| 4 | `productn` | 物料 | `productId` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 5 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 6 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 7 | `pubts` | 时间戳 | `pubts` | DateTime |
| 8 | `productclassId` | 物料分类ID | `productClassId` | b295ef54-c421-4865-aca3-f5a9207a8d50 |
| 9 | `productId` | 物料Id | `productId` | 9a24ef07-e188-425b-b36a-402ddbf22073 |
| 10 | `allocationType` | 分配方式 | `allocationType` | Short |
| 11 | `iCustomId` | 客户 | `iCustomId` | Long |
| 12 | `acquiescent` | 默认 | `acquiescent` | Short |
| 13 | `copies` | 打印份数 | `copies` | Short |
| 14 | `id` | ID | `id` | Long |
| 15 | `barcodeTag` | 条码标签ID | `barcodeTag` | 8310c56b-8188-42ea-a660-5a1077fc9e63 |
| 16 | `bDefault` | 是否默认 | `bDefault` | Boolean |

---

## 关联属性（8个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `productId` | 物料Id | `pc.aa.Product` | Service |  |
| 2 | `productn` | 物料 | `pc.product.Product` | Service |  |
| 3 | `org` | 组织 | `aa.baseorg.InventoryOrgMV` | Service |  |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 5 | `productclassId` | 物料分类ID | `pc.cls.ManagementClass` | Service |  |
| 6 | `barcodeTag` | 条码标签ID | `aa.barcodetag.BarcodeTag` | None |  |
| 7 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
| 8 | `iRuleID` | iRuleID | `aa.barcoderule.BarcodeRule` | None | true |
