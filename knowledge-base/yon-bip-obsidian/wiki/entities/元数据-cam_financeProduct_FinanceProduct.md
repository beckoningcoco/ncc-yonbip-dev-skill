---
tags: [BIP, 元数据, 数据字典, cam.financeProduct.FinanceProduct]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 授信与金融产品对照 (`cam.financeProduct.FinanceProduct`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`cam_finance_product` | domain：`yonbip-fi-ctmcam` | 应用：`CAM` | 业务对象ID：`49a8e044-c84f-4f7a-8eb1-6ced17f1ad3c`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 授信与金融产品对照 |
| 物理表 | `cam_finance_product` |
| domain/服务域 | `yonbip-fi-ctmcam` |
| schema | `yonbip_fi_ctmfm` |
| 所属应用 | `CAM` |
| 直连字段 | 24 个 |
| 子表 | 1 个 |
| 关联引用 | 11 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `financeProduct_b` | `cam.financeProduct.FinanceProduct_b` | composition |

## 关联引用 (11个)

| 字段名 | 引用类型 |
|--------|---------|
| `bankNetWork` | `ucfbasedoc.bd_bankdotref` |
| `ytenant_id` | `` |
| `creditInstitution` | `yonbip-fi-ctmtmsp.tmsp_fundbusinobj_Ref` |
| `creditSource` | `yonbip-fi-ctmtmsp.tmsp_fundbusinobject_typeRef` |
| `` | `` |
| `financeProductCharacterDef` | `` |
| `accentity` | `ucf-org-center.bd_fundsorg_na` |
| `creditVariety` | `` |
| `tenant_id` | `` |

## 继承接口 (3个, 10字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 24 个直连字段

### 文本字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `creditVarietyCode` | `creditVarietyCode` | `creditVarietyCode` | 授信类别编码 |
| `creditMechanism` | `creditMechanism` | `creditMechanism` | 授信机构 |
| `creditVarietyName` | `creditVarietyName` | `creditVarietyName` | 授信类别名称 |
| `` | `creator` | `creator` | 创建人 |
| `` | `modifier` | `modifier` | 修改人 |

### 引用字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `creatorId` | `creatorId` | 创建人 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `` | `modifierId` | `modifierId` | 修改人 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `creditVariety` | `creditVariety` | `creditVariety` | 授信类别ID |
| `creditSource` | `creditSource` | `creditSource` | 授信来源Id |
| `accentity` | `accentity` | `accentity` | 授信机构id |
| `creditInstitution` | `creditInstitution` | `creditInstitution` | 授信机构Id |
| `bankNetWork` | `bankNetWork` | `bankNetWork` | 授信机构ID |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 短整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `creditSetupType` | `creditSetupType` | `creditSetupType` | 授信机构类型 |
| `status` | `status` | `status` | 启用状态 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `financeProductCharacterDef` | `financeProductCharacterDef` | `financeProductCharacterDef` | 金融产品对照特征 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 最近修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `financeProduct_b` | 金融产品对照 |
