---
tags: [BIP, 元数据, 数据字典, FIAP.FIAP.APVerifyEvent]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 应付核销基本信息 (`FIAP.FIAP.APVerifyEvent`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`arap_ledger_h` | domain：`yonbip-fi-earap` | 应用：`EAP` | 业务对象ID：`8a9f25d2-edb3-47c5-ab2d-afc9445199ec`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 应付核销基本信息 |
| 物理表 | `arap_ledger_h` |
| 数据库 schema | `yonbip-fi-earap` |
| 所属应用 | `EAP` |
| 直连字段 | 76 个 |
| 子表 | 1 个 |
| 关联引用 | 24 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `bodyItem` | `FIAP.FIAP.APVerifyEventBody` | composition |

## 关联引用 (24个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `` | `` |
| `finance_org_id` | `ucf-org-center.bd_financeorgtreeref` |
| `ori2_currency_id` | `ucfbasedoc.bd_currencytenantref` |
| `supplier_id` | `yssupplier.aa_vendor` |
| `gbl_currency_id` | `ucfbasedoc.bd_currencytenantref` |
| `voucher_type_id` | `fiepub.epub_vouchertype_ref` |
| `carryover_year_id` | `finbd.bd_period` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `carryover_period_id` | `finbd.bd_period` |
| `employee_id` | `ucf-staff-center.bd_staff_all_ref` |
| `event_type_id` | `yonbip-fi-eaai2.RefTable_a70ca2f048` |
| `ytenant_id` | `` |
| `acc_purpose` | `finbd.bd_accpurposeref` |
| `acc_period_id` | `finbd.bd_period` |
| `acc_book_id` | `fiepub.fiepub_accountbookref` |
| `acc_year_id` | `finbd.bd_period` |
| `customer_id` | `productcenter.aa_invoicemerchantref` |
| `mid_currency_id` | `ucfbasedoc.bd_currencytenantref` |
| `acc_currency_id` | `ucfbasedoc.bd_currencytenantref` |
| `grp_currency_id` | `ucfbasedoc.bd_currencytenantref` |
| `org_currency_id` | `ucfbasedoc.bd_currencytenantref` |
| `funder_id` | `yonbip-fi-ctmtmsp.tmsp_fundbusinobj_Ref` |
| `ori_currency_id` | `ucfbasedoc.bd_currencytenantref` |

## 继承接口 (5个, 13字段)

- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`
- **收付结转主表** (`FIAP.FIAP.IEARAPCarryover`)
  - `bln_carryover` → `bln_carryover`
  - `carryover_event_id` → `carryover_event_id`
  - `carryover_period_id` → `carryover_period_id`
  - `carryover_period_code` → `carryover_period_code`
  - `carryover_year_id` → `carryover_year_id`
  - `carryover_year_code` → `carryover_year_code`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **编码** (`iuap.busiObj.Code`)
  - `code` → `code`
- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 76 个直连字段

### 文本字段 (23个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_date` | `acc_date` | `accDate` | 记账日期 |
| `acc_period_code` | `acc_period_code` | `accPeriodCode` | 会计期间 |
| `acc_year_code` | `acc_year_code` | `accYearCode` | 会计年度 |
| `batch_no` | `batch_no` | `batchno` | 核销批次号 |
| `bln_effect` | `bln_effect` | `blnEffect` | 生效状态 |
| `src_bill_date` | `src_bill_date` | `busDate` | 核销日期 |
| `check_error_msg` | `check_error_msg` | `checkErrorMsg` | 会计事务校验异常信息 |
| `clue_no` | `clue_no` | `clueNo` | 线索ID |
| `event_code` | `event_code` | `code` | 核销事务记录号 |
| `dtc_gtxid` | `dtc_gtxid` | `dtcGtxid` | 全局事务ID |
| `entry_code` | `entry_code` | `entryCode` | 事项分录编号 |
| `entry_id` | `entry_id` | `entryId` | 事项分录ID |
| `post_status_code` | `post_status_code` | `postStatusCode` | 事项分录生成状态编码 |
| `remarks` | `remarks` | `remarks` | 备注 |
| `src_app_id` | `src_app_id` | `srcApp` | 来源应用 |
| `src_event_id` | `src_event_id` | `srcEvent` | 来源事务ID |
| `status` | `status` | `status` | 事务状态 |
| `voucher_code` | `voucher_code` | `voucherCode` | 凭证编号 |
| `voucher_id` | `voucher_id` | `voucherId` | 凭证ID |
| `carryover_event_id` | `carryover_event_id` | `carryoverEvent` | 结转事务 |
| `carryover_period_code` | `carryover_period_code` | `carryoverPeriodCode` | 结转期间编码 |
| `carryover_year_code` | `carryover_year_code` | `carryoverYearCode` | 结转年度编码 |
| `id` | `id` | `id` | 主键 |

### 引用字段 (23个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_book_id` | `acc_book_id` | `accBook` | 财务账簿ID |
| `acc_currency_id` | `acc_currency_id` | `accCurrency` | 账簿本币 |
| `acc_period_id` | `acc_period_id` | `accPeriod` | 会计期间ID |
| `acc_purpose` | `acc_purpose` | `accPurpose` | 核算目的ID |
| `acc_year_id` | `acc_year_id` | `accYear` | 会计年度ID |
| `customer_id` | `customer_id` | `customerId` | 客户 |
| `employee_id` | `employee_id` | `employeeId` | 员工 |
| `event_type_id` | `event_type_id` | `eventType` | 会计事务ID |
| `finance_org_id` | `finance_org_id` | `financeOrg` | 会计主体ID |
| `funder_id` | `funder_id` | `funderId` | 资金业务伙伴 |
| `gbl_currency_id` | `gbl_currency_id` | `gblCurrency` | 全局本币 |
| `grp_currency_id` | `grp_currency_id` | `grpCurrency` | 集团本币 |
| `mid_currency_id` | `mid_currency_id` | `midCurrency` | 核销中间币 |
| `org_currency_id` | `org_currency_id` | `orgCurrency` | 组织本币 |
| `ori2_currency_id` | `ori2_currency_id` | `oriCCurrency` | 贷方原币 |
| `ori_currency_id` | `ori_currency_id` | `oriDCurrency` | 借方原币 |
| `supplier_id` | `supplier_id` | `supplierId` | 供应商 |
| `voucher_type_id` | `voucher_type_id` | `voucherType` | 凭证类型 |
| `carryover_period_id` | `carryover_period_id` | `carryoverPeriod` | 结转期间 |
| `carryover_year_id` | `carryover_year_id` | `carryoverYear` | 结转年度 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bln_write_off` | `bln_write_off` | `blnWriteOff` | 是否冲销 |

### 枚举字段 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_convert_param` | `acc_convert_param` | `accConvertParam` | 账簿币折算参数 |
| `arap_event_type` | `arap_event_type` | `arapEventType` | 收付会计事务 |
| `gbl_convert_param` | `gbl_convert_param` | `gblConvertParam` | 全局币折算参数 |
| `grp_convert_param` | `grp_convert_param` | `grpConvertParam` | 集团币折算参数 |
| `org_convert_param` | `org_convert_param` | `orgConvertParam` | 组织币折算参数 |
| `post_state` | `post_state` | `postState` | 过账状态 |
| `verify_curr_rule` | `verify_curr_rule` | `verifyCurrRule` | 币种核销规则 |
| `verify_type` | `verify_type` | `verifyType` | 核销分类 |
| `verify_way` | `verify_way` | `verifyWay` | 核销方式 |
| `write_off_state` | `write_off_state` | `writeOffState` | 冲销状态 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dtc_status` | `dtc_status` | `dtcStatus` | 全局事务状态 |

### 短整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bln_carryover` | `bln_carryover` | `blnCarryover` | 是否结转 |
| `dr` | `dr` | `dr` | 逻辑删除 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `send_data_version` | `send_data_version` | `sendDataVersion` | 版本号控制 |

### 数值字段 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc2_amount` | `acc2_amount` | `accCAmount` | 贷方本币金额 |
| `acc_amount` | `acc_amount` | `accDAmount` | 借方本币金额 |
| `gbl2_amount` | `gbl2_amount` | `gblCAmount` | 贷方全局币金额 |
| `gbl_amount` | `gbl_amount` | `gblDAmount` | 借方全局币金额 |
| `grp2_amount` | `grp2_amount` | `grpCAmount` | 贷方集团币金额 |
| `grp_amount` | `grp_amount` | `grpDAmount` | 借方集团币金额 |
| `org2_amount` | `org2_amount` | `orgCAmount` | 贷方组织币金额 |
| `org_amount` | `org_amount` | `orgDAmount` | 借方组织币金额 |
| `ori2_amount` | `ori2_amount` | `oriCAmount` | 贷方金额 |
| `ori_amount` | `ori_amount` | `oriDAmount` | 借方金额 |

### multipleOption (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `object_type` | `object_type` | `objectType` | 往来对象类型 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `bodyItem` | 应付核销分组信息 |
