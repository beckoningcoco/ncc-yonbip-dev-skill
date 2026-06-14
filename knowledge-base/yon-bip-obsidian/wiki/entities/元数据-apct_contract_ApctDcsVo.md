---
tags: [BIP, 元数据, 数据字典, apct.contract.ApctDcsVo]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 合同自定义项 (`apct.contract.ApctDcsVo`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`apct_apct_dcs` | domain：`apct` | 应用：`APCT` | 业务对象ID：`3f46ec59-3cf3-4621-ac0d-5dd32fd573bb`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 合同自定义项 |
| 物理表 | `apct_apct_dcs` |
| domain/服务域 | `apct` |
| schema | `apct` |
| 所属应用 | `APCT` |
| 直连字段 | 12 个 |
| 子表 | 0 个 |
| 关联引用 | 6 个 |

## 关联引用 (6个)

| 字段名 | 引用类型 |
|--------|---------|
| `vcol1` | `ucfbasedoc.09991` |
| `lcol1` | `apct.apct_apctref` |
| `vcol4` | `ucfbasedoc.ydzbl` |
| `ytenant_id` | `` |
| `vcol5` | `ucfbasedoc.bd_projectcardref` |
| `vcol3` | `iuap-apcom-contract.contractTypeTreeRef` |

## 继承接口 (2个, 1字段)

- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **特征基础接口** (`ucfbase.character.ICharacteristcs`)

## 字段列表（按类型分组）

> 共 12 个直连字段

### 文本字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `vcol2` | `vcol2` | `CXCX` | 测试中测试 |
| `vcol55` | `vcol55` | `NBXTHTH` | 内部协同合同号 |
| `id` | `id` | `id` | ID |

### 引用字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `vcol3` | `vcol3` | `HTLXTZ` | 合同类型电子标签 |
| `vcol1` | `vcol1` | `HTTZ` | 合同台账测试 |
| `vcol5` | `vcol5` | `marassistant2` | 项目 |
| `lcol1` | `lcol1` | `xthth` | 协同合同号 |
| `vcol4` | `vcol4` | `ydzbl` | 溢短装比例 |
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
