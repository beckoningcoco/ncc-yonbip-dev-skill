---
tags: ["BIP", "元数据", "数据字典", "IMP_PES", "pes.sos.SmsSosProduct"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 工单设备物料信息 (`pes.sos.SmsSosProduct`)

> IMP_PES | 物理表：`sms_so_product`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 工单设备物料信息 |
| 物理表 | `sms_so_product` |
| domain/服务域 | `imppes` |
| 所属应用 | `IMP_PES` |
| 构建时间 | `2026-06-05 17:20:13.4620` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（14个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `productId` | 产品 | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 2 | `qty` | 数量 | `qty` | Decimal |
| 3 | `soId` | 工单Id | `so_id` | 18332b41-ebd3-4301-90af-714dfea07d9f |
| 4 | `sourceautoid` | 上游单据子表id | `iSourceAutoId` | Long |
| 5 | `sourceGrandchildrenId` | 上游单据孙表id | `source_grandchildren_id` | Long |
| 6 | `taxAmount` | 含税金额 | `tax_amount` | Decimal |
| 7 | `taxPrice` | 含税单价 | `tax_price` | Decimal |
| 8 | `taxRate` | 税率 | `tax_rate` | Decimal |
| 9 | `taxRateArchive` | 税率档案 | `tax_rate_archive` | 709cd092-3dd4-49ca-9eb9-7b8888551810 |
| 10 | `unit` | 单位 | `unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 11 | `tenant` | 租户ID | `tenant_id` | String |
| 12 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 13 | `id` | ID | `id` | Long |
| 14 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（5个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `soId` | 工单Id | `pes.sos.SmsSos` | None | true |
| 2 | `unit` | 单位 | `pc.unit.Unit` | Service |  |
| 3 | `productId` | 产品 | `pc.product.Product` | Service |  |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 5 | `taxRateArchive` | 税率档案 | `archive.taxArchives.TaxRateArchive` | Service |  |
