---
tags: [BIP, 元数据, 数据字典, ams.tagrule.TagRuleBodyVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 条码规则表体 (`ams.tagrule.TagRuleBodyVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`pam_tagrule_b` | domain：`ucf-amc-aim` | 应用：`AMS` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 条码规则表体 |
| 物理表 | `pam_tagrule_b` |
| domain/服务域 | `ucf-amc-aim` |
| schema | `amc_aim` |
| 所属应用 | `AMS` |
| 直连字段 | 15 个 |
| 子表 | 0 个 |
| 关联引用 | 3 个 |

## 关联引用 (3个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `main_id` | `` |
| `tenantid` | `` |

## 继承接口 (4个, 4字段)

- **租户接口** (`baseapp.itf.ITenant`)
  - `tenantid` → `tenantid`
- **逻辑删除接口** (`baseapp.itf.LogicDelete`)
  - `dr` → `dr`
- **行号** (`baseapp.itf.IRowNo`)
  - `rowno` → `rowno`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 15 个直连字段

### 文本字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `sysid` | `sysid` | `sysid` | 应用标识 |
| `field_alias` | `field_alias` | `field_alias` | 别名 |
| `id` | `id` | `id` | 主键 |
| `rowno` | `rowno` | `rowno` | 序号 |
| `showCaption` | `showCaption` | `showCaption` | 显示字段 |
| `caption` | `caption` | `caption` | 条码字段 |
| `showCaption_resid` | `showCaption_resid` | `showCaption_resid` | 显示字段多语 |
| `code` | `code` | `code` | 字段编码 |
| `fullCode` | `fullCode` | `fullCode` | 来源全称 |

### 引用字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `main_id` | `main_id` | `main_id` | 资产标签 |
| `tenantid` | `tenantid` | `tenant` | 租户 |

### 短整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `applicationServices` | `applicationServices` | `applicationServices` | 应用业务 |
| `dr` | `dr` | `dr` | 逻辑删除位 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
