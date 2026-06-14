---
tags: [BIP, 元数据, 数据字典, ed.bom.BomAlternate]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# BOM子件替代料 (`ed.bom.BomAlternate`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`ed_bom_component` | domain：`engineeringdata` | 应用：`ED` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | BOM子件替代料 |
| 物理表 | `ed_bom_component` |
| domain/服务域 | `engineeringdata` |
| 所属应用 | `ED` |
| 直连字段 | 99 个 |
| 子表 | 2 个 |
| 关联引用 | 19 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `bomAlternateUserdefItem` | `ed.bom.BomAlternateUserdefItem` | composition |
| `bomAlternateAttrextItem` | `ed.bom.BomAlternateAttrextItem` | composition |

## 关联引用 (19个)

| 字段名 | 引用类型 |
|--------|---------|
| `bom_reference_point` | `` |
| `bom_id` | `` |
| `product_id` | `productcenter.productref` |
| `` | `` |
| `bom_component_define_character` | `` |
| `ytenant_id` | `` |
| `bom_component_id` | `` |
| `alternateplan_id` | `` |
| `department_id` | `` |
| `org_id` | `ucf-org-center.bd_factoryorg` |
| `stock_unit_id` | `productcenter.pc_productassitunitsref` |
| `bom_unit_id` | `` |
| `bom_component_sensitive` | `` |
| `warehouse_id` | `` |
| `stock_org_id` | `` |
| `bom_component_free_cts` | `` |
| `sku_id` | `productcenter.productskuref` |
| `tenant_id` | `` |

## 继承接口 (1个, 1字段)

