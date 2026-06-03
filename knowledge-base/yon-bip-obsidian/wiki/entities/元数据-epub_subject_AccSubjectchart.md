---
tags: [BIP, 元数据, 数据字典, epub.subject.AccSubjectchart]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 科目表 (`epub.subject.AccSubjectchart`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`epub_accsubjectchart` | domain：`fiepub` | 应用：`FP` | 业务对象ID：`cfb0ddf3-b2f6-4060-9f37-9f91c7db64bc`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 科目表 |
| 物理表 | `epub_accsubjectchart` |
| 数据库 schema | `fiepub` |
| 所属应用 | `FP` |
| 直连字段 | 54 个 |
| 关联引用 | 11 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `accsubjectChartReservationRules` | `epub.subject.AccsubjectChartReservationRules` | composition |

## 关联引用 (11个)

| 字段名 | 引用类型 |
|--------|---------|
| `parentchart` | `fiepub.epub_accsubjectchartref` |
| `ytenant_id` | `` |
| `chart_use` | `` |
| `refchart` | `fiepub.epub_accsubjectchartref` |
| `copychart` | `` |
| `creatorId` | `` |
| `modifierId` | `` |
| `accelement` | `fiepub.epub_accelement_ref` |
| `` | `` |
| `accentity` | `finbd.bd_allaccbodyref` |
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

> 共 54 个直连字段

### 文本字段 (25个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `id` | `id` | String | ID |
| `code` | `code` | String | 编码 |
| `controlrange` | `controlrange` | String | 派生范围 |
| `addstyle` | `addstyle` | String | 来源方式 |
| `social_srcid` | `social_srcid` | String | 社会化来源id |
| `social_tenantid` | `social_tenantid` | String | 社会化来源租户 |
| `extcontrolrule` | `extcontrolrule` | String | 辅助核算项控制规则 |
| `versionStatus` | `versionStatus` | String | 状态 |
| `sourceId` | `sourceId` | String | 科目表多版本来源id |
| `accsubjectchart_vid` | `accsubjectchart_vid` | String | 科目表主键 |
| `accsubjectchart_oid` | `accsubjectchart_oid` | String | 科目表初始版本id |
| `effective_date` | `effective_date` | String | 生效日期 |
| `expiration_date` | `expiration_date` | String | 失效日期 |
| `creator` | `creator` | String | 创建人名称 |
| `def1` | `def1` | String | 社会化征用 |
| `def2` | `def2` | String | 社会化核心已下发标识 |
| `modifier` | `modifier` | String | 修改人名称 |
| `objid` | `objid` | String | 友企连id |
| `subject_name_separator` | `subject_name_separator` | String | 科目名称分隔符 |
| `supplementaryaccounting` | `supplementaryaccounting` | String | 辅助核算 |
| `sysid` | `sysid` | String | 来源主键 |
| `subjectcoderule` | `subjectcoderule` | String | 科目编码规则 |
| `showstyle` | `showstyle` | String | 显示格式 |
| `description` | `description` | String | 描述 |
| `srccoreid` | `srccoreid` | String | 核心租户的数据id |

### 引用字段 (10个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `parentchart` | `parentchart` | 85ed5168-72ae-41c2-a5a5-51f3fc7b1bc0 | 父科目表id |
| `copychart` | `copychart` | 85ed5168-72ae-41c2-a5a5-51f3fc7b1bc0 | 复制科目表 |
| `creatorId` | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | 创建人 |
| `modifierId` | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | 修改人 |
| `accentity` | `accentity` | dabb8185-bfd2-4ed3-a721-f5bc5d948246 | 会计主体id |
| `refchart` | `refchart` | 85ed5168-72ae-41c2-a5a5-51f3fc7b1bc0 | 引用科目表id |
| `accelement` | `accelement` | 92f73981-1599-41c6-af3a-b107a0d99a80 | 会计要素表id |
| `chart_use` | `chart_use` | 67c3fe3d-8de9-4ac6-a0b0-9faf64b8bff6 | 用途 |
| `tenant_id` | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | 租户 |
| `ytenant_id` | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `create_date` | `create_date` | Date | 创建日期 |
| `modify_date` | `modify_date` | Date | 修改日期 |

### 布尔字段 (5个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `bsystem` | `bsystem` | Boolean | 是否预制 |
| `addfirstlevel` | `addfirstlevel` | Boolean | 禁止增加一级 |
| `bsharesub` | `bsharesub` | Boolean | 共享下级 |
| `bstrongctrl` | `bstrongctrl` | Boolean | 强管控 |
| `stopstatus` | `stopstatus` | Boolean | 停用状态 |

### 整数 (5个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `social_mctype` | `social_mctype` | Integer | 社会化管控类型 |
| `controlledlevel` | `controlledlevel` | Integer | 科目管控层级 |
| `subject_code_control_rule` | `subject_code_control_rule` | Integer | 科目编码控制规则 |
| `subject_code_length` | `subject_code_length` | Integer | 科目编码长度 |
| `subject_code_separator` | `subject_code_separator` | Integer | 科目编码分隔符 |

### multiLanguage (2个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `name` | `name` | String | 名称 |
| `versionName` | `versionName` | String | 版本名称 |

### timestamp (4个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `create_time` | `create_time` | DateTime | 创建时间 |
| `modify_time` | `modify_time` | DateTime | 修改时间 |
| `pubts` | `pubts` | DateTime | 时间戳 |
| `stop_time` | `stop_time` | DateTime | 停用时间 |

### other (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `` | `` | 80cd3a8c-0b9e-43bb-9fb9-15d725bb3dea | 预留规则 |
