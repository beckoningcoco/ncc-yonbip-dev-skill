---
tags: [BIP, 元数据, 数据字典, tlm.bondregisterapply.BondRegisterApply]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 债券注册申请 (`tlm.bondregisterapply.BondRegisterApply`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`tlm_bondregisterapply` | domain：`yonbip-fi-ctmtlm` | 应用：`TLM` | 业务对象ID：`ef5232a7-96d1-4a4f-b3fb-5638504126c4`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 债券注册申请 |
| 物理表 | `tlm_bondregisterapply` |
| domain/服务域 | `yonbip-fi-ctmtlm` |
| schema | `yonbip_fi_ctmfm` |
| 所属应用 | `TLM` |
| 直连字段 | 52 个 |
| 子表 | 7 个 |
| 关联引用 | 18 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `bondRegisterApplyBondInformationBackup` | `tlm.bondregisterapply.BondRegisterApplyBondInformationBackup` | composition |
| `bondRegisterApplyUnderwriterBackup` | `tlm.bondregisterapply.BondRegisterApplyUnderwriterBackup` | composition |
| `bondRegisterApplyChangeInfo` | `tlm.bondregisterapply.BondRegisterApplyChangeInfo` | composition |
| `bondRegisterApplyBackup` | `tlm.bondregisterapply.BondRegisterApplyBackup` | composition |
| `bondRegisterApplyBondInformation` | `tlm.bondregisterapply.BondRegisterApplyBondInformation` | composition |
| `bondRegisterApplyUnderwriter` | `tlm.bondregisterapply.BondRegisterApplyUnderwriter` | composition |
| `defines` | `tlm.bondregisterapply.BondRegisterApplyDefine` | composition |

## 关联引用 (18个)

| 字段名 | 引用类型 |
|--------|---------|
| `bra_character_def` | `` |
| `ftrading_market` | `yonbip-fi-ctmtmsp.tmsp_fundbusinobj_Ref` |
| `` | `` |
| `ytenant_id` | `` |
| `accentity_raw` | `ucf-org-center.bd_financeorgtreeref_na` |
| `accentity` | `ucf-org-center.bd_fundsorg_na` |
| `bus_type` | `bd_transtypelistref` |
| `currency` | `ucfbasedoc.bd_currencytenantref` |
| `tenant_id` | `` |

## 继承接口 (4个, 9字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **审批流信息** (`base.itf.IApprovalFlow`)
  - `` → ``
  - `` → ``
  - `` → ``
- **审批信息** (`base.itf.IApprovalInfo`)
  - `audit_date` → `audit_date`
  - `` → ``
  - `` → ``
  - `audit_time` → `audit_time`

## 字段列表（按类型分组）

> 共 52 个直连字段

### 文本字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | 单据编号 |
| `version_number` | `version_number` | `versionNumber` | 版本号 |
| `term_unit` | `term_unit` | `termUnit` | 期限类型 |
| `term` | `term` | `term` | 期限 |
| `amount_in_words` | `amount_in_words` | `amountInWords` | 金额大写 |
| `remarks` | `remarks` | `remarks` | 备注 |
| `` | `creator` | `creator` | 创建人 |
| `` | `modifier` | `modifier` | 修改人 |
| `` | `auditor` | `auditor` | 审批人 |

### 引用字段 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accentity` | `accentity` | `accentity` | 资金组织id |
| `accentity_raw` | `accentity_raw` | `accentityRaw` | 核算会计主体 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `` | `auditorId` | `auditorId` | 审批人 |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `ftrading_market` | `ftrading_market` | `ftradingMarket` | 交易市场id |
| `currency` | `currency` | `currency` | 币种id |
| `bus_type` | `bus_type` | `bustype` | 交易类型id |

### 日期字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `doc_date` | `doc_date` | `docDate` | 单据日期 |
| `begin_date` | `begin_date` | `beginDate` | 起始日期 |
| `end_date` | `end_date` | `endDate` | 到期日期 |
| `` | `vouchdate` | `vouchdate` | 单据日期 |
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |
| `audit_date` | `audit_date` | `auditDate` | 审批日期 |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `isWfControlled` | `isWfControlled` | 审批流控制 |
| `exist_registration_quota` | `exist_registration_quota` | `existRegistrationQuota` | 是否有注册额度 |

### 枚举字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `is_budget` | `is_budget` | `isBudget` | 是否占用預算 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `term_number` | `term_number` | `termNumber` | 期限 |

### 短整数 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `returncount` | `returncount` | 退回次数 |
| `` | `status` | `status` | 单据状态 |
| `approval_status` | `approval_status` | `approvalStatus` | 审批状态 |
| `change_status` | `change_status` | `changeStatus` | 变更状态 |
| `invalid` | `invalid` | `invalid` | 作废 |
| `revolving` | `revolving` | `revolving` | 额度是否循环 |
| `` | `verifystate` | `verifystate` | 审批状态 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `` | `tplid` | `tplid` | 模板id |

### 数值字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `total_registration_amount` | `total_registration_amount` | `totalRegistrationAmount` | 注册总额度 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bra_character_def` | `bra_character_def` | `braCharacterDef` | 债券注册申请自定义项 |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `audit_time` | `audit_time` | `auditTime` | 审批时间 |

### other (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `bondRegisterApplyBackup` | 债券注册申请备份 |
| `` | `` | `bondRegisterApplyBondInformation` | 债券信息子表区 |
| `` | `` | `bondRegisterApplyBondInformationBackup` | 债券信息子表区备份 |
| `` | `` | `bondRegisterApplyChangeInfo` | 债券注册申请变更历史 |
| `` | `` | `bondRegisterApplyUnderwriter` | 承销商子表区 |
| `` | `` | `bondRegisterApplyUnderwriterBackup` | 承销商子表区备份 |
| `` | `` | `defines` | 自由自定义项 |
