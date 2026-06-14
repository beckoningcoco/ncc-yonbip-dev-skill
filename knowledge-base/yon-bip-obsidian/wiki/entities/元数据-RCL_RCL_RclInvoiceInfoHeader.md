---
tags: [BIP, 元数据, 数据字典, RCL.RCL.RclInvoiceInfoHeader]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 开票信息表头 (`RCL.RCL.RclInvoiceInfoHeader`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`rcl_invoiceinfo_h` | domain：`yonbip-fi-ercl` | 应用：`RVN` | 业务对象ID：`4ccecaa4-de21-4116-bf41-750771fc64ca`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 开票信息表头 |
| 物理表 | `rcl_invoiceinfo_h` |
| domain/服务域 | `yonbip-fi-ercl` |
| schema | `fiercl` |
| 所属应用 | `RVN` |
| 直连字段 | 77 个 |
| 子表 | 1 个 |
| 关联引用 | 18 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `rclInvoiceInfoBodyList` | `RCL.RCL.RclInvoiceInfoBody` | composition |

## 关联引用 (18个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `invoice_org` | `ucf-org-center.bd_financeorgtreeref` |
| `org_currtype` | `ucfbasedoc.bd_currencytenantref` |
| `org_id` | `ucf-org-center.org_pure_tree_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `auditor` | `bip-usercenter.bip_user_ref` |
| `free_ch_id` | `` |
| `ytenant_id` | `` |
| `invoice_customer` | `productcenter.aa_invoicemerchantref` |
| `src_bill_type` | `ucfbasedoc.bd_billtypetreeref` |
| `bustype` | `ucfbasedoc.bd_billtyperef` |
| `ori_currtype` | `ucfbasedoc.bd_currencytenantref` |
| `` | `` |
| `exchange_rate_type_id` | `ucfbasedoc.bd_exchangeratetyperef` |
| `bill_type` | `ucfbasedoc.bd_billtypetreeref` |
| `invoice_type_id` | `ucfbasedoc.bd_invoiceref` |
| `src_busi_type` | `ucfbasedoc.bd_billtyperef` |
| `customer_id` | `productcenter.aa_invoicemerchantref` |

## 继承接口 (8个, 26字段)

- **交易类型** (`iuap.busiObj.BustypeItf`)
  - `bustype` → `bustype`
- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`
- **业务流基础** (`iuap.busiObj.BusinessFlowItf`)
  - `bizflow_id` → `bizflow_id`
  - `bizflowinstance_id` → `bizflowinstance_id`
  - `bizflow_makebillcode` → `bizflow_makebillcode`
  - `bizflowname` → `bizflowname`
  - `sourcebusiobj` → `sourcebusiobj`
  - `sourcechild_id` → `sourcechild_id`
  - `sourcecode` → `sourcecode`
  - `source_id` → `source_id`
- **审批流接口** (`iuap.busiObj.ApprovalFlowItf`)
  - `auditnote` → `auditnote`
  - `auditor` → `auditor`
  - `audit_time` → `audit_time`
  - `procinst_id` → `procinst_id`
  - `verifystate` → `verifystate`
- **业务流多来源** (`iuap.busiObj.BusinessFlowSourcesItf`)
  - `firstbusiobj` → `firstbusiobj`
  - `firstchild_id` → `firstchild_id`
  - `firstcode` → `firstcode`
  - `first_id` → `first_id`
  - `sourcegrand_id` → `sourcegrand_id`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **编码** (`iuap.busiObj.Code`)
  - `code` → `code`
- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 77 个直连字段

### 文本字段 (33个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `blue_invoice_code` | `blue_invoice_code` | `buleInvoiceCode` | 蓝字发票代码 |
| `blue_invoice_num` | `blue_invoice_num` | `buleInvoiceNum` | 蓝字发票号码 |
| `customer_code` | `customer_code` | `customerCode` | 客户编码 |
| `ext_src_bill_id` | `ext_src_bill_id` | `extSrcBillId` | 来源单据id(外) |
| `ext_src_billcode` | `ext_src_billcode` | `extSrcBillcode` | 来源单据编码(外) |
| `ext_src_billtype_code` | `ext_src_billtype_code` | `extSrcBilltypeCode` | 来源单据类型编码(外) |
| `ext_src_systems` | `ext_src_systems` | `extSrcSystems` | 来源单据系统(外) |
| `ext_src_transtype_code` | `ext_src_transtype_code` | `extSrcTranstypeCode` | 来源交易类型编码(外) |
| `invoice_code` | `invoice_code` | `invoiceCode` | 发票代码 |
| `invoice_customer_code` | `invoice_customer_code` | `invoiceCustomerCode` | 开票客户编码 |
| `invoice_num` | `invoice_num` | `invoiceNum` | 发票号码 |
| `remarks` | `remarks` | `remarks` | 备注 |
| `retailer_name` | `retailer_name` | `retailer` | 散户 |
| `src_bill_id` | `src_bill_id` | `srcBillId` | 来源单据ID |
| `src_code` | `src_code` | `srcCode` | 来源单据号 |
| `src_system` | `src_system` | `srcSystem` | 来源应用 |
| `auditnote` | `auditnote` | `auditNote` | 审批批语 |
| `procinst_id` | `procinst_id` | `procinstId` | 流程实例ID |
| `id` | `id` | `id` | 主键 |
| `bizflowinstance_id` | `bizflowinstance_id` | `bizFlowInstanceId` | 业务流实例id |
| `bizflow_makebillcode` | `bizflow_makebillcode` | `bizFlowMakeBillCode` | 单据转换规则编码 |
| `bizflow_id` | `bizflow_id` | `bizflowId` | 业务流id |
| `bizflowname` | `bizflowname` | `bizflowName` | 流程名称 |
| `sourcebusiobj` | `sourcebusiobj` | `sourceBusiObj` | 上游业务对象 |
| `sourcechild_id` | `sourcechild_id` | `sourceChildId` | 上游单据子表id |
| `sourcecode` | `sourcecode` | `sourceCode` | 上游单据号 |
| `source_id` | `source_id` | `sourceId` | 上游单据主表id |
| `firstbusiobj` | `firstbusiobj` | `firstBusiObj` | 来源业务对象 |
| `firstchild_id` | `firstchild_id` | `firstChildId` | 来源单据子表id |
| `firstcode` | `firstcode` | `firstCode` | 来源单据号 |
| `first_id` | `first_id` | `firstId` | 来源单据主表id |
| `sourcegrand_id` | `sourcegrand_id` | `sourceGrandId` | 来源孙表id |
| `code` | `code` | `code` | 编码 |

### 引用字段 (16个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bill_type` | `bill_type` | `billtype` | 单据类型 |
| `bustype` | `bustype` | `bustype` | 交易类型 |
| `customer_id` | `customer_id` | `customer` | 客户 |
| `exchange_rate_type_id` | `exchange_rate_type_id` | `exchangeRateType` | 汇率类型 |
| `invoice_customer` | `invoice_customer` | `invoiceCustomer` | 开票客户 |
| `invoice_org` | `invoice_org` | `invoiceOrg` | 开票组织 |
| `invoice_type_id` | `invoice_type_id` | `invoiceType` | 发票类型 |
| `org_id` | `org_id` | `org` | 业务组织 |
| `org_currtype` | `org_currtype` | `orgCurrtype` | 本币币种 |
| `ori_currtype` | `ori_currtype` | `oriCurrtype` | 币种 |
| `src_bill_type` | `src_bill_type` | `srcBillType` | 来源单据类型 |
| `src_busi_type` | `src_busi_type` | `srcBusiType` | 来源交易类型 |
| `auditor` | `auditor` | `auditor` | 审批人 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `exchange_rate_date` | `exchange_rate_date` | `exchangeRateDate` | 汇率日期 |
| `invoice_date` | `invoice_date` | `invoiceDate` | 开票日期 |

### 日期时间 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_time` | `audit_time` | `auditTime` | 审批日期 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### 布尔字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bln_cancellation` | `bln_cancellation` | `blnCancellation` | 是否作废 |
| `cancel_bill` | `cancel_bill` | `cancelBill` | 是否作废单 |
| `canceled` | `canceled` | `cancelled` | 是否被作废 |

### 枚举字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bill_status` | `bill_status` | `billstatus` | 单据状态 |
| `contract_conversion_params` | `contract_conversion_params` | `contractConversionParams` | 合同币折算参数 |
| `create_type` | `create_type` | `createType` | 生成方式 |
| `direction` | `direction` | `direction` | 单据方向 |
| `object_type` | `object_type` | `objectType` | 往来对象类型 |
| `post_state` | `post_state` | `postState` | 过账状态 |
| `exch_rate_ops` | `exch_rate_ops` | `exchRateOps` | 汇率折算方式 |
| `verifystate` | `verifystate` | `verifyState` | 单据状态 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `data_version` | `data_version` | `dataVersion` | 数据版本 |

### 数值字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `exchange_rate` | `exchange_rate` | `exchangeRate` | 汇率 |
| `local_money` | `local_money` | `localMoney` | 本币含税金额 |
| `local_tax` | `local_tax` | `localTax` | 本币税额 |
| `money` | `money` | `money` | 含税金额 |
| `no_tax_local_money` | `no_tax_local_money` | `noTaxLocalMoney` | 本币无税金额 |
| `no_tax_money` | `no_tax_money` | `noTaxMoney` | 无税金额 |
| `tax` | `tax` | `tax` | 税额 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `free_ch_id` | `free_ch_id` | `freeChId` | 自定义特征 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `rclInvoiceInfoBodyList` | 开票信息表体 |
