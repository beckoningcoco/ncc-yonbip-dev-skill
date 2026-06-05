---
tags: ["BIP", "元数据", "数据字典", "OSM", "po.arriveorder.OsmArriveOrderSn"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 委外到货单序列号 (`po.arriveorder.OsmArriveOrderSn`)

> OSM | 物理表：`po_osm_arrive_order_sn`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 委外到货单序列号 |
| 物理表 | `po_osm_arrive_order_sn` |
| 数据库 schema | `productionorder` |
| 所属应用 | `OSM` |
| 构建时间 | `2026-06-05 09:57:03.0350` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `rowno` | Integer | 序号 |

---

## 直接属性（44个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `define2` | 自定义项2 | `define2` | String |
| 2 | `define1` | 自定义项1 | `define1` | String |
| 3 | `define12` | 自定义项12 | `define12` | String |
| 4 | `define9` | 自定义项9 | `define9` | String |
| 5 | `define13` | 自定义项13 | `define13` | String |
| 6 | `define8` | 自定义项8 | `define8` | String |
| 7 | `define14` | 自定义项14 | `define14` | String |
| 8 | `define7` | 自定义项7 | `define7` | String |
| 9 | `define15` | 自定义项15 | `define15` | String |
| 10 | `define6` | 自定义项6 | `define6` | String |
| 11 | `define30` | 自定义项30 | `define30` | String |
| 12 | `arriveOrderProductId` | 到货单产品id | `arrive_order_product_id` | 858b44be-73af-4087-a285-219c34d67b83 |
| 13 | `presnstate` | 序列号上一状态 | `creSNstate` | String |
| 14 | `define5` | 自定义项5 | `define5` | String |
| 15 | `define4` | 自定义项4 | `define4` | String |
| 16 | `define10` | 自定义项10 | `define10` | String |
| 17 | `define3` | 自定义项3 | `define3` | String |
| 18 | `define11` | 自定义项11 | `define11` | String |
| 19 | `lineNo` | 行号 | `line_no` | Decimal |
| 20 | `define27` | 自定义项27 | `define27` | String |
| 21 | `define28` | 自定义项28 | `define28` | String |
| 22 | `define29` | 自定义项29 | `define29` | String |
| 23 | `sn` | 序列号 | `csn_code` | String |
| 24 | `id` | ID | `id` | Long |
| 25 | `pubts` | 时间戳 | `pubts` | DateTime |
| 26 | `rowno` | 序号 | `rowno` | Integer |
| 27 | `makebillsign` | 生单标识 | `cMakeBillSign` | String |
| 28 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 29 | `define23` | 自定义项23 | `define23` | String |
| 30 | `define24` | 自定义项24 | `define24` | String |
| 31 | `define25` | 自定义项25 | `define25` | String |
| 32 | `define26` | 自定义项26 | `define26` | String |
| 33 | `sourcebillsnid` | 来源序列号行id | `iSourceBillSNId` | Long |
| 34 | `define20` | 自定义项20 | `define20` | String |
| 35 | `arriveOrderId` | 到货单id | `arrive_order_id` | Long |
| 36 | `updatecount` | 序列号更新次数 | `iUpdateCount` | Integer |
| 37 | `define21` | 自定义项21 | `define21` | String |
| 38 | `define22` | 自定义项22 | `define22` | String |
| 39 | `define16` | 自定义项16 | `define16` | String |
| 40 | `freeCharacteristics` | 自由项特征组 | `free_cts` | f11dd966-8393-44b1-89cd-40e54b1b84d0 |
| 41 | `define17` | 自定义项17 | `define17` | String |
| 42 | `define18` | 自定义项18 | `define18` | String |
| 43 | `define19` | 自定义项19 | `define19` | String |
| 44 | `snstate` | 序列号状态 | `cSNstate` | String |

---

## 关联属性（3个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `freeCharacteristics` | 自由项特征组 | `po.arriveorder.SnFreeCharacteristics` | None |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `arriveOrderProductId` | 到货单产品id | `po.arriveorder.OsmArriveOrderProduct` | None | true |
