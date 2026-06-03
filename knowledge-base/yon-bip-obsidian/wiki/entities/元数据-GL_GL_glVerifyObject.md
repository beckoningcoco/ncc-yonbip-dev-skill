---
tags: [BIP, 元数据, 数据字典, GL.GL.glVerifyObject]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 核销对象设置 (`GL.GL.glVerifyObject`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`gl_verify_object` | domain：`yonbip-fi-egl` | 应用：`GL` | 业务对象ID：`02131773-9c45-48bc-af81-a6f50db8fa55`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 核销对象设置 |
| 物理表 | `gl_verify_object` |
| 数据库 schema | `yonbip-fi-egl` |
| 所属应用 | `GL` |
| 直连字段 | 25 个 |
| 子表 | 0 个 |
| 关联引用 | 5 个 |

## 关联引用 (5个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `accbook_id` | `fiepub.fiepub_accountbookref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |
| `accsubject_vid` | `fiepub.epub_accsubjectversion_treecard_ref` |

## 继承接口 (3个, 6字段)

- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 25 个直连字段

### 文本字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accsubjectchart_id` | `accsubjectchart_id` | `accsubjeCthartId` | 科目表 |
| `allow_other_currencies` | `allow_other_currencies` | `allowOtherCurrencies` | 允许异币种核销 |
| `code` | `code` | `code` | 编码 |
| `ext_vrs` | `ext_vrs` | `extVrs` | 辅助核算 |
| `global_org_object_id` | `global_org_object_id` | `globalOrgObjectId` | 企业账号级核销对象id |
| `id` | `id` | `id` | 主键 |
| `loss_scheme` | `loss_scheme` | `lossScheme` | 汇兑损益方案 |
| `started_period` | `started_period` | `startedPeriod` | 启用期间 |
| `verifyautotaskid` | `verifyautotaskid` | `verifyautotaskid` | 核销自动任务id |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accbook_id` | `accbook_id` | `accbookId` | 账簿 |
| `accsubject_vid` | `accsubject_vid` | `accsubjectVid` | 会计科目 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `started_date` | `started_date` | `startedDate` | 启用日期 |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 整数 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `allow_cross_subject` | `allow_cross_subject` | `allowCrossSubject` | 允许跨科目核销 |
| `forced_control` | `forced_control` | `forcedControl` | 严格控制 |
| `required_verify_no` | `required_verify_no` | `requiredVerifyNo` | 是否必录核销号 |
| `shared` | `shared` | `shared` | 提供“是”“否”,默认否 |
| `source` | `source` | `source` | 来源:1企业账号级2共享3账簿4分配 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `start_status` | `start_status` | `startStatus` | 启用状态: 1开启状态 0关闭状态 -1停用 |
