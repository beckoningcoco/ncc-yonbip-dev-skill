---
tags: ["BIP", "元数据", "数据字典", "IMP_PES", "pes.sos.SmsSoServicePrice"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 服务费用 (`pes.sos.SmsSoServicePrice`)

> IMP_PES | 物理表：`sms_so_service_price`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 服务费用 |
| 物理表 | `sms_so_service_price` |
| domain/服务域 | `imppes` |
| 所属应用 | `IMP_PES` |
| 构建时间 | `2026-06-05 17:19:39.6220` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（20个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `itemId` | 配件Id | `item_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 2 | `lendCumQty` | 累计借出数量 | `lend_cum_qty` | Decimal |
| 3 | `productFreeCT` | 物料自由特征 | `product_freect` | ad08aa70-2d7c-4b48-a986-25257a38ac41 |
| 4 | `qty` | 数量 | `qty` | Decimal |
| 5 | `saleCumQty` | 累计销售数量 | `sale_cum_qty` | Decimal |
| 6 | `soEquipmentItemRecordId` | 工单设备配件记录Id | `so_equipment_item_record_id` | c480e45b-b923-4427-8305-3d23fa2f0c7c |
| 7 | `soId` | 工单Id | `so_id` | 18332b41-ebd3-4301-90af-714dfea07d9f |
| 8 | `taxAmount` | 含税金额 | `tax_amount` | Decimal |
| 9 | `taxPrice` | 含税单价 | `tax_price` | Decimal |
| 10 | `taxRate` | 税率 | `tax_rate` | Decimal |
| 11 | `taxRateArchive` | 税率档案 | `tax_rate_archive` | 709cd092-3dd4-49ca-9eb9-7b8888551810 |
| 12 | `unit` | 单位 | `unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 13 | `UserDefineCharacter` | 自定义项特征 | `user_define_character` | fe75e232-e23c-49fe-ac09-3a7e8ccd1d3c |
| 14 | `tenant` | 租户ID | `tenant_id` | String |
| 15 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 16 | `id` | ID | `id` | Long |
| 17 | `pubts` | 时间戳 | `pubts` | DateTime |
| 18 | `noTaxAmount` | 无税金额 | `no_tax_amount` | Decimal |
| 19 | `noTaxPrice` | 无税单价 | `no_tax_price` | Decimal |
| 20 | `tax` | 税额 | `tax` | Decimal |

---

## 关联属性（8个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `itemId` | 配件Id | `pc.product.Product` | Service |  |
| 2 | `soId` | 工单Id | `pes.sos.SmsSos` | None | true |
| 3 | `unit` | 单位 | `pc.unit.Unit` | Service |  |
| 4 | `productFreeCT` | 物料自由特征 | `pes.sos.SmsSoServicePriceFreeCT` | None |  |
| 5 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 6 | `soEquipmentItemRecordId` | 工单设备配件记录Id | `pes.sos.SoEquipmentItemSpare` | None |  |
| 7 | `UserDefineCharacter` | 自定义项特征 | `pes.sos.SmsSoServicePriceDefineCharacter` | None |  |
| 8 | `taxRateArchive` | 税率档案 | `archive.taxArchives.TaxRateArchive` | Service |  |
