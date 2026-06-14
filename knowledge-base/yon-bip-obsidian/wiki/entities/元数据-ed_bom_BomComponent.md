---
tags: [BIP, 元数据, 数据字典, ed.bom.BomComponent]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 子件信息 (`ed.bom.BomComponent`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`ed_bom_component` | domain：`engineeringdata` | 应用：`ED` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 子件信息 |
| 物理表 | `ed_bom_component` |
| domain/服务域 | `engineeringdata` |
| 所属应用 | `ED` |
| 直连字段 | 101 个 |
| 子表 | 4 个 |
| 关联引用 | 21 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `bomComponentUserdefItem` | `ed.bom.BomComponentUserdefItem` | composition |
| `bomComponentAttrextItem` | `ed.bom.BomComponentAttrextItem` | composition |
| `bomComponentStepLoss` | `ed.bom.BomComponentStepLoss` | composition |
| `bomAlternate` | `ed.bom.BomAlternate` | composition |

## 关联引用 (21个)

| 字段名 | 引用类型 |
|--------|---------|
| `bom_reference_point` | `` |
| `` | `` |
| `bom_id` | `` |
| `bom_component_sensitive` | `` |
| `product_id` | `engineeringdata.ed_bom_ref` |
| `ytenant_id` | `` |
| `alternateplan_id` | `engineeringdata.ed_alternate_plan_ref` |
| `bom_component_id` | `` |
| `department_id` | `` |
| `org_id` | `ucf-org-center.bd_factoryorg` |
| `stock_unit_id` | `productcenter.pc_productassitunitsref` |
| `bom_unit_id` | `` |
| `warehouse_id` | `productcenter.aa_warehouse_stocksref` |
| `bom_component_free_cts` | `` |
| `bom_component_define_character` | `` |
| `stock_org_id` | `ucf-org-center.bd_inventoryorg` |
| `sku_id` | `productcenter.productskuref` |
| `tenant_id` | `` |

## 继承接口 (1个, 1字段)

- **逻辑删除相关** (`ucfbase.ucfbaseItf.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 101 个直连字段

### 文本字段 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `designator` | `designator` | `designator` | 位置号 |
| `preferred_group_no` | `preferred_group_no` | `preferredGroupNo` | 优选组号 |
| `material_group_no` | `material_group_no` | `materialGroupNo` | 替代料组号 |
| `erpcode` | `erpcode` | `erpCode` | erpCode |
| `sensitive_uid` | `sensitive_uid` | `sensitiveUID` | BOM敏感域唯一性ID |
| `substitute_flag` | `substitute_flag` | `substituteFlag` | 替代标识 |
| `remark` | `remark` | `remark` | 备注 |
| `engineering_draw_number` | `engineering_draw_number` | `engineeringDrawNumber` | 工程图号 |
| `whole_group_code` | `whole_group_code` | `wholeGroupCode` | 成套发料组号 |
| `chinese_name` | `chinese_name` | `chineseName` | 中文名称 |
| `ecn_order_code` | `ecn_order_code` | `ecnOrderCode` | 工程变更单据号 |

### 引用字段 (14个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bom_reference_point` | `bom_reference_point` | `bomReferencePoint` | 传输点 |
| `bom_unit_id` | `bom_unit_id` | `bomUnit` | 主计量单位 |
| `bom_id` | `bom_id` | `bomId` | 所属母件 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `bom_component_id` | `bom_component_id` | `bomComponentId` | 关联材料 |
| `product_id` | `product_id` | `productId` | 物料id |
| `stock_unit_id` | `stock_unit_id` | `stockUnit` | 库存单位 |
| `sku_id` | `sku_id` | `skuId` | 子件SKUid |
| `org_id` | `org_id` | `orgId` | 工厂id |
| `warehouse_id` | `warehouse_id` | `warehouseId` | 仓库id |
| `stock_org_id` | `stock_org_id` | `stockOrgId` | 库存组织id |
| `alternateplan_id` | `alternateplan_id` | `alternateplanId` | 替代方案Id |
| `department_id` | `department_id` | `departmentId` | 部门 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |

### 枚举字段 (22个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `standard` | `standard` | `standard` | 标准件 |
| `main_material` | `main_material` | `mainMaterial` | 主料 |
| `entrust_supply_type` | `entrust_supply_type` | `entrustSupplyType` | 受托加工供应方式 |
| `quantity_can_change` | `quantity_can_change` | `quantityCanChange` | 数量可改 |
| `same_group_must_select` | `same_group_must_select` | `sameGroupMustSelect` | 同组必选 |
| `same_group_first_select` | `same_group_first_select` | `sameGroupFirstSelect` | 同组首选 |
| `same_group_mutex` | `same_group_mutex` | `sameGroupMutex` | 同组互斥 |
| `key_component` | `key_component` | `keyComponent` | 关键子件 |
| `line_type` | `line_type` | `lineType` | 行类型 |
| `vendor_drop_shipment` | `vendor_drop_shipment` | `vendorDropShipment` | 供应商直运 |
| `key_material_group` | `key_material_group` | `keyMaterialGroup` | 成组关键料 |
| `component_type` | `component_type` | `componentType` | 材料类型 |
| `partake_simulation` | `partake_simulation` | `partakeSimulation` | 参与模拟 |
| `is_virtual` | `is_virtual` | `isVirtual` | 虚拟件 |
| `usage_type` | `usage_type` | `usageType` | 用量类型 |
| `loss_type` | `loss_type` | `lossType` | 损耗类型 |
| `trunc_up` | `trunc_up` | `truncUp` | 向上取整 |
| `entrust_type` | `entrust_type` | `entrustType` | 委外供应方式 |
| `whole_flag` | `whole_flag` | `wholeFlag` | 齐套 |
| `whole_point` | `whole_point` | `wholePoint` | 齐套检查点 |
| `alternate_type` | `alternate_type` | `alternateType` | 替代方式 |
| `calc_cost_flag` | `calc_cost_flag` | `calcCostFlag` | 计算成本 |

### 整数 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `replace_type` | `replace_type` | `replaceType` | 取代 |
| `supply_type` | `supply_type` | `supplyType` | 发料方式 |
| `advance_days` | `advance_days` | `advanceDays` | 提前期偏置(天) |
| `point_days` | `point_days` | `pointDays` | 置(天) |
| `rowno` | `rowno` | `rowno` | 行号 |
| `owner_type` | `owner_type` | `ownerType` | 货主类型 |

### 短整数 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `change_type` | `change_type` | `changeType` | 换算方式 |
| `fixed_quantity` | `fixed_quantity` | `fixedQuantity` | 固定用量 |
| `is_ratio_alternate` | `is_ratio_alternate` | `isRatioAlternate` | 按比例替代 |
| `po_start_point` | `po_start_point` | `poStartPoint` | 订单开工 |
| `po_complete_point` | `po_complete_point` | `poCompletePoint` | 订单完工 |
| `operation_start_point` | `operation_start_point` | `operationStartPoint` | 工序开工 |
| `operation_complete_point` | `operation_complete_point` | `operationCompletePoint` | 工序完工 |
| `mix_flag` | `mix_flag` | `mixFlag` | 混批 |
| `excess_send_flag` | `excess_send_flag` | `excessSendFlag` | 超额发料 |
| `excess_send_type` | `excess_send_type` | `excessTendType` | 超额类型 |
| `dr` | `dr` | `dr` | 逻辑删除标记 |

### 长整数 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `allocation_source_id` | `allocation_source_id` | `allocationSourceId` | 分配来源Id |
| `sequence` | `sequence` | `sequence` | 替代次序 |
| `original_id` | `original_id` | `originalId` | 修订源 |
| `id` | `id` | `id` | 子件信息表关联标识 |
| `material_id` | `material_id` | `materialId` | 子件id |
| `ecn_order_id` | `ecn_order_id` | `ecnOrderId` | 工程变更单id |
| `ecn_order_detail_id` | `ecn_order_detail_id` | `ecnOrderDetailId` | 变更明细id  |

### 数值字段 (20个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `change_rate` | `change_rate` | `changeRate` | 换算率 |
| `alternate_denominator` | `alternate_denominator` | `alternateDenominator` | 替代比分母 |
| `net_demand_ratio` | `net_demand_ratio` | `netDemandRatio` | 净需求比例(%) |
| `alternate_ratio` | `alternate_ratio` | `alternateRatio` | 替代比分子 |
| `line_no` | `line_no` | `lineNo` | 行号 |
| `purchase_proportion` | `purchase_proportion` | `purchaseProportion` | 采购金额占比% |
| `sales_proportion` | `sales_proportion` | `salesProportion` | 销售金额占比% |
| `stock_numerator_quantity` | `stock_numerator_quantity` | `stockNumeratorQuantity` | 库存单位数量 |
| `stock_quantity` | `stock_quantity` | `stockQuantity` | 库存单位使用数量 |
| `scrap` | `scrap` | `scrap` | 损耗率(%) |
| `numerator_quantity` | `numerator_quantity` | `numeratorQuantity` | 子件数量 |
| `denominator_quantity` | `denominator_quantity` | `denominatorQuantity` | 母件底数 |
| `quantity` | `quantity` | `quantity` | 使用数量 |
| `must_loss_quantity` | `must_loss_quantity` | `mustLossQuantity` | 固定损耗 |
| `cost_scrap` | `cost_scrap` | `costScrap` | 成本比例 |
| `excess_send_scrap` | `excess_send_scrap` | `excessSendScrap` | 标准超额比例(%) |
| `ecn_line_no` | `ecn_line_no` | `ecnLineNo` | 工厂变更单行号 |
| `excess_send_constant` | `excess_send_constant` | `excessSendConstant` | 固定超额量 |
| `change_rate_den` | `change_rate_den` | `changeRateDen` | 换算率分母 |
| `change_rate_num` | `change_rate_num` | `changeRateNum` | 换算率分子 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bom_component_define_character` | `bom_component_define_character` | `bomComponentDefineCharacter` | 自定义项特征属性组 |

### FreeCT (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bom_component_sensitive` | `bom_component_sensitive` | `bomComponentSensitive` | 子件BOM敏感域自定义项实体 |
| `bom_component_free_cts` | `bom_component_free_cts` | `bomComponentFreeCts` | 子件自由项特征组自定义项实体 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `effective_date` | `effective_date` | `effectiveDate` | 生效时间 |
| `expiry_date` | `expiry_date` | `expiryDate` | 失效时间 |

### other (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `bomAlternate` | BOM子件替代料 |
| `` | `` | `bomComponentAttrextItem` | 子件表自由自定义项 |
| `` | `` | `bomComponentStepLoss` | 子件阶梯损耗 |
| `` | `` | `bomComponentUserdefItem` | 子件表固定自定义项 |
