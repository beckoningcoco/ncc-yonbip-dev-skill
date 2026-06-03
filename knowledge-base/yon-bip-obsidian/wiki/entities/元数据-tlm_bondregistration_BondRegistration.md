---
tags: [BIP, 元数据, 数据字典, tlm.bondregistration.BondRegistration]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 债券注册登记 (`tlm.bondregistration.BondRegistration`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`tlm_bondregistration` | domain：`yonbip-fi-ctmtlm` | 应用：`TLM` | 业务对象ID：`54b3a38f-7814-4006-ba1e-d6fa7d72218f`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 债券注册登记 |
| 物理表 | `tlm_bondregistration` |
| 数据库 schema | `yonbip-fi-ctmtlm` |
| 所属应用 | `TLM` |
| 直连字段 | 54 个 |
| 子表 | 4 个 |
| 关联引用 | 16 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `bondRegistrationBondInfo` | `tlm.bondregistration.BondRegistrationBondInfo` | composition |
| `bondRegistrationChangeInfo` | `tlm.bondregistration.BondRegistrationChangeInfo` | composition |
| `bondRegistrationUnderwriter` | `tlm.bondregistration.BondRegistrationUnderwriter` | composition |
| `defines` | `tlm.bondregistration.BondRegistrationDefine` | composition |

## 关联引用 (16个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |
| `trading_market` | `yonbip-fi-ctmtmsp.tmsp_fundbusinobj_Ref` |
| `ytenant_id` | `` |
| `bond_register_apply` | `tlm_bondregisterapplyRef` |
| `accentity_raw` | `ucf-org-center.bd_financeorgtreeref_na` |
| `accentity` | `ucf-org-center.bd_fundsorg_na` |
| `bustype` | `bd_transtypelistref` |
| `bond_regist_character_def` | `` |
| `currency` | `ucfbasedoc.bd_currencytenantref` |
| `tenant_id` | `` |

## 继承接口 (5个, 17字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **审批信息** (`base.itf.IApprovalInfo`)
  - `audit_date` → `audit_date`
  - `` → ``
  - `` → ``
  - `audit_time` → `audit_time`
- **审批流信息** (`base.itf.IApprovalFlow`)
  - `` → ``
  - `` → ``
  - `` → ``
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

> 共 54 个直连字段

### 文本字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | 单据编号 |
| `source_type` | `source_type` | `sourcetype` | 预算上游字段 |
| `` | `auditor` | `auditor` | 审批人名称 |
| `` | `creator` | `creator` | 创建人名称 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `term` | `term` | `term` | 期限 |
| `uppercase_money` | `uppercase_money` | `uppercaseMoney` | 金额大写 |
| `register_approval_Doc` | `register_approval_Doc` | `registerApprovalDoc` | 注册批文 |
| `remarks` | `remarks` | `remarks` | 备注 |

### 引用字段 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accentity` | `accentity` | `accentity` | 资金组织 |
| `accentity_raw` | `accentity_raw` | `accentityRaw` | 核算会计主体 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `` | `auditorId` | `auditorId` | 审批人 |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `bond_register_apply` | `bond_register_apply` | `bondRegisterApply` | 债券注册申请单ID |
| `trading_market` | `trading_market` | `tradingMarket` | 交易市场ID |
| `currency` | `currency` | `currency` | 币种ID |
| `bustype` | `bustype` | `bustype` | 交易类型id |

### 日期字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `billdate` | `billdate` | `billDate` | 单据日期 |
| `audit_date` | `audit_date` | `auditDate` | 审批日期 |
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |
| `start_date` | `start_date` | `startDate` | 起始日期 |
| `end_date` | `end_date` | `endDate` | 到期日期 |
| `` | `vouchdate` | `vouchdate` | 单据日期 |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `isWfControlled` | `isWfControlled` | 审批流控制 |
| `exist_registration_quota` | `exist_registration_quota` | `existRegistrationQuota` | 是否有注册额度 |

### 枚举字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `approval_status` | `approval_status` | `approvalStatus` | 审批状态 |
| `is_budget` | `is_budget` | `isBudget` | 是否占用預算 |
| `term_unit` | `term_unit` | `termUnit` | 期限类型 |
| `is_circulate_quota` | `is_circulate_quota` | `isCirculateQuota` | 额度是否循环 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `termNumber` | `termNumber` | `termNumber` | 期限数量 |

### 短整数 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `returncount` | `returncount` | 退回次数 |
| `` | `status` | `status` | 单据状态 |
| `domestic_or_overseas` | `domestic_or_overseas` | `domesticOrOverseas` | 境内/外 |
| `control_model` | `control_model` | `controlModel` | 控制方式 |
| `` | `verifystate` | `verifystate` | 审批状态 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `tplid` | `tplid` | 模板id |
| `id` | `id` | `id` | ID |

### 数值字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `register_total_amount` | `register_total_amount` | `registerTotalAmount` | 注册总额度 |
| `quota_of_drc` | `quota_of_drc` | `quotaOfDrc` | 发改委额度 |
| `used_amount` | `used_amount` | `usedAmount` | 已用额度 |
| `remaining_available_amount` | `remaining_available_amount` | `remainingAvailableAmount` | 剩余可用额度 |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_time` | `audit_time` | `auditTime` | 审批时间 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bond_regist_character_def` | `bond_regist_character_def` | `bondRegistCharacterDef` | 债券注册登记自定义项 |

### other (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `bondRegistrationBondInfo` | 债券信息子表 |
| `` | `` | `bondRegistrationChangeInfo` | 债券注册登记变更历史 |
| `` | `` | `bondRegistrationUnderwriter` | 承销商子表区 |
| `` | `` | `defines` | 自由自定义项 |
