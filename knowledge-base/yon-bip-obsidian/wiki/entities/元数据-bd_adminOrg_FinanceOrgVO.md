---
tags: [BIP, 元数据, 数据字典, bd.adminOrg.FinanceOrgVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 会计主体(废弃) (`bd.adminOrg.FinanceOrgVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`org_fin` | domain：`ucf-org-center` | 应用：`GZTORG` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 会计主体(废弃) |
| 物理表 | `org_fin` |
| 数据库 schema | `ucf-org-center` |
| 所属应用 | `GZTORG` |
| 直连字段 | 46 个 |
| 子表 | 0 个 |
| 关联引用 | 8 个 |

## 关联引用 (8个)

| 字段名 | 引用类型 |
|--------|---------|
| `principal` | `` |
| `branchleader` | `` |
| `ytenant_id` | `` |
| `companytype` | `` |
| `currency` | `` |
| `orgid` | `` |
| `parentid` | `` |
| `tenantid` | `` |

## 继承接口 (6个, 13字段)

- **树型结构** (`basedoc.basedocItf.ITree`)
  - `` → ``
  - `level` → `level`
  - `parent_id` → `parent_id`
  - `path` → `path`
  - `sort_num` → `sort_num`
- **UCF公共租户相关** (`basedoc.basedocItf.BasedocITenant`)
  - `tenantid` → `tenantid`
- **UCF公共状态** (`basedoc.basedocItf.BasedocIState`)
  - `enable` → `enable`
- **逻辑删除(待废除)** (`basedoc.basedocItf.LogicDelete`)
- **树型结构** (`base.itf.ITree`)
  - `` → ``
  - `level` → `level`
  - `parent_id` → `parent_id`
  - `path` → `path`
  - `sort_num` → `sort_num`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 46 个直连字段

### 文本字段 (22个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | id |
| `accountingcalendar` | `accountingcalendar` | `accountingcalendar` | 会计日历 |
| `address` | `address` | `address` | 联系地址 |
| `businessid` | `businessid` | `businessid` | 友企联同步业务主键 |
| `code` | `code` | `code` | 编码 |
| `contact` | `contact` | `contact` | 联系人 |
| `countryzone` | `countryzone` | `countryzone` | 国家地区 |
| `description` | `description` | `description` | 描述 |
| `innercode` | `innercode` | `innercode` | 内部码 |
| `localtaxregnum` | `localtaxregnum` | `localtaxregnum` | 地税登记号 |
| `objid` | `objid` | `objid` | 友企联同步主键 |
| `orglevel` | `orglevel` | `orglevel` | 组织级别 |
| `parent_id` | `parent_id` | `parent` | 上级分类 |
| `path` | `path` | `path` | 路径 |
| `region` | `region` | `region` | 行政区划 |
| `sourceid` | `sourceid` | `sourceid` | 来源入口 |
| `statetaxregnum` | `statetaxregnum` | `statetaxregnum` | 国税登记号 |
| `sysid` | `sysid` | `sysid` | 系统标识 |
| `taxpayerid` | `taxpayerid` | `taxpayerid` | 纳税人识别号 |
| `telephone` | `telephone` | `telephone` | 联系电话 |
| `tenantid` | `tenantid` | `tenantid` | 租户标识 |
| `timezone` | `timezone` | `timezone` | 时区 |

### 引用字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `orgid` | `orgid` | `orgid` | orgid |
| `parentid` | `parentid` | `parentid` | 上级会计主体 |
| `currency` | `currency` | `currency` | 本位币 |
| `branchleader` | `branchleader` | `branchleader` | 分管领导 |
| `companytype` | `companytype` | `companytype` | 公司类型 |
| `principal` | `principal` | `principal` | 负责人 |
| `tenantid` | `tenantid` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 整数 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `enable` | `enable` | `enable` | 启用状态 |
| `displayorder` | `displayorder` | `displayorder` | 显示顺序 |
| `external_org` | `external_org` | `externalorg` | 外部组织 |
| `isEnd` | `isEnd` | `isEnd` | 是否末级 |
| `is_external_accounting` | `is_external_accounting` | `isexternalaccounting` | 对外核算 |
| `is_internal_accounting` | `is_internal_accounting` | `isinternalaccounting` | 对内核算 |
| `level` | `level` | `level` | 层级 |
| `orgtype` | `orgtype` | `orgtype` | 组织类型 |
| `sort_num` | `sort_num` | `sort` | 排序号 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 删除状态 |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `effectivedate` | `effectivedate` | `effectivedate` | 生效日期 |
| `expirationdate` | `expirationdate` | `expirationdate` | 失效日期 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `synchts` | `synchts` | `synchts` | 友企联同步时间戳 |

### multiLanguage (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 名称 |
| `shortname` | `shortname` | `shortname` | 简称 |
