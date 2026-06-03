---
tags: [BIP, 元数据, 数据字典, iuap-apcom-contract.iuap-apcom-contract.contractCategory]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 条款分类表 (`iuap-apcom-contract.iuap-apcom-contract.contractCategory`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`contract_category` | domain：`iuap-apcom-contract` | 应用：`iuap-apcom-contract` | 业务对象ID：`d6ecc8ec-b54e-4d3b-94e4-01c0af4cfeac`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 条款分类表 |
| 物理表 | `contract_category` |
| 数据库 schema | `iuap-apcom-contract` |
| 所属应用 | `iuap-apcom-contract` |
| 直连字段 | 17 个 |
| 子表 | 1 个 |
| 关联引用 | 5 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `contractTermsList` | `iuap-apcom-contract.iuap-apcom-contract.contractTerms` | composition |

## 关联引用 (5个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |
| `tenant_id` | `` |
| `ytenant_id` | `` |
| `org_id` | `ucf-org-center.org_pure_tree_ref` |
| `parent_id` | `` |

## 继承接口 (1个, 1字段)

- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 17 个直连字段

### 文本字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `category_name` | `category_name` | `categoryName` | 分类名称 |
| `category_name2` | `category_name2` | `categoryName2` | 分类标签英文名称 |
| `category_name3` | `category_name3` | `categoryName3` | 分类标签繁体名称 |
| `category_name4` | `category_name4` | `categoryName4` | 保留字段1 |
| `category_name5` | `category_name5` | `categoryName5` | 保留字段2 |
| `category_name6` | `category_name6` | `categoryName6` | 保留字段3 |
| `category_num` | `category_num` | `categoryNum` | 分类编号 |
| `id` | `id` | `id` | 主键id |

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `org_id` | `org_id` | `orgId` | 组织id |
| `parent_id` | `parent_id` | `parentId` | 父id |
| `tenant_id` | `tenant_id` | `tenantId` | 租户id |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ts` | `ts` | `ts` | 时间戳 |

### 整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `category_level` | `category_level` | `categoryLevel` | 分类层级 |
| `dr` | `dr` | `dr` | 删除标记 |
| `type` | `type` | `type` | 类型 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `contractTermsList` | 合同条款 |
