---
tags: [BIP, 元数据, 数据字典, RCL.RCL.RclRecConfirmInfoHeader]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 客户确认信息主表 (`RCL.RCL.RclRecConfirmInfoHeader`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`rcl_recconfirminfo_h` | domain：`yonbip-fi-ercl` | 应用：`RVN` | 业务对象ID：`eda3ce95-8f5c-4342-850c-26312538b844`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 客户确认信息主表 |
| 物理表 | `rcl_recconfirminfo_h` |
| domain/服务域 | `yonbip-fi-ercl` |
| schema | `fiercl` |
| 所属应用 | `RVN` |
| 直连字段 | 63 个 |
| 子表 | 1 个 |
| 关联引用 | 13 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `rclRecConfirmInfoBodyList` | `RCL.RCL.RclRecConfirmInfoBody` | composition |

## 关联引用 (13个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `receipt_type` | `ucfbasedoc.bd_billtyperef` |
| `` | `` |
| `bill_type_id` | `ucfbasedoc.bd_billtypetreeref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `auditor` | `bip-usercenter.bip_user_ref` |
| `free_ch_id` | `` |
| `ytenant_id` | `` |
| `accentity` | `ucf-org-center.bd_financeorgtreeref` |
| `ori_currtype_id` | `ucfbasedoc.bd_currencytenantref` |
| `bustype` | `ucfbasedoc.bd_billtyperef` |
| `exchange_rate_type_id` | `ucfbasedoc.bd_exchangeratetyperef` |
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

> 共 63 个直连字段

### 文本字段 (29个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `data_version` | `data_version` | `dataVersion` | 数据版本 |
| `dtc_gtxid` | `dtc_gtxid` | `dtcGtxid` | 分布式事务ID |
| `error_msg` | `error_msg` | `errorMsg` | 回写履约义务失败原因 |
| `ext_src_billcode` | `ext_src_billcode` | `extSrcBillCode` | 来源单据编码(外) |
| `ext_src_systems` | `ext_src_systems` | `extSrcSystems` | 来源单据系统(外) |
| `remarks` | `remarks` | `remarks` | 备注 |
| `reverse_bill_code` | `reverse_bill_code` | `reverseBillCode` | 冲销单据号 |
| `reverse_bill_id` | `reverse_bill_id` | `reverseBillId` | 冲销单据ID |
| `src_application` | `src_application` | `srcApplication` | 来源应用 |
| `src_bill_id` | `src_bill_id` | `srcBillId` | 来源单据ID |
| `src_bill_no` | `src_bill_no` | `srcBillNo` | 来源单据编码 |
| `src_system` | `src_system` | `srcSystem` | 来源系统 |
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

### 引用字段 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accentity` | `accentity` | `accentity` | 会计主体 |
| `bill_type_id` | `bill_type_id` | `billType` | 单据类型 |
| `customer_id` | `customer_id` | `customer` | 客户 |
| `exchange_rate_type_id` | `exchange_rate_type_id` | `exchangeRateType` | 汇率类型 |
| `ori_currtype_id` | `ori_currtype_id` | `oriCurrtype` | 币种 |
| `receipt_type` | `receipt_type` | `receiptType` | 签收类型 |
| `auditor` | `auditor` | `auditor` | 审批人 |
| `bustype` | `bustype` | `bustype` | 交易类型 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bill_date` | `bill_date` | `billDate` | 单据日期 |
| `exchange_rate_date` | `exchange_rate_date` | `exchangeRateDate` | 汇率日期 |

### 日期时间 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_time` | `audit_time` | `auditTime` | 审批日期 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `is_reverse` | `is_reverse` | `isReverse` | 是否冲销 |
| `is_open_reverse` | `is_open_reverse` | `isOpenReverse` | 期初回冲 |

### 枚举字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `contract_conversion_params` | `contract_conversion_params` | `contractConversionParams` | 合同币折算参数 |
| `dtc_status` | `dtc_status` | `dtcStatus` | 分布式事务状态 |
| `post_state` | `post_state` | `postState` | 过账状态 |
| `verifystate` | `verifystate` | `verifyState` | 单据状态 |
| `exch_rate_ops` | `exch_rate_ops` | `exchRateOps` | 汇率折算方式 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

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
| `free_ch_id` | `free_ch_id` | `freeChId` | 特征 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `rclRecConfirmInfoBodyList` | 客户确认信息子表 |
