---
tags: [BIP, 元数据, 数据字典, cam.creditapply.CreditApplySmartArea]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 授信申请智能区 (`cam.creditapply.CreditApplySmartArea`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`cam_creditapply_smart_area` | domain：`yonbip-fi-ctmcam` | 应用：`CAM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 授信申请智能区 |
| 物理表 | `cam_creditapply_smart_area` |
| domain/服务域 | `yonbip-fi-ctmcam` |
| schema | `yonbip_fi_ctmfm` |
| 所属应用 | `CAM` |
| 直连字段 | 22 个 |
| 子表 | 0 个 |
| 关联引用 | 8 个 |

## 关联引用 (8个)

| 字段名 | 引用类型 |
|--------|---------|
| `headOfficeOrg` | `` |
| `` | `` |
| `groupInstitution` | `` |
| `ytenant_id` | `` |
| `enterpriseInstitution` | `` |
| `innerInstitution` | `` |
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

> 共 22 个直连字段

### 文本字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `auditor` | `auditor` | 审批人名称 |

### 引用字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `auditorId` | `auditorId` | 审批人 |
| `enterpriseInstitution` | `enterpriseInstitution` | `enterpriseInstitution` | 企业授信机构 |
| `groupInstitution` | `groupInstitution` | `groupInstitution` | 集团授信机构 |
| `headOfficeOrg` | `headOfficeOrg` | `headOfficeOrg` | 总行机构 |
| `innerInstitution` | `innerInstitution` | `innerInstitution` | 内部授信机构 |
| `mainid` | `mainid` | `mainid` | 授信申请id |
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

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### 数值字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `enterpriseAmt` | `enterpriseAmt` | `enterpriseAmt` | 企业授信额度 |
| `enterpriseTotalAmt` | `enterpriseTotalAmt` | `enterpriseTotalAmt` | 企业授信总额度 |
| `groupAmt` | `groupAmt` | `groupAmt` | 集团授信额度 |
| `groupTotalAmt` | `groupTotalAmt` | `groupTotalAmt` | 集团授信总额度 |
| `headAmt` | `headAmt` | `headAmt` | 总授信额度 |
| `headTotalAmt` | `headTotalAmt` | `headTotalAmt` | 总授信总额度 |
| `innerAmt` | `innerAmt` | `innerAmt` | 内部授信额度 |
| `innerTotalAmt` | `innerTotalAmt` | `innerTotalAmt` | 内部授信总额度 |

### timestamp (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_time` | `audit_time` | `auditTime` | 审批时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
