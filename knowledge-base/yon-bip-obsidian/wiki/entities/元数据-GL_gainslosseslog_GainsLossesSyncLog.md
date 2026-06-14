---
tags: [BIP, 元数据, 数据字典, GL.gainslosseslog.GainsLossesSyncLog]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 汇兑损益日志 (`GL.gainslosseslog.GainsLossesSyncLog`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`fi_exchange_gains_losses_rule_sync_log_tb` | domain：`yonbip-fi-egl` | 应用：`GL` | 业务对象ID：`44dc4f42-aaf0-4e3b-b469-92b28eb1a33c`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 汇兑损益日志 |
| 物理表 | `fi_exchange_gains_losses_rule_sync_log_tb` |
| domain/服务域 | `yonbip-fi-egl` |
| schema | `figl` |
| 所属应用 | `GL` |
| 直连字段 | 14 个 |
| 子表 | 0 个 |
| 关联引用 | 6 个 |

## 关联引用 (6个)

| 字段名 | 引用类型 |
|--------|---------|
| `opposite_acc_subject` | `fiepub.epub_accsubject_treetableref` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `acc_subject` | `fiepub.epub_accsubject_treetableref` |
| `rule` | `` |
| `ytenant_id` | `` |

## 继承接口 (2个, 5字段)

- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 14 个直连字段

### 文本字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |

### 引用字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `rule` | `rule` | `rule` | 汇兑损益定义 |
| `acc_subject` | `acc_subject` | `accSubject` | 本方科目 |
| `opposite_acc_subject` | `opposite_acc_subject` | `oppAccSubject` | 对方科目 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ts` | `ts` | `ts` | 同步日期 |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 枚举字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `sync_type` | `sync_type` | `syncType` | 同步类型 |
| `status` | `status` | `status` | 同步状态 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `reason` | `reason` | `reason` | 说明 |
