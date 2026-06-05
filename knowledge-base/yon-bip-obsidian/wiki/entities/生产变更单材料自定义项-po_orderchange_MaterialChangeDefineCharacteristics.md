---
tags: ["BIP", "元数据", "数据字典", "PO", "po.orderchange.MaterialChangeDefineCharacteristics"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 生产变更单材料自定义项 (`po.orderchange.MaterialChangeDefineCharacteristics`)

> PO | 物理表：`po_order_material_change_dct`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 生产变更单材料自定义项 |
| 物理表 | `po_order_material_change_dct` |
| 数据库 schema | `productionorder` |
| 所属应用 | `PO` |
| 构建时间 | `2026-06-05 09:35:12.2190` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | ID |

---

## 直接属性（7个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `DD03` | DD03 | `ncol50` | Decimal |
| 2 | `DDTZPC1` | DDTZPC1 | `lcol1` | 9458cb44-2675-4988-8e64-f6a59fefed89 |
| 3 | `ZPDM` | 装配代码 | `vcol55` | String |
| 4 | `id` | ID | `id` | String |
| 5 | `lzxqfl001` | 绿洲需求分类 | `vcol1` | f48843cb-7ad2-47c8-a0f4-bb451e90022d |
| 6 | `pubts` | 时间戳 | `pubts` | DateTime |
| 7 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（3个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `DDTZPC1` | DDTZPC1 | `st.batchno.Batchno` | Service |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `lzxqfl001` | 绿洲需求分类 | `bd.customerdoc_XQFL.XQFL` | Service |  |
