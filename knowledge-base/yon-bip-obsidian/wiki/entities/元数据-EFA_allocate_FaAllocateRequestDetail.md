---
tags: [BIP, 元数据, 数据字典, EFA.allocate.FaAllocateRequestDetail]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 固定资产调拨申请明细 (`EFA.allocate.FaAllocateRequestDetail`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`fa_bill_allocate_request_dtl` | domain：`yonbip-fi-efa` | 应用：`EFA` | 业务对象ID：`55a96603-bf16-4e61-99a9-c0f92810a8c2`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 固定资产调拨申请明细 |
| 物理表 | `fa_bill_allocate_request_dtl` |
| domain/服务域 | `yonbip-fi-efa` |
| schema | `fiefa` |
| 所属应用 | `EFA` |
| 直连字段 | 14 个 |
| 子表 | 0 个 |
| 关联引用 | 7 个 |

## 关联引用 (7个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `asset_id` | `yonbip-fi-efa.fa_assetsquery_basic_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `allocate_request_id` | `` |
| `free_ch_id` | `` |
| `ytenant_id` | `` |
| `in_accentity_id` | `finbd.bd_allaccbodyref` |

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

> 共 14 个直连字段

### 文本字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |
| `remarks` | `remarks` | `remarks` | 备注 |

### 引用字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `allocate_request_id` | `allocate_request_id` | `allocateRequestId` | 固定资产调拨申请 |
| `asset_id` | `asset_id` | `assetId` | 固定资产卡片id |
| `creator` | `creator` | `creator` | 创建人 |
| `in_accentity_id` | `in_accentity_id` | `inAccentityId` | 调入会计主体ID |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bln_allocate_out` | `bln_allocate_out` | `blnAllocateOut` | 是否调出 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `free_ch_id` | `free_ch_id` | `freeChId` | 自定义特征id |
