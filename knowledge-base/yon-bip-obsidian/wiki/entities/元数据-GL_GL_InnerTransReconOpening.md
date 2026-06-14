---
tags: [BIP, 元数据, 数据字典, GL.GL.InnerTransReconOpening]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 内部交易对账期初 (`GL.GL.InnerTransReconOpening`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`gl_inner_trans_recon_opening_tb` | domain：`yonbip-fi-egl` | 应用：`GL` | 业务对象ID：`dc4b7ddc-4b15-44c5-8e0a-954454944b05`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 内部交易对账期初 |
| 物理表 | `gl_inner_trans_recon_opening_tb` |
| domain/服务域 | `yonbip-fi-egl` |
| schema | `figl` |
| 所属应用 | `GL` |
| 直连字段 | 38 个 |
| 子表 | 0 个 |
| 关联引用 | 9 个 |

## 关联引用 (9个)

| 字段名 | 引用类型 |
|--------|---------|
| `accsubject_id` | `fiepub.fiepub_accsubjectref` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `vouchertype_id` | `fiepub.epub_vouchertype_ref` |
| `accbook_id` | `fiepub.fiepub_accountbookref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `rule_id` | `yonbip-fi-egl.RefTable_7406dde875` |
| `currency_id` | `ucfbasedoc.bd_currencytenantref` |
| `ytenant_id` | `` |
| `inner_org_id` | `finbd.bd_allaccbodyref` |

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

> 共 38 个直连字段

### 文本字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |
| `accentity` | `accentity` | `accentity` | 会计主体 |
| `openingdate` | `openingdate` | `openingdate` | 期初日期 |
| `match_state` | `match_state` | `matchState` | 对符状态 |
| `description` | `description` | `description` | 摘要 |
| `client_auxiliary` | `client_auxiliary` | `clientAuxiliary` | 辅助核算入参 |
| `auxiliary_id` | `auxiliary_id` | `auxiliary` | 辅助核算 |
| `batch` | `batch` | `batch` | 批次号 |

### 引用字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accbook_id` | `accbook_id` | `accbook` | 账簿 |
| `inner_org_id` | `inner_org_id` | `innerOrg` | 内部单位 |
| `rule_id` | `rule_id` | `rule` | 内部交易对账规则 |
| `vouchertype_id` | `vouchertype_id` | `vouchertype` | 凭证类型 |
| `accsubject_id` | `accsubject_id` | `accsubject` | 科目 |
| `currency_id` | `currency_id` | `currency` | 币种 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `maketime` | `maketime` | `maketime` | 制单日期 |
| `busidate` | `busidate` | `busidate` | 业务日期 |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 最新修改时间 |

### 枚举字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `data_category` | `data_category` | `dataCategory` | 期初对符状态 |
| `direction` | `direction` | `direction` | 方向 |

### 整数 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `quantity_digit` | `quantity_digit` | `quantityDigit` | 数量精度 |
| `ori_currency_digit` | `ori_currency_digit` | `oriCurrencyMoneyDigit` | 原币精度 |
| `currency_digit` | `currency_digit` | `currencyMoneyDigit` | 本币精度 |
| `glb_digit` | `glb_digit` | `glbMoneyDigit` | 全局币精度 |
| `grp_digit` | `grp_digit` | `grpMoneyDigit` | 集团币精度 |
| `org_digit` | `org_digit` | `orgMoneyDigit` | 组织币精度 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `billcode` | `billcode` | `billcode` | 凭证号 |

### 数值字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `quantity` | `quantity` | `quantity` | 数量 |
| `ori_amount` | `ori_amount` | `oriAmount` | 原币 |
| `amount` | `amount` | `amount` | 本币金额 |
| `global_amount` | `global_amount` | `globalAmount` | 全局币 |
| `group_amount` | `group_amount` | `groupAmount` | 集团币 |
| `org_amount` | `org_amount` | `orgAmount` | 组织币 |
