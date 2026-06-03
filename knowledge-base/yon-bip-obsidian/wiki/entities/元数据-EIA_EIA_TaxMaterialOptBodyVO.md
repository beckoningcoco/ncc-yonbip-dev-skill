---
tags: [BIP, 元数据, 数据字典, EIA.EIA.TaxMaterialOptBodyVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 农产品计税物料规则 (`EIA.EIA.TaxMaterialOptBodyVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`ia_caltax_rules_b` | domain：`yonbip-fi-eia` | 应用：`EIA` | 业务对象ID：`125969e6-ca07-477d-ab3e-55fc26a40267`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 农产品计税物料规则 |
| 物理表 | `ia_caltax_rules_b` |
| 数据库 schema | `yonbip-fi-eia` |
| 所属应用 | `EIA` |
| 直连字段 | 16 个 |
| 子表 | 1 个 |
| 关联引用 | 7 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `TaxMaterialOptGrandVOList` | `EIA.EIA.TaxMaterialOptGrandVO` | composition |

## 关联引用 (7个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `material` | `productcenter.pc_nomalproductref` |
| `` | `` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `material_costclass` | `productcenter.pc_costclassref` |
| `pid` | `` |
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

> 共 16 个直连字段

### 文本字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | id |

### 引用字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pid` | `pid` | `pid` | 农产品计税基础 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `material_costclass` | `material_costclass` | `materialCostclass` | 物料成本分类 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |
| `material` | `material` | `material` | 计税物料 |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `pubts` | `pubts` | `pubts` | pubts |

### 枚举字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `taxcal_method` | `taxcal_method` | `taxcalMethod` | 计税方法 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `purchase_tax_rate` | `purchase_tax_rate` | `purchaseTaxRate` | 购进税率 |
| `deduct_ratio` | `deduct_ratio` | `deductRatio` | 调整系数 |
| `process_tax_rate` | `process_tax_rate` | `processTaxRate` | 深加工税率 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `TaxMaterialOptGrandVOList` | 农产品计税产品规则 |
