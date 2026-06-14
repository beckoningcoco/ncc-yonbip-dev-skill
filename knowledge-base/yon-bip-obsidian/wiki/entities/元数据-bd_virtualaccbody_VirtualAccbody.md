---
tags: [BIP, 元数据, 数据字典, bd.virtualaccbody.VirtualAccbody]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 虚拟会计主体 (`bd.virtualaccbody.VirtualAccbody`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`bd_virtualaccbody` | domain：`finbd` | 应用：`DPMACCT` | 业务对象ID：`e56f7c49-a80c-440b-b694-4f014538c768`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 虚拟会计主体 |
| 物理表 | `bd_virtualaccbody` |
| domain/服务域 | `finbd` |
| schema | `iuap_apdoc_finbd` |
| 所属应用 | `DPMACCT` |
| 直连字段 | 49 个 |
| 子表 | 2 个 |
| 关联引用 | 18 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `bodies` | `bd.virtualaccbody.VirtualAccbodyInnerExternalRel` | composition |
| `treeMembers` | `bd.virtualaccbody.VirtualAccbodyTreeMember` | composition |

## 关联引用 (18个)

| 字段名 | 引用类型 |
|--------|---------|
| `country` | `` |
| `parent` | `` |
| `ytenant_id` | `` |
| `exchangerate` | `` |
| `timezone` | `` |
| `` | `` |
| `language` | `` |
| `orgid` | `` |
| `liableperson` | `` |
| `branchleader` | `` |
| `accperiodscheme` | `` |
| `currency` | `` |
| `entrustaccbody` | `` |
| `tenant_id` | `` |
| `orgform` | `` |

## 继承接口 (6个, 18字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **停用信息** (`base.itf.IStopping`)
  - `stopstatus` → `stopstatus`
  - `stop_time` → `stop_time`
- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **树型结构** (`base.itf.ITree`)
  - `` → ``
  - `level` → `level`
  - `parent_id` → `parent_id`
  - `path` → `path`
  - `sort_num` → `sort_num`
- **逻辑删除相关** (`ucfbase.ucfbaseItf.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 49 个直连字段

### 文本字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键id |
| `code` | `code` | `code` | 编码 |
| `` | `creator` | `creator` | 创建人名称 |
| `locationid` | `locationid` | `locationid` | 工作地点 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `orgtype` | `orgtype` | `orgtype` | 组织形态 |
| `path` | `path` | `path` | 路径 |

### 引用字段 (16个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accperiodscheme` | `accperiodscheme` | `accperiodscheme` | 会计期间方案 |
| `branchleader` | `branchleader` | `branchleader` | 分管领导 |
| `country` | `country` | `country` | 国家 |
| `` | `creatorId` | `creatorId` | 创建人 |
| `currency` | `currency` | `currency` | 本位币 |
| `entrustaccbody` | `entrustaccbody` | `entrustaccbody` | 委托会计主体 |
| `exchangerate` | `exchangerate` | `exchangerate` | 汇率类型 |
| `language` | `language` | `language` | 语言 |
| `liableperson` | `liableperson` | `liableperson` | 负责人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `orgform` | `orgform` | `orgform` | 组织形态 |
| `parent` | `parent` | `parent` | 上级会计主体 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `timezone` | `timezone` | `timezone` | 时区 |
| `orgid` | `orgid` | `orgid` | 组织id |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 布尔字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `isEnd` | `isEnd` | 是否末级 |
| `is_virtualaccbody` | `is_virtualaccbody` | `is_virtualaccbody` | 是否虚拟会计主体 |
| `isexternal` | `isexternal` | `isexternal` | 是否对外核算主体 |
| `isinner` | `isinner` | `isinner` | 是否对内核算主体 |
| `isorg` | `isorg` | `isorg` | 是否为组织单元 |
| `stopstatus` | `stopstatus` | `stopstatus` | 停用状态 |

### 整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `display_order` | `display_order` | `displayOrder` | 显示顺序 |
| `level` | `level` | `level` | 层级 |
| `sort_num` | `sort_num` | `sort` | 排序号 |

### 短整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除标记 |
| `source` | `source` | `source` | 来源 |
| `status` | `status` | `status` | 状态 |

### multiLanguage (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 名称 |
| `description` | `description` | `description` | 备注 |
| `shortname` | `shortname` | `shortname` | 简称 |

### timestamp (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `enabledate` | `enabledate` | `enabledate` | 启用时间 |
| `expiredate` | `expiredate` | `expiredate` | 失效时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `orgpubts` | `orgpubts` | `orgpubts` | 组织单元的时间戳 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `stop_time` | `stop_time` | `stoptime` | 停用时间 |

### other (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `bodies` | 会计主体对内对外关系 |
| `` | `` | `treeMembers` | 会计主体树成员 |
