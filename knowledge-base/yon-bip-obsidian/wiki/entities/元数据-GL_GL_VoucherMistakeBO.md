---
tags: [BIP, 元数据, 数据字典, GL.GL.VoucherMistakeBO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 凭证标错 (`GL.GL.VoucherMistakeBO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`fi_voucher_mistask` | domain：`yonbip-fi-egl` | 应用：`GL` | 业务对象ID：`5c2f8028-174d-4ac2-b066-892ad20374c4`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 凭证标错 |
| 物理表 | `fi_voucher_mistask` |
| domain/服务域 | `yonbip-fi-egl` |
| schema | `figl` |
| 所属应用 | `GL` |
| 直连字段 | 15 个 |
| 子表 | 0 个 |
| 关联引用 | 3 个 |

## 关联引用 (3个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
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

> 共 15 个直连字段

### 文本字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `description` | `description` | `description` | 描述 |
| `mistaskfield` | `mistaskfield` | `mistakeField` | 标错的字段 |
| `mistasktime` | `mistasktime` | `mistakeTime` | 标错时间 |
| `mistasker` | `mistasker` | `mistaker` | 标错人 |
| `voucherid` | `voucherid` | `voucherId` | 凭证id |
| `id` | `id` | `id` | 主键 |

### 引用字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `modifier` | `modifier` | `modifier` | 修改人 |
| `creator` | `creator` | `creator` | 创建人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ts` | `ts` | `pubts` | pubts |
| `modifiedtime` | `modifiedtime` | `modifyTime` | 修改时间 |
| `creationtime` | `creationtime` | `createTime` | 创建时间 |

### 整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `version` | `version` | `version` | 标错的版本号,标错1次加1 |
| `lastversion` | `lastversion` | `lastVersion` | 是否最新标错标识 |
| `recordnumber` | `recordnumber` | `recordNumber` | 凭证分录号 |
