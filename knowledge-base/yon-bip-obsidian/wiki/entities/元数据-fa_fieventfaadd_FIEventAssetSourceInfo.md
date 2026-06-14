---
tags: [BIP, 元数据, 数据字典, fa.fieventfaadd.FIEventAssetSourceInfo]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 卡片来源信息 (`fa.fieventfaadd.FIEventAssetSourceInfo`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`fa_ledger_b_source` | domain：`yonbip-fi-efa` | 应用：`EFA` | 业务对象ID：`2d7ac6c6-fb0a-40f2-a698-265f837e1637`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 卡片来源信息 |
| 物理表 | `fa_ledger_b_source` |
| domain/服务域 | `yonbip-fi-efa` |
| schema | `fiefa` |
| 所属应用 | `EFA` |
| 直连字段 | 38 个 |
| 子表 | 0 个 |
| 关联引用 | 14 个 |

## 关联引用 (14个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `activity` | `` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `vendor_id` | `yssupplier.aa_vendor` |
| `wbs` | `` |
| `free_ch_id` | `` |
| `ytenant_id` | `` |
| `material_id` | `productcenter.pc_nomalproductref` |
| `accentity_id` | `finbd.bd_allaccbodyref` |
| `src_currtype_id` | `ucfbasedoc.bd_currencytenantref` |
| `event_master_id` | `` |
| `src_project_id` | `ucfbasedoc.bd_projectcardref` |
| `src_app_id` | `fiepub.fiepub_sourceapplicationref` |
| `src_bill_type_id` | `ucfbasedoc.bd_billtypetreeref` |

## 继承接口 (1个, 1字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 38 个直连字段

### 文本字段 (13个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accbook_id` | `accbook_id` | `accbook` | 账簿ID |
| `header_id` | `header_id` | `headerId` | 主表ID |
| `acc_year_code` | `acc_year_code` | `accYearCode` | 会计年编码 |
| `acc_period_code` | `acc_period_code` | `period` | 会计期间编码 |
| `direction` | `direction` | `direction` | 方向 |
| `src_bill_id` | `src_bill_id` | `srcBillId` | 来源单据id |
| `src_bill_sub_id` | `src_bill_sub_id` | `srcBillSubId` | 来源单据子表id |
| `src_bill_no` | `src_bill_no` | `srcBillNo` | 来源单据号 |
| `src_bill_date` | `src_bill_date` | `srcBillDate` | 来源单据日期 |
| `create_type` | `create_type` | `createType` | 建卡方式 |
| `purchase_bill_type` | `purchase_bill_type` | `purchaseBillType` | 采购来源类型 |
| `contract_no` | `contract_no` | `contractNo` | 合同编号 |
| `id` | `id` | `id` | 主键 |

### 引用字段 (13个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accentity_id` | `accentity_id` | `accentity` | 会计主体 |
| `event_master_id` | `event_master_id` | `eventMasterId` | 财务事务主表ID |
| `vendor_id` | `vendor_id` | `vendorId` | 供应商id |
| `activity` | `activity` | `activity` | 活动 |
| `src_app_id` | `src_app_id` | `srcAppId` | 来源应用 |
| `src_bill_type_id` | `src_bill_type_id` | `srcBillTypeId` | 来源单据类型 |
| `src_project_id` | `src_project_id` | `srcProjectId` | 来源项目 |
| `wbs` | `wbs` | `wbs` | WBS |
| `material_id` | `material_id` | `materialId` | 物料id |
| `src_currtype_id` | `src_currtype_id` | `srcCurrtypeId` | 来源币种id |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
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

### 数值字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `tax_amount` | `tax_amount` | `taxAmount` | 税额 |
| `excl_tax_price` | `excl_tax_price` | `exclTaxPrice` | 无税单价 |
| `excl_tax_amount` | `excl_tax_amount` | `exclTaxAmount` | 无税金额 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `free_ch_id` | `free_ch_id` | `freeChId` | 自定义项 |
