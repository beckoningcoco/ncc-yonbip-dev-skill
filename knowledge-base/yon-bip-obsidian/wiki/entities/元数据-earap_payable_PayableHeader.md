---
tags: [BIP, 元数据, 数据字典, earap.payable.PayableHeader]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 应付结算清单基本信息 (`earap.payable.PayableHeader`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`ap_payable_h` | domain：`yonbip-ec-contract` | 应用：`STB` | 业务对象ID：`d610a7e5-78db-461c-a39c-57d3d42a26b8`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 应付结算清单基本信息 |
| 物理表 | `ap_payable_h` |
| domain/服务域 | `yonbip-ec-contract` |
| schema | `yonbip_clm_contract` |
| 所属应用 | `STB` |
| 直连字段 | 92 个 |
| 子表 | 3 个 |
| 关联引用 | 28 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `bodyItem` | `earap.payable.PayableBody` | composition |
| `approvalTasks` | `earap.payable.PayableApprovalTask` | composition |
| `bpmSteps` | `earap.payable.PayableBpmStep` | composition |

## 关联引用 (28个)

| 字段名 | 引用类型 |
|--------|---------|
| `funder_id` | `yonbip-fi-ctmtmsp.tmsp_fundbusinobj_Ref` |
| `ori_currency_id` | `ucfbasedoc.bd_currencytenantref` |
| `finance_org_id` | `ucf-org-center.bd_financeorgtreeref` |
| `activity` | `` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `project_id` | `ucfbasedoc.bd_projectcardref` |
| `wbs` | `` |
| `employee_id` | `ucf-staff-center.bd_staff_all_ref` |
| `supplier_id` | `yssupplier.aa_vendor` |
| `invoice_type_id` | `ucfbasedoc.bd_invoiceref` |
| `org_currency_id` | `ucfbasedoc.bd_currencytenantref` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `` | `` |
| `pay_agreement_id` | `ucfbasedoc.bd_payagreementref` |
| `org_id` | `ucf-org-center.org_pure_tree_ref` |
| `bill_type_id` | `ucfbasedoc.bd_billtypetreeref` |
| `cooperater` | `bip-usercenter.bip_user_ref` |
| `auditor` | `bip-usercenter.bip_user_ref` |
| `staff_id` | `ucf-staff-center.bd_staff_all_ref` |
| `dept_id` | `ucf-org-center.org_unit_tree_ref` |
| `free_ch_id` | `` |
| `ytenant_id` | `` |
| `src_app_id` | `yonbip-ec-contract.stb_sourceapplicationref` |
| `bus_type_id` | `ucfbasedoc.bd_billtyperef` |
| `exchange_rate_type_id` | `ucfbasedoc.bd_exchangeratetyperef` |
| `partner_id` | `productcenter.base_businesspartnerref` |

## 继承接口 (11个, 31字段)

- **项目结构属性** (`BGDM.wbs.projectStructureProperties`)
  - `activity` → `activity`
  - `wbs` → `wbs`
- **审批流接口** (`iuap.busiObj.ApprovalFlowItf`)
  - `auditnote` → `auditnote`
  - `auditor` → `auditor`
  - `audit_time` → `audit_time`
  - `procinst_id` → `procinst_id`
  - `verifystate` → `verifystate`
- **业务流基础** (`iuap.busiObj.BusinessFlowItf`)
  - `bizflow_id` → `bizflow_id`
  - `bizflowinstance_id` → `bizflowinstance_id`
  - `bizflow_makebillcode` → `bizflow_makebillcode`
  - `bizflowname` → `bizflowname`
  - `sourcebusiobj` → `sourcebusiobj`
  - `sourcechild_id` → `sourcechild_id`
  - `sourcecode` → `sourcecode`
  - `source_id` → `source_id`
- **业务流多来源** (`iuap.busiObj.BusinessFlowSourcesItf`)
  - `firstbusiobj` → `firstbusiobj`
  - `firstchild_id` → `firstchild_id`
  - `firstcode` → `firstcode`
  - `first_id` → `first_id`
  - `sourcegrand_id` → `sourcegrand_id`
- **交易类型** (`iuap.busiObj.BustypeItf`)
  - `bustype` → `bustype`
- **编码** (`iuap.busiObj.Code`)
  - `code` → `code`
- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`
- **打印次数** (`base.itf.IPrintCount`)
  - `printCount` → `printCount`
- **打印次数拆分** (`base.itf.IPrintCountSplit`)
  - `directPrintCount` → `directPrintCount`
  - `previewPrintCount` → `previewPrintCount`
- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 92 个直连字段

### 文本字段 (29个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `invoice_code` | `invoice_code` | `invoiceCode` | 发票代码 |
| `contract_no` | `contract_no` | `contractNo` | 合同编号 |
| `retailer_name` | `retailer_name` | `retailer` | 散户 |
| `order_no` | `order_no` | `orderNo` | 订单编号 |
| `src_bill_id` | `src_bill_id` | `srcBillId` | 来源单据ID |
| `src_bill_type` | `src_bill_type` | `srcBillType` | 来源单据类型 |
| `ext_system_code` | `ext_system_code` | `extSystemCode` | 外部系统编码 |
| `bill_code` | `bill_code` | `code` | 编码 |
| `ext_vouch_code` | `ext_vouch_code` | `extVouchCode` | 外部系统单号 |
| `invoice_no` | `invoice_no` | `invoiceNo` | 发票编号 |
| `bill_date` | `bill_date` | `billDate` | 单据日期 |
| `remarks` | `remarks` | `remarks` | 备注 |
| `dtc_gtxid` | `dtc_gtxid` | `dtcGtxId` | 全局事务ID |
| `auditnote` | `auditnote` | `auditNote` | 审批批语 |
| `bizflowinstance_id` | `bizflowinstance_id` | `bizFlowInstanceId` | 业务流实例id |
| `bizflow_makebillcode` | `bizflow_makebillcode` | `bizFlowMakeBillCode` | 单据转换规则编码 |
| `bizflow_id` | `bizflow_id` | `bizflowId` | 业务流id |
| `bizflowname` | `bizflowname` | `bizflowName` | 流程名称 |
| `firstbusiobj` | `firstbusiobj` | `firstBusiObj` | 来源业务对象 |
| `firstchild_id` | `firstchild_id` | `firstChildId` | 来源单据子表id |
| `firstcode` | `firstcode` | `firstCode` | 来源单据号 |
| `first_id` | `first_id` | `firstId` | 来源单据主表id |
| `id` | `id` | `id` | 主键 |
| `procinst_id` | `procinst_id` | `procinstId` | 流程实例ID |
| `sourcebusiobj` | `sourcebusiobj` | `sourceBusiObj` | 上游业务对象 |
| `sourcechild_id` | `sourcechild_id` | `sourceChildId` | 上游单据子表id |
| `sourcecode` | `sourcecode` | `sourceCode` | 上游单据号 |
| `sourcegrand_id` | `sourcegrand_id` | `sourceGrandId` | 来源孙表id |
| `source_id` | `source_id` | `sourceId` | 上游单据主表id |

### 引用字段 (24个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `invoice_type_id` | `invoice_type_id` | `invoiceType` | 发票类型 |
| `supplier_id` | `supplier_id` | `supplier` | 供应商 |
| `org_id` | `org_id` | `org` | 业务组织 |
| `cooperater` | `cooperater` | `cooperater` | 协同确认人 |
| `partner_id` | `partner_id` | `partner` | 业务伙伴 |
| `bus_type_id` | `bus_type_id` | `bustype` | 交易类型 |
| `bill_type_id` | `bill_type_id` | `billType` | 单据类型 |
| `staff_id` | `staff_id` | `staff` | 业务员 |
| `pay_agreement_id` | `pay_agreement_id` | `agreement` | 付款协议 |
| `creator` | `creator` | `creator` | 创建人 |
| `funder_id` | `funder_id` | `funder` | 资金业务对象 |
| `finance_org_id` | `finance_org_id` | `financeOrg` | 收票组织 |
| `employee_id` | `employee_id` | `employee` | 员工 |
| `dept_id` | `dept_id` | `dept` | 部门 |
| `project_id` | `project_id` | `project` | 项目 |
| `src_app_id` | `src_app_id` | `srcApp` | 来源应用 |
| `ori_currency_id` | `ori_currency_id` | `oriCurrency` | 原币币种 |
| `org_currency_id` | `org_currency_id` | `orgCurrency` | 本币 |
| `exchange_rate_type_id` | `exchange_rate_type_id` | `exchangeRateType` | 汇率类型 |
| `activity` | `activity` | `activity` | 活动 |
| `auditor` | `auditor` | `auditor` | 审批人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `wbs` | `wbs` | `wbs` | WBS |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `invoice_date` | `invoice_date` | `invoiceDate` | 发票日期 |
| `exchange_rate_date` | `exchange_rate_date` | `exchangeRateDate` | 汇率日期 |

### 日期时间 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cooperate_time` | `cooperate_time` | `cooperateTime` | 协同确认时间 |
| `effect_time` | `effect_time` | `effectTime` | 生效时间 |
| `audit_date` | `audit_date` | `auditDate` | 审核日期 |
| `audit_time` | `audit_time` | `auditTime` | 审批日期 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bln_write_off` | `bln_write_off` | `blnWriteOff` | 是否冲销单 |

### 枚举字段 (14个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cooperate_state` | `cooperate_state` | `cooperateState` | 协同确认状态 |
| `cooperate_flag` | `cooperate_flag` | `cooperateFlag` | 协同标识 |
| `src_system` | `src_system` | `srcSystem` | 来源系统 |
| `business_type` | `business_type` | `businessType` | 业务类型 |
| `object_type` | `object_type` | `objectType` | 往来对象类型 |
| `direction` | `direction` | `direction` | 单据方向 |
| `status` | `status` | `status` | 单据状态 |
| `busi_post_status` | `busi_post_status` | `postStatus` | 过账状态 |
| `write_off_state` | `write_off_state` | `writeOffState` | 冲销状态 |
| `effect_state` | `effect_state` | `effectState` | 生效状态 |
| `accounting_method` | `accounting_method` | `accountingMethod` | 立账方式 |
| `tax_method` | `tax_method` | `taxMethod` | 计税方式 |
| `exchange_rate_ops` | `exchange_rate_ops` | `exchangeRateOps` | 汇率折算方式 |
| `verifystate` | `verifystate` | `verifyState` | 单据状态 |

### 整数 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dtc_status` | `dtc_status` | `dtcStatus` | 全局事务状态 |
| `eeac_version` | `eeac_version` | `eeacVersion` | 事项中心版本号 |
| `print_count` | `print_count` | `printCount` | 打印次数 |
| `preview_print_count` | `preview_print_count` | `previewPrintCount` | 预览打印次数 |
| `direct_print_count` | `direct_print_count` | `directPrintCount` | 直接打印次数 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ori_tax_excluded_amount` | `ori_tax_excluded_amount` | `oriTaxExcludedAmount` | 无税金额 |
| `ori_tax_included_amount` | `ori_tax_included_amount` | `oriTaxIncludedAmount` | 含税金额 |
| `local_tax_excluded_amount` | `local_tax_excluded_amount` | `localTaxExcludedAmount` | 本币无税金额 |
| `local_tax_included_amount` | `local_tax_included_amount` | `localTaxIncludedAmount` | 本币含税金额 |
| `exchange_rate` | `exchange_rate` | `exchangeRate` | 汇率 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `free_ch_id` | `free_ch_id` | `freeChId` | 自定义特征 |

### other (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `approvalTasks` | 应付结算清单审批任务信息 |
| `` | `` | `bodyItem` | 应付结算清单明细信息 |
| `` | `` | `bpmSteps` | 应付结算清单业务阶段信息 |
