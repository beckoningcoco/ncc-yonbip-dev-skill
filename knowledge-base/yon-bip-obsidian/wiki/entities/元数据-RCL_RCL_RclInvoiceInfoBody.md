---
tags: [BIP, 元数据, 数据字典, RCL.RCL.RclInvoiceInfoBody]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 开票信息表体 (`RCL.RCL.RclInvoiceInfoBody`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`rcl_invoiceinfo_b` | domain：`yonbip-fi-ercl` | 应用：`RVN` | 业务对象ID：`4ccecaa4-de21-4116-bf41-750771fc64ca`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 开票信息表体 |
| 物理表 | `rcl_invoiceinfo_b` |
| domain/服务域 | `yonbip-fi-ercl` |
| schema | `fiercl` |
| 所属应用 | `RVN` |
| 直连字段 | 81 个 |
| 子表 | 0 个 |
| 关联引用 | 29 个 |

## 关联引用 (29个)

| 字段名 | 引用类型 |
|--------|---------|
| `expense_item_id` | `finbd.bd_expenseitemref` |
| `activity` | `` |
| `con_exchange_rate_type` | `ucfbasedoc.bd_exchangeratetyperef` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `project_id` | `ucfbasedoc.bd_projectcardref` |
| `wbs` | `` |
| `supplier_procenter_id` | `finbd.bd_allaccbodyref_inner` |
| `demander_procenter_id` | `finbd.bd_allaccbodyref_inner` |
| `src_busi_type` | `ucfbasedoc.bd_billtyperef` |
| `tax_rate_id` | `yonbip-fi-taxpubdoc.RefTable_55c5b82f11` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `org_currtype` | `ucfbasedoc.bd_currencytenantref` |
| `rcl_invoiceinfo_h_id` | `` |
| `tax_subject_id` | `yonbip-fi-taxpubdoc.RefTable_55c5b82f11` |
| `cost_center_id` | `finbd.bd_costcenterref` |
| `ori_busi_type` | `ucfbasedoc.bd_billtyperef` |
| `staff_id` | `ucf-staff-center.bd_staff_all_ref` |
| `dept_id` | `ucf-org-center.orgcenter_admin_tree_ref` |
| `free_ch_id` | `` |
| `ytenant_id` | `` |
| `material_id` | `productcenter.pc_nomalproductref` |
| `src_bill_type` | `ucfbasedoc.bd_billtypetreeref` |
| `ori_currtype` | `ucfbasedoc.bd_currencytenantref` |
| `exchange_rate_type` | `ucfbasedoc.bd_exchangeratetyperef` |
| `unit_id` | `productcenter.pc_unitref` |
| `ori_bill_type` | `ucfbasedoc.bd_billtypetreeref` |
| `contract_id` | `yonbip-fi-ercl.RefTable_da1e623072` |
| `con_currency_id` | `ucfbasedoc.bd_currencytenantref` |
| `contract_detail_id` | `yonbip-fi-ercl.RefTable_c75ebbb386` |

## 继承接口 (4个, 8字段)

- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`
- **项目结构属性** (`BGDM.wbs.projectStructureProperties`)
  - `activity` → `activity`
  - `wbs` → `wbs`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 81 个直连字段

### 文本字段 (26个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `contract_num` | `contract_num` | `contractNum` | 履约义务单据号 |
| `cost_center_code` | `cost_center_code` | `costCenterCode` | 成本中心编码 |
| `expense_item_code` | `expense_item_code` | `expenseItemCode` | 费用项目编码 |
| `ext_begin_bill_id` | `ext_begin_bill_id` | `extBeginBillId` | 源头单据id(外) |
| `ext_begin_bill_no` | `ext_begin_bill_no` | `extBeginBillNo` | 源头单据编码(外) |
| `ext_begin_billtype_code` | `ext_begin_billtype_code` | `extBeginBilltypeCode` | 源头单据类型编码(外) |
| `ext_begin_body_id` | `ext_begin_body_id` | `extBeginBodyId` | 源头单据行id(外) |
| `ext_begin_transtype_code` | `ext_begin_transtype_code` | `extBeginTranstypeCode` | 源头交易类型编码(外) |
| `ext_src_bill_id` | `ext_src_bill_id` | `extSrcBillId` | 来源单据id(外) |
| `ext_src_billcode` | `ext_src_billcode` | `extSrcBillcode` | 来源单据编码(外) |
| `ext_src_billtype_code` | `ext_src_billtype_code` | `extSrcBilltypeCode` | 来源单据类型编码(外) |
| `ext_src_body_id` | `ext_src_body_id` | `extSrcBodyId` | 来源单据行id(外) |
| `ext_src_systems` | `ext_src_systems` | `extSrcSystems` | 来源单据系统(外) |
| `ext_src_transtype_code` | `ext_src_transtype_code` | `extSrcTranstypeCode` | 来源交易类型编码(外) |
| `material_code` | `material_code` | `materialCode` | 物料编码 |
| `material_name` | `material_name` | `materialName` | 物料名称 |
| `ori_bill_detail_id` | `ori_bill_detail_id` | `oriBillDetailId` | 源头单据行ID |
| `ori_bill_id` | `ori_bill_id` | `oriBillId` | 源头单据ID |
| `ori_code` | `ori_code` | `oriCode` | 源头单据号 |
| `remarks` | `remarks` | `remarks` | 备注 |
| `source_bill_ts` | `source_bill_ts` | `sourceBillTs` | 来源单据ts |
| `src_bill_detail_id` | `src_bill_detail_id` | `srcBillDetailId` | 来源单据行ID |
| `src_bill_id` | `src_bill_id` | `srcBillId` | 来源单据ID |
| `src_code` | `src_code` | `srcCode` | 来源单据号 |
| `unit_code` | `unit_code` | `unitCode` | 单位编码 |
| `id` | `id` | `id` | 主键 |

### 引用字段 (28个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `con_currency_id` | `con_currency_id` | `con_currency_id` | 合同币 |
| `con_exchange_rate_type` | `con_exchange_rate_type` | `con_exchange_rate_type` | 合同币汇率类型 |
| `contract_detail_id` | `contract_detail_id` | `contractDetailId` | 履约义务行ID |
| `contract_id` | `contract_id` | `contractId` | 履约义务ID |
| `cost_center_id` | `cost_center_id` | `costCenter` | 成本中心 |
| `demander_procenter_id` | `demander_procenter_id` | `demanderProCenter` | 需方利润中心 |
| `dept_id` | `dept_id` | `dept` | 部门 |
| `exchange_rate_type` | `exchange_rate_type` | `exchangeRateType` | 汇率类型 |
| `expense_item_id` | `expense_item_id` | `expenseItem` | 费用项目 |
| `material_id` | `material_id` | `materialId` | 物料 |
| `org_currtype` | `org_currtype` | `orgCurrtype` | 本位币 |
| `ori_bill_type` | `ori_bill_type` | `oriBillType` | 源头单据类型 |
| `ori_busi_type` | `ori_busi_type` | `oriBusiType` | 源头交易类型 |
| `ori_currtype` | `ori_currtype` | `oriCurrtype` | 币种 |
| `project_id` | `project_id` | `project` | 项目 |
| `rcl_invoiceinfo_h_id` | `rcl_invoiceinfo_h_id` | `rclInvoiceInfoHeader_id` | 开票信息表头 |
| `src_bill_type` | `src_bill_type` | `srcBillType` | 来源单据类型 |
| `src_busi_type` | `src_busi_type` | `srcBusiType` | 来源交易类型 |
| `staff_id` | `staff_id` | `staff` | 业务员 |
| `supplier_procenter_id` | `supplier_procenter_id` | `supplierProCenter` | 供方利润中心 |
| `tax_rate_id` | `tax_rate_id` | `taxRateId` | 税率 |
| `tax_subject_id` | `tax_subject_id` | `taxSubject` | 税目 |
| `unit_id` | `unit_id` | `unit` | 单位 |
| `activity` | `activity` | `activity` | 活动 |
| `wbs` | `wbs` | `wbs` | WBS |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `exchange_rate_date` | `exchange_rate_date` | `exchangeRateDate` | 汇率日期 |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### 枚举字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `con_exch_rate_ops` | `con_exch_rate_ops` | `conExchRateOps` | 合同币汇率折算方式 |
| `exch_rate_ops` | `exch_rate_ops` | `exchRateOps` | 汇率折算方式 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (19个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `con_exchange_rate` | `con_exchange_rate` | `con_exchange_rate` | 合同币汇率 |
| `con_tax_amount` | `con_tax_amount` | `con_tax_amount` | 合同币税额 |
| `con_tax_excluded_amount` | `con_tax_excluded_amount` | `con_tax_excluded_amount` | 合同币无税金额 |
| `con_tax_excluded_price` | `con_tax_excluded_price` | `con_tax_excluded_price` | 合同币无税单价 |
| `con_tax_included_amount` | `con_tax_included_amount` | `con_tax_included_amount` | 合同币含税金额 |
| `con_tax_included_price` | `con_tax_included_price` | `con_tax_included_price` | 合同币含税单价 |
| `exchange_rate` | `exchange_rate` | `exchangeRate` | 汇率 |
| `local_money` | `local_money` | `localMoney` | 本币含税金额 |
| `local_price` | `local_price` | `localPrice` | 本币含税单价 |
| `local_tax` | `local_tax` | `localTax` | 本币税额 |
| `money` | `money` | `money` | 含税金额 |
| `no_tax_local_money` | `no_tax_local_money` | `noTaxLocalMoney` | 本币无税金额 |
| `no_tax_local_price` | `no_tax_local_price` | `noTaxLocalPrice` | 本币无税单价 |
| `no_tax_money` | `no_tax_money` | `noTaxMoney` | 无税金额 |
| `no_tax_price` | `no_tax_price` | `noTaxPrice` | 无税单价 |
| `price` | `price` | `price` | 含税单价 |
| `quantity` | `quantity` | `quantity` | 数量 |
| `tax` | `tax` | `tax` | 税额 |
| `tax_rate` | `tax_rate` | `taxRate` | 税率(%) |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `free_ch_id` | `free_ch_id` | `freeChId` | 自定义特征 |
