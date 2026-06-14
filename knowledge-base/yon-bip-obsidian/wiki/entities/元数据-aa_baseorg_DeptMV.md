---
tags: [BIP, 元数据, 数据字典, aa.baseorg.DeptMV]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 部门 (`aa.baseorg.DeptMV`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`org_orgs` | domain：`ucf-org-center` | 应用：`GZTORG` | 业务对象ID：`ea477d91-20e6-458f-923e-908b39cb54d1`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 部门 |
| 物理表 | `org_orgs` |
| domain/服务域 | `ucf-org-center` |
| schema | `iuap_apdoc_basedoc` |
| 所属应用 | `GZTORG` |
| 直连字段 | 31 个 |
| 子表 | 0 个 |
| 关联引用 | 4 个 |

## 关联引用 (4个)

| 字段名 | 引用类型 |
|--------|---------|
| `parentid` | `ucf-org-center.bd_adminorgtreeref` |
| `ytenant_id` | `` |
| `id` | `` |
| `parentorgid` | `ucf-org-center.orgcenter_admin_tree_ref` |

## 继承接口 (2个, 2字段)

- **UCF公共租户相关** (`basedoc.basedocItf.BasedocITenant`)
  - `tenantid` → `tenantid`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 31 个直连字段

### 文本字段 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | 编码 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `path` | `path` | `memo` | 备注 |
| `principal` | `principal` | `principal` | 负责人 |
| `path` | `path` | `path` | 路径 |
| `path` | `path` | `erpCode` | ERP编码 |
| `id` | `id` | `id` | 主键id |
| `tenantid` | `tenantid` | `tenant` | 租户标识 |
| `path` | `path` | `cAppID` | 会员体系ID |
| `creator` | `creator` | `creator` | 创建人 |
| `depttype` | `depttype` | `depttype` | 部门性质 |

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `parentid` | `parentid` | `parent` | 上级节点ID |
| `id` | `id` | `deptid` | 主键 |
| `parentorgid` | `parentorgid` | `orgId` | 基础组织ID |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `creationtime` | `creationtime` | `createDate` | 创建日期 |
| `modifiedtime` | `modifiedtime` | `modifyDate` | 修改日期 |

### 整数 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除标识 |
| `external_org` | `external_org` | `membercorp` | 租户 |
| `enable` | `enable` | `stopstatus` | 停用状态 |
| `orgtype` | `orgtype` | `orgtype` | 组织类型 |
| `level` | `level` | `level` | 层级 |
| `displayorder` | `displayorder` | `sort` | 排序号 |
| `isEnd` | `isEnd` | `isEnd` | 是否末级 |
| `external_org` | `external_org` | `externalorg` | 外部组织 |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `modifiedtime` | `modifiedtime` | `stoptime` | 停用时间 |
| `modifiedtime` | `modifiedtime` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `creationtime` | `creationtime` | `createTime` | 创建时间 |

### multiLanguage (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 简称 |
| `name` | `name` | `fullname` | 名称 |
