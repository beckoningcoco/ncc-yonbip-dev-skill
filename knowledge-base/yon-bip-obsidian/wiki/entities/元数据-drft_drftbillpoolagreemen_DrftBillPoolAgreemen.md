---
tags: [BIP, 元数据, 数据字典, drft.drftbillpoolagreemen.DrftBillPoolagreemen]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 票据池协议 (`drft.drftbillpoolagreemen.DrftBillPoolagreemen`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`drft_billpoolagreemen` | domain：`drft` | 应用：`DRFT` | 业务对象ID：`c855019b-0d38-4348-a24b-f69af7a47819`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 票据池协议 |
| 物理表 | `drft_billpoolagreemen` |
| domain/服务域 | `drft` |
| schema | `ctmdrft` |
| 所属应用 | `DRFT` |
| 直连字段 | 51 个 |
| 子表 | 1 个 |
| 关联引用 | 13 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `drftmembersoftheunit` | `drft.drftbillpoolagreemen.DrftMembersOfTheUnit` | composition |

## 关联引用 (13个)

| 字段名 | 引用类型 |
|--------|---------|
| `securityaccount` | `bd_enterprisebankacctref` |
| `ytenant_id` | `` |
| `accentity_raw` | `bd_accbody` |
| `` | `` |
| `accentity` | `ucf-org-center.bd_fundsorg_na` |
| `trade_type` | `bd_transtypelistref` |
| `currency` | `bd_currencytenantreflist` |
| `bankname` | `bd_bankcardref` |
| `sign_up_account` | `yonbip-fi-ctmtmsp.tmsp_elebankaccountref` |
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

> 共 51 个直连字段

### 文本字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `protocolcode` | `protocolcode` | `protocolcode` | 协议编号 |
| `code` | `code` | `code` | 单据编号 |
| `old_code` | `old_code` | `oldCode` | 旧的协议编码 |
| `protocol_name` | `protocol_name` | `protocolname` | 协议名称 |
| `remark` | `remark` | `remark` | 备注 |
| `versions` | `versions` | `versions` | 版本号 |
| `` | `creator` | `creator` | 创建人 |
| `` | `auditor` | `auditor` | 审批人 |
| `` | `modifier` | `modifier` | 修改人 |

### 引用字段 (12个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accentity` | `accentity` | `accentity` | 下拨资金组织id |
| `accentity_raw` | `accentity_raw` | `accentityRaw` | 核算会计主体 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `` | `creatorId` | `creatorId` | 创建人 |
| `currency` | `currency` | `currency` | 币种id |
| `bankname` | `bankname` | `bankname` | 签约银行id |
| `sign_up_account` | `sign_up_account` | `signupaccount` | 签约主账号id |
| `securityaccount` | `securityaccount` | `securityaccount` | 保证金账户id |
| `trade_type` | `trade_type` | `bustype` | 交易类型id |
| `` | `auditorId` | `auditorId` | 审批人id |
| `` | `modifierId` | `modifierId` | 修改人id |

### 日期字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |
| `signing_date` | `signing_date` | `signingdate` | 签约日期 |
| `effective_date` | `effective_date` | `effectivedate` | 生效日期 |
| `` | `vouchdate` | `vouchdate` | 单据日期 |
| `due_date` | `due_date` | `duedate` | 到期日期 |
| `audit_date` | `audit_date` | `auditDate` | 审批日期 |

### 布尔字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `isWfControlled` | `isWfControlled` | 审批流控制 |
| `isallowendorsame` | `isallowendorsame` | `isallowendorsame` | 支持同名背书 |
| `canuseflow` | `canuseflow` | `canuseflow` | 是否走审批流 |
| `is_allow_into_pool` | `is_allow_into_pool` | `isallowintopool` | 是否允许商承入池 |
| `isModify` | `isModify` | `isModify` | 是否变更过 |

### 短整数 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `returncount` | `returncount` | 退回次数 |
| `` | `status` | `status` | 单据状态 |
| `basebilltype` | `basebilltype` | `basebilltype` | 单据类型 |
| `srcitem` | `srcitem` | `srcitem` | 事项来源 |
| `event_type` | `event_type` | `eventType` | 事项类型 |
| `` | `verifystate` | `verifystate` | 审批状态 |
| `audit_status` | `audit_status` | `auditStatus` | 审批状态 |
| `effective_status` | `effective_status` | `effectiveStatus` | 生效状态 |

### 长整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主表id |
| `` | `tplid` | `tplid` | 模板id |
| `oldBillPoolId_id` | `oldBillPoolId_id` | `oldBillPoolId` | 主表老id |

### 数值字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `credit_limit` | `credit_limit` | `creditlimit` | 最高水位 |
| `credit_lowwer_limit` | `credit_lowwer_limit` | `creditlowwerlimit` | 最低水位 |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `audit_time` | `audit_time` | `auditTime` | 审批时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `drftmembersoftheunit` | 成员单位 |
