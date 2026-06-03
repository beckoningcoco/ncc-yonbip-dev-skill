---
tags: [BIP, 元数据, 数据字典, tlm.absrepayment.ABSRepaymentCashFlow]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 现金流明细 (`tlm.absrepayment.ABSRepaymentCashFlow`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`tlm_absrepayment_cash_flow` | domain：`yonbip-fi-ctmtlm` | 应用：`TLM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 现金流明细 |
| 物理表 | `tlm_absrepayment_cash_flow` |
| 数据库 schema | `yonbip-fi-ctmtlm` |
| 所属应用 | `TLM` |
| 直连字段 | 31 个 |
| 子表 | 0 个 |
| 关联引用 | 9 个 |

## 关联引用 (9个)

| 字段名 | 引用类型 |
|--------|---------|
| `protocol` | `tlm_financingregisterRef` |
| `absrepayment_cash_flow_character_def` | `` |
| `ytenant_id` | `` |
| `cash_flow` | `tlm_financein_cashflowRef` |
| `` | `` |
| `mainid` | `` |
| `debt` | `tlm_financeinRef` |
| `tenant_id` | `` |

## 继承接口 (3个, 10字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`

## 字段列表（按类型分组）

> 共 31 个直连字段

### 文本字段 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `if_own_add` | `if_own_add` | `isOwnAdd` | 是否手动添加 |
| `back_item1` | `back_item1` | `backItem1` | backItem1 |
| `back_item2` | `back_item2` | `backItem2` | backItem2 |
| `back_item3` | `back_item3` | `backItem3` | backItem3 |
| `back_item4` | `back_item4` | `backItem4` | backItem4 |
| `back_item5` | `back_item5` | `backItem5` | backItem5 |
| `back_item6` | `back_item6` | `backItem6` | backItem6 |
| `code` | `code` | `code` | 现金流Id |
| `` | `creator` | `creator` | 创建人名称 |
| `` | `modifier` | `modifier` | 修改人名称 |

### 引用字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `mainid` | `mainid` | `mainid` | 专项还款登记ID |
| `protocol` | `protocol` | `protocol` | 协议号id |
| `debt` | `debt` | `debt` | 借据id |
| `cash_flow` | `cash_flow` | `cashFlow` | 现金流ID |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `rowno` | `rowno` | `rowno` | 行号 |

### 长整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `back_item9` | `back_item9` | `backItem9` | backItem9 |
| `back_item10` | `back_item10` | `backItem10` | backItem10 |

### 数值字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `repayment_amt` | `repayment_amt` | `repaymentAmt` | 本次还款金额 |
| `back_item7` | `back_item7` | `backItem7` | backItem7 |
| `back_item8` | `back_item8` | `backItem8` | backItem8 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `absrepayment_cash_flow_character_def` | `absrepayment_cash_flow_character_def` | `absRepaymentCashFlowCharacterDef` | 现金流明细自定义项 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
