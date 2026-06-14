---
tags: [BIP, 元数据, 数据字典, ampub.ambase.KeyPartsVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 资产部位 (`ampub.ambase.KeyPartsVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`pam_key_parts` | domain：`ucf-amc-ambd` | 应用：`AMBD` | 业务对象ID：`6d5e5a3e-4ed4-4f0c-bc42-4b92cc8a2acf`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 资产部位 |
| 物理表 | `pam_key_parts` |
| domain/服务域 | `ucf-amc-ambd` |
| schema | `amc_ambd` |
| 所属应用 | `AMBD` |
| 直连字段 | 12 个 |
| 子表 | 1 个 |
| 关联引用 | 5 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `defines` | `ampub.ambase.KeyPartsVODefine` | composition |

## 关联引用 (5个)

| 字段名 | 引用类型 |
|--------|---------|
| `user_defines` | `` |
| `ytenant_id` | `` |
| `pk_category` | `` |
| `tenantid` | `` |
| `` | `` |

## 继承接口 (3个, 3字段)

- **逻辑删除接口** (`baseapp.itf.LogicDelete`)
  - `dr` → `dr`
- **租户接口** (`baseapp.itf.ITenant`)
  - `tenantid` → `tenantid`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 12 个直连字段

### 文本字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 标准部位名称 |
| `memo` | `memo` | `memo` | 备注 |
| `id` | `id` | `id` | ID |
| `sourceId` | `sourceId` | `sourceId` | 来源id |
| `sysid` | `sysid` | `sysid` | 应用标识 |

### 引用字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pk_category` | `pk_category` | `pk_category` | 资产类别 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `tenantid` | `tenantid` | `tenant` | 租户 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除标记 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `user_defines` | `user_defines` | `userDefines` | 资产部位自定义项 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `defines` | 资产部位自定义项 |
