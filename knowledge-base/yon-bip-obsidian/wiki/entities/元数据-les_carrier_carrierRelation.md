---
tags: [BIP, 元数据, 数据字典, les.carrier.carrierRelation]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 承运关系 (`les.carrier.carrierRelation`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`ils_les_c_relation` | domain：`IMP-ILSBD` | 应用：`DPMSI` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 承运关系 |
| 物理表 | `ils_les_c_relation` |
| 数据库 schema | `IMP-ILSBD` |
| 所属应用 | `DPMSI` |
| 直连字段 | 13 个 |
| 子表 | 1 个 |
| 关联引用 | 7 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `bodydefines` | `les.carrier.carrierRelationDefine` | composition |

## 关联引用 (7个)

| 字段名 | 引用类型 |
|--------|---------|
| `pk_carrier` | `` |
| `` | `` |
| `ytenant_id` | `` |
| `definect` | `` |
| `logistics_org` | `ucf-org-center.org_pure_tree_ref` |

## 字段列表（按类型分组）

> 共 13 个直连字段

### 文本字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `tenant_id` | `tenant_id` | `tenant` | 租户(废弃) |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `logistics_org` | `logistics_org` | `logistics_org` | 物流组织编码 |
| `pk_carrier` | `pk_carrier` | `pk_carrier` | 关联主表数据 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户 |
| `` | `modifier` | `modifier` | 修改人 |
| `` | `creator` | `creator` | 创建人 |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 删除状态 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `definect` | `definect` | `definect` | 自定义项特征组 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `bodydefines` | 承运关系自定义项 |
