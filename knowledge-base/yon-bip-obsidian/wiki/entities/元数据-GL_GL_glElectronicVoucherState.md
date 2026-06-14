---
tags: [BIP, 元数据, 数据字典, GL.GL.glElectronicVoucherState]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 电子凭证状态 (`GL.GL.glElectronicVoucherState`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`gl_electronic_voucher_filestatus` | domain：`yonbip-fi-egl` | 应用：`GL` | 业务对象ID：`5eb4ba90-b831-4ad1-85de-6d4b684cd854`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 电子凭证状态 |
| 物理表 | `gl_electronic_voucher_filestatus` |
| domain/服务域 | `yonbip-fi-egl` |
| schema | `figl` |
| 所属应用 | `GL` |
| 直连字段 | 16 个 |
| 子表 | 0 个 |
| 关联引用 | 4 个 |

## 关联引用 (4个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `accbook_id` | `fiepub.fiepub_accountbookref` |
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

> 共 16 个直连字段

### 文本字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |
| `periodunion` | `periodunion` | `periodunion` | 会计期间 |
| `voucherts` | `voucherts` | `voucherts` | 凭证最新修改时间 |
| `filestatus` | `filestatus` | `filestatus` | 归档状态 |
| `report_status` | `report_status` | `report_status` | 上报状态 |
| `settleaccountts` | `settleaccountts` | `settleaccountts` | 总账结账时间戳 |
| `ytenant_id` | `ytenant_id` | `ytenant_id` | 租户id |

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accbook_id` | `accbook_id` | `accbook_id` | 账簿 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 最新修改时间 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### multipleOption (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `complete_status` | `complete_status` | `complete_status` | 任务完成状态 |
