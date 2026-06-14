---
tags: [BIP, 元数据, 数据字典, GL.GL.AbsVoucherBody]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 抽象凭证表体 (`GL.GL.AbsVoucherBody`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`gl_voucherbill_b` | domain：`yonbip-fi-egl` | 应用：`GL` | 业务对象ID：`deb85554-fd8e-4946-a6d2-a1dbc3b70561`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 抽象凭证表体 |
| 物理表 | `gl_voucherbill_b` |
| domain/服务域 | `yonbip-fi-egl` |
| schema | `figl` |
| 所属应用 | `GL` |
| 直连字段 | 55 个 |
| 子表 | 0 个 |
| 关联引用 | 16 个 |

## 关联引用 (16个)

| 字段名 | 引用类型 |
|--------|---------|
| `global_ratetype_id` | `ucfbasedoc.bd_exchangeratetyperef` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `org_ratetype_id` | `ucfbasedoc.bd_exchangeratetyperef` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `accsubject_id` | `fiepub.fiepub_accsubjectref` |
| `description` | `finbd.bd_remarkref` |
| `group_ratetype_id` | `ucfbasedoc.bd_exchangeratetyperef` |
| `ytenant_id` | `` |
| `settlement_mode` | `productcenter.aa_settlemethodref` |
| `accentity_id` | `finbd.bd_allaccbodyref_inner` |
| `parent_id` | `` |
| `accbook_ratetype_id` | `ucfbasedoc.bd_exchangeratetyperef` |
| `auxiliary_id` | `` |
| `mainunit` | `productcenter.pc_unitref` |
| `accsubject_vid` | `fiepub.epub_accsubjectversion_treecard_ref` |
| `ori_currtype_id` | `ucfbasedoc.bd_currencytenantref` |

## 继承接口 (2个, 5字段)

- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 55 个直连字段

### 文本字段 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bank_verifycode` | `bank_verifycode` | `bankVerifyCode` | 银行对账码 |
| `billno` | `billno` | `billNo` | 票据号 |
| `billtime` | `billtime` | `billTime` | 票据日期 |
| `busi_date` | `busi_date` | `businessDate` | 业务日期 |
| `description2` | `description2` | `description2` | 摘要2 |
| `description3` | `description3` | `description3` | 摘要3 |
| `description4` | `description4` | `description4` | 摘要4 |
| `description5` | `description5` | `description5` | 摘要5 |
| `description6` | `description6` | `description6` | 摘要6 |
| `id` | `id` | `id` | 主键 |

### 引用字段 (16个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accsubject_id` | `accsubject_id` | `accSubject` | 科目 |
| `accentity_id` | `accentity_id` | `accentity` | 表体会计主体/组织 |
| `accsubject_vid` | `accsubject_vid` | `accsubjectVid` | 科目版本id |
| `auxiliary_id` | `auxiliary_id` | `auxiliary` | 辅助核算项id |
| `ori_currtype_id` | `ori_currtype_id` | `currency_id` | 原币币种 |
| `description` | `description` | `description` | 摘要 |
| `global_ratetype_id` | `global_ratetype_id` | `globalRatetype` | 本币汇率类型_全局 |
| `group_ratetype_id` | `group_ratetype_id` | `groupRatetype` | 本币汇率类型_集团 |
| `mainunit` | `mainunit` | `measureDoc` | 主计量单位 |
| `org_ratetype_id` | `org_ratetype_id` | `orgRatetype` | 本币汇率类型_组织 |
| `parent_id` | `parent_id` | `parentId` | 抽象凭证表头 |
| `accbook_ratetype_id` | `accbook_ratetype_id` | `rateType` | 本币汇率类型_账簿 |
| `settlement_mode` | `settlement_mode` | `settlementMode` | 结算方式 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 枚举字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accbook_convert_param` | `accbook_convert_param` | `accbookConvertParam` | 账簿币折算参数 |
| `global_convert_param` | `global_convert_param` | `globalConvertParam` | 全局币折算参数 |
| `group_convert_param` | `group_convert_param` | `groupConvertParam` | 集团币折算参数 |
| `global_rate_ops` | `global_rate_ops` | `rateGlobalOps` | 全局币汇率折算方式 |
| `group_rate_ops` | `group_rate_ops` | `rateGroupOps` | 集团币汇率折算方式 |
| `accbook_rate_ops` | `accbook_rate_ops` | `rateOrgOps` | 本币汇率折算方式 |
| `org_rate_ops` | `org_rate_ops` | `rateOrganizOps` | 组织币汇率折算方式 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `record_no` | `record_no` | `recordNumber` | 分录行号 |

### 数值字段 (18个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `global_credit_amount` | `global_credit_amount` | `creditGlobal` | 贷方本币_全局 |
| `group_credit_amount` | `group_credit_amount` | `creditGroup` | 贷方本币_集团 |
| `accbook_credit_amount` | `accbook_credit_amount` | `creditOrg` | 贷方本币_账簿 |
| `org_credit_amount` | `org_credit_amount` | `creditOrganiz` | 贷方本币_组织 |
| `original_credit_amount` | `original_credit_amount` | `creditOriginal` | 贷方原币 |
| `credit_quantity` | `credit_quantity` | `creditQuantity` | 贷方数量 |
| `global_debit_amount` | `global_debit_amount` | `debitGlobal` | 借方本币_全局 |
| `group_debit_amount` | `group_debit_amount` | `debitGroup` | 借方本币_集团 |
| `accbook_debit_amount` | `accbook_debit_amount` | `debitOrg` | 借方本币_账簿 |
| `org_debit_amount` | `org_debit_amount` | `debitOrganiz` | 借方本币_组织 |
| `original_debit_amount` | `original_debit_amount` | `debitOriginal` | 借方原币 |
| `debit_quantity` | `debit_quantity` | `debitQuantity` | 借方数量 |
| `pre_price` | `pre_price` | `price` | 单价 |
| `quantity` | `quantity` | `quantity` | 数量 |
| `global_rate` | `global_rate` | `rateGlobal` | 全局币汇率 |
| `group_rate` | `group_rate` | `rateGroup` | 集团币汇率 |
| `accbook_rate` | `accbook_rate` | `rateOrg` | 本币汇率 |
| `org_rate` | `org_rate` | `rateOrganiz` | 组织币汇率 |
