---
tags: [BIP, 元数据, 数据字典, FIAP.FIAP.VerifyMatch]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 应付匹配规则 (`FIAP.FIAP.VerifyMatch`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`arap_verify_plan_b_match` | domain：`yonbip-fi-earap` | 应用：`EAP` | 业务对象ID：`afff1c3a-bd85-4cb1-b855-fd1d4665800c`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 应付匹配规则 |
| 物理表 | `arap_verify_plan_b_match` |
| domain/服务域 | `yonbip-fi-earap` |
| schema | `fiearap` |
| 所属应用 | `EAP` |
| 直连字段 | 14 个 |
| 子表 | 0 个 |
| 关联引用 | 4 个 |

## 关联引用 (4个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |
| `plan_id` | `yonbip-fi-earap.ap_verify_plan_ref` |

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

### 文本字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `field_name` | `field_name` | `fieldName` | 匹配元数据名称 |
| `id` | `id` | `id` | 主键 |
| `table_alias` | `table_alias` | `tableAlias` | 表字段别名 |
| `ui_component_caption` | `ui_component_caption` | `uiComponentCaption` | 控件标题 |
| `ui_component_field_value` | `ui_component_field_value` | `uiComponentFieldValue` | 字段值 |
| `ui_component_type` | `ui_component_type` | `uiComponentType` | 控件类型 |

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `plan_id` | `plan_id` | `plan` | 应付核销方案 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |
