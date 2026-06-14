---
tags: [BIP, 元数据, 数据字典, tlm.hedgingscheme.HedgingSchemeQuotaDetail]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 套保额度明细 (`tlm.hedgingscheme.HedgingSchemeQuotaDetail`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`tlm_hedgingscheme_quota_detail` | domain：`yonbip-fi-ctmtlm` | 应用：`TLM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 套保额度明细 |
| 物理表 | `tlm_hedgingscheme_quota_detail` |
| domain/服务域 | `yonbip-fi-ctmtlm` |
| schema | `yonbip_fi_ctmfm` |
| 所属应用 | `TLM` |
| 直连字段 | 24 个 |
| 子表 | 0 个 |
| 关联引用 | 4 个 |

## 关联引用 (4个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `mainid` | `` |
| `trade_type` | `` |
| `tenant_id` | `` |

## 继承接口 (3个, 9字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **生单回写** (`base.itf.IBackWrite`)
  - `groupTaskKey` → `groupTaskKey`
  - `makerule_code` → `makerule_code`
  - `` → ``
  - `` → ``
  - `` → ``
  - `sourceMainPubts` → `sourceMainPubts`
  - `` → ``
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 24 个直连字段

### 文本字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bill_type` | `bill_type` | `billType` | 单据类型 |
| `groupTaskKey` | `groupTaskKey` | `groupTaskKey` | 分组任务KEY |
| `makerule_code` | `makerule_code` | `makeRuleCode` | 生单规则编号 |
| `scenario_name` | `scenario_name` | `scenarioName` | 方案名称 |
| `` | `source` | `source` | 上游单据类型 |
| `source_code` | `source_code` | `sourceCode` | 来源业务单据编号 |
| `` | `upcode` | `upcode` | 上游单据号 |

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `mainid` | `mainid` | `mainid` | 套保方案id |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `trade_type` | `trade_type` | `tradeType` | 交易类型 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `occupy_date` | `occupy_date` | `occupyDate` | 日期 |

### 枚举字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `credit_type` | `credit_type` | `creditType` | 额度类型 |
| `occupation_type` | `occupation_type` | `occupationType` | 占用类型 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `rowno` | `rowno` | `rowno` | 序号 |

### 长整数 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `source_id` | `source_id` | `sourceId` | 来源业务单据ID |
| `source_sublist_id` | `source_sublist_id` | `sourceSublistId` | 来源业务单据子表ID |
| `` | `sourceautoid` | `sourceautoid` | 上游单据子表id |
| `` | `sourceid` | `sourceid` | 上游单据主表id |
| `target_id` | `target_id` | `targetId` | 转移目的单据主键ID |

### 数值字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `occupancy_limits` | `occupancy_limits` | `occupancyLimits` | 额度 |

### timestamp (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `sourceMainPubts` | `sourceMainPubts` | `sourceMainPubts` | 时间戳 |
