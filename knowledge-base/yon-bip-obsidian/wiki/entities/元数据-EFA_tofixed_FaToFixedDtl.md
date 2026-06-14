---
tags: [BIP, 元数据, 数据字典, EFA.tofixed.FaToFixedDtl]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 固定资产转固单表体 (`EFA.tofixed.FaToFixedDtl`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`fa_to_fixed_dtl` | domain：`yonbip-fi-efa` | 应用：`EFA` | 业务对象ID：`58054ba0-e961-405a-b29e-d5ac6bb8617b`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 固定资产转固单表体 |
| 物理表 | `fa_to_fixed_dtl` |
| domain/服务域 | `yonbip-fi-efa` |
| schema | `fiefa` |
| 所属应用 | `EFA` |
| 直连字段 | 103 个 |
| 子表 | 1 个 |
| 关联引用 | 39 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `FaToFixedDtlDescList` | `EFA.tofixed.FaToFixedDtlDesc` | composition |

## 关联引用 (39个)

| 字段名 | 引用类型 |
|--------|---------|
| `profit_center_id` | `finbd.bd_allaccbodyref_inner` |
| `mgt_profit_center_id` | `finbd.bd_allaccbodyref_inner` |
| `activity` | `` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `place_id` | `ucf-amc-ambd.ampub_location_ref` |
| `vendor_id` | `yssupplier.aa_vendor` |
| `wbs` | `` |
| `mgt_cost_center_id` | `finbd.bd_costcenterref` |
| `grp_currtype_id` | `ucfbasedoc.bd_currencytenantref` |
| `add_way_id` | `yonbip-fi-efa.at_addwayref` |
| `cost_center_id` | `finbd.bd_costcenterref` |
| `asset_id` | `yonbip-fi-efa.fa_assetsquery_basic_ref` |
| `cost_project_id` | `finbd.bd_expenseitemref` |
| `addition_id` | `` |
| `unit_id` | `productcenter.pc_unitref` |
| `org_currtype_id` | `ucfbasedoc.bd_currencytenantref` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `to_fixed_id` | `` |
| `mgt_dept_id` | `ucf-org-center.org_unit_tree_ref` |
| `device_asset_category_id` | `ucf-amc-ambd.ampub_category_ref` |
| `src_bill_trade_type_id` | `ucfbasedoc.bd_billtyperef` |
| `free_ch_id` | `` |
| `ytenant_id` | `` |
| `material_id` | `productcenter.pc_nomalproductref` |
| `usage_dept_id` | `ucf-org-center.org_unit_tree_ref` |
| `currtype_id` | `ucfbasedoc.bd_currencytenantref` |
| `usage_state_id` | `yonbip-fi-efa.fa_usagestateref` |
| `` | `` |
| `exchange_rate_type_id` | `ucfbasedoc.bd_exchangeratetyperef` |
| `gbl_currtype_id` | `ucfbasedoc.bd_currencytenantref` |
| `src_accbook` | `fiepub.fiepub_accountbookref` |
| `usage_user_id` | `ucf-staff-center.bd_staff_all_ref` |
| `asset_category_id` | `yonbip-fi-efa.fa_categorytree_ref` |
| `ori_currtype_id` | `ucfbasedoc.bd_currencytenantref` |
| `project_id` | `ucfbasedoc.bd_projectcardref` |
| `responsible_user_id` | `ucf-staff-center.bd_staff_all_ref` |
| `tax_item_id` | `yonbip-fi-taxpubdoc.RefTable_55c5b82f11` |
| `main_associate_asset_id` | `yonbip-fi-efa.fa_assetsquery_basic_ref` |
| `settlement_period_id` | `finbd.bd_period` |

## 继承接口 (6个, 21字段)

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
- **项目结构属性** (`BGDM.wbs.projectStructureProperties`)
  - `activity` → `activity`
  - `wbs` → `wbs`
- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`

## 字段列表（按类型分组）

> 共 103 个直连字段

### 文本字段 (23个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `begin_use_date` | `begin_use_date` | `beginUseDate` | 投用日期 |
| `contract_no` | `contract_no` | `contractNo` | 合同编号 |
| `related_tofix_dtl_id` | `related_tofix_dtl_id` | `relatedTofixDtlId` | 关联转固单明细ID |
| `remarks` | `remarks` | `remarks` | 备注 |
| `row_no` | `row_no` | `rowNo` | 行号 |
| `settlement_period` | `settlement_period` | `settlementPeriod` | 结算期间编码 |
| `src_bill_id` | `src_bill_id` | `srcBillId` | 来源单据id |
| `src_bill_no` | `src_bill_no` | `srcBillNo` | 来源单据编码 |
| `tf_fail_reason` | `tf_fail_reason` | `tfFailReason` | 自动转固失败原因 |
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

### 引用字段 (37个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `add_way_id` | `add_way_id` | `addWayId` | 增加方式 |
| `addition_id` | `addition_id` | `additionId` | 新增单 |
| `asset_category_id` | `asset_category_id` | `assetCategoryId` | 固定资产类别 |
| `asset_id` | `asset_id` | `assetId` | 固定资产 |
| `cost_center_id` | `cost_center_id` | `costCenterId` | 成本中心 |
| `cost_project_id` | `cost_project_id` | `costProjectId` | 费用项目 |
| `currtype_id` | `currtype_id` | `currtypeId` | 组织币种 |
| `device_asset_category_id` | `device_asset_category_id` | `deviceAssetCategoryId` | 设备资产类别 |
| `exchange_rate_type_id` | `exchange_rate_type_id` | `exchangeRateTypeId` | 汇率类型 |
| `gbl_currtype_id` | `gbl_currtype_id` | `gblCurrtypeId` | 来源全局币币种 |
| `grp_currtype_id` | `grp_currtype_id` | `grpCurrtypeId` | 来源集团币币种 |
| `main_associate_asset_id` | `main_associate_asset_id` | `mainAssociateAssetId` | 主关联卡片 |
| `material_id` | `material_id` | `materialId` | 物料 |
| `mgt_cost_center_id` | `mgt_cost_center_id` | `mgtCostCenterId` | 管理成本中心 |
| `mgt_dept_id` | `mgt_dept_id` | `mgtDeptId` | 管理部门 |
| `mgt_profit_center_id` | `mgt_profit_center_id` | `mgtProfitCenterId` | 管理利润中心 |
| `org_currtype_id` | `org_currtype_id` | `orgCurrtypeId` | 来源组织币币种 |
| `ori_currtype_id` | `ori_currtype_id` | `oriCurrtypeId` | 本币 |
| `place_id` | `place_id` | `placeId` | 位置 |
| `profit_center_id` | `profit_center_id` | `profitCenterId` | 利润中心 |
| `project_id` | `project_id` | `projectId` | 项目 |
| `responsible_user_id` | `responsible_user_id` | `responsibleUserId` | 责任人 |
| `settlement_period_id` | `settlement_period_id` | `settlementPeriodId` | 结算期间 |
| `src_accbook` | `src_accbook` | `srcAccbook` | 来源账簿 |
| `src_bill_trade_type_id` | `src_bill_trade_type_id` | `srcBillTradeTypeId` | 来源交易类型 |
| `tax_item_id` | `tax_item_id` | `taxItemId` | 税目税率 |
| `to_fixed_id` | `to_fixed_id` | `toFixedId` | 固定资产转固单 |
| `unit_id` | `unit_id` | `unitId` | 计量单位 |
| `usage_dept_id` | `usage_dept_id` | `usageDeptId` | 使用部门 |
| `usage_state_id` | `usage_state_id` | `usageStateId` | 资产状态 |
| `usage_user_id` | `usage_user_id` | `usageUserId` | 使用人 |
| `vendor_id` | `vendor_id` | `vendorId` | 供应商 |
| `wbs` | `wbs` | `wbs` | WBS任务 |
| `activity` | `activity` | `activity` | 活动 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 发布时间戳 |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `add_use_status` | `add_use_status` | `addUseStatus` | 新增引用状态 |
| `main_associate_flag` | `main_associate_flag` | `mainAssociateFlag` | 是否主关联 |

### 枚举字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `card_create_status` | `card_create_status` | `cardCreateStatus` | 建卡状态 |
| `create_type` | `create_type` | `createType` | 建卡方式 |
| `exchange_rate_ops` | `exchange_rate_ops` | `exchangeRateOps` | 汇率折算方式 |
| `to_fixed_type` | `to_fixed_type` | `toFixedType` | 转固类型 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accrued_periods` | `accrued_periods` | `accruedPeriods` | 已计提期数 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (25个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_accum_depr_amount` | `acc_accum_depr_amount` | `accAccumDeprAmount` | 本币累计折旧 |
| `acc_accum_imp_amount` | `acc_accum_imp_amount` | `accAccumImpAmount` | 本币累计减值 |
| `acc_excl_tax_amount` | `acc_excl_tax_amount` | `accExclTaxAmount` | 本币无税金额 |
| `acc_excl_tax_price` | `acc_excl_tax_price` | `accExclTaxPrice` | 本币无税单价 |
| `acc_incl_tax_amount` | `acc_incl_tax_amount` | `accInclTaxAmount` | 本币含税金额 |
| `acc_incl_tax_price` | `acc_incl_tax_price` | `accInclTaxPrice` | 本币含税单价 |
| `acc_tax_amount` | `acc_tax_amount` | `accTaxAmount` | 本币税额 |
| `acc_year_depr_amount` | `acc_year_depr_amount` | `accYearDeprAmount` | 本币本年折旧 |
| `acc_year_imp_amount` | `acc_year_imp_amount` | `accYearImpAmount` | 本币本年减值 |
| `complete_quantity` | `complete_quantity` | `completeQuantity` | 已生单数量 |
| `exchange_rate` | `exchange_rate` | `exchangeRate` | 汇率 |
| `excl_tax_amount` | `excl_tax_amount` | `exclTaxAmount` | 无税金额 |
| `excl_tax_price` | `excl_tax_price` | `exclTaxPrice` | 无税单价 |
| `gbl_excl_tax_amount` | `gbl_excl_tax_amount` | `gblEexclTaxAmount` | 来源全局币无税金额 |
| `grp_excl_tax_amount` | `grp_excl_tax_amount` | `grpEexclTaxAmount` | 来源集团币无税金额 |
| `incl_tax_amount` | `incl_tax_amount` | `inclTaxAmount` | 含税金额 |
| `incl_tax_price` | `incl_tax_price` | `inclTaxPrice` | 含税单价 |
| `non_dedu_tax_amount` | `non_dedu_tax_amount` | `nonDeduTaxAmount` | 不可抵扣税额 |
| `non_dedu_tax_rate` | `non_dedu_tax_rate` | `nonDeduTaxRate` | 不可抵扣税率 |
| `org_excl_tax_amount` | `org_excl_tax_amount` | `orgEexclTaxAmount` | 来源组织币无税金额 |
| `quantity` | `quantity` | `quantity` | 数量 |
| `settlement_quantity` | `settlement_quantity` | `settlementQuantity` | 已结算数量 |
| `src_non_dedu_tax_amount` | `src_non_dedu_tax_amount` | `srcNonDeduTaxAmount` | 原币不可抵扣税额 |
| `tax_amount` | `tax_amount` | `taxAmount` | 税额 |
| `tax_rate` | `tax_rate` | `taxRate` | 税率 |

### multiLanguage (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `asset_model` | `asset_model` | `assetModel` | 型号 |
| `asset_name` | `asset_name` | `assetName` | 资产名称 |
| `location` | `location` | `location` | 存放地点 |
| `specification` | `specification` | `specification` | 规格 |
| `src_settlement_order_name` | `src_settlement_order_name` | `srcSettlementOrderName` | 来源结算订单名称 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `free_ch_id` | `free_ch_id` | `freeChId` | 自定特征 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `FaToFixedDtlDescList` | 固定资产转固单表体描述信息 |
