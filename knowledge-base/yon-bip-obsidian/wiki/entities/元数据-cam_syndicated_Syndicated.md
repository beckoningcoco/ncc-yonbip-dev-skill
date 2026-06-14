---
tags: [BIP, 元数据, 数据字典, cam.syndicated.Syndicated]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 授信信息 (`cam.syndicated.Syndicated`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`cam_syndicated` | domain：`yonbip-fi-ctmcam` | 应用：`CAM` | 业务对象ID：`f00767e5-9a21-417b-b63c-5bac0edb0808`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 授信信息 |
| 物理表 | `cam_syndicated` |
| domain/服务域 | `yonbip-fi-ctmcam` |
| schema | `yonbip_fi_ctmfm` |
| 所属应用 | `CAM` |
| 直连字段 | 76 个 |
| 子表 | 6 个 |
| 关联引用 | 24 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `ExpensePlans` | `cam.syndicated.ExpensePlan` | composition |
| `CreditInstitutions` | `cam.syndicated.CreditInstitution` | composition |
| `CostSchemes` | `cam.syndicated.CostScheme` | composition |
| `CreditDetailss` | `cam.syndicated.CreditDetails` | composition |
| `WarrantyDetailss` | `cam.syndicated.WarrantyDetails` | composition |
| `MarginDetailss` | `cam.syndicated.MarginDetails` | composition |

## 关联引用 (24个)

| 字段名 | 引用类型 |
|--------|---------|
| `country` | `` |
| `trustedTarget` | `bd_accbody` |
| `submitter` | `` |
| `activity` | `` |
| `ytenant_id` | `` |
| `` | `` |
| `accentity_raw` | `ucf-org-center.bd_financeorgtreeref_na` |
| `project` | `` |
| `wbs` | `` |
| `dept` | `` |
| `cam_define_character_def` | `` |
| `accentity` | `ucf-org-center.bd_fundsorg_na` |
| `bustype` | `` |
| `withdrawpp` | `` |
| `trustee` | `` |
| `tenant_id` | `` |

## 继承接口 (7个, 15字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **审批流信息** (`base.itf.IApprovalFlow`)
  - `` → ``
  - `` → ``
  - `` → ``
- **自动编码** (`baseapp.itf.IAutoCode`)
- **审批信息** (`base.itf.IApprovalInfo`)
  - `audit_date` → `audit_date`
  - `` → ``
  - `` → ``
  - `audit_time` → `audit_time`
- **项目结构属性** (`BGDM.wbs.projectStructureProperties`)
  - `activity` → `activity`
  - `wbs` → `wbs`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **审批提交信息** (`ucfbase.ucfbaseItf.ISubmitInfo`)
  - `submitter` → `submitter`
  - `submit_time` → `submit_time`
  - `withdrawpp` → `withdrawpp`
  - `withdraw_time` → `withdraw_time`

## 字段列表（按类型分组）

> 共 76 个直连字段

### 文本字段 (22个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `creator` | `creator` | 创建人 |
| `` | `auditor` | `auditor` | 审批人 |
| `backup1` | `backup1` | `backup1` | 备用字段1 |
| `backup2` | `backup2` | `backup2` | 备用字段2 |
| `backup3` | `backup3` | `backup3` | 备用字段3 |
| `backup4` | `backup4` | `backup4` | 备用字段4 |
| `backup5` | `backup5` | `backup5` | 备用字段5 |
| `backup6` | `backup6` | `backup6` | 备用字段6 |
| `modify_status` | `modify_status` | `modifyStatus` | 银团授信合同是否修改过 yes no |
| `create_method` | `create_method` | `createMethod` | 生成方式 |
| `financingPurpose` | `financingPurpose` | `financingPurpose` | 融资用途 |
| `projectName` | `projectName` | `projectName` | 项目名称 |
| `rateTermDesc` | `rateTermDesc` | `rateTermDesc` | 利率条件 |
| `guaranteeDescription` | `guaranteeDescription` | `guaranteeDescription` | 担保描述 |
| `trusteeType` | `trusteeType` | `trusteeType` | 受托人机构类型 |
| `repaymentType` | `repaymentType` | `repaymentType` | 还款方式 |
| `backItem11` | `backItem11` | `backItem11` | 预留1 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `code` | `code` | `code` | 单据编号 |
| `showCreditTerm` | `showCreditTerm` | `showCreditTerm` | 期限类型 |
| `backup` | `backup` | `backup` | 备注 |
| `creditSubagreement` | `creditSubagreement` | `creditSubagreement` | 授信协议号 |

### 引用字段 (17个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accentity` | `accentity` | `accentity` | 资金组织 |
| `accentity_raw` | `accentity_raw` | `accentityRaw` | 核算会计主体 |
| `bustype` | `bustype` | `bustype` | 交易类型 |
| `project` | `project` | `project` | 项目 |
| `dept` | `dept` | `dept` | 部门 |
| `country` | `country` | `country` | 国家(地区) |
| `trustee` | `trustee` | `trustee` | 受托人 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `` | `auditorId` | `auditorId` | 审批人 |
| `wbs` | `wbs` | `wbs` | WBS |
| `activity` | `activity` | `activity` | 活动 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `trustedTarget` | `trustedTarget` | `trustedTarget` | 受信对象id |
| `submitter` | `submitter` | `submitter` | 提交人 |
| `withdrawpp` | `withdrawpp` | `withdrawpp` | 撤回提交的人 |

### 日期字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `standard_expire_date` | `standard_expire_date` | `standardExpireDate` | 到期日期(规则计算的到期日期) |
| `audit_date` | `audit_date` | `auditDate` | 审批日期 |
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |
| `` | `vouchdate` | `vouchdate` | 单据日期 |
| `creditStart` | `creditStart` | `creditStart` | 授信开始日 |
| `expireDate` | `expireDate` | `expireDate` | 授信到期日 |

### 日期时间 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `submit_time` | `submit_time` | `submitTime` | 提交时间 |
| `withdraw_time` | `withdraw_time` | `withdrawTime` | 撤回提交时间 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `isWfControlled` | `isWfControlled` | 审批流控制 |

### 枚举字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `rateType` | `rateType` | `rateType` | 利率类型 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `creditTerm` | `creditTerm` | `creditTerm` | 授信期限 |

### 短整数 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `basebilltype` | `basebilltype` | `basebilltype` | 单据类型 |
| `` | `returncount` | `returncount` | 退回次数 |
| `` | `status` | `status` | 单据状态 |
| `creditType` | `creditType` | `creditType` | 授信类型 |
| `creditTermType` | `creditTermType` | `creditTermType` | 授信期限类型 |
| `creditTermDate` | `creditTermDate` | `creditTermDate` | 期限类型 |
| `approvalStatus` | `approvalStatus` | `approvalStatus` | 审批状态 |
| `` | `verifystate` | `verifystate` | 审批状态 |

### 长整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `related_apply_id` | `related_apply_id` | `relatedApplyId` | 关联申请单ID |
| `` | `tplid` | `tplid` | 模板id |
| `id` | `id` | `id` | ID |

### 数值字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `topRate` | `topRate` | `topRate` | 封顶利率 |
| `expectRate` | `expectRate` | `expectRate` | 预计利率 |
| `overdueInterestRate` | `overdueInterestRate` | `overdueInterestRate` | 逾期利率 |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `audit_time` | `audit_time` | `auditTime` | 审批时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cam_define_character_def` | `cam_define_character_def` | `camDefineCharacterDef` | 特征组 |

### other (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `CostSchemes` | 费用方案 |
| `` | `` | `CreditDetailss` | 授信明细 |
| `` | `` | `CreditInstitutions` | 授信机构 |
| `` | `` | `ExpensePlans` | 费用计划 |
| `` | `` | `MarginDetailss` | 保证金明细 |
| `` | `` | `WarrantyDetailss` | 担保明细 |
