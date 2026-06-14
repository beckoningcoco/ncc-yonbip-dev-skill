---
tags: [BIP, 元数据, 数据字典, AAI.outSystemRegist.outSystemRegist]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 目标系统注册 (`AAI.outSystemRegist.outSystemRegist`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`aai_system_regist` | domain：`yonbip-fi-eaai` | 应用：`AAI` | 业务对象ID：`e7fd11f3-53b9-4c43-8904-6f6b65946f30`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 目标系统注册 |
| 物理表 | `aai_system_regist` |
| domain/服务域 | `yonbip-fi-eaai` |
| schema | `fieaai` |
| 所属应用 | `AAI` |
| 直连字段 | 26 个 |
| 关联引用 | 4 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `aaiSystemRegistBList` | `AAI.outSystemRegist.aaiSystemRegistB` | composition |

## 关联引用 (4个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `` | `` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |

## 继承接口 (4个, 9字段)

- **档案状态** (`iuap.busiObj.IEnable`)
  - `disablets` → `disablets`
  - `enable` → `enable`
  - `enablets` → `enablets`
- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 26 个直连字段

### 文本字段 (7个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `domain` | `domain` | String | 系统域名 |
| `reverse_bean` | `reverse_bean` | String | 逆向bean |
| `reverse_check_bean` | `reverse_check_bean` | String | 逆向检查bean |
| `service_bean` | `service_bean` | String | 正向bean |
| `sys_id` | `sys_id` | String | 关联0租户预置数据id,取自本表id |
| `id` | `id` | String | 主键 |
| `code` | `code` | String | 系统编码 |

### 引用字段 (3个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `creator` | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | 创建人 |
| `modifier` | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | 修改人 |
| `ytenant_id` | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | 租户id |

### 日期时间 (5个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `pubts` | `pubts` | DateTime | 时间戳 |
| `create_time` | `create_time` | DateTime | 创建时间 |
| `modify_time` | `modify_time` | DateTime | 修改时间 |
| `disablets` | `disablets` | DateTime | 停用时间 |
| `enablets` | `enablets` | DateTime | 启用时间 |

### 枚举字段 (7个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `bln_all_accbook` | `bln_all_accbook` | boolInt | 是否全部账簿 |
| `bln_user_def` | `bln_user_def` | boolInt | 是否自定义 |
| `busi_revocation_mode` | `busi_revocation_mode` | bus_back_mode | 业务撤回模式 |
| `reverse_mode` | `reverse_mode` | reverse_back_way | 逆向方式 |
| `send_mode` | `send_mode` | forward_transfer_way | 正向方式 |
| `system` | `system` | boolInt | 系统预置 |
| `system_type` | `system_type` | systemType | 系统类别 |

### 整数 (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `enable` | `enable` | Integer | 状态 |

### 短整数 (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `dr` | `dr` | Short | 逻辑删除 |

### other (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `` | `` | e485cff2-5aaf-4359-9217-44c11a4bafc3 | 账簿主系统子表 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `name` | `name` | String | 系统名称 |
