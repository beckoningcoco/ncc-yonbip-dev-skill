---
tags: [BIP, 元数据, 数据字典, rscm.projectmaterial.PurchaseExecution]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 采购执行明细 (`rscm.projectmaterial.PurchaseExecution`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`prpr_material_purchase_execution` | domain：`yonbip-pm-projectme` | 应用：`RSCM` | 业务对象ID：`df40af34-9a0c-497b-a146-0041db0653e9`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 采购执行明细 |
| 物理表 | `prpr_material_purchase_execution` |
| domain/服务域 | `yonbip-pm-projectme` |
| schema | `pmcloud` |
| 所属应用 | `RSCM` |
| 直连字段 | 19 个 |
| 子表 | 0 个 |
| 关联引用 | 7 个 |

## 关联引用 (7个)

| 字段名 | 引用类型 |
|--------|---------|
| `project_materialList_id` | `` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `supplier_id` | `yssupplier.aa_vendor` |
| `define_characteristics` | `` |
| `product_id` | `productcenter.pc_nomalproductref` |
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

> 共 19 个直连字段

### 文本字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |
| `material_item_row_id` | `material_item_row_id` | `materialItemRowId` | 物资明细行ID |
| `purchase_contract_id` | `purchase_contract_id` | `purchaseContractId` | 采购合同 |

### 引用字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `product_id` | `product_id` | `productId` | 物料 |
| `project_materialList_id` | `project_materialList_id` | `projectMaterialListId` | 项目物资清单 |
| `supplier_id` | `supplier_id` | `supplierId` | 供应商 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `quantity` | `quantity` | `quantity` | 数量 |
| `total_mny` | `total_mny` | `totalMny` | 无税金额合计 |
| `total_tax_mny` | `total_tax_mny` | `totalTaxMny` | 含税金额合计 |
| `unit_price` | `unit_price` | `unitPrice` | 无税单价 |
| `unit_tax_price` | `unit_tax_price` | `unitTaxPrice` | 含税单价 |

### FreeCT (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `define_characteristics` | `define_characteristics` | `defineCharacteristics` | 自定义项特征组 |
