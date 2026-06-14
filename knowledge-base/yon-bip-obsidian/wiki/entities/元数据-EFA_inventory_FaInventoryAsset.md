---
tags: [BIP, 元数据, 数据字典, EFA.inventory.FaInventoryAsset]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 盘点卡片基本信息 (`EFA.inventory.FaInventoryAsset`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`fa_asset` | domain：`yonbip-fi-efa` | 应用：`EFA` | 业务对象ID：`275ffda9-17b5-420c-ac55-5bdd3abe856a`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 盘点卡片基本信息 |
| 物理表 | `fa_asset` |
| domain/服务域 | `yonbip-fi-efa` |
| schema | `fiefa` |
| 所属应用 | `EFA` |
| 直连字段 | 39 个 |
| 子表 | 0 个 |
| 关联引用 | 19 个 |

## 关联引用 (19个)

| 字段名 | 引用类型 |
|--------|---------|
| `mgt_profit_center_id` | `finbd.bd_allaccbodyref_inner` |
| `asset_sub_cat_id` | `yonbip-fi-efa.fa_subcategoryref` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `custodian_id` | `iuap-ptc-yoncmm.sattUuser` |
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
| `asset_category_id` | `yonbip-fi-efa.fa_categorytree_ref` |
| `impairment_unit_id` | `yonbip-fi-efa.fa_impairmentunit_ref` |
| `ori_currtype_id` | `ucfbasedoc.bd_currencytenantref` |
| `unit_id` | `productcenter.pc_unitref` |
| `mgt_cost_center_id` | `finbd.bd_costcenterref` |

## 继承接口 (1个, 1字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 39 个直连字段

### 文本字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `begin_date` | `begin_date` | `beginTime` | 固定资产开始使用日期 |
| `code` | `code` | `code` | 编码 |
| `id` | `id` | `id` | 主键 |
| `src_bill_no_combine` | `src_bill_no_combine` | `srcBillNoCombine` | 来源单据号 |
| `src_create_type` | `src_create_type` | `srcCreateType` | 来源建卡方式 |
| `src_project_id_combine` | `src_project_id_combine` | `srcProjectIdCombine` | 来源项目 |
| `tag_no` | `tag_no` | `tagno` | 标签号 |

### 引用字段 (18个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accentity_id` | `accentity_id` | `accentity` | 会计主体 |
| `add_way_id` | `add_way_id` | `addWayId` | 固定资产增加方式 |
| `asset_category_id` | `asset_category_id` | `assetCategoryId` | 固定资产类别 |
| `asset_sub_cat_id` | `asset_sub_cat_id` | `assetSubcategoryId` | 固定资产子类别 |
| `creator` | `creator` | `creator` | 创建人 |
| `custodian_id` | `custodian_id` | `custodian` | 保管人 |
| `impairment_unit_id` | `impairment_unit_id` | `impairmentunitId` | 减值单元 |
| `mgt_cost_center_id` | `mgt_cost_center_id` | `mgmtCostCenterId` | 管理成本中心 |
| `mgt_dept_id` | `mgt_dept_id` | `mgmtDeptId` | 管理部门 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ori_currtype_id` | `ori_currtype_id` | `oriCurrtypeId` | 原币币种 |
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

### 布尔字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bln_lease` | `bln_lease` | `blnLease` | 使用权资产 |
| `bln_pre_add` | `bln_pre_add` | `blnPreAdd` | 是否预建 |
| `bln_tax_accelerated_depr` | `bln_tax_accelerated_depr` | `blnTaxAcceleratedDepr` | 税收加速折旧标识 |

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

### multiLanguage (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `asset_model` | `asset_model` | `assetModel` | 固定资产型号 |
| `location` | `location` | `location` | 固定资产存放地点 |
| `name` | `name` | `name` | 名称 |
| `specification` | `specification` | `specification` | 固定资产规格 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `free_ch_id` | `free_ch_id` | `freeChId` | 自定义项 |
