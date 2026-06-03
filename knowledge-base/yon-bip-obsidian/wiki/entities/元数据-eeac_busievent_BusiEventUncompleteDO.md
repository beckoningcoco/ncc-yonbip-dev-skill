---
tags: [BIP, 元数据, 数据字典, eeac.busievent.BusiEventUncompleteDO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 业务事项关结账数据参数 (`eeac.busievent.BusiEventUncompleteDO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`eac_busi_event_uncomplete` | domain：`yonbip-fi-eeac` | 应用：`EVNT` | 业务对象ID：`acac3431-08e5-4a67-bf49-d6eeb619abae`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 业务事项关结账数据参数 |
| 物理表 | `eac_busi_event_uncomplete` |
| 数据库 schema | `yonbip-fi-eeac` |
| 所属应用 | `EVNT` |
| 直连字段 | 16 个 |
| 关联引用 | 4 个 |

## 关联引用 (4个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |
| `header_id` | `yonbip-fi-eeac.RefTable_02c132dc2` |

## 继承接口 (3个, 6字段)

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

> 共 16 个直连字段

### 文本字段 (6个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `business_unit` | `business_unit` | String | 业务单元 |
| `fetch_switch` | `fetch_switch` | String | 拉取开关 |
| `id` | `id` | String | 主键 |
| `social_srcid` | `social_srcid` | String | 社会化来源id |
| `social_tenantid` | `social_tenantid` | String | 社会化来源租户 |
| `sys_id` | `sys_id` | String | 关联0租户预置数据的id |

### 引用字段 (4个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `creator` | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | 创建人 |
| `header_id` | `header_id` | 2440bd9e-542c-47ea-9070-dbfcaf3eed65 | 业务事项 |
| `modifier` | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | 修改人 |
| `ytenant_id` | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `create_time` | `create_time` | DateTime | 创建时间 |
| `modify_time` | `modify_time` | DateTime | 修改时间 |
| `pubts` | `pubts` | DateTime | 时间戳 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `bln_user_def` | `bln_user_def` | Boolean | 是否自定义 |

### 整数 (2个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `dr` | `dr` | Integer | 逻辑删除标记 |
| `social_mctype` | `social_mctype` | Integer | 社会化管控类型 |
