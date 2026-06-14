---
tags: [BIP, 元数据, 数据字典, bd.adminOrg.AdminOrgViewOrg]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 行政组织视图参照 (`bd.adminOrg.AdminOrgViewOrg`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`org_admin` | domain：`ucf-org-center` | 应用：`GZTORG` | 业务对象ID：`32f32e76-80fe-4d57-b3f8-59595691b2b8`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 行政组织视图参照 |
| 物理表 | `org_admin` |
| domain/服务域 | `ucf-org-center` |
| schema | `iuap_apdoc_basedoc` |
| 所属应用 | `GZTORG` |
| 直连字段 | 66 个 |
| 子表 | 0 个 |
| 关联引用 | 13 个 |

## 关联引用 (13个)

| 字段名 | 引用类型 |
|--------|---------|
| `parentid` | `` |
| `corpid` | `` |
| `ytenant_id` | `` |
| `orgid` | `` |
| `principal` | `` |
| `branchleader` | `` |
| `locationid` | `` |
| `parentorgid` | `` |
| `companytype` | `` |
| `depttype` | `` |
| `id` | `` |
| `tenantid` | `` |

## 继承接口 (5个, 8字段)

- **逻辑删除(待废除)** (`basedoc.basedocItf.LogicDelete`)
- **UCF公共状态** (`basedoc.basedocItf.BasedocIState`)
  - `enable` → `enable`
- **UCF公共租户相关** (`basedoc.basedocItf.BasedocITenant`)
  - `tenantid` → `tenantid`
- **树型结构** (`basedoc.basedocItf.ITree`)
  - `` → ``
  - `level` → `level`
  - `parent_id` → `parent_id`
  - `path` → `path`
  - `sort_num` → `sort_num`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 66 个直连字段

### 文本字段 (33个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `address` | `address` | `address` | 公司注册地址 |
| `businessid` | `businessid` | `businessid` | 友企联同步业务主键 |
| `code` | `code` | `code` | 编码 |
| `contact` | `contact` | `contact` | 联系人 |
| `countryzone` | `countryzone` | `countryzone` | 国家地区 |
| `description2` | `description2` | `description2` | 备注(多语备用) |
| `description3` | `description3` | `description3` | 备注(多语备用) |
| `description4` | `description4` | `description4` | 备注(多语备用) |
| `description5` | `description5` | `description5` | 备注(多语备用) |
| `description6` | `description6` | `description6` | 备注(多语备用) |
| `id` | `id` | `id` | 主键 |
| `innercode` | `innercode` | `innercode` | 内部码 |
| `name2` | `name2` | `name2` | 名称(多语备用) |
| `name3` | `name3` | `name3` | 名称(多语备用) |
| `name4` | `name4` | `name4` | 名称(多语备用) |
| `name5` | `name5` | `name5` | 名称(多语备用) |
| `name6` | `name6` | `name6` | 名称(多语备用) |
| `objid` | `objid` | `objid` | 外部系统主键 |
| `orgform` | `orgform` | `orgform` | 组织类型 |
| `orglevel` | `orglevel` | `orglevel` | 组织级别 |
| `path` | `path` | `path` | 路径 |
| `region` | `region` | `region` | 行政区划 |
| `shortname2` | `shortname2` | `shortname2` | 简称(多语备用) |
| `shortname3` | `shortname3` | `shortname3` | 简称(多语备用) |
| `shortname4` | `shortname4` | `shortname4` | 简称(多语备用) |
| `shortname5` | `shortname5` | `shortname5` | 简称(多语备用) |
| `shortname6` | `shortname6` | `shortname6` | 简称(多语备用) |
| `sourceid` | `sourceid` | `sourceid` | 来源入口 |
| `sysid` | `sysid` | `sysid` | 系统标识 |
| `taxpayerid` | `taxpayerid` | `taxpayerid` | 纳税人识别号 |
| `telephone` | `telephone` | `telephone` | 联系电话 |
| `tenantid` | `tenantid` | `tenantid` | 租户标识 |
| `timezone` | `timezone` | `timezone` | 时区 |

### 引用字段 (13个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `AdminOrgVO` | 部门 |
| `branchleader` | `branchleader` | `branchleader` | 分管领导 |
| `companytype` | `companytype` | `companytype` | 组织形态 |
| `corpid` | `corpid` | `corpid` | 对应合同主体 |
| `depttype` | `depttype` | `depttype` | 部门性质 |
| `locationid` | `locationid` | `locationid` | 地点 |
| `orgid` | `orgid` | `orgid` | 基础组织ID |
| `parentid` | `parentid` | `parent` | 上级节点 |
| `parentid` | `parentid` | `parentid` | 上级节点ID |
| `parentorgid` | `parentorgid` | `parentorgid` | 上级组织ID |
| `principal` | `principal` | `principal` | 负责人 |
| `tenantid` | `tenantid` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 整数 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `displayorder` | `displayorder` | `displayorder` | 排序号 |
| `enable` | `enable` | `enable` | 状态 |
| `external_org` | `external_org` | `externalorg` | 外部组织 |
| `isEnd` | `isEnd` | `isEnd` | 是否末级 |
| `is_biz_unit` | `is_biz_unit` | `is_biz_unit` | 是否业务单元 |
| `is_biz_unit` | `is_biz_unit` | `isbizunit` | 是否业务单元 |
| `level` | `level` | `level` | 层级 |
| `orgtype` | `orgtype` | `orgtype` | 是否部门 |
| `displayorder` | `displayorder` | `sort` | 排序号 |

### 短整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dept_nature` | `dept_nature` | `deptnature` | 部门类型 |
| `dr` | `dr` | `dr` | 逻辑删除标识 |

### multiLanguage (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `description` | `description` | `description` | 备注 |
| `name` | `name` | `name` | 名称 |
| `shortname` | `shortname` | `shortname` | 简称 |

### timestamp (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `effectivedate` | `effectivedate` | `effectivedate` | 生效日期 |
| `end_time` | `end_time` | `endtime` | 结束时间 |
| `expirationdate` | `expirationdate` | `expirationdate` | 失效日期 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `start_time` | `start_time` | `starttime` | 开始时间 |
| `synchts` | `synchts` | `synchts` | 友企联同步时间戳 |
