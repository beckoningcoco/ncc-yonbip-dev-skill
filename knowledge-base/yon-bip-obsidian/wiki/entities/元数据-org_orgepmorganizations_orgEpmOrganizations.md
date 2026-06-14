---
tags: [BIP, 元数据, 数据字典, org.orgepmorganizations.orgEpmOrganizations]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 组织体系 (`org.orgepmorganizations.orgEpmOrganizations`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`org_epm_organizations` | domain：`ucf-org-center` | 应用：`GZTORG` | 业务对象ID：`0d8eaa0e-5033-41eb-81f0-29b51c978852`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 组织体系 |
| 物理表 | `org_epm_organizations` |
| domain/服务域 | `ucf-org-center` |
| schema | `iuap_apdoc_basedoc` |
| 所属应用 | `GZTORG` |
| 直连字段 | 55 个 |
| 子表 | 1 个 |
| 关联引用 | 15 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `defines` | `org.orgepmorganizations.orgEpmOrganizationsDefine` | composition |

## 关联引用 (15个)

| 字段名 | 引用类型 |
|--------|---------|
| `parent_id` | `ucf-org-center.epm_orgref` |
| `physical_org` | `ucf-org-center.epm_orgref` |
| `creator` | `` |
| `org_source_id` | `` |
| `ytenant_id` | `` |
| `characterid` | `` |
| `modifier` | `` |
| `org_form` | `org_deptTyperef` |
| `` | `` |
| `class_type` | `` |
| `org_epm_systems_id` | `` |
| `org_source` | `` |
| `currency` | `ucfbasedoc.bd_currencytenantref` |
| `tenantid` | `` |

## 继承接口 (5个, 11字段)

- **审计信息** (`bd.itf.IAuditInfo`)
  - `creationtime` → `creationtime`
  - `creator` → `creator`
  - `modifiedtime` → `modifiedtime`
  - `modifier` → `modifier`
- **逻辑删除(待废除)** (`basedoc.basedocItf.LogicDelete`)
- **树型结构** (`basedoc.basedocItf.ITree`)
  - `` → ``
  - `level` → `level`
  - `parent_id` → `parent_id`
  - `path` → `path`
  - `sort_num` → `sort_num`
- **UCF公共租户相关** (`basedoc.basedocItf.BasedocITenant`)
  - `tenantid` → `tenantid`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 55 个直连字段

### 文本字段 (30个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |
| `code` | `code` | `code` | 组织编码 |
| `shortcode` | `shortcode` | `shortcode` | 简码 |
| `shortname` | `shortname` | `shortname` | 简称 |
| `groupcode` | `groupcode` | `groupcode` | 组编码 |
| `sysid` | `sysid` | `sysid` | 应用标识 |
| `org_source` | `org_source` | `org_source` | 组织类型 |
| `class_type_name` | `class_type_name` | `class_type_name` | 组织形态 |
| `taxpayerid` | `taxpayerid` | `taxpayerid` | 纳税人识别号 |
| `buscode` | `buscode` | `buscode` | 业务编码 |
| `chiefaccountante` | `chiefaccountante` | `chiefaccountante` | 会计主管 |
| `control_scope` | `control_scope` | `control_scope` | 所属管控范围 |
| `currency_code` | `currency_code` | `currency_code` | 本位币编码 |
| `currency_name` | `currency_name` | `currency_name` | 本位币名称 |
| `full_code` | `full_code` | `full_code` | 编码全称(包含组织来源) |
| `innercode` | `innercode` | `innercode` | 内置码 |
| `name2` | `name2` | `name2` | 名称2 |
| `name3` | `name3` | `name3` | 名称3 |
| `name4` | `name4` | `name4` | 名称4 |
| `name5` | `name5` | `name5` | 名称5 |
| `name6` | `name6` | `name6` | 名称6 |
| `org_form_name` | `org_form_name` | `org_form_name` | 部门性质名称 |
| `org_source_id` | `org_source_id` | `org_source_id` | 来源编码(记录关联组织表id) |
| `orgmanager` | `orgmanager` | `orgmanager` | 企业负责人 |
| `parent_innercode` | `parent_innercode` | `parent_innercode` | 父级内置码 |
| `path` | `path` | `path` | 路径 |
| `regulations` | `regulations` | `regulations` | 法规 |
| `servicecode` | `servicecode` | `serviceCode` | 所属系统编码 |
| `tenantid` | `tenantid` | `tenantid` | 租户标识 |
| `treenodeid` | `treenodeid` | `treenodeid` | 审批树节点成员id |

### 引用字段 (13个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `org_epm_systems_id` | `org_epm_systems_id` | `org_epm_systems_id` | 组织体系id |
| `currency` | `currency` | `currency` | 本位币 |
| `parent_id` | `parent_id` | `parent` | 父节点 |
| `physical_org` | `physical_org` | `physical_org` | 对应实体组织 |
| `org_form` | `org_form` | `org_form` | 部门性质 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `class_type` | `class_type` | `class_type` | 组织形态 |
| `org_source` | `org_source` | `org_source_costCenter` | 成本中心 |
| `org_source_id` | `org_source_id` | `org_source_dept` | 部门 |
| `org_source_id` | `org_source_id` | `org_source_salesArea` | 销售区域 |
| `tenantid` | `tenantid` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `modifiedtime` | `modifiedtime` | `modifiedtime` | 修改时间 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `isEnd` | `isEnd` | 是否末级 |

### 整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `is_balance_unit` | `is_balance_unit` | `is_balance_unit` | 差额单位 |
| `level` | `level` | `level` | 层级 |
| `sort_num` | `sort_num` | `sort` | 排序号 |

### 短整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除标记 |
| `isShare` | `isShare` | `isShare` | 是否共享成员 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 组织名称 |

### timestamp (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `creationtime` | `creationtime` | `creationtime` | 创建时间 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `characterid` | `characterid` | `epmdefinefeature` | 预算报表组织自定义项特征 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `defines` | 组织体系自定义项 |
