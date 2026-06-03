---
tags: [BIP, 元数据, 数据字典, ia.semanticrule.SemanticRegister]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 语义模型注册表 (`ia.semanticrule.SemanticRegister`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`ssc_ia_semantic_register` | domain：`yonbip-mid-sscia` | 应用：`ZNSH` | 业务对象ID：`b3987dc9-846b-409d-a938-da893276cd0c`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 语义模型注册表 |
| 物理表 | `ssc_ia_semantic_register` |
| 数据库 schema | `yonbip-mid-sscia` |
| 所属应用 | `ZNSH` |
| 直连字段 | 22 个 |
| 子表 | 0 个 |
| 关联引用 | 5 个 |

## 关联引用 (5个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `datasource_id` | `` |
| `` | `` |
| `dir_id` | `` |

## 字段列表（按类型分组）

> 共 22 个直连字段

### 文本字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `creator` | `creator` | 创建人名称 |
| `id` | `id` | `id` | 主键id |
| `` | `modifier` | `modifier` | 修改人名称 |
| `semantic_alias` | `semantic_alias` | `semanticAlias` | 语义模型别名 |
| `semantic_code` | `semantic_code` | `semanticCode` | 语义模型编码 |
| `semantic_desc` | `semantic_desc` | `semanticDesc` | 语义模型描述 |
| `semantic_domain` | `semantic_domain` | `semanticDomain` | 语义模型所属领域 |
| `semantic_id` | `semantic_id` | `semanticId` | 语义模型ID |
| `semantic_name` | `semantic_name` | `semanticName` | 语义模型名称 |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `creatorId` | `creatorId` | 创建人 |
| `datasource_id` | `datasource_id` | `datasourceId` | 语义模型数据源 |
| `dir_id` | `dir_id` | `dirId` | 上级目录id |
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

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
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
