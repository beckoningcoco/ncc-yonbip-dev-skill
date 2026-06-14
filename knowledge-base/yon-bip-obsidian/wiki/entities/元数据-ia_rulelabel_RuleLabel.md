---
tags: [BIP, 元数据, 数据字典, ia.rulelabel.RuleLabel]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 规则标签 (`ia.rulelabel.RuleLabel`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`ssc_ia_rule_label` | domain：`yonbip-mid-sscia` | 应用：`RBM` | 业务对象ID：`a3ec265d-ef49-47f0-b535-fb860278e573`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 规则标签 |
| 物理表 | `ssc_ia_rule_label` |
| domain/服务域 | `yonbip-mid-sscia` |
| schema | `intelligent_audit` |
| 所属应用 | `RBM` |
| 直连字段 | 20 个 |
| 子表 | 0 个 |
| 关联引用 | 4 个 |

## 关联引用 (4个)

| 字段名 | 引用类型 |
|--------|---------|
| `rule_label_type_id` | `` |
| `ytenant_id` | `` |
| `` | `` |

## 字段列表（按类型分组）

> 共 20 个直连字段

### 文本字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | 规则标签编码 |
| `` | `creator` | `creator` | 创建人名称 |
| `desc` | `desc` | `desc` | 备注 |
| `font_color` | `font_color` | `fontColor` | 字体颜色 |
| `id` | `id` | `id` | 主键Id |
| `` | `modifier` | `modifier` | 修改人名称 |

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `rule_label_type_id` | `rule_label_type_id` | `ruleLabelType` | 规则标签分类 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 日期时间 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `preset_tag` | `preset_tag` | `presetTag` | 预置 |
| `stopstatus` | `stopstatus` | `stopstatus` | 停用状态 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除标记 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `stop_time` | `stop_time` | `stoptime` | 停用时间 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 规则标签名称 |
