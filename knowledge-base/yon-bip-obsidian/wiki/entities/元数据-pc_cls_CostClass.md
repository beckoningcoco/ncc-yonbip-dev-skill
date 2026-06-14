---
tags: [BIP, 元数据, 数据字典, pc.cls.CostClass]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 成本分类 (`pc.cls.CostClass`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`product_cost_class` | domain：`productcenter` | 应用：`GZTBDM` | 业务对象ID：`c92f7527-8a55-4890-ac24-27f4986a5dd0`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 成本分类 |
| 物理表 | `product_cost_class` |
| domain/服务域 | `productcenter` |
| schema | `iuap_apdoc_coredoc` |
| 所属应用 | `GZTBDM` |
| 直连字段 | 24 个 |
| 子表 | 1 个 |
| 关联引用 | 7 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `costClassApplyRanges` | `pc.cls.CostClassApplyRange` | composition |

## 关联引用 (7个)

| 字段名 | 引用类型 |
|--------|---------|
| `tpl_id` | `` |
| `parent_id` | `` |
| `ytenant_id` | `` |
| `org_group_id` | `` |
| `` | `` |
| `orgId` | `` |
| `tenant_id` | `` |

## 继承接口 (1个, 1字段)

- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 24 个直连字段

### 文本字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | 分类编码 |
| `erpCode` | `erpCode` | `erpCode` | 外部编码 |
| `path` | `path` | `path` | 路径 |
| `cFullPath` | `cFullPath` | `fullPath` | 全路径 |

### 引用字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `orgId` | `orgId` | `orgId` | 管理组织 |
| `parent_id` | `parent_id` | `parent` | 上级分类 |
| `tpl_id` | `tpl_id` | `template` | 物料模板 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户 |
| `org_group_id` | `org_group_id` | `orgGroupId` | 组织组 |
| `tenant_id` | `tenant_id` | `tenant` | 租户(废弃) |

### 布尔字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `stopstatus` | `stopstatus` | `stopstatus` | 启用状态 |
| `` | `isEnd` | `isEnd` | 是否末级 |
| `iDeleted` | `iDeleted` | `isDeleted` | 逻辑删除标记 |

### 整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iOrder` | `iOrder` | `order` | 排序号 |
| `level` | `level` | `level` | 层级 |
| `sort_num` | `sort_num` | `sort` | 排序号(废弃) |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `sociCoreArchive_id` | `sociCoreArchive_id` | `sociCoreArchive` | 社会化核心企业档案 |

### 数值字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `productCount` | `productCount` | `productCount` | 物料数量 |

### multiLanguage (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 分类名称 |
| `remark` | `remark` | `remark` | 备注 |

### timestamp (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `stop_time` | `stop_time` | `stoptime` | 停用时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `costClassApplyRanges` | 成本分类适用范围 |
