---
tags: [BIP, 元数据, 数据字典, eces.costclass.CostType]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 成本类型 (`eces.costclass.CostType`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`cc_ces_costclass` | domain：`yonbip-fi-ecesweb` | 应用：`ECE` | 业务对象ID：`0e5985b0-9b53-419e-9172-0040a47af1d5`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 成本类型 |
| 物理表 | `cc_ces_costclass` |
| 数据库 schema | `yonbip-fi-ecesweb` |
| 所属应用 | `ECE` |
| 直连字段 | 18 个 |
| 子表 | 0 个 |
| 关联引用 | 6 个 |

## 关联引用 (6个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `accpurpose_id` | `finbd.bd_accpurposeref` |
| `stockorg_id` | `ucf-org-center.bd_inventoryorg` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |
| `accentity_id` | `finbd.bd_allaccbodyref_inner` |

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

> 共 18 个直连字段

### 文本字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `category` | `category` | `category` | 成本类型类别 |
| `code` | `code` | `code` | 成本类型编码 |
| `id` | `id` | `id` | id |
| `pricetype` | `pricetype` | `priceType` | 价格库价格类型 |
| `remark` | `remark` | `remark` | 备注 |

### 引用字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accentity_id` | `accentity_id` | `accentity` | 会计主体 |
| `accpurpose_id` | `accpurpose_id` | `accpurpose` | 核算目的 |
| `stockorg_id` | `stockorg_id` | `stockOrg` | 库存组织 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `is_presets` | `is_presets` | `isPresets` | 是否系统预置 |
| `valid` | `valid` | `valid` | 生效 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 成本类型名称 |
