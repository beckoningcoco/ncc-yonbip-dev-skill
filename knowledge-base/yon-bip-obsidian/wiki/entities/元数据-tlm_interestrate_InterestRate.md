---
tags: [BIP, 元数据, 数据字典, tlm.interestrate.InterestRate]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 利率类型 (`tlm.interestrate.InterestRate`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`tlm_interestrate` | domain：`yonbip-fi-ctmtlm` | 应用：`TLM` | 业务对象ID：`f7670c51-f43a-40e2-9725-2a58d6b5d038`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 利率类型 |
| 物理表 | `tlm_interestrate` |
| domain/服务域 | `yonbip-fi-ctmtlm` |
| schema | `yonbip_fi_ctmfm` |
| 所属应用 | `TLM` |
| 直连字段 | 31 个 |
| 子表 | 0 个 |
| 关联引用 | 7 个 |

## 关联引用 (7个)

| 字段名 | 引用类型 |
|--------|---------|
| `zero_interest_id` | `` |
| `interest_rate_character_def` | `` |
| `ytenant_id` | `` |
| `` | `` |
| `currency` | `ucfbasedoc.bd_currencytenantref` |
| `tenant_id` | `` |

## 继承接口 (3个, 10字段)

- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 31 个直连字段

### 文本字段 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | 利率类型编码 |
| `type` | `type` | `type` | 利率种类 |
| `spot_or_forward` | `spot_or_forward` | `spotOrForward` | 即/远期 |
| `termUnit` | `termUnit` | `termUnit` | 期限单位 |
| `term` | `term` | `term` | 期限 |
| `business` | `business` | `business` | 适用业务 |
| `enableStatus` | `enableStatus` | `enableStatus` | 状态 |
| `data_service_rate_code` | `data_service_rate_code` | `dataServiceRateCode` | 数据服务利率编码 |
| `updateUser` | `updateUser` | `updateUser` | 更新人 |
| `` | `creator` | `creator` | 创建人 |
| `` | `modifier` | `modifier` | 修改人 |

### 引用字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `currency` | `currency` | `currency` | 币种id |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `zero_interest_id` | `zero_interest_id` | `zeroInterestID` | 零息收益率曲线ID |

### 日期字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |
| `` | `vouchdate` | `vouchdate` | 单据日期 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `termNumber` | `termNumber` | `termNumber` | 期限 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `status` | `status` | 单据状态 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `` | `tplid` | `tplid` | 模板id |

### 数值字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `rate` | `rate` | `rate` | 利率 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 利率类型名称 |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `updateDate` | `updateDate` | `updateDate` | 更新时间 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `interest_rate_character_def` | `interest_rate_character_def` | `interestRateCharacterDef` | 利率类型新增自定义项 |
