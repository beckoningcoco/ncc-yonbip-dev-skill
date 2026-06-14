---
tags: [BIP, 元数据, 数据字典, RVN.RVN.RclOutboundInfoHeader]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 出库信息主表 (`RVN.RVN.RclOutboundInfoHeader`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`rcl_outboundinfo_h` | domain：`yonbip-fi-ercl` | 应用：`RVN` | 业务对象ID：`9b3513e7-ab6c-4a80-8e3f-a5d452e54ab1`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 出库信息主表 |
| 物理表 | `rcl_outboundinfo_h` |
| domain/服务域 | `yonbip-fi-ercl` |
| schema | `fiercl` |
| 所属应用 | `RVN` |
| 直连字段 | 67 个 |
| 子表 | 1 个 |
| 关联引用 | 16 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `RclOutboundInfoBodyList` | `RVN.RVN.RclOutboundInfoBody` | composition |

## 关联引用 (16个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `org_currtype` | `ucfbasedoc.bd_currencytenantref` |
| `bill_type_id` | `ucfbasedoc.bd_billtypetreeref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `auditor` | `bip-usercenter.bip_user_ref` |
| `free_ch_id` | `` |
| `ytenant_id` | `` |
| `accentity` | `ucf-org-center.bd_financeorgtreeref` |
| `bustype` | `ucfbasedoc.bd_billtyperef` |
| `ori_currtype` | `ucfbasedoc.bd_currencytenantref` |
| `exchange_rate_type` | `ucfbasedoc.bd_exchangeratetyperef` |
| `src_billtype` | `ucfbasedoc.bd_billtyperef` |
| `src_transtype` | `ucfbasedoc.bd_billtyperef` |
| `src_system` | `fiepub.fiepub_sourceapplicationref` |
| `` | `` |
| `customer` | `productcenter.aa_invoicemerchantref` |

## 继承接口 (8个, 26字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`
- **编码** (`iuap.busiObj.Code`)
  - `code` → `code`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **业务流多来源** (`iuap.busiObj.BusinessFlowSourcesItf`)
  - `firstbusiobj` → `firstbusiobj`
  - `firstchild_id` → `firstchild_id`
  - `firstcode` → `firstcode`
  - `first_id` → `first_id`
  - `sourcegrand_id` → `sourcegrand_id`
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
- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`
- **交易类型** (`iuap.busiObj.BustypeItf`)
  - `bustype` → `bustype`

## 字段列表（按类型分组）

> 共 67 个直连字段

### 文本字段 (30个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `charge_off_bill_id` | `charge_off_bill_id` | `chargeOffBillId` | 冲销单ID |
| `charge_off_bill_no` | `charge_off_bill_no` | `chargeOffBillNo` | 冲销单据号 |
| `data_version` | `data_version` | `dataVersion` | 版本号 |
| `dtc_gtxid` | `dtc_gtxid` | `dtcGtxid` | 全局分布式事务ID |
| `ext_src_bill_id` | `ext_src_bill_id` | `extSrcBillId` | 来源单据id(外) |
| `ext_src_billcode` | `ext_src_billcode` | `extSrcBillNo` | 来源单据号(外) |
| `ext_src_billtype_code` | `ext_src_billtype_code` | `extSrcBilltypeCode` | 来源单据类型编码(外) |
| `ext_src_system` | `ext_src_system` | `extSrcSystem` | 来源系统(外) |
| `ext_src_transtype_code` | `ext_src_transtype_code` | `extSrcTranstypeCode` | 来源交易类型编码(外) |
| `failed_reason` | `failed_reason` | `failedReason` | 回写失败原因 |
| `note` | `note` | `note` | 备注 |
| `src_bill_id` | `src_bill_id` | `srcBillId` | 来源单据id |
| `src_bill_no` | `src_bill_no` | `srcBillNo` | 来源单据号 |
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

### 引用字段 (14个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accentity` | `accentity` | `accentity` | 会计主体 |
| `bill_type_id` | `bill_type_id` | `billType` | 单据类型 |
| `bustype` | `bustype` | `bustype` | 交易类型 |
| `customer` | `customer` | `customer` | 客户 |
| `exchange_rate_type` | `exchange_rate_type` | `exchangeRateType` | 汇率类型 |
| `org_currtype` | `org_currtype` | `orgCurrtype` | 本位币 |
| `ori_currtype` | `ori_currtype` | `oriCurrtype` | 币种 |
| `src_billtype` | `src_billtype` | `srcBilltype` | 来源单据类型 |
| `src_system` | `src_system` | `srcSystem` | 来源应用 |
| `src_transtype` | `src_transtype` | `srcTranstype` | 来源交易类型 |
| `auditor` | `auditor` | `auditor` | 审批人 |
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
| `is_open_reverse` | `is_open_reverse` | `isOpenReverse` | 期初回冲 |
| `is_charge_off` | `is_charge_off` | `isChargeOff` | 是否被冲销 |

### 枚举字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_type` | `create_type` | `createType` | 创建方式 |
| `verifystate` | `verifystate` | `verifyState` | 单据状态 |
| `exch_rate_ops` | `exch_rate_ops` | `exchRateOps` | 汇率折算方式 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dtc_status` | `dtc_status` | `dtcStatus` | 分布式事务的状态 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `exchange_rate` | `exchange_rate` | `exchangeRate` | 汇率 |
| `localmny` | `localmny` | `localmny` | 本币含税金额 |
| `localmny_notax` | `localmny_notax` | `localmnyNotax` | 本币无税金额 |
| `localmny_tax` | `localmny_tax` | `localmnyTax` | 本币税额 |
| `orimny` | `orimny` | `orimny` | 含税金额 |
| `orimny_notax` | `orimny_notax` | `orimnyNoTax` | 无税金额 |
| `orimny_tax` | `orimny_tax` | `orimnyTax` | 税额 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `free_ch_id` | `free_ch_id` | `freeChId` | 特征 |

### bigText (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `write_back_failure_reason` | `write_back_failure_reason` | `writeBackFailureReason` | 回写履约义务失败原因 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `RclOutboundInfoBodyList` | 出库信息子表 |
