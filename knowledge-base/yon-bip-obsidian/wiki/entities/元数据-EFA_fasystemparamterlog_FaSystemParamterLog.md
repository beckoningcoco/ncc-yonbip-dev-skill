---
tags: [BIP, 元数据, 数据字典, EFA.fasystemparamterlog.FaSystemParamterLog]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 固定资产系统参数日志 (`EFA.fasystemparamterlog.FaSystemParamterLog`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`fa_system_param_log` | domain：`yonbip-fi-efa` | 应用：`EFA` | 业务对象ID：`c0eb46dc-50f2-4b1a-bc1b-80fc6587a1c2`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 固定资产系统参数日志 |
| 物理表 | `fa_system_param_log` |
| 数据库 schema | `yonbip-fi-efa` |
| 所属应用 | `EFA` |
| 直连字段 | 13 个 |
| 子表 | 0 个 |
| 关联引用 | 3 个 |

## 关联引用 (3个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |

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

> 共 13 个直连字段

### 文本字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | id |
| `param_value_new` | `param_value_new` | `paramValueNew` | 变动后参数值中文 |
| `param_name` | `param_name` | `paramName` | 参数名称中文 |
| `param_value_old_resid` | `param_value_old_resid` | `paramValueOldResid` | 变动前参数值多语编码 |
| `param_value_new_resid` | `param_value_new_resid` | `paramValueNewResid` | 变动后参数值多语编码 |
| `param_value_old` | `param_value_old` | `paramValueOld` | 变动前参数值中文 |

### 引用字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `pubts` | `pubts` | `pubts` | pubts |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |
