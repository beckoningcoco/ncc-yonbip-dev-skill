---
tags: [BIP, 元数据, 数据字典, bd.adminOrg.DeptOrgVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 部门(内部专用) (`bd.adminOrg.DeptOrgVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`org_admin` | domain：`ucf-org-center` | 应用：`GZTORG` | 业务对象ID：`fcdcbda3-cafd-4d2f-813a-6a13195ffe63`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 部门(内部专用) |
| 物理表 | `org_admin` |
| 数据库 schema | `ucf-org-center` |
| 所属应用 | `GZTORG` |
| 直连字段 | 83 个 |
| 子表 | 2 个 |
| 关联引用 | 18 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `deptOrgExt` | `bd.adminOrg.DeptOrgExtB` | composition |
| `deptdefines` | `bd.adminOrg.DeptOrgDefineB` | composition |

## 关联引用 (18个)

| 字段名 | 引用类型 |
|--------|---------|
| `parentid` | `ucf-org-center.bd_admindepttreeref` |
| `creator` | `` |
| `corpid` | `` |
| `ytenant_id` | `` |
| `modifier` | `` |
| `` | `` |
| `orgid` | `` |
| `principal` | `ucf-staff-center.bd_staff_ref` |
| `branchleader` | `ucf-staff-center.bd_staff_ref` |
| `locationid` | `` |
| `parentorgid` | `ucf-org-center.orgcenter_admin_tree_ref` |
| `companytype` | `` |
| `depttype` | `ucf-org-center.org_deptTyperef` |
| `id` | `` |
| `tenantid` | `` |
| `deptcharacterid` | `` |

## 继承接口 (7个, 15字段)

- **UCF公共租户相关** (`basedoc.basedocItf.BasedocITenant`)
  - `tenantid` → `tenantid`
- **树型结构** (`basedoc.basedocItf.ITree`)
  - `` → ``
  - `level` → `level`
  - `parent_id` → `parent_id`
  - `path` → `path`
  - `sort_num` → `sort_num`
- **UCF公共状态** (`basedoc.basedocItf.BasedocIState`)
  - `enable` → `enable`
- **逻辑删除(待废除)** (`basedoc.basedocItf.LogicDelete`)
- **审计信息** (`basedoc.basedocItf.AuditInfo`)
  - `creationtime` → `creationtime`
  - `creator` → `creator`
  - `modifiedtime` → `modifiedtime`
  - `modifier` → `modifier`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **部门接口** (`org.base.IDept`)
  - `code` → `code`
  - `id` → `id`
  - `name` → `name`

## 字段列表（按类型分组）

> 共 83 个直连字段

### 文本字段 (34个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |
| `code` | `code` | `code` | 编码 |
| `innercode` | `innercode` | `innercode` | 内部码 |
| `taxpayerid` | `taxpayerid` | `taxpayerid` | 统一社会信用代码 |
| `contact` | `contact` | `contact` | 联系人 |
| `telephone` | `telephone` | `telephone` | 联系电话 |
| `timezone` | `timezone` | `timezone` | 时区 |
| `objid` | `objid` | `objid` | 外部系统主键 |
| `countryzone` | `countryzone` | `countryzone` | 国家地区 |
| `log` | `log` | `orgfunctype` | 职能类型 |
| `sourceid` | `sourceid` | `sourceid` | 数据来源 |
| `tenantid` | `tenantid` | `tenantid` | 租户ID |
| `sysid` | `sysid` | `sysid` | 系统标识 |
| `region` | `region` | `region` | 行政区划(废弃) |
| `orgform` | `orgform` | `orgform` | 组织形态(废弃) |
| `orglevel` | `orglevel` | `orglevel` | 组织级别(废弃） |
| `path` | `path` | `path` | 上级路径(不建议使用) |
| `businessid` | `businessid` | `businessid` | 友企联同步业务主键(废弃) |
| `log` | `log` | `log` | 删除引用日志(废弃) |
| `shortname2` | `shortname2` | `shortname2` | 简称(备用) |
| `shortname4` | `shortname4` | `shortname4` | 简称(备用) |
| `shortname3` | `shortname3` | `shortname3` | 简称(备用) |
| `shortname6` | `shortname6` | `shortname6` | 简称(备用) |
| `shortname5` | `shortname5` | `shortname5` | 简称(备用) |
| `name2` | `name2` | `name2` | 名称(备用) |
| `name3` | `name3` | `name3` | 名称(备用) |
| `name4` | `name4` | `name4` | 名称(备用) |
| `name5` | `name5` | `name5` | 名称(备用) |
| `name6` | `name6` | `name6` | 名称(备用) |
| `description2` | `description2` | `description2` | 备注(多语备用) |
| `description3` | `description3` | `description3` | 备注(多语备用) |
| `description4` | `description4` | `description4` | 备注(多语备用) |
| `description5` | `description5` | `description5` | 备注(多语备用) |
| `description6` | `description6` | `description6` | 备注(多语备用) |

### 引用字段 (15个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `companytype` | `companytype` | `companytype` | 组织形态 |
| `parentid` | `parentid` | `parent` | 所属上级 |
| `parentid` | `parentid` | `parentid` | 所属上级 |
| `parentorgid` | `parentorgid` | `parentorgid` | 所属行政组织 |
| `depttype` | `depttype` | `depttype` | 部门性质 |
| `principal` | `principal` | `principal` | 负责人 |
| `branchleader` | `branchleader` | `branchleader` | 分管领导 |
| `locationid` | `locationid` | `locationid` | 工作地点 |
| `corpid` | `corpid` | `corpid` | 对应合同主体 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `tenantid` | `tenantid` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户ID |
| `orgid` | `orgid` | `orgid` | 业务单元主键(废弃） |
| `id` | `id` | `AdminOrgVO` | 部门 |

### 日期字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `frozen_time` | `frozen_time` | `frozentime` | 冻结日期 |

### 整数 (16个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `is_biz_unit` | `is_biz_unit` | `is_biz_unit` | 是否业务单元 |
| `is_biz_unit` | `is_biz_unit` | `isbizunit` | 是否业务单元 |
| `orgtype` | `orgtype` | `orgtype` | 是否部门 |
| `level` | `level` | `level` | 组织层级 |
| `displayorder` | `displayorder` | `displayorder` | 排序号 |
| `displayorder` | `displayorder` | `sort` | 排序号 |
| `global_order` | `global_order` | `globalorder` | 全局排序号 |
| `isdefault` | `isdefault` | `isdefault` | 是否默认 |
| `isEnd` | `isEnd` | `isEnd` | 是否末级节点 |
| `frozen` | `frozen` | `frozen` | 冻结状态 |
| `enable` | `enable` | `enable` | 状态 |
| `closed` | `closed` | `closed` | 财务关闭状态 |
| `external_org` | `external_org` | `externalorg` | 外部组织 |
| `can_employee` | `can_employee` | `canEmployee` | 可用于任职 |
| `employer_org` | `employer_org` | `employerOrg` | 是否雇主 |
| `is_control_unit` | `is_control_unit` | `iscontrolunit` | 管控单元 |

### 短整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除标识 |
| `dept_nature` | `dept_nature` | `deptnature` | 部门类型 |

### multiLanguage (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 名称 |
| `shortname` | `shortname` | `shortname` | 简称 |
| `address` | `address` | `address` | 公司地址 |
| `description` | `description` | `description` | 备注 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `deptcharacterid` | `deptcharacterid` | `deptdefinefeature` | 特征 |

### timestamp (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `start_time` | `start_time` | `starttime` | 生效日期 |
| `effectivedate` | `effectivedate` | `effectivedate` | 生效日期 |
| `end_time` | `end_time` | `endtime` | 失效日期 |
| `expirationdate` | `expirationdate` | `expirationdate` | 失效日期 |
| `creationtime` | `creationtime` | `creationtime` | 创建时间 |
| `modifiedtime` | `modifiedtime` | `modifiedtime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `synchts` | `synchts` | `synchts` | 友企联同步时间戳 |

### other (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `deptdefines` | 部门自定义项B |
| `` | `` | `deptOrgExt` | 部门扩展信息B |
