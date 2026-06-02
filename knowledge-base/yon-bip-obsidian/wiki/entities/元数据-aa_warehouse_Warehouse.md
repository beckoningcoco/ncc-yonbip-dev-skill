---
tags: [BIP, 元数据, 数据字典, aa, aa.warehouse.Warehouse]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 仓库档案 (`aa.warehouse.Warehouse`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `aa_warehouse` | 应用: `DPMSI` | 类型: `Class`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 仓库档案 |
| 物理表 | `aa_warehouse` |
| 应用 | `DPMSI` |
| 元数据类型 | `Class` |

## 主键与编码

| 角色 | 字段 | 列 | 类型 |
|------|------|-----|------|
| 主键 | `id` | `id` | Long |
| 编码 | `code` | `code` | |

## 部署信息

- 部署时间: 2026-05-22 23:00:21:000
- 安装来源: `/app/ugoods/upc/src/upc-server/scripts/db/patch/mongodb/V7_R0_2507/0006_bizdoc/0010_iuap_common/DML/0270_iuap_metadata/20260515-itr/202602021533_metadata_aa-warehouse.zip`

## 术语标记

`isAssigned`, `isExtend`, `MasterData`, `isMain`, `doc`

## 依赖接口（4 个）

| 接口 | URI | 版本 | 属性数 |
|------|-----|------|--------|
| IAuditInfo (`IAuditInfo`) | `base.itf.IAuditInfo` | 340 | 8 |
| IErp编码 (`IErpCode`) | `base.itf.IErpCode` | 73 | 1 |
| IAuto编码 (`IAutoCode`) | `voucher.base.IAutoCode` | 49 | 1 |
| IYTenant (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |

---

## 全部属性（52 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype | 必填 | 可空 |
|---|--------|--------|-----|------|---------|------|------|
| 1 | `headDefine` | headDefine | `` | d1129cd9-0446-4906-8429-74abd590d474 | `` |  |  |
| 2 | `id` | 主键ID | `id` | Long | `long` |  | true |
| 3 | `code` | 编码 | `code` | String | `text` |  | true |
| 4 | `name` | 名称 | `name` | String | `multiLanguage` |  | true |
| 5 | `linkman` | linkman | `linkman` | String | `text` |  | true |
| 6 | `phone` | phone | `phone` | String | `text` |  | true |
| 7 | `erpCode` | erp编码 | `erpCode` | String | `text` |  | true |
| 8 | `iUsed` | Used(ID) | `iUsed` | String | `text` |  | true |
| 9 | `country` | ountry | `country` | 8e9602ac-5ca2-4d06-aede-4a0af4c316bf | `quote` |  | true |
| 10 | `regionCode` | region编码 | `region_code` | String | `text` |  | true |
| 11 | `longitude` | 经度 | `longitude` | Decimal | `number` |  | true |
| 12 | `latitude` | 纬度 | `latitude` | Decimal | `number` |  | true |
| 13 | `address` | 地址 | `address` | String | `text` |  | true |
| 14 | `org` | org | `org_id` | c1135e08-c4bf-4499-90bf-67030d1f2654 | `quote` |  | true |
| 15 | `ownerorg` | ownerorg | `ownerorg_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | true |
| 16 | `department` | epartment(日期) | `department` | a4352e3c-3eda-4539-a7a9-ec00799be118 | `quote` |  | true |
| 17 | `operator` | operator | `operator` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |  | true |
| 18 | `consignmentCustomer` | onsignmentCustomer | `consignmentCustomer` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` |  | true |
| 19 | `bMRP` | bMRP | `bMRP` | Boolean | `switch` |  | true |
| 20 | `joinStockQuery` | joinStockQuery | `iJoinStockQuery` | Boolean | `switch` |  | true |
| 21 | `stockCheckType` | stockCheckType(类型) | `iStockCheckType` | StockCheckType | `` |  | true |
| 22 | `iSerialManage` | SerialManage(ID) | `iSerialManage` | Boolean | `switch` |  | true |
| 23 | `isGoodsPosition` | 是否GoodsPosition | `isGoodsPosition` | Boolean | `switch` |  | true |
| 24 | `isGoodsPositionStock` | 是否GoodsPositionStock | `isGoodsPositionStock` | Boolean | `switch` |  | true |
| 25 | `eStore` | eStore | `eStore` | Boolean | `switch` |  | true |
| 26 | `wStore` | wStore | `wStore` | Boolean | `switch` |  | true |
| 27 | `bWMS` | bWMS | `bWMS` | Boolean | `switch` |  | true |
| 28 | `isSubcontractW` | 是否SubcontractW | `isSubcontractW` | Boolean | `switch` |  | true |
| 29 | `vendor` | vendor | `iVendorId` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | `quote` |  | true |
| 30 | `isInvertedScour` | 是否InvertedScour | `isInvertedScour` | Boolean | `switch` |  | true |
| 31 | `countCost` | ountCost | `iCountCost` | Boolean | `switch` |  | true |
| 32 | `isWasteWarehouse` | 是否WasteWarehouse | `isWasteWarehouse` | Boolean | `switch` |  | true |
| 33 | `isCarSales` | 是否CarSales | `isCarSales` | Boolean | `switch` |  | true |
| 34 | `isConsignment` | 是否Consignment | `isConsignment` | Boolean | `switch` |  | true |
| 35 | `isPDAStorage` | 是否PDAStorage | `isPDAStorage` | Boolean | `switch` |  | true |
| 36 | `isBatchNumberManage` | 是否BatchNumberManage | `isBatchNumberManage` | Integer | `int` |  | true |
| 37 | `shopDefault` | shopDefault | `shopDefault` | Boolean | `switch` |  | true |
| 38 | `cust` | ust | `iCustID` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` |  | true |
| 39 | `defineCharacter` | efineCharacter(日期) | `defineCharacter` | 3aaa28fb-ea76-49ba-9a9d-f9597b5d4e1a | `UserDefine` |  | true |
| 40 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | true | true |
| 41 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | true |
| 42 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` | true | true |
| 43 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | true |
| 44 | `creator` | 创建人 | `creator` | String | `text` |  | true |
| 45 | `createDate` | 创建日期 | `create_date` | Date | `date` |  | true |
| 46 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |  | true |
| 47 | `modifierId` | 修改人ID | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | true |
| 48 | `modifier` | 修改人 | `modifier` | String | `text` |  | true |
| 49 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |  | true |
| 50 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |  | true |
| 51 | `stocks` | stocks | `` | a32ad546-4fdb-4122-b9ba-53a18cf7be5c | `` |  |  |
| 52 | `warehouseFreeDefines` | warehouseFreeDefines | `` | d2a37ea8-e49e-4b90-a5e0-b7d58621f305 | `` |  |  |

## 关联属性（16 个）

| # | 字段 | 显示名 | 目标实体 | 列 | 关系 | 多重性 | 组合 | 隔离 | 废弃 |
|---|------|--------|---------|-----|------|--------|------|------|------|
| 1 | `consignmentCustomer` | onsignmentCustomer | `aa.merchant.Merchant` | `consignmentCustomer` | 外键 |  |  | None |  |
| 2 | `country` | ountry | `bd.country.CountryVO` | `country` | 外键 |  |  | Service |  |
| 3 | `headDefine` | headDefine | `aa.warehouse.WarehouseDefine` | `` | headDefine → id | 1 | Y | None |  |
| 4 | `org` | org | `aa.baseorg.InventoryOrgMV` | `org_id` | 外键 |  |  | Service |  |
| 5 | `ytenant` | ytenant | `yht.tenant.YhtTenant` | `ytenant_id` | 外键 |  |  | Service |  |
| 6 | `creatorId` | 创建人ID | `base.user.User` | `creatorId` | 外键 |  |  | Service |  |
| 7 | `modifierId` | 修改人ID | `base.user.User` | `modifierId` | 外键 |  |  | Service |  |
| 8 | `operator` | operator | `bd.staff.Staff` | `operator` | 外键 |  |  | Service |  |
| 9 | `stocks` | stocks | `aa.warehouse.WarehouseStock` | `` | stocks → warehouse | 0..n | Y | None |  |
| 10 | `ownerorg` | ownerorg | `org.func.BaseOrg` | `ownerorg_id` | 外键 |  |  | Service |  |
| 11 | `warehouseFreeDefines` | warehouseFreeDefines | `aa.warehouse.WarehouseFreeDefine` | `` | warehouseFreeDefines → id | 1 | Y | None |  |
| 12 | `vendor` | vendor | `aa.vendor.Vendor` | `iVendorId` | 外键 |  |  | Service |  |
| 13 | `department` | epartment(日期) | `bd.adminOrg.AdminOrgVO` | `department` | 外键 |  |  | Service |  |
| 14 | `cust` | ust | `aa.merchant.Merchant` | `iCustID` | 外键 |  |  | None |  |
| 15 | `defineCharacter` | efineCharacter(日期) | `aa.warehouse.WarehouseDefineCharacter` | `defineCharacter` | 外键 |  |  | None |  |
| 16 | `tenant` | tenant | `base.tenant.Tenant` | `tenant_id` | 外键 |  |  | None |  |

---

## SQL 示例

```sql
SELECT id, code, name, linkman, phone, erpCode, iUsed, country
FROM aa_warehouse
```