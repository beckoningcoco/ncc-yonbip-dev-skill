---
tags: [BIP, 元数据, 数据字典, GL.rulevoucher.fiVtAux]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 规则凭证辅助核算子表 (`GL.rulevoucher.fiVtAux`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`fi_vt_aux` | domain：`yonbip-fi-egl` | 应用：`GL` | 业务对象ID：`7b4c8f89-c22b-45b7-beca-0834bdafea6a`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 规则凭证辅助核算子表 |
| 物理表 | `fi_vt_aux` |
| 数据库 schema | `yonbip-fi-egl` |
| 所属应用 | `GL` |
| 直连字段 | 11 个 |
| 子表 | 0 个 |
| 关联引用 | 3 个 |

## 关联引用 (3个)

| 字段名 | 引用类型 |
|--------|---------|
| `head` | `` |
| `ytenant_id` | `` |
| `body` | `` |

## 继承接口 (1个, 1字段)

- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 11 个直连字段

### 文本字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |
| `auxid` | `auxid` | `auxid` | 辅助核算id |
| `doctype` | `doctype` | `doctype` | 档案类型 |
| `auxcode` | `auxcode` | `auxcode` | 辅助核算项code |
| `auxfun` | `auxfun` | `auxfun` | 辅助核算项公式 |
| `srctplid` | `srctplid` | `srctplid` | 来源id |
| `tenantid` | `tenantid` | `tenantid` | 租户id |

### 引用字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `head` | `head` | `head` | 主表id |
| `body` | `body` | `body` | 子表分录id |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `auxindex` | `auxindex` | `auxindex` | 辅助核算序号 |
