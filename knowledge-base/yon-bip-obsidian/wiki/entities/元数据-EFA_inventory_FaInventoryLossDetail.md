---
tags: [BIP, 元数据, 数据字典, EFA.inventory.FaInventoryLossDetail]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 固定资产盘亏明细 (`EFA.inventory.FaInventoryLossDetail`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`fa_bill_inventory_loss_dtl` | domain：`yonbip-fi-efa` | 应用：`EFA` | 业务对象ID：`9a470a14-e6ed-41b3-9cdf-ce49ab5d79e3`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 固定资产盘亏明细 |
| 物理表 | `fa_bill_inventory_loss_dtl` |
| 数据库 schema | `yonbip-fi-efa` |
| 所属应用 | `EFA` |
| 直连字段 | 42 个 |
| 子表 | 2 个 |
| 关联引用 | 19 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `FaInventoryLossBeAsgmtList` | `EFA.inventory.FaInventoryLossBeAsgmt` | composition |
| `FaInventoryLossAfAsgmtList` | `EFA.inventory.FaInventoryLossAfAsgmt` | composition |

## 关联引用 (19个)

| 字段名 | 引用类型 |
|--------|---------|
| `fa_inventory_loss_id` | `` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `be_mgt_dept_id` | `ucf-org-center.org_unit_tree_ref` |
| `be_usage_state_id` | `yonbip-fi-efa.fa_usagestateref` |
| `af_custodian_id` | `ucf-staff-center.bd_staff_all_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `free_ch_id` | `` |
| `ytenant_id` | `` |
| `af_mgt_dept_id` | `ucf-org-center.org_unit_tree_ref` |
| `be_custodian_id` | `ucf-staff-center.bd_staff_all_ref` |
| `be_user_id` | `ucf-staff-center.bd_staff_all_ref` |
| `be_place_id` | `ucf-amc-ambd.ampub_location_ref` |
| `af_place_id` | `ucf-amc-ambd.ampub_location_ref` |
| `af_user_id` | `ucf-staff-center.bd_staff_all_ref` |
| `asset_id` | `yonbip-fi-efa.fa_assetsquery_basic_ref` |
| `` | `` |
| `asset_category_id` | `yonbip-fi-efa.fa_categorymainref` |
| `af_usage_state_id` | `yonbip-fi-efa.fa_usagestateref` |

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

> 共 42 个直连字段

### 文本字段 (14个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
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

### 引用字段 (16个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `af_custodian_id` | `af_custodian_id` | `afCustdianId` | 盘点后保管人 |
| `af_mgt_dept_id` | `af_mgt_dept_id` | `afMgtDeptId` | 盘点后管理部门 |
| `af_place_id` | `af_place_id` | `afPlaceId` | 盘点后位置 |
| `af_usage_state_id` | `af_usage_state_id` | `afUsageStateId` | 盘点后使用状态 |
| `af_user_id` | `af_user_id` | `afUserId` | 盘点后使用人 |
| `asset_category_id` | `asset_category_id` | `assetCategoryId` | 固定资产类别 |
| `asset_id` | `asset_id` | `assetId` | 固定资产id |
| `be_custodian_id` | `be_custodian_id` | `beCustdianId` | 盘点前保管人 |
| `be_mgt_dept_id` | `be_mgt_dept_id` | `beMgtDeptId` | 盘点前管理部门 |
| `be_place_id` | `be_place_id` | `bePlaceId` | 盘点前位置 |
| `be_usage_state_id` | `be_usage_state_id` | `beUsageStateId` | 盘点前使用状态 |
| `be_user_id` | `be_user_id` | `beUserId` | 盘点前使用人 |
| `fa_inventory_loss_id` | `fa_inventory_loss_id` | `faInventoryLossId` | 固定资产盘亏 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
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

### 数值字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `af_quantity` | `af_quantity` | `afQuantity` | 盘点后数量 |
| `be_quantity` | `be_quantity` | `beQuantity` | 盘点前数量 |

### multiLanguage (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `af_location` | `af_location` | `afLocation` | 盘点后存放地点 |
| `asset_name` | `asset_name` | `assetName` | 固定资产名称 |
| `be_location` | `be_location` | `beLocation` | 盘点前存放地点 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `free_ch_id` | `free_ch_id` | `freeChId` | 自定义项 |

### other (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `FaInventoryLossBeAsgmtList` | 固定资产盘亏变动前分配信息 |
| `` | `` | `FaInventoryLossAfAsgmtList` | 固定资产盘亏变动后分配信息 |
