---
tags: [BIP, 元数据, 数据字典, RCP.ctp_rcp_riskindicator.ctp_rcp_riskindicatorconditions]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 指标取数条件 (`RCP.ctp_rcp_riskindicator.ctp_rcp_riskindicatorconditions`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`rcp_riskindicatorconditions` | domain：`yonbip-mid-sscia` | 应用：`RCP` | 业务对象ID：`cbfecded-5884-408e-89d2-65bc9859c673`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 指标取数条件 |
| 物理表 | `rcp_riskindicatorconditions` |
| 数据库 schema | `yonbip-mid-sscia` |
| 所属应用 | `RCP` |
| 直连字段 | 19 个 |
| 子表 | 0 个 |
| 关联引用 | 5 个 |

## 关联引用 (5个)

| 字段名 | 引用类型 |
|--------|---------|
| `foreignerKey` | `` |
| `ytenant_id` | `` |
| `` | `` |
| `character_define` | `` |

## 字段列表（按类型分组）

> 共 19 个直连字段

### 文本字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `field` | `field` | `field` | 条件字段 |
| `field_value` | `field_value` | `fieldValue` | 条件值 |
| `id` | `id` | `id` | ID |
| `` | `creator` | `creator` | 创建人名称 |
| `` | `modifier` | `modifier` | 修改人名称 |

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `foreignerKey` | `foreignerKey` | `foreignerKey` | 风险指标 |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
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

### 枚举字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `field_type` | `field_type` | `fieldType` | 风险指标_条件字段类型 |
| `symbol` | `symbol` | `symbol` | 操作符 |
| `field_value_type` | `field_value_type` | `fieldValueType` | 条件值类型 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除标记 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `character_define` | `character_define` | `characterDefine` | 特征 |

### timestamp (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
