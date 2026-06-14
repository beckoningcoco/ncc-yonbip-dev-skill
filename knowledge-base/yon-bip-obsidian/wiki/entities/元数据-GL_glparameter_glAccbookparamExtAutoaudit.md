---
tags: [BIP, 元数据, 数据字典, GL.glparameter.glAccbookparamExtAutoaudit]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 账簿总账参数GL01自动审核业务来源应用表 (`GL.glparameter.glAccbookparamExtAutoaudit`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`gl_accbookparam_ext_autoaudit` | domain：`yonbip-fi-egl` | 应用：`yonbip-fi-egl` | 业务对象ID：`ec1a3ce4-1f48-4c8d-b98d-8ac39554154d`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 账簿总账参数GL01自动审核业务来源应用表 |
| 物理表 | `gl_accbookparam_ext_autoaudit` |
| domain/服务域 | `yonbip-fi-egl` |
| schema | `figl` |
| 所属应用 | `yonbip-fi-egl` |
| 直连字段 | 16 个 |
| 子表 | 0 个 |
| 关联引用 | 4 个 |

## 关联引用 (4个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `` |
| `accbook_id` | `` |
| `modifier` | `` |
| `ytenant_id` | `` |

## 继承接口 (1个, 1字段)

- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 16 个直连字段

### 文本字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accbook_param_code` | `accbook_param_code` | `accbookParamCode` | 账薄参数code |
| `category` | `category` | `category` | 所属领域 |
| `id` | `id` | `id` | 主键 |
| `source_app_code` | `source_app_code` | `sourceAppCode` | 来源应用编码 |
| `source_app_id` | `source_app_id` | `sourceAppId` | 来源应用ID |
| `source_app_name` | `source_app_name` | `sourceAppName` | 来源应用名称 |
| `source_app_name2` | `source_app_name2` | `sourceAppName2` | 来源应用名称多语 |
| `source_app_name3` | `source_app_name3` | `sourceAppName3` | 来源应用名称多语 |

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accbook_id` | `accbook_id` | `accbookId` | 账薄id |
| `creator` | `creator` | `creator` | 创建者 |
| `modifier` | `modifier` | `modifier` | 修改者 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 最新修改时间 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除标记 |
