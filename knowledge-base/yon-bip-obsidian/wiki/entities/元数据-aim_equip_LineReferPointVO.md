---
tags: [BIP, 元数据, 数据字典, aim.equip.LineReferPointVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 线性参考点 (`aim.equip.LineReferPointVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`pam_line_refer_point` | domain：`ucf-amc-ambd` | 应用：`AIM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 线性参考点 |
| 物理表 | `pam_line_refer_point` |
| domain/服务域 | `ucf-amc-ambd` |
| schema | `amc_ambd` |
| 所属应用 | `AIM` |
| 直连字段 | 25 个 |
| 子表 | 1 个 |
| 关联引用 | 8 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `defines` | `aim.equip.LineReferPointVODefine` | composition |

## 关联引用 (8个)

| 字段名 | 引用类型 |
|--------|---------|
| `pk_equip` | `` |
| `relation_equip_id` | `ucf-amc-ambd.aim_equip_new_ref` |
| `user_defines` | `` |
| `ytenant_id` | `` |
| `pk_sealer` | `` |
| `pk_line_refer` | `ucf-amc-aim.ampub_linerefer_ref` |
| `tenantid` | `` |
| `` | `` |

## 继承接口 (4个, 6字段)

- **停启用状态** (`baseapp.itf.IEnableState`)
  - `enablestate` → `enablestate`
  - `pk_sealer` → `pk_sealer`
  - `seal_time` → `seal_time`
- **逻辑删除接口** (`baseapp.itf.LogicDelete`)
  - `dr` → `dr`
- **租户接口** (`baseapp.itf.ITenant`)
  - `tenantid` → `tenantid`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 25 个直连字段

### 文本字段 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `lng` | `lng` | `lng` | 参考点经度 |
| `lat` | `lat` | `lat` | 参考点纬度 |
| `code` | `code` | `code` | 编码 |
| `name` | `name` | `name` | 名称 |
| `id` | `id` | `id` | 主键 |
| `line_refer_name` | `line_refer_name` | `line_refer_name` | 参照点名称 |
| `memo` | `memo` | `memo` | 备注 |
| `sysid` | `sysid` | `sysid` | 应用标识 |
| `gis_code` | `gis_code` | `gis_code` | GIS编码 |
| `source` | `source` | `source` | 来源 |

### 引用字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `relation_equip_id` | `relation_equip_id` | `relation_equip_id` | 关联资产编码 |
| `pk_sealer` | `pk_sealer` | `pk_sealer` | 启用人 |
| `pk_equip` | `pk_equip` | `pk_equip` | 资产卡片 |
| `pk_line_refer` | `pk_line_refer` | `pk_line_refer` | 参照点类型 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `tenantid` | `tenantid` | `tenant` | 租户 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `order` | `order` | `order` | 顺序号 |

### 短整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `enablestate` | `enablestate` | `enablestate` | 启用状态 |
| `dr` | `dr` | `dr` | 逻辑删除标记 |

### 数值字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `start_offset` | `start_offset` | `start_offset` | 与起点偏移量 |
| `continuation_length` | `continuation_length` | `continuation_length` | 连续长度 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `user_defines` | `user_defines` | `userDefines` | 线性参考点自定义项 |

### timestamp (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `seal_time` | `seal_time` | `seal_time` | 启用时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `defines` | 线性参照点自定义项 |
