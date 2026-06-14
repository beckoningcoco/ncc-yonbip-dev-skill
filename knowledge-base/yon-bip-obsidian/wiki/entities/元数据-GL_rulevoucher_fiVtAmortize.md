---
tags: [BIP, 元数据, 数据字典, GL.rulevoucher.fiVtAmortize]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 规则凭证摊销辅助记录 (`GL.rulevoucher.fiVtAmortize`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`fi_vt_amortize` | domain：`yonbip-fi-egl` | 应用：`GL` | 业务对象ID：`7b4c8f89-c22b-45b7-beca-0834bdafea6a`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 规则凭证摊销辅助记录 |
| 物理表 | `fi_vt_amortize` |
| domain/服务域 | `yonbip-fi-egl` |
| schema | `figl` |
| 所属应用 | `GL` |
| 直连字段 | 25 个 |
| 子表 | 0 个 |
| 关联引用 | 6 个 |

## 关联引用 (6个)

| 字段名 | 引用类型 |
|--------|---------|
| `accbook_id` | `` |
| `accsubject_id` | `` |
| `modifier` | `` |
| `periodunion` | `` |
| `ytenant_id` | `` |
| `rule_id` | `` |

## 继承接口 (1个, 1字段)

- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 25 个直连字段

### 文本字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |
| `currency_id` | `currency_id` | `currencyId` | 币种 |
| `description` | `description` | `description` | 备注 |
| `amortize_period` | `amortize_period` | `amortizePeriod` | 执行期间 |
| `auxiliary_id` | `auxiliary_id` | `auxiliaryId` | 辅助信息id  |
| `vtid` | `vtid` | `vtid` | 凭证id |
| `vtbid` | `vtbid` | `vtbid` | 凭证表体id |
| `creator` | `creator` | `creator` | 创建人 |

### 引用字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accbook_id` | `accbook_id` | `accbookId` | 账簿 |
| `accsubject_id` | `accsubject_id` | `accsubjectId` | 科目 |
| `periodunion` | `periodunion` | `periodunion` | 开始摊销期间 |
| `rule_id` | `rule_id` | `ruleId` | 规则id |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `pubts` | `pubts` | `pubts` | 最新修改时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### 整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `amortize_cycle` | `amortize_cycle` | `amortizeCycle` | 已摊期数 |
| `surplus_cycle` | `surplus_cycle` | `surplusCycle` | 剩余期数 |
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `total_money` | `total_money` | `totalMoney` | 待摊余额 |
| `amortize_money` | `amortize_money` | `amortizeMoney` | 已摊金额 |
| `surplus_money` | `surplus_money` | `surplusMoney` | 剩余金额 |
| `amortize_quantity` | `amortize_quantity` | `amortizeQuantity` | 已摊数量 |
| `surplus_quantity` | `surplus_quantity` | `surplusQuantity` | 剩余数量 |
