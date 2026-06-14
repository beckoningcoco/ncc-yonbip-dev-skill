---
tags: [BIP, 元数据, 数据字典, aim.equip.EquipManagementVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 经营权 (`aim.equip.EquipManagementVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`pam_equip_management` | domain：`ucf-amc-ambd` | 应用：`AIM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 经营权 |
| 物理表 | `pam_equip_management` |
| domain/服务域 | `ucf-amc-ambd` |
| schema | `amc_ambd` |
| 所属应用 | `AIM` |
| 直连字段 | 15 个 |
| 子表 | 0 个 |
| 关联引用 | 5 个 |

## 关联引用 (5个)

| 字段名 | 引用类型 |
|--------|---------|
| `pk_management_org` | `` |
| `pk_equip` | `` |
| `user_defines` | `` |
| `ytenant_id` | `` |
| `src_pk_transitype` | `` |

## 继承接口 (2个, 2字段)

- **逻辑删除接口** (`baseapp.itf.LogicDelete`)
  - `dr` → `dr`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 15 个直连字段

### 文本字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `end_date` | `end_date` | `end_date` | 截至日期 |
| `id` | `id` | `id` | ID |
| `memo` | `memo` | `memo` | 备注 |
| `purpose` | `purpose` | `purpose` | 用途 |
| `src_bill_code` | `src_bill_code` | `src_bill_code` | 来源单据编码 |
| `start_date` | `start_date` | `start_date` | 开始日期 |
| `sysid` | `sysid` | `sysid` | 应用标识 |

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pk_equip` | `pk_equip` | `pk_equip` | 资产卡片 |
| `pk_management_org` | `pk_management_org` | `pk_management_org` | 经营单位 |
| `src_pk_transitype` | `src_pk_transitype` | `src_pk_transitype` | 来源交易类型 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 短整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除标记 |
| `management_type` | `management_type` | `management_type` | 经营模式 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `user_defines` | `user_defines` | `userDefines` | 经营权自定义项 |
