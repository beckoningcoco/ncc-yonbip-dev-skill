---
tags: [BIP, 元数据, 数据字典, RCP.ctp_rcp_risklevel.ctp_rcp_risklevel]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 风险等级 (`RCP.ctp_rcp_risklevel.ctp_rcp_risklevel`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`rcp_risklevel` | domain：`yonbip-mid-sscia` | 应用：`RCP` | 业务对象ID：`f6edd18b-daef-40ec-9184-f35aa2949936`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 风险等级 |
| 物理表 | `rcp_risklevel` |
| 数据库 schema | `yonbip-mid-sscia` |
| 所属应用 | `RCP` |
| 直连字段 | 21 个 |
| 子表 | 0 个 |
| 关联引用 | 4 个 |

## 关联引用 (4个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `` | `` |
| `character_define` | `` |

## 字段列表（按类型分组）

> 共 21 个直连字段

### 文本字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `micro_service_code` | `micro_service_code` | `microServiceCode` | 微服务编码 |
| `code` | `code` | `code` | 风险等级编码 |
| `remarks` | `remarks` | `remarks` | 备注 |
| `id` | `id` | `id` | 主键 |
| `` | `creator` | `creator` | 创建人名称 |
| `` | `modifier` | `modifier` | 修改人名称 |

### 引用字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
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

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `sys_flag` | `sys_flag` | `sysFlag` | 是否预置 |
| `stopstatus` | `stopstatus` | `stopstatus` | 停用状态 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `level_value` | `level_value` | `levelValue` | 风险等级 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除标记 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 风险等级名称 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `character_define` | `character_define` | `characterDefine` | 特征 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `stop_time` | `stop_time` | `stoptime` | 停用时间 |
