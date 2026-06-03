---
tags: [BIP, 元数据, 数据字典, RSCM.suppliersuggest.SupplierSuggested]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 物资推荐供应商 (`RSCM.suppliersuggest.SupplierSuggested`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`rscm_supplier_suggested` | domain：`yonbip-pm-projectme` | 应用：`RSCM` | 业务对象ID：`41780538-4854-435c-880d-3edac76e4c22`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 物资推荐供应商 |
| 物理表 | `rscm_supplier_suggested` |
| 数据库 schema | `yonbip-pm-projectme` |
| 所属应用 | `RSCM` |
| 直连字段 | 20 个 |
| 子表 | 1 个 |
| 关联引用 | 5 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `SupplierSuggestedItemList` | `RSCM.suppliersuggest.SupplierSuggestedItem` | composition |

## 关联引用 (5个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |
| `define_characteristic` | `` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |

## 继承接口 (3个, 6字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`

## 字段列表（按类型分组）

> 共 20 个直连字段

### 文本字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `compliance_memo` | `compliance_memo` | `complianceMemo` | 法规合规性 |
| `cost_desc` | `cost_desc` | `costDesc` | 成本 |
| `deliver_desc` | `deliver_desc` | `deliverDesc` | 交付 |
| `id` | `id` | `id` | 主键 |
| `procurement_method` | `procurement_method` | `procurementMethod` | 采购方式 |
| `quality_desc` | `quality_desc` | `qualityDesc` | 品质 |
| `suggestions` | `suggestions` | `suggestions` | 结论建议 |

### 引用字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 枚举字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `evaluation_method` | `evaluation_method` | `evaluationMethod` | 评价方法 |

### 整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `business_weight` | `business_weight` | `businessWeight` | 商务权重 |
| `price_weight` | `price_weight` | `priceWeight` | 价格权重 |
| `technical_weight` | `technical_weight` | `technicalWeight` | 技术权重 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `SupplierSuggestedItemList` | 物资推荐供应商明细 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `define_characteristic` | `define_characteristic` | `defineCharacteristic` | 自定义特征 |
