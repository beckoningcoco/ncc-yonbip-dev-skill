---
tags: [BIP, 元数据, 数据字典, org.func.Ext0Org]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 系统预制职能 (`org.func.Ext0Org`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`org_ext0` | domain：`ucf-org-center` | 应用：`GZTORG` | 业务对象ID：`41ddcbad-22f8-4900-8f48-abd4f7b52968`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 系统预制职能 |
| 物理表 | `org_ext0` |
| 数据库 schema | `ucf-org-center` |
| 所属应用 | `GZTORG` |
| 直连字段 | 66 个 |
| 子表 | 1 个 |
| 关联引用 | 18 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `defines` | `org.func.Ext0OrgDefine` | composition |

## 关联引用 (18个)

| 字段名 | 引用类型 |
|--------|---------|
| `parentid` | `` |
| `ytenant_id` | `` |
| `exchangerate` | `` |
| `branchleaderuser` | `bd_staff_ref` |
| `language` | `` |
| `orgid` | `` |
| `` | `` |
| `principal` | `` |
| `branchleader` | `` |
| `companytype` | `` |
| `locationid` | `` |
| `parentorgid` | `org_ext0Org_tree_ref` |
| `id` | `` |
| `reforgname` | `` |
| `principaluser` | `bd_staff_ref` |
| `depttype` | `` |
| `tenantid` | `` |

## 继承接口 (6个, 12字段)

- **逻辑删除(待废除)** (`basedoc.basedocItf.LogicDelete`)
- **UCF公共状态** (`basedoc.basedocItf.BasedocIState`)
  - `enable` → `enable`
- **树型结构** (`basedoc.basedocItf.ITree`)
  - `` → ``
  - `level` → `level`
  - `parent_id` → `parent_id`
  - `path` → `path`
  - `sort_num` → `sort_num`
- **审计信息** (`bd.itf.IAuditInfo`)
  - `creationtime` → `creationtime`
  - `creator` → `creator`
  - `modifiedtime` → `modifiedtime`
  - `modifier` → `modifier`
- **UCF公共租户相关** (`basedoc.basedocItf.BasedocITenant`)
  - `tenantid` → `tenantid`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 66 个直连字段

### 文本字段 (26个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | 编码 |
| `innercode` | `innercode` | `innercode` | 内部码 |
| `taxpayerid` | `taxpayerid` | `taxpayerid` | 统一社会信用代码 |
| `taxpayername` | `taxpayername` | `taxpayername` | 纳税人名称 |
| `usedtaxpayerid` | `usedtaxpayerid` | `usedtaxpayerid` | 曾用统一社会信用代码 |
| `usedtaxpayername` | `usedtaxpayername` | `usedtaxpayername` | 曾用纳税人名称 |
| `contact` | `contact` | `contact` | 联系人 |
| `telephone` | `telephone` | `telephone` | 联系电话 |
| `timezone` | `timezone` | `timezone` | 时区 |
| `objid` | `objid` | `objid` | 外部系统主键 |
| `countryzone` | `countryzone` | `countryzone` | 国家地区 |
| `corpid` | `corpid` | `corpid` | 对应合同主体 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `sourceid` | `sourceid` | `sourceid` | 数据来源 |
| `tenantid` | `tenantid` | `tenantid` | 租户ID |
| `sysid` | `sysid` | `sysid` | 系统标识 |
| `region` | `region` | `region` | 行政区划(废弃) |
| `orgform` | `orgform` | `orgform` | 组织形态(废弃) |
| `orglevel` | `orglevel` | `orglevel` | 组织级别(废弃） |
| `path` | `path` | `path` | 上级路径(不建议使用) |
| `businessid` | `businessid` | `businessid` | 友企联同步业务主键(废弃) |
| `log` | `log` | `log` | 删除引用日志(废弃) |
| `jsonextattr` | `jsonextattr` | `jsonextattr` | 扩展属性(废弃) |
| `reforgcode` | `reforgcode` | `reforgcode` | 关联行政组织编码 |
| `log` | `log` | `orgfunctype` | 职能类型 |

### 引用字段 (17个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |
| `companytype` | `companytype` | `companytype` | 组织形态 |
| `parentid` | `parentid` | `parent` | 上级系统预制职能 |
| `parentid` | `parentid` | `parentid` | 上级系统预制职能 |
| `parentorgid` | `parentorgid` | `parentorgid` | 所属行政组织 |
| `depttype` | `depttype` | `depttype` | 部门性质 |
| `principal` | `principal` | `principal` | 负责人 |
| `branchleader` | `branchleader` | `branchleader` | 分管领导 |
| `locationid` | `locationid` | `locationid` | 工作地点 |
| `exchangerate` | `exchangerate` | `exchangerate` | 汇率类型 |
| `language` | `language` | `language` | 语言 |
| `tenantid` | `tenantid` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户ID |
| `orgid` | `orgid` | `orgid` | 业务单元主键(废弃） |
| `reforgname` | `reforgname` | `reforgname` | 关联行政组织名称 |
| `principaluser` | `principaluser` | `principaluser` | 负责人 |
| `branchleaderuser` | `branchleaderuser` | `branchleaderuser` | 分管领导 |

### 整数 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `isbizunit` | `isbizunit` | `isbizunit` | 是否业务单元 |
| `orgtype` | `orgtype` | `orgtype` | 是否部门 |
| `taxpayertype` | `taxpayertype` | `taxpayertype` | 纳税人类型 |
| `level` | `level` | `level` | 组织层级 |
| `displayorder` | `displayorder` | `displayorder` | 排序号 |
| `displayorder` | `displayorder` | `sort` | 排序号 |
| `isdefault` | `isdefault` | `isdefault` | 是否默认 |
| `isEnd` | `isEnd` | `isEnd` | 是否末级节点 |
| `enable` | `enable` | `enable` | 状态 |
| `external_org` | `external_org` | `externalorg` | 外部组织 |
| `dr` | `dr` | `dr` | 逻辑删除标识 |

### multiLanguage (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 名称 |
| `shortname` | `shortname` | `shortname` | 简称 |
| `address` | `address` | `address` | 公司地址 |
| `description` | `description` | `description` | 备注 |

### timestamp (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `effectivedate` | `effectivedate` | `effectivedate` | 生效日期 |
| `expirationdate` | `expirationdate` | `expirationdate` | 失效日期 |
| `creationtime` | `creationtime` | `creationtime` | 创建时间 |
| `modifiedtime` | `modifiedtime` | `modifiedtime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `ts` | `ts` | `ts` | 时间戳 |
| `synchts` | `synchts` | `synchts` | 友企联同步时间戳 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `defines` | 系统预制职能自定义 |
