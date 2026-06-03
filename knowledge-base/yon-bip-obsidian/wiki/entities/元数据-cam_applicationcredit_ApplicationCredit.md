---
tags: [BIP, 元数据, 数据字典, cam.applicationcredit.ApplicationCredit]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 使用额度申请 (`cam.applicationcredit.ApplicationCredit`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`cam_application_credit` | domain：`yonbip-fi-ctmcam` | 应用：`CAM` | 业务对象ID：`887884eb-cda6-4b53-b66a-2af62ca53b1b`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 使用额度申请 |
| 物理表 | `cam_application_credit` |
| 数据库 schema | `yonbip-fi-ctmcam` |
| 所属应用 | `CAM` |
| 直连字段 | 51 个 |
| 子表 | 2 个 |
| 关联引用 | 18 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `applicationCreditDet` | `cam.applicationcredit.ApplicationCreditDet` | composition |
| `defines` | `cam.applicationcredit.ApplicationCreditDefine` | composition |

## 关联引用 (18个)

| 字段名 | 引用类型 |
|--------|---------|
| `submitter` | `` |
| `` | `` |
| `ytenant_id` | `` |
| `bank_type` | `` |
| `accentity_raw` | `ucf-org-center.bd_financeorgtreeref_na` |
| `in_credit_source` | `yonbip-fi-ctmtmsp.tmsp_fundbusinobject_typeRef` |
| `accentity` | `ucf-org-center.bd_fundsorg_na` |
| `bustype` | `bd_transtypelistref` |
| `relevancy_group_credit` | `` |
| `withdrawpp` | `` |
| `credit_organ_bank` | `yonbip-fi-ctmtmsp.tmsp_fundbusinobj_Ref` |
| `application_credit_character_def` | `` |
| `currency` | `bd_currencytenantreflist` |
| `tenant_id` | `` |

## 继承接口 (6个, 21字段)

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
- **审批提交信息** (`ucfbase.ucfbaseItf.ISubmitInfo`)
  - `submitter` → `submitter`
  - `submit_time` → `submit_time`
  - `withdrawpp` → `withdrawpp`
  - `withdraw_time` → `withdraw_time`

## 字段列表（按类型分组）

> 共 51 个直连字段

### 文本字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | 单据编号 |
| `relevance_id` | `relevance_id` | `relevanceId` | 关联单据ID |
| `show_credit_term` | `show_credit_term` | `showCreditTerm` | 授信期限 |
| `remarks` | `remarks` | `remarks` | 备注 |
| `` | `creator` | `creator` | 创建人 |
| `` | `modifier` | `modifier` | 修改人 |
| `` | `auditor` | `auditor` | 审批人 |

### 引用字段 (15个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accentity` | `accentity` | `accentity` | 资金组织 |
| `accentity_raw` | `accentity_raw` | `accentityRaw` | 核算会计主体 |
| `relevancy_group_credit` | `relevancy_group_credit` | `relevancyGroupCredit` | 关联集团授信 |
| `submitter` | `submitter` | `submitter` | 提交人 |
| `withdrawpp` | `withdrawpp` | `withdrawpp` | 撤回提交的人 |
| `bank_type` | `bank_type` | `bankType` | 银行类别 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `` | `auditorId` | `auditorId` | 审批人 |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `in_credit_source` | `in_credit_source` | `inCreditSource` | 授信来源Id |
| `credit_organ_bank` | `credit_organ_bank` | `creditOrganBank` | 授信机构id |
| `currency` | `currency` | `currency` | 币种id |
| `bustype` | `bustype` | `bustype` | 交易类型id |

### 日期字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `vouch_date` | `vouch_date` | `vouchdate` | 单据日期 |
| `standard_expire_date` | `standard_expire_date` | `standardExpireDate` | 到期日期(规则计算的到期日期) |
| `credit_start` | `credit_start` | `creditStart` | 授信开始日 |
| `credit_end` | `credit_end` | `creditEnd` | 授信结束日 |
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |
| `audit_date` | `audit_date` | `auditDate` | 审批日期 |

### 日期时间 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `submit_time` | `submit_time` | `submitTime` | 提交时间 |
| `withdraw_time` | `withdraw_time` | `withdrawTime` | 撤回提交时间 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `isWfControlled` | `isWfControlled` | 是否审批流控制 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `credit_term` | `credit_term` | `creditTerm` | 授信期限 |

### 短整数 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `basebilltype` | `basebilltype` | `basebilltype` | 单据类型 |
| `` | `returncount` | `returncount` | 退回次数 |
| `` | `status` | `status` | 单据状态 |
| `credit_type` | `credit_type` | `creditType` | 授信类型 |
| `credit_term_type` | `credit_term_type` | `creditTermType` | 授信期限类型 |
| `relevance` | `relevance` | `relevance` | 是否被关联 |
| `approval_status` | `approval_status` | `approvalStatus` | 审批状态 |
| `` | `verifystate` | `verifystate` | 审批状态 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `tplid` | `tplid` | 模板id |
| `id` | `id` | `id` | 主表id |

### 数值字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `credit_quota` | `credit_quota` | `creditQuota` | 授信申请额度 |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `audit_time` | `audit_time` | `auditTime` | 审批时间 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `application_credit_character_def` | `application_credit_character_def` | `applicationCreditCharacterDef` | 特征组 |

### other (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `applicationCreditDet` | 授信明细 |
| `` | `` | `defines` | 自由自定义项 |
