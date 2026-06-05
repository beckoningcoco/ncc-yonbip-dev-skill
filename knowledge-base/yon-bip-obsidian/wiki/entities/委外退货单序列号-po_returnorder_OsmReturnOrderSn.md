---
tags: ["BIP", "元数据", "数据字典", "OSM", "po.returnorder.OsmReturnOrderSn"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 委外退货单序列号 (`po.returnorder.OsmReturnOrderSn`)

> OSM | 物理表：`po_osm_arrive_order_sn`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 委外退货单序列号 |
| 物理表 | `po_osm_arrive_order_sn` |
| 数据库 schema | `productionorder` |
| 所属应用 | `OSM` |
| 构建时间 | `2026-06-05 09:57:12.5850` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `rowno` | Integer | 序号 |

---

## 直接属性（44个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `arriveOrderId` | 退货单id | `arrive_order_id` | Long |
| 2 | `arriveOrderProductId` | 退货单产品id | `arrive_order_product_id` | 0d67012a-9649-4ece-9baa-17c7b5144dac |
| 3 | `define1` | 自定义项1 | `define1` | String |
| 4 | `define10` | 自定义项10 | `define10` | String |
| 5 | `define11` | 自定义项11 | `define11` | String |
| 6 | `define12` | 自定义项12 | `define12` | String |
| 7 | `define13` | 自定义项13 | `define13` | String |
| 8 | `define14` | 自定义项14 | `define14` | String |
| 9 | `define15` | 自定义项15 | `define15` | String |
| 10 | `define16` | 自定义项16 | `define16` | String |
| 11 | `define17` | 自定义项17 | `define17` | String |
| 12 | `define18` | 自定义项18 | `define18` | String |
| 13 | `define19` | 自定义项19 | `define19` | String |
| 14 | `define2` | 自定义项2 | `define2` | String |
| 15 | `define20` | 自定义项20 | `define20` | String |
| 16 | `define21` | 自定义项21 | `define21` | String |
| 17 | `define22` | 自定义项22 | `define22` | String |
| 18 | `define23` | 自定义项23 | `define23` | String |
| 19 | `define24` | 自定义项24 | `define24` | String |
| 20 | `define25` | 自定义项25 | `define25` | String |
| 21 | `define26` | 自定义项26 | `define26` | String |
| 22 | `define27` | 自定义项27 | `define27` | String |
| 23 | `define28` | 自定义项28 | `define28` | String |
| 24 | `define29` | 自定义项29 | `define29` | String |
| 25 | `define3` | 自定义项3 | `define3` | String |
| 26 | `define30` | 自定义项30 | `define30` | String |
| 27 | `define4` | 自定义项4 | `define4` | String |
| 28 | `define5` | 自定义项5 | `define5` | String |
| 29 | `define6` | 自定义项6 | `define6` | String |
| 30 | `define7` | 自定义项7 | `define7` | String |
| 31 | `define8` | 自定义项8 | `define8` | String |
| 32 | `define9` | 自定义项9 | `define9` | String |
| 33 | `freeCharacteristics` | 自由项特征组 | `free_cts` | 911ac39d-edb4-48cb-9ca4-eabdd8e24346 |
| 34 | `id` | ID | `id` | Long |
| 35 | `lineNo` | 行号 | `line_no` | Decimal |
| 36 | `makebillsign` | 生单标识 | `cMakeBillSign` | String |
| 37 | `presnstate` | 序列号上一状态 | `creSNstate` | String |
| 38 | `pubts` | 时间戳 | `pubts` | DateTime |
| 39 | `rowno` | 序号 | `rowno` | Integer |
| 40 | `sn` | 序列号 | `csn_code` | String |
| 41 | `snstate` | 序列号状态 | `cSNstate` | String |
| 42 | `sourcebillsnid` | 来源序列号行id | `iSourceBillSNId` | Long |
| 43 | `updatecount` | 序列号更新次数 | `iUpdateCount` | Integer |
| 44 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（3个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `freeCharacteristics` | 自由项特征组 | `po.returnorder.SnFreeCharacteristics` | None |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `arriveOrderProductId` | 退货单产品id | `po.returnorder.OsmReturnOrderProduct` | None | true |
