---
tags: [BIP, 元数据, 数据字典, aa.baseorg.PurchaseOrgMV]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 采购组织 (`aa.baseorg.PurchaseOrgMV`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`org_purchase` | domain：`ucf-org-center` | 应用：`GZTORG` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 采购组织 |
| 物理表 | `org_purchase` |
| domain/服务域 | `ucf-org-center` |
| schema | `iuap_apdoc_basedoc` |
| 所属应用 | `GZTORG` |
| 直连字段 | 30 个 |
| 子表 | 0 个 |
| 关联引用 | 3 个 |

## 关联引用 (3个)

| 字段名 | 引用类型 |
|--------|---------|
| `parentid` | `` |
| `orgid` | `` |
| `ytenant_id` | `` |

## 继承接口 (2个, 2字段)

- **UCF公共租户相关** (`basedoc.basedocItf.BasedocITenant`)
  - `tenantid` → `tenantid`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 30 个直连字段

### 文本字段 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | 编码 |
| `creator` | `creator` | `creator` | 创建人 |
| `tenantid` | `tenantid` | `eaiCode` | EAI编码 |
| `tenantid` | `tenantid` | `erpCode` | erp编码 |
| `id` | `id` | `id` | 主键id |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `tenantid` | `tenantid` | `orgFunc` | 组织职能 |
| `id` | `id` | `path` | 路径 |
| `principal` | `principal` | `principal` | 负责人 |
| `tenantid` | `tenantid` | `tenant` | 租户标识 |
| `tenantid` | `tenantid` | `tenantid` | 租户标识 |

### 引用字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `orgid` | `orgid` | `org` | 基础组织ID |
| `parentid` | `parentid` | `parent` | 上级组织 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `creationtime` | `creationtime` | `createDate` | 创建日期 |
| `modifiedtime` | `modifiedtime` | `modifyDate` | 修改日期 |

### 整数 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `customerId` | 客户ID |
| `external_org` | `external_org` | `externalorg` | 外部组织 |
| `isEnd` | `isEnd` | `isEnd` | 是否末级 |
| `isEnd` | `isEnd` | `isGlobal` | 是否全局 |
| `level` | `level` | `level` | 层级 |
| `displayorder` | `displayorder` | `sort` | 排序号 |
| `enable` | `enable` | `stopstatus` | 停用状态 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除标识 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `creationtime` | `creationtime` | `createTime` | 创建时间 |
| `modifiedtime` | `modifiedtime` | `modifyTime` | 修改时间 |
| `modifiedtime` | `modifiedtime` | `stoptime` | 停用时间 |

### multiLanguage (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `fullname` | 组织名称 |
| `name` | `name` | `name` | 名称 |
| `shortname` | `shortname` | `shortname` | 简称 |
