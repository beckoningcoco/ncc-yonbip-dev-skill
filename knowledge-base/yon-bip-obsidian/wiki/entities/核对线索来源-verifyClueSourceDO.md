---
tags: [BIP, 元数据, 数据字典, 核对线索来源, AAI, AAI.AAI.verifyClueSourceDO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 核销线索来源 (`AAI.AAI.verifyClueSourceDO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`aai_verify_clue_source` | domain：`yonbip-fi-eaai` | 应用：`AAI` | 业务对象ID：`16497d3e-3758-4a24-bbb5-b7abc7634f92`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 核销线索来源 |
| 物理表 | `aai_verify_clue_source` |
| 数据库 schema | `yonbip-fi-eaai` |
| 所属应用 | `AAI` |
| 直连字段 | 38 个 |
| 子表 | 0 个 |
| 关联引用 | 3 个 |

## 关联引用

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |

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

> 共 38 个直连字段

### 文本字段 (22个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accentity_id` | `accentity_id` | `accentityId` | 来源会计主体 |
| `app_id` | `app_id` | `appId` | 来源应用 |
| `currtype_id` | `currtype_id` | `currtypeId` | 本币 |
| `global_currtype_id` | `global_currtype_id` | `globalCurrtypeId` | 全局本币 |
| `group_currtype_id` | `group_currtype_id` | `groupCurrtypeId` | 集团本币 |
| `id` | `id` | `id` | id |
| `org_currtype_id` | `org_currtype_id` | `orgCurrtypeId` | 组织本币 |
| `ori_currtype_id` | `ori_currtype_id` | `oriCurrtypeId` | 原币币种 |
| `verify_accbook_id` | `verify_accbook_id` | `verifyAccbookId` | 来源账簿 |
| `verify_accounting_date` | `verify_accounting_date` | `verifyAccountingDate` | 记账日期-核销方 |
| `verify_digest` | `verify_digest` | `verifyDigest` | 核销类型-摘要信息 |
| `verify_direction` | `verify_direction` | `verifyDirection` | 借贷方向-核销方 |
| `verify_grandson_row_id` | `verify_grandson_row_id` | `verifyGrandsonRowId` | 核销对象孙表id |
| `verify_group_id` | `verify_group_id` | `verifyGroupId` | 核销组ID |
| `verify_period_code` | `verify_period_code` | `verifyPeriodCode` | 会计期间code-核销方 |
| `verify_record_id` | `verify_record_id` | `verifyRecordId` | 核销对象id |
| `verify_row_id` | `verify_row_id` | `verifyRowId` | 核销对象行id |
| `verify_src_grandson_row_id` | `verify_src_grandson_row_id` | `verifySrcGrandsonRowId` | 被核销数据对象来源数据孙表id |
| `verify_src_record_id` | `verify_src_record_id` | `verifySrcRecordId` | 被核销数据对象来源数据id |
| `verify_src_row_id` | `verify_src_row_id` | `verifySrcRowId` | 被核销数据对象来源数据行id |
| `verify_src_type_id` | `verify_src_type_id` | `verifySrcTypeId` | 被核销数据对象来源类型 |
| `verify_type_id` | `verify_type_id` | `verifyTypeId` | 核销对象类型 |

### 引用字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bln_src_verify` | `bln_src_verify` | `blnSrcVerify` | 是否以来源为准 |
| `verify_type` | `verify_type` | `verifyType` | 核销来源类型 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `verify_clue_version` | `verify_clue_version` | `verifyClueVersion` | 线索版本 |
| `verify_period_id` | `verify_period_id` | `verifyPeriodId` | 会计期间ID-核销方 |

### 数值字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `verify_src_amount` | `verify_src_amount` | `verifySrcAmount` | 核销本币金额-业务 |
| `verify_src_global_amount` | `verify_src_global_amount` | `verifySrcGlobalAmount` | 来源核销全局本币金额 |
| `verify_src_group_amount` | `verify_src_group_amount` | `verifySrcGroupAmount` | 核销集团本币金额-业务 |
| `verify_src_org_amount` | `verify_src_org_amount` | `verifySrcOrgAmount` | 核销组织本币金额-业务 |
| `verify_src_ori_amount` | `verify_src_ori_amount` | `verifySrcOriAmount` | 核销原币金额-业务 |
