---
tags: [BIP, 元数据, 数据字典, apct.contract.ApctMarginDcsVo]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 履约保证金自定义项 (`apct.contract.ApctMarginDcsVo`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`apct_apct_margin_dcs` | domain：`apct` | 应用：`APCT` | 业务对象ID：`fa6537dd-b637-4191-a5e3-99d2b09b9b4a`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 履约保证金自定义项 |
| 物理表 | `apct_apct_margin_dcs` |
| 数据库 schema | `apct` |
| 所属应用 | `APCT` |
| 直连字段 | 9 个 |
| 子表 | 0 个 |
| 关联引用 | 4 个 |

## 关联引用 (4个)

| 字段名 | 引用类型 |
|--------|---------|
| `lcol1` | `apct.apct_apctref` |
| `vcol1` | `ucfbasedoc.ydzbl` |
| `ytenant_id` | `` |
| `vcol2` | `ucfbasedoc.bd_projectcardref` |

## 继承接口 (2个, 1字段)

- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **特征基础接口** (`ucfbase.character.ICharacteristcs`)

## 字段列表（按类型分组）

> 共 9 个直连字段

### 文本字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `vcol55` | `vcol55` | `NBXTHTH` | 内部协同合同号 |
| `id` | `id` | `id` | ID |

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `vcol2` | `vcol2` | `marassistant2` | 项目 |
| `lcol1` | `lcol1` | `xthth` | 协同合同号 |
| `vcol1` | `vcol1` | `ydzbl` | 溢短装比例 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dcol50` | `dcol50` | `jhrq` | 计划日期 |

### 日期时间 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bcol50` | `bcol50` | `sfkjht` | 是否框架合同 |
