---
tags: [BIP, 元数据, 数据字典, pc.reportservice.MallOrderShop]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 商城订货商家 (`pc.reportservice.MallOrderShop`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`v_mallordershop` | domain：`productcenter-report` | 应用：`` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 商城订货商家 |
| 物理表 | `v_mallordershop` |
| domain/服务域 | `productcenter-report` |
| 所属应用 | `` |
| 直连字段 | 6 个 |
| 子表 | 0 个 |
| 关联引用 | 0 个 |

## 字段列表（按类型分组）

> 共 6 个直连字段

### 文本字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | 商家编号 |
| `name` | `name` | `name` | 商家名称 |
| `yxyTenantId` | `yxyTenantId` | `yxyTenantId` | 营销云应用关联租户Guid |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `customerId` | `customerId` | `customerId` | 所属客户ID |
| `id` | `id` | `id` | 商家ID |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
