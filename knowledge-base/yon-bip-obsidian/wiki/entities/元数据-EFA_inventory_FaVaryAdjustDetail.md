---
tags: [BIP, 元数据, 数据字典, EFA.inventory.FaVaryAdjustDetail]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 盘点差异调整子表 (`EFA.inventory.FaVaryAdjustDetail`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`fa_bill_vary_adjust_detail` | domain：`yonbip-fi-efa` | 应用：`EFA` | 业务对象ID：`0e2b4e52-d1f7-4d01-821a-9223106ea401`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 盘点差异调整子表 |
| 物理表 | `fa_bill_vary_adjust_detail` |
| domain/服务域 | `yonbip-fi-efa` |
| schema | `fiefa` |
| 所属应用 | `EFA` |
| 直连字段 | 44 个 |
| 子表 | 2 个 |
| 关联引用 | 19 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `FaVaryAdjustBeAsgmtList` | `EFA.inventory.FaVaryAdjustBeAsgmt` | composition |
| `FaVaryAdjustAfAsgmtList` | `EFA.inventory.FaVaryAdjustAfAsgmt` | composition |

## 关联引用 (19个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `be_mgt_dept_id` | `ucf-org-center.org_unit_tree_ref` |
| `be_usage_state_id` | `yonbip-fi-efa.fa_usagestateref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `be_custodian` | `ucf-staff-center.bd_staff_all_ref` |
| `` | `` |
| `free_ch_id` | `` |
| `ytenant_id` | `` |
| `af_mgt_dept_id` | `ucf-org-center.org_unit_tree_ref` |
| `af_custodian` | `ucf-staff-center.bd_staff_all_ref` |
| `be_user_id` | `ucf-staff-center.bd_staff_all_ref` |
| `be_place_id` | `ucf-amc-ambd.ampub_location_ref` |
| `vart_adjust_id` | `` |
| `af_place_id` | `ucf-amc-ambd.ampub_location_ref` |
| `af_user_id` | `ucf-staff-center.bd_staff_all_ref` |
| `asset_id` | `yonbip-fi-efa.fa_assetsquery_basic_ref` |
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

> 共 44 个直连字段

### 文本字段 (17个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `adjust_type` | `adjust_type` | `adjustType` | 调整类型 |
| `ori_bill_id` | `ori_bill_id` | `oriBillId` | 源头单据ID |
| `ori_bill_no` | `ori_bill_no` | `oriBillNo` | 源头单据号 |
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
| `af_custodian` | `af_custodian` | `afCustodian` | 变动后保管人 |
| `af_mgt_dept_id` | `af_mgt_dept_id` | `afMgtDeptId` | 变动后管理部门 |
| `af_place_id` | `af_place_id` | `afPlaceId` | 变动后位置 |
| `af_usage_state_id` | `af_usage_state_id` | `afUsageStateId` | 变动后使用状态 |
| `af_user_id` | `af_user_id` | `afUserId` | 变动后使用人 |
| `asset_category_id` | `asset_category_id` | `assetCategoryId` | 固定资产类别 |
| `asset_id` | `asset_id` | `assetId` | 固定资产 |
| `be_custodian` | `be_custodian` | `beCustodian` | 变动前保管人 |
| `be_mgt_dept_id` | `be_mgt_dept_id` | `beMgtDeptId` | 变动前管理部门 |
| `be_place_id` | `be_place_id` | `bePlaceId` | 变动前位置 |
| `be_usage_state_id` | `be_usage_state_id` | `beUsageStateId` | 变动前使用状态 |
| `be_user_id` | `be_user_id` | `beUserId` | 变动前使用人 |
| `vart_adjust_id` | `vart_adjust_id` | `vartAdjustId` | 盘点差异调整 |
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
| `af_quantity` | `af_quantity` | `afQuantity` | 变动后数量 |
| `be_quantity` | `be_quantity` | `beQuantity` | 变动前数量 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### multiLanguage (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `af_location` | `af_location` | `afLocation` | 变动后存放地点 |
| `be_location` | `be_location` | `beLocation` | 变动前存放地点 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `free_ch_id` | `free_ch_id` | `freeChId` | 自定义项 |

### other (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `FaVaryAdjustBeAsgmtList` | 盘点差异调整单变动前分配信息 |
| `` | `` | `FaVaryAdjustAfAsgmtList` | 盘点差异调整单变动后分配信息 |
