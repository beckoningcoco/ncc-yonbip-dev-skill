---
tags: [BIP, 元数据, 数据字典, pc.product.ProductApplyRange]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 物料适用范围 (`pc.product.ProductApplyRange`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`productapplyrange` | domain：`productcenter` | 应用：`GZTBDM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 物料适用范围 |
| 物理表 | `productapplyrange` |
| domain/服务域 | `productcenter` |
| schema | `iuap_apdoc_coredoc` |
| 所属应用 | `GZTBDM` |
| 直连字段 | 33 个 |
| 子表 | 15 个 |
| 关联引用 | 23 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `productAppliedTags` | `pc.product.ProductTag` | composition |
| `productAppliedCheckFrees` | `pc.product.ProductCheckFree` | composition |
| `productSpecFreeNew` | `pc.product.ProductCheckFreeNew` | composition |
| `productTagNew` | `pc.product.ProductTagNew` | composition |
| `productCheckFreeNew` | `pc.product.ProductCheckFreeNew` | composition |
| `productAppliedDetail` | `pc.product.ProductApplyRangeDetail` | composition |
| `defaultSKUAppliedOrderProperties` | `pc.product.SKUOrderProperty` | composition |
| `productLoadWay` | `pc.product.ProductLoadWay` | composition |
| `productAppliedSpecFrees` | `pc.product.ProductCheckFree` | composition |
| `productAppliedParams` | `pc.product.ProductParameter` | composition |
| `productSkuOrderProperty` | `pc.product.ProductSkuOrderProperty` | composition |
| `skuTagNew` | `pc.product.SkuTagNew` | composition |
| `skuAppliedTags` | `pc.product.SKUTag` | composition |
| `productParameters` | `pc.product.ProductParameters` | composition |
| `productAppliedTime` | `pc.product.ProductDepositTime` | composition |

## 关联引用 (23个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |
| `productId` | `` |
| `ytenant_id` | `` |
| `productDepositTimeDetailId` | `` |
| `allocator_id` | `` |
| `orgId` | `ucf-org-center.org_pure_tree_ref` |
| `customerId` | `` |
| `shopId` | `productcenter.pc_mallordershopref` |
| `productDetailId` | `` |

## 继承接口 (2个, 2字段)

- **租户相关** (`coredoc.pub.TenantObselete`)
  - `tenant_id` → `tenant_id`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 33 个直连字段

### 文本字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `allocator_name` | `allocator_name` | `allocatorName` | 分配人 |
| `allocate_source` | `allocate_source` | `allocateSource` | 分配来源 |

### 引用字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `productId` | `productId` | `productId` | 物料 |
| `orgId` | `orgId` | `orgId` | 组织 |
| `customerId` | `customerId` | `customerId` | 客户 |
| `shopId` | `shopId` | `shopId` | 加盟商 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户 |
| `productDetailId` | `productDetailId` | `productDetailId` | 物料组织级表 |
| `productDepositTimeDetailId` | `productDepositTimeDetailId` | `productDepositTimeDetailId` | 物料定金明细表 |
| `allocator_id` | `allocator_id` | `allocatorId` | 分配人 |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `isCreator` | `isCreator` | `isCreator` | 是否物料管理组织 |
| `isApplied` | `isApplied` | `isApplied` | 使用组织是否修改数据 |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iRangeType` | `iRangeType` | `rangeType` | 物料分配范围类型 |
| `control_rule_version` | `control_rule_version` | `controlRuleVersion` | 管控规则版本号 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `tenant_id` | `tenant_id` | `tenant` | 租户(废弃) |

### timestamp (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `allocate_time` | `allocate_time` | `allocateTime` | 分配时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### other (15个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `defaultSKUAppliedOrderProperties` | (停用)物料订单属性(使用组织) |
| `` | `` | `productAppliedCheckFrees` | (停用)指定核算的规格 |
| `` | `` | `productAppliedDetail` | （停用）物料适用范围详情 |
| `` | `` | `productAppliedParams` | (停用)物料参数表(使用组织) |
| `` | `` | `productAppliedSpecFrees` | (停用)指定核算的规格 |
| `` | `` | `productAppliedTags` | (停用)物料标签关联表(使用组织) |
| `` | `` | `productAppliedTime` | (停用)物料定金时间关联(使用组织) |
| `` | `` | `productCheckFreeNew` | 指定核算的规格(整合) |
| `` | `` | `productLoadWay` | 物料装载方式(整合) |
| `` | `` | `productParameters` | 物料参数表(整合) |
| `` | `` | `productSkuOrderProperty` | 物料订单属性(整合) |
| `` | `` | `productSpecFreeNew` | 指定核算的规格(整合) |
| `` | `` | `productTagNew` | 物料标签关联表(整合) |
| `` | `` | `skuAppliedTags` | (停用)SKU标签关联表(使用组织) |
| `` | `` | `skuTagNew` | SKU标签关联表(整合) |
