---
tags: [BIP, 元数据, 数据字典, EFA.inventory.FaInventoryDetail]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 固定资产盘点详情 (`EFA.inventory.FaInventoryDetail`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`fa_bill_inventory_dtl` | domain：`yonbip-fi-efa` | 应用：`EFA` | 业务对象ID：`ed522121-30a8-437e-ad5d-815180f16dae`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 固定资产盘点详情 |
| 物理表 | `fa_bill_inventory_dtl` |
| 数据库 schema | `yonbip-fi-efa` |
| 所属应用 | `EFA` |
| 直连字段 | 53 个 |
| 子表 | 2 个 |
| 关联引用 | 23 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `FaInventoryAfAsgmtList` | `EFA.inventory.FaInventoryAfAsgmt` | composition |
| `FaInventoryBeAsgmtList` | `EFA.inventory.FaInventoryBeAsgmt` | composition |

## 关联引用 (23个)

| 字段名 | 引用类型 |
|--------|---------|
| `fa_inventory_id` | `` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `plan_inventory_user_id` | `bd_staff_all_ref` |
| `inventory_user_id` | `bd_staff_all_ref` |
| `be_usage_state_id` | `yonbip-fi-efa.fa_usagestateref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `af_custodian_id` | `ucf-staff-center.bd_staff_all_ref` |
| `af_mgmt_dept_id` | `ucf-org-center.org_unit_tree_ref` |
| `vendor_id` | `yssupplier.aa_vendor` |
| `` | `` |
| `free_ch_id` | `` |
| `ytenant_id` | `` |
| `be_user_id` | `ucf-staff-center.bd_staff_all_ref` |
| `be_place_id` | `ucf-amc-ambd.ampub_location_ref` |
| `af_place_id` | `ucf-amc-ambd.ampub_location_ref` |
| `af_user_id` | `ucf-staff-center.bd_staff_all_ref` |
| `asset_id` | `yonbip-fi-efa.fa_assetsquery_basic_ref` |
| `asset_category_id` | `yonbip-fi-efa.fa_categorymainref` |
| `be_custodian_id` | `ucf-staff-center.bd_staff_all_ref` |
| `af_usage_state_id` | `yonbip-fi-efa.fa_usagestateref` |
| `supervisor` | `bd_staff_all_ref` |
| `be_mgmt_dept_id` | `ucf-org-center.org_unit_tree_ref` |

## 继承接口 (5个, 19字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **业务流多来源** (`iuap.busiObj.BusinessFlowSourcesItf`)
  - `firstbusiobj` → `firstbusiobj`
  - `firstchild_id` → `firstchild_id`
  - `firstcode` → `firstcode`
  - `first_id` → `first_id`
  - `sourcegrand_id` → `sourcegrand_id`
- **业务流基础** (`iuap.busiObj.BusinessFlowItf`)
  - `bizflow_id` → `bizflow_id`
  - `bizflowinstance_id` → `bizflowinstance_id`
  - `bizflow_makebillcode` → `bizflow_makebillcode`
  - `bizflowname` → `bizflowname`
  - `sourcebusiobj` → `sourcebusiobj`
  - `sourcechild_id` → `sourcechild_id`
  - `sourcecode` → `sourcecode`
  - `source_id` → `source_id`
- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`

## 字段列表（按类型分组）

> 共 53 个直连字段

### 文本字段 (18个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `inventory_date` | `inventory_date` | `inventoryDate` | 盘点日期 |
| `inventory_result` | `inventory_result` | `inventoryResult` | 盘点结果 |
| `supervision_result` | `supervision_result` | `supervisionResult` | 监盘结果 |
| `tagno` | `tagno` | `tagno` | 标签号 |
| `bizflowinstance_id` | `bizflowinstance_id` | `bizFlowInstanceId` | 业务流实例id |
| `bizflow_makebillcode` | `bizflow_makebillcode` | `bizFlowMakeBillCode` | 单据转换规则编码 |
| `bizflow_id` | `bizflow_id` | `bizflowId` | 业务流id |
| `bizflowname` | `bizflowname` | `bizflowName` | 流程名称 |
| `firstbusiobj` | `firstbusiobj` | `firstBusiObj` | 来源业务对象 |
| `firstchild_id` | `firstchild_id` | `firstChildId` | 来源单据子表id |
| `firstcode` | `firstcode` | `firstCode` | 来源单据号 |
| `first_id` | `first_id` | `firstId` | 来源单据主表id |
| `id` | `id` | `id` | 主键 |
| `sourcebusiobj` | `sourcebusiobj` | `sourceBusiObj` | 上游业务对象 |
| `sourcechild_id` | `sourcechild_id` | `sourceChildId` | 上游单据子表id |
| `sourcecode` | `sourcecode` | `sourceCode` | 上游单据号 |
| `sourcegrand_id` | `sourcegrand_id` | `sourceGrandId` | 来源孙表id |
| `source_id` | `source_id` | `sourceId` | 上游单据主表id |

### 引用字段 (20个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `af_custodian_id` | `af_custodian_id` | `afCustodianId` | 盘点后保管人 |
| `af_mgmt_dept_id` | `af_mgmt_dept_id` | `afMgmtDeptId` | 盘点后管理部门 |
| `af_place_id` | `af_place_id` | `afPlaceId` | 盘点后位置 |
| `af_usage_state_id` | `af_usage_state_id` | `afUsageStateId` | 盘点后使用状态 |
| `af_user_id` | `af_user_id` | `afUserId` | 盘点后使用人 |
| `asset_category_id` | `asset_category_id` | `assetCategoryId` | 固定资产类别 |
| `asset_id` | `asset_id` | `assetId` | 固定资产id |
| `be_custodian_id` | `be_custodian_id` | `beCustodianId` | 盘点前保管人 |
| `be_mgmt_dept_id` | `be_mgmt_dept_id` | `beMgmtDeptId` | 盘点前管理部门 |
| `be_place_id` | `be_place_id` | `bePlaceId` | 盘点前位置 |
| `be_usage_state_id` | `be_usage_state_id` | `beUsageStateId` | 盘点前使用状态 |
| `be_user_id` | `be_user_id` | `beUserId` | 盘点前使用人 |
| `fa_inventory_id` | `fa_inventory_id` | `faInventoryId` | 固定资产盘点 |
| `inventory_user_id` | `inventory_user_id` | `inventoryUserId` | 盘点人 |
| `plan_inventory_user_id` | `plan_inventory_user_id` | `planInventoryUserId` | 计划盘点人 |
| `supervisor` | `supervisor` | `supervisor` | 监盘人 |
| `vendor_id` | `vendor_id` | `vendorId` | 供应商 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `af_quantity` | `af_quantity` | `afQuantity` | 盘点后数量 |
| `be_quantity` | `be_quantity` | `beQuantity` | 盘点前数量 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### multiLanguage (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `af_location` | `af_location` | `afLocation` | 盘点后存放地点 |
| `asset_model` | `asset_model` | `assetModel` | 型号 |
| `asset_name` | `asset_name` | `assetName` | 固定资产名称 |
| `be_location` | `be_location` | `beLocation` | 盘点前存放地点 |
| `specification` | `specification` | `specification` | 规格 |

### attachment (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `annex` | `annex` | `fileCount` | 附件 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `free_ch_id` | `free_ch_id` | `freeChId` | 自定义项 |

### other (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `FaInventoryBeAsgmtList` | 固定资产盘点前分配信息 |
| `` | `` | `FaInventoryAfAsgmtList` | 固定资产盘点后分配信息 |
