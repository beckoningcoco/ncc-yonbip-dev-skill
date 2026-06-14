---
tags: [BIP, 元数据, 数据字典, tlm.investmentapply.InvestmentApplyDetail]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 申请明细 (`tlm.investmentapply.InvestmentApplyDetail`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`tlm_investmentapply_detail` | domain：`yonbip-fi-ctmtlm` | 应用：`TLM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 申请明细 |
| 物理表 | `tlm_investmentapply_detail` |
| domain/服务域 | `yonbip-fi-ctmtlm` |
| schema | `yonbip_fi_ctmfm` |
| 所属应用 | `TLM` |
| 直连字段 | 35 个 |
| 子表 | 0 个 |
| 关联引用 | 10 个 |

## 关联引用 (10个)

| 字段名 | 引用类型 |
|--------|---------|
| `infuse_capital_currency` | `ucfbasedoc.bd_currencytenantref` |
| `` | `` |
| `ytenant_id` | `` |
| `detail_define_character` | `` |
| `mainid` | `` |
| `protocol_currency` | `ucfbasedoc.bd_currencytenantref` |
| `old_currency` | `ucfbasedoc.bd_currencytenantref` |
| `tenant_id` | `` |

## 继承接口 (3个, 6字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **审批信息** (`base.itf.IApprovalInfo`)
  - `audit_date` → `audit_date`
  - `` → ``
  - `` → ``
  - `audit_time` → `audit_time`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 35 个直连字段

### 文本字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `transaction_detail_code` | `transaction_detail_code` | `transactionDetailCode` | 交易明细编号 |
| `` | `code` | `code` | 编码 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `` | `creator` | `creator` | 创建人名称 |
| `` | `auditor` | `auditor` | 审批人名称 |
| `failure_reason` | `failure_reason` | `failureReason` | 失败原因 |

### 引用字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `mainid` | `mainid` | `mainid` | 投资申请主表id |
| `infuse_capital_currency` | `infuse_capital_currency` | `infuseCapitalCurrency` | 本金币种id |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `` | `auditorId` | `auditorId` | 审批人 |
| `old_currency` | `old_currency` | `oldCurrency` | 本币币种ID |
| `protocol_currency` | `protocol_currency` | `protocolCurrency` | 投资币种id |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `vouchdate` | `vouchdate` | 单据日期 |
| `audit_date` | `audit_date` | `auditDate` | 审批日期 |
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 枚举字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cmd_push_status` | `cmd_push_status` | `cmdPushStatus` | 指令推送状态 |
| `transaction_result` | `transaction_result` | `transactionResult` | 交易结果 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `status` | `status` | 单据状态 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |
| `` | `tplid` | `tplid` | 模板id |

### 数值字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `advance_interest_protocol` | `advance_interest_protocol` | `advanceInterestProtocol` | 垫付利息(协议币种) |
| `advance_interest_local` | `advance_interest_local` | `advanceInterestLocal` | 垫付利息(本币币种) |
| `advance_interest_principal` | `advance_interest_principal` | `advanceInterestPrincipal` | 垫付利息(本金 币种) |
| `investment_apply_amount` | `investment_apply_amount` | `investmentApplyAmount` | 投资申请金额(协议币种) |
| `purchase_priamount` | `purchase_priamount` | `purchasePriamount` | 申购金额(本金币种) |
| `purchase_lcamount` | `purchase_lcamount` | `purchaseLcamount` | 申购金额(本币币种) |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `audit_time` | `audit_time` | `auditTime` | 审批时间 |
| `create_time` | `create_time` | `createTime` | 创建时间 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `detail_define_character` | `detail_define_character` | `investmentapplyDetailCharacterDef` | 申请明细子表特征 |
