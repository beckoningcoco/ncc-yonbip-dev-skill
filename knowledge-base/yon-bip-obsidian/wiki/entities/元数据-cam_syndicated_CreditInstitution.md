---
tags: [BIP, 元数据, 数据字典, cam.syndicated.CreditInstitution]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 授信机构 (`cam.syndicated.CreditInstitution`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`cam_syndicated_credit_institution` | domain：`yonbip-fi-ctmcam` | 应用：`CAM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 授信机构 |
| 物理表 | `cam_syndicated_credit_institution` |
| domain/服务域 | `yonbip-fi-ctmcam` |
| schema | `yonbip_fi_ctmfm` |
| 所属应用 | `CAM` |
| 直连字段 | 23 个 |
| 子表 | 0 个 |
| 关联引用 | 9 个 |

## 关联引用 (9个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |
| `ytenant_id` | `` |
| `bank_type` | `` |
| `creditInstitution` | `yonbip-fi-ctmtmsp.tmsp_fundbusinobj_Ref` |
| `creditSource` | `yonbip-fi-ctmtmsp.tmsp_fundbusinobject_typeRef` |
| `currency` | `bd_currencytenantreflist` |
| `cam_define_character_def` | `` |
| `mainid` | `` |
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

> 共 23 个直连字段

### 文本字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `creditSubagreement` | `creditSubagreement` | `creditSubagreement` | 授信子协议号 |
| `guaranteeType` | `guaranteeType` | `guaranteeType` | 担保方式 |
| `backup` | `backup` | `backup` | 备注 |
| `` | `auditor` | `auditor` | 审批人名称 |

### 引用字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `mainid` | `mainid` | `mainid` | 授信信息主表id |
| `creditSource` | `creditSource` | `creditSource` | 授信来源Id |
| `creditInstitution` | `creditInstitution` | `creditInstitution` | 授信机构Id |
| `currency` | `currency` | `currency` | 授信币种id |
| `` | `auditorId` | `auditorId` | 审批人 |
| `bank_type` | `bank_type` | `bankType` | 银行类别 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_date` | `audit_date` | `auditDate` | 审批日期 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `rowno` | `rowno` | `rowno` | 序号 |

### 短整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `controlMode` | `controlMode` | `controlMode` | 控制方式 |
| `creditEmployMode` | `creditEmployMode` | `creditEmployMode` | 授信占用方式 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |

### 数值字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `creditQuota` | `creditQuota` | `creditQuota` | 授信总额度 |
| `waveScale` | `waveScale` | `waveScale` | 动拨比例（%） |
| `creditOpenQuota` | `creditOpenQuota` | `creditOpenQuota` | 授信敞口额度 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cam_define_character_def` | `cam_define_character_def` | `camDefineCharacterDef` | 特征组 |

### timestamp (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_time` | `audit_time` | `auditTime` | 审批时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
