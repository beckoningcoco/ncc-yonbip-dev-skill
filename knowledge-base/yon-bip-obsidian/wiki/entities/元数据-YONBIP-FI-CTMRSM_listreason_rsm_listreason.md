---
tags: [BIP, 元数据, 数据字典, YONBIP-FI-CTMRSM.listreason.rsm_listreason]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 名单原因 (`YONBIP-FI-CTMRSM.listreason.rsm_listreason`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`rsm_listreason` | domain：`yonbip-fi-ctmrsm` | 应用：`YONBIP-FI-CTMRSM` | 业务对象ID：`17923f34-74c1-46f4-8a5f-f5e5c73d472f`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 名单原因 |
| 物理表 | `rsm_listreason` |
| 数据库 schema | `yonbip-fi-ctmrsm` |
| 所属应用 | `YONBIP-FI-CTMRSM` |
| 直连字段 | 15 个 |
| 子表 | 1 个 |
| 关联引用 | 5 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `rsm_listreason_pk_billtypeList` | `YONBIP-FI-CTMRSM.listreason.rsm_listreason_pk_billtype` | composition |

## 关联引用 (5个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `` | `` |
| `ytenant_id` | `` |
| `pk_billtype` | `` |

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

> 共 15 个直连字段

### 文本字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |
| `memo` | `memo` | `memo` | 说明 |
| `reason_code` | `reason_code` | `reasonCode` | 编码 |
| `reason_name` | `reason_name` | `reasonName` | 名单原因 |

### 引用字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `creator` | `creator` | `creator` | 创建人 |
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
| `pre_data` | `pre_data` | `preData` | 是否预置数据 |

### 枚举字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `list_type` | `list_type` | `listType` | 默认名单类型 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### quoteList (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pk_billtype` | `pk_billtype` | `pk_billtype` | 默认适用业务 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `rsm_listreason_pk_billtypeList` | 默认适用业务多选引用子实体 |
