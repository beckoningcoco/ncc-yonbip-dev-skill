---
tags: [BIP, 元数据, 数据字典, GL.GL.InnerTransData]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 本对方对账数据 (`GL.GL.InnerTransData`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`gl_inner_trans_data` | domain：`yonbip-fi-egl` | 应用：`GL` | 业务对象ID：`378653b6-65a5-4408-97ad-c7fc3769dc1d`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 本对方对账数据 |
| 物理表 | `gl_inner_trans_data` |
| domain/服务域 | `yonbip-fi-egl` |
| schema | `figl` |
| 所属应用 | `GL` |
| 直连字段 | 41 个 |
| 子表 | 0 个 |
| 关联引用 | 11 个 |

## 关联引用 (11个)

| 字段名 | 引用类型 |
|--------|---------|
| `accsubject_id` | `fiepub.epub_accsubjectversion_treecard_ref` |
| `InnerTransMatchData_id` | `` |
| `unit_id` | `productcenter.pc_unitref` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `vouchertype_id` | `fiepub.epub_vouchertype_ref` |
| `accbook_id` | `fiepub.fiepub_accountbookref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `currency_id` | `ucfbasedoc.bd_currencytenantref` |
| `ytenant_id` | `` |
| `inner_org_id` | `ucf-org-center.org_pure_tree_ref` |
| `accentity_id` | `ucf-org-center.org_pure_tree_ref` |

## 继承接口 (2个, 5字段)

- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`

## 字段列表（按类型分组）

> 共 41 个直连字段

### 文本字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accsubject_bind_vrs` | `accsubject_bind_vrs` | `accsubjectBindVrs` | 科目绑定辅助核算 |
| `auxiliary` | `auxiliary` | `auxiliary` | 辅助核算 |
| `batch` | `batch` | `batch` | 批次号 |
| `coordination_no` | `coordination_no` | `coordinationNo` | 协同号 |
| `description` | `description` | `description` | 摘要 |
| `rule_id` | `rule_id` | `rule` | 规则id |
| `vrs_mapping_auxi_id` | `vrs_mapping_auxi_id` | `vrsMappingAuxiId` | 辅助项vr和id的映射 |
| `id` | `id` | `id` | 主键 |

### 引用字段 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `InnerTransMatchData_id` | `InnerTransMatchData_id` | `InnerTransMatchData_id` | 对符数据 |
| `accbook_id` | `accbook_id` | `accbook` | 本对方账簿 |
| `accentity_id` | `accentity_id` | `accentity` | 本对方账簿的组织 |
| `accsubject_id` | `accsubject_id` | `accsubject` | 科目 |
| `currency_id` | `currency_id` | `currency` | 币种 |
| `inner_org_id` | `inner_org_id` | `innerOrg` | 内部组织 |
| `unit_id` | `unit_id` | `unit` | 计量单位 |
| `vouchertype_id` | `vouchertype_id` | `vouchertype` | 凭证类型 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `busidate` | `busidate` | `busidate` | 业务日期 |
| `maketime` | `maketime` | `maketime` | 制单日期 |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### 枚举字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `direction` | `direction` | `direction` | 方向 |
| `match_state` | `match_state` | `matchState` | 对符状态 |

### 整数 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `billcode` | `billcode` | `billcode` | 凭证号 |
| `bln_voucher` | `bln_voucher` | `blnVoucher` | 是否是凭证数据 |
| `contrast_flag` | `contrast_flag` | `contrastFlag` | 对照显示标识 |
| `currency_money_digit` | `currency_money_digit` | `currencyMoneyDigit` | 本币精度 |
| `glb_money_digit` | `glb_money_digit` | `glbMoneyDigit` | 全局币精度 |
| `grp_money_digit` | `grp_money_digit` | `grpMoneyDigit` | 集团币精度 |
| `org_money_digit` | `org_money_digit` | `orgMoneyDigit` | 组织币精度 |
| `ori_currency_money_digit` | `ori_currency_money_digit` | `oriCurrencyMoneyDigit` | 原币精度 |
| `quantity_digit` | `quantity_digit` | `quantityDigit` | 数量精度 |

### 数值字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `amount` | `amount` | `amount` | 账簿币 |
| `global_amount` | `global_amount` | `globalAmount` | 全局币 |
| `group_amount` | `group_amount` | `groupAmount` | 集团币 |
| `org_amount` | `org_amount` | `orgAmount` | 组织币 |
| `ori_amount` | `ori_amount` | `oriAmount` | 原币 |
| `quantity` | `quantity` | `quantity` | 数量 |
