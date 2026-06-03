---
tags: [BIP, 元数据, 数据字典, st.salesout.SalesOutExtend]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 销售出库单主表扩展 (`st.salesout.SalesOutExtend`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`st_salesout_extend` | domain：`ustock` | 应用：`ST` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 销售出库单主表扩展 |
| 物理表 | `st_salesout_extend` |
| 数据库 schema | `ustock` |
| 所属应用 | `ST` |
| 直连字段 | 8 个 |
| 关联引用 | 4 个 |

## 关联引用 (4个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `saleArea` | `` |
| `id` | `` |
| `buddy` | `` |

## 继承接口 (1个, 1字段)

- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 8 个直连字段

### 文本字段 (4个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `dependentTaskType` | `dependentTaskType` | String | 过账依赖 |
| `receievinvoiceemail` | `receievinvoiceemail` | String | 收票邮箱 |
| `receievinvoicemobile` | `receievinvoicemobile` | String | 收票手机号 |
| `sign_business_source` | `sign_business_source` | String | 业务来源 |

### 引用字段 (4个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `buddy` | `buddy` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | 伙伴 |
| `id` | `id` | 09b66409-4f08-4dc6-957b-3d5ac15e1ea8 | 销售出库单主表id |
| `saleArea` | `saleArea` | 75fb7b76-fdb5-4e87-ab0d-e4215a299634 | 销售区域 |
| `ytenant_id` | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | 租户id |
