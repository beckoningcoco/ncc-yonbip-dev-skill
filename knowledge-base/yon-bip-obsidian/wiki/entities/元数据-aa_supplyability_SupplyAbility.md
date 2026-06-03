---
tags: [BIP, 元数据, 数据字典, aa.supplyability.SupplyAbility]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 供应商等级体系主表 (`aa.supplyability.SupplyAbility`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`aa_supplyability` | domain：`yssupplier` | 应用：`DPMSPL` | 业务对象ID：`95852e48-fa33-47e4-948f-d42273c48d88`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 供应商等级体系主表 |
| 物理表 | `aa_supplyability` |
| 数据库 schema | `yssupplier` |
| 所属应用 | `DPMSPL` |
| 直连字段 | 18 个 |
| 子表 | 1 个 |
| 关联引用 | 4 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `details` | `aa.supplyability.SupplyAbilityDetail` | composition |

## 关联引用 (4个)

| 字段名 | 引用类型 |
|--------|---------|
| `supplyability_character` | `` |
| `ytenant_id` | `` |
| `` | `` |
| `org_id` | `ucf-org-center.bd_adminorgtreeref` |

## 继承接口 (1个, 1字段)

- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 18 个直连字段

### 文本字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | 编码 |
| `is_system` | `is_system` | `isSystem` | 是否系统预制(1是0否) |
| `operator_code` | `operator_code` | `operatorCode` | 操作人编码 |
| `operator_name` | `operator_name` | `operatorName` | 操作人 |
| `org_name` | `org_name` | `orgName` | 组织名称 |
| `score_std` | `score_std` | `scoreStd` | 子表json |
| `status` | `status` | `status` | 状态 |

### 引用字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `org_id` | `org_id` | `orgId` | 组织ID |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `system_class` | `system_class` | `systemClass` | 体系类型 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `operator_id` | `operator_id` | `operatorId` | 操作人ID |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `createtime` | `createtime` | `createtime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 操作时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `details` | 供应商等级体系子表 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 名称 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `supplyability_character` | `supplyability_character` | `supplyabilityCharacter` | 供应商等级体系主表特征 |
