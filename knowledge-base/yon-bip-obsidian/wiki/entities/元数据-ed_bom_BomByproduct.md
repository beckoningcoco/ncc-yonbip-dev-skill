---
tags: [BIP, 元数据, 数据字典, ed.bom.BomByproduct]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 产出品 (`ed.bom.BomByproduct`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`ed_bom_byproduct` | domain：`engineeringdata` | 应用：`ED` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 产出品 |
| 物理表 | `ed_bom_byproduct` |
| domain/服务域 | `engineeringdata` |
| 所属应用 | `ED` |
| 直连字段 | 41 个 |
| 子表 | 2 个 |
| 关联引用 | 13 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `bomByproductAttrextItem` | `ed.bom.BomByproductAttrextItem` | composition |
| `bomByproductUserdefItem` | `ed.bom.BomByproductUserdefItem` | composition |

## 关联引用 (13个)

| 字段名 | 引用类型 |
|--------|---------|
| `produce_unit_id` | `productcenter.pc_productassitunitsref` |
| `bom_id` | `` |
| `product_id` | `productcenter.productref` |
| `ytenant_id` | `` |
| `org_id` | `ucf-org-center.bd_factoryorg` |
| `bom_unit_id` | `` |
| `bom_byproduct_define_character` | `` |
| `bom_byproduct_free_cts` | `` |
| `` | `` |
| `bom_byproduct_sensitive` | `` |
| `sku_id` | `productcenter.productskuref` |
| `tenant_id` | `` |

## 继承接口 (2个, 2字段)

- **逻辑删除相关** (`ucfbase.ucfbaseItf.LogicDelete`)
  - `dr` → `dr`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 41 个直连字段

### 文本字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `engineering_draw_number` | `engineering_draw_number` | `engineeringDrawNumber` | 工程图号 |
| `erpcode` | `erpcode` | `erpCode` | erpCode |
| `sensitive_uid` | `sensitive_uid` | `sensitiveUID` | BOM敏感域唯一性ID |
| `remark` | `remark` | `remark` | 备注 |
| `ecn_order_code` | `ecn_order_code` | `ecnOrderCode` | 工程变更单据号 |

### 引用字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `bom_unit_id` | `bom_unit_id` | `bomUnit` | 主计量单位 |
| `produce_unit_id` | `produce_unit_id` | `produceUnit` | 生产单位 |
| `product_id` | `product_id` | `productId` | 物料 |
| `bom_id` | `bom_id` | `bomId` | 母件信息表关联标识 |
| `sku_id` | `sku_id` | `skuId` | SKUid |
| `org_id` | `org_id` | `orgId` | 工厂id |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `production_type` | `production_type` | `productionType` | 产出类型 |

### 短整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `change_type` | `change_type` | `changeType` | 换算方式 |
| `dr` | `dr` | `dr` | 逻辑删除标记 |

### 长整数 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `allocation_source_id` | `allocation_source_id` | `allocationSourceId` | 分配来源Id |
| `original_id` | `original_id` | `originalId` | 修订源 |
| `id` | `id` | `id` | 明细id |
| `material_id` | `material_id` | `materialId` | 联副产品id |
| `ecn_order_id` | `ecn_order_id` | `ecnOrderId` | 工程变更单id |
| `ecn_order_detail_id` | `ecn_order_detail_id` | `ecnOrderDetailId` | 变更明细id  |

### 数值字段 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `change_rate` | `change_rate` | `changeRate` | 换算率 |
| `produce_numerator_quantity` | `produce_numerator_quantity` | `produceNumeratorQuantity` | 生产单位数量 |
| `produce_quantity` | `produce_quantity` | `produceQuantity` | 生产单位使用数量 |
| `numerator_quantity` | `numerator_quantity` | `numeratorQuantity` | 数量 |
| `denominator_quantity` | `denominator_quantity` | `denominatorQuantity` | 母件底数 |
| `quantity` | `quantity` | `quantity` | 产出数量 |
| `cost_output_proportion` | `cost_output_proportion` | `costOutputProportion` | 成本产出比例(%) |
| `ecn_line_no` | `ecn_line_no` | `ecnLineNo` | 工厂变更单行号 |
| `scrap` | `scrap` | `scrap` | 损耗率% |
| `change_rate_den` | `change_rate_den` | `changeRateDen` | 换算率分母 |
| `change_rate_num` | `change_rate_num` | `changeRateNum` | 换算率分子 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bom_byproduct_define_character` | `bom_byproduct_define_character` | `bomByproductDefineCharacter` | 自定义项特征属性组 |

### FreeCT (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bom_byproduct_free_cts` | `bom_byproduct_free_cts` | `bomByproductFreeCts` | BOM产出品自由项特征组自定义项实体 |
| `bom_byproduct_sensitive` | `bom_byproduct_sensitive` | `bomByproductSensitive` | 产出品BOM敏感域自定义项实体 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `expiry_date` | `expiry_date` | `expiryDate` | 失效日期 |
| `effective_date` | `effective_date` | `effectiveDate` | 生效日期 |

### other (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `bomByproductAttrextItem` | 产出品表自由自定义项 |
| `` | `` | `bomByproductUserdefItem` | 联副产品表固定自定义项 |
