---
tags: [BIP, 元数据, 数据字典, pc.tpl.ProductTplUnit]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 物料模板-计量单位 (`pc.tpl.ProductTplUnit`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`product_tpl_unit` | domain：`productcenter` | 应用：`GZTBDM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 物料模板-计量单位 |
| 物理表 | `product_tpl_unit` |
| domain/服务域 | `productcenter` |
| schema | `iuap_apdoc_coredoc` |
| 所属应用 | `GZTBDM` |
| 直连字段 | 25 个 |
| 子表 | 0 个 |
| 关联引用 | 15 个 |

## 关联引用 (15个)

| 字段名 | 引用类型 |
|--------|---------|
| `produceUnitId` | `` |
| `tpl_id` | `` |
| `demandPlanningUnitId` | `` |
| `batchPriceUnitId` | `` |
| `ytenant_id` | `` |
| `offlineUnitId` | `` |
| `onlineUnitId` | `` |
| `stockUnitId` | `` |
| `purchaseUnitId` | `` |
| `oUnit_id` | `` |
| `batchUnitId` | `` |
| `requireUnitId` | `` |
| `purchasePriceUnitId` | `` |
| `tenant_id` | `` |
| `inspectionUnitId` | `` |

## 继承接口 (2个, 2字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 25 个直连字段

### 引用字段 (15个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `batchPriceUnitId` | `batchPriceUnitId` | `batchPriceUnit` | 批发计价单位 |
| `batchUnitId` | `batchUnitId` | `batchUnit` | 批发销售单位 |
| `demandPlanningUnitId` | `demandPlanningUnitId` | `demandPlanningUnit` | 需求计划单位 |
| `inspectionUnitId` | `inspectionUnitId` | `inspectionUnit` | 检验单位 |
| `offlineUnitId` | `offlineUnitId` | `offlineUnit` | 线下零售单位 |
| `onlineUnitId` | `onlineUnitId` | `onlineUnit` | 线上零售单位 |
| `produceUnitId` | `produceUnitId` | `produceUnit` | 生产单位 |
| `purchasePriceUnitId` | `purchasePriceUnitId` | `purchasePriceUnit` | 采购计价单位 |
| `purchaseUnitId` | `purchaseUnitId` | `purchaseUnit` | 采购单位 |
| `requireUnitId` | `requireUnitId` | `requireUnit` | 要货单位 |
| `stockUnitId` | `stockUnitId` | `stockUnit` | 库存单位 |
| `tpl_id` | `tpl_id` | `template` | 物料模板 |
| `oUnit_id` | `oUnit_id` | `unit` | 主计量单位 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户 |
| `tenant_id` | `tenant_id` | `tenant` | 租户(废弃) |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bEnableAssistUnit` | `bEnableAssistUnit` | `enableAssistUnit` | 启用辅计量 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### 数值字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `batchPriceRate` | `batchPriceRate` | `batchPriceRate` | 批发计价单位换算率 |
| `batchRate` | `batchRate` | `batchRate` | 批发销售单位换算率 |
| `offlineRate` | `offlineRate` | `offlineRate` | 线下零售单位换算率 |
| `onlineRate` | `onlineRate` | `onlineRate` | 线上零售单位换算率 |
| `purchaseRate` | `purchaseRate` | `purchaseRate` | 采购单位换算率 |
| `requireRate` | `requireRate` | `requireRate` | 要货单位换算率 |
| `stockRate` | `stockRate` | `stockRate` | 库存单位换算率 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
