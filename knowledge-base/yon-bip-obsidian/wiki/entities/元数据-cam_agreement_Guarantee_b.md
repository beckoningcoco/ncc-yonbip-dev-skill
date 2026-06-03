---
tags: [BIP, 元数据, 数据字典, cam.agreement.Guarantee_b]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 担保明细 (`cam.agreement.Guarantee_b`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`cam_guarantee_b` | domain：`yonbip-fi-ctmcam` | 应用：`CAM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 担保明细 |
| 物理表 | `cam_guarantee_b` |
| 数据库 schema | `yonbip-fi-ctmcam` |
| 所属应用 | `CAM` |
| 直连字段 | 19 个 |
| 子表 | 1 个 |
| 关联引用 | 7 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `defines` | `cam.agreement.Guarantee_bDefine` | composition |

## 关联引用 (7个)

| 字段名 | 引用类型 |
|--------|---------|
| `agreement_guarantee_character_def` | `` |
| `ytenant_id` | `` |
| `contract` | `bd_currencytenantreflist` |
| `guarantee` | `ucf-org-center.bd_financeorgtreeref_na` |
| `mainid` | `` |
| `tenant_id` | `` |
| `` | `` |

## 继承接口 (2个, 2字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 19 个直连字段

### 文本字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `isOwnAdd` | `isOwnAdd` | `isOwnAdd` | 是否自己添加 |
| `contractAccEntity` | `contractAccEntity` | `contractAccEntity` | 合同会计主体Id |
| `srcOccupyCode` | `srcOccupyCode` | `srcOccupyCode` | 来源占用单code |
| `srcOccupyType` | `srcOccupyType` | `srcOccupyType` | 来源占用单类型 |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `contract` | `contract` | `contract` | 担保合同id |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `mainid` | `mainid` | `mainid` | 合同id |
| `guarantee` | `guarantee` | `guarantee` | 担保主体id |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `rowno` | `rowno` | `rowno` | 序号 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 担保明细id |
| `srcOccupyId` | `srcOccupyId` | `srcOccupyId` | 来源占用单Id |

### 数值字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `guaranteeLimit` | `guaranteeLimit` | `guaranteeLimit` | 本次担保额度 |
| `balance` | `balance` | `balance` | 担保合同余额 |
| `originalGuaranteeAmount` | `originalGuaranteeAmount` | `originalGuaranteeAmount` | 原担保额度 |
| `release_apply_amt` | `release_apply_amt` | `releaseApplyAmt` | 释放申请额度 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `agreement_guarantee_character_def` | `agreement_guarantee_character_def` | `agreementGuaranteeCharacterDef` | 授信合同担保明细特征 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `defines` | 担保明细自定义项 |
