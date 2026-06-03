---
tags: [BIP, 元数据, 数据字典, aim.equip.EquipKeyPartsVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 资产部位 (`aim.equip.EquipKeyPartsVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`pam_equip_key_parts` | domain：`ucf-amc-ambd` | 应用：`AIM` | 业务对象ID：`adf97db9-dc7c-488e-804b-ece7d0ea5127`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 资产部位 |
| 物理表 | `pam_equip_key_parts` |
| 数据库 schema | `ucf-amc-ambd` |
| 所属应用 | `AIM` |
| 直连字段 | 11 个 |
| 子表 | 1 个 |
| 关联引用 | 5 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `defines` | `aim.equip.EquipKeyPartsVODefine` | composition |

## 关联引用 (5个)

| 字段名 | 引用类型 |
|--------|---------|
| `pk_equip` | `` |
| `user_defines` | `` |
| `ytenant_id` | `` |
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

> 共 11 个直连字段

### 文本字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 部位名称 |
| `memo` | `memo` | `memo` | 备注 |
| `id` | `id` | `id` | ID |
| `sysid` | `sysid` | `sysid` | 应用标识 |

### 引用字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pk_equip` | `pk_equip` | `pk_equip` | 资产卡片主键 |
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
