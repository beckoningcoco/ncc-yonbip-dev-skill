---
tags: [BIP, 元数据, 数据字典, aa.baseorg.OrgMV]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 视图业务单元 (`aa.baseorg.OrgMV`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`org_orgs` | domain：`ucf-org-center` | 应用：`GZTORG` | 业务对象ID：`41981fa2-c777-4c2f-8750-d7de82f16d05`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 视图业务单元 |
| 物理表 | `org_orgs` |
| 数据库 schema | `ucf-org-center` |
| 所属应用 | `GZTORG` |
| 直连字段 | 35 个 |
| 子表 | 2 个 |
| 关联引用 | 5 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `financeOrg` | `aa.baseorg.FinanceOrgMV` | composition |
| `orgAndFuncs` | `aa.baseorg.OrgAndFuncMV` | composition |

## 关联引用 (5个)

| 字段名 | 引用类型 |
|--------|---------|
| `parentid` | `` |
| `` | `` |
| `ytenant_id` | `` |
| `orgid` | `` |

## 继承接口 (2个, 2字段)

- **UCF公共租户相关** (`basedoc.basedocItf.BasedocITenant`)
  - `tenantid` → `tenantid`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 35 个直连字段

### 文本字段 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |
| `code` | `code` | `code` | 编码 |
| `principal` | `principal` | `principal` | 负责人 |
| `tenantid` | `tenantid` | `eaiCode` | EAI编码 |
| `orgform` | `orgform` | `erpCode` | erp编码 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `tenantid` | `tenantid` | `tenant` | 租户标识 |
| `tenantid` | `tenantid` | `tenantid` | 租户标识 |
| `id` | `id` | `path` | 路径 |
| `tenantid` | `tenantid` | `orgFunc` | 组织职能 |

### 引用字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `parentid` | `parentid` | `parent` | 上级业务单元 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户ID |
| `orgid` | `orgid` | `orgid` | 业务单元主键(废弃) |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `creationtime` | `creationtime` | `createDate` | 创建日期 |
| `modifiedtime` | `modifiedtime` | `modifyDate` | 修改日期 |

### 整数 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `is_biz_unit` | `is_biz_unit` | `isbizunit` | 是否业务单元 |
| `level` | `level` | `level` | 组织层级 |
| `displayorder` | `displayorder` | `sort` | 排序号 |
| `isEnd` | `isEnd` | `isEnd` | 是否末级节点 |
| `isEnd` | `isEnd` | `isGlobal` | 是否全局 |
| `enable` | `enable` | `stopstatus` | 停用状态 |
| `dr` | `dr` | `customerId` | 客户ID |
| `source_type` | `source_type` | `sourcetype` | 数据来源类型 |
| `external_org` | `external_org` | `externalorg` | 外部组织 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除标识 |

### other (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `orgAndFuncs` | 组织职能关系 |
| `` | `` | `financeOrg` | 会计主体 |

### multiLanguage (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `fullname` | 名称 |
| `name` | `name` | `name` | 名称 |
| `shortname` | `shortname` | `shortname` | 简称 |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `creationtime` | `creationtime` | `createTime` | 创建时间 |
| `modifiedtime` | `modifiedtime` | `modifyTime` | 修改时间 |
| `modifiedtime` | `modifiedtime` | `stoptime` | 停用时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
