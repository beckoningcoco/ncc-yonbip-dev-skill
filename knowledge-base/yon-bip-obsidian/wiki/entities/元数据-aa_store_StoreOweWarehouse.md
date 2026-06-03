---
tags: [BIP, 元数据, 数据字典, aa.store.StoreOweWarehouse]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 门店所属仓库 (`aa.store.StoreOweWarehouse`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`mp_storeowewarehouse` | domain：`yxybase` | 应用：`Marketingpublic` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 门店所属仓库 |
| 物理表 | `mp_storeowewarehouse` |
| 数据库 schema | `yxybase` |
| 所属应用 | `Marketingpublic` |
| 直连字段 | 14 个 |
| 子表 | 0 个 |
| 关联引用 | 4 个 |

## 关联引用 (4个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `iStoreID` | `` |
| `iWarehouseID` | `productcenter.aa_warehouse_stocksref` |
| `tenant_id` | `` |

## 继承接口 (2个, 2字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 14 个直连字段

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iWarehouseID` | `iWarehouseID` | `warehouse` | 仓库 |
| `iStoreID` | `iStoreID` | `store` | 门店id |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 短整数 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iDefault` | `iDefault` | `isDefault` | 默认销售仓 |
| `iDefaultEc` | `iDefaultEc` | `isDefaultEc` | 默认电商销售仓 |
| `iDefaultMaterial` | `iDefaultMaterial` | `isDefaultMaterial` | 默认材料仓 |
| `isDefaultRequire` | `isDefaultRequire` | `isDefaultRequire` | 默认要货仓 |
| `isPlatformWarehouse` | `isPlatformWarehouse` | `isPlatformWarehouse` | 是否平台仓 |
| `isDefaultBack` | `isDefaultBack` | `isDefaultBack` | 默认退货仓 |
| `bCanSellWarehouse` | `bCanSellWarehouse` | `bCanSellWarehouse` | 门店可销售仓 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iPriorityLevel` | `iPriorityLevel` | `priorityLevel` | 优先级 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ts` | `ts` | `pubts` | 时间戳 |
