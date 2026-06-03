---
tags: [BIP, 元数据, 数据字典, aim.equip.SpecialAssetVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 特种设备 (`aim.equip.SpecialAssetVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`pam_special_asset` | domain：`ucf-amc-ambd` | 应用：`AIM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 特种设备 |
| 物理表 | `pam_special_asset` |
| 数据库 schema | `ucf-amc-ambd` |
| 所属应用 | `AIM` |
| 直连字段 | 22 个 |
| 子表 | 1 个 |
| 关联引用 | 5 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `defines` | `aim.equip.SpecialAssetVODefine` | composition |

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

> 共 22 个直连字段

### 文本字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |
| `registration_authority` | `registration_authority` | `registration_authority` | 登记机关 |
| `registration_code` | `registration_code` | `registration_code` | 注册代码 |
| `certificate_no` | `certificate_no` | `certificate_no` | 检验证书编号 |
| `check_content` | `check_content` | `check_content` | 检验内容 |
| `inspection_party` | `inspection_party` | `inspection_party` | 检验方 |
| `memo` | `memo` | `memo` | 备注 |
| `sysid` | `sysid` | `sysid` | 应用标识 |

### 引用字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pk_equip` | `pk_equip` | `pk_equip` | 资产卡片 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `tenantid` | `tenantid` | `tenant` | 租户 |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pre_check_date` | `pre_check_date` | `pre_check_date` | 上次检验日期 |
| `next_check_date` | `next_check_date` | `next_check_date` | 下次检验日期 |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `check_period_num` | `check_period_num` | `check_period_num` | 检验周期 |
| `check_period_unit` | `check_period_unit` | `check_period_unit` | 周期单位 |

### 短整数 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `check_content_no` | `check_content_no` | `check_content_no` | 检验内容序号 |
| `calculation_method` | `calculation_method` | `calculation_method` | 有效期计算方式 |
| `check_status` | `check_status` | `check_status` | 特种设备检验状态 |
| `dr` | `dr` | `dr` | 逻辑删除标记 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `user_defines` | `user_defines` | `userDefines` | 特种设备自定义项 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `defines` | 特种设备自定义项 |
