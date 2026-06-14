---
tags: ["BIP", "元数据", "数据字典", "QIC", "QMSDFM.inspectinfo.inspectresult"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 处理结果 (`QMSDFM.inspectinfo.inspectresult`)

> QIC | 物理表：`qms_dfm_dealresult`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 处理结果 |
| 物理表 | `qms_dfm_dealresult` |
| domain/服务域 | `QMS-DFM` |
| schema | `qms_dfm` |
| 所属应用 | `QIC` |
| 构建时间 | `2026-06-05 16:48:04.1270` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | ID |

---

## 直接属性（18个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | ID | `id` | String |
| 3 | `pk_baditem` | 不良项目 | `pk_baditem` | 3de0c23e-ee02-46b4-bae7-0a982de498ce |
| 4 | `pk_inspectinfo` | 质检结果表头 | `pk_inspectinfo` | 3526de2a-c4bf-42e8-b6c2-54ab856dacb4 |
| 5 | `pk_material` | 改判物料 | `pk_material` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 6 | `pk_materialsku` | 改判物料sku | `pk_materialsku` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 |
| 7 | `storage_num` | 累计出入库数量 | `storage_num` | Decimal |
| 8 | `sumout_num` | 累计出库数量 | `sumout_num` | Decimal |
| 9 | `is_out` | 是否可出库 | `is_out` | Boolean |
| 10 | `pk_unit` | 主计量 | `pk_unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 11 | `num` | 处理数量 | `num` | Decimal |
| 12 | `treat_method` | 处理方式ID | `pk_treatmethod` | 4406ea9f-9ed2-49d2-af46-8af10cca2b1a |
| 13 | `pk_inventorystate` | 库存状态ID | `pk_inventorystate` | 5275f074-3e60-4b90-9771-20970f1e905c |
| 14 | `is_qualified` | 是否合格 | `is_qualified` | Boolean |
| 15 | `is_storage` | 是否可出入库 | `is_storage` | Boolean |
| 16 | `pubts` | 时间戳 | `pubts` | DateTime |
| 17 | `pk_batchcode` | 出入库批次号 | `pk_batchcode` | String |
| 18 | `passStatus` | 放行状态 | `pass_status` | String |

---

## 关联属性（8个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `pk_inspectinfo` | 质检结果表头 | `QMSDFM.inspectinfo.inspectinfo` | None | true |
| 2 | `pk_materialsku` | 改判物料sku | `pc.product.ProductSKU` | Service |  |
| 3 | `pk_baditem` | 不良项目 | `QMSDFM.badItems.badItems` | None |  |
| 4 | `pk_material` | 改判物料 | `pc.product.Product` | Service |  |
| 5 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 6 | `pk_unit` | 主计量 | `pc.unit.Unit` | Service |  |
| 7 | `treat_method` | 处理方式ID | `QMSDFM.treatmethod.treatmethod` | None |  |
| 8 | `pk_inventorystate` | 库存状态ID | `st.stockStatusRecord.stockStatusRecord` | Service |  |
