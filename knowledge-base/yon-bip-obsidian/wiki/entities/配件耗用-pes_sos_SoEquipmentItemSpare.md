---
tags: ["BIP", "元数据", "数据字典", "IMP_PES", "pes.sos.SoEquipmentItemSpare"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 配件耗用 (`pes.sos.SoEquipmentItemSpare`)

> IMP_PES | 物理表：`sms_so_equipment_complete_item`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 配件耗用 |
| 物理表 | `sms_so_equipment_complete_item` |
| 数据库 schema | `imppes` |
| 所属应用 | `IMP_PES` |
| 构建时间 | `2026-06-05 17:20:27.1900` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | ID |

---

## 直接属性（31个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `itemId` | 配件Id | `item_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 2 | `batch` | 批号 | `batch` | String |
| 3 | `unit` | 单位 | `unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 4 | `qty` | 数量 | `qty` | Decimal |
| 5 | `taxPrice` | 含税单价 | `tax_price` | Decimal |
| 6 | `taxRate` | 税率 | `tax_rate` | Decimal |
| 7 | `taxAmount` | 含税金额 | `tax_amount` | Decimal |
| 8 | `autoConsume` | 自动消耗 | `auto_consume` | Boolean |
| 9 | `lendCumQty` | 累计借出数量 | `lend_cum_qty` | Decimal |
| 10 | `saleCumQty` | 累计销售数量 | `sale_cum_qty` | Decimal |
| 11 | `id` | ID | `id` | String |
| 12 | `soEquipmentId` | 工单设备子表ID | `so_equipment_id` | 25487918-5ce6-4ec1-ac75-96ac434f137f |
| 13 | `UserDefineCharacter` | 自定义项特征 | `user_define_character` | 5aecdf61-baaa-40ab-bc95-7f75fc17518c |
| 14 | `brandId` | 品牌 | `brand_id` | 75116b40-efe4-455e-b62d-d56ac4811eb1 |
| 15 | `productFreeCT` | 物料自由特征 | `product_freect` | b7224d1c-e91c-4f12-98d0-fcd0f11353c0 |
| 16 | `taxRateArchive` | 税率档案 | `tax_rate_archive` | 709cd092-3dd4-49ca-9eb9-7b8888551810 |
| 17 | `soId` | 工单Id | `so_id` | 18332b41-ebd3-4301-90af-714dfea07d9f |
| 18 | `soCompleteId` | 工单完工Id | `so_complete_id` | fec504f5-e447-48a7-80bd-0d4b4f5a972d |
| 19 | `orgId` | 组织 | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 20 | `createTimeStr` | 创建时间 | `create_time` | String |
| 21 | `lastModified` | 最近修改时间 | `last_modified` | String |
| 22 | `lastModifyUser` | 最近修改者 | `last_modify_user` | String |
| 23 | `createUser` | 创建者 | `create_user` | String |
| 24 | `tenant` | 租户ID | `tenant_id` | String |
| 25 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 26 | `dr` | 逻辑删除 | `dr` | Integer |
| 27 | `ts` | 版本号 | `ts` | String |
| 28 | `pubts` | 时间戳 | `pubts` | DateTime |
| 29 | `noTaxAmount` | 无税金额 | `no_tax_amount` | Decimal |
| 30 | `noTaxPrice` | 无税单价 | `no_tax_price` | Decimal |
| 31 | `tax` | 税额 | `tax` | Decimal |

---

## 关联属性（11个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `itemId` | 配件Id | `pc.product.Product` | Service |  |
| 2 | `soId` | 工单Id | `pes.sos.SmsSos` | None |  |
| 3 | `unit` | 单位 | `pc.unit.Unit` | Service |  |
| 4 | `productFreeCT` | 物料自由特征 | `pes.sos.SoEquipmentItemSpareFreeCT` | None |  |
| 5 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 6 | `soCompleteId` | 工单完工Id | `pes.sos.SoComplete` | None |  |
| 7 | `brandId` | 品牌 | `pc.brand.Brand` | Service |  |
| 8 | `UserDefineCharacter` | 自定义项特征 | `pes.sos.SoEquipmentItemSpareDefineCharacter` | None |  |
| 9 | `soEquipmentId` | 工单设备子表ID | `pes.sos.SmsSosEquipment` | None | true |
| 10 | `orgId` | 组织 | `org.func.BaseOrg` | Service |  |
| 11 | `taxRateArchive` | 税率档案 | `archive.taxArchives.TaxRateArchive` | Service |  |
