---
tags: [BIP, 元数据, 数据字典, GL.cashflow.GlCashflowBO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 现金流量 (`GL.cashflow.GlCashflowBO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`cf_cashflow` | domain：`yonbip-fi-egl` | 应用：`GL` | 业务对象ID：`df2321fc-9b92-4da8-bed5-9a9b5d6598b3`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 现金流量 |
| 物理表 | `cf_cashflow` |
| 数据库 schema | `yonbip-fi-egl` |
| 所属应用 | `GL` |
| 直连字段 | 57 个 |
| 子表 | 0 个 |
| 关联引用 | 15 个 |

## 关联引用 (15个)

| 字段名 | 引用类型 |
|--------|---------|
| `acc_period_id` | `finbd.bd_period` |
| `accsubject` | `fiepub.fiepub_accsubjectref` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `accsubject_vid` | `fiepub.epub_accsubject_treetableref` |
| `voucher` | `yonbip-fi-egl.RefTable_bac0ea5062` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `two_level_accentity_id` | `ucf-org-center.org_pure_tree_ref_na` |
| `ytenant_id` | `` |
| `cashflowitem` | `fiepub.fiepub_cashflowitecommref` |
| `accbook` | `fiepub.fiepub_accountbookref` |
| `vouchertype` | `fiepub.epub_vouchertype_ref` |
| `pk_org` | `finbd.bd_allaccbodyref` |
| `voucherrecord` | `` |
| `currency` | `ucfbasedoc.bd_currencytenantref` |
| `acc_year_id` | `finbd.bd_periodyear` |

## 继承接口 (3个, 6字段)

- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 57 个直连字段

### 文本字段 (27个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `source_type` | `source_type` | `sourceType` | 来源类型 |
| `voucher_body_id` | `voucher_body_id` | `voucherBodyId` | 凭证分录的（没用） |
| `acc_year_code` | `acc_year_code` | `accYearCode` | 期间年度 |
| `business_id` | `business_id` | `businessId` | 业务方id |
| `reversedcashflowid` | `reversedcashflowid` | `reversedcashflowid` | 被冲销的现金流量分录id |
| `auxid` | `auxid` | `auxid` | 辅助核算项ID |
| `accsubjectid` | `accsubjectid` | `accsubjectid` | 科目ID |
| `relateid` | `relateid` | `relateid` | 主附表关联字段 |
| `voucherstatus` | `voucherstatus` | `voucherstatus` | 凭证状态 |
| `innerorg` | `innerorg` | `innerorg` | 内部单位 |
| `periodunion` | `periodunion` | `periodunion` | 期间 |
| `periodadjust` | `periodadjust` | `periodadjust` | 调整期间 |
| `flag` | `flag` | `flag` | 期初标识 |
| `srctplid` | `srctplid` | `srctplid` | 源ID |
| `tenantid` | `tenantid` | `tenantid` | 租户ID |
| `def2` | `def2` | `def2` | 自定义项 |
| `voucherdescription` | `voucherdescription` | `voucherdescription` | 摘要 |
| `vouchermaketime` | `vouchermaketime` | `vouchermaketime` | 凭证制单日期 |
| `voucherbillcode` | `voucherbillcode` | `voucherbillcode` | 凭证号 |
| `pk_group` | `pk_group` | `pkGroup` | 集团 |
| `name` | `name` | `name` | 名称 |
| `description` | `description` | `description` | 摘要 |
| `rule` | `rule` | `rule` | 使用模板 |
| `oppsubject` | `oppsubject` | `oppsubject` | 对方科目 |
| `direction` | `direction` | `direction` | 流入、流出（IN 流入，OUT流出） |
| `period` | `period` | `period` | 不含调整期会计期间 |
| `id` | `id` | `id` | 主键 |

### 引用字段 (15个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `two_level_accentity_id` | `two_level_accentity_id` | `twoLevelAccentityId` | 内部核算单元 |
| `acc_period_id` | `acc_period_id` | `accPeriodId` | 会计期间ID |
| `acc_year_id` | `acc_year_id` | `accYearId` | 期间年 |
| `accsubject_vid` | `accsubject_vid` | `accsubject_vid` | 科目vid |
| `vouchertype` | `vouchertype` | `vouchertype` | 凭证类型 |
| `pk_org` | `pk_org` | `pkOrg` | 组织 |
| `voucherrecord` | `voucherrecord` | `voucherrecord` | 凭证分录ID |
| `currency` | `currency` | `currency` | 币种 |
| `accsubject` | `accsubject` | `accsubject` | 会计科目 |
| `cashflowitem` | `cashflowitem` | `cashflowitem` | 现金流量项目 |
| `voucher` | `voucher` | `voucher` | 凭证ID |
| `accbook` | `accbook` | `accBook` | 账簿 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `creationtime` | `creationtime` | `creationtime` | 创建时间 |
| `modifiedtime` | `modifiedtime` | `modifiedtime` | 修改时间 |
| `version` | `version` | `version` | 凭证版本 |
| `ts` | `ts` | `ts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `voucherrecordnumber` | `voucherrecordnumber` | `voucherrecordnumber` | 凭证分录行号 |
| `manual` | `manual` | `manual` | 是否手工 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `amountglobal` | `amountglobal` | `amountglobal` | 全局币金额 |
| `amountgroup` | `amountgroup` | `amountgroup` | 集团币金额 |
| `amountorganize` | `amountorganize` | `amountorganize` | 组织币金额 |
| `amountorg` | `amountorg` | `amountorg` | 本币金额 |
| `amountoriginal` | `amountoriginal` | `amountoriginal` | 原币金额 |
