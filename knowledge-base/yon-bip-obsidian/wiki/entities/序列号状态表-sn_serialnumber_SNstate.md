---
tags: ["BIP", "元数据", "数据字典", "ST", "sn.serialnumber.SNstate"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 序列号状态表 (`sn.serialnumber.SNstate`)

> ST | 物理表：`sn_state`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 序列号状态表 |
| 物理表 | `sn_state` |
| 数据库 schema | `ustock` |
| 所属应用 | `ST` |
| 构建时间 | `2026-06-04 23:34:17.1890` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（68个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `batchno` | 批次号 | `sBatchNo` | String |
| 2 | `createDate` | 创建日期 | `createdate` | Date |
| 3 | `createTime` | 创建时间 | `createTime` | DateTime |
| 4 | `cust` | 客户 | `iCustId` | Long |
| 5 | `define1` | 自定义项1 | `define1` | String |
| 6 | `define10` | 自定义项10 | `define10` | String |
| 7 | `define11` | 自定义项11 | `define11` | String |
| 8 | `define12` | 自定义项12 | `define12` | String |
| 9 | `define13` | 自定义项13 | `define13` | String |
| 10 | `define14` | 自定义项14 | `define14` | String |
| 11 | `define15` | 自定义项15 | `define15` | String |
| 12 | `define16` | 自定义项16 | `define16` | String |
| 13 | `define17` | 自定义项17 | `define17` | String |
| 14 | `define18` | 自定义项18 | `define18` | String |
| 15 | `define19` | 自定义项19 | `define19` | String |
| 16 | `define2` | 自定义项2 | `define2` | String |
| 17 | `define20` | 自定义项20 | `define20` | String |
| 18 | `define21` | 自定义项21 | `define21` | String |
| 19 | `define22` | 自定义项22 | `define22` | String |
| 20 | `define23` | 自定义项23 | `define23` | String |
| 21 | `define24` | 自定义项24 | `define24` | String |
| 22 | `define25` | 自定义项25 | `define25` | String |
| 23 | `define26` | 自定义项26 | `define26` | String |
| 24 | `define27` | 自定义项27 | `define27` | String |
| 25 | `define28` | 自定义项28 | `define28` | String |
| 26 | `define29` | 自定义项29 | `define29` | String |
| 27 | `define3` | 自定义项3 | `define3` | String |
| 28 | `define30` | 自定义项30 | `define30` | String |
| 29 | `define4` | 自定义项4 | `define4` | String |
| 30 | `define5` | 自定义项5 | `define5` | String |
| 31 | `define6` | 自定义项6 | `define6` | String |
| 32 | `define7` | 自定义项7 | `define7` | String |
| 33 | `define8` | 自定义项8 | `define8` | String |
| 34 | `define9` | 自定义项9 | `define9` | String |
| 35 | `free1` | 规格1 | `free1` | String |
| 36 | `free10` | 规格10 | `free10` | String |
| 37 | `free2` | 规格2 | `free2` | String |
| 38 | `free3` | 规格3 | `free3` | String |
| 39 | `free4` | 规格4 | `free4` | String |
| 40 | `free5` | 规格5 | `free5` | String |
| 41 | `free6` | 规格6 | `free6` | String |
| 42 | `free7` | 规格7 | `free7` | String |
| 43 | `free8` | 规格8 | `free8` | String |
| 44 | `free9` | 规格9 | `free9` | String |
| 45 | `id` | ID | `id` | Long |
| 46 | `invaliddate` | 失效日期 | `dInvalidDate` | Date |
| 47 | `inventoryowner` | 货主对象Id | `inventoryowner` | af1b583d-f5e4-4f7c-bba5-66d570ef7e3e |
| 48 | `location` | 货位 | `ilocationid` | 79b90356-9fc7-4bc2-ac1a-400520fa80cc |
| 49 | `org` | 库存组织 | `iOrgid` | c1135e08-c4bf-4499-90bf-67030d1f2654 |
| 50 | `ownertype` | 货权归属 | `ownertype` | Integer |
| 51 | `producedate` | 生产日期 | `dProduceDate` | Date |
| 52 | `product` | 商品 | `iProductid` | 9a24ef07-e188-425b-b36a-402ddbf22073 |
| 53 | `productn` | 商品 | `iProductid` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 54 | `productsku` | 商品skuid | `iProductSkuid` | 0d86941d-5af3-4cf4-9255-4f5c74a3476f |
| 55 | `productskun` | 商品skuid | `iProductSkuid` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 |
| 56 | `pubts` | 时间戳 | `pubts` | DateTime |
| 57 | `reserveid` | 跟踪线索Id | `reserveid` | fdc23f28-4a7f-46e8-844b-345f01c13996 |
| 58 | `sn` | 序列号 | `csn_code` | String |
| 59 | `snCharacter` | 序列号自由项特征组 | `sn_state_character_id` | 595af788-b3ff-4753-b10e-ace40e1240fd |
| 60 | `snCustomItems` | 序列号属性 | `` | f69b8ac9-e3d0-4928-8686-261bf952461c |
| 61 | `snstate` | 序列号状态 | `cSNstate` | String |
| 62 | `stockStatusDoc` | 库存状态 | `stockStatusDoc` | 5275f074-3e60-4b90-9771-20970f1e905c |
| 63 | `stocksensitive_uid` | 存量敏感域唯一性ID | `stock_character_uid` | String |
| 64 | `store` | 门店ID | `iStoreID` | 16e4e14c-ab05-4ee5-bbb8-c67351c9a8b3 |
| 65 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 66 | `updatecount` | 序列号更新次数 | `iUpdateCount` | Integer |
| 67 | `warehouse` | 仓库 | `iWarehouseId` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 |
| 68 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（15个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `product` | 商品 | `pc.aa.Product` | Service |  |
| 2 | `reserveid` | 跟踪线索Id | `st.reservation.Reservation` | None |  |
| 3 | `org` | 库存组织 | `aa.baseorg.InventoryOrgMV` | Service |  |
| 4 | `productskun` | 商品skuid | `pc.product.ProductSKU` | Service |  |
| 5 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 6 | `snCustomItems` | 序列号属性 | `sn.serialnumber.SNCustomItem` | None | true |
| 7 | `stockStatusDoc` | 库存状态 | `st.stockStatusRecord.stockStatusRecord` | None |  |
| 8 | `store` | 门店ID | `aa.store.Store` | Service |  |
| 9 | `warehouse` | 仓库 | `aa.warehouse.Warehouse` | Service |  |
| 10 | `productsku` | 商品skuid | `pc.aa.ProductSKU` | Service |  |
| 11 | `productn` | 商品 | `pc.product.Product` | Service |  |
| 12 | `snCharacter` | 序列号自由项特征组 | `sn.serialnumber.SNstateCharacter` | None |  |
| 13 | `location` | 货位 | `aa.goodsposition.GoodsPosition` | Service |  |
| 14 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
| 15 | `inventoryowner` | 货主对象Id | `st.inventoryowner.InventoryOwner` | None |  |
