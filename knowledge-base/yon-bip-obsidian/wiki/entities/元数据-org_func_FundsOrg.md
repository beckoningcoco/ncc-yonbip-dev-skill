---
tags: [BIP, 元数据, 数据字典, org.func.FundsOrg]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 资金组织 (`org.func.FundsOrg`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`org_funds` | domain：`ucf-org-center` | 应用：`GZTORG` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 资金组织 |
| 物理表 | `org_funds` |
| 数据库 schema | `ucf-org-center` |
| 所属应用 | `GZTORG` |
| 直连字段 | 77 个 |
| 子表 | 0 个 |
| 关联引用 | 13 个 |

## 关联引用 (13个)

| 字段名 | 引用类型 |
|--------|---------|
| `parentid` | `ucf-org-center.bd_fundsorg_na` |
| `ytenant_id` | `` |
| `exchangerate` | `ucfbasedoc.bd_enclouddef_exchangerateref` |
| `language` | `ucfbasedoc.bd_languageref` |
| `orgid` | `` |
| `principal` | `ucf-staff-center.bd_staff_ref` |
| `branchleader` | `ucf-staff-center.bd_staff_ref` |
| `companytype` | `ucf-org-center.org_companyTyperef` |
| `finorgid` | `ucf-org-center.bd_financeorgtreeref_na` |
| `id` | `ucf-org-center.org_pure_tree_ref_na` |
| `depttype` | `` |
| `tenantid` | `` |

## 继承接口 (8个, 20字段)

- **审计信息** (`bd.itf.IAuditInfo`)
  - `creationtime` → `creationtime`
  - `creator` → `creator`
  - `modifiedtime` → `modifiedtime`
  - `modifier` → `modifier`
- **树型结构** (`basedoc.basedocItf.ITree`)
  - `` → ``
  - `level` → `level`
  - `parent_id` → `parent_id`
  - `path` → `path`
  - `sort_num` → `sort_num`
- **审批信息** (`bd.itf.ISystemInfo`)
  - `dr` → `dr`
  - `enable` → `enable`
  - `sysid` → `sysid`
  - `tenantid` → `tenantid`
  - `ts` → `ts`
- **逻辑删除(待废除)** (`basedoc.basedocItf.LogicDelete`)
- **UCF公共租户相关** (`basedoc.basedocItf.BasedocITenant`)
  - `tenantid` → `tenantid`
- **UCF公共状态** (`basedoc.basedocItf.BasedocIState`)
  - `enable` → `enable`
- **组织接口** (`org.base.IOrg`)
  - `code` → `code`
  - `id` → `id`
  - `name` → `name`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 77 个直连字段

### 文本字段 (43个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | 编码 |
| `name2` | `name2` | `name2` | 名称(多语备用) |
| `name3` | `name3` | `name3` | 名称(多语备用) |
| `name4` | `name4` | `name4` | 名称(多语备用) |
| `name5` | `name5` | `name5` | 名称(多语备用) |
| `name6` | `name6` | `name6` | 名称(多语备用) |
| `shortname2` | `shortname2` | `shortname2` | 简称(多语备用) |
| `shortname3` | `shortname3` | `shortname3` | 简称(多语备用) |
| `shortname4` | `shortname4` | `shortname4` | 简称(多语备用) |
| `shortname5` | `shortname5` | `shortname5` | 简称(多语备用) |
| `shortname6` | `shortname6` | `shortname6` | 简称(多语备用) |
| `innercode` | `innercode` | `innercode` | 内部码 |
| `locationid` | `locationid` | `locationid` | 工作地点 |
| `taxpayerid` | `taxpayerid` | `taxpayerid` | 统一社会信用代码 |
| `taxpayername` | `taxpayername` | `taxpayername` | 纳税人名称 |
| `usedtaxpayerid` | `usedtaxpayerid` | `usedtaxpayerid` | 曾用统一社会信用代码 |
| `usedtaxpayername` | `usedtaxpayername` | `usedtaxpayername` | 曾用纳税人名称 |
| `address2` | `address2` | `address2` | 公司地址(多语备用) |
| `address3` | `address3` | `address3` | 公司地址(多语备用) |
| `address4` | `address4` | `address4` | 公司地址(多语备用) |
| `address5` | `address5` | `address5` | 公司地址(多语备用) |
| `address6` | `address6` | `address6` | 公司地址(多语备用) |
| `contact` | `contact` | `contact` | 联系人 |
| `telephone` | `telephone` | `telephone` | 联系电话 |
| `timezone` | `timezone` | `timezone` | 时区 |
| `description2` | `description2` | `description2` | 备注(多语备用) |
| `description3` | `description3` | `description3` | 备注(多语备用) |
| `description4` | `description4` | `description4` | 备注(多语备用) |
| `description5` | `description5` | `description5` | 备注(多语备用) |
| `description6` | `description6` | `description6` | 备注(多语备用) |
| `objid` | `objid` | `objid` | 外部系统主键 |
| `countryzone` | `countryzone` | `countryzone` | 国家地区 |
| `corpid` | `corpid` | `corpid` | 对应合同主体 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `sourceid` | `sourceid` | `sourceid` | 数据来源 |
| `tenantid` | `tenantid` | `tenantid` | 租户ID |
| `sysid` | `sysid` | `sysid` | 系统标识 |
| `orglevel` | `orglevel` | `orglevel` | 组织级别(废弃） |
| `path` | `path` | `path` | 上级路径(不建议使用) |
| `businessid` | `businessid` | `businessid` | 友企联同步业务主键(废弃) |
| `log` | `log` | `log` | 删除引用日志(废弃) |
| `jsonextattr` | `jsonextattr` | `jsonextattr` | 扩展属性(废弃) |

### 引用字段 (13个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |
| `companytype` | `companytype` | `companytype` | 组织形态 |
| `parentid` | `parentid` | `parent` | 上级资金组织 |
| `parentid` | `parentid` | `parentid` | 上级资金组织 |
| `depttype` | `depttype` | `depttype` | 部门性质 |
| `principal` | `principal` | `principal` | 负责人 |
| `branchleader` | `branchleader` | `branchleader` | 分管领导 |
| `exchangerate` | `exchangerate` | `exchangerate` | 汇率类型 |
| `language` | `language` | `language` | 语言 |
| `finorgid` | `finorgid` | `finorgid` | 关联会计主体 |
| `tenantid` | `tenantid` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户ID |
| `orgid` | `orgid` | `orgid` | 业务单元主键(废弃） |

### 整数 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `orgtype` | `orgtype` | `orgtype` | 是否部门 |
| `is_control_unit` | `is_control_unit` | `iscontrolunit` | 管控单元 |
| `taxpayertype` | `taxpayertype` | `taxpayertype` | 纳税人类型 |
| `level` | `level` | `level` | 组织层级 |
| `displayorder` | `displayorder` | `displayorder` | 排序号 |
| `displayorder` | `displayorder` | `sort` | 排序号 |
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
