---
tags: [BIP, 元数据, 数据字典, grm.realrightsetting.RealRightSetting]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 物权类别设置 (`grm.realrightsetting.RealRightSetting`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`grm_real_right_setting` | domain：`yonbip-fi-ctmgrm` | 应用：`GRM` | 业务对象ID：`94356610-fb4a-4951-98e5-8711559bab24`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 物权类别设置 |
| 物理表 | `grm_real_right_setting` |
| domain/服务域 | `yonbip-fi-ctmgrm` |
| schema | `yonbip_fi_ctmfm` |
| 所属应用 | `GRM` |
| 直连字段 | 24 个 |
| 子表 | 0 个 |
| 关联引用 | 5 个 |

## 关联引用 (5个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `pr_character_def` | `` |
| `` | `` |
| `tenant_id` | `` |

## 继承接口 (3个, 10字段)

- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 24 个直连字段

### 文本字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `right_code` | `right_code` | `rightCode` | 物权类别编码 |
| `` | `creator` | `creator` | 创建人 |
| `` | `modifier` | `modifier` | 修改人 |
| `settingDataSource` | `settingDataSource` | `settingDataSource` | 数据来源 |
| `real_right_category2` | `real_right_category2` | `realRightCategory2` | 物权类别(英文) |
| `real_right_category3` | `real_right_category3` | `realRightCategory3` | 物权类别(繁体) |
| `real_right_category4` | `real_right_category4` | `realRightCategory4` | 物权类别(法语) |
| `real_right_category5` | `real_right_category5` | `realRightCategory5` | 物权类别(德语) |
| `real_right_category6` | `real_right_category6` | `realRightCategory6` | 物权类别 |

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 布尔字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `mortgage` | `mortgage` | `mortgage` | 是否抵押 |
| `pledge` | `pledge` | `pledge` | 是否质押 |
| `enabled` | `enabled` | `enabled` | 启用状态 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `real_right_category` | `real_right_category` | `realRightCategory` | 物权类别 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pr_character_def` | `pr_character_def` | `prCharacterDef` | 自定义新特征 |
