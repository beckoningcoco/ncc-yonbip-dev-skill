---
tags: [BIP, 元数据, 数据字典, efa1010.efa1010.InitiationBill]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 固定资产期初 (`efa1010.efa1010.InitiationBill`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`fa_bill_add` | domain：`yonbip-fi-efa` | 应用：`EFA` | 业务对象ID：`3262b35f-d7e9-4450-85b9-0dd49a812c06`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 固定资产期初 |
| 物理表 | `fa_bill_add` |
| domain/服务域 | `yonbip-fi-efa` |
| schema | `fiefa` |
| 所属应用 | `EFA` |
| 直连字段 | 68 个 |
| 子表 | 9 个 |
| 关联引用 | 30 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `leases` | `efa1010.efa1010.InitiationLease` | composition |
| `costrecords` | `efa1010.efa1010.InitiationCostRecord` | composition |
| `assignments` | `efa1010.efa1010.InitiationAssignment` | composition |
| `sources` | `efa1010.efa1010.InitiationSource` | composition |
| `devices` | `efa1010.efa1010.InitiationAccessoryDevice` | composition |
| `bodies` | `efa1010.efa1010.InitiationCalculateInfo` | composition |
| `interestdetails` | `efa1010.efa1010.InitiationInterestDetail` | composition |
| `paymentplans` | `efa1010.efa1010.InitiationPaymentPlan` | composition |
| `paymentrules` | `efa1010.efa1010.InitiationPaymentRule` | composition |

## 关联引用 (30个)

| 字段名 | 引用类型 |
|--------|---------|
| `mgt_profit_center_id` | `finbd.bd_allaccbodyref_inner` |
| `asset_sub_cat_id` | `yonbip-fi-efa.fa_subcategoryref` |
| `` | `` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `place_id` | `ucf-amc-ambd.ampub_location_ref` |
| `vendor_id` | `yssupplier.aa_vendor` |
| `accentity_id` | `finbd.bd_allaccbodyref` |
| `add_way_id` | `yonbip-fi-efa.at_addwayref` |
| `asset_id` | `yonbip-fi-efa.fa_assetsquery_basic_ref` |
| `unit_id` | `productcenter.pc_unitref` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `custodian_id` | `iuap-ptc-yoncmm.sattUuser` |
| `auditor` | `bip-usercenter.bip_user_ref` |
| `free_ch_id` | `` |
| `ytenant_id` | `` |
| `user_id` | `iuap-ptc-yoncmm.sattUuser` |
| `mgt_dept_id` | `ucf-org-center.org_unit_tree_ref` |
| `usage_state_id` | `yonbip-fi-efa.fa_usagestateref` |
| `asset_category_id` | `yonbip-fi-efa.fa_categorytree_ref` |
| `impairment_unit_id` | `yonbip-fi-efa.fa_impairmentunit_ref` |
| `ori_currtype_id` | `ucfbasedoc.bd_currencytenantref` |
| `mgt_cost_center_id` | `finbd.bd_costcenterref` |

## 继承接口 (3个, 7字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`
- **编码** (`iuap.busiObj.Code`)
  - `code` → `code`
- **审批流接口** (`iuap.busiObj.ApprovalFlowItf`)
  - `auditnote` → `auditnote`
  - `auditor` → `auditor`
  - `audit_time` → `audit_time`
  - `procinst_id` → `procinst_id`
  - `verifystate` → `verifystate`

## 字段列表（按类型分组）

> 共 68 个直连字段

### 文本字段 (21个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `asset_code` | `asset_code` | `assetCode` | 固定资产卡片编码 |
| `bill_trade_type_id` | `bill_trade_type_id` | `billTradeTypeId` | 交易类型 |
| `bill_type_id` | `bill_type_id` | `billTypeId` | 单据类型 |
| `busi_post_failure_reason` | `busi_post_failure_reason` | `busiPostFailureReason` | 过账失败原因 |
| `busi_post_status` | `busi_post_status` | `busiPostStatus` | 过账状态 |
| `ori_app_id` | `ori_app_id` | `oriAppId` | 源头应用ID |
| `ori_bill_id` | `ori_bill_id` | `oriBillId` | 源头单据ID |
| `ori_bill_no` | `ori_bill_no` | `oriBillNo` | 源头单据号 |
| `ori_bill_trade_type_id` | `ori_bill_trade_type_id` | `oriBillTradeTypeId` | 源头交易类型 |
| `ori_bill_type_id` | `ori_bill_type_id` | `oriBillTypeId` | 源头单据类型ID |
| `tag_rfid` | `tag_rfid` | `tagRfid` | 射频电子标签RFID |
| `bill_date` | `bill_date` | `vouchdate` | 单据日期,格式:yyyy-MM-dd |
| `auditnote` | `auditnote` | `auditNote` | 审批批语 |
| `begin_date` | `begin_date` | `beginTime` | 固定资产开始使用日期 |
| `code` | `code` | `code` | 编码 |
| `id` | `id` | `id` | 主键 |
| `procinst_id` | `procinst_id` | `procinstId` | 流程实例ID |
| `src_bill_no_combine` | `src_bill_no_combine` | `srcBillNoCombine` | 来源单据号 |
| `src_create_type` | `src_create_type` | `srcCreateType` | 来源建卡方式 |
| `src_project_id_combine` | `src_project_id_combine` | `srcProjectIdCombine` | 来源项目 |
| `tag_no` | `tag_no` | `tagno` | 标签号 |

### 引用字段 (20个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `asset_id` | `asset_id` | `assetId` | 固定资产卡片ID |
| `creator` | `creator` | `creator` | 创建人 |
| `unit_id` | `unit_id` | `unitId` | 计量单位 |
| `accentity_id` | `accentity_id` | `accentity` | 会计主体 |
| `add_way_id` | `add_way_id` | `addWayId` | 固定资产增加方式 |
| `asset_category_id` | `asset_category_id` | `assetCategoryId` | 固定资产类别 |
| `asset_sub_cat_id` | `asset_sub_cat_id` | `assetSubcategoryId` | 固定资产子类别 |
| `auditor` | `auditor` | `auditor` | 审批人 |
| `custodian_id` | `custodian_id` | `custodian` | 保管人 |
| `impairment_unit_id` | `impairment_unit_id` | `impairmentunitId` | 减值单元 |
| `mgt_cost_center_id` | `mgt_cost_center_id` | `mgmtCostCenterId` | 管理成本中心 |
| `mgt_dept_id` | `mgt_dept_id` | `mgmtDeptId` | 管理部门 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ori_currtype_id` | `ori_currtype_id` | `oriCurrtypeId` | 原币币种 |
| `place_id` | `place_id` | `placeId` | 位置 |
| `mgt_profit_center_id` | `mgt_profit_center_id` | `profitCenterId` | 管理利润中心 |
| `usage_state_id` | `usage_state_id` | `usageStateId` | 固定资产使用状态 |
| `user_id` | `user_id` | `userId` | 使用人 |
| `vendor_id` | `vendor_id` | `vendorId` | 供应商 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_time` | `audit_time` | `auditTime` | 审批日期 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 布尔字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bln_lease` | `bln_lease` | `blnLease` | 使用权资产 |
| `bln_pre_add` | `bln_pre_add` | `blnPreAdd` | 是否预建 |
| `bln_tax_accelerated_depr` | `bln_tax_accelerated_depr` | `blnTaxAcceleratedDepr` | 税收加速折旧标识 |

### 枚举字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `verifystate` | `verifystate` | `verifyState` | 单据状态 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `quantity` | `quantity` | `quantity` | 数量 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `busi_post_version` | `busi_post_version` | `busiPostVersion` | 业务过账版本 |
| `tpl_id` | `tpl_id` | `tplId` | 模板ID |

### 数值字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ori_currtype_ori_amount` | `ori_currtype_ori_amount` | `fcOriValue` | 原币原值 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `free_ch_id` | `free_ch_id` | `freeChId` | 自定义项 |

### multiLanguage (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `asset_model` | `asset_model` | `assetModel` | 固定资产型号 |
| `location` | `location` | `location` | 固定资产存放地点 |
| `name` | `name` | `name` | 名称 |
| `specification` | `specification` | `specification` | 固定资产规格 |

### other (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `bodies` | 期初单核算信息 |
| `` | `` | `leases` | 期初单租赁信息 |
| `` | `` | `interestdetails` | 期初单利息明细 |
| `` | `` | `paymentplans` | 期初单付款计划 |
| `` | `` | `paymentrules` | 期初单付款规则 |
| `` | `` | `devices` | 期初单附属设备 |
| `` | `` | `costrecords` | 期初单费用记录 |
| `` | `` | `assignments` | 期初单分配信息 |
| `` | `` | `sources` | 期初单来源信息 |
