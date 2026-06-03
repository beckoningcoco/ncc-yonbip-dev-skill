---
tags: [BIP, 元数据, 数据字典, ia.semanticrule.SemanticDatasource]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 语义模型数据源，执行语义模型时就靠他链接数据库 (`ia.semanticrule.SemanticDatasource`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`ssc_ia_semantic_datasource` | domain：`yonbip-mid-sscia` | 应用：`ZNSH` | 业务对象ID：`5c13c1b3-5ebd-42d8-916d-6c8aec57ff7e`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 语义模型数据源，执行语义模型时就靠他链接数据库 |
| 物理表 | `ssc_ia_semantic_datasource` |
| 数据库 schema | `yonbip-mid-sscia` |
| 所属应用 | `ZNSH` |
| 直连字段 | 23 个 |
| 子表 | 0 个 |
| 关联引用 | 3 个 |

## 关联引用 (3个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `` | `` |

## 字段列表（按类型分组）

> 共 23 个直连字段

### 文本字段 (12个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `creator` | `creator` | 创建人名称 |
| `datasource_code` | `datasource_code` | `datasourceCode` | 数据源编码 |
| `datasource_domain` | `datasource_domain` | `datasourceDomain` | 数据源所属领域 |
| `datasource_name` | `datasource_name` | `datasourceName` | 数据源名称 |
| `datasource_password` | `datasource_password` | `datasourcePassword` | 数据源密码 |
| `datasource_type` | `datasource_type` | `datasourceType` | 数据源类型 LOGIC | PHYSICAL 逻辑数据源或物理数据源 |
| `datasource_url` | `datasource_url` | `datasourceUrl` | 数据源地址 |
| `datasource_username` | `datasource_username` | `datasourceUsername` | 数据源账号 |
| `id` | `id` | `id` | 主键id |
| `logic_datasource_code` | `logic_datasource_code` | `logicDatasourceCode` | 逻辑数据源编码 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `secrect_key` | `secrect_key` | `secrectKey` | 安全约定密钥 |

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
