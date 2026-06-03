---
tags: [BIP, 元数据, 数据字典, GL.GL.InnerTransFilter]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 对账数据查询条件 (`GL.GL.InnerTransFilter`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`gl_inner_trans_filter` | domain：`yonbip-fi-egl` | 应用：`GL` | 业务对象ID：`378653b6-65a5-4408-97ad-c7fc3769dc1d`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 对账数据查询条件 |
| 物理表 | `gl_inner_trans_filter` |
| 数据库 schema | `yonbip-fi-egl` |
| 所属应用 | `GL` |
| 直连字段 | 37 个 |
| 子表 | 1 个 |
| 关联引用 | 10 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `InnerTransFilter_oppAccbookList` | `GL.GL.InnerTransFilter_oppAccbook` | composition |

## 关联引用 (10个)

| 字段名 | 引用类型 |
|--------|---------|
| `InnerTransMatchData_id` | `` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `auxiliary` | `fiepub.epub_multidimensionextref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `` | `` |
| `opp_accbook_id` | `fiepub.fiepub_accountbookref` |
| `rule_id` | `yonbip-fi-egl.RefTable_7406dde875` |
| `currency_id` | `ucfbasedoc.bd_currencytenantref` |
| `own_accbook_id` | `fiepub.fiepub_accountbookref` |
| `ytenant_id` | `` |

## 继承接口 (3个, 6字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`

## 字段列表（按类型分组）

> 共 37 个直连字段

### 文本字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |

### 引用字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `InnerTransMatchData_id` | `InnerTransMatchData_id` | `InnerTransMatchData_id` | 对符数据 |
| `auxiliary` | `auxiliary` | `auxiliary` | 辅助核算 |
| `creator` | `creator` | `creator` | 创建人 |
| `currency_id` | `currency_id` | `currency` | 币种 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `own_accbook_id` | `own_accbook_id` | `ownAccbook` | 本方账簿 |
| `rule_id` | `rule_id` | `rule` | 对账规则 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `endmaketime` | `endmaketime` | `endmaketime` | 结束制单日期 |
| `maketime` | `maketime` | `maketime` | 制单日期范围 |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 枚举字段 (13个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `amount_diff` | `amount_diff` | `amountDiff` | 本币金额差额 |
| `bln_desc_same` | `bln_desc_same` | `blnDescSame` | 摘要选项 |
| `busidate_diff` | `busidate_diff` | `busidateDiff` | 业务日期差值选项 |
| `busidate_diff_select` | `busidate_diff_select` | `busidateDiffSelect` | 业务日期差值单选 |
| `global_amount_diff` | `global_amount_diff` | `globalAmountDiff` | 全局币金额差额 |
| `group_amount_diff` | `group_amount_diff` | `groupAmountDiff` | 集团币金额差额 |
| `maketime_diff` | `maketime_diff` | `maketimeDiff` | 制单日期差值选项 |
| `maketime_diff_select` | `maketime_diff_select` | `maketimeDiffSelect` | 制单日期差值单选 |
| `match_scope` | `match_scope` | `matchScope` | 对符范围 |
| `org_amount_diff` | `org_amount_diff` | `orgAmountDiff` | 组织币金额差额 |
| `ori_amount_diff` | `ori_amount_diff` | `oriAmountDiff` | 原币金额差额 |
| `rule_direction` | `rule_direction` | `ruleDirection` | 规则方向 |
| `voucher_scope` | `voucher_scope` | `voucherScope` | 凭证范围 |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `busidate_diff_day` | `busidate_diff_day` | `busidateDiffDay` | 业务日期相差天数 |
| `maketime_diff_day` | `maketime_diff_day` | `maketimeDiffDay` | 制单日期相差天数 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `amount_diff_val` | `amount_diff_val` | `amountDiffVal` | 本币金额差额值 |
| `global_amount_diff_val` | `global_amount_diff_val` | `globalAmountDiffVal` | 全局币金额差额值 |
| `group_amount_diff_val` | `group_amount_diff_val` | `groupAmountDiffVal` | 集团币金额差额值 |
| `org_amount_diff_val` | `org_amount_diff_val` | `orgAmountDiffVal` | 组织币金额差额值 |
| `ori_amount_diff_val` | `ori_amount_diff_val` | `oriAmountDiffVal` | 原币金额差额值 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `InnerTransFilter_oppAccbookList` | 对方账簿 |

### quoteList (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `opp_accbook_id` | `opp_accbook_id` | `oppAccbook` | 对方账簿 |
