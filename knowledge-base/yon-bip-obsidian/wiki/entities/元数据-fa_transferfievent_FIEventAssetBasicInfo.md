---
tags: [BIP, 元数据, 数据字典, fa.transferfievent.FIEventAssetBasicInfo]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 卡片基本信息 (`fa.transferfievent.FIEventAssetBasicInfo`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`fa_ledger_b_base` | domain：`yonbip-fi-efa` | 应用：`EFA` | 业务对象ID：`9a9f8733-e495-4106-af7d-06e5ff48af94`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 卡片基本信息 |
| 物理表 | `fa_ledger_b_base` |
| 数据库 schema | `yonbip-fi-efa` |
| 所属应用 | `EFA` |
| 直连字段 | 49 个 |
| 子表 | 2 个 |
| 关联引用 | 22 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `eventAssetCalcInfoBodies` | `fa.transferfievent.FIEventAssetCalcInfo` | composition |
| `FIEventAssetLeaseInfoList` | `fa.transferfievent.FIEventAssetLeaseInfo` | composition |

## 关联引用 (22个)

| 字段名 | 引用类型 |
|--------|---------|
| `mgt_profit_center_id` | `finbd.bd_allaccbodyref_inner` |
| `asset_card_category_id` | `yonbip-fi-efa.fa_categorytree_ref` |
| `asset_sub_cat_id` | `yonbip-fi-efa.fa_subcategoryref` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `custodian_id` | `iuap-ptc-yoncmm.sattUuser` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `place_id` | `ucf-amc-ambd.ampub_location_ref` |
| `vendor_id` | `yssupplier.aa_vendor` |
| `free_ch_id` | `` |
| `ytenant_id` | `` |
| `in_accentity_id` | `finbd.bd_allaccbodyref_all` |
| `user_id` | `iuap-ptc-yoncmm.sattUuser` |
| `` | `` |
| `mgt_dept_id` | `ucf-org-center.org_unit_tree_ref` |
| `usage_state_id` | `yonbip-fi-efa.fa_usagestateref` |
| `event_master_id` | `` |
| `add_way_id` | `yonbip-fi-efa.at_addwayref` |
| `asset_category_id` | `yonbip-fi-efa.fa_categorytree_ref` |
| `impairmentunit_id` | `yonbip-fi-efa.fa_impairmentunit_ref` |
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
| `adjust_type` | `adjust_type` | `adjustType` | 变动类型 |
| `acc_year_code` | `acc_year_code` | `accYearCode` | 会计年编码 |
| `accbook_id` | `accbook_id` | `accbook` | 账簿ID |
| `accentity_id` | `accentity_id` | `accentity` | 会计主体ID |
| `begin_date` | `begin_date` | `beginDate` | 固定资产开始使用日期 |
| `direction` | `direction` | `direction` | 方向 |
| `header_id` | `header_id` | `headerId` | 主表ID |
| `id` | `id` | `id` | 主键 |
| `ori_currtype_id` | `ori_currtype_id` | `oriCurrtypeId` | 原币币种 |
| `acc_period_code` | `acc_period_code` | `period` | 会计期间编码 |
| `src_create_type` | `src_create_type` | `srcCreateType` | 建卡方式 |
| `tag_no` | `tag_no` | `tagno` | 标签号 |

### 引用字段 (19个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `event_master_id` | `event_master_id` | `eventMasterId` | 财务事务主表ID |
| `add_way_id` | `add_way_id` | `addWayId` | 增加方式 |
| `asset_card_category_id` | `asset_card_category_id` | `assetCardCategoryId` | 固定资产卡片实时类别 |
| `asset_category_id` | `asset_category_id` | `assetCategoryId` | 固定资产类别 |
| `asset_sub_cat_id` | `asset_sub_cat_id` | `assetSubcategoryId` | 固定资产子类别 |
| `creator` | `creator` | `creator` | 创建人 |
| `custodian_id` | `custodian_id` | `custodian` | 保管人 |
| `impairmentunit_id` | `impairmentunit_id` | `impairmentunitId` | 减值单元 |
| `in_accentity_id` | `in_accentity_id` | `inAccentityId` | 调入会计主体 |
| `mgt_cost_center_id` | `mgt_cost_center_id` | `mgmtCostCenterId` | 管理成本中心 |
| `mgt_dept_id` | `mgt_dept_id` | `mgmtDeptId` | 固定资产管理部门 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `place_id` | `place_id` | `placeId` | 位置 |
| `mgt_profit_center_id` | `mgt_profit_center_id` | `profitCenterId` | 管理利润中心 |
| `unit_id` | `unit_id` | `unitId` | 计量单位 |
| `usage_state_id` | `usage_state_id` | `usageStateId` | 固定资产使用状态 |
| `user_id` | `user_id` | `userId` | 使用人 |
| `vendor_id` | `vendor_id` | `vendorId` | 供应商 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bln_lease` | `bln_lease` | `blnLease` | 使用权资产 |
| `bln_tax_accelerated_depr` | `bln_tax_accelerated_depr` | `blnTaxAcceleratedDepr` | 税收加速折旧标识 |

### 枚举字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `mortgage_status` | `mortgage_status` | `mortgageStatus` | 抵押状态 |

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
| `acc_year_id` | `acc_year_id` | `accYearId` | 会计年ID |
| `acc_period_id` | `acc_period_id` | `periodId` | 会计期间ID |

### 数值字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ori_currtype_ori_amount` | `ori_currtype_ori_amount` | `fcOriValue` | 原币原值 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `free_ch_id` | `free_ch_id` | `freeChId` | 自定义特征id |

### other (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `FIEventAssetLeaseInfoList` | 卡片使用权信息 |
| `` | `` | `eventAssetCalcInfoBodies` | 卡片核算信息 |

### multiLanguage (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `asset_model` | `asset_model` | `assetModel` | 固定资产型号 |
| `location` | `location` | `location` | 固定资产存放地点 |
| `name` | `name` | `name` | 固定资产名称 |
| `specification` | `specification` | `specification` | 固定资产规格 |
