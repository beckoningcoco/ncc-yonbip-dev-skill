---
tags: [BIP, 元数据, 数据字典, GL.GL.GlCoordVoucherQuery]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 协同凭证查询 (`GL.GL.GlCoordVoucherQuery`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`gl_coordination_voucher` | domain：`yonbip-fi-egl` | 应用：`GL` | 业务对象ID：`e0754d34-c6d4-4097-bd81-f3e35b659a68`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 协同凭证查询 |
| 物理表 | `gl_coordination_voucher` |
| 数据库 schema | `yonbip-fi-egl` |
| 所属应用 | `GL` |
| 直连字段 | 64 个 |
| 子表 | 0 个 |
| 关联引用 | 15 个 |

## 关联引用 (15个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `organize_ratetype_id` | `ucfbasedoc.bd_exchangeratetyperef` |
| `voucher_type_id` | `fiepub.epub_vouchertype_ref` |
| `subject_id` | `fiepub.fiepub_accsubjectref` |
| `accbook_id` | `fiepub.fiepub_accountbookref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `voucher_accentity` | `ucf-org-center.bd_financeorgtreeref` |
| `ytenant_id` | `` |
| `accsubject_vid` | `fiepub.epub_accsubjectchartref` |
| `coordination_accbook` | `fiepub.fiepub_accountbookref` |
| `coordination_accentity` | `ucf-org-center.bd_financeorgtreeref` |
| `ratetype` | `ucfbasedoc.bd_exchangeratetyperef` |
| `global_ratetype_id` | `ucfbasedoc.bd_exchangeratetyperef` |
| `currency` | `ucfbasedoc.bd_currencytenantref` |
| `group_ratetype_id` | `ucfbasedoc.bd_exchangeratetyperef` |

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

> 共 64 个直连字段

### 文本字段 (13个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `coordination_no` | `coordination_no` | `coordinationNo` | 协同号 |
| `periodunion` | `periodunion` | `periodUnion` | 会计期间 |
| `displayname` | `displayname` | `displayname` | 凭证号 |
| `auxiliary_id` | `auxiliary_id` | `auxiliary` | 辅助信息ID |
| `doctype` | `doctype` | `docType` | 档案类型 |
| `vrs` | `vrs` | `vrs` | 辅助项 |
| `vrs_value` | `vrs_value` | `vrsValue` | 辅助项值 |
| `remark` | `remark` | `remark` | 备注 |
| `voucher_b_id` | `voucher_b_id` | `voucherBId` | 分录ID |
| `voucher_id` | `voucher_id` | `voucherId` | 凭证ID |
| `source_voucher_b` | `source_voucher_b` | `sourceVoucherBId` | 来源分录ID |
| `coordination_setting_id` | `coordination_setting_id` | `coordinationSetting` | 协同规则 |
| `id` | `id` | `id` | 主键 |

### 引用字段 (15个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `coordination_accentity` | `coordination_accentity` | `coordinationAccentity` | 对方会计主体 |
| `voucher_accentity` | `voucher_accentity` | `voucherAccentity` | 本方会计主体 |
| `accbook_id` | `accbook_id` | `accbook` | 本方账簿 |
| `coordination_accbook` | `coordination_accbook` | `coordinationAccbook` | 对方账簿 |
| `subject_id` | `subject_id` | `subject` | 会计科目 |
| `accsubject_vid` | `accsubject_vid` | `accSubjectVid` | 会计科目版本 |
| `currency` | `currency` | `currency` | 币种 |
| `organize_ratetype_id` | `organize_ratetype_id` | `organizeRateType` | 组织币汇率类型 |
| `ratetype` | `ratetype` | `rateType` | 本币汇率类型 |
| `group_ratetype_id` | `group_ratetype_id` | `groupRateType` | 集团币汇率类型 |
| `global_ratetype_id` | `global_ratetype_id` | `globalRateType` | 全局币汇率类型 |
| `voucher_type_id` | `voucher_type_id` | `voucherType` | 凭证类型 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `make_date` | `make_date` | `makeDate` | 制单日期 |
| `business_date` | `business_date` | `businessDate` | 业务日期 |

### 日期时间 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `coordination_date` | `coordination_date` | `coordinationDate` | 协同日期 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### 枚举字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `yw_issue_status` | `yw_issue_status` | `ywIssueStatus` | 协同业务 |
| `send_status` | `send_status` | `sendStatus` | 协同发送状态 |
| `confirm_status` | `confirm_status` | `confirmStatus` | 协同确认状态 |
| `rate_organize_ops` | `rate_organize_ops` | `rateOrganizeOps` | 组织币汇率折算方式 |
| `rate_org_ops` | `rate_org_ops` | `rateOrgOps` | 本币汇率折算方式 |
| `rate_group_ops` | `rate_group_ops` | `rateGroupOps` | 集团币汇率折算方式 |
| `rate_global_ops` | `rate_global_ops` | `rateGlobalOps` | 全局币汇率折算方式 |
| `control_status` | `control_status` | `controlStatus` | 控制状态 |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bill_code` | `bill_code` | `billCode` | 凭证号 |
| `recordnumber` | `recordnumber` | `recordnumber` | 分录号 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (18个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `price` | `price` | `price` | 单价 |
| `quantity` | `quantity` | `quantity` | 数量 |
| `debit_quantity` | `debit_quantity` | `debitQuantity` | 借方数量 |
| `credit_quantity` | `credit_quantity` | `creditQuantity` | 贷方数量 |
| `debit_original` | `debit_original` | `debitOriginal` | 借方原币 |
| `credit_original` | `credit_original` | `creditOriginal` | 贷方原币 |
| `rate_organize` | `rate_organize` | `rateOrganize` | 组织币汇率 |
| `debit_organize` | `debit_organize` | `debitOrganize` | 借方组织币金额 |
| `credit_organize` | `credit_organize` | `creditOrganize` | 贷方组织币金额 |
| `rate_org` | `rate_org` | `rateOrg` | 本币汇率 |
| `credit_org` | `credit_org` | `creditOrg` | 贷方本币 |
| `debit_org` | `debit_org` | `debitOrg` | 借方本币 |
| `rate_group` | `rate_group` | `rateGroup` | 集团币汇率 |
| `debit_group` | `debit_group` | `debitGroup` | 借方集团币金额 |
| `credit_group` | `credit_group` | `creditGroup` | 贷方集团币金额 |
| `rate_global` | `rate_global` | `rateGlobal` | 全局币汇率 |
| `debit_global` | `debit_global` | `debitGlobal` | 借方全局币金额 |
| `credit_global` | `credit_global` | `creditGlobal` | 贷方全局币金额 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `description` | `description` | `description` | 分录行摘要 |
