---
tags: [BIP, 元数据, 数据字典, GL.gainslosses.GainsLossesRule]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 汇兑损益定义 (`GL.gainslosses.GainsLossesRule`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`fi_exchange_gains_losses_rule_tb` | domain：`yonbip-fi-egl` | 应用：`GL` | 业务对象ID：`7c3969b2-c993-472e-a3b2-90653c4a79ec`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 汇兑损益定义 |
| 物理表 | `fi_exchange_gains_losses_rule_tb` |
| domain/服务域 | `yonbip-fi-egl` |
| schema | `figl` |
| 所属应用 | `GL` |
| 直连字段 | 26 个 |
| 子表 | 3 个 |
| 关联引用 | 11 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `ruleCalculateItemList` | `GL.gainslosses.GainsLossesRuleCalculateItem` | composition |
| `ruleEntry` | `GL.gainslosses.GainsLossesRuleEntry` | composition |
| `ruleOppositeEntry` | `GL.gainslosses.GainsLossesRuleOppositeEntry` | composition |

## 关联引用 (11个)

| 字段名 | 引用类型 |
|--------|---------|
| `rate_type` | `ucfbasedoc.bd_exchangeratetyperef` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `voucher_type` | `fiepub.epub_vouchertype_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `` | `` |
| `ytenant_id` | `` |
| `accsubject_chart` | `fiepub.epub_accsubjectchartref` |
| `cashflow_type` | `fiepub.fiepub_cashflowtyperef` |
| `pk_org` | `finbd.bd_allaccbodyref_all` |

## 继承接口 (2个, 5字段)

- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 26 个直连字段

### 文本字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | 编码 |
| `remark` | `remark` | `remark` | 备注 |
| `srctplid` | `srctplid` | `srcTplId` | 档案ID |
| `id` | `id` | `id` | 主键 |

### 引用字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pk_org` | `pk_org` | `accentity` | 会计主体 |
| `accsubject_chart` | `accsubject_chart` | `accsubjectchart` | 科目表 |
| `rate_type` | `rate_type` | `rateType` | 汇率类型 |
| `voucher_type` | `voucher_type` | `voucherType` | 凭证类型 |
| `cashflow_type` | `cashflow_type` | `cashFlowType` | 现金流量类型 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 布尔字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `auto_backflush` | `auto_backflush` | `autoBackFlush` | 下月自动回冲 |
| `only_calc_zero_bal` | `only_calc_zero_bal` | `onlyCalcZeroBal` | 只计算原币余额为0记录 |
| `settle_check_flag` | `settle_check_flag` | `settleCheckFlag` | 结账检查 |
| `bln_verify` | `bln_verify` | `blnVerify` | 科目核销 |

### 枚举字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `rate_collect` | `rate_collect` | `rateCollect` | 汇率采集 |
| `reversal_mode` | `reversal_mode` | `reversalMode` | 冲销方式 |

### multiLanguage (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 名称 |
| `voucher_abstract` | `voucher_abstract` | `voucherAbstract` | 凭证摘要 |

### other (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `ruleCalculateItemList` | 计算对象 |
| `` | `` | `ruleEntry` | 本方分录规则 |
| `` | `` | `ruleOppositeEntry` | 对方分录规则 |
