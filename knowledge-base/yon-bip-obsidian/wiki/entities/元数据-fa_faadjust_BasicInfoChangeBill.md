---
tags: [BIP, 元数据, 数据字典, fa.faadjust.BasicInfoChangeBill]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 基本信息变动 (`fa.faadjust.BasicInfoChangeBill`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`fa_bill_adjust_base` | domain：`yonbip-fi-efa` | 应用：`EFA` | 业务对象ID：`a266051f-9c1a-469b-96c6-0864eee033db`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 基本信息变动 |
| 物理表 | `fa_bill_adjust_base` |
| 数据库 schema | `yonbip-fi-efa` |
| 所属应用 | `EFA` |
| 直连字段 | 49 个 |
| 子表 | 2 个 |
| 关联引用 | 23 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `sources` | `fa.faadjust.SourceChangeBill` | composition |
| `bodies` | `fa.faadjust.CalcInfoChangeBill` | composition |

## 关联引用 (23个)

| 字段名 | 引用类型 |
|--------|---------|
| `mgt_profit_center_id` | `finbd.bd_allaccbodyref_inner` |
| `asset_sub_cat_id` | `yonbip-fi-efa.fa_subcategoryref` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `adjust_bill_id` | `` |
| `custodian_id` | `iuap-ptc-yoncmm.sattUuser` |
| `` | `` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `place_id` | `ucf-amc-ambd.ampub_location_ref` |
| `vendor_id` | `yssupplier.aa_vendor` |
| `free_ch_id` | `` |
| `ytenant_id` | `` |
| `accentity_id` | `finbd.bd_allaccbodyref` |
| `user_id` | `iuap-ptc-yoncmm.sattUuser` |
| `mgt_dept_id` | `ucf-org-center.org_unit_tree_ref` |
| `usage_state_id` | `yonbip-fi-efa.fa_usagestateref` |
| `add_way_id` | `yonbip-fi-efa.at_addwayref` |
| `asset_id` | `yonbip-fi-efa.fa_assetsquery_basic_ref` |
| `asset_category_id` | `yonbip-fi-efa.fa_categorytree_ref` |
| `impairment_unit_id` | `yonbip-fi-efa.fa_impairmentunit_ref` |
| `ori_currtype_id` | `ucfbasedoc.bd_currencytenantref` |
| `unit_id` | `productcenter.pc_unitref` |
| `mgt_cost_center_id` | `finbd.bd_costcenterref` |

## 继承接口 (1个, 1字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 49 个直连字段

### 文本字段 (12个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `adjust_accbook_list` | `adjust_accbook_list` | `adjustAccBook` | 调整账簿列表 |
| `adjust_content` | `adjust_content` | `adjustContent` | 调整信息 |
| `cost_adjust_acc_book` | `cost_adjust_acc_book` | `costAdjustAccBook` | 专项成本调整账簿 |
| `direction` | `direction` | `direction` | 方向 |
| `snaphot_id` | `snaphot_id` | `snaphotId` | 基本信息快照id |
| `tag_no` | `tag_no` | `tagno` | 标签号 |
| `begin_date` | `begin_date` | `beginTime` | 开始使用时间 |
| `src_create_type` | `src_create_type` | `srcCreateType` | 来源建卡方式 |
| `src_bill_no_combine` | `src_bill_no_combine` | `srcBillNoCombine` | 来源单据号 |
| `src_project_id_combine` | `src_project_id_combine` | `srcProjectIdCombine` | 来源项目 |
| `code` | `code` | `code` | 固定资产编码 |
| `id` | `id` | `id` | 卡片主表ID |

### 引用字段 (20个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `adjust_bill_id` | `adjust_bill_id` | `adjustId` | 资产调整 |
| `asset_id` | `asset_id` | `assetId` | 固定资产 |
| `accentity_id` | `accentity_id` | `accentity` | 会计主体 |
| `asset_category_id` | `asset_category_id` | `assetCategoryId` | 固定资产类别 |
| `asset_sub_cat_id` | `asset_sub_cat_id` | `assetSubcategoryId` | 固定资产子类别 |
| `add_way_id` | `add_way_id` | `addWayId` | 固定资产增加方式 |
| `usage_state_id` | `usage_state_id` | `usageStateId` | 固定资产使用状态 |
| `user_id` | `user_id` | `userId` | 使用人 |
| `mgt_dept_id` | `mgt_dept_id` | `mgmtDeptId` | 管理部门 |
| `mgt_cost_center_id` | `mgt_cost_center_id` | `mgmtCostCenterId` | 管理成本中心 |
| `mgt_profit_center_id` | `mgt_profit_center_id` | `profitCenterId` | 管理利润中心 |
| `custodian_id` | `custodian_id` | `custodian` | 保管人 |
| `place_id` | `place_id` | `placeId` | 位置 |
| `vendor_id` | `vendor_id` | `vendorId` | 供应商 |
| `unit_id` | `unit_id` | `unitId` | 计量单位 |
| `ori_currtype_id` | `ori_currtype_id` | `oriCurrtypeId` | 原币币种 |
| `impairment_unit_id` | `impairment_unit_id` | `impairmentunitId` | 减值单元 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 布尔字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bln_lease` | `bln_lease` | `blnLease` | 使用权资产 |
| `bln_tax_accelerated_depr` | `bln_tax_accelerated_depr` | `blnTaxAcceleratedDepr` | 税收加速折旧标识 |
| `bln_pre_add` | `bln_pre_add` | `blnPreAdd` | 是否预建 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `quantity` | `quantity` | `quantity` | 数量 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ori_currtype_ori_amount` | `ori_currtype_ori_amount` | `fcOriValue` | 原币原值 |

### multipleOption (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `adjust_type` | `adjust_type` | `adjustType` | 调整类型 |

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

### other (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `sources` | 来源信息变动 |
| `` | `` | `bodies` | 核算信息变动 |
