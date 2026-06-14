---
tags: [BIP, 元数据, 数据字典, EIA.EIA.TaxMaterialOptGrandVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 农产品计税产品规则 (`EIA.EIA.TaxMaterialOptGrandVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`ia_caltax_rules_g` | domain：`yonbip-fi-eia` | 应用：`EIA` | 业务对象ID：`125969e6-ca07-477d-ab3e-55fc26a40267`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 农产品计税产品规则 |
| 物理表 | `ia_caltax_rules_g` |
| domain/服务域 | `yonbip-fi-eia` |
| schema | `fieia` |
| 所属应用 | `EIA` |
| 直连字段 | 12 个 |
| 子表 | 0 个 |
| 关联引用 | 6 个 |

## 关联引用 (6个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `product_costclass` | `productcenter.pc_costclassref` |
| `product_id` | `productcenter.pc_nomalproductref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
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

> 共 12 个直连字段

### 文本字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | id |
| `remark` | `remark` | `remark` | 说明 |

### 引用字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pid` | `pid` | `pid` | 农产品计税物料规则 |
| `creator` | `creator` | `creator` | 创建人 |
| `product_costclass` | `product_costclass` | `productCostclass` | 产品成本分类 |
| `product_id` | `product_id` | `productId` | 相关产品 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `pubts` | `pubts` | `pubts` | pubts |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |
