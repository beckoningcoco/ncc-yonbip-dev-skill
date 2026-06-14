---
tags: [BIP, 元数据, 数据字典, apct.changeBill.ApctChangeBillPlanDcsVo]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 付款计划自定义项 (`apct.changeBill.ApctChangeBillPlanDcsVo`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`apct_apct_change_plan_dcs` | domain：`apct` | 应用：`APCT` | 业务对象ID：`9d5d5739-da73-419d-8cad-85d66b2ae1ed`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 付款计划自定义项 |
| 物理表 | `apct_apct_change_plan_dcs` |
| domain/服务域 | `apct` |
| schema | `apct` |
| 所属应用 | `APCT` |
| 直连字段 | 4 个 |
| 子表 | 0 个 |
| 关联引用 | 2 个 |

## 关联引用 (2个)

| 字段名 | 引用类型 |
|--------|---------|
| `lcol1` | `apct.apct_apctref` |
| `ytenant_id` | `` |

## 继承接口 (2个, 1字段)

- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **特征基础接口** (`ucfbase.character.ICharacteristcs`)

## 字段列表（按类型分组）

> 共 4 个直连字段

### 文本字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### 引用字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `lcol1` | `lcol1` | `xthth` | 协同合同号 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期时间 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
