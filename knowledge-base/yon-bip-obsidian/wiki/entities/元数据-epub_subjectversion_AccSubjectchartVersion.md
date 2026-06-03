---
tags: [BIP, 元数据, 数据字典, epub.subjectversion.AccSubjectchartVersion]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 科目表多版本 (`epub.subjectversion.AccSubjectchartVersion`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`epub_accsubjectchart_version` | domain：`fiepub` | 应用：`FP` | 业务对象ID：`f6fa2e78-6df5-4b14-81cf-8f70b28c1bc4`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 科目表多版本 |
| 物理表 | `epub_accsubjectchart_version` |
| 数据库 schema | `fiepub` |
| 所属应用 | `FP` |
| 直连字段 | 55 个 |
| 子表 | 1 个 |
| 关联引用 | 12 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `accsubjectChartReservationRules` | `epub.subjectversion.AccsubjectChartReservationRulesVersion` | composition |

## 关联引用 (12个)

| 字段名 | 引用类型 |
|--------|---------|
| `parentchart` | `` |
| `character` | `` |
| `ytenant_id` | `` |
| `chart_use` | `` |
| `refchart` | `` |
| `copychart` | `` |
| `creatorId` | `` |
| `modifierId` | `` |
| `accelement` | `` |
| `` | `` |
| `accentity` | `` |
| `tenant_id` | `` |

## 继承接口 (4个, 12字段)

- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **停用信息** (`base.itf.IStopping`)
  - `stopstatus` → `stopstatus`
  - `stop_time` → `stop_time`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 55 个直连字段

### 文本字段 (25个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accsubjectchart_oid` | `accsubjectchart_oid` | `accsubjectchartOid` | 科目表初始版本id |
| `accsubjectchart_vid` | `accsubjectchart_vid` | `accsubjectchartVid` | 科目表主键 |
| `addstyle` | `addstyle` | `addstyle` | 来源方式 |
| `code` | `code` | `code` | 编码 |
| `controlrange` | `controlrange` | `controlrange` | 派生范围 |
| `creator` | `creator` | `creator` | 创建人名称 |
| `def1` | `def1` | `def1` | 社会化征用 |
| `def2` | `def2` | `def2` | 社会化核心已下发标识 |
| `description` | `description` | `description` | 描述 |
| `effective_date` | `effective_date` | `effectiveDate` | 生效日期 |
| `expiration_date` | `expiration_date` | `expirationDate` | 失效日期 |
| `extcontrolrule` | `extcontrolrule` | `extcontrolrule` | 辅助核算项控制规则 |
| `id` | `id` | `id` | 主键 |
| `modifier` | `modifier` | `modifier` | 修改人名称 |
| `objid` | `objid` | `objid` | 友企连id |
| `showstyle` | `showstyle` | `showstyle` | 科目名称显示格式 |
| `social_srcid` | `social_srcid` | `socialSrcid` | 社会化来源id |
| `social_tenantid` | `social_tenantid` | `socialTenantid` | 社会化来源租户 |
| `sourceId` | `sourceId` | `sourceId` | 科目表多版本来源id |
| `srccoreid` | `srccoreid` | `srccoreid` | 核心租户的数据id |
| `subject_name_separator` | `subject_name_separator` | `subjectNameSeparator` | 科目名称分隔符 |
| `subjectcoderule` | `subjectcoderule` | `subjectcoderule` | 科目编码规则 |
| `supplementaryaccounting` | `supplementaryaccounting` | `supplementaryaccounting` | 辅助核算 |
| `sysid` | `sysid` | `sysid` | 来源主键 |
| `versionStatus` | `versionStatus` | `versionStatus` | 版本状态 |

### 引用字段 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accelement` | `accelement` | `accelement` | 会计要素表 |
| `accentity` | `accentity` | `accentity` | 会计主体 |
| `chart_use` | `chart_use` | `chartUse` | 用途 |
| `copychart` | `copychart` | `copychart` | 复制科目表 |
| `creatorId` | `creatorId` | `creatorId` | 创建人 |
| `modifierId` | `modifierId` | `modifierId` | 修改人 |
| `parentchart` | `parentchart` | `parentchart` | 父科目表 |
| `refchart` | `refchart` | `refchart` | 引用科目表 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 布尔字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `addfirstlevel` | `addfirstlevel` | `addfirstlevel` | 禁止增加一级 |
| `bsharesub` | `bsharesub` | `bsharesub` | 共享下级 |
| `bstrongctrl` | `bstrongctrl` | `bstrongctrl` | 是否强管控 |
| `bsystem` | `bsystem` | `bsystem` | 是否预制 |
| `stopstatus` | `stopstatus` | `stopstatus` | 停用状态 |

### 整数 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `controlledlevel` | `controlledlevel` | `controlledlevel` | 科目管控层级 |
| `social_mctype` | `social_mctype` | `socialMctype` | 社会化管控类型 |
| `subject_code_control_rule` | `subject_code_control_rule` | `subjectCodeControlRule` | 科目编码控制规则 |
| `subject_code_length` | `subject_code_length` | `subjectCodeLength` | 科目编码长度 |
| `subject_code_separator` | `subject_code_separator` | `subjectCodeSeparator` | 科目编码分隔符 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `accsubjectChartReservationRules` | 预留规则多版本 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `character` | `character` | `character` | 科目表多版本特征属性 |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `stop_time` | `stop_time` | `stoptime` | 停用时间 |

### multiLanguage (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 名称 |
| `versionName` | `versionName` | `versionName` | 版本名称 |
