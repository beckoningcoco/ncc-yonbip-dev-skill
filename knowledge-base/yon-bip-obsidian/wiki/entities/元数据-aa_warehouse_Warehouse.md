---
tags: [BIP, 元数据, 数据字典, aa.warehouse.Warehouse]
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

> **平台版本：BIP 旗舰版 V5**
> 物理表：`aa_warehouse` | domain：`productcenter` | 应用：`DPMSI` | 业务对象ID：`c33b8e04-8966-4698-8103-075cee3b8f63`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 仓库档案 |
| 物理表 | `aa_warehouse` |
| 数据库 schema | `productcenter` |
| 所属应用 | `DPMSI` |
| 直连字段 | 52 个 |
| 子表 | 3 个 |
| 关联引用 | 16 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `warehouseFreeDefines` | `aa.warehouse.WarehouseFreeDefine` | composition |
| `headDefine` | `aa.warehouse.WarehouseDefine` | composition |
| `stocks` | `aa.warehouse.WarehouseStock` | composition |

## 关联引用 (16个)

| 字段名 | 引用类型 |
|--------|---------|
| `consignmentCustomer` | `` |
| `country` | `` |
| `` | `` |
| `org_id` | `productcenter.aa_orgstock` |
| `ytenant_id` | `` |
| `operator` | `ucf-staff-center.bd_staff_ref` |
| `ownerorg_id` | `` |
| `iVendorId` | `yssupplier.aa_vendor` |
| `department` | `` |
| `iCustID` | `productcenter.aa_merchantclerk` |
| `defineCharacter` | `` |
| `tenant_id` | `` |

## 继承接口 (4个, 11字段)

- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **erp编码** (`base.itf.IErpCode`)
  - `erpCode` → `erpCode`
- **自动编号** (`voucher.base.IAutoCode`)
  - `` → ``
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 52 个直连字段

### 文本字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | 编码 |
| `linkman` | `linkman` | `linkman` | 联系人 |
| `phone` | `phone` | `phone` | 联系电话 |
| `erpCode` | `erpCode` | `erpCode` | ERP编码 |
| `iUsed` | `iUsed` | `iUsed` | 状态 |
| `region_code` | `region_code` | `regionCode` | 行政区划 |
| `address` | `address` | `address` | 详细地址 |
| `` | `creator` | `creator` | 创建人 |
| `` | `modifier` | `modifier` | 修改人 |

### 引用字段 (12个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `country` | `country` | `country` | 国家/地区 |
| `org_id` | `org_id` | `org` | 库存组织 |
| `ownerorg_id` | `ownerorg_id` | `ownerorg` | 管理组织 |
| `department` | `department` | `department` | 负责部门 |
| `operator` | `operator` | `operator` | 负责人 |
| `consignmentCustomer` | `consignmentCustomer` | `consignmentCustomer` | 寄售客户 |
| `iVendorId` | `iVendorId` | `vendor` | 委外供应商 |
| `iCustID` | `iCustID` | `cust` | 所属客户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户 |
| `tenant_id` | `tenant_id` | `tenant` | 租户(废弃) |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 布尔字段 (16个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bMRP` | `bMRP` | `bMRP` | 计划可用 |
| `iJoinStockQuery` | `iJoinStockQuery` | `joinStockQuery` | 参与可用量查询 |
| `iSerialManage` | `iSerialManage` | `iSerialManage` | 序列号管理 |
| `isGoodsPosition` | `isGoodsPosition` | `isGoodsPosition` | 货位管理 |
| `isGoodsPositionStock` | `isGoodsPositionStock` | `isGoodsPositionStock` | 货位记存量 |
| `eStore` | `eStore` | `eStore` | 电商仓库 |
| `wStore` | `wStore` | `wStore` | 门店仓 |
| `bWMS` | `bWMS` | `bWMS` | WMS仓 |
| `isSubcontractW` | `isSubcontractW` | `isSubcontractW` | 委外仓 |
| `isInvertedScour` | `isInvertedScour` | `isInvertedScour` | 倒冲仓 |
| `iCountCost` | `iCountCost` | `countCost` | 计算成本 |
| `isWasteWarehouse` | `isWasteWarehouse` | `isWasteWarehouse` | 废品仓 |
| `isCarSales` | `isCarSales` | `isCarSales` | 车销仓 |
| `isConsignment` | `isConsignment` | `isConsignment` | 寄售仓 |
| `isPDAStorage` | `isPDAStorage` | `isPDAStorage` | PDA存储作业 |
| `shopDefault` | `shopDefault` | `shopDefault` | 商家默认 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `isBatchNumberManage` | `isBatchNumberManage` | `isBatchNumberManage` | 批次号管理 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### 数值字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `longitude` | `longitude` | `longitude` | 经度 |
| `latitude` | `latitude` | `latitude` | 维度 |

### other (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `headDefine` | 仓库档案自定义项 |
| `iStockCheckType` | `iStockCheckType` | `stockCheckType` | 可用量控制方式 |
| `` | `` | `stocks` | 仓库库存组织关联表 |
| `` | `` | `warehouseFreeDefines` | 仓库自由自定义项 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 名称 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `defineCharacter` | `defineCharacter` | `defineCharacter` | 自定义项特征 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
