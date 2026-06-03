---
tags: [BIP, 元数据, 数据字典, bd.bill.Interactive]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 交互规则中间表 (`bd.bill.Interactive`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`bd_billtype_interactive` | domain：`transtype` | 应用：`BMMMM` | 业务对象ID：`5a67ced1-559e-4302-a0d0-cde9569a0656`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 交互规则中间表 |
| 物理表 | `bd_billtype_interactive` |
| 数据库 schema | `transtype` |
| 所属应用 | `BMMMM` |
| 直连字段 | 7 个 |
| 子表 | 0 个 |
| 关联引用 | 3 个 |

## 关联引用 (3个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `tenantid` | `` |
| `billtype_id` | `` |

## 字段列表（按类型分组）

> 共 7 个直连字段

### 文本字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `applicationCode` | `applicationCode` | `applicationCode` | 应用编码 |
| `id` | `id` | `id` | 主键 |
| `micro_service_code` | `micro_service_code` | `microServiceCode` | 微服务编码 |
| `rule_id` | `rule_id` | `ruleId` | 规则ID |

### 引用字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `billtype_id` | `billtype_id` | `billTypeId` | 单据类型ID |
| `tenantid` | `tenantid` | `tenantid` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户 |
