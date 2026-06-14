---
tags: [BIP, 元数据, 数据字典, GL.voucher.bdVoucherWidth]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 凭证页面宽度设置 (`GL.voucher.bdVoucherWidth`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`bd_voucher_width` | domain：`yonbip-fi-egl` | 应用：`GL` | 业务对象ID：`5086379f-cc69-4629-a76e-810dfc87dc94`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 凭证页面宽度设置 |
| 物理表 | `bd_voucher_width` |
| domain/服务域 | `yonbip-fi-egl` |
| schema | `figl` |
| 所属应用 | `GL` |
| 直连字段 | 5 个 |
| 子表 | 0 个 |
| 关联引用 | 1 个 |

## 关联引用 (1个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |

## 继承接口 (1个, 1字段)

- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 5 个直连字段

### 文本字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |
| `widthstr` | `widthstr` | `widthstr` | 凭证列宽前端参数 |
| `setting_json` | `setting_json` | `settingJson` | 设置json |
| `uid` | `uid` | `uid` | 用户id |

### 引用字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |
