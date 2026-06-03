---
tags: [BIP, 元数据, 数据字典, fa.fixedasset.EquipVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 固定资产资产卡片 (`fa.fixedasset.EquipVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`at_equip_info` | domain：`yonyoufi` | 应用：`FA` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 固定资产资产卡片 |
| 物理表 | `at_equip_info` |
| 数据库 schema | `yonyoufi` |
| 所属应用 | `FA` |
| 直连字段 | 15 个 |
| 子表 | 0 个 |
| 关联引用 | 3 个 |

## 关联引用 (3个)

| 字段名 | 引用类型 |
|--------|---------|
| `equipid` | `ucf-amc-ambd.aim_equip_ref` |
| `fixedassetsinfo` | `` |
| `tenant_id` | `` |

## 继承接口 (2个, 8字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **生单回写字符型** (`base.itf.IBackWriteStr`)
  - `groupTaskKey` → `groupTaskKey`
  - `makerule_code` → `makerule_code`
  - `` → ``
  - `` → ``
  - `` → ``
  - `sourceMainPubts` → `sourceMainPubts`
  - `` → ``

## 字段列表（按类型分组）

> 共 15 个直连字段

### 文本字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accentity` | `accentity` | `accentity` | 会计主体 |
| `busiaccbook` | `busiaccbook` | `busiaccbook` | 业务账簿 |
| `groupTaskKey` | `groupTaskKey` | `groupTaskKey` | 分组任务KEY |
| `` | `upcode` | `upcode` | 上游单据号 |
| `` | `sourceid` | `sourceid` | 上游单据主表id |
| `` | `sourceautoid` | `sourceautoid` | 上游单据子表id |
| `` | `source` | `source` | 上游单据类型 |
| `makerule_code` | `makerule_code` | `makeRuleCode` | 生单规则编号 |

### 引用字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `fixedassetsinfo` | `fixedassetsinfo` | `fixedassetsinfo` | 固定资产主表 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `equipid` | `equipid` | `equipid` | 资产卡片id |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `mainassociated` | `mainassociated` | `mainassociated` | 是否主关联 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### timestamp (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `sourceMainPubts` | `sourceMainPubts` | `sourceMainPubts` | 时间戳 |
