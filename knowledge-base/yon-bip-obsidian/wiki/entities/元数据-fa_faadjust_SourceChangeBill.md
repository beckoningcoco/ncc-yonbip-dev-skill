---
tags: [BIP, 元数据, 数据字典, fa.faadjust.SourceChangeBill]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 来源信息变动 (`fa.faadjust.SourceChangeBill`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`fa_bill_adjust_src` | domain：`yonbip-fi-efa` | 应用：`EFA` | 业务对象ID：`29c21e74-f625-40f2-8c1a-4d479ecc37ab`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 来源信息变动 |
| 物理表 | `fa_bill_adjust_src` |
| domain/服务域 | `yonbip-fi-efa` |
| schema | `fiefa` |
| 所属应用 | `EFA` |
| 直连字段 | 52 个 |
| 子表 | 0 个 |
| 关联引用 | 21 个 |

## 关联引用 (21个)

| 字段名 | 引用类型 |
|--------|---------|
| `src_profit_center_id` | `finbd.bd_allaccbodyref_inner` |
| `src_src_bill_trade_type_id` | `ucfbasedoc.bd_billtyperef` |
| `src_src_bill_type_id` | `ucfbasedoc.bd_billtypetreeref` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `activity` | `` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `vendor_id` | `yssupplier.aa_vendorSimpleRef` |
| `wbs` | `` |
| `src_bill_trade_type_id` | `ucfbasedoc.bd_billtyperef` |
| `ytenant_id` | `` |
| `material_id` | `productcenter.baseProductRef` |
| `adjust_base_id` | `` |
| `accentity_id` | `finbd.bd_allaccbodyref` |
| `src_currtype_id` | `ucfbasedoc.bd_currencytenantref` |
| `src_cost_center_id` | `finbd.bd_costcenterref` |
| `src_cost_project_id` | `finbd.bd_expenseitemref` |
| `src_project_id` | `ucfbasedoc.bd_projectNewRef` |
| `src_src_app_id` | `fiepub.fiepub_sourceapplicationref` |
| `src_app_id` | `fiepub.fiepub_sourceapplicationref` |
| `src_bill_type_id` | `transtype.bd_billtypetreeref` |
| `src_dept_id` | `ucf-org-center.org_unit_tree_ref` |

## 继承接口 (1个, 1字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 52 个直连字段

### 文本字段 (15个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `direction` | `direction` | `direction` | 方向 |
| `src_source_id` | `src_source_id` | `srcSourceId` | 来源固定资产来源信息ID |
| `asset_id` | `asset_id` | `assetId` | 来源固定资产主表ID |
| `src_src_code` | `src_src_code` | `srcSrcCode` | 来源来源单据编码 |
| `src_src_date` | `src_src_date` | `srcSrcDate` | 来源来源单据日期 |
| `contract_no` | `contract_no` | `contractNo` | 合同编号 |
| `create_type` | `create_type` | `createType` | 建卡方式 |
| `id` | `id` | `id` | 主键 |
| `ori_asset_code` | `ori_asset_code` | `oriAssetCode` | 原固定资产编码 |
| `ori_asset_id` | `ori_asset_id` | `oriAssetId` | 原固定资产卡片id |
| `purchase_bill_type` | `purchase_bill_type` | `purchaseBillType` | 采购来源类型 |
| `src_bill_date` | `src_bill_date` | `srcBillDate` | 来源单据日期 |
| `src_bill_id` | `src_bill_id` | `srcBillId` | 来源单据id |
| `src_bill_no` | `src_bill_no` | `srcBillNo` | 来源单据号 |
| `src_bill_sub_id` | `src_bill_sub_id` | `srcBillSubId` | 来源单据子表id |

### 引用字段 (21个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `adjust_base_id` | `adjust_base_id` | `adjustbaseId` | 基本信息调整主表 |
| `src_src_app_id` | `src_src_app_id` | `srcSrcAppId` | 来源来源应用ID |
| `src_src_bill_type_id` | `src_src_bill_type_id` | `srcSrcBillTypeId` | 来源来源单据类型ID |
| `src_bill_trade_type_id` | `src_bill_trade_type_id` | `srcBillTradeTypeId` | 来源交易类型 |
| `src_src_bill_trade_type_id` | `src_src_bill_trade_type_id` | `srcSrcBillTradeTypeId` | 来源来源交易类型 |
| `src_dept_id` | `src_dept_id` | `srcDeptId` | 来源部门 |
| `src_cost_center_id` | `src_cost_center_id` | `srcCostCenterId` | 来源成本中心 |
| `src_profit_center_id` | `src_profit_center_id` | `srcProfitCenterId` | 来源利润中心 |
| `src_cost_project_id` | `src_cost_project_id` | `srcCostProjectId` | 来源费用项目 |
| `accentity_id` | `accentity_id` | `accentity` | 会计主体 |
| `activity` | `activity` | `activity` | 活动 |
| `creator` | `creator` | `creator` | 创建人 |
| `material_id` | `material_id` | `materialId` | 物料id |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `src_app_id` | `src_app_id` | `srcAppId` | 来源应用 |
| `src_bill_type_id` | `src_bill_type_id` | `srcBillTypeId` | 来源单据类型 |
| `src_currtype_id` | `src_currtype_id` | `srcCurrtypeId` | 来源币种id |
| `src_project_id` | `src_project_id` | `srcProjectId` | 来源项目 |
| `vendor_id` | `vendor_id` | `vendorId` | 供应商id |
| `wbs` | `wbs` | `wbs` | WBS |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bln_main_associated` | `bln_main_associated` | `blnMainAssociated` | 是否主关联 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `src_tax_rate` | `src_tax_rate` | `srcTaxRate` | 来源税率 |
| `src_tax_amount` | `src_tax_amount` | `srcTaxAmount` | 来源税额 |
| `src_acc_excl_tax_amount` | `src_acc_excl_tax_amount` | `srcAccExclTaxAmount` | 来源本币无税金额 |
| `src_acc_incl_tax_amount` | `src_acc_incl_tax_amount` | `srcAccInclTaxAmount` | 来源本币含税金额 |
| `src_acc_tax_amount` | `src_acc_tax_amount` | `srcAccTaxAmount` | 来源本币税额 |
| `src_incl_tax_amount` | `src_incl_tax_amount` | `srcInclTaxAmount` | 来源含税金额 |
| `excl_tax_amount` | `excl_tax_amount` | `exclTaxAmount` | 无税金额 |
| `excl_tax_price` | `excl_tax_price` | `exclTaxPrice` | 无税单价 |
| `ori_disposal_rate` | `ori_disposal_rate` | `oriDisposalRate` | 原处置比例 |
| `quantity` | `quantity` | `quantity` | 数量 |
| `tax_amount` | `tax_amount` | `taxAmount` | 税额 |
