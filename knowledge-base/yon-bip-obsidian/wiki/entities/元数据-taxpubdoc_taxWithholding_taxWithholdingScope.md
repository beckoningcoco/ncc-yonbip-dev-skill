---
tags: [BIP, 元数据, 数据字典, taxpubdoc.taxWithholding.taxWithholdingScope]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 适用范围 (`taxpubdoc.taxWithholding.taxWithholdingScope`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`tax_with_hold_scope` | domain：`yonbip-fi-taxpubdoc` | 应用：`DPMTAX` | 业务对象ID：`2b481747-da02-451e-8a22-c0a7e0785ac4`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 适用范围 |
| 物理表 | `tax_with_hold_scope` |
| domain/服务域 | `yonbip-fi-taxpubdoc` |
| schema | `iuap_apdoc_basedoc` |
| 所属应用 | `DPMTAX` |
| 直连字段 | 10 个 |
| 子表 | 0 个 |
| 关联引用 | 5 个 |

## 关联引用 (5个)

| 字段名 | 引用类型 |
|--------|---------|
| `finance_org_id` | `ucf-org-center.bd_financeorgtreeref` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `taxWithholdingCode_id` | `yonbip-fi-taxpubdoc.RefTable_6e574b3619` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |

## 继承接口 (3个, 6字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`

## 字段列表（按类型分组）

> 共 10 个直连字段

### 文本字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `creator` | `creator` | `creator` | 创建人 |
| `finance_org_id` | `finance_org_id` | `financeOrgId` | 会计主体 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `taxWithholdingCode_id` | `taxWithholdingCode_id` | `taxWithholdingCodeId` | 代扣税税码 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |
