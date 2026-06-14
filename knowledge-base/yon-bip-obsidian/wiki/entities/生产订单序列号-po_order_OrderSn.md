---
tags: ["BIP", "元数据", "数据字典", "PO", "po.order.OrderSn"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 生产订单序列号 (`po.order.OrderSn`)

> PO | 物理表：`po_order_sn`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 生产订单序列号 |
| 物理表 | `po_order_sn` |
| domain/服务域 | `productionorder` |
| 所属应用 | `PO` |
| 构建时间 | `2026-06-05 09:25:48.3280` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `rowno` | Decimal | 行号(序列号接口) |

---

## 直接属性（45个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `define1` | 自定义项1 | `define1` | String |
| 2 | `define10` | 自定义项10 | `define10` | String |
| 3 | `define11` | 自定义项11 | `define11` | String |
| 4 | `define12` | 自定义项12 | `define12` | String |
| 5 | `define13` | 自定义项13 | `define13` | String |
| 6 | `define14` | 自定义项14 | `define14` | String |
| 7 | `define15` | 自定义项15 | `define15` | String |
| 8 | `define16` | 自定义项16 | `define16` | String |
| 9 | `define17` | 自定义项17 | `define17` | String |
| 10 | `define18` | 自定义项18 | `define18` | String |
| 11 | `define19` | 自定义项19 | `define19` | String |
| 12 | `define2` | 自定义项2 | `define2` | String |
| 13 | `define20` | 自定义项20 | `define20` | String |
| 14 | `define21` | 自定义项21 | `define21` | String |
| 15 | `define22` | 自定义项22 | `define22` | String |
| 16 | `define23` | 自定义项23 | `define23` | String |
| 17 | `define24` | 自定义项24 | `define24` | String |
| 18 | `define25` | 自定义项25 | `define25` | String |
| 19 | `define26` | 自定义项26 | `define26` | String |
| 20 | `define27` | 自定义项27 | `define27` | String |
| 21 | `define28` | 自定义项28 | `define28` | String |
| 22 | `define29` | 自定义项29 | `define29` | String |
| 23 | `define3` | 自定义项3 | `define3` | String |
| 24 | `define30` | 自定义项30 | `define30` | String |
| 25 | `define4` | 自定义项4 | `define4` | String |
| 26 | `define5` | 自定义项5 | `define5` | String |
| 27 | `define6` | 自定义项6 | `define6` | String |
| 28 | `define7` | 自定义项7 | `define7` | String |
| 29 | `define8` | 自定义项8 | `define8` | String |
| 30 | `define9` | 自定义项9 | `define9` | String |
| 31 | `id` | ID | `id` | Long |
| 32 | `lineNo` | 行号 | `line_no` | Decimal |
| 33 | `makebillsign` | 生单标识 | `cMakeBillSign` | String |
| 34 | `orderId` | 生产订单id | `order_id` | Long |
| 35 | `orderProductId` | 产品id | `order_product_id` | 8eadf170-a715-41e1-b654-51ef707f7e90 |
| 36 | `orderProductLineNo` | 产品行号 | `order_product_line_no` | Decimal |
| 37 | `presnstate` | 序列号上一状态 | `creSNstate` | String |
| 38 | `pubts` | 时间戳 | `pubts` | DateTime |
| 39 | `rowno` | 行号(序列号接口) | `rowno` | Decimal |
| 40 | `sn` | 序列号 | `csn_code` | String |
| 41 | `snCharacteristics` | 自由项特征组 | `sn_characteristics` | a68d2697-e127-4f36-aefa-0d930e4685c2 |
| 42 | `snstate` | 序列号状态 | `cSNstate` | String |
| 43 | `sourcebillsnid` | 来源序列号行id | `iSourceBillSNId` | Long |
| 44 | `updatecount` | 序列号更新次数 | `iUpdateCount` | Integer |
| 45 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（3个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `snCharacteristics` | 自由项特征组 | `po.order.SnCharacteristics` | None |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `orderProductId` | 产品id | `po.order.OrderProduct` | None | true |
