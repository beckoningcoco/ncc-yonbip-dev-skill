---
tags: [BIP, 元数据, 数据字典, fa.reclass.ReclassBillDetail]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 固定资产重分类子表详情 (`fa.reclass.ReclassBillDetail`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`fa_bill_reclass_dtl` | domain：`yonbip-fi-efa` | 应用：`EFA` | 业务对象ID：`bae936f9-f70a-4569-82a1-2f9a1eff8d73`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 固定资产重分类子表详情 |
| 物理表 | `fa_bill_reclass_dtl` |
| domain/服务域 | `yonbip-fi-efa` |
| schema | `fiefa` |
| 所属应用 | `EFA` |
| 直连字段 | 74 个 |
| 子表 | 0 个 |
| 关联引用 | 36 个 |

## 关联引用 (36个)

| 字段名 | 引用类型 |
|--------|---------|
| `be_sub_category_id` | `yonbip-fi-efa.fa_subcategoryref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `be_category_id` | `yonbip-fi-efa.fa_categorymainref` |
| `be_ori_value_subject_id` | `fiepub.fiepub_accsubjectref` |
| `af_accum_imp_subject_id` | `fiepub.fiepub_accsubjectref` |
| `af_ori_value_subject_id` | `fiepub.fiepub_accsubjectref` |
| `be_accum_imp_subject_id` | `fiepub.fiepub_accsubjectref` |
| `af_depr_convention_id` | `` |
| `accentity_id` | `finbd.bd_allaccbodyref` |
| `af_disposal_subject_id` | `fiepub.fiepub_accsubjectref` |
| `reclass_bill_id` | `` |
| `asset_id` | `yonbip-fi-efa.RefTable_e18239682` |
| `be_depr_expense_subject_id` | `fiepub.fiepub_accsubjectref` |
| `bill_type_id` | `transtype.bd_billtypetreeref` |
| `be_depr_subject_id` | `fiepub.fiepub_accsubjectref` |
| `af_imp_loss_subject_id` | `fiepub.fiepub_accsubjectref` |
| `be_add_reserve_subject_id` | `fiepub.fiepub_accsubjectref` |
| `af_accbook_category_id` | `` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `be_disposal_subject_id` | `fiepub.fiepub_accsubjectref` |
| `accbook_id` | `fiepub.fiepub_accountbookref` |
| `af_sub_category_id` | `yonbip-fi-efa.fa_subcategoryref` |
| `asset_calc_id` | `` |
| `bill_trade_type_id` | `transtype.bd_billtyperef` |
| `af_disposal_convention_id` | `` |
| `ytenant_id` | `` |
| `be_depr_method_id` | `` |
| `be_depr_convention_id` | `` |
| `af_category_id` | `yonbip-fi-efa.fa_categorymainref` |
| `af_depr_method_id` | `` |
| `be_disposal_convention_id` | `` |
| `af_depr_expense_subject_id` | `fiepub.fiepub_accsubjectref` |
| `be_accbook_category_id` | `` |
| `af_add_reserve_subject_id` | `fiepub.fiepub_accsubjectref` |
| `af_depr_subject_id` | `fiepub.fiepub_accsubjectref` |
| `be_imp_loss_subject_id` | `fiepub.fiepub_accsubjectref` |

## 继承接口 (1个, 1字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 74 个直连字段

### 文本字段 (16个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `reclass_type` | `reclass_type` | `reclassType` | 重分类类型 |
| `be_scrap_value_type` | `be_scrap_value_type` | `beScrapValueType` | 重分类前残值类型 |
| `af_scrap_value_type` | `af_scrap_value_type` | `afScrapValueType` | 重分类后残值类型 |
| `amorti_adjust_date` | `amorti_adjust_date` | `amortiAdjustDate` | 摊销调整日期 |
| `remarks` | `remarks` | `remarks` | 备注 |
| `accbook_currtype_id` | `accbook_currtype_id` | `accbookCurrtypeId` | 本币币种id |
| `ori_app_id` | `ori_app_id` | `oriAppId` | 源头应用ID |
| `ori_bill_id` | `ori_bill_id` | `oriBillId` | 源头单据ID |
| `ori_bill_no` | `ori_bill_no` | `oriBillNo` | 源头单据号 |
| `ori_bill_trade_type_id` | `ori_bill_trade_type_id` | `oriBillTradeTypeId` | 源头交易类型 |
| `ori_bill_type_id` | `ori_bill_type_id` | `oriBillTypeId` | 源头单据类型ID |
| `busi_post_failure_reason` | `busi_post_failure_reason` | `busiPostFailureReason` | 业务过账失败原因 |
| `org_currtype_id` | `org_currtype_id` | `orgCurrtypeId` | 组织币币种id |
| `code` | `code` | `code` | 编码 |
| `id` | `id` | `id` | ID |
| `bill_date` | `bill_date` | `vouchdate` | 单据日期 |

### 引用字段 (36个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accentity_id` | `accentity_id` | `accentity` | 会计主体 |
| `accbook_id` | `accbook_id` | `accbook` | 账簿Id |
| `bill_trade_type_id` | `bill_trade_type_id` | `billTradeTypeId` | 交易类型 |
| `bill_type_id` | `bill_type_id` | `billTypeId` | 单据类型 |
| `reclass_bill_id` | `reclass_bill_id` | `reclassId` | 重分类单ID |
| `asset_id` | `asset_id` | `assetId` | 固定资产id |
| `be_category_id` | `be_category_id` | `beCategoryId` | 原资产类别ID |
| `be_accbook_category_id` | `be_accbook_category_id` | `beBookCategoryId` | 原账簿类别ID |
| `be_sub_category_id` | `be_sub_category_id` | `beSubCategoryId` | 原资产子类别 |
| `be_depr_method_id` | `be_depr_method_id` | `beDeprMethodId` | 重分类前折旧方法 |
| `be_disposal_convention_id` | `be_disposal_convention_id` | `beDisposalConventionId` | 重分类前处置惯例 |
| `be_depr_convention_id` | `be_depr_convention_id` | `beDeprConventionId` | 重分类前折旧惯例 |
| `af_category_id` | `af_category_id` | `afCategoryId` | 新资产类别ID |
| `af_accbook_category_id` | `af_accbook_category_id` | `afBookCategoryId` | 新账簿类别ID |
| `af_sub_category_id` | `af_sub_category_id` | `afSubCategoryId` | 新资产子类别 |
| `af_depr_method_id` | `af_depr_method_id` | `afDeprMethodId` | 重分类后折旧方法 |
| `af_disposal_convention_id` | `af_disposal_convention_id` | `afDisposalConventionId` | 重分类后处置惯例 |
| `af_depr_convention_id` | `af_depr_convention_id` | `afDeprConventionId` | 重分类后折旧惯例 |
| `asset_calc_id` | `asset_calc_id` | `calculateId` | 核算信息 |
| `af_ori_value_subject_id` | `af_ori_value_subject_id` | `afOrivalueSubjectId` | 重分类后原值科目 |
| `be_ori_value_subject_id` | `be_ori_value_subject_id` | `beOrivalueSubjectId` | 重分类前原值科目 |
| `af_depr_expense_subject_id` | `af_depr_expense_subject_id` | `afDeprExpenseSubject` | 重分类后折旧费用科目 |
| `be_depr_expense_subject_id` | `be_depr_expense_subject_id` | `beDeprExpenseSubject` | 重分类前折旧费用科目 |
| `af_depr_subject_id` | `af_depr_subject_id` | `afDeprSubjectId` | 重分类后累计折旧科目 |
| `be_depr_subject_id` | `be_depr_subject_id` | `beDeprSubjectId` | 重分类前累计折旧科目 |
| `af_accum_imp_subject_id` | `af_accum_imp_subject_id` | `afIpairmentSubject` | 重分类后累计减值科目 |
| `be_accum_imp_subject_id` | `be_accum_imp_subject_id` | `beImpairmentSubject` | 重分类前累计减值科目 |
| `af_imp_loss_subject_id` | `af_imp_loss_subject_id` | `afImpairmentLossSubject` | 重分类后减值损失科目 |
| `be_imp_loss_subject_id` | `be_imp_loss_subject_id` | `beImpairmentLossSubject` | 重分类前减值损失科目 |
| `af_disposal_subject_id` | `af_disposal_subject_id` | `afDisposalSubject` | 重分类后固定资产清理科目 |
| `be_disposal_subject_id` | `be_disposal_subject_id` | `beDisposalSubject` | 重分类前固定资产清理科目 |
| `af_add_reserve_subject_id` | `af_add_reserve_subject_id` | `afAddreserveSubject` | 重分类后附加准备金科目 |
| `be_add_reserve_subject_id` | `be_add_reserve_subject_id` | `beAddreserveSubject` | 重分类前附加准备金科目 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | pubts |

### 布尔字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bln_new_rule` | `bln_new_rule` | `blnNewRule` | 继承新资产类别规则 |
| `bln_depr` | `bln_depr` | `isDepr` | 是否折旧 |
| `bln_amorti_adjust` | `bln_amorti_adjust` | `amortiAdjustMark` | 摊销调整标识 |

### 枚举字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `busi_post_status` | `busi_post_status` | `busiPostStatus` | 业务过账过账状态 |

### 整数 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `be_life_year` | `be_life_year` | `beLifeYear` | 重分类前使用年限 |
| `be_life_month` | `be_life_month` | `beLifeMonth` | 重分类前使用月限 |
| `af_life_year` | `af_life_year` | `afLifeYear` | 重分类后使用年限 |
| `af_life_month` | `af_life_month` | `afLifeMonth` | 重分类后使用月限 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `tpl_id` | `tpl_id` | `tplId` | 模板ID |
| `busi_post_version` | `busi_post_version` | `busiPostVersion` | 业务过账版本 |

### 数值字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `be_scrap_value_rate` | `be_scrap_value_rate` | `beScrapValueRate` | 重分类前净残值率 |
| `be_scrap_value_amount` | `be_scrap_value_amount` | `beScrapValue` | 重分类前净残值 |
| `af_scrap_value_rate` | `af_scrap_value_rate` | `afScrapValueRate` | 重分类后净残值率 |
| `af_scrap_value_amount` | `af_scrap_value_amount` | `afScrapValue` | 重分类后净残值 |
| `org_af_scrap_value_amount` | `org_af_scrap_value_amount` | `orgAfScrapValueAmount` | 组织币重分类后净残值 |
| `org_be_scrap_value_amount` | `org_be_scrap_value_amount` | `orgBeScrapValueAmount` | 组织币重分类前净残值 |
| `acc_adjust_depr_amount` | `acc_adjust_depr_amount` | `accAdjustDeprAmount` | 本币追溯调整折旧额 |
| `org_adjust_depr_amount` | `org_adjust_depr_amount` | `orgAdjustDeprAmount` | 组织币追溯调整折旧额 |
