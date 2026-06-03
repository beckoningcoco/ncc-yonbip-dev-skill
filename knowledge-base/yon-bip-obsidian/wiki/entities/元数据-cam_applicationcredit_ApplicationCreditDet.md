---
tags: [BIP, 元数据, 数据字典, cam.applicationcredit.ApplicationCreditDet]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 授信明细 (`cam.applicationcredit.ApplicationCreditDet`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`cam_application_credit_det` | domain：`yonbip-fi-ctmcam` | 应用：`CAM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 授信明细 |
| 物理表 | `cam_application_credit_det` |
| 数据库 schema | `yonbip-fi-ctmcam` |
| 所属应用 | `CAM` |
| 直连字段 | 22 个 |
| 子表 | 0 个 |
| 关联引用 | 9 个 |

## 关联引用 (9个)

| 字段名 | 引用类型 |
|--------|---------|
| `fin_products` | `` |
| `` | `` |
| `currency_det` | `bd_currencytenantreflist` |
| `ytenant_id` | `` |
| `accentity_det` | `ucf-org-center.bd_financeorgtreeref_na` |
| `mainid` | `` |
| `application_credit_det_character_def` | `` |
| `credit_varieties` | `cam_creditvariety_ref` |
| `tenant_id` | `` |

## 继承接口 (3个, 6字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **审批信息** (`base.itf.IApprovalInfo`)
  - `audit_date` → `audit_date`
  - `` → ``
  - `` → ``
  - `audit_time` → `audit_time`

## 字段列表（按类型分组）

> 共 22 个直连字段

### 文本字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code_det` | `code_det` | `codeDet` | 授信额度申请单据编号 |
| `` | `auditor` | `auditor` | 审批人名称 |
| `backup` | `backup` | `backup` | 备注 |
| `relevance_id` | `relevance_id` | `relevanceId` | 关联单据ID |

### 引用字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `mainid` | `mainid` | `mainid` | 授信额度申请id |
| `accentity_det` | `accentity_det` | `accentityDet` | 会计主体id |
| `credit_varieties` | `credit_varieties` | `creditVarieties` | 授信类别id |
| `currency_det` | `currency_det` | `currencyDet` | 币种id |
| `fin_products` | `fin_products` | `finProducts` | 金融品种id |
| `` | `auditorId` | `auditorId` | 审批人 |
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
| `relevance` | `relevance` | `relevance` | 是否被关联 |
| `exclusive` | `exclusive` | `exclusive` | 是否专享 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 授信明细子表id |

### 数值字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `credit_varieties_limit` | `credit_varieties_limit` | `creditVarietiesLimit` | 授信类别限额 |
| `fin_productsLimit` | `fin_productsLimit` | `finProductsLimit` | 金融产品限额 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `application_credit_det_character_def` | `application_credit_det_character_def` | `applicationCreditDetCharacterDef` | 授信额度申请明细特征 |

### timestamp (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_time` | `audit_time` | `auditTime` | 审批时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
