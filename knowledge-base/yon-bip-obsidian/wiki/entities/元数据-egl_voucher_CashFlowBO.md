---
tags: [BIP, 元数据, 数据字典, egl.voucher.CashFlowBO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 现金流量项目 (`egl.voucher.CashFlowBO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`cf_cashflow` | domain：`yonbip-fi-egl` | 应用：`GL` | 业务对象ID：`1bb925c0-6ded-4ee6-8431-67123091b280`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 现金流量项目 |
| 物理表 | `cf_cashflow` |
| domain/服务域 | `yonbip-fi-egl` |
| schema | `figl` |
| 所属应用 | `GL` |
| 直连字段 | 51 个 |
| 子表 | 0 个 |
| 关联引用 | 15 个 |

## 关联引用 (15个)

| 字段名 | 引用类型 |
|--------|---------|
| `acc_period_id` | `finbd.bd_period` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `vouchertype` | `fiepub.epub_vouchertype_ref` |
| `cashflowitem` | `fiepub.fiepub_cashflowitecommref` |
| `voucher` | `yonbip-fi-egl.RefTable_bac0ea5062` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `two_level_accentity_id` | `ucf-org-center.org_pure_tree_ref` |
| `ytenant_id` | `` |
| `accsubject_vid` | `fiepub.epub_accsubjectversion_treecard_ref` |
| `innerorg` | `ucf-org-center.bd_financeorgtreeref` |
| `auxid` | `` |
| `voucherrecord` | `` |
| `accbook` | `fiepub.fiepub_accountbookref` |
| `currency` | `ucfbasedoc.bd_currencytenantref` |
| `acc_year_id` | `finbd.bd_periodyear` |

## 继承接口 (2个, 5字段)

- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`

## 字段列表（按类型分组）

> 共 51 个直连字段

### 文本字段 (19个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accsubjectid` | `accsubjectid` | `accSubjectId` | 科目OID |
| `acc_year_code` | `acc_year_code` | `accYearCode` | 会计年编码 |
| `business_id` | `business_id` | `businessId` | 业务方id |
| `def2` | `def2` | `def2` | 自定义项2 |
| `description` | `description` | `description` | 描述 |
| `direction` | `direction` | `direction` | 现金流方向 |
| `flag` | `flag` | `flag` | 期初标志 |
| `id` | `id` | `id` | 主键ID |
| `name` | `name` | `name` | 名称(废弃) |
| `period` | `period` | `period` | 期间号 |
| `periodadjust` | `periodadjust` | `periodAdjust` | 调整期间 |
| `periodunion` | `periodunion` | `periodUnion` | 会计期间号 |
| `relateid` | `relateid` | `relateId` | 主附表关联标识 |
| `reversedcashflowid` | `reversedcashflowid` | `reversedCashFlowId` | 被冲销的现金流量分录id |
| `rule` | `rule` | `rule` | 使用模板(废弃) |
| `source_type` | `source_type` | `sourceType` | 来源类型 |
| `tenantid` | `tenantid` | `tenantId` | 租户id(废弃) |
| `voucherdescription` | `voucherdescription` | `voucherDescription` | 凭证分录摘要 |
| `voucherstatus` | `voucherstatus` | `voucherStatus` | 凭证状态 |

### 引用字段 (15个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accbook` | `accbook` | `accBook` | 账簿 |
| `acc_period_id` | `acc_period_id` | `accPeriodId` | 期间 |
| `accsubject_vid` | `accsubject_vid` | `accSubjectVid` | 会计科目VID |
| `acc_year_id` | `acc_year_id` | `accYearId` | 会计年 |
| `auxid` | `auxid` | `auxId` | 辅助核算 |
| `cashflowitem` | `cashflowitem` | `cashFlowItem` | 现金流量项目 |
| `creator` | `creator` | `creator` | 创建人 |
| `currency` | `currency` | `currency` | 币种 |
| `innerorg` | `innerorg` | `innerOrg` | 内部单位 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `two_level_accentity_id` | `two_level_accentity_id` | `twoLevelAccentityId` | 内部核算单元 |
| `voucher` | `voucher` | `voucher` | 凭证ID |
| `voucherrecord` | `voucherrecord` | `voucherRecord` | 凭证分录 |
| `vouchertype` | `vouchertype` | `voucherType` | 凭证类型 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ts` | `ts` | `ts` | 最后修改时间 |
| `version` | `version` | `version` | 凭证版本 |
| `vouchermaketime` | `vouchermaketime` | `voucherMakeTime` | 凭证制单日期 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `manual` | `manual` | `manual` | 是否手工分析 |

### 整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除字段(实际没用) |
| `voucherbillcode` | `voucherbillcode` | `voucherBillCode` | 凭证号 |
| `voucherrecordnumber` | `voucherrecordnumber` | `voucherRecordNumber` | 凭证分录行号 |

### 数值字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `amountglobal` | `amountglobal` | `amountGlobal` | 全局币金额 |
| `amountgroup` | `amountgroup` | `amountGroup` | 集团币金额 |
| `amountorg` | `amountorg` | `amountOrg` | 账簿本币金额 |
| `amountorganize` | `amountorganize` | `amountOrganize` | 组织币金额 |
| `amountoriginal` | `amountoriginal` | `amountOriginal` | 原币金额 |

### bigText (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accsubject` | `accsubject` | `accSubject` | 本方科目编码 |
| `oppsubject` | `oppsubject` | `oppSubject` | 对方科目编码 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `creationtime` | `creationtime` | `createTime` | 创建时间 |
| `modifiedtime` | `modifiedtime` | `modifyTime` | 修改时间 |
| `ts` | `ts` | `pubts` | pubts |
