---
tags: [BIP, 元数据, 数据字典, tlm.hedgingscheme.HedgingScheme_b]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 套保项目 (`tlm.hedgingscheme.HedgingScheme_b`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`tlm_hedgingscheme_b` | domain：`yonbip-fi-ctmtlm` | 应用：`TLM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 套保项目 |
| 物理表 | `tlm_hedgingscheme_b` |
| 数据库 schema | `yonbip-fi-ctmtlm` |
| 所属应用 | `TLM` |
| 直连字段 | 27 个 |
| 子表 | 0 个 |
| 关联引用 | 6 个 |

## 关联引用 (6个)

| 字段名 | 引用类型 |
|--------|---------|
| `project_code` | `tlm_hedgingprojectRef` |
| `ytenant_id` | `` |
| `character_def` | `` |
| `currency` | `bd_currencytenantreflist` |
| `mainid` | `` |
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

> 共 27 个直连字段

### 文本字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cash_code` | `cash_code` | `cashCode` | 现金流编号 |
| `project_id` | `project_id` | `projectId` | 套保项目id |
| `explanation` | `explanation` | `explanation` | 补充说明 |
| `groupTaskKey` | `groupTaskKey` | `groupTaskKey` | 分组任务KEY |
| `makerule_code` | `makerule_code` | `makeRuleCode` | 生单规则编号 |
| `` | `source` | `source` | 上游单据类型 |
| `` | `upcode` | `upcode` | 上游单据号 |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `mainid` | `mainid` | `mainid` | 明细编号 |
| `project_code` | `project_code` | `projectCode` | 项目编号 |
| `currency` | `currency` | `currency` | 币种id |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `plan_year` | `plan_year` | `planYear` | 计划年度 |
| `start_date` | `start_date` | `startDate` | 项目起始日期 |
| `end_date` | `end_date` | `endDate` | 项目终止日期 |

### 枚举字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `project_type` | `project_type` | `projectType` | 项目分类 |
| `project_detail_type` | `project_detail_type` | `projectDetailType` | 项目细类 |
| `direction` | `direction` | `direction` | 资产负债方向 |
| `subject_matter` | `subject_matter` | `subjectMatter` | 对冲标的 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `rowno` | `rowno` | `rowno` | 序号 |

### 长整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `` | `sourceautoid` | `sourceautoid` | 上游单据子表id |
| `` | `sourceid` | `sourceid` | 上游单据主表id |

### 数值字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `project_scale` | `project_scale` | `projectScale` | 项目规模 |

### timestamp (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `sourceMainPubts` | `sourceMainPubts` | `sourceMainPubts` | 时间戳 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `character_def` | `character_def` | `characterDef` | 套保方案子表特征 |
