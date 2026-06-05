---
tags: ["BIP", "元数据", "数据字典", "ST", "st.storeout.StoreOutDetailSN"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 调拨出库单序列号 (`st.storeout.StoreOutDetailSN`)

> ST | 物理表：`st_storeout_sn`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 调拨出库单序列号 |
| 物理表 | `st_storeout_sn` |
| 数据库 schema | `ustock` |
| 所属应用 | `ST` |
| 构建时间 | `2026-06-05 09:58:52.7610` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `rowno` | Integer | 序号 |

---

## 直接属性（46个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `makebillsign` | 生单标识 | `cMakeBillSign` | String |
| 2 | `lineno` | 物料行号 | `lineno` | String |
| 3 | `presnstate` | 序列号上一状态 | `creSNstate` | String |
| 4 | `rowno` | 序号 | `rowno` | Integer |
| 5 | `snCharacter` | 序列号自由项特征组 | `snCharacter` | 5b44a887-67ec-4b92-a606-3793eb0e143f |
| 6 | `snstate` | 序列号状态 | `cSNstate` | String |
| 7 | `sourcebillsnid` | 来源序列号行id | `iSourceBillSNId` | Long |
| 8 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 9 | `updatecount` | 序列号更新次数 | `iUpdateCount` | Integer |
| 10 | `id` | ID | `id` | Long |
| 11 | `productsku` | SKU编码 | `iProductSkuid` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 |
| 12 | `pubts` | 时间戳 | `pubts` | DateTime |
| 13 | `grandpaid` | 主表id | `iGrandpaId` | 50774931-ab56-416c-ab19-6af097f02e54 |
| 14 | `detailid` | 子表id | `iDetailId` | 115a7d25-c0a5-4953-975c-b3e50dbeb868 |
| 15 | `sn` | 序列号 | `csn_code` | String |
| 16 | `define1` | 序列号属性1 | `define1` | String |
| 17 | `define2` | 序列号属性2 | `define2` | String |
| 18 | `define3` | 序列号属性3 | `define3` | String |
| 19 | `define4` | 序列号属性4 | `define4` | String |
| 20 | `define5` | 序列号属性5 | `define5` | String |
| 21 | `define6` | 序列号属性6 | `define6` | String |
| 22 | `define7` | 序列号属性7 | `define7` | String |
| 23 | `define8` | 序列号属性8 | `define8` | String |
| 24 | `define9` | 序列号属性9 | `define9` | String |
| 25 | `define10` | 序列号属性10 | `define10` | String |
| 26 | `define11` | 序列号属性11 | `define11` | String |
| 27 | `define12` | 序列号属性12 | `define12` | String |
| 28 | `define13` | 序列号属性13 | `define13` | String |
| 29 | `define14` | 序列号属性14 | `define14` | String |
| 30 | `define15` | 序列号属性15 | `define15` | String |
| 31 | `define16` | 序列号属性16 | `define16` | String |
| 32 | `define17` | 序列号属性17 | `define17` | String |
| 33 | `define18` | 序列号属性18 | `define18` | String |
| 34 | `define19` | 序列号属性19 | `define19` | String |
| 35 | `define20` | 序列号属性20 | `define20` | String |
| 36 | `define21` | 序列号属性21 | `define21` | String |
| 37 | `define22` | 序列号属性22 | `define22` | String |
| 38 | `define23` | 序列号属性23 | `define23` | String |
| 39 | `define24` | 序列号属性24 | `define24` | String |
| 40 | `define25` | 序列号属性25 | `define25` | String |
| 41 | `define26` | 序列号属性26 | `define26` | String |
| 42 | `define27` | 序列号属性27 | `define27` | String |
| 43 | `define28` | 序列号属性28 | `define28` | String |
| 44 | `define29` | 序列号属性29 | `define29` | String |
| 45 | `define30` | 序列号属性30 | `define30` | String |
| 46 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（6个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `productsku` | SKU编码 | `pc.product.ProductSKU` | Service |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `snCharacter` | 序列号自由项特征组 | `st.storeout.StoreOutDetailSNCharacter` | None |  |
| 4 | `detailid` | 子表id | `st.storeout.StoreOutDetail` | None | true |
| 5 | `grandpaid` | 主表id | `st.storeout.StoreOut` | None |  |
| 6 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
