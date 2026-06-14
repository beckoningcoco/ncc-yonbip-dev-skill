---
tags: [BIP, 元数据, 数据字典, GL.GL.glElectronicVoucher]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 电子凭证 (`GL.GL.glElectronicVoucher`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`gl_electronic_voucher` | domain：`yonbip-fi-egl` | 应用：`GL` | 业务对象ID：`8e0e773c-684e-48df-8394-ffa7b4a0939a`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 电子凭证 |
| 物理表 | `gl_electronic_voucher` |
| domain/服务域 | `yonbip-fi-egl` |
| schema | `figl` |
| 所属应用 | `GL` |
| 直连字段 | 23 个 |
| 子表 | 0 个 |
| 关联引用 | 6 个 |

## 关联引用 (6个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `voucher_id` | `yonbip-fi-egl.RefTable_bac0ea5062` |
| `accbook_id` | `fiepub.fiepub_accountbookref` |
| `ytenant_id` | `` |
| `document_type` | `ucfbasedoc.bd_billtypetreeref` |

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

> 共 23 个直连字段

### 文本字段 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `evoucher_unique` | `evoucher_unique` | `evoucher_unique` | 电子凭证唯一标识 |
| `eledocument_type` | `eledocument_type` | `eledocument_type` | 电子单据类型 |
| `document_number` | `document_number` | `document_number` | 单据号 |
| `Issuing_unit` | `Issuing_unit` | `Issuing_unit` | 开具单位 |
| `periodunion` | `periodunion` | `periodunion` | 会计期间 |
| `entry_attachment` | `entry_attachment` | `entry_attachment` | 入账信息附件 |
| `archive_status` | `archive_status` | `archive_status` | 归档状态 |
| `abnormal_log` | `abnormal_log` | `abnormal_log` | 异常日志 |
| `voucherts` | `voucherts` | `voucherts` | 凭证最新修改时间 |
| `structure_attachment` | `structure_attachment` | `structure_attachment` | 结构化信息附件 |
| `id` | `id` | `id` | 主键 |

### 引用字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accbook_id` | `accbook_id` | `accbook_id` | 账簿 |
| `document_type` | `document_type` | `document_type` | 单据类型 |
| `voucher_id` | `voucher_id` | `voucher_id` | 凭证 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `pubts` | `pubts` | `pubts` | 最新修改时间 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### multipleOption (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `evoucher_type` | `evoucher_type` | `evoucher_type` | 电子凭证类型 |
| `process_state` | `process_state` | `process_state` | 处理状态 |