- **逻辑删除相关** (`ucfbase.ucfbaseItf.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 99 个直连字段

### 文本字段 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `erpcode` | `erpcode` | `erpCode` | erpCode |
| `whole_group_code` | `whole_group_code` | `wholeGroupCode` | 成套发料组号 |
| `chinese_name` | `chinese_name` | `chineseName` | 中文名称 |
| `designator` | `designator` | `designator` | 位置号 |
| `material_group_no` | `material_group_no` | `materialGroupNo` | 替代料组号 |
| `substitute_flag` | `substitute_flag` | `substituteFlag` | 子件替代标识 |
| `preferred_group_no` | `preferred_group_no` | `preferredGroupNo` | 优选组号 |
| `engineering_draw_number` | `engineering_draw_number` | `engineeringDrawNumber` | 工程图号 |
| `remark` | `remark` | `remark` | 备注 |
| `sensitive_uid` | `sensitive_uid` | `sensitiveUID` | BOM敏感域唯一性ID |
| `ecn_order_code` | `ecn_order_code` | `ecnOrderCode` | 工程变更单据号 |

### 引用字段 (14个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bom_id` | `bom_id` | `bomId` | 所属母件 |
| `warehouse_id` | `warehouse_id` | `warehouseId` | 仓库 |
| `department_id` | `department_id` | `departmentId` | 部门 |
| `stock_org_id` | `stock_org_id` | `stockOrgId` | 库存组织 |
| `alternateplan_id` | `alternateplan_id` | `alternateplanId` | 替代方案 |
| `bom_reference_point` | `bom_reference_point` | `bomReferencePoint` | 传输点 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `stock_unit_id` | `stock_unit_id` | `stockUnit` | 库存单位 |
| `bom_unit_id` | `bom_unit_id` | `bomUnit` | 主计量单位id |
| `bom_component_id` | `bom_component_id` | `bomComponentId` | 子件信息表关联标识 |
| `org_id` | `org_id` | `orgId` | 工厂id |
| `sku_id` | `sku_id` | `skuId` | 替代料SKUid |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `product_id` | `product_id` | `productId` | 物料id |

### 枚举字段 (22个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `is_virtual` | `is_virtual` | `isVirtual` | 虚拟件 |
| `usage_type` | `usage_type` | `usageType` | 用量类型 |
| `loss_type` | `loss_type` | `lossType` | 损耗类型 |
| `trunc_up` | `trunc_up` | `truncUp` | 向上取整 |
| `entrust_type` | `entrust_type` | `entrustType` | 委外供应方式 |
| `calc_cost_flag` | `calc_cost_flag` | `calcCostFlag` | 计算成本 |
| `whole_flag` | `whole_flag` | `wholeFlag` | 齐套 |
| `whole_point` | `whole_point` | `wholePoint` | 齐套检查点 |
| `alternate_type` | `alternate_type` | `alternateType` | 替代方式 |
| `partake_simulation` | `partake_simulation` | `partakeSimulation` | 参与模拟 |
| `component_type` | `component_type` | `componentType` | 材料类型 |
| `key_material_group` | `key_material_group` | `keyMaterialGroup` | 成组关键料 |
| `line_type` | `line_type` | `lineType` | 行类型 |
| `vendor_drop_shipment` | `vendor_drop_shipment` | `vendorDropShipment` | 供应商直运 |
| `entrust_supply_type` | `entrust_supply_type` | `entrustSupplyType` | 受托加工供应方式 |
| `quantity_can_change` | `quantity_can_change` | `quantityCanChange` | 数量可改 |
| `same_group_must_select` | `same_group_must_select` | `sameGroupMustSelect` | 同组必选 |
| `same_group_first_select` | `same_group_first_select` | `sameGroupFirstSelect` | 同组首选 |
| `same_group_mutex` | `same_group_mutex` | `sameGroupMutex` | 同组互斥 |
| `key_component` | `key_component` | `keyComponent` | 关键子件 |
| `main_material` | `main_material` | `mainMaterial` | 主料 |
| `standard` | `standard` | `standard` | 标准件 |

### 整数 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `supply_type` | `supply_type` | `supplyType` | 供应类型 |
| `advance_days` | `advance_days` | `advanceDays` | 提前期偏置 |
| `point_days` | `point_days` | `pointDays` | 置(天) |
| `replace_type` | `replace_type` | `replaceType` | 取代 |
| `rowno` | `rowno` | `rowno` | 序号 |
| `owner_type` | `owner_type` | `ownerType` | 货主类型 |

### 短整数 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `change_type` | `change_type` | `changeType` | 换算方式 |
| `excess_send_flag` | `excess_send_flag` | `excessSendFlag` | 超额发料 |
| `excess_send_type` | `excess_send_type` | `excessTendType` | 超额类型 |
| `mix_flag` | `mix_flag` | `mixFlag` | 混批 |
| `po_start_point` | `po_start_point` | `poStartPoint` | 订单开工 |
| `po_complete_point` | `po_complete_point` | `poCompletePoint` | 订单完工 |
| `operation_start_point` | `operation_start_point` | `operationStartPoint` | 工序开工 |
| `operation_complete_point` | `operation_complete_point` | `operationCompletePoint` | 工序完工 |
| `is_ratio_alternate` | `is_ratio_alternate` | `isRatioAlternate` | 按比例替代 |
| `fixed_quantity` | `fixed_quantity` | `fixedQuantity` | 固定用量 |
| `dr` | `dr` | `dr` | 逻辑删除标记 |

### 长整数 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `allocation_source_id` | `allocation_source_id` | `allocationSourceId` | 分配来源Id |
| `original_id` | `original_id` | `originalId` | 修订源 |
| `id` | `id` | `id` | 明细id |
| `material_id` | `material_id` | `materialId` | 替代料id |
| `sequence` | `sequence` | `sequence` | 替代次序 |
| `ecn_order_id` | `ecn_order_id` | `ecnOrderId` | 工程变更单id |
| `ecn_order_detail_id` | `ecn_order_detail_id` | `ecnOrderDetailId` | 变更明细id  |

### 数值字段 (20个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `alternate_denominator` | `alternate_denominator` | `alternateDenominator` | 替代比分母 |
| `change_rate` | `change_rate` | `changeRate` | 换算率 |
| `line_no` | `line_no` | `lineNo` | 行号 |
| `stock_numerator_quantity` | `stock_numerator_quantity` | `stockNumeratorQuantity` | 库存单位数量 |
| `stock_quantity` | `stock_quantity` | `stockQuantity` | 库存单位使用数量 |
| `must_loss_quantity` | `must_loss_quantity` | `mustLossQuantity` | 固定损耗 |
| `excess_send_scrap` | `excess_send_scrap` | `excessSendScrap` | 标准超额比例(%) |
| `excess_send_constant` | `excess_send_constant` | `excessSendConstant` | 固定超额量 |
| `cost_scrap` | `cost_scrap` | `costScrap` | 成本比例 |
| `purchase_proportion` | `purchase_proportion` | `purchaseProportion` | 采购金额占比% |
| `sales_proportion` | `sales_proportion` | `salesProportion` | 销售金额占比% |
| `net_demand_ratio` | `net_demand_ratio` | `netDemandRatio` | 净需求比例(%) |
| `scrap` | `scrap` | `scrap` | 损耗率% |
| `alternate_ratio` | `alternate_ratio` | `alternateRatio` | 替代比 |
| `numerator_quantity` | `numerator_quantity` | `numeratorQuantity` | 分子用量 |
| `denominator_quantity` | `denominator_quantity` | `denominatorQuantity` | 分母用量 |
| `quantity` | `quantity` | `quantity` | 主单位使用数量 |
| `ecn_line_no` | `ecn_line_no` | `ecnLineNo` | 工厂变更单行号 |
| `change_rate_den` | `change_rate_den` | `changeRateDen` | 换算率分母 |
| `change_rate_num` | `change_rate_num` | `changeRateNum` | 换算率分子 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bom_component_define_character` | `bom_component_define_character` | `bomAlternateDefineCharacter` | 自定义项特征属性组 |

### FreeCT (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bom_component_free_cts` | `bom_component_free_cts` | `bomAlternateFreeCts` | 替代料自由项特征组自定义项实体 |
| `bom_component_sensitive` | `bom_component_sensitive` | `bomAlternateSensitive` | 替代料BOM敏感域自定义项实体 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `effective_date` | `effective_date` | `effectiveDate` | 生效时间 |
| `expiry_date` | `expiry_date` | `expiryDate` | 失效时间 |

### other (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `bomAlternateAttrextItem` | 替代料表自由自定义项 |
| `` | `` | `bomAlternateUserdefItem` | 替代料表固定自定义项 |
